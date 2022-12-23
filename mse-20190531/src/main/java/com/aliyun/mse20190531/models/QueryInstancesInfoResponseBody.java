// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class QueryInstancesInfoResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<QueryInstancesInfoResponseBodyData> data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("HttpCode")
    public String httpCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryInstancesInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryInstancesInfoResponseBody self = new QueryInstancesInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryInstancesInfoResponseBody setData(java.util.List<QueryInstancesInfoResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryInstancesInfoResponseBodyData> getData() {
        return this.data;
    }

    public QueryInstancesInfoResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public QueryInstancesInfoResponseBody setHttpCode(String httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public String getHttpCode() {
        return this.httpCode;
    }

    public QueryInstancesInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryInstancesInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryInstancesInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryInstancesInfoResponseBodyData extends TeaModel {
        @NameInMap("ClientPort")
        public String clientPort;

        @NameInMap("CreationTimestamp")
        public String creationTimestamp;

        @NameInMap("HealthStatus")
        public String healthStatus;

        @NameInMap("InternetIp")
        public String internetIp;

        @NameInMap("Ip")
        public String ip;

        @NameInMap("PodName")
        public String podName;

        @NameInMap("Role")
        public String role;

        @NameInMap("SingleTunnelVip")
        public String singleTunnelVip;

        @NameInMap("Zone")
        public String zone;

        public static QueryInstancesInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryInstancesInfoResponseBodyData self = new QueryInstancesInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryInstancesInfoResponseBodyData setClientPort(String clientPort) {
            this.clientPort = clientPort;
            return this;
        }
        public String getClientPort() {
            return this.clientPort;
        }

        public QueryInstancesInfoResponseBodyData setCreationTimestamp(String creationTimestamp) {
            this.creationTimestamp = creationTimestamp;
            return this;
        }
        public String getCreationTimestamp() {
            return this.creationTimestamp;
        }

        public QueryInstancesInfoResponseBodyData setHealthStatus(String healthStatus) {
            this.healthStatus = healthStatus;
            return this;
        }
        public String getHealthStatus() {
            return this.healthStatus;
        }

        public QueryInstancesInfoResponseBodyData setInternetIp(String internetIp) {
            this.internetIp = internetIp;
            return this;
        }
        public String getInternetIp() {
            return this.internetIp;
        }

        public QueryInstancesInfoResponseBodyData setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public QueryInstancesInfoResponseBodyData setPodName(String podName) {
            this.podName = podName;
            return this;
        }
        public String getPodName() {
            return this.podName;
        }

        public QueryInstancesInfoResponseBodyData setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public QueryInstancesInfoResponseBodyData setSingleTunnelVip(String singleTunnelVip) {
            this.singleTunnelVip = singleTunnelVip;
            return this;
        }
        public String getSingleTunnelVip() {
            return this.singleTunnelVip;
        }

        public QueryInstancesInfoResponseBodyData setZone(String zone) {
            this.zone = zone;
            return this;
        }
        public String getZone() {
            return this.zone;
        }

    }

}
