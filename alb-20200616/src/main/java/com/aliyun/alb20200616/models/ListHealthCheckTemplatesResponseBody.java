// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class ListHealthCheckTemplatesResponseBody extends TeaModel {
    /**
     * <p>The health check templates.</p>
     */
    @NameInMap("HealthCheckTemplates")
    public java.util.List<ListHealthCheckTemplatesResponseBodyHealthCheckTemplates> healthCheckTemplates;

    /**
     * <p>The number of entries returned per page. Valid values: <strong>1</strong> to <strong>100</strong>. Default value: <strong>20</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The returned value of NextToken is a pagination token, which can be used in the next request to retrieve a new page of results. Valid values:</p>
     * <ul>
     * <li>If <strong>NextToken</strong> is empty, no next page exists.</li>
     * <li>If a value of <strong>NextToken</strong> was returned in the previous query, specify the value to obtain the next set of results.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>FFmyTO70tTpLG6I3FmYAXGKPd****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>365F4154-92F6-4AE4-92F8-7FF34B540710</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListHealthCheckTemplatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListHealthCheckTemplatesResponseBody self = new ListHealthCheckTemplatesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListHealthCheckTemplatesResponseBody setHealthCheckTemplates(java.util.List<ListHealthCheckTemplatesResponseBodyHealthCheckTemplates> healthCheckTemplates) {
        this.healthCheckTemplates = healthCheckTemplates;
        return this;
    }
    public java.util.List<ListHealthCheckTemplatesResponseBodyHealthCheckTemplates> getHealthCheckTemplates() {
        return this.healthCheckTemplates;
    }

    public ListHealthCheckTemplatesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListHealthCheckTemplatesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListHealthCheckTemplatesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListHealthCheckTemplatesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListHealthCheckTemplatesResponseBodyHealthCheckTemplatesTags extends TeaModel {
        /**
         * <p>The tag key. The tag key can be up to 128 characters in length, and cannot contain <code>http://</code> or <code>https://</code>. The tag key cannot start with <code>acs:</code> or <code>aliyun</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>env</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value. The tag value can be up to 128 characters in length, and cannot contain <code>http://</code> or <code>https://</code>. The tag value cannot start with <code>acs:</code> or <code>aliyun</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>product</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListHealthCheckTemplatesResponseBodyHealthCheckTemplatesTags build(java.util.Map<String, ?> map) throws Exception {
            ListHealthCheckTemplatesResponseBodyHealthCheckTemplatesTags self = new ListHealthCheckTemplatesResponseBodyHealthCheckTemplatesTags();
            return TeaModel.build(map, self);
        }

        public ListHealthCheckTemplatesResponseBodyHealthCheckTemplatesTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListHealthCheckTemplatesResponseBodyHealthCheckTemplatesTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListHealthCheckTemplatesResponseBodyHealthCheckTemplates extends TeaModel {
        /**
         * <p>The HTTP status codes that indicate healthy backend servers.</p>
         */
        @NameInMap("HealthCheckCodes")
        public java.util.List<String> healthCheckCodes;

        /**
         * <p>The port that is used for health checks.</p>
         * <p>Valid values: \<em>\</em> 0 to 65535\<em>\</em>.</p>
         * <p>The default value is <strong>0</strong>, which specifies that the port of a backend server is used for health checks.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("HealthCheckConnectPort")
        public Integer healthCheckConnectPort;

        /**
         * <p>The domain name that is used for health checks. Valid values:</p>
         * <ul>
         * <li><strong>$SERVER_IP</strong> (default): the private IP address of a backend server. If an IP address is specified, or this parameter is not specified, the ALB instance uses the private IP address of each backend server as the domain name for health checks.</li>
         * <li><strong>domain</strong>: The domain name must be 1 to 80 characters in length, and can contain letters, digits, periods (.), and hyphens (-).</li>
         * </ul>
         * <blockquote>
         * <p> This parameter takes effect only when <code>HealthCheckProtocol</code> is set to <strong>HTTP</strong> or <strong>HTTPS</strong>. HTTPS is unavailable by default. If you want to use HTTPS, log on to the SLB console, go to the Quota Center page, click the <strong>ALB</strong> tab, and then apply for the privilege to use HTTPs.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>$_ip</p>
         */
        @NameInMap("HealthCheckHost")
        public String healthCheckHost;

        /**
         * <p>The HTTP version for health checks.</p>
         * <p>Valid values: <strong>HTTP 1.0</strong> and <strong>HTTP 1.1</strong>.</p>
         * <p>Default value: <strong>HTTP 1.1</strong>.</p>
         * <blockquote>
         * <p> This parameter takes effect only when <code>HealthCheckProtocol</code> is set to <strong>HTTP</strong> or <strong>HTTPS</strong>. HTTPS is unavailable by default. If you want to use HTTPS, log on to the SLB console, go to the Quota Center page, click the <strong>ALB</strong> tab, and then apply for the privilege to use HTTPs.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>HTTP 1.0</p>
         */
        @NameInMap("HealthCheckHttpVersion")
        public String healthCheckHttpVersion;

        /**
         * <p>The interval at which health checks are performed. Unit: seconds. Valid values: <strong>1 to 50</strong>. Default value: <strong>2</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("HealthCheckInterval")
        public Integer healthCheckInterval;

        /**
         * <p>The HTTP method that is used for health checks. Valid value:</p>
         * <ul>
         * <li><strong>HEAD</strong> (default): By default, HTTP and HTTPS health checks use the HEAD method.</li>
         * <li><strong>GET</strong>: If the length of a response exceeds 8 KB, the response is truncated. However, the health check result is not affected.</li>
         * <li><strong>POST</strong>: gRPC health checks use the POST method by default.</li>
         * </ul>
         * <blockquote>
         * <p> This parameter takes effect only when <strong>HealthCheckProtocol</strong> is set to <strong>HTTP</strong>, <strong>HTTPS</strong>, or <strong>gRPC</strong>. HTTPS is unavailable by default. If you want to use HTTPS, log on to the SLB console, go to the Quota Center page, click the <strong>ALB</strong> tab, and then apply for the privilege to use HTTPs.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>HEAD</p>
         */
        @NameInMap("HealthCheckMethod")
        public String healthCheckMethod;

        /**
         * <p>The URL path that you want to use for health checks.</p>
         * <p>The URL must be 1 to 80 characters in length, and can contain letters, digits, the following special characters: - / . % ? # &amp;, and the following extended characters: <code>_ ; ~ ! ( ) * [ ] @ $ ^ : \\&quot; , +</code>. The URL must start with a forward slash (/).</p>
         * 
         * <strong>example:</strong>
         * <p>/test/index.html</p>
         */
        @NameInMap("HealthCheckPath")
        public String healthCheckPath;

        /**
         * <p>The protocol that is used for health checks. Valid value:</p>
         * <ul>
         * <li><strong>HTTP</strong> (default): The ALB instance sends HEAD or GET requests, which simulate browser requests, to check whether the backend server is healthy.</li>
         * <li><strong>HTTPS</strong>: The ALB instance sends HEAD or GET requests, which simulate browser requests, to check whether the backend server is healthy. HTTPS provides higher security because HTTPS supports data encryption.</li>
         * <li><strong>TCP</strong>: TCP health checks send TCP SYN packets to a backend server to check whether the port of the backend server is reachable.</li>
         * <li><strong>gRPC</strong>: The ALB instance sends POST or GET requests to a backend server to check whether the backend server is healthy.</li>
         * </ul>
         * <blockquote>
         * <p> HTTPS is unavailable by default. If you want to use HTTPS, log on to the SLB console, go to the Quota Center page, click the <strong>ALB</strong> tab, and then apply for the privilege to use HTTPs.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>HTTP</p>
         */
        @NameInMap("HealthCheckProtocol")
        public String healthCheckProtocol;

        /**
         * <p>The ID of the health check template.</p>
         * 
         * <strong>example:</strong>
         * <p>hct-bp1qjwo61pqz3ahltv****</p>
         */
        @NameInMap("HealthCheckTemplateId")
        public String healthCheckTemplateId;

        /**
         * <p>The name of the health check template.</p>
         * <p>The name must be 2 to 128 character characters in length, and can contain letters, digits, periods (.), underscores (_), and hyphens (-). It must start with a letter.</p>
         * 
         * <strong>example:</strong>
         * <p>HealthCheckTemplate1</p>
         */
        @NameInMap("HealthCheckTemplateName")
        public String healthCheckTemplateName;

        /**
         * <p>The timeout period of a health check response. If a backend Elastic Compute Service (ECS) instance does not respond within the specified timeout period, the ECS instance fails to pass the health check.</p>
         * <p>Valid values: <strong>1 to 300</strong>. Unit: seconds.</p>
         * <p>Default value: <strong>5</strong>.</p>
         * <blockquote>
         * <p> If the value of <strong>HealthCHeckTimeout</strong> is smaller than the value of <strong>HealthCheckInterval</strong>, <strong>HealthCHeckTimeout</strong> does not take effect. The value of <strong>HealthCheckInterval</strong> specifies the timeout period.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("HealthCheckTimeout")
        public Integer healthCheckTimeout;

        /**
         * <p>The number of times that an unhealthy backend server must consecutively pass health checks before it is declared healthy. In this case, the health status changes from <strong>fail</strong> to <strong>success</strong>.</p>
         * <p>Valid values: <strong>2 to 10</strong>.</p>
         * <p>Default value: <strong>3</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("HealthyThreshold")
        public Integer healthyThreshold;

        /**
         * <p>The tags.</p>
         */
        @NameInMap("Tags")
        public java.util.List<ListHealthCheckTemplatesResponseBodyHealthCheckTemplatesTags> tags;

        /**
         * <p>The number of times that a healthy backend server must consecutively fail health checks before it is declared unhealthy. In this case, the health status changes from <strong>success</strong> to <strong>fail</strong>.</p>
         * <p>Valid values: <strong>2 to 10</strong>.</p>
         * <p>Default value: <strong>3</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("UnhealthyThreshold")
        public Integer unhealthyThreshold;

        public static ListHealthCheckTemplatesResponseBodyHealthCheckTemplates build(java.util.Map<String, ?> map) throws Exception {
            ListHealthCheckTemplatesResponseBodyHealthCheckTemplates self = new ListHealthCheckTemplatesResponseBodyHealthCheckTemplates();
            return TeaModel.build(map, self);
        }

        public ListHealthCheckTemplatesResponseBodyHealthCheckTemplates setHealthCheckCodes(java.util.List<String> healthCheckCodes) {
            this.healthCheckCodes = healthCheckCodes;
            return this;
        }
        public java.util.List<String> getHealthCheckCodes() {
            return this.healthCheckCodes;
        }

        public ListHealthCheckTemplatesResponseBodyHealthCheckTemplates setHealthCheckConnectPort(Integer healthCheckConnectPort) {
            this.healthCheckConnectPort = healthCheckConnectPort;
            return this;
        }
        public Integer getHealthCheckConnectPort() {
            return this.healthCheckConnectPort;
        }

        public ListHealthCheckTemplatesResponseBodyHealthCheckTemplates setHealthCheckHost(String healthCheckHost) {
            this.healthCheckHost = healthCheckHost;
            return this;
        }
        public String getHealthCheckHost() {
            return this.healthCheckHost;
        }

        public ListHealthCheckTemplatesResponseBodyHealthCheckTemplates setHealthCheckHttpVersion(String healthCheckHttpVersion) {
            this.healthCheckHttpVersion = healthCheckHttpVersion;
            return this;
        }
        public String getHealthCheckHttpVersion() {
            return this.healthCheckHttpVersion;
        }

        public ListHealthCheckTemplatesResponseBodyHealthCheckTemplates setHealthCheckInterval(Integer healthCheckInterval) {
            this.healthCheckInterval = healthCheckInterval;
            return this;
        }
        public Integer getHealthCheckInterval() {
            return this.healthCheckInterval;
        }

        public ListHealthCheckTemplatesResponseBodyHealthCheckTemplates setHealthCheckMethod(String healthCheckMethod) {
            this.healthCheckMethod = healthCheckMethod;
            return this;
        }
        public String getHealthCheckMethod() {
            return this.healthCheckMethod;
        }

        public ListHealthCheckTemplatesResponseBodyHealthCheckTemplates setHealthCheckPath(String healthCheckPath) {
            this.healthCheckPath = healthCheckPath;
            return this;
        }
        public String getHealthCheckPath() {
            return this.healthCheckPath;
        }

        public ListHealthCheckTemplatesResponseBodyHealthCheckTemplates setHealthCheckProtocol(String healthCheckProtocol) {
            this.healthCheckProtocol = healthCheckProtocol;
            return this;
        }
        public String getHealthCheckProtocol() {
            return this.healthCheckProtocol;
        }

        public ListHealthCheckTemplatesResponseBodyHealthCheckTemplates setHealthCheckTemplateId(String healthCheckTemplateId) {
            this.healthCheckTemplateId = healthCheckTemplateId;
            return this;
        }
        public String getHealthCheckTemplateId() {
            return this.healthCheckTemplateId;
        }

        public ListHealthCheckTemplatesResponseBodyHealthCheckTemplates setHealthCheckTemplateName(String healthCheckTemplateName) {
            this.healthCheckTemplateName = healthCheckTemplateName;
            return this;
        }
        public String getHealthCheckTemplateName() {
            return this.healthCheckTemplateName;
        }

        public ListHealthCheckTemplatesResponseBodyHealthCheckTemplates setHealthCheckTimeout(Integer healthCheckTimeout) {
            this.healthCheckTimeout = healthCheckTimeout;
            return this;
        }
        public Integer getHealthCheckTimeout() {
            return this.healthCheckTimeout;
        }

        public ListHealthCheckTemplatesResponseBodyHealthCheckTemplates setHealthyThreshold(Integer healthyThreshold) {
            this.healthyThreshold = healthyThreshold;
            return this;
        }
        public Integer getHealthyThreshold() {
            return this.healthyThreshold;
        }

        public ListHealthCheckTemplatesResponseBodyHealthCheckTemplates setTags(java.util.List<ListHealthCheckTemplatesResponseBodyHealthCheckTemplatesTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListHealthCheckTemplatesResponseBodyHealthCheckTemplatesTags> getTags() {
            return this.tags;
        }

        public ListHealthCheckTemplatesResponseBodyHealthCheckTemplates setUnhealthyThreshold(Integer unhealthyThreshold) {
            this.unhealthyThreshold = unhealthyThreshold;
            return this;
        }
        public Integer getUnhealthyThreshold() {
            return this.unhealthyThreshold;
        }

    }

}
