// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudListTaskFileRequest extends TeaModel {
    /**
     * <p>说明：统计日期的结束时间，格式：yyyy-MM-dd HH:mm:ss, 最大查询范围1个月</p>
     * 
     * <strong>example:</strong>
     * <p>2026-05-20 10:00:00</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>呼叫中心 id</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>7000002</p>
     */
    @NameInMap("EnterpriseId")
    public Long enterpriseId;

    /**
     * <p>查询条数；取值：最大不能超过5000，默认10</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Limit")
    public Long limit;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>查询起始位置；取值：大于等于0，默认0</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Start")
    public Long start;

    /**
     * <p>说明：统计日期的开始时间，格式：yyyy-MM-dd HH:mm:ss</p>
     * 
     * <strong>example:</strong>
     * <p>2026-04-20 10:00:00</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>批次状态；说明：0：未导入，1：导入完成 ，2：加载到缓存，3：呼叫完</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Status")
    public Long status;

    /**
     * <p>任务Id</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>27</p>
     */
    @NameInMap("TaskId")
    public Long taskId;

    public static CloudListTaskFileRequest build(java.util.Map<String, ?> map) throws Exception {
        CloudListTaskFileRequest self = new CloudListTaskFileRequest();
        return TeaModel.build(map, self);
    }

    public CloudListTaskFileRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public CloudListTaskFileRequest setEnterpriseId(Long enterpriseId) {
        this.enterpriseId = enterpriseId;
        return this;
    }
    public Long getEnterpriseId() {
        return this.enterpriseId;
    }

    public CloudListTaskFileRequest setLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    public Long getLimit() {
        return this.limit;
    }

    public CloudListTaskFileRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CloudListTaskFileRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CloudListTaskFileRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CloudListTaskFileRequest setStart(Long start) {
        this.start = start;
        return this;
    }
    public Long getStart() {
        return this.start;
    }

    public CloudListTaskFileRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public CloudListTaskFileRequest setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

    public CloudListTaskFileRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

}
