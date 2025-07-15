// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveDomainConfigsResponseBody extends TeaModel {
    /**
     * <p>The configurations of the domain name.</p>
     */
    @NameInMap("DomainConfigs")
    public DescribeLiveDomainConfigsResponseBodyDomainConfigs domainConfigs;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F8AA0364-0FDB-4AD5-AC74-D69FAB8924ED</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeLiveDomainConfigsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveDomainConfigsResponseBody self = new DescribeLiveDomainConfigsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLiveDomainConfigsResponseBody setDomainConfigs(DescribeLiveDomainConfigsResponseBodyDomainConfigs domainConfigs) {
        this.domainConfigs = domainConfigs;
        return this;
    }
    public DescribeLiveDomainConfigsResponseBodyDomainConfigs getDomainConfigs() {
        return this.domainConfigs;
    }

    public DescribeLiveDomainConfigsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeLiveDomainConfigsResponseBodyDomainConfigsDomainConfigFunctionArgsFunctionArg extends TeaModel {
        /**
         * <p>The name of the attribute.</p>
         * 
         * <strong>example:</strong>
         * <p>domain_name</p>
         */
        @NameInMap("ArgName")
        public String argName;

        /**
         * <p>The attribute value.</p>
         * 
         * <strong>example:</strong>
         * <p>developer.aliyundoc.com</p>
         */
        @NameInMap("ArgValue")
        public String argValue;

        public static DescribeLiveDomainConfigsResponseBodyDomainConfigsDomainConfigFunctionArgsFunctionArg build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveDomainConfigsResponseBodyDomainConfigsDomainConfigFunctionArgsFunctionArg self = new DescribeLiveDomainConfigsResponseBodyDomainConfigsDomainConfigFunctionArgsFunctionArg();
            return TeaModel.build(map, self);
        }

        public DescribeLiveDomainConfigsResponseBodyDomainConfigsDomainConfigFunctionArgsFunctionArg setArgName(String argName) {
            this.argName = argName;
            return this;
        }
        public String getArgName() {
            return this.argName;
        }

        public DescribeLiveDomainConfigsResponseBodyDomainConfigsDomainConfigFunctionArgsFunctionArg setArgValue(String argValue) {
            this.argValue = argValue;
            return this;
        }
        public String getArgValue() {
            return this.argValue;
        }

    }

    public static class DescribeLiveDomainConfigsResponseBodyDomainConfigsDomainConfigFunctionArgs extends TeaModel {
        @NameInMap("FunctionArg")
        public java.util.List<DescribeLiveDomainConfigsResponseBodyDomainConfigsDomainConfigFunctionArgsFunctionArg> functionArg;

        public static DescribeLiveDomainConfigsResponseBodyDomainConfigsDomainConfigFunctionArgs build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveDomainConfigsResponseBodyDomainConfigsDomainConfigFunctionArgs self = new DescribeLiveDomainConfigsResponseBodyDomainConfigsDomainConfigFunctionArgs();
            return TeaModel.build(map, self);
        }

        public DescribeLiveDomainConfigsResponseBodyDomainConfigsDomainConfigFunctionArgs setFunctionArg(java.util.List<DescribeLiveDomainConfigsResponseBodyDomainConfigsDomainConfigFunctionArgsFunctionArg> functionArg) {
            this.functionArg = functionArg;
            return this;
        }
        public java.util.List<DescribeLiveDomainConfigsResponseBodyDomainConfigsDomainConfigFunctionArgsFunctionArg> getFunctionArg() {
            return this.functionArg;
        }

    }

    public static class DescribeLiveDomainConfigsResponseBodyDomainConfigsDomainConfig extends TeaModel {
        /**
         * <p>The configuration ID.</p>
         * 
         * <strong>example:</strong>
         * <p>5003576</p>
         */
        @NameInMap("ConfigId")
        public String configId;

        /**
         * <p>The attributes of the feature.</p>
         */
        @NameInMap("FunctionArgs")
        public DescribeLiveDomainConfigsResponseBodyDomainConfigsDomainConfigFunctionArgs functionArgs;

        /**
         * <p>The name of the feature.</p>
         * 
         * <strong>example:</strong>
         * <p>set_req_host_header</p>
         */
        @NameInMap("FunctionName")
        public String functionName;

        /**
         * <p>The configuration status. Valid values:</p>
         * <ul>
         * <li><strong>success</strong></li>
         * <li><strong>testing</strong></li>
         * <li><strong>failed</strong></li>
         * <li><strong>configuring</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeLiveDomainConfigsResponseBodyDomainConfigsDomainConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveDomainConfigsResponseBodyDomainConfigsDomainConfig self = new DescribeLiveDomainConfigsResponseBodyDomainConfigsDomainConfig();
            return TeaModel.build(map, self);
        }

        public DescribeLiveDomainConfigsResponseBodyDomainConfigsDomainConfig setConfigId(String configId) {
            this.configId = configId;
            return this;
        }
        public String getConfigId() {
            return this.configId;
        }

        public DescribeLiveDomainConfigsResponseBodyDomainConfigsDomainConfig setFunctionArgs(DescribeLiveDomainConfigsResponseBodyDomainConfigsDomainConfigFunctionArgs functionArgs) {
            this.functionArgs = functionArgs;
            return this;
        }
        public DescribeLiveDomainConfigsResponseBodyDomainConfigsDomainConfigFunctionArgs getFunctionArgs() {
            return this.functionArgs;
        }

        public DescribeLiveDomainConfigsResponseBodyDomainConfigsDomainConfig setFunctionName(String functionName) {
            this.functionName = functionName;
            return this;
        }
        public String getFunctionName() {
            return this.functionName;
        }

        public DescribeLiveDomainConfigsResponseBodyDomainConfigsDomainConfig setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeLiveDomainConfigsResponseBodyDomainConfigs extends TeaModel {
        @NameInMap("DomainConfig")
        public java.util.List<DescribeLiveDomainConfigsResponseBodyDomainConfigsDomainConfig> domainConfig;

        public static DescribeLiveDomainConfigsResponseBodyDomainConfigs build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveDomainConfigsResponseBodyDomainConfigs self = new DescribeLiveDomainConfigsResponseBodyDomainConfigs();
            return TeaModel.build(map, self);
        }

        public DescribeLiveDomainConfigsResponseBodyDomainConfigs setDomainConfig(java.util.List<DescribeLiveDomainConfigsResponseBodyDomainConfigsDomainConfig> domainConfig) {
            this.domainConfig = domainConfig;
            return this;
        }
        public java.util.List<DescribeLiveDomainConfigsResponseBodyDomainConfigsDomainConfig> getDomainConfig() {
            return this.domainConfig;
        }

    }

}
