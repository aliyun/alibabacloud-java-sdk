// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimath20241114.models;

import com.aliyun.tea.*;

public class GenStepRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Ex_pop_1731848070815_funI</p>
     */
    @NameInMap("ExerciseCode")
    public String exerciseCode;

    public static GenStepRequest build(java.util.Map<String, ?> map) throws Exception {
        GenStepRequest self = new GenStepRequest();
        return TeaModel.build(map, self);
    }

    public GenStepRequest setExerciseCode(String exerciseCode) {
        this.exerciseCode = exerciseCode;
        return this;
    }
    public String getExerciseCode() {
        return this.exerciseCode;
    }

}
