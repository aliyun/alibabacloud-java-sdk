// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailianvoicebot20250101.models;

import com.aliyun.tea.*;

public class DeleteVoiceAccessProfileRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>af81a389-91f0-4157-8d82-720edd02b66b</p>
     */
    @NameInMap("AccessProfileId")
    public String accessProfileId;

    /**
     * <strong>example:</strong>
     * <p>llm-c11iig67g863rih8</p>
     */
    @NameInMap("BusinessUnitId")
    public String businessUnitId;

    public static DeleteVoiceAccessProfileRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteVoiceAccessProfileRequest self = new DeleteVoiceAccessProfileRequest();
        return TeaModel.build(map, self);
    }

    public DeleteVoiceAccessProfileRequest setAccessProfileId(String accessProfileId) {
        this.accessProfileId = accessProfileId;
        return this;
    }
    public String getAccessProfileId() {
        return this.accessProfileId;
    }

    public DeleteVoiceAccessProfileRequest setBusinessUnitId(String businessUnitId) {
        this.businessUnitId = businessUnitId;
        return this;
    }
    public String getBusinessUnitId() {
        return this.businessUnitId;
    }

}
