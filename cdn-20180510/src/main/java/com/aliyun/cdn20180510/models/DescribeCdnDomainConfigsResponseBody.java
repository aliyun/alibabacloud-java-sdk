// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnDomainConfigsResponseBody extends TeaModel {
    // The configurations of the domain name.
    @NameInMap("DomainConfigs")
    public DescribeCdnDomainConfigsResponseBodyDomainConfigs domainConfigs;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeCdnDomainConfigsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCdnDomainConfigsResponseBody self = new DescribeCdnDomainConfigsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCdnDomainConfigsResponseBody setDomainConfigs(DescribeCdnDomainConfigsResponseBodyDomainConfigs domainConfigs) {
        this.domainConfigs = domainConfigs;
        return this;
    }
    public DescribeCdnDomainConfigsResponseBodyDomainConfigs getDomainConfigs() {
        return this.domainConfigs;
    }

    public DescribeCdnDomainConfigsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeCdnDomainConfigsResponseBodyDomainConfigsDomainConfigFunctionArgsFunctionArg extends TeaModel {
        // The parameter name, which is the configuration item of **functionName**. You can configure multiple configuration items.
        @NameInMap("ArgName")
        public String argName;

        // The parameter value, which is the value of the configuration item of **functionName**.
        @NameInMap("ArgValue")
        public String argValue;

        public static DescribeCdnDomainConfigsResponseBodyDomainConfigsDomainConfigFunctionArgsFunctionArg build(java.util.Map<String, ?> map) throws Exception {
            DescribeCdnDomainConfigsResponseBodyDomainConfigsDomainConfigFunctionArgsFunctionArg self = new DescribeCdnDomainConfigsResponseBodyDomainConfigsDomainConfigFunctionArgsFunctionArg();
            return TeaModel.build(map, self);
        }

        public DescribeCdnDomainConfigsResponseBodyDomainConfigsDomainConfigFunctionArgsFunctionArg setArgName(String argName) {
            this.argName = argName;
            return this;
        }
        public String getArgName() {
            return this.argName;
        }

        public DescribeCdnDomainConfigsResponseBodyDomainConfigsDomainConfigFunctionArgsFunctionArg setArgValue(String argValue) {
            this.argValue = argValue;
            return this;
        }
        public String getArgValue() {
            return this.argValue;
        }

    }

    public static class DescribeCdnDomainConfigsResponseBodyDomainConfigsDomainConfigFunctionArgs extends TeaModel {
        @NameInMap("FunctionArg")
        public java.util.List<DescribeCdnDomainConfigsResponseBodyDomainConfigsDomainConfigFunctionArgsFunctionArg> functionArg;

        public static DescribeCdnDomainConfigsResponseBodyDomainConfigsDomainConfigFunctionArgs build(java.util.Map<String, ?> map) throws Exception {
            DescribeCdnDomainConfigsResponseBodyDomainConfigsDomainConfigFunctionArgs self = new DescribeCdnDomainConfigsResponseBodyDomainConfigsDomainConfigFunctionArgs();
            return TeaModel.build(map, self);
        }

        public DescribeCdnDomainConfigsResponseBodyDomainConfigsDomainConfigFunctionArgs setFunctionArg(java.util.List<DescribeCdnDomainConfigsResponseBodyDomainConfigsDomainConfigFunctionArgsFunctionArg> functionArg) {
            this.functionArg = functionArg;
            return this;
        }
        public java.util.List<DescribeCdnDomainConfigsResponseBodyDomainConfigsDomainConfigFunctionArgsFunctionArg> getFunctionArg() {
            return this.functionArg;
        }

    }

    public static class DescribeCdnDomainConfigsResponseBodyDomainConfigsDomainConfig extends TeaModel {
        // The ID of the configuration.
        @NameInMap("ConfigId")
        public String configId;

        // The configuration of each feature.
        @NameInMap("FunctionArgs")
        public DescribeCdnDomainConfigsResponseBodyDomainConfigsDomainConfigFunctionArgs functionArgs;

        // The name of the feature.
        @NameInMap("FunctionName")
        public String functionName;

        // The ID of the rule condition. This parameter is optional. To create a rule condition, you can configure the **condition** feature that is described in the [BatchSetCdnDomainConfig and SetCdnDomainStagingConfig](~~388460~~) topic. A rule condition can identify parameters that are included in requests and filter requests based on the identified parameters. Each rule condition has a [ConfigId](~~388994~~). You can use ConfigId as ParentId that is referenced by other features. This way, you can combine rule conditions and features for flexible configurations.
        // 
        // For more information, see [BatchSetCdnDomainConfig](~~90915~~) or ParentId configuration example in this topic.
        @NameInMap("ParentId")
        public String parentId;

        // The status of the configuration. Valid values:
        // 
        // *   **success**
        // *   **testing**
        // *   **failed**
        // *   **configuring**
        @NameInMap("Status")
        public String status;

        public static DescribeCdnDomainConfigsResponseBodyDomainConfigsDomainConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeCdnDomainConfigsResponseBodyDomainConfigsDomainConfig self = new DescribeCdnDomainConfigsResponseBodyDomainConfigsDomainConfig();
            return TeaModel.build(map, self);
        }

        public DescribeCdnDomainConfigsResponseBodyDomainConfigsDomainConfig setConfigId(String configId) {
            this.configId = configId;
            return this;
        }
        public String getConfigId() {
            return this.configId;
        }

        public DescribeCdnDomainConfigsResponseBodyDomainConfigsDomainConfig setFunctionArgs(DescribeCdnDomainConfigsResponseBodyDomainConfigsDomainConfigFunctionArgs functionArgs) {
            this.functionArgs = functionArgs;
            return this;
        }
        public DescribeCdnDomainConfigsResponseBodyDomainConfigsDomainConfigFunctionArgs getFunctionArgs() {
            return this.functionArgs;
        }

        public DescribeCdnDomainConfigsResponseBodyDomainConfigsDomainConfig setFunctionName(String functionName) {
            this.functionName = functionName;
            return this;
        }
        public String getFunctionName() {
            return this.functionName;
        }

        public DescribeCdnDomainConfigsResponseBodyDomainConfigsDomainConfig setParentId(String parentId) {
            this.parentId = parentId;
            return this;
        }
        public String getParentId() {
            return this.parentId;
        }

        public DescribeCdnDomainConfigsResponseBodyDomainConfigsDomainConfig setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeCdnDomainConfigsResponseBodyDomainConfigs extends TeaModel {
        @NameInMap("DomainConfig")
        public java.util.List<DescribeCdnDomainConfigsResponseBodyDomainConfigsDomainConfig> domainConfig;

        public static DescribeCdnDomainConfigsResponseBodyDomainConfigs build(java.util.Map<String, ?> map) throws Exception {
            DescribeCdnDomainConfigsResponseBodyDomainConfigs self = new DescribeCdnDomainConfigsResponseBodyDomainConfigs();
            return TeaModel.build(map, self);
        }

        public DescribeCdnDomainConfigsResponseBodyDomainConfigs setDomainConfig(java.util.List<DescribeCdnDomainConfigsResponseBodyDomainConfigsDomainConfig> domainConfig) {
            this.domainConfig = domainConfig;
            return this;
        }
        public java.util.List<DescribeCdnDomainConfigsResponseBodyDomainConfigsDomainConfig> getDomainConfig() {
            return this.domainConfig;
        }

    }

}
