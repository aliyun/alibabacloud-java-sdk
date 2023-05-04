// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnUserConfigsResponseBody extends TeaModel {
    /**
     * <p>>  The maximum number of times that each user can call this operation per second is 30.</p>
     */
    @NameInMap("Configs")
    public java.util.List<DescribeCdnUserConfigsResponseBodyConfigs> configs;

    /**
     * <p>The name of the feature.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeCdnUserConfigsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCdnUserConfigsResponseBody self = new DescribeCdnUserConfigsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCdnUserConfigsResponseBody setConfigs(java.util.List<DescribeCdnUserConfigsResponseBodyConfigs> configs) {
        this.configs = configs;
        return this;
    }
    public java.util.List<DescribeCdnUserConfigsResponseBodyConfigs> getConfigs() {
        return this.configs;
    }

    public DescribeCdnUserConfigsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeCdnUserConfigsResponseBodyConfigs extends TeaModel {
        /**
         * <p>The name of the feature.</p>
         */
        @NameInMap("ArgName")
        public String argName;

        /**
         * <p>The value of the configuration. Valid values:</p>
         * <br>
         * <p>*   **cc_rule**: HTTP flood protection rules</p>
         * <p>*   **ddos_dispatch**: integration with Anti-DDoS</p>
         * <p>*   **edge_safe**: application security settings on edge nodes</p>
         * <p>*   **blocked_regions**: blocked regions</p>
         * <p>*   **http_acl_policy**: access control list (ACL) rules</p>
         * <p>*   **bot_manager**: bot traffic management</p>
         * <p>*   **ip_reputation**: IP reputation library</p>
         */
        @NameInMap("ArgValue")
        public String argValue;

        /**
         * <p>The configuration item that you want to query. Valid values:</p>
         * <br>
         * <p>*   **domain_business_control**: Alibaba Cloud CDN configurations</p>
         * <p>*   **waf**: Web Application Firewall (WAF) configurations</p>
         */
        @NameInMap("FunctionName")
        public String functionName;

        public static DescribeCdnUserConfigsResponseBodyConfigs build(java.util.Map<String, ?> map) throws Exception {
            DescribeCdnUserConfigsResponseBodyConfigs self = new DescribeCdnUserConfigsResponseBodyConfigs();
            return TeaModel.build(map, self);
        }

        public DescribeCdnUserConfigsResponseBodyConfigs setArgName(String argName) {
            this.argName = argName;
            return this;
        }
        public String getArgName() {
            return this.argName;
        }

        public DescribeCdnUserConfigsResponseBodyConfigs setArgValue(String argValue) {
            this.argValue = argValue;
            return this;
        }
        public String getArgValue() {
            return this.argValue;
        }

        public DescribeCdnUserConfigsResponseBodyConfigs setFunctionName(String functionName) {
            this.functionName = functionName;
            return this;
        }
        public String getFunctionName() {
            return this.functionName;
        }

    }

}
