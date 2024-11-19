// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimath20241114.models;

import com.aliyun.tea.*;

public class GlobalConfirmRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Ex_pop_1731848070815_funI</p>
     */
    @NameInMap("ExerciseCode")
    public String exerciseCode;

    /**
     * <strong>example:</strong>
     * <p>2024-11-18</p>
     */
    @NameInMap("Tag")
    public String tag;

    public static GlobalConfirmRequest build(java.util.Map<String, ?> map) throws Exception {
        GlobalConfirmRequest self = new GlobalConfirmRequest();
        return TeaModel.build(map, self);
    }

    public GlobalConfirmRequest setExerciseCode(String exerciseCode) {
        this.exerciseCode = exerciseCode;
        return this;
    }
    public String getExerciseCode() {
        return this.exerciseCode;
    }

    public GlobalConfirmRequest setTag(String tag) {
        this.tag = tag;
        return this;
    }
    public String getTag() {
        return this.tag;
    }

}
