// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnUserConfigsResponseBody extends TeaModel {
    /**
     * <p>The user configurations.</p>
     */
    @NameInMap("Configs")
    public java.util.List<DescribeCdnUserConfigsResponseBodyConfigs> configs;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>06D29681-B7CD-4034-A8CC-28AFFA213539</p>
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
         * <p>The name of the configuration.</p>
         * <p>The configuration is specified by enterprise users and public service sectors.</p>
         * 
         * <strong>example:</strong>
         * <p>allow_function</p>
         */
        @NameInMap("ArgName")
        public String argName;

        /**
         * <p>The value of the configuration. Valid values:</p>
         * <ul>
         * <li><strong>cc_rule</strong>: HTTP flood protection rules</li>
         * <li><strong>ddos_dispatch</strong>: integration with Anti-DDoS</li>
         * <li><strong>edge_safe</strong>: application security settings on POPs</li>
         * <li><strong>blocked_regions</strong>: blocked regions</li>
         * <li><strong>http_acl_policy</strong>: access control list (ACL) rules</li>
         * <li><strong>bot_manager</strong>: bot traffic management</li>
         * <li><strong>ip_reputation</strong>: IP reputation library</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;dcdn_allow\&quot;:[\&quot;cc_rule\&quot;,\&quot;ddos_dispatch\&quot;]}</p>
         */
        @NameInMap("ArgValue")
        public String argValue;

        /**
         * <p>The name of the feature.</p>
         * 
         * <strong>example:</strong>
         * <p>domain_business_control</p>
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
