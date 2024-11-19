// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimath20241114.models;

import com.aliyun.tea.*;

public class GenAnalysisRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ExerciseContent")
    public String exerciseContent;

    public static GenAnalysisRequest build(java.util.Map<String, ?> map) throws Exception {
        GenAnalysisRequest self = new GenAnalysisRequest();
        return TeaModel.build(map, self);
    }

    public GenAnalysisRequest setExerciseContent(String exerciseContent) {
        this.exerciseContent = exerciseContent;
        return this;
    }
    public String getExerciseContent() {
        return this.exerciseContent;
    }

}
