// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20230516.models;

import com.aliyun.tea.*;

public class TaskRecoverCallRequest extends TeaModel {
    /**
     * <p>查询开始导入时间</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;2023-01-09 18:58:19&quot;</p>
     */
    @NameInMap("BeginImportTime")
    public String beginImportTime;

    /**
     * <p>查询结束导入时间</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;2023-01-09 18:58:19&quot;</p>
     */
    @NameInMap("EndImportTime")
    public String endImportTime;

    /**
     * <p>号码列表</p>
     */
    @NameInMap("Numbers")
    public java.util.List<String> numbers;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>用户自定义标签列表</p>
     */
    @NameInMap("Tags")
    public java.util.List<String> tags;

    /**
     * <p>任务ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>93</p>
     */
    @NameInMap("TaskId")
    public Long taskId;

    public static TaskRecoverCallRequest build(java.util.Map<String, ?> map) throws Exception {
        TaskRecoverCallRequest self = new TaskRecoverCallRequest();
        return TeaModel.build(map, self);
    }

    public TaskRecoverCallRequest setBeginImportTime(String beginImportTime) {
        this.beginImportTime = beginImportTime;
        return this;
    }
    public String getBeginImportTime() {
        return this.beginImportTime;
    }

    public TaskRecoverCallRequest setEndImportTime(String endImportTime) {
        this.endImportTime = endImportTime;
        return this;
    }
    public String getEndImportTime() {
        return this.endImportTime;
    }

    public TaskRecoverCallRequest setNumbers(java.util.List<String> numbers) {
        this.numbers = numbers;
        return this;
    }
    public java.util.List<String> getNumbers() {
        return this.numbers;
    }

    public TaskRecoverCallRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public TaskRecoverCallRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public TaskRecoverCallRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public TaskRecoverCallRequest setTags(java.util.List<String> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<String> getTags() {
        return this.tags;
    }

    public TaskRecoverCallRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

}
