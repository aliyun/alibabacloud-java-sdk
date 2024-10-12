// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class PersonalizedTextToImageQueryPreModelInferenceJobInfoRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>girl-xxxx-xxxx-xxxx-xxxx</p>
     */
    @NameInMap("inferenceJobId")
    public String inferenceJobId;

    public static PersonalizedTextToImageQueryPreModelInferenceJobInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        PersonalizedTextToImageQueryPreModelInferenceJobInfoRequest self = new PersonalizedTextToImageQueryPreModelInferenceJobInfoRequest();
        return TeaModel.build(map, self);
    }

    public PersonalizedTextToImageQueryPreModelInferenceJobInfoRequest setInferenceJobId(String inferenceJobId) {
        this.inferenceJobId = inferenceJobId;
        return this;
    }
    public String getInferenceJobId() {
        return this.inferenceJobId;
    }

}
