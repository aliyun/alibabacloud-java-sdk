// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20200710.models;

import com.aliyun.tea.*;

public class PushTemplateRequest extends TeaModel {
    @NameInMap("ActivityContentState")
    public Object activityContentState;

    @NameInMap("ActivityEvent")
    public String activityEvent;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AppId")
    public String appId;

    @NameInMap("ChannelId")
    public String channelId;

    @NameInMap("Classification")
    public String classification;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DeliveryType")
    public Long deliveryType;

    @NameInMap("DismissalDate")
    public Long dismissalDate;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ExpiredSeconds")
    public Long expiredSeconds;

    @NameInMap("ExtendedParams")
    public String extendedParams;

    @NameInMap("MiChannelId")
    public String miChannelId;

    @NameInMap("NotifyLevel")
    public java.util.Map<String, ?> notifyLevel;

    @NameInMap("NotifyType")
    public String notifyType;

    @NameInMap("PushAction")
    public Long pushAction;

    @NameInMap("Silent")
    public Long silent;

    @NameInMap("StrategyContent")
    public String strategyContent;

    @NameInMap("StrategyType")
    public Integer strategyType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TargetMsgkey")
    public String targetMsgkey;

    @NameInMap("TaskName")
    public String taskName;

    @NameInMap("TemplateKeyValue")
    public String templateKeyValue;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TemplateName")
    public String templateName;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("ThirdChannelCategory")
    public java.util.Map<String, ?> thirdChannelCategory;

    @NameInMap("TransparentMessagePayload")
    public Object transparentMessagePayload;

    @NameInMap("TransparentMessageUrgency")
    public String transparentMessageUrgency;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static PushTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        PushTemplateRequest self = new PushTemplateRequest();
        return TeaModel.build(map, self);
    }

    public PushTemplateRequest setActivityContentState(Object activityContentState) {
        this.activityContentState = activityContentState;
        return this;
    }
    public Object getActivityContentState() {
        return this.activityContentState;
    }

    public PushTemplateRequest setActivityEvent(String activityEvent) {
        this.activityEvent = activityEvent;
        return this;
    }
    public String getActivityEvent() {
        return this.activityEvent;
    }

    public PushTemplateRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public PushTemplateRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public PushTemplateRequest setClassification(String classification) {
        this.classification = classification;
        return this;
    }
    public String getClassification() {
        return this.classification;
    }

    public PushTemplateRequest setDeliveryType(Long deliveryType) {
        this.deliveryType = deliveryType;
        return this;
    }
    public Long getDeliveryType() {
        return this.deliveryType;
    }

    public PushTemplateRequest setDismissalDate(Long dismissalDate) {
        this.dismissalDate = dismissalDate;
        return this;
    }
    public Long getDismissalDate() {
        return this.dismissalDate;
    }

    public PushTemplateRequest setExpiredSeconds(Long expiredSeconds) {
        this.expiredSeconds = expiredSeconds;
        return this;
    }
    public Long getExpiredSeconds() {
        return this.expiredSeconds;
    }

    public PushTemplateRequest setExtendedParams(String extendedParams) {
        this.extendedParams = extendedParams;
        return this;
    }
    public String getExtendedParams() {
        return this.extendedParams;
    }

    public PushTemplateRequest setMiChannelId(String miChannelId) {
        this.miChannelId = miChannelId;
        return this;
    }
    public String getMiChannelId() {
        return this.miChannelId;
    }

    public PushTemplateRequest setNotifyLevel(java.util.Map<String, ?> notifyLevel) {
        this.notifyLevel = notifyLevel;
        return this;
    }
    public java.util.Map<String, ?> getNotifyLevel() {
        return this.notifyLevel;
    }

    public PushTemplateRequest setNotifyType(String notifyType) {
        this.notifyType = notifyType;
        return this;
    }
    public String getNotifyType() {
        return this.notifyType;
    }

    public PushTemplateRequest setPushAction(Long pushAction) {
        this.pushAction = pushAction;
        return this;
    }
    public Long getPushAction() {
        return this.pushAction;
    }

    public PushTemplateRequest setSilent(Long silent) {
        this.silent = silent;
        return this;
    }
    public Long getSilent() {
        return this.silent;
    }

    public PushTemplateRequest setStrategyContent(String strategyContent) {
        this.strategyContent = strategyContent;
        return this;
    }
    public String getStrategyContent() {
        return this.strategyContent;
    }

    public PushTemplateRequest setStrategyType(Integer strategyType) {
        this.strategyType = strategyType;
        return this;
    }
    public Integer getStrategyType() {
        return this.strategyType;
    }

    public PushTemplateRequest setTargetMsgkey(String targetMsgkey) {
        this.targetMsgkey = targetMsgkey;
        return this;
    }
    public String getTargetMsgkey() {
        return this.targetMsgkey;
    }

    public PushTemplateRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

    public PushTemplateRequest setTemplateKeyValue(String templateKeyValue) {
        this.templateKeyValue = templateKeyValue;
        return this;
    }
    public String getTemplateKeyValue() {
        return this.templateKeyValue;
    }

    public PushTemplateRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public PushTemplateRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public PushTemplateRequest setThirdChannelCategory(java.util.Map<String, ?> thirdChannelCategory) {
        this.thirdChannelCategory = thirdChannelCategory;
        return this;
    }
    public java.util.Map<String, ?> getThirdChannelCategory() {
        return this.thirdChannelCategory;
    }

    public PushTemplateRequest setTransparentMessagePayload(Object transparentMessagePayload) {
        this.transparentMessagePayload = transparentMessagePayload;
        return this;
    }
    public Object getTransparentMessagePayload() {
        return this.transparentMessagePayload;
    }

    public PushTemplateRequest setTransparentMessageUrgency(String transparentMessageUrgency) {
        this.transparentMessageUrgency = transparentMessageUrgency;
        return this;
    }
    public String getTransparentMessageUrgency() {
        return this.transparentMessageUrgency;
    }

    public PushTemplateRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
