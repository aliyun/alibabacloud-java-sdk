// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class UpdateForwardingRulesRequest extends TeaModel {
    /**
     * <p>The GA instance ID.</p>
     */
    @NameInMap("AcceleratorId")
    public String acceleratorId;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <br>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
     * <br>
     * <p>>  If you do not specify this parameter, the system automatically uses the **request ID** as the **client token**. The **request ID** may be different for each request.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The configurations of the forwarding rules.</p>
     */
    @NameInMap("ForwardingRules")
    public java.util.List<UpdateForwardingRulesRequestForwardingRules> forwardingRules;

    /**
     * <p>The listener ID.</p>
     */
    @NameInMap("ListenerId")
    public String listenerId;

    /**
     * <p>The region ID of the GA instance. Set the value to **cn-hangzhou**.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static UpdateForwardingRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateForwardingRulesRequest self = new UpdateForwardingRulesRequest();
        return TeaModel.build(map, self);
    }

    public UpdateForwardingRulesRequest setAcceleratorId(String acceleratorId) {
        this.acceleratorId = acceleratorId;
        return this;
    }
    public String getAcceleratorId() {
        return this.acceleratorId;
    }

    public UpdateForwardingRulesRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateForwardingRulesRequest setForwardingRules(java.util.List<UpdateForwardingRulesRequestForwardingRules> forwardingRules) {
        this.forwardingRules = forwardingRules;
        return this;
    }
    public java.util.List<UpdateForwardingRulesRequestForwardingRules> getForwardingRules() {
        return this.forwardingRules;
    }

    public UpdateForwardingRulesRequest setListenerId(String listenerId) {
        this.listenerId = listenerId;
        return this;
    }
    public String getListenerId() {
        return this.listenerId;
    }

    public UpdateForwardingRulesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public static class UpdateForwardingRulesRequestForwardingRulesRuleActionsForwardGroupConfigServerGroupTuples extends TeaModel {
        /**
         * <p>The ID of an endpoint group.</p>
         * <br>
         * <p>>  We recommend that you use **RuleActionType** and **RuleActionValue** rather than this parameter to configure forwarding actions.</p>
         */
        @NameInMap("EndpointGroupId")
        public String endpointGroupId;

        public static UpdateForwardingRulesRequestForwardingRulesRuleActionsForwardGroupConfigServerGroupTuples build(java.util.Map<String, ?> map) throws Exception {
            UpdateForwardingRulesRequestForwardingRulesRuleActionsForwardGroupConfigServerGroupTuples self = new UpdateForwardingRulesRequestForwardingRulesRuleActionsForwardGroupConfigServerGroupTuples();
            return TeaModel.build(map, self);
        }

        public UpdateForwardingRulesRequestForwardingRulesRuleActionsForwardGroupConfigServerGroupTuples setEndpointGroupId(String endpointGroupId) {
            this.endpointGroupId = endpointGroupId;
            return this;
        }
        public String getEndpointGroupId() {
            return this.endpointGroupId;
        }

    }

    public static class UpdateForwardingRulesRequestForwardingRulesRuleActionsForwardGroupConfig extends TeaModel {
        /**
         * <p>The configuration of an endpoint group.</p>
         * <br>
         * <p>>  We recommend that you use **RuleActionType** and **RuleActionValue** rather than this parameter to configure forwarding actions.</p>
         */
        @NameInMap("ServerGroupTuples")
        public java.util.List<UpdateForwardingRulesRequestForwardingRulesRuleActionsForwardGroupConfigServerGroupTuples> serverGroupTuples;

        public static UpdateForwardingRulesRequestForwardingRulesRuleActionsForwardGroupConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateForwardingRulesRequestForwardingRulesRuleActionsForwardGroupConfig self = new UpdateForwardingRulesRequestForwardingRulesRuleActionsForwardGroupConfig();
            return TeaModel.build(map, self);
        }

        public UpdateForwardingRulesRequestForwardingRulesRuleActionsForwardGroupConfig setServerGroupTuples(java.util.List<UpdateForwardingRulesRequestForwardingRulesRuleActionsForwardGroupConfigServerGroupTuples> serverGroupTuples) {
            this.serverGroupTuples = serverGroupTuples;
            return this;
        }
        public java.util.List<UpdateForwardingRulesRequestForwardingRulesRuleActionsForwardGroupConfigServerGroupTuples> getServerGroupTuples() {
            return this.serverGroupTuples;
        }

    }

    public static class UpdateForwardingRulesRequestForwardingRulesRuleActions extends TeaModel {
        /**
         * <p>The forwarding configuration.</p>
         * <br>
         * <p>>  We recommend that you use **RuleActionType** and **RuleActionValue** rather than this parameter to configure forwarding actions.</p>
         */
        @NameInMap("ForwardGroupConfig")
        public UpdateForwardingRulesRequestForwardingRulesRuleActionsForwardGroupConfig forwardGroupConfig;

        /**
         * <p>The forwarding priority.</p>
         * <br>
         * <p>>  This parameter does not take effect. Ignore this parameter.</p>
         */
        @NameInMap("Order")
        public Integer order;

        /**
         * <p>The type of the forwarding action. Valid values:</p>
         * <br>
         * <p>*   **ForwardGroup**: forwards a request.</p>
         * <p>*   **Redirect**: redirects a request.</p>
         * <p>*   **FixResponse**: returns a fixed response.</p>
         * <p>*   **Rewrite**: rewrites a request.</p>
         * <p>*   **AddHeader**: adds a header to a request.</p>
         * <p>*   **RemoveHeader**: deletes the header of a request.</p>
         */
        @NameInMap("RuleActionType")
        public String ruleActionType;

        /**
         * <p>The value of the forwarding action.</p>
         * <br>
         * <p>You must specify different JSON strings based on the value of **RuleActionType**.</p>
         * <br>
         * <p>A forwarding rule can contain only one forwarding action whose type is **ForwardGroup**, **Redirect**, or **FixResponse**. You must specify a forwarding action whose type is **Rewrite**, **AddHeader**, or **RemoveHeader** before a forwarding action whose type is **ForwardGroup**.</p>
         * <br>
         * <p>*   If you set **RuleActionType** to **ForwardGroup**, this parameter specifies the information of a virtual endpoint group. You can forward requests to only one virtual endpoint group. Example: `{"type":"endpointgroup", "value":"epg-bp1enpdcrqhl78g6r****"}`.</p>
         * <br>
         * <p>    *   `type`: Set this parameter to `endpointgroup`.</p>
         * <p>    *   `value`: Set this parameter to the ID of a virtual endpoint group.</p>
         * <br>
         * <p>*   If you set **RuleActionType** to **Redirect**, this parameter specifies the redirect configuration. You cannot leave all the following parameters empty or use the default values for all the following parameters for a forwarding action whose type is **Redirect**: `protocol`, `domain`, `port`, `path`, and `query`. Example: `{"protocol":"HTTP", "domain":"www.example.com", "port":"80", "path":"/a","query":"value1", "code":"301" }`.</p>
         * <br>
         * <p>    *   `protocol`: the protocol of requests after the requests are redirected. Valid values: `${protocol}` (default), `HTTP`, and `HTTPS`.</p>
         * <p>    *   `domain`: the domain name to which requests are redirected. Default value: `${host}`. You can also enter a domain name. The domain name must be 3 to 128 characters in length, and can contain only letters, digits, and the following special characters: `. - ? = ~ _ - + / ^ * ! $ & | ( ) [ ]`.</p>
         * <p>    *   `port`: the port to which requests are redirected. Default value: `${port}`. You can enter a port number that ranges from 1 to 63335.</p>
         * <p>    *   `path`: the path to which requests are redirected. Default value: `${path}`. The path must be 1 to 128 characters in length. To use a regular expression, the path can contain letters, digits, and the following special characters: `. - _ / = ? ~ ^ * $ : ( ) [ ] + |`. The path must start with a tilde (~). If you do not want to use a regular expression, the path can contain letters, digits, and the following special characters: `. - _ / = ? :`. The path must start with a forward slash (/).</p>
         * <p>    *   `query`: the query string to which requests are redirected. Default value: `${query}`. You can also specify a query string. The query string must be 1 to 128 characters in length, and can contain printable characters whose ASCII values are `greater than or equal to 32 and smaller than 127`. The query string cannot contain uppercase letters, space characters, or the following special characters: `[ ] { } < > # | &`.</p>
         * <p>    *   `code`: the redirect code. Valid values: `301`, `302`, `303`, `307`, and `308`.</p>
         * <br>
         * <p>*   If you set **RuleActionType** to **FixResponse**, this parameter specifies a fixed response. Example: `{"code":"200", "type":"text/plain", "content":"dssacav" }`.</p>
         * <br>
         * <p>    *   `code`: the HTTP response status code. The response status code must be one of the following numeric strings: `2xx`, `4xx`, and `5xx`. The letter `x` is a digit.</p>
         * <p>    *   `type`: the type of the response content. Valid values: **text/plain**, **text/css**, **text/html**, **application/javascript**, and **application/json**.</p>
         * <p>    *   `content`: the response content. The response content cannot exceed 1,000 characters in length and does not support Chinese characters.</p>
         * <br>
         * <p>*   If you set **RuleActionType** to **AddHeader**, this parameter specifies an HTTP header to be added. If a forwarding rule contains a forwarding action whose type is **AddHeader**, you must specify another forwarding action whose type is **ForwardGroup**. Example: `[{"name":"header1","type":"userdefined", "value":"value"}]`.</p>
         * <br>
         * <p>    *   `name`: the name of the HTTP header. The name must be 1 to 40 characters in length, and can contain letters, digits, hyphens (-), and underscores (\_). The name of the HTTP header specified by **AddHeader** must be unique and cannot be the same as the name of the HTTP header specified by **RemoveHeader**.</p>
         * <p>    *   `type`: the content type of the HTTP header. Valid values: `user-defined`, `ref`, and `system-defined`.</p>
         * <p>    *   `value`: the content of the HTTP header. You cannot leave this parameter empty. If you set `type` to `user-defined`, the content must be 1 to 128 characters in length, and can contain printable characters whose ASCII values are `greater than or equal to 32 and smaller than 127`. The content can contain letters, digits, hyphens (-), and underscores (\_). The content cannot start or end with a space character. If you set `type` to `ref`, the content must be 1 to 128 characters in length, and can contain letters, digits, hyphens (-), and underscores (\_). The content cannot start or end with a space character. If you set `type` to `system-defined`, only `ClientSrcIp` is supported.**</p>
         * <br>
         * <p>*   If you set **RuleActionType** to **RemoveHeader**, this parameter specifies an HTTP header to be removed. If a forwarding rule contains a forwarding action whose type is **RemoveHeader**, you must specify another forwarding action whose type is **ForwardGroup**. The header must be 1 to 40 characters in length, and can contain letters, digits, hyphens (-), and underscores (\_). Example: `["header1"]`.</p>
         * <br>
         * <p>*   If you set **RuleActionType** to **Rewrite**, this parameter specifies the rewriting configuration. If a forwarding rule contains a forwarding action whose type is **Rewrite**, you must specify another forwarding action whose type is **ForwardGroup**. Example: `{"domain":"value1", "path":"value2", "query":"value3"}`.</p>
         * <br>
         * <p>    *   `domain`: the domain name to which requests are redirected. Default value: `${host}`. You can also enter a domain name. The domain name must be 3 to 128 characters in length, and can contain only lowercase letters, digits, and the following special characters: `. - ? = ~ _ - + / ^ * ! $ & | ( ) [ ]`.</p>
         * <p>    *   `path`: the path to which requests are redirected. Default value: `${path}`. The path must be 1 to 128 characters in length. To use a regular expression, the path can contain letters, digits, and the following special characters: `. - _ / = ? ~ ^ * $ : ( ) [ ] + |`. The path must start with a tilde (~). If you do not want to use a regular expression, the path can contain letters, digits, and the following special characters: `. - _ / = ? :`. The path must start with a forward slash (/).</p>
         * <p>    *   `query`: the query string to which requests are redirected. Default value: `${query}`. You can also specify a query string. The query string must be 1 to 128 characters in length, and can contain printable characters whose ASCII values are `greater than or equal to 32 and smaller than 127`. The query string cannot contain uppercase letters, space characters, or the following special characters: `[ ] { } < > # | &`.</p>
         */
        @NameInMap("RuleActionValue")
        public String ruleActionValue;

        public static UpdateForwardingRulesRequestForwardingRulesRuleActions build(java.util.Map<String, ?> map) throws Exception {
            UpdateForwardingRulesRequestForwardingRulesRuleActions self = new UpdateForwardingRulesRequestForwardingRulesRuleActions();
            return TeaModel.build(map, self);
        }

        public UpdateForwardingRulesRequestForwardingRulesRuleActions setForwardGroupConfig(UpdateForwardingRulesRequestForwardingRulesRuleActionsForwardGroupConfig forwardGroupConfig) {
            this.forwardGroupConfig = forwardGroupConfig;
            return this;
        }
        public UpdateForwardingRulesRequestForwardingRulesRuleActionsForwardGroupConfig getForwardGroupConfig() {
            return this.forwardGroupConfig;
        }

        public UpdateForwardingRulesRequestForwardingRulesRuleActions setOrder(Integer order) {
            this.order = order;
            return this;
        }
        public Integer getOrder() {
            return this.order;
        }

        public UpdateForwardingRulesRequestForwardingRulesRuleActions setRuleActionType(String ruleActionType) {
            this.ruleActionType = ruleActionType;
            return this;
        }
        public String getRuleActionType() {
            return this.ruleActionType;
        }

        public UpdateForwardingRulesRequestForwardingRulesRuleActions setRuleActionValue(String ruleActionValue) {
            this.ruleActionValue = ruleActionValue;
            return this;
        }
        public String getRuleActionValue() {
            return this.ruleActionValue;
        }

    }

    public static class UpdateForwardingRulesRequestForwardingRulesRuleConditionsHostConfig extends TeaModel {
        /**
         * <p>The domain name configuration.</p>
         * <br>
         * <p>>  We recommend that you use **RuleConditionType** and **RuleConditionValue** rather than this parameter to configure forwarding conditions.</p>
         */
        @NameInMap("Values")
        public java.util.List<String> values;

        public static UpdateForwardingRulesRequestForwardingRulesRuleConditionsHostConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateForwardingRulesRequestForwardingRulesRuleConditionsHostConfig self = new UpdateForwardingRulesRequestForwardingRulesRuleConditionsHostConfig();
            return TeaModel.build(map, self);
        }

        public UpdateForwardingRulesRequestForwardingRulesRuleConditionsHostConfig setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class UpdateForwardingRulesRequestForwardingRulesRuleConditionsPathConfig extends TeaModel {
        /**
         * <p>The path configuration.</p>
         * <br>
         * <p>>  We recommend that you use **RuleConditionType** and **RuleConditionValue** rather than this parameter to configure forwarding conditions.</p>
         */
        @NameInMap("Values")
        public java.util.List<String> values;

        public static UpdateForwardingRulesRequestForwardingRulesRuleConditionsPathConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateForwardingRulesRequestForwardingRulesRuleConditionsPathConfig self = new UpdateForwardingRulesRequestForwardingRulesRuleConditionsPathConfig();
            return TeaModel.build(map, self);
        }

        public UpdateForwardingRulesRequestForwardingRulesRuleConditionsPathConfig setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class UpdateForwardingRulesRequestForwardingRulesRuleConditions extends TeaModel {
        /**
         * <p>The domain name configuration.</p>
         * <br>
         * <p>>  We recommend that you use **RuleConditionType** and **RuleConditionValue** rather than this parameter to configure forwarding conditions.</p>
         */
        @NameInMap("HostConfig")
        public UpdateForwardingRulesRequestForwardingRulesRuleConditionsHostConfig hostConfig;

        /**
         * <p>The path configuration.</p>
         * <br>
         * <p>>  We recommend that you use **RuleConditionType** and **RuleConditionValue** rather than this parameter to configure forwarding conditions.</p>
         */
        @NameInMap("PathConfig")
        public UpdateForwardingRulesRequestForwardingRulesRuleConditionsPathConfig pathConfig;

        /**
         * <p>The type of the forwarding condition. Valid values:</p>
         * <br>
         * <p>*   **Host**: Requests are forwarded based on domain names.</p>
         * <p>*   **Path**: Requests are forwarded based on paths.</p>
         * <p>*   **RequestHeader**: Requests are forwarded based on HTTP headers.</p>
         * <p>*   **Query**: Requests are forwarded based on query strings.</p>
         * <p>*   **Method**: Requests are forwarded based on HTTP request methods.</p>
         * <p>*   **Cookie**: Requests are forwarded based on cookies.</p>
         * <p>*   **SourceIP**: Requests are forwarded based on source IP addresses.</p>
         */
        @NameInMap("RuleConditionType")
        public String ruleConditionType;

        /**
         * <p>The value of the forwarding condition. You must specify different JSON strings based on the value of **RuleConditionType**.</p>
         * <br>
         * <p>*   If you set **RuleConditionType** to **Host**, this parameter specifies a domain name condition. A forwarding rule can contain only one forwarding condition of the Host type. You can specify multiple domain names in a forwarding condition. The relationship between multiple domain names is OR. The domain name must be 3 to 128 characters in length and can contain letters, digits, hyphens (-), and periods (.). Supported wildcard characters are asterisks (\*) and question marks (?). Example: `["www.example.com", "www.aliyun.com"]`.</p>
         * <br>
         * <p>*   If **RuleConditionType** is set to **Path**, this parameter specifies a path condition. A forwarding rule can contain multiple forwarding conditions of the Path type. The relationship between multiple path conditions is OR. You can specify multiple paths in a forwarding condition. The relationship between multiple paths is OR. The path must be 1 to 128 characters in length, and must start with a forward slash (/). The path can contain letters, digits, and the following special characters: $ - \_ . + / & ~ @ : \". Supported wildcard characters are asterisks (\*) and question marks (?). Example: `["/a", "/b/"]`.</p>
         * <br>
         * <p>*   If you set **RuleConditionType** to **RequestHeader**, this parameter specifies an HTTP header condition that consists of key-value pairs. The header values in a forwarding condition must be unique. Example: `[{"header1":["value1","value2"]}]`.</p>
         * <br>
         * <p>    *   Key: The key of an HTTP header must be 1 to 40 characters in length, and can contain letters, digits, hyphens (-), and underscores (\_).</p>
         * <p>    *   Value: The value of an HTTP header must be 1 to 128 characters in length, and can contain printable characters whose ASCII values are `greater than or equal to 32 and less than 127`. The value cannot start or end with a space character.</p>
         * <br>
         * <p>*   If you set **RuleConditionType** to **Query**, this parameter specifies a query string condition that consists of key-value pairs. Example: `[{"query1":["value1"]}, {"query2":["value2"]}]`.</p>
         * <br>
         * <p>    *   Key: The key of an HTTP header must be 1 to 100 characters in length, and can contain printable characters whose ASCII values are `greater than or equal to 32 and less than 127`. The key cannot contain uppercase letters, space characters, or the following special characters: `[ ] { } < > \ ; / ? : @ & = + , $ % | " ^ ~`.</p>
         * <p>    *   Value: The value of an HTTP header must be 1 to 128 characters in length, and can contain printable characters whose ASCII values are `greater than or equal to 32 and less than 127`. The value cannot contain uppercase letters, space characters, or the following special characters: `[ ] { } < > \ ; / ? : @ & = + , $ % | " ^ ~`.</p>
         * <br>
         * <p>*   If you set **RuleConditionType** to **Method**, this parameter specifies an HTTP request method condition. Valid values: **HEAD**, **GET**, **POST**, **OPTIONS**, **PUT**, **PATCH**, and **DELETE**. Example: `["GET", "OPTIONS", "POST"]`.</p>
         * <br>
         * <p>*   If you set **RuleConditionType** to **Cookie**, this parameter specifies a cookie condition that consists of key-value pairs. Example: `[{"cookie1":["value1"]}, {"cookie2":["value2"]}]`.</p>
         * <br>
         * <p>    *   Key: The key of a cookie must be 1 to 100 characters in length, and can contain printable characters whose ASCII values are `greater than or equal to 32 and less than 127`. The key cannot contain uppercase letters, space characters, or the following special characters: `# [ ] { } \ | < > &`.</p>
         * <p>    *   Value: The value of a cookie must be 1 to 128 characters in length, and can contain printable characters whose ASCII values are `greater than or equal to 32 and less than 127`. The value cannot contain uppercase letters, space characters, or the following special characters: `# [ ] { } \ | < > &`.</p>
         * <br>
         * <p>*   If you set **RuleConditionType** to **SourceIP**, this parameter specifies a source IP address condition. You can specify IP addresses, such as 1.1.XX.XX/32. You can also specify CIDR blocks, such as 2.2.XX.XX/24. A forwarding rule can contain only one forwarding condition whose type is SourceIP. You can specify multiple source IP addresses in a forwarding condition. The relationship between multiple source IP addresses is OR. Example: `["1.1.XX.XX/32", "2.2.XX.XX/24"]`.</p>
         */
        @NameInMap("RuleConditionValue")
        public String ruleConditionValue;

        public static UpdateForwardingRulesRequestForwardingRulesRuleConditions build(java.util.Map<String, ?> map) throws Exception {
            UpdateForwardingRulesRequestForwardingRulesRuleConditions self = new UpdateForwardingRulesRequestForwardingRulesRuleConditions();
            return TeaModel.build(map, self);
        }

        public UpdateForwardingRulesRequestForwardingRulesRuleConditions setHostConfig(UpdateForwardingRulesRequestForwardingRulesRuleConditionsHostConfig hostConfig) {
            this.hostConfig = hostConfig;
            return this;
        }
        public UpdateForwardingRulesRequestForwardingRulesRuleConditionsHostConfig getHostConfig() {
            return this.hostConfig;
        }

        public UpdateForwardingRulesRequestForwardingRulesRuleConditions setPathConfig(UpdateForwardingRulesRequestForwardingRulesRuleConditionsPathConfig pathConfig) {
            this.pathConfig = pathConfig;
            return this;
        }
        public UpdateForwardingRulesRequestForwardingRulesRuleConditionsPathConfig getPathConfig() {
            return this.pathConfig;
        }

        public UpdateForwardingRulesRequestForwardingRulesRuleConditions setRuleConditionType(String ruleConditionType) {
            this.ruleConditionType = ruleConditionType;
            return this;
        }
        public String getRuleConditionType() {
            return this.ruleConditionType;
        }

        public UpdateForwardingRulesRequestForwardingRulesRuleConditions setRuleConditionValue(String ruleConditionValue) {
            this.ruleConditionValue = ruleConditionValue;
            return this;
        }
        public String getRuleConditionValue() {
            return this.ruleConditionValue;
        }

    }

    public static class UpdateForwardingRulesRequestForwardingRules extends TeaModel {
        /**
         * <p>The forwarding rule ID.</p>
         */
        @NameInMap("ForwardingRuleId")
        public String forwardingRuleId;

        /**
         * <p>The forwarding rule name.</p>
         * <br>
         * <p>The name must be 2 to 128 characters in length, and can contain letters, digits, periods (.), underscores (\_), and hyphens (-). The name must start with a letter.</p>
         */
        @NameInMap("ForwardingRuleName")
        public String forwardingRuleName;

        /**
         * <p>The priority of the forwarding rule. Valid values: **1** to **10000**. A smaller value specifies a higher priority.</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <p>The configurations of the forwarding actions.</p>
         */
        @NameInMap("RuleActions")
        public java.util.List<UpdateForwardingRulesRequestForwardingRulesRuleActions> ruleActions;

        /**
         * <p>The forwarding conditions.</p>
         */
        @NameInMap("RuleConditions")
        public java.util.List<UpdateForwardingRulesRequestForwardingRulesRuleConditions> ruleConditions;

        /**
         * <p>The direction in which the rule takes effect. You do not need to configure this parameter.</p>
         * <br>
         * <p>By default, this parameter is set to **request**, which specifies that the rule takes effect on requests.</p>
         */
        @NameInMap("RuleDirection")
        public String ruleDirection;

        public static UpdateForwardingRulesRequestForwardingRules build(java.util.Map<String, ?> map) throws Exception {
            UpdateForwardingRulesRequestForwardingRules self = new UpdateForwardingRulesRequestForwardingRules();
            return TeaModel.build(map, self);
        }

        public UpdateForwardingRulesRequestForwardingRules setForwardingRuleId(String forwardingRuleId) {
            this.forwardingRuleId = forwardingRuleId;
            return this;
        }
        public String getForwardingRuleId() {
            return this.forwardingRuleId;
        }

        public UpdateForwardingRulesRequestForwardingRules setForwardingRuleName(String forwardingRuleName) {
            this.forwardingRuleName = forwardingRuleName;
            return this;
        }
        public String getForwardingRuleName() {
            return this.forwardingRuleName;
        }

        public UpdateForwardingRulesRequestForwardingRules setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public UpdateForwardingRulesRequestForwardingRules setRuleActions(java.util.List<UpdateForwardingRulesRequestForwardingRulesRuleActions> ruleActions) {
            this.ruleActions = ruleActions;
            return this;
        }
        public java.util.List<UpdateForwardingRulesRequestForwardingRulesRuleActions> getRuleActions() {
            return this.ruleActions;
        }

        public UpdateForwardingRulesRequestForwardingRules setRuleConditions(java.util.List<UpdateForwardingRulesRequestForwardingRulesRuleConditions> ruleConditions) {
            this.ruleConditions = ruleConditions;
            return this;
        }
        public java.util.List<UpdateForwardingRulesRequestForwardingRulesRuleConditions> getRuleConditions() {
            return this.ruleConditions;
        }

        public UpdateForwardingRulesRequestForwardingRules setRuleDirection(String ruleDirection) {
            this.ruleDirection = ruleDirection;
            return this;
        }
        public String getRuleDirection() {
            return this.ruleDirection;
        }

    }

}
