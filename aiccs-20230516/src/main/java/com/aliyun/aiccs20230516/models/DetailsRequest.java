// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20230516.models;

import com.aliyun.tea.*;

public class DetailsRequest extends TeaModel {
    /**
     * <p>批次id</p>
     */
    @NameInMap("BatchId")
    public Long batchId;

    /**
     * <p>结束导入时间</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>号码状态</p>
     */
    @NameInMap("NumberStatus")
    public Long numberStatus;

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
    @NameInMap("PageNo")
    public Long pageNo;

    /**
     * <p>每页条数</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>开始导入时间</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>任务id</p>
     */
    @NameInMap("TaskId")
    public Long taskId;

    public static DetailsRequest build(java.util.Map<String, ?> map) throws Exception {
        DetailsRequest self = new DetailsRequest();
        return TeaModel.build(map, self);
    }

    public DetailsRequest setBatchId(Long batchId) {
        this.batchId = batchId;
        return this;
    }
    public Long getBatchId() {
        return this.batchId;
    }

    public DetailsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DetailsRequest setNumberStatus(Long numberStatus) {
        this.numberStatus = numberStatus;
        return this;
    }
    public Long getNumberStatus() {
        return this.numberStatus;
    }

    public DetailsRequest setNumbers(java.util.List<String> numbers) {
        this.numbers = numbers;
        return this;
    }
    public java.util.List<String> getNumbers() {
        return this.numbers;
    }

    public DetailsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DetailsRequest setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

    public DetailsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DetailsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DetailsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DetailsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DetailsRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

}
