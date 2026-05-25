// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emas_appmonitor20190611.models;

import com.aliyun.tea.*;

public class GetTlogDeviceInfoResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>500</p>
     */
    @NameInMap("ErrorCode")
    public Long errorCode;

    /**
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("Model")
    public GetTlogDeviceInfoResponseBodyModel model;

    /**
     * <strong>example:</strong>
     * <p>AB8AB5EC-9636-421D-AE7C-BB227DFC95B0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetTlogDeviceInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTlogDeviceInfoResponseBody self = new GetTlogDeviceInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTlogDeviceInfoResponseBody setErrorCode(Long errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Long getErrorCode() {
        return this.errorCode;
    }

    public GetTlogDeviceInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetTlogDeviceInfoResponseBody setModel(GetTlogDeviceInfoResponseBodyModel model) {
        this.model = model;
        return this;
    }
    public GetTlogDeviceInfoResponseBodyModel getModel() {
        return this.model;
    }

    public GetTlogDeviceInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTlogDeviceInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetTlogDeviceInfoResponseBodyModel extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AppBuild")
        public String appBuild;

        /**
         * <strong>example:</strong>
         * <p>1001@iphoneos</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>appKey</p>
         * 
         * <strong>example:</strong>
         * <p>1001</p>
         */
        @NameInMap("AppKey")
        public String appKey;

        /**
         * <strong>example:</strong>
         * <p>V20250224102631</p>
         */
        @NameInMap("AppVersion")
        public String appVersion;

        /**
         * <strong>example:</strong>
         * <p>Hinova</p>
         */
        @NameInMap("Brand")
        public String brand;

        /**
         * <strong>example:</strong>
         * <p>1739808000000</p>
         */
        @NameInMap("ClientTime")
        public Long clientTime;

        /**
         * <strong>example:</strong>
         * <p>ad-0001t9c1b6y48kqcd44s-105</p>
         */
        @NameInMap("DeviceId")
        public String deviceId;

        /**
         * <strong>example:</strong>
         * <p>ASUS_X00GD</p>
         */
        @NameInMap("DeviceModel")
        public String deviceModel;

        @NameInMap("Geo")
        public String geo;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>460049842500442</p>
         */
        @NameInMap("Imsi")
        public String imsi;

        /**
         * <strong>example:</strong>
         * <p>0:0:0:0:0:ffff:8ccd:be5</p>
         */
        @NameInMap("Ip")
        public String ip;

        /**
         * <strong>example:</strong>
         * <p>android</p>
         */
        @NameInMap("Os")
        public String os;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("OsVersion")
        public String osVersion;

        /**
         * <strong>example:</strong>
         * <p>1739808000000</p>
         */
        @NameInMap("ServerTime")
        public Long serverTime;

        /**
         * <strong>example:</strong>
         * <p>1739808000000</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        /**
         * <p>userId</p>
         * 
         * <strong>example:</strong>
         * <p>userId</p>
         */
        @NameInMap("UserId")
        public String userId;

        /**
         * <strong>example:</strong>
         * <p>userNick</p>
         */
        @NameInMap("UserName")
        public String userName;

        public static GetTlogDeviceInfoResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            GetTlogDeviceInfoResponseBodyModel self = new GetTlogDeviceInfoResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public GetTlogDeviceInfoResponseBodyModel setAppBuild(String appBuild) {
            this.appBuild = appBuild;
            return this;
        }
        public String getAppBuild() {
            return this.appBuild;
        }

        public GetTlogDeviceInfoResponseBodyModel setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public GetTlogDeviceInfoResponseBodyModel setAppKey(String appKey) {
            this.appKey = appKey;
            return this;
        }
        public String getAppKey() {
            return this.appKey;
        }

        public GetTlogDeviceInfoResponseBodyModel setAppVersion(String appVersion) {
            this.appVersion = appVersion;
            return this;
        }
        public String getAppVersion() {
            return this.appVersion;
        }

        public GetTlogDeviceInfoResponseBodyModel setBrand(String brand) {
            this.brand = brand;
            return this;
        }
        public String getBrand() {
            return this.brand;
        }

        public GetTlogDeviceInfoResponseBodyModel setClientTime(Long clientTime) {
            this.clientTime = clientTime;
            return this;
        }
        public Long getClientTime() {
            return this.clientTime;
        }

        public GetTlogDeviceInfoResponseBodyModel setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public GetTlogDeviceInfoResponseBodyModel setDeviceModel(String deviceModel) {
            this.deviceModel = deviceModel;
            return this;
        }
        public String getDeviceModel() {
            return this.deviceModel;
        }

        public GetTlogDeviceInfoResponseBodyModel setGeo(String geo) {
            this.geo = geo;
            return this;
        }
        public String getGeo() {
            return this.geo;
        }

        public GetTlogDeviceInfoResponseBodyModel setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetTlogDeviceInfoResponseBodyModel setImsi(String imsi) {
            this.imsi = imsi;
            return this;
        }
        public String getImsi() {
            return this.imsi;
        }

        public GetTlogDeviceInfoResponseBodyModel setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public GetTlogDeviceInfoResponseBodyModel setOs(String os) {
            this.os = os;
            return this;
        }
        public String getOs() {
            return this.os;
        }

        public GetTlogDeviceInfoResponseBodyModel setOsVersion(String osVersion) {
            this.osVersion = osVersion;
            return this;
        }
        public String getOsVersion() {
            return this.osVersion;
        }

        public GetTlogDeviceInfoResponseBodyModel setServerTime(Long serverTime) {
            this.serverTime = serverTime;
            return this;
        }
        public Long getServerTime() {
            return this.serverTime;
        }

        public GetTlogDeviceInfoResponseBodyModel setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public GetTlogDeviceInfoResponseBodyModel setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public GetTlogDeviceInfoResponseBodyModel setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

}
