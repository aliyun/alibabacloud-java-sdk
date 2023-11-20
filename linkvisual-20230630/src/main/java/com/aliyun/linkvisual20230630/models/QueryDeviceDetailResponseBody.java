// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20230630.models;

import com.aliyun.tea.*;

public class QueryDeviceDetailResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryDeviceDetailResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryDeviceDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceDetailResponseBody self = new QueryDeviceDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDeviceDetailResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryDeviceDetailResponseBody setData(QueryDeviceDetailResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryDeviceDetailResponseBodyData getData() {
        return this.data;
    }

    public QueryDeviceDetailResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryDeviceDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDeviceDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryDeviceDetailResponseBodyData extends TeaModel {
        @NameInMap("ActiveTime")
        public Long activeTime;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("DeviceName")
        public String deviceName;

        @NameInMap("DeviceSecret")
        public String deviceSecret;

        @NameInMap("FirmwareVersion")
        public String firmwareVersion;

        @NameInMap("IotId")
        public String iotId;

        @NameInMap("IpAddress")
        public String ipAddress;

        @NameInMap("Nickname")
        public String nickname;

        @NameInMap("NodeType")
        public Integer nodeType;

        @NameInMap("OnlineTime")
        public Long onlineTime;

        @NameInMap("ProductKey")
        public String productKey;

        @NameInMap("ProductName")
        public String productName;

        @NameInMap("Region")
        public String region;

        @NameInMap("Status")
        public String status;

        public static QueryDeviceDetailResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceDetailResponseBodyData self = new QueryDeviceDetailResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryDeviceDetailResponseBodyData setActiveTime(Long activeTime) {
            this.activeTime = activeTime;
            return this;
        }
        public Long getActiveTime() {
            return this.activeTime;
        }

        public QueryDeviceDetailResponseBodyData setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public QueryDeviceDetailResponseBodyData setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public QueryDeviceDetailResponseBodyData setDeviceSecret(String deviceSecret) {
            this.deviceSecret = deviceSecret;
            return this;
        }
        public String getDeviceSecret() {
            return this.deviceSecret;
        }

        public QueryDeviceDetailResponseBodyData setFirmwareVersion(String firmwareVersion) {
            this.firmwareVersion = firmwareVersion;
            return this;
        }
        public String getFirmwareVersion() {
            return this.firmwareVersion;
        }

        public QueryDeviceDetailResponseBodyData setIotId(String iotId) {
            this.iotId = iotId;
            return this;
        }
        public String getIotId() {
            return this.iotId;
        }

        public QueryDeviceDetailResponseBodyData setIpAddress(String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public String getIpAddress() {
            return this.ipAddress;
        }

        public QueryDeviceDetailResponseBodyData setNickname(String nickname) {
            this.nickname = nickname;
            return this;
        }
        public String getNickname() {
            return this.nickname;
        }

        public QueryDeviceDetailResponseBodyData setNodeType(Integer nodeType) {
            this.nodeType = nodeType;
            return this;
        }
        public Integer getNodeType() {
            return this.nodeType;
        }

        public QueryDeviceDetailResponseBodyData setOnlineTime(Long onlineTime) {
            this.onlineTime = onlineTime;
            return this;
        }
        public Long getOnlineTime() {
            return this.onlineTime;
        }

        public QueryDeviceDetailResponseBodyData setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
        }

        public QueryDeviceDetailResponseBodyData setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public QueryDeviceDetailResponseBodyData setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public QueryDeviceDetailResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
