// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailianvoicebot20250101.models;

import com.aliyun.tea.*;

public class DeleteCloneVoiceRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>llm-zzu528i29ecnprcl</p>
     */
    @NameInMap("BusinessUnitId")
    public String businessUnitId;

    /**
     * <strong>example:</strong>
     * <p>8ee1160a-6999-478f-8df6-f33ef21f27d5</p>
     */
    @NameInMap("CloneVoiceId")
    public String cloneVoiceId;

    public static DeleteCloneVoiceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteCloneVoiceRequest self = new DeleteCloneVoiceRequest();
        return TeaModel.build(map, self);
    }

    public DeleteCloneVoiceRequest setBusinessUnitId(String businessUnitId) {
        this.businessUnitId = businessUnitId;
        return this;
    }
    public String getBusinessUnitId() {
        return this.businessUnitId;
    }

    public DeleteCloneVoiceRequest setCloneVoiceId(String cloneVoiceId) {
        this.cloneVoiceId = cloneVoiceId;
        return this;
    }
    public String getCloneVoiceId() {
        return this.cloneVoiceId;
    }

}
