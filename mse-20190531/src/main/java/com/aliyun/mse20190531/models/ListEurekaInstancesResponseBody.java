// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListEurekaInstancesResponseBody extends TeaModel {
    /**
     * <p>The details of the data.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListEurekaInstancesResponseBodyData> data;

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
     * <p>The total number of returned instances.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListEurekaInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListEurekaInstancesResponseBody self = new ListEurekaInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListEurekaInstancesResponseBody setData(java.util.List<ListEurekaInstancesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListEurekaInstancesResponseBodyData> getData() {
        return this.data;
    }

    public ListEurekaInstancesResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListEurekaInstancesResponseBody setHttpCode(String httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public String getHttpCode() {
        return this.httpCode;
    }

    public ListEurekaInstancesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListEurekaInstancesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListEurekaInstancesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListEurekaInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListEurekaInstancesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListEurekaInstancesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListEurekaInstancesResponseBodyData extends TeaModel {
        /**
         * <p>The name of the application.</p>
         */
        @NameInMap("App")
        public String app;

        /**
         * <p>The timeout period of the instance.\</p>
         * <p>After the specified timeout period expires, the service is unavailable by default and is deleted.</p>
         */
        @NameInMap("DurationInSecs")
        public Integer durationInSecs;

        /**
         * <p>The URL of the homepage.</p>
         */
        @NameInMap("HomePageUrl")
        public String homePageUrl;

        /**
         * <p>The hostname.</p>
         */
        @NameInMap("HostName")
        public String hostName;

        /**
         * <p>The ID of the instance.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The IP address.</p>
         */
        @NameInMap("IpAddr")
        public String ipAddr;

        /**
         * <p>The time when the instance was last modified.</p>
         */
        @NameInMap("LastDirtyTimestamp")
        public Long lastDirtyTimestamp;

        /**
         * <p>The time when the instance heartbeat was last checked.</p>
         */
        @NameInMap("LastUpdatedTimestamp")
        public Long lastUpdatedTimestamp;

        /**
         * <p>The metadata.</p>
         */
        @NameInMap("Metadata")
        public java.util.Map<String, ?> metadata;

        /**
         * <p>The service port number.</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The maximum interval between two heartbeat checks after a heartbeat check times out.\</p>
         * <p>Default value: 10.</p>
         */
        @NameInMap("RenewalIntervalInSecs")
        public Integer renewalIntervalInSecs;

        /**
         * <p>The security port.</p>
         */
        @NameInMap("SecurePort")
        public Integer securePort;

        /**
         * <p>The number of service providers. The value is in the following format: Number of healthy instances/Total number of instances.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The virtual IP address (VIP).</p>
         */
        @NameInMap("VipAddress")
        public String vipAddress;

        public static ListEurekaInstancesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListEurekaInstancesResponseBodyData self = new ListEurekaInstancesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListEurekaInstancesResponseBodyData setApp(String app) {
            this.app = app;
            return this;
        }
        public String getApp() {
            return this.app;
        }

        public ListEurekaInstancesResponseBodyData setDurationInSecs(Integer durationInSecs) {
            this.durationInSecs = durationInSecs;
            return this;
        }
        public Integer getDurationInSecs() {
            return this.durationInSecs;
        }

        public ListEurekaInstancesResponseBodyData setHomePageUrl(String homePageUrl) {
            this.homePageUrl = homePageUrl;
            return this;
        }
        public String getHomePageUrl() {
            return this.homePageUrl;
        }

        public ListEurekaInstancesResponseBodyData setHostName(String hostName) {
            this.hostName = hostName;
            return this;
        }
        public String getHostName() {
            return this.hostName;
        }

        public ListEurekaInstancesResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListEurekaInstancesResponseBodyData setIpAddr(String ipAddr) {
            this.ipAddr = ipAddr;
            return this;
        }
        public String getIpAddr() {
            return this.ipAddr;
        }

        public ListEurekaInstancesResponseBodyData setLastDirtyTimestamp(Long lastDirtyTimestamp) {
            this.lastDirtyTimestamp = lastDirtyTimestamp;
            return this;
        }
        public Long getLastDirtyTimestamp() {
            return this.lastDirtyTimestamp;
        }

        public ListEurekaInstancesResponseBodyData setLastUpdatedTimestamp(Long lastUpdatedTimestamp) {
            this.lastUpdatedTimestamp = lastUpdatedTimestamp;
            return this;
        }
        public Long getLastUpdatedTimestamp() {
            return this.lastUpdatedTimestamp;
        }

        public ListEurekaInstancesResponseBodyData setMetadata(java.util.Map<String, ?> metadata) {
            this.metadata = metadata;
            return this;
        }
        public java.util.Map<String, ?> getMetadata() {
            return this.metadata;
        }

        public ListEurekaInstancesResponseBodyData setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public ListEurekaInstancesResponseBodyData setRenewalIntervalInSecs(Integer renewalIntervalInSecs) {
            this.renewalIntervalInSecs = renewalIntervalInSecs;
            return this;
        }
        public Integer getRenewalIntervalInSecs() {
            return this.renewalIntervalInSecs;
        }

        public ListEurekaInstancesResponseBodyData setSecurePort(Integer securePort) {
            this.securePort = securePort;
            return this;
        }
        public Integer getSecurePort() {
            return this.securePort;
        }

        public ListEurekaInstancesResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListEurekaInstancesResponseBodyData setVipAddress(String vipAddress) {
            this.vipAddress = vipAddress;
            return this;
        }
        public String getVipAddress() {
            return this.vipAddress;
        }

    }

}
