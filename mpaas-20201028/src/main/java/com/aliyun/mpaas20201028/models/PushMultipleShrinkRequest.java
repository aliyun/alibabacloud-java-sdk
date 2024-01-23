// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class PushMultipleShrinkRequest extends TeaModel {
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

    @NameInMap("StrategyContent")
    public String strategyContent;

    @NameInMap("StrategyType")
    public Integer strategyType;

    @NameInMap("TargetMsg")
    public java.util.List<PushMultipleShrinkRequestTargetMsg> targetMsg;

    @NameInMap("TaskName")
    public String taskName;

    @NameInMap("TemplateName")
    public String templateName;

    @NameInMap("ThirdChannelCategory")
    public String thirdChannelCategoryShrink;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static PushMultipleShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        PushMultipleShrinkRequest self = new PushMultipleShrinkRequest();
        return TeaModel.build(map, self);
    }

    public PushMultipleShrinkRequest setActivityContentState(Object activityContentState) {
        this.activityContentState = activityContentState;
        return this;
    }
    public Object getActivityContentState() {
        return this.activityContentState;
    }

    public PushMultipleShrinkRequest setActivityEvent(String activityEvent) {
        this.activityEvent = activityEvent;
        return this;
    }
    public String getActivityEvent() {
        return this.activityEvent;
    }

    public PushMultipleShrinkRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public PushMultipleShrinkRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public PushMultipleShrinkRequest setClassification(String classification) {
        this.classification = classification;
        return this;
    }
    public String getClassification() {
        return this.classification;
    }

    public PushMultipleShrinkRequest setDeliveryType(Long deliveryType) {
        this.deliveryType = deliveryType;
        return this;
    }
    public Long getDeliveryType() {
        return this.deliveryType;
    }

    public PushMultipleShrinkRequest setDismissalDate(Long dismissalDate) {
        this.dismissalDate = dismissalDate;
        return this;
    }
    public Long getDismissalDate() {
        return this.dismissalDate;
    }

    public PushMultipleShrinkRequest setExpiredSeconds(Long expiredSeconds) {
        this.expiredSeconds = expiredSeconds;
        return this;
    }
    public Long getExpiredSeconds() {
        return this.expiredSeconds;
    }

    public PushMultipleShrinkRequest setExtendedParams(String extendedParams) {
        this.extendedParams = extendedParams;
        return this;
    }
    public String getExtendedParams() {
        return this.extendedParams;
    }

    public PushMultipleShrinkRequest setMiChannelId(String miChannelId) {
        this.miChannelId = miChannelId;
        return this;
    }
    public String getMiChannelId() {
        return this.miChannelId;
    }

    public PushMultipleShrinkRequest setNotifyType(String notifyType) {
        this.notifyType = notifyType;
        return this;
    }
    public String getNotifyType() {
        return this.notifyType;
    }

    public PushMultipleShrinkRequest setPushAction(Long pushAction) {
        this.pushAction = pushAction;
        return this;
    }
    public Long getPushAction() {
        return this.pushAction;
    }

    public PushMultipleShrinkRequest setSilent(Long silent) {
        this.silent = silent;
        return this;
    }
    public Long getSilent() {
        return this.silent;
    }

    public PushMultipleShrinkRequest setStrategyContent(String strategyContent) {
        this.strategyContent = strategyContent;
        return this;
    }
    public String getStrategyContent() {
        return this.strategyContent;
    }

    public PushMultipleShrinkRequest setStrategyType(Integer strategyType) {
        this.strategyType = strategyType;
        return this;
    }
    public Integer getStrategyType() {
        return this.strategyType;
    }

    public PushMultipleShrinkRequest setTargetMsg(java.util.List<PushMultipleShrinkRequestTargetMsg> targetMsg) {
        this.targetMsg = targetMsg;
        return this;
    }
    public java.util.List<PushMultipleShrinkRequestTargetMsg> getTargetMsg() {
        return this.targetMsg;
    }

    public PushMultipleShrinkRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

    public PushMultipleShrinkRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public PushMultipleShrinkRequest setThirdChannelCategoryShrink(String thirdChannelCategoryShrink) {
        this.thirdChannelCategoryShrink = thirdChannelCategoryShrink;
        return this;
    }
    public String getThirdChannelCategoryShrink() {
        return this.thirdChannelCategoryShrink;
    }

    public PushMultipleShrinkRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static class PushMultipleShrinkRequestTargetMsg extends TeaModel {
        @NameInMap("ExtendedParams")
        public String extendedParams;

        @NameInMap("MsgKey")
        public String msgKey;

        @NameInMap("Target")
        public String target;

        @NameInMap("TemplateKeyValue")
        public String templateKeyValue;

        public static PushMultipleShrinkRequestTargetMsg build(java.util.Map<String, ?> map) throws Exception {
            PushMultipleShrinkRequestTargetMsg self = new PushMultipleShrinkRequestTargetMsg();
            return TeaModel.build(map, self);
        }

        public PushMultipleShrinkRequestTargetMsg setExtendedParams(String extendedParams) {
            this.extendedParams = extendedParams;
            return this;
        }
        public String getExtendedParams() {
            return this.extendedParams;
        }

        public PushMultipleShrinkRequestTargetMsg setMsgKey(String msgKey) {
            this.msgKey = msgKey;
            return this;
        }
        public String getMsgKey() {
            return this.msgKey;
        }

        public PushMultipleShrinkRequestTargetMsg setTarget(String target) {
            this.target = target;
            return this;
        }
        public String getTarget() {
            return this.target;
        }

        public PushMultipleShrinkRequestTargetMsg setTemplateKeyValue(String templateKeyValue) {
            this.templateKeyValue = templateKeyValue;
            return this;
        }
        public String getTemplateKeyValue() {
            return this.templateKeyValue;
        }

    }

}
