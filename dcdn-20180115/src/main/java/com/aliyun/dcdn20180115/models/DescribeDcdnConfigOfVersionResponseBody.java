// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnConfigOfVersionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("VersionConfigs")
    public DescribeDcdnConfigOfVersionResponseBodyVersionConfigs versionConfigs;

    public static DescribeDcdnConfigOfVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnConfigOfVersionResponseBody self = new DescribeDcdnConfigOfVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnConfigOfVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDcdnConfigOfVersionResponseBody setVersionConfigs(DescribeDcdnConfigOfVersionResponseBodyVersionConfigs versionConfigs) {
        this.versionConfigs = versionConfigs;
        return this;
    }
    public DescribeDcdnConfigOfVersionResponseBodyVersionConfigs getVersionConfigs() {
        return this.versionConfigs;
    }

    public static class DescribeDcdnConfigOfVersionResponseBodyVersionConfigsVersionConfigFunctionArgsFunctionArg extends TeaModel {
        @NameInMap("ArgName")
        public String argName;

        @NameInMap("ArgValue")
        public String argValue;

        public static DescribeDcdnConfigOfVersionResponseBodyVersionConfigsVersionConfigFunctionArgsFunctionArg build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnConfigOfVersionResponseBodyVersionConfigsVersionConfigFunctionArgsFunctionArg self = new DescribeDcdnConfigOfVersionResponseBodyVersionConfigsVersionConfigFunctionArgsFunctionArg();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnConfigOfVersionResponseBodyVersionConfigsVersionConfigFunctionArgsFunctionArg setArgName(String argName) {
            this.argName = argName;
            return this;
        }
        public String getArgName() {
            return this.argName;
        }

        public DescribeDcdnConfigOfVersionResponseBodyVersionConfigsVersionConfigFunctionArgsFunctionArg setArgValue(String argValue) {
            this.argValue = argValue;
            return this;
        }
        public String getArgValue() {
            return this.argValue;
        }

    }

    public static class DescribeDcdnConfigOfVersionResponseBodyVersionConfigsVersionConfigFunctionArgs extends TeaModel {
        @NameInMap("FunctionArg")
        public java.util.List<DescribeDcdnConfigOfVersionResponseBodyVersionConfigsVersionConfigFunctionArgsFunctionArg> functionArg;

        public static DescribeDcdnConfigOfVersionResponseBodyVersionConfigsVersionConfigFunctionArgs build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnConfigOfVersionResponseBodyVersionConfigsVersionConfigFunctionArgs self = new DescribeDcdnConfigOfVersionResponseBodyVersionConfigsVersionConfigFunctionArgs();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnConfigOfVersionResponseBodyVersionConfigsVersionConfigFunctionArgs setFunctionArg(java.util.List<DescribeDcdnConfigOfVersionResponseBodyVersionConfigsVersionConfigFunctionArgsFunctionArg> functionArg) {
            this.functionArg = functionArg;
            return this;
        }
        public java.util.List<DescribeDcdnConfigOfVersionResponseBodyVersionConfigsVersionConfigFunctionArgsFunctionArg> getFunctionArg() {
            return this.functionArg;
        }

    }

    public static class DescribeDcdnConfigOfVersionResponseBodyVersionConfigsVersionConfig extends TeaModel {
        @NameInMap("ConfigId")
        public String configId;

        @NameInMap("FunctionArgs")
        public DescribeDcdnConfigOfVersionResponseBodyVersionConfigsVersionConfigFunctionArgs functionArgs;

        @NameInMap("FunctionName")
        public String functionName;

        @NameInMap("Status")
        public String status;

        public static DescribeDcdnConfigOfVersionResponseBodyVersionConfigsVersionConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnConfigOfVersionResponseBodyVersionConfigsVersionConfig self = new DescribeDcdnConfigOfVersionResponseBodyVersionConfigsVersionConfig();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnConfigOfVersionResponseBodyVersionConfigsVersionConfig setConfigId(String configId) {
            this.configId = configId;
            return this;
        }
        public String getConfigId() {
            return this.configId;
        }

        public DescribeDcdnConfigOfVersionResponseBodyVersionConfigsVersionConfig setFunctionArgs(DescribeDcdnConfigOfVersionResponseBodyVersionConfigsVersionConfigFunctionArgs functionArgs) {
            this.functionArgs = functionArgs;
            return this;
        }
        public DescribeDcdnConfigOfVersionResponseBodyVersionConfigsVersionConfigFunctionArgs getFunctionArgs() {
            return this.functionArgs;
        }

        public DescribeDcdnConfigOfVersionResponseBodyVersionConfigsVersionConfig setFunctionName(String functionName) {
            this.functionName = functionName;
            return this;
        }
        public String getFunctionName() {
            return this.functionName;
        }

        public DescribeDcdnConfigOfVersionResponseBodyVersionConfigsVersionConfig setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeDcdnConfigOfVersionResponseBodyVersionConfigs extends TeaModel {
        @NameInMap("VersionConfig")
        public java.util.List<DescribeDcdnConfigOfVersionResponseBodyVersionConfigsVersionConfig> versionConfig;

        public static DescribeDcdnConfigOfVersionResponseBodyVersionConfigs build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnConfigOfVersionResponseBodyVersionConfigs self = new DescribeDcdnConfigOfVersionResponseBodyVersionConfigs();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnConfigOfVersionResponseBodyVersionConfigs setVersionConfig(java.util.List<DescribeDcdnConfigOfVersionResponseBodyVersionConfigsVersionConfig> versionConfig) {
            this.versionConfig = versionConfig;
            return this;
        }
        public java.util.List<DescribeDcdnConfigOfVersionResponseBodyVersionConfigsVersionConfig> getVersionConfig() {
            return this.versionConfig;
        }

    }

}
