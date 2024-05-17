// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class PushReportRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AppId")
    public String appId;

    @NameInMap("AppVersion")
    public String appVersion;

    @NameInMap("Channel")
    public String channel;

    @NameInMap("ConnectType")
    public String connectType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DeliveryToken")
    public String deliveryToken;

    @NameInMap("Imei")
    public String imei;

    @NameInMap("Imsi")
    public String imsi;

    @NameInMap("Model")
    public String model;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("OsType")
    public Integer osType;

    @NameInMap("PushVersion")
    public String pushVersion;

    @NameInMap("ThirdChannel")
    public Integer thirdChannel;

    @NameInMap("ThirdChannelDeviceToken")
    public String thirdChannelDeviceToken;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static PushReportRequest build(java.util.Map<String, ?> map) throws Exception {
        PushReportRequest self = new PushReportRequest();
        return TeaModel.build(map, self);
    }

    public PushReportRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public PushReportRequest setAppVersion(String appVersion) {
        this.appVersion = appVersion;
        return this;
    }
    public String getAppVersion() {
        return this.appVersion;
    }

    public PushReportRequest setChannel(String channel) {
        this.channel = channel;
        return this;
    }
    public String getChannel() {
        return this.channel;
    }

    public PushReportRequest setConnectType(String connectType) {
        this.connectType = connectType;
        return this;
    }
    public String getConnectType() {
        return this.connectType;
    }

    public PushReportRequest setDeliveryToken(String deliveryToken) {
        this.deliveryToken = deliveryToken;
        return this;
    }
    public String getDeliveryToken() {
        return this.deliveryToken;
    }

    public PushReportRequest setImei(String imei) {
        this.imei = imei;
        return this;
    }
    public String getImei() {
        return this.imei;
    }

    public PushReportRequest setImsi(String imsi) {
        this.imsi = imsi;
        return this;
    }
    public String getImsi() {
        return this.imsi;
    }

    public PushReportRequest setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public PushReportRequest setOsType(Integer osType) {
        this.osType = osType;
        return this;
    }
    public Integer getOsType() {
        return this.osType;
    }

    public PushReportRequest setPushVersion(String pushVersion) {
        this.pushVersion = pushVersion;
        return this;
    }
    public String getPushVersion() {
        return this.pushVersion;
    }

    public PushReportRequest setThirdChannel(Integer thirdChannel) {
        this.thirdChannel = thirdChannel;
        return this;
    }
    public Integer getThirdChannel() {
        return this.thirdChannel;
    }

    public PushReportRequest setThirdChannelDeviceToken(String thirdChannelDeviceToken) {
        this.thirdChannelDeviceToken = thirdChannelDeviceToken;
        return this;
    }
    public String getThirdChannelDeviceToken() {
        return this.thirdChannelDeviceToken;
    }

    public PushReportRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
