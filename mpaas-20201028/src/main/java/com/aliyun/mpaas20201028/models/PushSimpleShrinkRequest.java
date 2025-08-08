// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class PushSimpleShrinkRequest extends TeaModel {
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
    @NameInMap("Content")
    public String content;

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

    @NameInMap("IconUrls")
    public String iconUrls;

    @NameInMap("ImageUrls")
    public String imageUrls;

    @NameInMap("MiChannelId")
    public String miChannelId;

    @NameInMap("NotifyType")
    public String notifyType;

    @NameInMap("PushAction")
    public Long pushAction;

    @NameInMap("PushStyle")
    public Integer pushStyle;

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

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TargetMsgkey")
    public String targetMsgkey;

    @NameInMap("TaskName")
    public String taskName;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("ThirdChannelCategory")
    public String thirdChannelCategoryShrink;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Title")
    public String title;

    @NameInMap("TransparentMessagePayload")
    public Object transparentMessagePayload;

    @NameInMap("TransparentMessageUrgency")
    public String transparentMessageUrgency;

    @NameInMap("Uri")
    public String uri;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static PushSimpleShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        PushSimpleShrinkRequest self = new PushSimpleShrinkRequest();
        return TeaModel.build(map, self);
    }

    public PushSimpleShrinkRequest setActivityContentState(Object activityContentState) {
        this.activityContentState = activityContentState;
        return this;
    }
    public Object getActivityContentState() {
        return this.activityContentState;
    }

    public PushSimpleShrinkRequest setActivityEvent(String activityEvent) {
        this.activityEvent = activityEvent;
        return this;
    }
    public String getActivityEvent() {
        return this.activityEvent;
    }

    public PushSimpleShrinkRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public PushSimpleShrinkRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public PushSimpleShrinkRequest setClassification(String classification) {
        this.classification = classification;
        return this;
    }
    public String getClassification() {
        return this.classification;
    }

    public PushSimpleShrinkRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public PushSimpleShrinkRequest setDeliveryType(Long deliveryType) {
        this.deliveryType = deliveryType;
        return this;
    }
    public Long getDeliveryType() {
        return this.deliveryType;
    }

    public PushSimpleShrinkRequest setDismissalDate(Long dismissalDate) {
        this.dismissalDate = dismissalDate;
        return this;
    }
    public Long getDismissalDate() {
        return this.dismissalDate;
    }

    public PushSimpleShrinkRequest setExpiredSeconds(Long expiredSeconds) {
        this.expiredSeconds = expiredSeconds;
        return this;
    }
    public Long getExpiredSeconds() {
        return this.expiredSeconds;
    }

    public PushSimpleShrinkRequest setExtendedParams(String extendedParams) {
        this.extendedParams = extendedParams;
        return this;
    }
    public String getExtendedParams() {
        return this.extendedParams;
    }

    public PushSimpleShrinkRequest setIconUrls(String iconUrls) {
        this.iconUrls = iconUrls;
        return this;
    }
    public String getIconUrls() {
        return this.iconUrls;
    }

    public PushSimpleShrinkRequest setImageUrls(String imageUrls) {
        this.imageUrls = imageUrls;
        return this;
    }
    public String getImageUrls() {
        return this.imageUrls;
    }

    public PushSimpleShrinkRequest setMiChannelId(String miChannelId) {
        this.miChannelId = miChannelId;
        return this;
    }
    public String getMiChannelId() {
        return this.miChannelId;
    }

    public PushSimpleShrinkRequest setNotifyType(String notifyType) {
        this.notifyType = notifyType;
        return this;
    }
    public String getNotifyType() {
        return this.notifyType;
    }

    public PushSimpleShrinkRequest setPushAction(Long pushAction) {
        this.pushAction = pushAction;
        return this;
    }
    public Long getPushAction() {
        return this.pushAction;
    }

    public PushSimpleShrinkRequest setPushStyle(Integer pushStyle) {
        this.pushStyle = pushStyle;
        return this;
    }
    public Integer getPushStyle() {
        return this.pushStyle;
    }

    public PushSimpleShrinkRequest setSilent(Long silent) {
        this.silent = silent;
        return this;
    }
    public Long getSilent() {
        return this.silent;
    }

    public PushSimpleShrinkRequest setSmsSignName(String smsSignName) {
        this.smsSignName = smsSignName;
        return this;
    }
    public String getSmsSignName() {
        return this.smsSignName;
    }

    public PushSimpleShrinkRequest setSmsStrategy(Integer smsStrategy) {
        this.smsStrategy = smsStrategy;
        return this;
    }
    public Integer getSmsStrategy() {
        return this.smsStrategy;
    }

    public PushSimpleShrinkRequest setSmsTemplateCode(String smsTemplateCode) {
        this.smsTemplateCode = smsTemplateCode;
        return this;
    }
    public String getSmsTemplateCode() {
        return this.smsTemplateCode;
    }

    public PushSimpleShrinkRequest setSmsTemplateParam(String smsTemplateParam) {
        this.smsTemplateParam = smsTemplateParam;
        return this;
    }
    public String getSmsTemplateParam() {
        return this.smsTemplateParam;
    }

    public PushSimpleShrinkRequest setStrategyContent(String strategyContent) {
        this.strategyContent = strategyContent;
        return this;
    }
    public String getStrategyContent() {
        return this.strategyContent;
    }

    public PushSimpleShrinkRequest setStrategyType(Integer strategyType) {
        this.strategyType = strategyType;
        return this;
    }
    public Integer getStrategyType() {
        return this.strategyType;
    }

    public PushSimpleShrinkRequest setTargetMsgkey(String targetMsgkey) {
        this.targetMsgkey = targetMsgkey;
        return this;
    }
    public String getTargetMsgkey() {
        return this.targetMsgkey;
    }

    public PushSimpleShrinkRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

    public PushSimpleShrinkRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public PushSimpleShrinkRequest setThirdChannelCategoryShrink(String thirdChannelCategoryShrink) {
        this.thirdChannelCategoryShrink = thirdChannelCategoryShrink;
        return this;
    }
    public String getThirdChannelCategoryShrink() {
        return this.thirdChannelCategoryShrink;
    }

    public PushSimpleShrinkRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public PushSimpleShrinkRequest setTransparentMessagePayload(Object transparentMessagePayload) {
        this.transparentMessagePayload = transparentMessagePayload;
        return this;
    }
    public Object getTransparentMessagePayload() {
        return this.transparentMessagePayload;
    }

    public PushSimpleShrinkRequest setTransparentMessageUrgency(String transparentMessageUrgency) {
        this.transparentMessageUrgency = transparentMessageUrgency;
        return this;
    }
    public String getTransparentMessageUrgency() {
        return this.transparentMessageUrgency;
    }

    public PushSimpleShrinkRequest setUri(String uri) {
        this.uri = uri;
        return this;
    }
    public String getUri() {
        return this.uri;
    }

    public PushSimpleShrinkRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
