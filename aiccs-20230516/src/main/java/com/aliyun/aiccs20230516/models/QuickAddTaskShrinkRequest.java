// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20230516.models;

import com.aliyun.tea.*;

public class QuickAddTaskShrinkRequest extends TeaModel {
    /**
     * <p>坐席组ID</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AgentGroupId")
    public Long agentGroupId;

    /**
     * <p>外呼时间</p>
     */
    @NameInMap("CallTimeList")
    public String callTimeListShrink;

    /**
     * <p>任务名称</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>被复制任务ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ReferenceTaskId")
    public Long referenceTaskId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>短信模板ID</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SmsTemplateId")
    public Long smsTemplateId;

    /**
     * <p>任务启动日期</p>
     * 
     * <strong>example:</strong>
     * <p>2019-04-30</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>话术模板ID,如果不传则使用被复制任务的话术模板</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TemplateId")
    public Long templateId;

    /**
     * <p>话术模板类型</p>
     * 
     * <strong>example:</strong>
     * <p>1：单模版；2：智能话术策略模板。不填默认1。</p>
     */
    @NameInMap("TemplateType")
    public Long templateType;

    public static QuickAddTaskShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        QuickAddTaskShrinkRequest self = new QuickAddTaskShrinkRequest();
        return TeaModel.build(map, self);
    }

    public QuickAddTaskShrinkRequest setAgentGroupId(Long agentGroupId) {
        this.agentGroupId = agentGroupId;
        return this;
    }
    public Long getAgentGroupId() {
        return this.agentGroupId;
    }

    public QuickAddTaskShrinkRequest setCallTimeListShrink(String callTimeListShrink) {
        this.callTimeListShrink = callTimeListShrink;
        return this;
    }
    public String getCallTimeListShrink() {
        return this.callTimeListShrink;
    }

    public QuickAddTaskShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public QuickAddTaskShrinkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public QuickAddTaskShrinkRequest setReferenceTaskId(Long referenceTaskId) {
        this.referenceTaskId = referenceTaskId;
        return this;
    }
    public Long getReferenceTaskId() {
        return this.referenceTaskId;
    }

    public QuickAddTaskShrinkRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public QuickAddTaskShrinkRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public QuickAddTaskShrinkRequest setSmsTemplateId(Long smsTemplateId) {
        this.smsTemplateId = smsTemplateId;
        return this;
    }
    public Long getSmsTemplateId() {
        return this.smsTemplateId;
    }

    public QuickAddTaskShrinkRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public QuickAddTaskShrinkRequest setTemplateId(Long templateId) {
        this.templateId = templateId;
        return this;
    }
    public Long getTemplateId() {
        return this.templateId;
    }

    public QuickAddTaskShrinkRequest setTemplateType(Long templateType) {
        this.templateType = templateType;
        return this;
    }
    public Long getTemplateType() {
        return this.templateType;
    }

}
