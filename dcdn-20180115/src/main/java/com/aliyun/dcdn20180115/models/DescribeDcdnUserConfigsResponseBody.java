// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnUserConfigsResponseBody extends TeaModel {
    /**
     * <p>The user configurations.</p>
     */
    @NameInMap("Configs")
    public java.util.List<DescribeDcdnUserConfigsResponseBodyConfigs> configs;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>06D29681-B7CD-4034-A8CC-28AFFA213539</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDcdnUserConfigsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnUserConfigsResponseBody self = new DescribeDcdnUserConfigsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnUserConfigsResponseBody setConfigs(java.util.List<DescribeDcdnUserConfigsResponseBodyConfigs> configs) {
        this.configs = configs;
        return this;
    }
    public java.util.List<DescribeDcdnUserConfigsResponseBodyConfigs> getConfigs() {
        return this.configs;
    }

    public DescribeDcdnUserConfigsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDcdnUserConfigsResponseBodyConfigs extends TeaModel {
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
         * <li>cc_rule: HTTP flood protection</li>
         * <li>ddos_dispatch: DDoS mitigation</li>
         * <li>edge_safe: application security on points of presence (POPs)</li>
         * <li>blocked_regions: region blacklist</li>
         * <li>http_acl_policy: precise access control</li>
         * <li>bot_manager: bot traffic management</li>
         * <li>ip_reputation: IP reputation library</li>
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

        public static DescribeDcdnUserConfigsResponseBodyConfigs build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnUserConfigsResponseBodyConfigs self = new DescribeDcdnUserConfigsResponseBodyConfigs();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnUserConfigsResponseBodyConfigs setArgName(String argName) {
            this.argName = argName;
            return this;
        }
        public String getArgName() {
            return this.argName;
        }

        public DescribeDcdnUserConfigsResponseBodyConfigs setArgValue(String argValue) {
            this.argValue = argValue;
            return this;
        }
        public String getArgValue() {
            return this.argValue;
        }

        public DescribeDcdnUserConfigsResponseBodyConfigs setFunctionName(String functionName) {
            this.functionName = functionName;
            return this;
        }
        public String getFunctionName() {
            return this.functionName;
        }

    }

}
