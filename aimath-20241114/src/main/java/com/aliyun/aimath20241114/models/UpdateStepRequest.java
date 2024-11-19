// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimath20241114.models;

import com.aliyun.tea.*;

public class UpdateStepRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1549d636-b102-4fee-8a99-fcc552aa9aa9</p>
     */
    @NameInMap("ContentCode")
    public String contentCode;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Ex_pop_1731848070815_funI</p>
     */
    @NameInMap("ExerciseCode")
    public String exerciseCode;

    public static UpdateStepRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateStepRequest self = new UpdateStepRequest();
        return TeaModel.build(map, self);
    }

    public UpdateStepRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public UpdateStepRequest setContentCode(String contentCode) {
        this.contentCode = contentCode;
        return this;
    }
    public String getContentCode() {
        return this.contentCode;
    }

    public UpdateStepRequest setExerciseCode(String exerciseCode) {
        this.exerciseCode = exerciseCode;
        return this;
    }
    public String getExerciseCode() {
        return this.exerciseCode;
    }

}
