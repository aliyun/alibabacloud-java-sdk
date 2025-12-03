// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mseap20210118.models;

import com.aliyun.tea.*;

public class SendNotificationForPartnerShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>DMP</p>
     */
    @NameInMap("BizId")
    public String bizId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ChannelType")
    public String channelType;

    /**
     * <strong>example:</strong>
     * <p>MESSAGE</p>
     */
    @NameInMap("NotifyType")
    public String notifyType;

    /**
     * <strong>example:</strong>
     * <p>dmp_website_xxx</p>
     */
    @NameInMap("NotifycationEventType")
    public String notifycationEventType;

    @NameInMap("ParamMap")
    public String paramMapShrink;

    /**
     * <strong>example:</strong>
     * <p>12312212312</p>
     */
    @NameInMap("SendTarget")
    public String sendTarget;

    @NameInMap("SmartSubChannels")
    public String smartSubChannelsShrink;

    /**
     * <strong>example:</strong>
     * <p>5b29647n-a172-4ccd-ba33-73669896c287</p>
     */
    @NameInMap("TrackId")
    public String trackId;

    public static SendNotificationForPartnerShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SendNotificationForPartnerShrinkRequest self = new SendNotificationForPartnerShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SendNotificationForPartnerShrinkRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public SendNotificationForPartnerShrinkRequest setChannelType(String channelType) {
        this.channelType = channelType;
        return this;
    }
    public String getChannelType() {
        return this.channelType;
    }

    public SendNotificationForPartnerShrinkRequest setNotifyType(String notifyType) {
        this.notifyType = notifyType;
        return this;
    }
    public String getNotifyType() {
        return this.notifyType;
    }

    public SendNotificationForPartnerShrinkRequest setNotifycationEventType(String notifycationEventType) {
        this.notifycationEventType = notifycationEventType;
        return this;
    }
    public String getNotifycationEventType() {
        return this.notifycationEventType;
    }

    public SendNotificationForPartnerShrinkRequest setParamMapShrink(String paramMapShrink) {
        this.paramMapShrink = paramMapShrink;
        return this;
    }
    public String getParamMapShrink() {
        return this.paramMapShrink;
    }

    public SendNotificationForPartnerShrinkRequest setSendTarget(String sendTarget) {
        this.sendTarget = sendTarget;
        return this;
    }
    public String getSendTarget() {
        return this.sendTarget;
    }

    public SendNotificationForPartnerShrinkRequest setSmartSubChannelsShrink(String smartSubChannelsShrink) {
        this.smartSubChannelsShrink = smartSubChannelsShrink;
        return this;
    }
    public String getSmartSubChannelsShrink() {
        return this.smartSubChannelsShrink;
    }

    public SendNotificationForPartnerShrinkRequest setTrackId(String trackId) {
        this.trackId = trackId;
        return this;
    }
    public String getTrackId() {
        return this.trackId;
    }

}
