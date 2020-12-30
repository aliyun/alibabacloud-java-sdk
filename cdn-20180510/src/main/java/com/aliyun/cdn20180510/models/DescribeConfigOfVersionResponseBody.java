// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeConfigOfVersionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("VersionConfigs")
    public DescribeConfigOfVersionResponseBodyVersionConfigs versionConfigs;

    public static DescribeConfigOfVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeConfigOfVersionResponseBody self = new DescribeConfigOfVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeConfigOfVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeConfigOfVersionResponseBody setVersionConfigs(DescribeConfigOfVersionResponseBodyVersionConfigs versionConfigs) {
        this.versionConfigs = versionConfigs;
        return this;
    }
    public DescribeConfigOfVersionResponseBodyVersionConfigs getVersionConfigs() {
        return this.versionConfigs;
    }

    public static class DescribeConfigOfVersionResponseBodyVersionConfigsVersionConfigFunctionArgsFunctionArg extends TeaModel {
        @NameInMap("ArgName")
        public String argName;

        @NameInMap("ArgValue")
        public String argValue;

        public static DescribeConfigOfVersionResponseBodyVersionConfigsVersionConfigFunctionArgsFunctionArg build(java.util.Map<String, ?> map) throws Exception {
            DescribeConfigOfVersionResponseBodyVersionConfigsVersionConfigFunctionArgsFunctionArg self = new DescribeConfigOfVersionResponseBodyVersionConfigsVersionConfigFunctionArgsFunctionArg();
            return TeaModel.build(map, self);
        }

        public DescribeConfigOfVersionResponseBodyVersionConfigsVersionConfigFunctionArgsFunctionArg setArgName(String argName) {
            this.argName = argName;
            return this;
        }
        public String getArgName() {
            return this.argName;
        }

        public DescribeConfigOfVersionResponseBodyVersionConfigsVersionConfigFunctionArgsFunctionArg setArgValue(String argValue) {
            this.argValue = argValue;
            return this;
        }
        public String getArgValue() {
            return this.argValue;
        }

    }

    public static class DescribeConfigOfVersionResponseBodyVersionConfigsVersionConfigFunctionArgs extends TeaModel {
        @NameInMap("FunctionArg")
        public java.util.List<DescribeConfigOfVersionResponseBodyVersionConfigsVersionConfigFunctionArgsFunctionArg> functionArg;

        public static DescribeConfigOfVersionResponseBodyVersionConfigsVersionConfigFunctionArgs build(java.util.Map<String, ?> map) throws Exception {
            DescribeConfigOfVersionResponseBodyVersionConfigsVersionConfigFunctionArgs self = new DescribeConfigOfVersionResponseBodyVersionConfigsVersionConfigFunctionArgs();
            return TeaModel.build(map, self);
        }

        public DescribeConfigOfVersionResponseBodyVersionConfigsVersionConfigFunctionArgs setFunctionArg(java.util.List<DescribeConfigOfVersionResponseBodyVersionConfigsVersionConfigFunctionArgsFunctionArg> functionArg) {
            this.functionArg = functionArg;
            return this;
        }
        public java.util.List<DescribeConfigOfVersionResponseBodyVersionConfigsVersionConfigFunctionArgsFunctionArg> getFunctionArg() {
            return this.functionArg;
        }

    }

    public static class DescribeConfigOfVersionResponseBodyVersionConfigsVersionConfig extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("ConfigId")
        public String configId;

        @NameInMap("FunctionName")
        public String functionName;

        @NameInMap("FunctionArgs")
        public DescribeConfigOfVersionResponseBodyVersionConfigsVersionConfigFunctionArgs functionArgs;

        public static DescribeConfigOfVersionResponseBodyVersionConfigsVersionConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeConfigOfVersionResponseBodyVersionConfigsVersionConfig self = new DescribeConfigOfVersionResponseBodyVersionConfigsVersionConfig();
            return TeaModel.build(map, self);
        }

        public DescribeConfigOfVersionResponseBodyVersionConfigsVersionConfig setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeConfigOfVersionResponseBodyVersionConfigsVersionConfig setConfigId(String configId) {
            this.configId = configId;
            return this;
        }
        public String getConfigId() {
            return this.configId;
        }

        public DescribeConfigOfVersionResponseBodyVersionConfigsVersionConfig setFunctionName(String functionName) {
            this.functionName = functionName;
            return this;
        }
        public String getFunctionName() {
            return this.functionName;
        }

        public DescribeConfigOfVersionResponseBodyVersionConfigsVersionConfig setFunctionArgs(DescribeConfigOfVersionResponseBodyVersionConfigsVersionConfigFunctionArgs functionArgs) {
            this.functionArgs = functionArgs;
            return this;
        }
        public DescribeConfigOfVersionResponseBodyVersionConfigsVersionConfigFunctionArgs getFunctionArgs() {
            return this.functionArgs;
        }

    }

    public static class DescribeConfigOfVersionResponseBodyVersionConfigs extends TeaModel {
        @NameInMap("VersionConfig")
        public java.util.List<DescribeConfigOfVersionResponseBodyVersionConfigsVersionConfig> versionConfig;

        public static DescribeConfigOfVersionResponseBodyVersionConfigs build(java.util.Map<String, ?> map) throws Exception {
            DescribeConfigOfVersionResponseBodyVersionConfigs self = new DescribeConfigOfVersionResponseBodyVersionConfigs();
            return TeaModel.build(map, self);
        }

        public DescribeConfigOfVersionResponseBodyVersionConfigs setVersionConfig(java.util.List<DescribeConfigOfVersionResponseBodyVersionConfigsVersionConfig> versionConfig) {
            this.versionConfig = versionConfig;
            return this;
        }
        public java.util.List<DescribeConfigOfVersionResponseBodyVersionConfigsVersionConfig> getVersionConfig() {
            return this.versionConfig;
        }

    }

}
