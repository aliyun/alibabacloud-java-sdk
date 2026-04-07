// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailianvoicebot20250101.models;

import com.aliyun.tea.*;

public class UpdateCloneVoiceRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>llm-3pptowd2olrctsvc</p>
     */
    @NameInMap("BusinessUnitId")
    public String businessUnitId;

    /**
     * <strong>example:</strong>
     * <p>8ee1160a-6999-478f-8df6-f33ef21f27d5</p>
     */
    @NameInMap("CloneVoiceId")
    public String cloneVoiceId;

    @NameInMap("Name")
    public String name;

    public static UpdateCloneVoiceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCloneVoiceRequest self = new UpdateCloneVoiceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCloneVoiceRequest setBusinessUnitId(String businessUnitId) {
        this.businessUnitId = businessUnitId;
        return this;
    }
    public String getBusinessUnitId() {
        return this.businessUnitId;
    }

    public UpdateCloneVoiceRequest setCloneVoiceId(String cloneVoiceId) {
        this.cloneVoiceId = cloneVoiceId;
        return this;
    }
    public String getCloneVoiceId() {
        return this.cloneVoiceId;
    }

    public UpdateCloneVoiceRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
