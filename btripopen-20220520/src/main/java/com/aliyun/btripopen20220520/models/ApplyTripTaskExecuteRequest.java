// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class ApplyTripTaskExecuteRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>open</p>
     */
    @NameInMap("action_from")
    public String actionFrom;

    @NameInMap("comment")
    public String comment;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>agree</p>
     */
    @NameInMap("task_action")
    public String taskAction;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12345</p>
     */
    @NameInMap("task_id")
    public Long taskId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>thirdpart12138</p>
     */
    @NameInMap("user_id")
    public String userId;

    @NameInMap("user_name")
    public String userName;

    public static ApplyTripTaskExecuteRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyTripTaskExecuteRequest self = new ApplyTripTaskExecuteRequest();
        return TeaModel.build(map, self);
    }

    public ApplyTripTaskExecuteRequest setActionFrom(String actionFrom) {
        this.actionFrom = actionFrom;
        return this;
    }
    public String getActionFrom() {
        return this.actionFrom;
    }

    public ApplyTripTaskExecuteRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public ApplyTripTaskExecuteRequest setTaskAction(String taskAction) {
        this.taskAction = taskAction;
        return this;
    }
    public String getTaskAction() {
        return this.taskAction;
    }

    public ApplyTripTaskExecuteRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

    public ApplyTripTaskExecuteRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public ApplyTripTaskExecuteRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
