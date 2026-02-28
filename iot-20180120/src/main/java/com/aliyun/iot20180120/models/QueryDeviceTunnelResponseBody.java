// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceTunnelResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryDeviceTunnelResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryDeviceTunnelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceTunnelResponseBody self = new QueryDeviceTunnelResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDeviceTunnelResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryDeviceTunnelResponseBody setData(QueryDeviceTunnelResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryDeviceTunnelResponseBodyData getData() {
        return this.data;
    }

    public QueryDeviceTunnelResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryDeviceTunnelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDeviceTunnelResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryDeviceTunnelResponseBodyData extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("DeviceConnState")
        public String deviceConnState;

        @NameInMap("DeviceName")
        public String deviceName;

        @NameInMap("IotId")
        public String iotId;

        @NameInMap("ProductKey")
        public String productKey;

        @NameInMap("ProductName")
        public String productName;

        @NameInMap("SourceConnState")
        public String sourceConnState;

        @NameInMap("TunnelId")
        public String tunnelId;

        @NameInMap("TunnelState")
        public String tunnelState;

        @NameInMap("Udi")
        public String udi;

        @NameInMap("UtcClosed")
        public String utcClosed;

        @NameInMap("UtcCreated")
        public String utcCreated;

        public static QueryDeviceTunnelResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceTunnelResponseBodyData self = new QueryDeviceTunnelResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryDeviceTunnelResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryDeviceTunnelResponseBodyData setDeviceConnState(String deviceConnState) {
            this.deviceConnState = deviceConnState;
            return this;
        }
        public String getDeviceConnState() {
            return this.deviceConnState;
        }

        public QueryDeviceTunnelResponseBodyData setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public QueryDeviceTunnelResponseBodyData setIotId(String iotId) {
            this.iotId = iotId;
            return this;
        }
        public String getIotId() {
            return this.iotId;
        }

        public QueryDeviceTunnelResponseBodyData setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
        }

        public QueryDeviceTunnelResponseBodyData setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public QueryDeviceTunnelResponseBodyData setSourceConnState(String sourceConnState) {
            this.sourceConnState = sourceConnState;
            return this;
        }
        public String getSourceConnState() {
            return this.sourceConnState;
        }

        public QueryDeviceTunnelResponseBodyData setTunnelId(String tunnelId) {
            this.tunnelId = tunnelId;
            return this;
        }
        public String getTunnelId() {
            return this.tunnelId;
        }

        public QueryDeviceTunnelResponseBodyData setTunnelState(String tunnelState) {
            this.tunnelState = tunnelState;
            return this;
        }
        public String getTunnelState() {
            return this.tunnelState;
        }

        public QueryDeviceTunnelResponseBodyData setUdi(String udi) {
            this.udi = udi;
            return this;
        }
        public String getUdi() {
            return this.udi;
        }

        public QueryDeviceTunnelResponseBodyData setUtcClosed(String utcClosed) {
            this.utcClosed = utcClosed;
            return this;
        }
        public String getUtcClosed() {
            return this.utcClosed;
        }

        public QueryDeviceTunnelResponseBodyData setUtcCreated(String utcCreated) {
            this.utcCreated = utcCreated;
            return this;
        }
        public String getUtcCreated() {
            return this.utcCreated;
        }

    }

}
