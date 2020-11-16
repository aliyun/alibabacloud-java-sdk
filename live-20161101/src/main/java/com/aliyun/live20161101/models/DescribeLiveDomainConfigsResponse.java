// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveDomainConfigsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("DomainConfigs")
    @Validation(required = true)
    public DescribeLiveDomainConfigsResponseDomainConfigs domainConfigs;

    public static DescribeLiveDomainConfigsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveDomainConfigsResponse self = new DescribeLiveDomainConfigsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveDomainConfigsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLiveDomainConfigsResponse setDomainConfigs(DescribeLiveDomainConfigsResponseDomainConfigs domainConfigs) {
        this.domainConfigs = domainConfigs;
        return this;
    }
    public DescribeLiveDomainConfigsResponseDomainConfigs getDomainConfigs() {
        return this.domainConfigs;
    }

    public static class DescribeLiveDomainConfigsResponseDomainConfigsDomainConfigFunctionArgsFunctionArg extends TeaModel {
        @NameInMap("ArgName")
        @Validation(required = true)
        public String argName;

        @NameInMap("ArgValue")
        @Validation(required = true)
        public String argValue;

        public static DescribeLiveDomainConfigsResponseDomainConfigsDomainConfigFunctionArgsFunctionArg build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveDomainConfigsResponseDomainConfigsDomainConfigFunctionArgsFunctionArg self = new DescribeLiveDomainConfigsResponseDomainConfigsDomainConfigFunctionArgsFunctionArg();
            return TeaModel.build(map, self);
        }

        public DescribeLiveDomainConfigsResponseDomainConfigsDomainConfigFunctionArgsFunctionArg setArgName(String argName) {
            this.argName = argName;
            return this;
        }
        public String getArgName() {
            return this.argName;
        }

        public DescribeLiveDomainConfigsResponseDomainConfigsDomainConfigFunctionArgsFunctionArg setArgValue(String argValue) {
            this.argValue = argValue;
            return this;
        }
        public String getArgValue() {
            return this.argValue;
        }

    }

    public static class DescribeLiveDomainConfigsResponseDomainConfigsDomainConfigFunctionArgs extends TeaModel {
        @NameInMap("FunctionArg")
        @Validation(required = true)
        public java.util.List<DescribeLiveDomainConfigsResponseDomainConfigsDomainConfigFunctionArgsFunctionArg> functionArg;

        public static DescribeLiveDomainConfigsResponseDomainConfigsDomainConfigFunctionArgs build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveDomainConfigsResponseDomainConfigsDomainConfigFunctionArgs self = new DescribeLiveDomainConfigsResponseDomainConfigsDomainConfigFunctionArgs();
            return TeaModel.build(map, self);
        }

        public DescribeLiveDomainConfigsResponseDomainConfigsDomainConfigFunctionArgs setFunctionArg(java.util.List<DescribeLiveDomainConfigsResponseDomainConfigsDomainConfigFunctionArgsFunctionArg> functionArg) {
            this.functionArg = functionArg;
            return this;
        }
        public java.util.List<DescribeLiveDomainConfigsResponseDomainConfigsDomainConfigFunctionArgsFunctionArg> getFunctionArg() {
            return this.functionArg;
        }

    }

    public static class DescribeLiveDomainConfigsResponseDomainConfigsDomainConfig extends TeaModel {
        @NameInMap("FunctionName")
        @Validation(required = true)
        public String functionName;

        @NameInMap("ConfigId")
        @Validation(required = true)
        public String configId;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("FunctionArgs")
        @Validation(required = true)
        public DescribeLiveDomainConfigsResponseDomainConfigsDomainConfigFunctionArgs functionArgs;

        public static DescribeLiveDomainConfigsResponseDomainConfigsDomainConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveDomainConfigsResponseDomainConfigsDomainConfig self = new DescribeLiveDomainConfigsResponseDomainConfigsDomainConfig();
            return TeaModel.build(map, self);
        }

        public DescribeLiveDomainConfigsResponseDomainConfigsDomainConfig setFunctionName(String functionName) {
            this.functionName = functionName;
            return this;
        }
        public String getFunctionName() {
            return this.functionName;
        }

        public DescribeLiveDomainConfigsResponseDomainConfigsDomainConfig setConfigId(String configId) {
            this.configId = configId;
            return this;
        }
        public String getConfigId() {
            return this.configId;
        }

        public DescribeLiveDomainConfigsResponseDomainConfigsDomainConfig setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeLiveDomainConfigsResponseDomainConfigsDomainConfig setFunctionArgs(DescribeLiveDomainConfigsResponseDomainConfigsDomainConfigFunctionArgs functionArgs) {
            this.functionArgs = functionArgs;
            return this;
        }
        public DescribeLiveDomainConfigsResponseDomainConfigsDomainConfigFunctionArgs getFunctionArgs() {
            return this.functionArgs;
        }

    }

    public static class DescribeLiveDomainConfigsResponseDomainConfigs extends TeaModel {
        @NameInMap("DomainConfig")
        @Validation(required = true)
        public java.util.List<DescribeLiveDomainConfigsResponseDomainConfigsDomainConfig> domainConfig;

        public static DescribeLiveDomainConfigsResponseDomainConfigs build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveDomainConfigsResponseDomainConfigs self = new DescribeLiveDomainConfigsResponseDomainConfigs();
            return TeaModel.build(map, self);
        }

        public DescribeLiveDomainConfigsResponseDomainConfigs setDomainConfig(java.util.List<DescribeLiveDomainConfigsResponseDomainConfigsDomainConfig> domainConfig) {
            this.domainConfig = domainConfig;
            return this;
        }
        public java.util.List<DescribeLiveDomainConfigsResponseDomainConfigsDomainConfig> getDomainConfig() {
            return this.domainConfig;
        }

    }

}
