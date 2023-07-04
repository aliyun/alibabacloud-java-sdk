// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20230516.models;

import com.aliyun.tea.*;

public class TaskCallListRequest extends TeaModel {
    /**
     * <p>导入号码时返回的批次号</p>
     */
    @NameInMap("BatchId")
    public String batchId;

    /**
     * <p>开始外呼时间</p>
     */
    @NameInMap("CallDate")
    public String callDate;

    /**
     * <p>结束外呼时间</p>
     */
    @NameInMap("EndCallDate")
    public String endCallDate;

    /**
     * <p>意向标签</p>
     */
    @NameInMap("IntentTags")
    public java.util.List<String> intentTags;

    /**
     * <p>号码列表</p>
     */
    @NameInMap("Numbers")
    public java.util.List<String> numbers;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>页数</p>
     */
    @NameInMap("Page")
    public Long page;

    /**
     * <p>每页外呼记录数,正整数，默认10000</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>任务ID</p>
     */
    @NameInMap("TaskId")
    public Long taskId;

    public static TaskCallListRequest build(java.util.Map<String, ?> map) throws Exception {
        TaskCallListRequest self = new TaskCallListRequest();
        return TeaModel.build(map, self);
    }

    public TaskCallListRequest setBatchId(String batchId) {
        this.batchId = batchId;
        return this;
    }
    public String getBatchId() {
        return this.batchId;
    }

    public TaskCallListRequest setCallDate(String callDate) {
        this.callDate = callDate;
        return this;
    }
    public String getCallDate() {
        return this.callDate;
    }

    public TaskCallListRequest setEndCallDate(String endCallDate) {
        this.endCallDate = endCallDate;
        return this;
    }
    public String getEndCallDate() {
        return this.endCallDate;
    }

    public TaskCallListRequest setIntentTags(java.util.List<String> intentTags) {
        this.intentTags = intentTags;
        return this;
    }
    public java.util.List<String> getIntentTags() {
        return this.intentTags;
    }

    public TaskCallListRequest setNumbers(java.util.List<String> numbers) {
        this.numbers = numbers;
        return this;
    }
    public java.util.List<String> getNumbers() {
        return this.numbers;
    }

    public TaskCallListRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public TaskCallListRequest setPage(Long page) {
        this.page = page;
        return this;
    }
    public Long getPage() {
        return this.page;
    }

    public TaskCallListRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public TaskCallListRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public TaskCallListRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public TaskCallListRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

}
