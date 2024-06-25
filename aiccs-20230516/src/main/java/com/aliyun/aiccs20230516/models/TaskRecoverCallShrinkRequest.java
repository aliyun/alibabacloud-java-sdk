// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20230516.models;

import com.aliyun.tea.*;

public class TaskRecoverCallShrinkRequest extends TeaModel {
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
    public String numbersShrink;

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
    public String tagsShrink;

    /**
     * <p>任务ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>93</p>
     */
    @NameInMap("TaskId")
    public Long taskId;

    public static TaskRecoverCallShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        TaskRecoverCallShrinkRequest self = new TaskRecoverCallShrinkRequest();
        return TeaModel.build(map, self);
    }

    public TaskRecoverCallShrinkRequest setBeginImportTime(String beginImportTime) {
        this.beginImportTime = beginImportTime;
        return this;
    }
    public String getBeginImportTime() {
        return this.beginImportTime;
    }

    public TaskRecoverCallShrinkRequest setEndImportTime(String endImportTime) {
        this.endImportTime = endImportTime;
        return this;
    }
    public String getEndImportTime() {
        return this.endImportTime;
    }

    public TaskRecoverCallShrinkRequest setNumbersShrink(String numbersShrink) {
        this.numbersShrink = numbersShrink;
        return this;
    }
    public String getNumbersShrink() {
        return this.numbersShrink;
    }

    public TaskRecoverCallShrinkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public TaskRecoverCallShrinkRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public TaskRecoverCallShrinkRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public TaskRecoverCallShrinkRequest setTagsShrink(String tagsShrink) {
        this.tagsShrink = tagsShrink;
        return this;
    }
    public String getTagsShrink() {
        return this.tagsShrink;
    }

    public TaskRecoverCallShrinkRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

}
