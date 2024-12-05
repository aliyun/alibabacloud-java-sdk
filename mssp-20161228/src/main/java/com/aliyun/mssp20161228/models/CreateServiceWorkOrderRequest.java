// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mssp20161228.models;

import com.aliyun.tea.*;

public class CreateServiceWorkOrderRequest extends TeaModel {
    /**
     * <p>Creator.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>426556</p>
     */
    @NameInMap("Creator")
    public String creator;

    /**
     * <p>Customer ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1477832102462645</p>
     */
    @NameInMap("CustomerId")
    public String customerId;

    /**
     * <p>Duration in days.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("DurationDay")
    public String durationDay;

    /**
     * <p>Attachment requirement.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Y</p>
     */
    @NameInMap("IsAttachment")
    public String isAttachment;

    /**
     * <p>Whether a reminder is needed.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Y</p>
     */
    @NameInMap("IsWorkOrderNotify")
    public String isWorkOrderNotify;

    /**
     * <p>Number of days for advance notification.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("NotifyDay")
    public String notifyDay;

    /**
     * <p>Notification ID.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("NotifyId")
    public Long notifyId;

    /**
     * <p>Operation remarks.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>新建</p>
     */
    @NameInMap("OperateRemark")
    public String operateRemark;

    /**
     * <p>Operation type.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CREATE</p>
     */
    @NameInMap("OperateType")
    public String operateType;

    /**
     * <p>Operator.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>426556</p>
     */
    @NameInMap("Operator")
    public String operator;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("OwnerId")
    public String ownerId;

    /**
     * <p>Start time.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-01-21 15:25:25</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <p>Work order details.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;questionDetail&quot;:&quot;测试工单&quot;,&quot;answerDetail&quot;:&quot;&quot;}</p>
     */
    @NameInMap("WorkOrderDetail")
    public String workOrderDetail;

    /**
     * <p>Work order name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>安全月报交付任务</p>
     */
    @NameInMap("WorkOrderName")
    public String workOrderName;

    /**
     * <p>Work order source.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>工单迁移</p>
     */
    @NameInMap("WorkOrderSource")
    public String workOrderSource;

    /**
     * <p>Work order status.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>UNPROCESSED</p>
     */
    @NameInMap("WorkOrderStatus")
    public String workOrderStatus;

    /**
     * <p>Work order type.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MONTH_REPORT</p>
     */
    @NameInMap("WorkOrderType")
    public String workOrderType;

    public static CreateServiceWorkOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateServiceWorkOrderRequest self = new CreateServiceWorkOrderRequest();
        return TeaModel.build(map, self);
    }

    public CreateServiceWorkOrderRequest setCreator(String creator) {
        this.creator = creator;
        return this;
    }
    public String getCreator() {
        return this.creator;
    }

    public CreateServiceWorkOrderRequest setCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }
    public String getCustomerId() {
        return this.customerId;
    }

    public CreateServiceWorkOrderRequest setDurationDay(String durationDay) {
        this.durationDay = durationDay;
        return this;
    }
    public String getDurationDay() {
        return this.durationDay;
    }

    public CreateServiceWorkOrderRequest setIsAttachment(String isAttachment) {
        this.isAttachment = isAttachment;
        return this;
    }
    public String getIsAttachment() {
        return this.isAttachment;
    }

    public CreateServiceWorkOrderRequest setIsWorkOrderNotify(String isWorkOrderNotify) {
        this.isWorkOrderNotify = isWorkOrderNotify;
        return this;
    }
    public String getIsWorkOrderNotify() {
        return this.isWorkOrderNotify;
    }

    public CreateServiceWorkOrderRequest setNotifyDay(String notifyDay) {
        this.notifyDay = notifyDay;
        return this;
    }
    public String getNotifyDay() {
        return this.notifyDay;
    }

    public CreateServiceWorkOrderRequest setNotifyId(Long notifyId) {
        this.notifyId = notifyId;
        return this;
    }
    public Long getNotifyId() {
        return this.notifyId;
    }

    public CreateServiceWorkOrderRequest setOperateRemark(String operateRemark) {
        this.operateRemark = operateRemark;
        return this;
    }
    public String getOperateRemark() {
        return this.operateRemark;
    }

    public CreateServiceWorkOrderRequest setOperateType(String operateType) {
        this.operateType = operateType;
        return this;
    }
    public String getOperateType() {
        return this.operateType;
    }

    public CreateServiceWorkOrderRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public CreateServiceWorkOrderRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public CreateServiceWorkOrderRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public CreateServiceWorkOrderRequest setWorkOrderDetail(String workOrderDetail) {
        this.workOrderDetail = workOrderDetail;
        return this;
    }
    public String getWorkOrderDetail() {
        return this.workOrderDetail;
    }

    public CreateServiceWorkOrderRequest setWorkOrderName(String workOrderName) {
        this.workOrderName = workOrderName;
        return this;
    }
    public String getWorkOrderName() {
        return this.workOrderName;
    }

    public CreateServiceWorkOrderRequest setWorkOrderSource(String workOrderSource) {
        this.workOrderSource = workOrderSource;
        return this;
    }
    public String getWorkOrderSource() {
        return this.workOrderSource;
    }

    public CreateServiceWorkOrderRequest setWorkOrderStatus(String workOrderStatus) {
        this.workOrderStatus = workOrderStatus;
        return this;
    }
    public String getWorkOrderStatus() {
        return this.workOrderStatus;
    }

    public CreateServiceWorkOrderRequest setWorkOrderType(String workOrderType) {
        this.workOrderType = workOrderType;
        return this;
    }
    public String getWorkOrderType() {
        return this.workOrderType;
    }

}
