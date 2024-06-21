// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class QueryInstancesInfoResponseBody extends TeaModel {
    /**
     * <p>The details of the data.</p>
     */
    @NameInMap("Data")
    public java.util.List<QueryInstancesInfoResponseBodyData> data;

    /**
     * <p>The error code returned if the request failed.</p>
     * 
     * <strong>example:</strong>
     * <p>mse-100-000</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>202</p>
     */
    @NameInMap("HttpCode")
    public String httpCode;

    /**
     * <p>The message that is returned.</p>
     * <ul>
     * <li>If the request is successful, a success message is returned.</li>
     * <li>If the request fails, an error message is returned.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>The request is successfully processed.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>54973C90-F379-4372-9AA5-053A3F7****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><code>true</code>: The request was successful.</li>
     * <li><code>false</code>: The request failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <p>The enabled port.</p>
         * 
         * <strong>example:</strong>
         * <p>8848</p>
         */
        @NameInMap("ClientPort")
        public String clientPort;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-12-15T02:02:15Z</p>
         */
        @NameInMap("CreationTimestamp")
        public String creationTimestamp;

        /**
         * <p>A reserved parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("HealthStatus")
        public String healthStatus;

        /**
         * <p>The public IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>120.55.71.x</p>
         */
        @NameInMap("InternetIp")
        public String internetIp;

        /**
         * <p>The IP address of the pod.</p>
         * 
         * <strong>example:</strong>
         * <p>25.24.91.x</p>
         */
        @NameInMap("Ip")
        public String ip;

        /**
         * <p>The pod name.</p>
         * 
         * <strong>example:</strong>
         * <p>mse-xxxxx-xxxxx-reg-center-0-1</p>
         */
        @NameInMap("PodName")
        public String podName;

        /**
         * <p>A reserved parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("Role")
        public String role;

        /**
         * <p>The internal IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>172.16.66.x</p>
         */
        @NameInMap("SingleTunnelVip")
        public String singleTunnelVip;

        /**
         * <p>The zone ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-k</p>
         */
        @NameInMap("Zone")
        public String zone;

        /**
         * <p>Indicates whether all pods in the cluster are distributed in the specified zones.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ZoneDistributed")
        public Boolean zoneDistributed;

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

        public QueryInstancesInfoResponseBodyData setZoneDistributed(Boolean zoneDistributed) {
            this.zoneDistributed = zoneDistributed;
            return this;
        }
        public Boolean getZoneDistributed() {
            return this.zoneDistributed;
        }

    }

}
