// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class ListDialogRequest extends TeaModel {
    /**
     * <p>The called number. You can view the called number in the <a href="https://aiccs.console.aliyun.com/job/list"><strong>Task Management</strong></a> &gt; <strong>Details</strong> interface or retrieve it by invoking the <a href="https://help.aliyun.com/document_detail/2718009.html">ListTaskDetail</a> API. The <strong>Called</strong> parameter in the API response is the called number.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>130****0000</p>
     */
    @NameInMap("Called")
    public String called;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The unique job ID of the robot outbound call task. You can view it in the <a href="https://aiccs.console.aliyun.com/job/list">Task Management</a> interface or obtain it by invoking the <a href="https://help.aliyun.com/document_detail/223556.html">CreateTask</a> API.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12****</p>
     */
    @NameInMap("TaskId")
    public Long taskId;

    public static ListDialogRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDialogRequest self = new ListDialogRequest();
        return TeaModel.build(map, self);
    }

    public ListDialogRequest setCalled(String called) {
        this.called = called;
        return this;
    }
    public String getCalled() {
        return this.called;
    }

    public ListDialogRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ListDialogRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ListDialogRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ListDialogRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

}
