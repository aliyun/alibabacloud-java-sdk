// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnUserConfigsResponseBody extends TeaModel {
    /**
     * <p>>You can call this operation up to 30 times per second per account.</p>
     */
    @NameInMap("Configs")
    public java.util.List<DescribeDcdnUserConfigsResponseBodyConfigs> configs;

    /**
     * <p>The configuration returned.</p>
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
         * <p>The configuration returned.</p>
         */
        @NameInMap("ArgName")
        public String argName;

        /**
         * <p>The value of the configuration. Valid values:</p>
         * <br>
         * <p>*   cc_rule: HTTP flood protection</p>
         * <p>*   ddos_dispatch: DDoS mitigation</p>
         * <p>*   edge_safe: application security on edge nodes</p>
         * <p>*   blocked_regions: region blacklist</p>
         * <p>*   http_acl_policy: precise access control</p>
         * <p>*   bot_manager: bot traffic management</p>
         * <p>*   ip_reputation: IP reputation library</p>
         */
        @NameInMap("ArgValue")
        public String argValue;

        /**
         * <p>The configuration that you want to query. Valid values:</p>
         * <br>
         * <p>*   domain_business_control: user configurations</p>
         * <p>*   bot_basic: the basic edition of bot traffic management, which supports authorized crawlers and provides threat intelligence</p>
         * <p>*   bot_Advance: the advanced edition of bot traffic management, which supports authorized crawlers and AI intelligent protection and provides threat intelligence</p>
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
