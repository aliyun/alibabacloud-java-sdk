// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnDomainConfigsResponseBody extends TeaModel {
    /**
     * <p>The configurations of the domain name.</p>
     */
    @NameInMap("DomainConfigs")
    public DescribeDcdnDomainConfigsResponseBodyDomainConfigs domainConfigs;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>F8AA0364-0FDB-4AD5-AC74-D69FAB8924ED</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDcdnDomainConfigsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnDomainConfigsResponseBody self = new DescribeDcdnDomainConfigsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnDomainConfigsResponseBody setDomainConfigs(DescribeDcdnDomainConfigsResponseBodyDomainConfigs domainConfigs) {
        this.domainConfigs = domainConfigs;
        return this;
    }
    public DescribeDcdnDomainConfigsResponseBodyDomainConfigs getDomainConfigs() {
        return this.domainConfigs;
    }

    public DescribeDcdnDomainConfigsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDcdnDomainConfigsResponseBodyDomainConfigsDomainConfigFunctionArgsFunctionArg extends TeaModel {
        /**
         * <p>The name of the configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>ttl</p>
         */
        @NameInMap("ArgName")
        public String argName;

        /**
         * <p>The value of the configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>13</p>
         */
        @NameInMap("ArgValue")
        public String argValue;

        public static DescribeDcdnDomainConfigsResponseBodyDomainConfigsDomainConfigFunctionArgsFunctionArg build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnDomainConfigsResponseBodyDomainConfigsDomainConfigFunctionArgsFunctionArg self = new DescribeDcdnDomainConfigsResponseBodyDomainConfigsDomainConfigFunctionArgsFunctionArg();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnDomainConfigsResponseBodyDomainConfigsDomainConfigFunctionArgsFunctionArg setArgName(String argName) {
            this.argName = argName;
            return this;
        }
        public String getArgName() {
            return this.argName;
        }

        public DescribeDcdnDomainConfigsResponseBodyDomainConfigsDomainConfigFunctionArgsFunctionArg setArgValue(String argValue) {
            this.argValue = argValue;
            return this;
        }
        public String getArgValue() {
            return this.argValue;
        }

    }

    public static class DescribeDcdnDomainConfigsResponseBodyDomainConfigsDomainConfigFunctionArgs extends TeaModel {
        @NameInMap("FunctionArg")
        public java.util.List<DescribeDcdnDomainConfigsResponseBodyDomainConfigsDomainConfigFunctionArgsFunctionArg> functionArg;

        public static DescribeDcdnDomainConfigsResponseBodyDomainConfigsDomainConfigFunctionArgs build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnDomainConfigsResponseBodyDomainConfigsDomainConfigFunctionArgs self = new DescribeDcdnDomainConfigsResponseBodyDomainConfigsDomainConfigFunctionArgs();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnDomainConfigsResponseBodyDomainConfigsDomainConfigFunctionArgs setFunctionArg(java.util.List<DescribeDcdnDomainConfigsResponseBodyDomainConfigsDomainConfigFunctionArgsFunctionArg> functionArg) {
            this.functionArg = functionArg;
            return this;
        }
        public java.util.List<DescribeDcdnDomainConfigsResponseBodyDomainConfigsDomainConfigFunctionArgsFunctionArg> getFunctionArg() {
            return this.functionArg;
        }

    }

    public static class DescribeDcdnDomainConfigsResponseBodyDomainConfigsDomainConfig extends TeaModel {
        /**
         * <p>The ID of the configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>5068995</p>
         */
        @NameInMap("ConfigId")
        public String configId;

        /**
         * <p>The configurations of the features.</p>
         */
        @NameInMap("FunctionArgs")
        public DescribeDcdnDomainConfigsResponseBodyDomainConfigsDomainConfigFunctionArgs functionArgs;

        /**
         * <p>The feature name.</p>
         * 
         * <strong>example:</strong>
         * <p>set_req_host_header</p>
         */
        @NameInMap("FunctionName")
        public String functionName;

        /**
         * <p>The ID of the advanced condition configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>1234567</p>
         */
        @NameInMap("ParentId")
        public String parentId;

        /**
         * <p>The status of the configuration. Valid values:</p>
         * <ul>
         * <li><strong>success</strong>: successful</li>
         * <li><strong>testing</strong>: testing</li>
         * <li><strong>failed</strong>: The configuration failed.</li>
         * <li><strong>configuring</strong>: The configuration is in progress.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeDcdnDomainConfigsResponseBodyDomainConfigsDomainConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnDomainConfigsResponseBodyDomainConfigsDomainConfig self = new DescribeDcdnDomainConfigsResponseBodyDomainConfigsDomainConfig();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnDomainConfigsResponseBodyDomainConfigsDomainConfig setConfigId(String configId) {
            this.configId = configId;
            return this;
        }
        public String getConfigId() {
            return this.configId;
        }

        public DescribeDcdnDomainConfigsResponseBodyDomainConfigsDomainConfig setFunctionArgs(DescribeDcdnDomainConfigsResponseBodyDomainConfigsDomainConfigFunctionArgs functionArgs) {
            this.functionArgs = functionArgs;
            return this;
        }
        public DescribeDcdnDomainConfigsResponseBodyDomainConfigsDomainConfigFunctionArgs getFunctionArgs() {
            return this.functionArgs;
        }

        public DescribeDcdnDomainConfigsResponseBodyDomainConfigsDomainConfig setFunctionName(String functionName) {
            this.functionName = functionName;
            return this;
        }
        public String getFunctionName() {
            return this.functionName;
        }

        public DescribeDcdnDomainConfigsResponseBodyDomainConfigsDomainConfig setParentId(String parentId) {
            this.parentId = parentId;
            return this;
        }
        public String getParentId() {
            return this.parentId;
        }

        public DescribeDcdnDomainConfigsResponseBodyDomainConfigsDomainConfig setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeDcdnDomainConfigsResponseBodyDomainConfigs extends TeaModel {
        @NameInMap("DomainConfig")
        public java.util.List<DescribeDcdnDomainConfigsResponseBodyDomainConfigsDomainConfig> domainConfig;

        public static DescribeDcdnDomainConfigsResponseBodyDomainConfigs build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnDomainConfigsResponseBodyDomainConfigs self = new DescribeDcdnDomainConfigsResponseBodyDomainConfigs();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnDomainConfigsResponseBodyDomainConfigs setDomainConfig(java.util.List<DescribeDcdnDomainConfigsResponseBodyDomainConfigsDomainConfig> domainConfig) {
            this.domainConfig = domainConfig;
            return this;
        }
        public java.util.List<DescribeDcdnDomainConfigsResponseBodyDomainConfigsDomainConfig> getDomainConfig() {
            return this.domainConfig;
        }

    }

}
