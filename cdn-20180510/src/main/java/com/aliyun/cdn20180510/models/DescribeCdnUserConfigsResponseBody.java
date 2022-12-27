// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnUserConfigsResponseBody extends TeaModel {
    // The configurations of Alibaba Cloud CDN.
    @NameInMap("Configs")
    public java.util.List<DescribeCdnUserConfigsResponseBodyConfigs> configs;

    // The ID of the request.
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
        // The name of the parameter.
        // 
        // The configurations set by enterprise or government users.
        @NameInMap("ArgName")
        public String argName;

        // The value of the configuration. Valid values:
        // 
        // *   **cc_rule**: HTTP flood protection rules
        // *   **ddos_dispatch**: integration with Anti-DDoS
        // *   **edge_safe**: application security settings on edge nodes
        // *   **blocked_regions**: blocked regions
        // *   **http\_acl\_policy**: access control list (ACL) rules
        // *   **bot_manager**: bot traffic management
        // *   **ip_reputation**: IP reputation library
        @NameInMap("ArgValue")
        public String argValue;

        // The name of the feature.
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
