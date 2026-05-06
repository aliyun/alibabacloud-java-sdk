// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailianvoicebot20250101.models;

import com.aliyun.tea.*;

public class UpdateVoiceAccessProfileShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>af81a389-91f0-4157-8d82-720edd02b66b</p>
     */
    @NameInMap("AccessProfileId")
    public String accessProfileId;

    /**
     * <strong>example:</strong>
     * <p>llm-xdne77rxe14ziszr</p>
     */
    @NameInMap("BusinessUnitId")
    public String businessUnitId;

    /**
     * <strong>example:</strong>
     * <p>BAILIAN</p>
     */
    @NameInMap("NlsEngine")
    public String nlsEngine;

    @NameInMap("Profile")
    public String profileShrink;

    public static UpdateVoiceAccessProfileShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateVoiceAccessProfileShrinkRequest self = new UpdateVoiceAccessProfileShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateVoiceAccessProfileShrinkRequest setAccessProfileId(String accessProfileId) {
        this.accessProfileId = accessProfileId;
        return this;
    }
    public String getAccessProfileId() {
        return this.accessProfileId;
    }

    public UpdateVoiceAccessProfileShrinkRequest setBusinessUnitId(String businessUnitId) {
        this.businessUnitId = businessUnitId;
        return this;
    }
    public String getBusinessUnitId() {
        return this.businessUnitId;
    }

    public UpdateVoiceAccessProfileShrinkRequest setNlsEngine(String nlsEngine) {
        this.nlsEngine = nlsEngine;
        return this;
    }
    public String getNlsEngine() {
        return this.nlsEngine;
    }

    public UpdateVoiceAccessProfileShrinkRequest setProfileShrink(String profileShrink) {
        this.profileShrink = profileShrink;
        return this;
    }
    public String getProfileShrink() {
        return this.profileShrink;
    }

}
