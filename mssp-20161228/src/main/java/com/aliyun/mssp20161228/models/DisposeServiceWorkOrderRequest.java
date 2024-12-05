// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mssp20161228.models;

import com.aliyun.tea.*;

public class DisposeServiceWorkOrderRequest extends TeaModel {
    /**
     * <p>Attachment name.</p>
     * 
     * <strong>example:</strong>
     * <p>bbaa133c-0ac2-489f-9fc8-39f91c2e770c_20230301-20240403-服务工单列表.xlsx</p>
     */
    @NameInMap("AttachmentName")
    public String attachmentName;

    /**
     * <p>End time.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-04-14 00:00:00</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>Forward to owner.</p>
     * 
     * <strong>example:</strong>
     * <p>405639</p>
     */
    @NameInMap("ForwardOwnerId")
    public String forwardOwnerId;

    /**
     * <p>Work order ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>23172</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>Attachment requirement.</p>
     * 
     * <strong>example:</strong>
     * <p>Y</p>
     */
    @NameInMap("IsAttachment")
    public String isAttachment;

    /**
     * <p>Work order notification.</p>
     * 
     * <strong>example:</strong>
     * <p>Y</p>
     */
    @NameInMap("IsWorkOrderNotify")
    public String isWorkOrderNotify;

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
     * <p>处理完成</p>
     */
    @NameInMap("OperateRemark")
    public String operateRemark;

    /**
     * <p>Processing type.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PROCESSED</p>
     */
    @NameInMap("OperateType")
    public String operateType;

    /**
     * <p>Operator.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>396120</p>
     */
    @NameInMap("Operator")
    public String operator;

    /**
     * <p>Start time.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-04-02 00:00:00</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <p>Upgrade owner.</p>
     * 
     * <strong>example:</strong>
     * <p>336333</p>
     */
    @NameInMap("UpgradeOwnerId")
    public String upgradeOwnerId;

    /**
     * <p>Work order details.</p>
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
     * <p>安全产品配置问题与超量提醒</p>
     */
    @NameInMap("WorkOrderName")
    public String workOrderName;

    /**
     * <p>Work order status.</p>
     * 
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
