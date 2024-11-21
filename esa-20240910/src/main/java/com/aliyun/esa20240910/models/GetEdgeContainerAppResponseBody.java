// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetEdgeContainerAppResponseBody extends TeaModel {
    /**
     * <p>The basic information about the application.</p>
     */
    @NameInMap("App")
    public GetEdgeContainerAppResponseBodyApp app;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>156A6B-677B1A-4297B7-9187B7-2B44792</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetEdgeContainerAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetEdgeContainerAppResponseBody self = new GetEdgeContainerAppResponseBody();
        return TeaModel.build(map, self);
    }

    public GetEdgeContainerAppResponseBody setApp(GetEdgeContainerAppResponseBodyApp app) {
        this.app = app;
        return this;
    }
    public GetEdgeContainerAppResponseBodyApp getApp() {
        return this.app;
    }

    public GetEdgeContainerAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetEdgeContainerAppResponseBodyAppHealthCheck extends TeaModel {
        /**
         * <p>The number of consecutive failed health checks required for an application to be considered as unhealthy.</p>
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
         * <p>http_2xx</p>
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
         * <p>The HTTP method that the health check request uses.</p>
         * 
         * <strong>example:</strong>
         * <p>HEAD</p>
         */
        @NameInMap("Method")
        public String method;

        /**
         * <p>The health check port.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The number of consecutive successful health checks required for an application to be considered as healthy.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("SuccTimes")
        public Integer succTimes;

        /**
         * <p>The timeout period of the health check. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("Timeout")
        public Integer timeout;

        /**
         * <p>The health check type. Valid values:</p>
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

        public static GetEdgeContainerAppResponseBodyAppHealthCheck build(java.util.Map<String, ?> map) throws Exception {
            GetEdgeContainerAppResponseBodyAppHealthCheck self = new GetEdgeContainerAppResponseBodyAppHealthCheck();
            return TeaModel.build(map, self);
        }

        public GetEdgeContainerAppResponseBodyAppHealthCheck setFailTimes(Integer failTimes) {
            this.failTimes = failTimes;
            return this;
        }
        public Integer getFailTimes() {
            return this.failTimes;
        }

        public GetEdgeContainerAppResponseBodyAppHealthCheck setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public GetEdgeContainerAppResponseBodyAppHealthCheck setHttpCode(String httpCode) {
            this.httpCode = httpCode;
            return this;
        }
        public String getHttpCode() {
            return this.httpCode;
        }

        public GetEdgeContainerAppResponseBodyAppHealthCheck setInterval(Integer interval) {
            this.interval = interval;
            return this;
        }
        public Integer getInterval() {
            return this.interval;
        }

        public GetEdgeContainerAppResponseBodyAppHealthCheck setMethod(String method) {
            this.method = method;
            return this;
        }
        public String getMethod() {
            return this.method;
        }

        public GetEdgeContainerAppResponseBodyAppHealthCheck setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public GetEdgeContainerAppResponseBodyAppHealthCheck setSuccTimes(Integer succTimes) {
            this.succTimes = succTimes;
            return this;
        }
        public Integer getSuccTimes() {
            return this.succTimes;
        }

        public GetEdgeContainerAppResponseBodyAppHealthCheck setTimeout(Integer timeout) {
            this.timeout = timeout;
            return this;
        }
        public Integer getTimeout() {
            return this.timeout;
        }

        public GetEdgeContainerAppResponseBodyAppHealthCheck setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetEdgeContainerAppResponseBodyAppHealthCheck setUri(String uri) {
            this.uri = uri;
            return this;
        }
        public String getUri() {
            return this.uri;
        }

    }

    public static class GetEdgeContainerAppResponseBodyApp extends TeaModel {
        /**
         * <p>The application ID.</p>
         * 
         * <strong>example:</strong>
         * <p>app-88068867578379****</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The time when the application was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-07-25T05:58:05Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The domain name that is associated with the application. If no domain name is associated with the application, the value is an empty string.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.1feel.cn">www.1feel.cn</a></p>
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
        public GetEdgeContainerAppResponseBodyAppHealthCheck healthCheck;

        /**
         * <p>The application name.</p>
         * 
         * <strong>example:</strong>
         * <p>test-app1</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Indicates whether QUIC is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("QuicCid")
        public String quicCid;

        /**
         * <p>The remarks about the application.</p>
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
         * <p>2023-03-26T02:35:58Z</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        /**
         * <p>The number of versions of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("VersionCount")
        public Integer versionCount;

        public static GetEdgeContainerAppResponseBodyApp build(java.util.Map<String, ?> map) throws Exception {
            GetEdgeContainerAppResponseBodyApp self = new GetEdgeContainerAppResponseBodyApp();
            return TeaModel.build(map, self);
        }

        public GetEdgeContainerAppResponseBodyApp setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public GetEdgeContainerAppResponseBodyApp setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetEdgeContainerAppResponseBodyApp setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public GetEdgeContainerAppResponseBodyApp setGatewayType(String gatewayType) {
            this.gatewayType = gatewayType;
            return this;
        }
        public String getGatewayType() {
            return this.gatewayType;
        }

        public GetEdgeContainerAppResponseBodyApp setHealthCheck(GetEdgeContainerAppResponseBodyAppHealthCheck healthCheck) {
            this.healthCheck = healthCheck;
            return this;
        }
        public GetEdgeContainerAppResponseBodyAppHealthCheck getHealthCheck() {
            return this.healthCheck;
        }

        public GetEdgeContainerAppResponseBodyApp setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetEdgeContainerAppResponseBodyApp setQuicCid(String quicCid) {
            this.quicCid = quicCid;
            return this;
        }
        public String getQuicCid() {
            return this.quicCid;
        }

        public GetEdgeContainerAppResponseBodyApp setRemarks(String remarks) {
            this.remarks = remarks;
            return this;
        }
        public String getRemarks() {
            return this.remarks;
        }

        public GetEdgeContainerAppResponseBodyApp setServicePort(Integer servicePort) {
            this.servicePort = servicePort;
            return this;
        }
        public Integer getServicePort() {
            return this.servicePort;
        }

        public GetEdgeContainerAppResponseBodyApp setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetEdgeContainerAppResponseBodyApp setTargetPort(Integer targetPort) {
            this.targetPort = targetPort;
            return this;
        }
        public Integer getTargetPort() {
            return this.targetPort;
        }

        public GetEdgeContainerAppResponseBodyApp setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public GetEdgeContainerAppResponseBodyApp setVersionCount(Integer versionCount) {
            this.versionCount = versionCount;
            return this;
        }
        public Integer getVersionCount() {
            return this.versionCount;
        }

    }

}
