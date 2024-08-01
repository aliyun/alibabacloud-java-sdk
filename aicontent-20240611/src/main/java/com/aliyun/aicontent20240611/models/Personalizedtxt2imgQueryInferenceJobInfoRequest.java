// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class Personalizedtxt2imgQueryInferenceJobInfoRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>180</p>
     */
    @NameInMap("inferenceJobId")
    public String inferenceJobId;

    public static Personalizedtxt2imgQueryInferenceJobInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        Personalizedtxt2imgQueryInferenceJobInfoRequest self = new Personalizedtxt2imgQueryInferenceJobInfoRequest();
        return TeaModel.build(map, self);
    }

    public Personalizedtxt2imgQueryInferenceJobInfoRequest setInferenceJobId(String inferenceJobId) {
        this.inferenceJobId = inferenceJobId;
        return this;
    }
    public String getInferenceJobId() {
        return this.inferenceJobId;
    }

}
