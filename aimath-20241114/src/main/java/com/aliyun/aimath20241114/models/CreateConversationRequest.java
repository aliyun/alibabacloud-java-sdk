// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimath20241114.models;

import com.aliyun.tea.*;

public class CreateConversationRequest extends TeaModel {
    @NameInMap("ExerciseAnalysis")
    public String exerciseAnalysis;

    @NameInMap("ExerciseAnswer")
    public String exerciseAnswer;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ExerciseContent")
    public String exerciseContent;

    @NameInMap("ExerciseType")
    public String exerciseType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2r560eHAbsknrfHXVZO4L</p>
     */
    @NameInMap("OuterBizId")
    public String outerBizId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>wx-xx-yy</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static CreateConversationRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateConversationRequest self = new CreateConversationRequest();
        return TeaModel.build(map, self);
    }

    public CreateConversationRequest setExerciseAnalysis(String exerciseAnalysis) {
        this.exerciseAnalysis = exerciseAnalysis;
        return this;
    }
    public String getExerciseAnalysis() {
        return this.exerciseAnalysis;
    }

    public CreateConversationRequest setExerciseAnswer(String exerciseAnswer) {
        this.exerciseAnswer = exerciseAnswer;
        return this;
    }
    public String getExerciseAnswer() {
        return this.exerciseAnswer;
    }

    public CreateConversationRequest setExerciseContent(String exerciseContent) {
        this.exerciseContent = exerciseContent;
        return this;
    }
    public String getExerciseContent() {
        return this.exerciseContent;
    }

    public CreateConversationRequest setExerciseType(String exerciseType) {
        this.exerciseType = exerciseType;
        return this;
    }
    public String getExerciseType() {
        return this.exerciseType;
    }

    public CreateConversationRequest setOuterBizId(String outerBizId) {
        this.outerBizId = outerBizId;
        return this;
    }
    public String getOuterBizId() {
        return this.outerBizId;
    }

    public CreateConversationRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
