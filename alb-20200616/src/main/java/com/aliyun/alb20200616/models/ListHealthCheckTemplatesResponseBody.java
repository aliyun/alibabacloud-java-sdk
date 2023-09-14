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
     * <p>The number of entries returned per page. Valid values: **1** to **100**. Default value: **20**.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The returned value of NextToken is a pagination token, which can be used in the next request to retrieve a new page of results. Valid values:</p>
     * <br>
     * <p>*   If **NextToken** is empty, no next page exists.</p>
     * <p>*   If a value of **NextToken** was returned in the previous query, specify the value to obtain the next set of results.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
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
        @NameInMap("Key")
        public String key;

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
         * <p>The status code.</p>
         */
        @NameInMap("HealthCheckCodes")
        public java.util.List<String> healthCheckCodes;

        /**
         * <p>The port that is used for health checks.</p>
         * <br>
         * <p>Valid values: \*\* 0 to 65535\*\*.</p>
         * <br>
         * <p>Default value: **0**. If you set the value to 0, the port of a backend server is used for health checks.</p>
         */
        @NameInMap("HealthCheckConnectPort")
        public Integer healthCheckConnectPort;

        /**
         * <p>The domain name that is used for health checks. Valid values:</p>
         * <br>
         * <p>**$SERVER_IP** (default): the private IP addresses of backend servers. If you do not set the HealthCheckHost parameter or set the parameter to $SERVER_IP, the Application Load Balancer (ALB) uses the private IP addresses of backend servers for health checks.</p>
         * <br>
         * <p>**domain**: The domain name must be 1 to 80 characters in length and can contain letters, digits, periods (.), and hyphens (-).</p>
         * <br>
         * <p>> This parameter is valid only if the `HealthCheckProtocol` parameter is set to **HTTP**.</p>
         */
        @NameInMap("HealthCheckHost")
        public String healthCheckHost;

        /**
         * <p>The HTTP version that is used for health checks.</p>
         * <br>
         * <p>Valid values: **HTTP 1.0** and **HTTP 1.1**.</p>
         * <br>
         * <p>Default value: **HTTP 1.1**.</p>
         * <br>
         * <p>> This parameter is valid only if the `HealthCheckProtocol` parameter is set to **HTTP**.</p>
         */
        @NameInMap("HealthCheckHttpVersion")
        public String healthCheckHttpVersion;

        /**
         * <p>The interval at which health checks are performed. Unit: seconds. Valid values: **1 to 50**. Default value: **2**.</p>
         */
        @NameInMap("HealthCheckInterval")
        public Integer healthCheckInterval;

        /**
         * <p>The method that you want to use for the health check. Valid values:</p>
         * <br>
         * <p>*   **HEAD**: By default, the ALB instance sends HEAD requests to a backend server to perform HTTP health checks.</p>
         * <p>*   **GET**: If the length of a response exceeds 8 KB, the response is truncated. However, the health check result is not affected.</p>
         * <p>*   **POST**: gRPC health checks automatically use the POST method.</p>
         * <br>
         * <p>> This parameter takes effect only when the **HealthCheckProtocol** parameter is set to **HTTP** or **gRPC**.</p>
         */
        @NameInMap("HealthCheckMethod")
        public String healthCheckMethod;

        /**
         * <p>The URL that is used for health checks.</p>
         * <br>
         * <p>The URL must be 1 to 80 characters in length and can contain only letters, digits, hyphens (-), forward slashes (/), periods (.), percent signs (%), question marks (?), number signs (#), and ampersands (&). The URL can also contain the following extended characters: `_ ; ~ ! ( ) * [ ] @ $ ^ : \" , +`. The URL must start with a forward slash (/).</p>
         */
        @NameInMap("HealthCheckPath")
        public String healthCheckPath;

        /**
         * <p>The protocol that you want to use for health checks. Valid values:</p>
         * <br>
         * <p>*   **HTTP** (default): To perform HTTP health checks, ALB sends HEAD or GET requests to a backend server to check whether the backend server is healthy.</p>
         * <p>*   **TCP**: To perform TCP health checks, ALB sends SYN packets to a backend server to check whether the port of the backend server is available to receive requests.</p>
         * <p>*   **gRPC**: To perform gRPC health checks, ALB sends POST or GET requests to a backend server to check whether the backend server is healthy.</p>
         */
        @NameInMap("HealthCheckProtocol")
        public String healthCheckProtocol;

        /**
         * <p>The ID of the health check template.</p>
         */
        @NameInMap("HealthCheckTemplateId")
        public String healthCheckTemplateId;

        /**
         * <p>The name of the health check template.</p>
         * <br>
         * <p>The name must be 2 to 128 characters in length, and can contain letters, digits, periods (.), underscores (\_), and hyphens (-). The name must start with a letter.</p>
         */
        @NameInMap("HealthCheckTemplateName")
        public String healthCheckTemplateName;

        /**
         * <p>The timeout period of a health check response. If a backend Elastic Compute Service (ECS) instance does not return a health check response within the specified timeout period, the server fails the health check.</p>
         * <br>
         * <p>Valid values: **1 to 300**. Unit: seconds.</p>
         * <br>
         * <p>Default value: **5**.</p>
         * <br>
         * <p>> If the value of the **HealthCheckTimeout** parameter is smaller than that of the **HealthCheckInterval** parameter, the timeout period specified by the **HealthCheckTimeout** parameter is ignored and the value of the **HealthCheckInterval** parameter is used as the timeout period.</p>
         */
        @NameInMap("HealthCheckTimeout")
        public Integer healthCheckTimeout;

        /**
         * <p>The number of times that an unhealthy backend server must consecutively pass health checks before it is declared healthy. In this case, the health status is changed from **fail** to **success**.</p>
         * <br>
         * <p>Valid values: **2 to 10**.</p>
         * <br>
         * <p>Default value: **3**.</p>
         */
        @NameInMap("HealthyThreshold")
        public Integer healthyThreshold;

        @NameInMap("Tags")
        public java.util.List<ListHealthCheckTemplatesResponseBodyHealthCheckTemplatesTags> tags;

        /**
         * <p>The number of times that a healthy backend server must consecutively fail health checks before it is declared unhealthy. In this case, the health status is changed from **success** to **fail**.</p>
         * <br>
         * <p>Valid values: **2 to 10**.</p>
         * <br>
         * <p>Default value: **3**.</p>
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
