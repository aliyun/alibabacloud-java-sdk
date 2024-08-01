// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class Personalizedtxt2imgQueryModelTrainStatusRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>modelId-xxxx-xxxx-xxxx</p>
     */
    @NameInMap("modelId")
    public String modelId;

    public static Personalizedtxt2imgQueryModelTrainStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        Personalizedtxt2imgQueryModelTrainStatusRequest self = new Personalizedtxt2imgQueryModelTrainStatusRequest();
        return TeaModel.build(map, self);
    }

    public Personalizedtxt2imgQueryModelTrainStatusRequest setModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }
    public String getModelId() {
        return this.modelId;
    }

}
