// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListNamingTrackResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the request failed.</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The HTTP status code returned.</p>
     */
    @NameInMap("HttpCode")
    public String httpCode;

    /**
     * <p>The message returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The number of the returned page.</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>*   `true`: The request was successful.</p>
     * <p>*   `false`: The request failed.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total number of returned entries.</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    /**
     * <p>The data information.</p>
     */
    @NameInMap("Traces")
    public java.util.List<ListNamingTrackResponseBodyTraces> traces;

    public static ListNamingTrackResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListNamingTrackResponseBody self = new ListNamingTrackResponseBody();
        return TeaModel.build(map, self);
    }

    public ListNamingTrackResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListNamingTrackResponseBody setHttpCode(String httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public String getHttpCode() {
        return this.httpCode;
    }

    public ListNamingTrackResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListNamingTrackResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListNamingTrackResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListNamingTrackResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListNamingTrackResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListNamingTrackResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public ListNamingTrackResponseBody setTraces(java.util.List<ListNamingTrackResponseBodyTraces> traces) {
        this.traces = traces;
        return this;
    }
    public java.util.List<ListNamingTrackResponseBodyTraces> getTraces() {
        return this.traces;
    }

    public static class ListNamingTrackResponseBodyTraces extends TeaModel {
        /**
         * <p>The IP address of the client.</p>
         */
        @NameInMap("ClientIp")
        public String clientIp;

        /**
         * <p>The group.</p>
         */
        @NameInMap("Group")
        public String group;

        /**
         * <p>The number of instances.</p>
         */
        @NameInMap("InstanceSize")
        public String instanceSize;

        /**
         * <p>The name of the node.</p>
         */
        @NameInMap("NodeName")
        public String nodeName;

        /**
         * <p>The push time.</p>
         */
        @NameInMap("PushTime")
        public String pushTime;

        /**
         * <p>The total push time.</p>
         */
        @NameInMap("PushTimeAll")
        public String pushTimeAll;

        /**
         * <p>The push time for the network.</p>
         */
        @NameInMap("PushTimeNetwork")
        public String pushTimeNetwork;

        /**
         * <p>The name of the service.</p>
         */
        @NameInMap("ServerName")
        public String serverName;

        /**
         * <p>The duration that is specified in the service-level agreement (SLA).</p>
         */
        @NameInMap("SlaTime")
        public String slaTime;

        public static ListNamingTrackResponseBodyTraces build(java.util.Map<String, ?> map) throws Exception {
            ListNamingTrackResponseBodyTraces self = new ListNamingTrackResponseBodyTraces();
            return TeaModel.build(map, self);
        }

        public ListNamingTrackResponseBodyTraces setClientIp(String clientIp) {
            this.clientIp = clientIp;
            return this;
        }
        public String getClientIp() {
            return this.clientIp;
        }

        public ListNamingTrackResponseBodyTraces setGroup(String group) {
            this.group = group;
            return this;
        }
        public String getGroup() {
            return this.group;
        }

        public ListNamingTrackResponseBodyTraces setInstanceSize(String instanceSize) {
            this.instanceSize = instanceSize;
            return this;
        }
        public String getInstanceSize() {
            return this.instanceSize;
        }

        public ListNamingTrackResponseBodyTraces setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public ListNamingTrackResponseBodyTraces setPushTime(String pushTime) {
            this.pushTime = pushTime;
            return this;
        }
        public String getPushTime() {
            return this.pushTime;
        }

        public ListNamingTrackResponseBodyTraces setPushTimeAll(String pushTimeAll) {
            this.pushTimeAll = pushTimeAll;
            return this;
        }
        public String getPushTimeAll() {
            return this.pushTimeAll;
        }

        public ListNamingTrackResponseBodyTraces setPushTimeNetwork(String pushTimeNetwork) {
            this.pushTimeNetwork = pushTimeNetwork;
            return this;
        }
        public String getPushTimeNetwork() {
            return this.pushTimeNetwork;
        }

        public ListNamingTrackResponseBodyTraces setServerName(String serverName) {
            this.serverName = serverName;
            return this;
        }
        public String getServerName() {
            return this.serverName;
        }

        public ListNamingTrackResponseBodyTraces setSlaTime(String slaTime) {
            this.slaTime = slaTime;
            return this;
        }
        public String getSlaTime() {
            return this.slaTime;
        }

    }

}
