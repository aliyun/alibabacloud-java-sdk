// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailianvoicebot20250101.models;

import com.aliyun.tea.*;

public class CreateCloneVoiceRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>llm-xdne77rxe14ziszr</p>
     */
    @NameInMap("BusinessUnitId")
    public String businessUnitId;

    @NameInMap("FileKey")
    public String fileKey;

    /**
     * <strong>example:</strong>
     * <p>CosyVoice</p>
     */
    @NameInMap("Model")
    public String model;

    public static CreateCloneVoiceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCloneVoiceRequest self = new CreateCloneVoiceRequest();
        return TeaModel.build(map, self);
    }

    public CreateCloneVoiceRequest setBusinessUnitId(String businessUnitId) {
        this.businessUnitId = businessUnitId;
        return this;
    }
    public String getBusinessUnitId() {
        return this.businessUnitId;
    }

    public CreateCloneVoiceRequest setFileKey(String fileKey) {
        this.fileKey = fileKey;
        return this;
    }
    public String getFileKey() {
        return this.fileKey;
    }

    public CreateCloneVoiceRequest setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

}
