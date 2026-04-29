// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudQueryTaskRequest extends TeaModel {
    /**
     * <p>定时开始；0.关闭 1.开启</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("AutoStart")
    public Long autoStart;

    /**
     * <p>定时结束；0.关闭 1.开启</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("AutoStop")
    public Long autoStop;

    /**
     * <p>查询结束时间；格式说明：&quot;2019-10-11 23:59:59&quot;</p>
     * 
     * <strong>example:</strong>
     * <p>2026-04-20 20:00:00</p>
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
     * <p>需要取出的数据条数；大于0，最大不能超过100，默认10</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Limit")
    public Long limit;

    /**
     * <p>任务名称；需进行UTF-8格式的URLEncode编码</p>
     * 
     * <strong>example:</strong>
     * <p>name1</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>从第几条开始获取；大于等于0，默认0</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Start")
    public Long start;

    /**
     * <p>查询开始时间；格式说明：&quot;2019-10-11 00:00:00&quot;</p>
     * 
     * <strong>example:</strong>
     * <p>2026-04-20 10:00:00</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>任务状态；0.初始 1.运行中 2.暂停 3.结束</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("Status")
    public Long status;

    /**
     * <p>时间过滤条件；1.任务启动时间 2.任务结束时间 3.任务创建时间</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TimeType")
    public Long timeType;

    /**
     * <p>任务类型；1.预测外呼任务 2.自动外呼任务</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Type")
    public Long type;

    public static CloudQueryTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CloudQueryTaskRequest self = new CloudQueryTaskRequest();
        return TeaModel.build(map, self);
    }

    public CloudQueryTaskRequest setAutoStart(Long autoStart) {
        this.autoStart = autoStart;
        return this;
    }
    public Long getAutoStart() {
        return this.autoStart;
    }

    public CloudQueryTaskRequest setAutoStop(Long autoStop) {
        this.autoStop = autoStop;
        return this;
    }
    public Long getAutoStop() {
        return this.autoStop;
    }

    public CloudQueryTaskRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public CloudQueryTaskRequest setEnterpriseId(Long enterpriseId) {
        this.enterpriseId = enterpriseId;
        return this;
    }
    public Long getEnterpriseId() {
        return this.enterpriseId;
    }

    public CloudQueryTaskRequest setLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    public Long getLimit() {
        return this.limit;
    }

    public CloudQueryTaskRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CloudQueryTaskRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CloudQueryTaskRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CloudQueryTaskRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CloudQueryTaskRequest setStart(Long start) {
        this.start = start;
        return this;
    }
    public Long getStart() {
        return this.start;
    }

    public CloudQueryTaskRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public CloudQueryTaskRequest setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

    public CloudQueryTaskRequest setTimeType(Long timeType) {
        this.timeType = timeType;
        return this;
    }
    public Long getTimeType() {
        return this.timeType;
    }

    public CloudQueryTaskRequest setType(Long type) {
        this.type = type;
        return this;
    }
    public Long getType() {
        return this.type;
    }

}
