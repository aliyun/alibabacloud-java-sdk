// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudCreateEnterpriseTimeRequest extends TeaModel {
    /**
     * <p>当type=1 时必选,周一：2、周二：3、周三：4、周四：5、周五：6、周六：7、周日：1。星期值以,分隔 例如： 2,3,4代表周一周二周三、type=2时为空串</p>
     * 
     * <strong>example:</strong>
     * <p>2,3,4</p>
     */
    @NameInMap("DayOfWeek")
    public String dayOfWeek;

    /**
     * <p>结束时间；格式为 HH:mm 例如、 19:00 startTime不能大于endTime</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>19:00</p>
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
     * <p>起始日期；当type=2 时必选，格式为：yyyy-MM-dd 、type=1时为空串 fromDay不能大于toDay</p>
     * 
     * <strong>example:</strong>
     * <p>2026-04-20</p>
     */
    @NameInMap("FromDay")
    public String fromDay;

    /**
     * <p>时间条件名称；同一呼叫中心下不能重复</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>demo01</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>时间条件优先级；同一呼叫中心下不能重复，值从1开始，值越小优先级越高</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Priority")
    public Long priority;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>开始时间；格式为 HH:mm 例如、 06:00 startTime不能大于endTime</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>06:00</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>时间类型 1.连续 2.间隔</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TimeType")
    public Long timeType;

    /**
     * <p>终止日期；当type=2 时必选，格式为：yyyy-MM-dd 、type=1时为空串 fromDay不能大于toDay</p>
     * 
     * <strong>example:</strong>
     * <p>2026-04-25</p>
     */
    @NameInMap("ToDay")
    public String toDay;

    /**
     * <p>条件类型 1:按照星期配置 2:按照固定时间配置</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Type")
    public Long type;

    public static CloudCreateEnterpriseTimeRequest build(java.util.Map<String, ?> map) throws Exception {
        CloudCreateEnterpriseTimeRequest self = new CloudCreateEnterpriseTimeRequest();
        return TeaModel.build(map, self);
    }

    public CloudCreateEnterpriseTimeRequest setDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
        return this;
    }
    public String getDayOfWeek() {
        return this.dayOfWeek;
    }

    public CloudCreateEnterpriseTimeRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public CloudCreateEnterpriseTimeRequest setEnterpriseId(Long enterpriseId) {
        this.enterpriseId = enterpriseId;
        return this;
    }
    public Long getEnterpriseId() {
        return this.enterpriseId;
    }

    public CloudCreateEnterpriseTimeRequest setFromDay(String fromDay) {
        this.fromDay = fromDay;
        return this;
    }
    public String getFromDay() {
        return this.fromDay;
    }

    public CloudCreateEnterpriseTimeRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CloudCreateEnterpriseTimeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CloudCreateEnterpriseTimeRequest setPriority(Long priority) {
        this.priority = priority;
        return this;
    }
    public Long getPriority() {
        return this.priority;
    }

    public CloudCreateEnterpriseTimeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CloudCreateEnterpriseTimeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CloudCreateEnterpriseTimeRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public CloudCreateEnterpriseTimeRequest setTimeType(Long timeType) {
        this.timeType = timeType;
        return this;
    }
    public Long getTimeType() {
        return this.timeType;
    }

    public CloudCreateEnterpriseTimeRequest setToDay(String toDay) {
        this.toDay = toDay;
        return this;
    }
    public String getToDay() {
        return this.toDay;
    }

    public CloudCreateEnterpriseTimeRequest setType(Long type) {
        this.type = type;
        return this;
    }
    public Long getType() {
        return this.type;
    }

}
