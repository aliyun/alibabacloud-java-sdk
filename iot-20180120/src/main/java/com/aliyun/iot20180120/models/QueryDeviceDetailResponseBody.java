// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceDetailResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Code")
    public String code;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Data")
    public QueryDeviceDetailResponseBodyData data;

    public static QueryDeviceDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceDetailResponseBody self = new QueryDeviceDetailResponseBody();
        return TeaModel.build(map, self);
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

    public QueryDeviceDetailResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryDeviceDetailResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryDeviceDetailResponseBody setData(QueryDeviceDetailResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryDeviceDetailResponseBodyData getData() {
        return this.data;
    }

    public static class BatchQueryDeviceDetailResponseBodyDataData extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("UtcActive")
        public String utcActive;

        @NameInMap("ProductName")
        public String productName;

        @NameInMap("DeviceName")
        public String deviceName;

        @NameInMap("FirmwareVersion")
        public String firmwareVersion;

        @NameInMap("UtcCreate")
        public String utcCreate;

        @NameInMap("ProductKey")
        public String productKey;

        @NameInMap("NodeType")
        public Integer nodeType;

        @NameInMap("Region")
        public String region;

        @NameInMap("DeviceSecret")
        public String deviceSecret;

        @NameInMap("GmtActive")
        public String gmtActive;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("Nickname")
        public String nickname;

        @NameInMap("IotId")
        public String iotId;

        public static BatchQueryDeviceDetailResponseBodyDataData build(java.util.Map<String, ?> map) throws Exception {
            BatchQueryDeviceDetailResponseBodyDataData self = new BatchQueryDeviceDetailResponseBodyDataData();
            return TeaModel.build(map, self);
        }

        public BatchQueryDeviceDetailResponseBodyDataData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public BatchQueryDeviceDetailResponseBodyDataData setUtcActive(String utcActive) {
            this.utcActive = utcActive;
            return this;
        }
        public String getUtcActive() {
            return this.utcActive;
        }

        public BatchQueryDeviceDetailResponseBodyDataData setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public BatchQueryDeviceDetailResponseBodyDataData setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public BatchQueryDeviceDetailResponseBodyDataData setFirmwareVersion(String firmwareVersion) {
            this.firmwareVersion = firmwareVersion;
            return this;
        }
        public String getFirmwareVersion() {
            return this.firmwareVersion;
        }

        public BatchQueryDeviceDetailResponseBodyDataData setUtcCreate(String utcCreate) {
            this.utcCreate = utcCreate;
            return this;
        }
        public String getUtcCreate() {
            return this.utcCreate;
        }

        public BatchQueryDeviceDetailResponseBodyDataData setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
        }

        public BatchQueryDeviceDetailResponseBodyDataData setNodeType(Integer nodeType) {
            this.nodeType = nodeType;
            return this;
        }
        public Integer getNodeType() {
            return this.nodeType;
        }

        public BatchQueryDeviceDetailResponseBodyDataData setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public BatchQueryDeviceDetailResponseBodyDataData setDeviceSecret(String deviceSecret) {
            this.deviceSecret = deviceSecret;
            return this;
        }
        public String getDeviceSecret() {
            return this.deviceSecret;
        }

        public BatchQueryDeviceDetailResponseBodyDataData setGmtActive(String gmtActive) {
            this.gmtActive = gmtActive;
            return this;
        }
        public String getGmtActive() {
            return this.gmtActive;
        }

        public BatchQueryDeviceDetailResponseBodyDataData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public BatchQueryDeviceDetailResponseBodyDataData setNickname(String nickname) {
            this.nickname = nickname;
            return this;
        }
        public String getNickname() {
            return this.nickname;
        }

        public BatchQueryDeviceDetailResponseBodyDataData setIotId(String iotId) {
            this.iotId = iotId;
            return this;
        }
        public String getIotId() {
            return this.iotId;
        }

    }

    public static class BatchQueryDeviceDetailResponseBodyData extends TeaModel {
        @NameInMap("Data")
        public java.util.List<BatchQueryDeviceDetailResponseBodyDataData> data;

        public static BatchQueryDeviceDetailResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            BatchQueryDeviceDetailResponseBodyData self = new BatchQueryDeviceDetailResponseBodyData();
            return TeaModel.build(map, self);
        }

        public BatchQueryDeviceDetailResponseBodyData setData(java.util.List<BatchQueryDeviceDetailResponseBodyDataData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<BatchQueryDeviceDetailResponseBodyDataData> getData() {
            return this.data;
        }

    }

    public static class QueryDeviceDetailResponseBodyData extends TeaModel {
        @NameInMap("IotId")
        public String iotId;

        @NameInMap("ProductKey")
        public String productKey;

        @NameInMap("ProductName")
        public String productName;

        @NameInMap("DeviceName")
        public String deviceName;

        @NameInMap("DeviceSecret")
        public String deviceSecret;

        @NameInMap("FirmwareVersion")
        public String firmwareVersion;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("UtcCreate")
        public String utcCreate;

        @NameInMap("GmtActive")
        public String gmtActive;

        @NameInMap("UtcActive")
        public String utcActive;

        @NameInMap("GmtOnline")
        public String gmtOnline;

        @NameInMap("UtcOnline")
        public String utcOnline;

        @NameInMap("Status")
        public String status;

        @NameInMap("IpAddress")
        public String ipAddress;

        @NameInMap("NodeType")
        public Integer nodeType;

        @NameInMap("Region")
        public String region;

        @NameInMap("Owner")
        public Boolean owner;

        @NameInMap("Nickname")
        public String nickname;

        public static QueryDeviceDetailResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceDetailResponseBodyData self = new QueryDeviceDetailResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryDeviceDetailResponseBodyData setIotId(String iotId) {
            this.iotId = iotId;
            return this;
        }
        public String getIotId() {
            return this.iotId;
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

        public QueryDeviceDetailResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public QueryDeviceDetailResponseBodyData setUtcCreate(String utcCreate) {
            this.utcCreate = utcCreate;
            return this;
        }
        public String getUtcCreate() {
            return this.utcCreate;
        }

        public QueryDeviceDetailResponseBodyData setGmtActive(String gmtActive) {
            this.gmtActive = gmtActive;
            return this;
        }
        public String getGmtActive() {
            return this.gmtActive;
        }

        public QueryDeviceDetailResponseBodyData setUtcActive(String utcActive) {
            this.utcActive = utcActive;
            return this;
        }
        public String getUtcActive() {
            return this.utcActive;
        }

        public QueryDeviceDetailResponseBodyData setGmtOnline(String gmtOnline) {
            this.gmtOnline = gmtOnline;
            return this;
        }
        public String getGmtOnline() {
            return this.gmtOnline;
        }

        public QueryDeviceDetailResponseBodyData setUtcOnline(String utcOnline) {
            this.utcOnline = utcOnline;
            return this;
        }
        public String getUtcOnline() {
            return this.utcOnline;
        }

        public QueryDeviceDetailResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryDeviceDetailResponseBodyData setIpAddress(String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public String getIpAddress() {
            return this.ipAddress;
        }

        public QueryDeviceDetailResponseBodyData setNodeType(Integer nodeType) {
            this.nodeType = nodeType;
            return this;
        }
        public Integer getNodeType() {
            return this.nodeType;
        }

        public QueryDeviceDetailResponseBodyData setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public QueryDeviceDetailResponseBodyData setOwner(Boolean owner) {
            this.owner = owner;
            return this;
        }
        public Boolean getOwner() {
            return this.owner;
        }

        public QueryDeviceDetailResponseBodyData setNickname(String nickname) {
            this.nickname = nickname;
            return this;
        }
        public String getNickname() {
            return this.nickname;
        }

    }

}
