// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveDomainConfigsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DomainConfigs")
    public DescribeLiveDomainConfigsResponseBodyDomainConfigs domainConfigs;

    public static DescribeLiveDomainConfigsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveDomainConfigsResponseBody self = new DescribeLiveDomainConfigsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLiveDomainConfigsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLiveDomainConfigsResponseBody setDomainConfigs(DescribeLiveDomainConfigsResponseBodyDomainConfigs domainConfigs) {
        this.domainConfigs = domainConfigs;
        return this;
    }
    public DescribeLiveDomainConfigsResponseBodyDomainConfigs getDomainConfigs() {
        return this.domainConfigs;
    }

    public static class DescribeLiveDomainConfigsResponseBodyDomainConfigsDomainConfigFunctionArgsFunctionArg extends TeaModel {
        @NameInMap("ArgName")
        public String argName;

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
        @NameInMap("Status")
        public String status;

        @NameInMap("ConfigId")
        public String configId;

        @NameInMap("FunctionName")
        public String functionName;

        @NameInMap("FunctionArgs")
        public DescribeLiveDomainConfigsResponseBodyDomainConfigsDomainConfigFunctionArgs functionArgs;

        public static DescribeLiveDomainConfigsResponseBodyDomainConfigsDomainConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveDomainConfigsResponseBodyDomainConfigsDomainConfig self = new DescribeLiveDomainConfigsResponseBodyDomainConfigsDomainConfig();
            return TeaModel.build(map, self);
        }

        public DescribeLiveDomainConfigsResponseBodyDomainConfigsDomainConfig setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeLiveDomainConfigsResponseBodyDomainConfigsDomainConfig setConfigId(String configId) {
            this.configId = configId;
            return this;
        }
        public String getConfigId() {
            return this.configId;
        }

        public DescribeLiveDomainConfigsResponseBodyDomainConfigsDomainConfig setFunctionName(String functionName) {
            this.functionName = functionName;
            return this;
        }
        public String getFunctionName() {
            return this.functionName;
        }

        public DescribeLiveDomainConfigsResponseBodyDomainConfigsDomainConfig setFunctionArgs(DescribeLiveDomainConfigsResponseBodyDomainConfigsDomainConfigFunctionArgs functionArgs) {
            this.functionArgs = functionArgs;
            return this;
        }
        public DescribeLiveDomainConfigsResponseBodyDomainConfigsDomainConfigFunctionArgs getFunctionArgs() {
            return this.functionArgs;
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
