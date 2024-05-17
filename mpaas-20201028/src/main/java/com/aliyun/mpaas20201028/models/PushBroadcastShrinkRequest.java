// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class PushBroadcastShrinkRequest extends TeaModel {
    @NameInMap("AndroidChannel")
    public Integer androidChannel;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AppId")
    public String appId;

    @NameInMap("BindPeriod")
    public Integer bindPeriod;

    @NameInMap("ChannelId")
    public String channelId;

    @NameInMap("Classification")
    public String classification;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DeliveryType")
    public Long deliveryType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ExpiredSeconds")
    public Long expiredSeconds;

    @NameInMap("ExtendedParams")
    public String extendedParams;

    @NameInMap("MiChannelId")
    public String miChannelId;

    /**
     * <p>This parameter is required.</p>
     */
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

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TemplateName")
    public String templateName;

    @NameInMap("ThirdChannelCategory")
    public String thirdChannelCategoryShrink;

    @NameInMap("UnBindPeriod")
    public Long unBindPeriod;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static PushBroadcastShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        PushBroadcastShrinkRequest self = new PushBroadcastShrinkRequest();
        return TeaModel.build(map, self);
    }

    public PushBroadcastShrinkRequest setAndroidChannel(Integer androidChannel) {
        this.androidChannel = androidChannel;
        return this;
    }
    public Integer getAndroidChannel() {
        return this.androidChannel;
    }

    public PushBroadcastShrinkRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public PushBroadcastShrinkRequest setBindPeriod(Integer bindPeriod) {
        this.bindPeriod = bindPeriod;
        return this;
    }
    public Integer getBindPeriod() {
        return this.bindPeriod;
    }

    public PushBroadcastShrinkRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public PushBroadcastShrinkRequest setClassification(String classification) {
        this.classification = classification;
        return this;
    }
    public String getClassification() {
        return this.classification;
    }

    public PushBroadcastShrinkRequest setDeliveryType(Long deliveryType) {
        this.deliveryType = deliveryType;
        return this;
    }
    public Long getDeliveryType() {
        return this.deliveryType;
    }

    public PushBroadcastShrinkRequest setExpiredSeconds(Long expiredSeconds) {
        this.expiredSeconds = expiredSeconds;
        return this;
    }
    public Long getExpiredSeconds() {
        return this.expiredSeconds;
    }

    public PushBroadcastShrinkRequest setExtendedParams(String extendedParams) {
        this.extendedParams = extendedParams;
        return this;
    }
    public String getExtendedParams() {
        return this.extendedParams;
    }

    public PushBroadcastShrinkRequest setMiChannelId(String miChannelId) {
        this.miChannelId = miChannelId;
        return this;
    }
    public String getMiChannelId() {
        return this.miChannelId;
    }

    public PushBroadcastShrinkRequest setMsgkey(String msgkey) {
        this.msgkey = msgkey;
        return this;
    }
    public String getMsgkey() {
        return this.msgkey;
    }

    public PushBroadcastShrinkRequest setNotifyType(String notifyType) {
        this.notifyType = notifyType;
        return this;
    }
    public String getNotifyType() {
        return this.notifyType;
    }

    public PushBroadcastShrinkRequest setPushAction(Long pushAction) {
        this.pushAction = pushAction;
        return this;
    }
    public Long getPushAction() {
        return this.pushAction;
    }

    public PushBroadcastShrinkRequest setPushStatus(Long pushStatus) {
        this.pushStatus = pushStatus;
        return this;
    }
    public Long getPushStatus() {
        return this.pushStatus;
    }

    public PushBroadcastShrinkRequest setSilent(Long silent) {
        this.silent = silent;
        return this;
    }
    public Long getSilent() {
        return this.silent;
    }

    public PushBroadcastShrinkRequest setStrategyContent(String strategyContent) {
        this.strategyContent = strategyContent;
        return this;
    }
    public String getStrategyContent() {
        return this.strategyContent;
    }

    public PushBroadcastShrinkRequest setStrategyType(Integer strategyType) {
        this.strategyType = strategyType;
        return this;
    }
    public Integer getStrategyType() {
        return this.strategyType;
    }

    public PushBroadcastShrinkRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

    public PushBroadcastShrinkRequest setTemplateKeyValue(String templateKeyValue) {
        this.templateKeyValue = templateKeyValue;
        return this;
    }
    public String getTemplateKeyValue() {
        return this.templateKeyValue;
    }

    public PushBroadcastShrinkRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public PushBroadcastShrinkRequest setThirdChannelCategoryShrink(String thirdChannelCategoryShrink) {
        this.thirdChannelCategoryShrink = thirdChannelCategoryShrink;
        return this;
    }
    public String getThirdChannelCategoryShrink() {
        return this.thirdChannelCategoryShrink;
    }

    public PushBroadcastShrinkRequest setUnBindPeriod(Long unBindPeriod) {
        this.unBindPeriod = unBindPeriod;
        return this;
    }
    public Long getUnBindPeriod() {
        return this.unBindPeriod;
    }

    public PushBroadcastShrinkRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
