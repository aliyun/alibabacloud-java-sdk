// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class GetServiceListenersResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public java.util.List<GetServiceListenersResponseBodyData> data;

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
     * <br>
     * <p>*   If the request is successful, a success message is returned.</p>
     * <p>*   If the request fails, an error message is returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

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
     * <p>The number of listeners that are queried.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static GetServiceListenersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetServiceListenersResponseBody self = new GetServiceListenersResponseBody();
        return TeaModel.build(map, self);
    }

    public GetServiceListenersResponseBody setData(java.util.List<GetServiceListenersResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetServiceListenersResponseBodyData> getData() {
        return this.data;
    }

    public GetServiceListenersResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetServiceListenersResponseBody setHttpCode(String httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public String getHttpCode() {
        return this.httpCode;
    }

    public GetServiceListenersResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetServiceListenersResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public GetServiceListenersResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetServiceListenersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetServiceListenersResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetServiceListenersResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class GetServiceListenersResponseBodyData extends TeaModel {
        /**
         * <p>The IP address of the listener.</p>
         */
        @NameInMap("Addr")
        public String addr;

        /**
         * <p>The listener client version.</p>
         */
        @NameInMap("Agent")
        public String agent;

        /**
         * <p>The application name of the listener.</p>
         */
        @NameInMap("App")
        public String app;

        /**
         * <p>The name of the cluster to which the monitored service belongs.</p>
         */
        @NameInMap("Cluster")
        public String cluster;

        /**
         * <p>The IP address of the monitored service.</p>
         */
        @NameInMap("IP")
        public String IP;

        /**
         * <p>The ID of the namespace.</p>
         */
        @NameInMap("NamespaceId")
        public String namespaceId;

        /**
         * <p>The port number of the monitored service.</p>
         */
        @NameInMap("Port")
        public String port;

        /**
         * <p>The name of the monitored service.</p>
         */
        @NameInMap("ServiceName")
        public String serviceName;

        public static GetServiceListenersResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetServiceListenersResponseBodyData self = new GetServiceListenersResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetServiceListenersResponseBodyData setAddr(String addr) {
            this.addr = addr;
            return this;
        }
        public String getAddr() {
            return this.addr;
        }

        public GetServiceListenersResponseBodyData setAgent(String agent) {
            this.agent = agent;
            return this;
        }
        public String getAgent() {
            return this.agent;
        }

        public GetServiceListenersResponseBodyData setApp(String app) {
            this.app = app;
            return this;
        }
        public String getApp() {
            return this.app;
        }

        public GetServiceListenersResponseBodyData setCluster(String cluster) {
            this.cluster = cluster;
            return this;
        }
        public String getCluster() {
            return this.cluster;
        }

        public GetServiceListenersResponseBodyData setIP(String IP) {
            this.IP = IP;
            return this;
        }
        public String getIP() {
            return this.IP;
        }

        public GetServiceListenersResponseBodyData setNamespaceId(String namespaceId) {
            this.namespaceId = namespaceId;
            return this;
        }
        public String getNamespaceId() {
            return this.namespaceId;
        }

        public GetServiceListenersResponseBodyData setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public GetServiceListenersResponseBodyData setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

    }

}
