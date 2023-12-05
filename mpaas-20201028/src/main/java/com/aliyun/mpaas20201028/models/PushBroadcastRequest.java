// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class PushBroadcastRequest extends TeaModel {
    @NameInMap("AndroidChannel")
    public Integer androidChannel;

    @NameInMap("AppId")
    public String appId;

    @NameInMap("BindPeriod")
    public Integer bindPeriod;

    @NameInMap("ChannelId")
    public String channelId;

    @NameInMap("Classification")
    public String classification;

    @NameInMap("DeliveryType")
    public Long deliveryType;

    @NameInMap("ExpiredSeconds")
    public Long expiredSeconds;

    @NameInMap("ExtendedParams")
    public String extendedParams;

    @NameInMap("MiChannelId")
    public String miChannelId;

    @NameInMap("Msgkey")
    public String msgkey;

    @NameInMap("NotifyType")
    public String notifyType;

    @NameInMap("PushAction")
    public Long pushAction;

    @NameInMap("PushStatus")
    public Long pushStatus;

    @NameInMap("Silent")
    public Long silent;

    @NameInMap("StrategyContent")
    public String strategyContent;

    @NameInMap("StrategyType")
    public Integer strategyType;

    @NameInMap("TaskName")
    public String taskName;

    @NameInMap("TemplateKeyValue")
    public String templateKeyValue;

    @NameInMap("TemplateName")
    public String templateName;

    @NameInMap("ThirdChannelCategory")
    public java.util.Map<String, ?> thirdChannelCategory;

    @NameInMap("UnBindPeriod")
    public Long unBindPeriod;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static PushBroadcastRequest build(java.util.Map<String, ?> map) throws Exception {
        PushBroadcastRequest self = new PushBroadcastRequest();
        return TeaModel.build(map, self);
    }

    public PushBroadcastRequest setAndroidChannel(Integer androidChannel) {
        this.androidChannel = androidChannel;
        return this;
    }
    public Integer getAndroidChannel() {
        return this.androidChannel;
    }

    public PushBroadcastRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public PushBroadcastRequest setBindPeriod(Integer bindPeriod) {
        this.bindPeriod = bindPeriod;
        return this;
    }
    public Integer getBindPeriod() {
        return this.bindPeriod;
    }

    public PushBroadcastRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public PushBroadcastRequest setClassification(String classification) {
        this.classification = classification;
        return this;
    }
    public String getClassification() {
        return this.classification;
    }

    public PushBroadcastRequest setDeliveryType(Long deliveryType) {
        this.deliveryType = deliveryType;
        return this;
    }
    public Long getDeliveryType() {
        return this.deliveryType;
    }

    public PushBroadcastRequest setExpiredSeconds(Long expiredSeconds) {
        this.expiredSeconds = expiredSeconds;
        return this;
    }
    public Long getExpiredSeconds() {
        return this.expiredSeconds;
    }

    public PushBroadcastRequest setExtendedParams(String extendedParams) {
        this.extendedParams = extendedParams;
        return this;
    }
    public String getExtendedParams() {
        return this.extendedParams;
    }

    public PushBroadcastRequest setMiChannelId(String miChannelId) {
        this.miChannelId = miChannelId;
        return this;
    }
    public String getMiChannelId() {
        return this.miChannelId;
    }

    public PushBroadcastRequest setMsgkey(String msgkey) {
        this.msgkey = msgkey;
        return this;
    }
    public String getMsgkey() {
        return this.msgkey;
    }

    public PushBroadcastRequest setNotifyType(String notifyType) {
        this.notifyType = notifyType;
        return this;
    }
    public String getNotifyType() {
        return this.notifyType;
    }

    public PushBroadcastRequest setPushAction(Long pushAction) {
        this.pushAction = pushAction;
        return this;
    }
    public Long getPushAction() {
        return this.pushAction;
    }

    public PushBroadcastRequest setPushStatus(Long pushStatus) {
        this.pushStatus = pushStatus;
        return this;
    }
    public Long getPushStatus() {
        return this.pushStatus;
    }

    public PushBroadcastRequest setSilent(Long silent) {
        this.silent = silent;
        return this;
    }
    public Long getSilent() {
        return this.silent;
    }

    public PushBroadcastRequest setStrategyContent(String strategyContent) {
        this.strategyContent = strategyContent;
        return this;
    }
    public String getStrategyContent() {
        return this.strategyContent;
    }

    public PushBroadcastRequest setStrategyType(Integer strategyType) {
        this.strategyType = strategyType;
        return this;
    }
    public Integer getStrategyType() {
        return this.strategyType;
    }

    public PushBroadcastRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

    public PushBroadcastRequest setTemplateKeyValue(String templateKeyValue) {
        this.templateKeyValue = templateKeyValue;
        return this;
    }
    public String getTemplateKeyValue() {
        return this.templateKeyValue;
    }

    public PushBroadcastRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public PushBroadcastRequest setThirdChannelCategory(java.util.Map<String, ?> thirdChannelCategory) {
        this.thirdChannelCategory = thirdChannelCategory;
        return this;
    }
    public java.util.Map<String, ?> getThirdChannelCategory() {
        return this.thirdChannelCategory;
    }

    public PushBroadcastRequest setUnBindPeriod(Long unBindPeriod) {
        this.unBindPeriod = unBindPeriod;
        return this;
    }
    public Long getUnBindPeriod() {
        return this.unBindPeriod;
    }

    public PushBroadcastRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
