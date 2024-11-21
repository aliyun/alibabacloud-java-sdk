// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListEdgeContainerAppsResponseBody extends TeaModel {
    /**
     * <p>The queried applications.</p>
     */
    @NameInMap("Apps")
    public java.util.List<ListEdgeContainerAppsResponseBodyApps> apps;

    /**
     * <p>The page number. Default value: <strong>1</strong>. Valid values: 1 to 65535.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Valid values: 1 to 500.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2430E05E-1340-5773-B5E1-B743929F46F2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListEdgeContainerAppsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListEdgeContainerAppsResponseBody self = new ListEdgeContainerAppsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListEdgeContainerAppsResponseBody setApps(java.util.List<ListEdgeContainerAppsResponseBodyApps> apps) {
        this.apps = apps;
        return this;
    }
    public java.util.List<ListEdgeContainerAppsResponseBodyApps> getApps() {
        return this.apps;
    }

    public ListEdgeContainerAppsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListEdgeContainerAppsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListEdgeContainerAppsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListEdgeContainerAppsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListEdgeContainerAppsResponseBodyAppsHealthCheck extends TeaModel {
        /**
         * <p>The number of consecutive failed health checks for an application to be considered unhealthy.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("FailTimes")
        public Integer failTimes;

        /**
         * <p>The domain name that is used for health checks.</p>
         * 
         * <strong>example:</strong>
         * <p>test.com</p>
         */
        @NameInMap("Host")
        public String host;

        /**
         * <p>The range of health check status codes that indicate successful health checks.</p>
         * 
         * <strong>example:</strong>
         * <p>http_2XX</p>
         */
        @NameInMap("HttpCode")
        public String httpCode;

        /**
         * <p>The interval between health checks. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Interval")
        public Integer interval;

        /**
         * <p>The HTTP method used for health checks.</p>
         * 
         * <strong>example:</strong>
         * <p>GET</p>
         */
        @NameInMap("Method")
        public String method;

        /**
         * <p>The health check port.</p>
         * 
         * <strong>example:</strong>
         * <p>8080</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The number of consecutive successful health checks for an application to be considered healthy.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SuccTimes")
        public Integer succTimes;

        /**
         * <p>The timeout period of health checks. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("Timeout")
        public Integer timeout;

        /**
         * <p>The type of health checks. Valid values:</p>
         * <ul>
         * <li>l7</li>
         * <li>l4</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>l7</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The health check URL.</p>
         * 
         * <strong>example:</strong>
         * <p>/health_check</p>
         */
        @NameInMap("Uri")
        public String uri;

        public static ListEdgeContainerAppsResponseBodyAppsHealthCheck build(java.util.Map<String, ?> map) throws Exception {
            ListEdgeContainerAppsResponseBodyAppsHealthCheck self = new ListEdgeContainerAppsResponseBodyAppsHealthCheck();
            return TeaModel.build(map, self);
        }

        public ListEdgeContainerAppsResponseBodyAppsHealthCheck setFailTimes(Integer failTimes) {
            this.failTimes = failTimes;
            return this;
        }
        public Integer getFailTimes() {
            return this.failTimes;
        }

        public ListEdgeContainerAppsResponseBodyAppsHealthCheck setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public ListEdgeContainerAppsResponseBodyAppsHealthCheck setHttpCode(String httpCode) {
            this.httpCode = httpCode;
            return this;
        }
        public String getHttpCode() {
            return this.httpCode;
        }

        public ListEdgeContainerAppsResponseBodyAppsHealthCheck setInterval(Integer interval) {
            this.interval = interval;
            return this;
        }
        public Integer getInterval() {
            return this.interval;
        }

        public ListEdgeContainerAppsResponseBodyAppsHealthCheck setMethod(String method) {
            this.method = method;
            return this;
        }
        public String getMethod() {
            return this.method;
        }

        public ListEdgeContainerAppsResponseBodyAppsHealthCheck setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public ListEdgeContainerAppsResponseBodyAppsHealthCheck setSuccTimes(Integer succTimes) {
            this.succTimes = succTimes;
            return this;
        }
        public Integer getSuccTimes() {
            return this.succTimes;
        }

        public ListEdgeContainerAppsResponseBodyAppsHealthCheck setTimeout(Integer timeout) {
            this.timeout = timeout;
            return this;
        }
        public Integer getTimeout() {
            return this.timeout;
        }

        public ListEdgeContainerAppsResponseBodyAppsHealthCheck setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListEdgeContainerAppsResponseBodyAppsHealthCheck setUri(String uri) {
            this.uri = uri;
            return this;
        }
        public String getUri() {
            return this.uri;
        }

    }

    public static class ListEdgeContainerAppsResponseBodyApps extends TeaModel {
        /**
         * <p>The application ID.</p>
         * 
         * <strong>example:</strong>
         * <p>app-88068867578379****</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The time when the version was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-12-01T16:16:27.418298794+08:00</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The domain name associated with the application.</p>
         * 
         * <strong>example:</strong>
         * <p>test.com</p>
         */
        @NameInMap("DomainName")
        public String domainName;

        /**
         * <p>The type of the gateway. Valid values:</p>
         * <ul>
         * <li>l7: Layer 7 gateway.</li>
         * <li>l4: Layer 4 gateway.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>l7</p>
         */
        @NameInMap("GatewayType")
        public String gatewayType;

        /**
         * <p>The information about health checks.</p>
         */
        @NameInMap("HealthCheck")
        public ListEdgeContainerAppsResponseBodyAppsHealthCheck healthCheck;

        /**
         * <p>The application name.</p>
         * 
         * <strong>example:</strong>
         * <p>app-test</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The progress of the application creation task in percentage.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Percentage")
        public Integer percentage;

        /**
         * <p>Indicates whether QUIC is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("QuicCid")
        public String quicCid;

        /**
         * <p>The remarks.</p>
         * 
         * <strong>example:</strong>
         * <p>test app</p>
         */
        @NameInMap("Remarks")
        public String remarks;

        /**
         * <p>The server port. Valid values: 1 to 65535.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("ServicePort")
        public Integer servicePort;

        /**
         * <p>The status of the application. Valid values:</p>
         * <ul>
         * <li>creating: The application is being created.</li>
         * <li>failed: The application failed to be created.</li>
         * <li>created: The application is created.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>created</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The backend port, which is also the service port of the application. Valid values: 1 to 65535.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("TargetPort")
        public Integer targetPort;

        /**
         * <p>The time when the application was last modified. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ss format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-11-15T12:11:02Z</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        /**
         * <p>The number of versions of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("VersionCount")
        public Integer versionCount;

        public static ListEdgeContainerAppsResponseBodyApps build(java.util.Map<String, ?> map) throws Exception {
            ListEdgeContainerAppsResponseBodyApps self = new ListEdgeContainerAppsResponseBodyApps();
            return TeaModel.build(map, self);
        }

        public ListEdgeContainerAppsResponseBodyApps setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ListEdgeContainerAppsResponseBodyApps setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListEdgeContainerAppsResponseBodyApps setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public ListEdgeContainerAppsResponseBodyApps setGatewayType(String gatewayType) {
            this.gatewayType = gatewayType;
            return this;
        }
        public String getGatewayType() {
            return this.gatewayType;
        }

        public ListEdgeContainerAppsResponseBodyApps setHealthCheck(ListEdgeContainerAppsResponseBodyAppsHealthCheck healthCheck) {
            this.healthCheck = healthCheck;
            return this;
        }
        public ListEdgeContainerAppsResponseBodyAppsHealthCheck getHealthCheck() {
            return this.healthCheck;
        }

        public ListEdgeContainerAppsResponseBodyApps setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListEdgeContainerAppsResponseBodyApps setPercentage(Integer percentage) {
            this.percentage = percentage;
            return this;
        }
        public Integer getPercentage() {
            return this.percentage;
        }

        public ListEdgeContainerAppsResponseBodyApps setQuicCid(String quicCid) {
            this.quicCid = quicCid;
            return this;
        }
        public String getQuicCid() {
            return this.quicCid;
        }

        public ListEdgeContainerAppsResponseBodyApps setRemarks(String remarks) {
            this.remarks = remarks;
            return this;
        }
        public String getRemarks() {
            return this.remarks;
        }

        public ListEdgeContainerAppsResponseBodyApps setServicePort(Integer servicePort) {
            this.servicePort = servicePort;
            return this;
        }
        public Integer getServicePort() {
            return this.servicePort;
        }

        public ListEdgeContainerAppsResponseBodyApps setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListEdgeContainerAppsResponseBodyApps setTargetPort(Integer targetPort) {
            this.targetPort = targetPort;
            return this;
        }
        public Integer getTargetPort() {
            return this.targetPort;
        }

        public ListEdgeContainerAppsResponseBodyApps setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public ListEdgeContainerAppsResponseBodyApps setVersionCount(Integer versionCount) {
            this.versionCount = versionCount;
            return this;
        }
        public Integer getVersionCount() {
            return this.versionCount;
        }

    }

}
