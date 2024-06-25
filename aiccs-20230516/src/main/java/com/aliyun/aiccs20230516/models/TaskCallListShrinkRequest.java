// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20230516.models;

import com.aliyun.tea.*;

public class TaskCallListShrinkRequest extends TeaModel {
    /**
     * <p>导入号码时返回的批次号</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("BatchId")
    public String batchId;

    /**
     * <p>开始外呼时间</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-01-25 00:00:00</p>
     */
    @NameInMap("CallDate")
    public String callDate;

    /**
     * <p>结束外呼时间</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-01-25 00:00:00</p>
     */
    @NameInMap("EndCallDate")
    public String endCallDate;

    /**
     * <p>意向标签</p>
     */
    @NameInMap("IntentTags")
    public String intentTagsShrink;

    /**
     * <p>号码列表</p>
     */
    @NameInMap("Numbers")
    public String numbersShrink;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>页数</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>39</p>
     */
    @NameInMap("Page")
    public Long page;

    /**
     * <p>每页外呼记录数,正整数，默认10000</p>
     * 
     * <strong>example:</strong>
     * <p>97</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>任务ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>93</p>
     */
    @NameInMap("TaskId")
    public Long taskId;

    public static TaskCallListShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        TaskCallListShrinkRequest self = new TaskCallListShrinkRequest();
        return TeaModel.build(map, self);
    }

    public TaskCallListShrinkRequest setBatchId(String batchId) {
        this.batchId = batchId;
        return this;
    }
    public String getBatchId() {
        return this.batchId;
    }

    public TaskCallListShrinkRequest setCallDate(String callDate) {
        this.callDate = callDate;
        return this;
    }
    public String getCallDate() {
        return this.callDate;
    }

    public TaskCallListShrinkRequest setEndCallDate(String endCallDate) {
        this.endCallDate = endCallDate;
        return this;
    }
    public String getEndCallDate() {
        return this.endCallDate;
    }

    public TaskCallListShrinkRequest setIntentTagsShrink(String intentTagsShrink) {
        this.intentTagsShrink = intentTagsShrink;
        return this;
    }
    public String getIntentTagsShrink() {
        return this.intentTagsShrink;
    }

    public TaskCallListShrinkRequest setNumbersShrink(String numbersShrink) {
        this.numbersShrink = numbersShrink;
        return this;
    }
    public String getNumbersShrink() {
        return this.numbersShrink;
    }

    public TaskCallListShrinkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public TaskCallListShrinkRequest setPage(Long page) {
        this.page = page;
        return this;
    }
    public Long getPage() {
        return this.page;
    }

    public TaskCallListShrinkRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public TaskCallListShrinkRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public TaskCallListShrinkRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public TaskCallListShrinkRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

}
