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
     * 
     * <strong>example:</strong>
     * <p>mse-100-000</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The HTTP status code returned.</p>
     * 
     * <strong>example:</strong>
     * <p>202</p>
     */
    @NameInMap("HttpCode")
    public String httpCode;

    /**
     * <p>The message returned.</p>
     * 
     * <strong>example:</strong>
     * <p>The request is successfully processed.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The page number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>316F5F64-F73D-42DC-8632-01E308B6****</p>
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

    /**
     * <p>The total number of returned instances.</p>
     * 
     * <strong>example:</strong>
     * <p>7</p>
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
         * 
         * <strong>example:</strong>
         * <p>CONTACTINFO</p>
         */
        @NameInMap("App")
        public String app;

        /**
         * <p>The timeout period of the instance.\
         * After the specified timeout period expires, the service is unavailable by default and is deleted.</p>
         * 
         * <strong>example:</strong>
         * <p>90</p>
         */
        @NameInMap("DurationInSecs")
        public Integer durationInSecs;

        /**
         * <p>The URL of the homepage.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://30.5.XX.XX:8091/">http://30.5.XX.XX:8091/</a></p>
         */
        @NameInMap("HomePageUrl")
        public String homePageUrl;

        /**
         * <p>The hostname.</p>
         * 
         * <strong>example:</strong>
         * <p>30.5.XX.XX</p>
         */
        @NameInMap("HostName")
        public String hostName;

        /**
         * <p>The ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>L-PC1A6A28-****.hz.ali.com:contactinfo:8091</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>30.5.XX.XX</p>
         */
        @NameInMap("IpAddr")
        public String ipAddr;

        /**
         * <p>The time when the instance was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>20201009115543</p>
         */
        @NameInMap("LastDirtyTimestamp")
        public Long lastDirtyTimestamp;

        /**
         * <p>The time when the instance heartbeat was last checked.</p>
         * 
         * <strong>example:</strong>
         * <p>20201010071203</p>
         */
        @NameInMap("LastUpdatedTimestamp")
        public Long lastUpdatedTimestamp;

        /**
         * <p>The metadata.</p>
         * 
         * <strong>example:</strong>
         * <p>[string]</p>
         */
        @NameInMap("Metadata")
        public java.util.Map<String, ?> metadata;

        /**
         * <p>The service port number.</p>
         * 
         * <strong>example:</strong>
         * <p>8091</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The maximum interval between two heartbeat checks after a heartbeat check times out.\
         * Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("RenewalIntervalInSecs")
        public Integer renewalIntervalInSecs;

        /**
         * <p>The security port.</p>
         * 
         * <strong>example:</strong>
         * <p>443</p>
         */
        @NameInMap("SecurePort")
        public Integer securePort;

        /**
         * <p>The number of service providers. The value is in the following format: Number of healthy instances/Total number of instances.</p>
         * 
         * <strong>example:</strong>
         * <p>1/1</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The virtual IP address (VIP).</p>
         * 
         * <strong>example:</strong>
         * <p>contactinfo</p>
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
