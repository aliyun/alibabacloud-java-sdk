// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimath20241114.models;

import com.aliyun.tea.*;

public class CreateRelatedConversationRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Ex_pop_1731848070815_funI</p>
     */
    @NameInMap("ExerciseCode")
    public String exerciseCode;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>725e5550-8f81-42e0-a4db-d2de1be52afc</p>
     */
    @NameInMap("OuterBizId")
    public String outerBizId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pop_1731848070815</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static CreateRelatedConversationRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRelatedConversationRequest self = new CreateRelatedConversationRequest();
        return TeaModel.build(map, self);
    }

    public CreateRelatedConversationRequest setExerciseCode(String exerciseCode) {
        this.exerciseCode = exerciseCode;
        return this;
    }
    public String getExerciseCode() {
        return this.exerciseCode;
    }

    public CreateRelatedConversationRequest setOuterBizId(String outerBizId) {
        this.outerBizId = outerBizId;
        return this;
    }
    public String getOuterBizId() {
        return this.outerBizId;
    }

    public CreateRelatedConversationRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
