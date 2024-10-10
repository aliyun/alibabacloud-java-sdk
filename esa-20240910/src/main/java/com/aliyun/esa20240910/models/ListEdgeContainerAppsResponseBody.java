// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListEdgeContainerAppsResponseBody extends TeaModel {
    @NameInMap("Apps")
    public java.util.List<ListEdgeContainerAppsResponseBodyApps> apps;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>2430E05E-1340-5773-B5E1-B743929F46F2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
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
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("FailTimes")
        public Integer failTimes;

        /**
         * <strong>example:</strong>
         * <p>test.com</p>
         */
        @NameInMap("Host")
        public String host;

        /**
         * <strong>example:</strong>
         * <p>http_2XX</p>
         */
        @NameInMap("HttpCode")
        public String httpCode;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Interval")
        public Integer interval;

        /**
         * <strong>example:</strong>
         * <p>GET</p>
         */
        @NameInMap("Method")
        public String method;

        /**
         * <strong>example:</strong>
         * <p>8080</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SuccTimes")
        public Integer succTimes;

        /**
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("Timeout")
        public Integer timeout;

        /**
         * <strong>example:</strong>
         * <p>l7</p>
         */
        @NameInMap("Type")
        public String type;

        /**
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
         * <strong>example:</strong>
         * <p>app-88068867578379****</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <strong>example:</strong>
         * <p>2022-12-01T16:16:27.418298794+08:00</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>test.com</p>
         */
        @NameInMap("DomainName")
        public String domainName;

        /**
         * <strong>example:</strong>
         * <p>l7</p>
         */
        @NameInMap("GatewayType")
        public String gatewayType;

        @NameInMap("HealthCheck")
        public ListEdgeContainerAppsResponseBodyAppsHealthCheck healthCheck;

        /**
         * <strong>example:</strong>
         * <p>app-test</p>
         */
        @NameInMap("Name")
        public String name;

        @NameInMap("Percentage")
        public Integer percentage;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("QuicCid")
        public String quicCid;

        /**
         * <strong>example:</strong>
         * <p>test app</p>
         */
        @NameInMap("Remarks")
        public String remarks;

        /**
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("ServicePort")
        public Integer servicePort;

        /**
         * <strong>example:</strong>
         * <p>created</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("TargetPort")
        public Integer targetPort;

        /**
         * <strong>example:</strong>
         * <p>2023-11-15T12:11:02Z</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        /**
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
