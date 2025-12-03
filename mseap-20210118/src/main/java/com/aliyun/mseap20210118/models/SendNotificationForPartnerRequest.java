// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mseap20210118.models;

import com.aliyun.tea.*;

public class SendNotificationForPartnerRequest extends TeaModel {
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
    public java.util.Map<String, String> paramMap;

    /**
     * <strong>example:</strong>
     * <p>12312212312</p>
     */
    @NameInMap("SendTarget")
    public String sendTarget;

    @NameInMap("SmartSubChannels")
    public java.util.List<String> smartSubChannels;

    /**
     * <strong>example:</strong>
     * <p>5b29647n-a172-4ccd-ba33-73669896c287</p>
     */
    @NameInMap("TrackId")
    public String trackId;

    public static SendNotificationForPartnerRequest build(java.util.Map<String, ?> map) throws Exception {
        SendNotificationForPartnerRequest self = new SendNotificationForPartnerRequest();
        return TeaModel.build(map, self);
    }

    public SendNotificationForPartnerRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public SendNotificationForPartnerRequest setChannelType(String channelType) {
        this.channelType = channelType;
        return this;
    }
    public String getChannelType() {
        return this.channelType;
    }

    public SendNotificationForPartnerRequest setNotifyType(String notifyType) {
        this.notifyType = notifyType;
        return this;
    }
    public String getNotifyType() {
        return this.notifyType;
    }

    public SendNotificationForPartnerRequest setNotifycationEventType(String notifycationEventType) {
        this.notifycationEventType = notifycationEventType;
        return this;
    }
    public String getNotifycationEventType() {
        return this.notifycationEventType;
    }

    public SendNotificationForPartnerRequest setParamMap(java.util.Map<String, String> paramMap) {
        this.paramMap = paramMap;
        return this;
    }
    public java.util.Map<String, String> getParamMap() {
        return this.paramMap;
    }

    public SendNotificationForPartnerRequest setSendTarget(String sendTarget) {
        this.sendTarget = sendTarget;
        return this;
    }
    public String getSendTarget() {
        return this.sendTarget;
    }

    public SendNotificationForPartnerRequest setSmartSubChannels(java.util.List<String> smartSubChannels) {
        this.smartSubChannels = smartSubChannels;
        return this;
    }
    public java.util.List<String> getSmartSubChannels() {
        return this.smartSubChannels;
    }

    public SendNotificationForPartnerRequest setTrackId(String trackId) {
        this.trackId = trackId;
        return this;
    }
    public String getTrackId() {
        return this.trackId;
    }

}
