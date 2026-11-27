// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class ListHealthCheckTemplatesResponseBody extends TeaModel {
    /**
     * <p>The list of health check templates.</p>
     */
    @NameInMap("HealthCheckTemplates")
    public java.util.List<ListHealthCheckTemplatesResponseBodyHealthCheckTemplates> healthCheckTemplates;

    /**
     * <p>The number of entries to return per page. Valid values: <strong>1</strong> to <strong>100</strong>. Default value: <strong>20</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token. Valid values:</p>
     * <ul>
     * <li>If <strong>NextToken</strong> is empty, no next query is available.</li>
     * <li>If <strong>NextToken</strong> is returned, the value indicates the token for the next query.</li>
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
     * <p>365F4154-92F6-4AE4-92F8-7FF3******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of records returned for the current request.</p>
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
         * <p>The tag key. The key can be up to 128 characters in length, and cannot start with <code>aliyun</code> or <code>acs:</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>env</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value. The value can be up to 128 characters in length, and cannot start with <code>aliyun</code> or <code>acs:</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
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
         * <p>The list of status codes that indicate a successful health check.</p>
         */
        @NameInMap("HealthCheckCodes")
        public java.util.List<String> healthCheckCodes;

        /**
         * <p>The port used for health checks.</p>
         * <p>Valid values: <strong>0</strong> to <strong>65535</strong>.</p>
         * <p>Default value: <strong>0</strong>, which indicates that the port of the backend server is used for health checks.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("HealthCheckConnectPort")
        public Integer healthCheckConnectPort;

        /**
         * <p>The domain name used for health checks. Valid values:</p>
         * <ul>
         * <li><p><strong>$SERVER_IP</strong> (default): the private IP of the backend server. If you specify an IP address or leave this parameter empty, load balancing uses the private IP of each backend server as the domain name for health checks.</p>
         * </li>
         * <li><p><strong>domain</strong>: The domain name must be 1 to 80 characters in length, and can contain only letters, digits, periods (.), and hyphens (-).</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>This parameter takes effect only when <code>HealthCheckProtocol</code> is set to <strong>HTTP</strong> or <strong>HTTPS</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>$SERVER_IP</p>
         */
        @NameInMap("HealthCheckHost")
        public String healthCheckHost;

        /**
         * <p>The HTTP version used for health checks.</p>
         * <p>Valid values: <strong>HTTP 1.0</strong> and <strong>HTTP 1.1</strong>.</p>
         * <p>Default value: <strong>HTTP 1.1</strong>.</p>
         * <blockquote>
         * <p>This parameter takes effect only when <code>HealthCheckProtocol</code> is set to <strong>HTTP</strong> or <strong>HTTPS</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>HTTP 1.0</p>
         */
        @NameInMap("HealthCheckHttpVersion")
        public String healthCheckHttpVersion;

        /**
         * <p>The interval between two consecutive health checks. Unit: seconds. Valid values: <strong>1</strong> to <strong>50</strong>. Default value: <strong>2</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("HealthCheckInterval")
        public Integer healthCheckInterval;

        /**
         * <p>The health check method. Valid values:</p>
         * <ul>
         * <li><p><strong>HEAD</strong> (default): The default method for HTTP and HTTPS health checks.</p>
         * </li>
         * <li><p><strong>GET</strong>: If the length of the response message exceeds 8 KB, the message is truncated. However, the truncation does not affect the health check result.</p>
         * </li>
         * <li><p><strong>POST</strong>: The default method for gRPC health checks.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>This parameter takes effect only when <strong>HealthCheckProtocol</strong> is set to <strong>HTTP</strong>, <strong>HTTPS</strong>, or <strong>gRPC</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>HEAD</p>
         */
        @NameInMap("HealthCheckMethod")
        public String healthCheckMethod;

        /**
         * <p>The URL used for health checks.</p>
         * <p>The URL must be 1 to 80 characters in length and can contain only letters, digits, hyphens (-), forward slashes (/), periods (.), percent signs (%), question marks (?), number signs (#), ampersands (&amp;), and the following extended characters: <code>_;~!()*[]@$^:\&quot;,+</code>. The URL must start with a forward slash (/).</p>
         * 
         * <strong>example:</strong>
         * <p>/test/index.html</p>
         */
        @NameInMap("HealthCheckPath")
        public String healthCheckPath;

        /**
         * <p>The protocol used for health checks. Valid values:</p>
         * <ul>
         * <li><p><strong>HTTP</strong> (default): sends HEAD or GET requests to perform browser access impersonation and check whether the server application is healthy.</p>
         * </li>
         * <li><p><strong>HTTPS</strong>: sends HEAD or GET requests to perform browser access impersonation and check whether the server application is healthy. (With data encryption, it is more secure than HTTP.)</p>
         * </li>
         * <li><p><strong>TCP</strong>: sends SYN handshake messages to check whether the server port is alive.</p>
         * </li>
         * <li><p><strong>gRPC</strong>: sends POST or GET requests to check whether the server application is healthy.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>HTTP</p>
         */
        @NameInMap("HealthCheckProtocol")
        public String healthCheckProtocol;

        /**
         * <p>The health check template ID.</p>
         * 
         * <strong>example:</strong>
         * <p>hct-bp1qjwo61pqz3ahltv****</p>
         */
        @NameInMap("HealthCheckTemplateId")
        public String healthCheckTemplateId;

        /**
         * <p>The health check template name.</p>
         * <p>The name must be 2 to 128 characters in length, and must start with a letter or a Chinese character. It can contain digits, periods (.), underscores (_), and hyphens (-).</p>
         * 
         * <strong>example:</strong>
         * <p>HealthCheckTemplate1</p>
         */
        @NameInMap("HealthCheckTemplateName")
        public String healthCheckTemplateName;

        /**
         * <p>The timeout period for receiving a response from a health check. If the backend ECS instance does not return a correct response within the specified timeout period, the health check is considered failed.</p>
         * <p>Valid values: <strong>1</strong> to <strong>300</strong>. Unit: seconds.</p>
         * <p>Default value: <strong>5</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("HealthCheckTimeout")
        public Integer healthCheckTimeout;

        /**
         * <p>The number of consecutive successful health checks required to change the health check status of a backend server from <strong>Failed</strong> to <strong>Successful</strong>.</p>
         * <p>Valid values: <strong>2</strong> to <strong>10</strong>.</p>
         * <p>Default value: <strong>3</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("HealthyThreshold")
        public Integer healthyThreshold;

        /**
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-atstuj3rtop****</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The tags.</p>
         */
        @NameInMap("Tags")
        public java.util.List<ListHealthCheckTemplatesResponseBodyHealthCheckTemplatesTags> tags;

        /**
         * <p>The number of consecutive failed health checks required to change the health check status of a backend server from <strong>Successful</strong> to <strong>Failed</strong>.</p>
         * <p>Valid values: <strong>2</strong> to <strong>10</strong>.</p>
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

        public ListHealthCheckTemplatesResponseBodyHealthCheckTemplates setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
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
