// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class PushTemplateRequest extends TeaModel {
    @NameInMap("ActivityContentState")
    public Object activityContentState;

    @NameInMap("ActivityEvent")
    public String activityEvent;

    @NameInMap("AppId")
    public String appId;

    @NameInMap("ChannelId")
    public String channelId;

    @NameInMap("Classification")
    public String classification;

    @NameInMap("DeliveryType")
    public Long deliveryType;

    @NameInMap("DismissalDate")
    public Long dismissalDate;

    @NameInMap("ExpiredSeconds")
    public Long expiredSeconds;

    @NameInMap("ExtendedParams")
    public String extendedParams;

    @NameInMap("MiChannelId")
    public String miChannelId;

    @NameInMap("NotifyType")
    public String notifyType;

    @NameInMap("PushAction")
    public Long pushAction;

    @NameInMap("Silent")
    public Long silent;

    @NameInMap("SmsSignName")
    public String smsSignName;

    @NameInMap("SmsStrategy")
    public Integer smsStrategy;

    @NameInMap("SmsTemplateCode")
    public String smsTemplateCode;

    @NameInMap("SmsTemplateParam")
    public String smsTemplateParam;

    @NameInMap("StrategyContent")
    public String strategyContent;

    @NameInMap("StrategyType")
    public Integer strategyType;

    @NameInMap("TargetMsgkey")
    public String targetMsgkey;

    @NameInMap("TaskName")
    public String taskName;

    @NameInMap("TemplateKeyValue")
    public String templateKeyValue;

    @NameInMap("TemplateName")
    public String templateName;

    @NameInMap("ThirdChannelCategory")
    public java.util.Map<String, ?> thirdChannelCategory;

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

    public PushTemplateRequest setSmsSignName(String smsSignName) {
        this.smsSignName = smsSignName;
        return this;
    }
    public String getSmsSignName() {
        return this.smsSignName;
    }

    public PushTemplateRequest setSmsStrategy(Integer smsStrategy) {
        this.smsStrategy = smsStrategy;
        return this;
    }
    public Integer getSmsStrategy() {
        return this.smsStrategy;
    }

    public PushTemplateRequest setSmsTemplateCode(String smsTemplateCode) {
        this.smsTemplateCode = smsTemplateCode;
        return this;
    }
    public String getSmsTemplateCode() {
        return this.smsTemplateCode;
    }

    public PushTemplateRequest setSmsTemplateParam(String smsTemplateParam) {
        this.smsTemplateParam = smsTemplateParam;
        return this;
    }
    public String getSmsTemplateParam() {
        return this.smsTemplateParam;
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

    public PushTemplateRequest setThirdChannelCategory(java.util.Map<String, ?> thirdChannelCategory) {
        this.thirdChannelCategory = thirdChannelCategory;
        return this;
    }
    public java.util.Map<String, ?> getThirdChannelCategory() {
        return this.thirdChannelCategory;
    }

    public PushTemplateRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
