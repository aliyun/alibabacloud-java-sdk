// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class PushSimpleRequest extends TeaModel {
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

    @NameInMap("ThirdChannelCategory")
    public java.util.Map<String, ?> thirdChannelCategory;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Title")
    public String title;

    @NameInMap("Uri")
    public String uri;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static PushSimpleRequest build(java.util.Map<String, ?> map) throws Exception {
        PushSimpleRequest self = new PushSimpleRequest();
        return TeaModel.build(map, self);
    }

    public PushSimpleRequest setActivityContentState(Object activityContentState) {
        this.activityContentState = activityContentState;
        return this;
    }
    public Object getActivityContentState() {
        return this.activityContentState;
    }

    public PushSimpleRequest setActivityEvent(String activityEvent) {
        this.activityEvent = activityEvent;
        return this;
    }
    public String getActivityEvent() {
        return this.activityEvent;
    }

    public PushSimpleRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public PushSimpleRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public PushSimpleRequest setClassification(String classification) {
        this.classification = classification;
        return this;
    }
    public String getClassification() {
        return this.classification;
    }

    public PushSimpleRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public PushSimpleRequest setDeliveryType(Long deliveryType) {
        this.deliveryType = deliveryType;
        return this;
    }
    public Long getDeliveryType() {
        return this.deliveryType;
    }

    public PushSimpleRequest setDismissalDate(Long dismissalDate) {
        this.dismissalDate = dismissalDate;
        return this;
    }
    public Long getDismissalDate() {
        return this.dismissalDate;
    }

    public PushSimpleRequest setExpiredSeconds(Long expiredSeconds) {
        this.expiredSeconds = expiredSeconds;
        return this;
    }
    public Long getExpiredSeconds() {
        return this.expiredSeconds;
    }

    public PushSimpleRequest setExtendedParams(String extendedParams) {
        this.extendedParams = extendedParams;
        return this;
    }
    public String getExtendedParams() {
        return this.extendedParams;
    }

    public PushSimpleRequest setIconUrls(String iconUrls) {
        this.iconUrls = iconUrls;
        return this;
    }
    public String getIconUrls() {
        return this.iconUrls;
    }

    public PushSimpleRequest setImageUrls(String imageUrls) {
        this.imageUrls = imageUrls;
        return this;
    }
    public String getImageUrls() {
        return this.imageUrls;
    }

    public PushSimpleRequest setMiChannelId(String miChannelId) {
        this.miChannelId = miChannelId;
        return this;
    }
    public String getMiChannelId() {
        return this.miChannelId;
    }

    public PushSimpleRequest setNotifyType(String notifyType) {
        this.notifyType = notifyType;
        return this;
    }
    public String getNotifyType() {
        return this.notifyType;
    }

    public PushSimpleRequest setPushAction(Long pushAction) {
        this.pushAction = pushAction;
        return this;
    }
    public Long getPushAction() {
        return this.pushAction;
    }

    public PushSimpleRequest setPushStyle(Integer pushStyle) {
        this.pushStyle = pushStyle;
        return this;
    }
    public Integer getPushStyle() {
        return this.pushStyle;
    }

    public PushSimpleRequest setSilent(Long silent) {
        this.silent = silent;
        return this;
    }
    public Long getSilent() {
        return this.silent;
    }

    public PushSimpleRequest setSmsSignName(String smsSignName) {
        this.smsSignName = smsSignName;
        return this;
    }
    public String getSmsSignName() {
        return this.smsSignName;
    }

    public PushSimpleRequest setSmsStrategy(Integer smsStrategy) {
        this.smsStrategy = smsStrategy;
        return this;
    }
    public Integer getSmsStrategy() {
        return this.smsStrategy;
    }

    public PushSimpleRequest setSmsTemplateCode(String smsTemplateCode) {
        this.smsTemplateCode = smsTemplateCode;
        return this;
    }
    public String getSmsTemplateCode() {
        return this.smsTemplateCode;
    }

    public PushSimpleRequest setSmsTemplateParam(String smsTemplateParam) {
        this.smsTemplateParam = smsTemplateParam;
        return this;
    }
    public String getSmsTemplateParam() {
        return this.smsTemplateParam;
    }

    public PushSimpleRequest setStrategyContent(String strategyContent) {
        this.strategyContent = strategyContent;
        return this;
    }
    public String getStrategyContent() {
        return this.strategyContent;
    }

    public PushSimpleRequest setStrategyType(Integer strategyType) {
        this.strategyType = strategyType;
        return this;
    }
    public Integer getStrategyType() {
        return this.strategyType;
    }

    public PushSimpleRequest setTargetMsgkey(String targetMsgkey) {
        this.targetMsgkey = targetMsgkey;
        return this;
    }
    public String getTargetMsgkey() {
        return this.targetMsgkey;
    }

    public PushSimpleRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

    public PushSimpleRequest setThirdChannelCategory(java.util.Map<String, ?> thirdChannelCategory) {
        this.thirdChannelCategory = thirdChannelCategory;
        return this;
    }
    public java.util.Map<String, ?> getThirdChannelCategory() {
        return this.thirdChannelCategory;
    }

    public PushSimpleRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public PushSimpleRequest setUri(String uri) {
        this.uri = uri;
        return this;
    }
    public String getUri() {
        return this.uri;
    }

    public PushSimpleRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
