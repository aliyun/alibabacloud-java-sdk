// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailianvoicebot20250101.models;

import com.aliyun.tea.*;

public class CreateVoiceAccessProfileShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>llm-xdne77rxe14ziszr</p>
     */
    @NameInMap("BusinessUnitId")
    public String businessUnitId;

    /**
     * <strong>example:</strong>
     * <p>VOLC</p>
     */
    @NameInMap("NlsEngine")
    public String nlsEngine;

    @NameInMap("Profile")
    public String profileShrink;

    public static CreateVoiceAccessProfileShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateVoiceAccessProfileShrinkRequest self = new CreateVoiceAccessProfileShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateVoiceAccessProfileShrinkRequest setBusinessUnitId(String businessUnitId) {
        this.businessUnitId = businessUnitId;
        return this;
    }
    public String getBusinessUnitId() {
        return this.businessUnitId;
    }

    public CreateVoiceAccessProfileShrinkRequest setNlsEngine(String nlsEngine) {
        this.nlsEngine = nlsEngine;
        return this;
    }
    public String getNlsEngine() {
        return this.nlsEngine;
    }

    public CreateVoiceAccessProfileShrinkRequest setProfileShrink(String profileShrink) {
        this.profileShrink = profileShrink;
        return this;
    }
    public String getProfileShrink() {
        return this.profileShrink;
    }

}
