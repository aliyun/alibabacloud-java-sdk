// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mssp20161228.models;

import com.aliyun.tea.*;

public class DisposeServiceWorkOrderRequest extends TeaModel {
    @NameInMap("AttachmentName")
    public String attachmentName;

    /**
     * <strong>example:</strong>
     * <p>2024-04-14 00:00:00</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <strong>example:</strong>
     * <p>405639</p>
     */
    @NameInMap("ForwardOwnerId")
    public String forwardOwnerId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>23172</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <strong>example:</strong>
     * <p>Y</p>
     */
    @NameInMap("IsAttachment")
    public String isAttachment;

    /**
     * <strong>example:</strong>
     * <p>Y</p>
     */
    @NameInMap("IsWorkOrderNotify")
    public String isWorkOrderNotify;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("NotifyId")
    public Long notifyId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("OperateRemark")
    public String operateRemark;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PROCESSED</p>
     */
    @NameInMap("OperateType")
    public String operateType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>396120</p>
     */
    @NameInMap("Operator")
    public String operator;

    /**
     * <strong>example:</strong>
     * <p>2024-04-02 00:00:00</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <strong>example:</strong>
     * <p>336333</p>
     */
    @NameInMap("UpgradeOwnerId")
    public String upgradeOwnerId;

    @NameInMap("WorkOrderDetail")
    public String workOrderDetail;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("WorkOrderName")
    public String workOrderName;

    /**
     * <strong>example:</strong>
     * <p>PROCESSED</p>
     */
    @NameInMap("WorkOrderStatus")
    public String workOrderStatus;

    public static DisposeServiceWorkOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        DisposeServiceWorkOrderRequest self = new DisposeServiceWorkOrderRequest();
        return TeaModel.build(map, self);
    }

    public DisposeServiceWorkOrderRequest setAttachmentName(String attachmentName) {
        this.attachmentName = attachmentName;
        return this;
    }
    public String getAttachmentName() {
        return this.attachmentName;
    }

    public DisposeServiceWorkOrderRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DisposeServiceWorkOrderRequest setForwardOwnerId(String forwardOwnerId) {
        this.forwardOwnerId = forwardOwnerId;
        return this;
    }
    public String getForwardOwnerId() {
        return this.forwardOwnerId;
    }

    public DisposeServiceWorkOrderRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public DisposeServiceWorkOrderRequest setIsAttachment(String isAttachment) {
        this.isAttachment = isAttachment;
        return this;
    }
    public String getIsAttachment() {
        return this.isAttachment;
    }

    public DisposeServiceWorkOrderRequest setIsWorkOrderNotify(String isWorkOrderNotify) {
        this.isWorkOrderNotify = isWorkOrderNotify;
        return this;
    }
    public String getIsWorkOrderNotify() {
        return this.isWorkOrderNotify;
    }

    public DisposeServiceWorkOrderRequest setNotifyId(Long notifyId) {
        this.notifyId = notifyId;
        return this;
    }
    public Long getNotifyId() {
        return this.notifyId;
    }

    public DisposeServiceWorkOrderRequest setOperateRemark(String operateRemark) {
        this.operateRemark = operateRemark;
        return this;
    }
    public String getOperateRemark() {
        return this.operateRemark;
    }

    public DisposeServiceWorkOrderRequest setOperateType(String operateType) {
        this.operateType = operateType;
        return this;
    }
    public String getOperateType() {
        return this.operateType;
    }

    public DisposeServiceWorkOrderRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public DisposeServiceWorkOrderRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public DisposeServiceWorkOrderRequest setUpgradeOwnerId(String upgradeOwnerId) {
        this.upgradeOwnerId = upgradeOwnerId;
        return this;
    }
    public String getUpgradeOwnerId() {
        return this.upgradeOwnerId;
    }

    public DisposeServiceWorkOrderRequest setWorkOrderDetail(String workOrderDetail) {
        this.workOrderDetail = workOrderDetail;
        return this;
    }
    public String getWorkOrderDetail() {
        return this.workOrderDetail;
    }

    public DisposeServiceWorkOrderRequest setWorkOrderName(String workOrderName) {
        this.workOrderName = workOrderName;
        return this;
    }
    public String getWorkOrderName() {
        return this.workOrderName;
    }

    public DisposeServiceWorkOrderRequest setWorkOrderStatus(String workOrderStatus) {
        this.workOrderStatus = workOrderStatus;
        return this;
    }
    public String getWorkOrderStatus() {
        return this.workOrderStatus;
    }

}
