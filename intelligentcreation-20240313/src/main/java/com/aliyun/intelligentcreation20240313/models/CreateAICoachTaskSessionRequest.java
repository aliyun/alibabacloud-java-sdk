// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class CreateAICoachTaskSessionRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>821882330423951360</p>
     */
    @NameInMap("taskId")
    public String taskId;

    /**
     * <strong>example:</strong>
     * <p>1730530943640489</p>
     */
    @NameInMap("uid")
    public String uid;

    public static CreateAICoachTaskSessionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAICoachTaskSessionRequest self = new CreateAICoachTaskSessionRequest();
        return TeaModel.build(map, self);
    }

    public CreateAICoachTaskSessionRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public CreateAICoachTaskSessionRequest setUid(String uid) {
        this.uid = uid;
        return this;
    }
    public String getUid() {
        return this.uid;
    }

}
