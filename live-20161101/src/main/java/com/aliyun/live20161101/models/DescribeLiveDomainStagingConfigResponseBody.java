// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveDomainStagingConfigResponseBody extends TeaModel {
    @NameInMap("DomainConfigs")
    public java.util.List<DescribeLiveDomainStagingConfigResponseBodyDomainConfigs> domainConfigs;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeLiveDomainStagingConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveDomainStagingConfigResponseBody self = new DescribeLiveDomainStagingConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLiveDomainStagingConfigResponseBody setDomainConfigs(java.util.List<DescribeLiveDomainStagingConfigResponseBodyDomainConfigs> domainConfigs) {
        this.domainConfigs = domainConfigs;
        return this;
    }
    public java.util.List<DescribeLiveDomainStagingConfigResponseBodyDomainConfigs> getDomainConfigs() {
        return this.domainConfigs;
    }

    public DescribeLiveDomainStagingConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeLiveDomainStagingConfigResponseBodyDomainConfigsFunctionArgs extends TeaModel {
        @NameInMap("ArgName")
        public String argName;

        @NameInMap("ArgValue")
        public String argValue;

        public static DescribeLiveDomainStagingConfigResponseBodyDomainConfigsFunctionArgs build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveDomainStagingConfigResponseBodyDomainConfigsFunctionArgs self = new DescribeLiveDomainStagingConfigResponseBodyDomainConfigsFunctionArgs();
            return TeaModel.build(map, self);
        }

        public DescribeLiveDomainStagingConfigResponseBodyDomainConfigsFunctionArgs setArgName(String argName) {
            this.argName = argName;
            return this;
        }
        public String getArgName() {
            return this.argName;
        }

        public DescribeLiveDomainStagingConfigResponseBodyDomainConfigsFunctionArgs setArgValue(String argValue) {
            this.argValue = argValue;
            return this;
        }
        public String getArgValue() {
            return this.argValue;
        }

    }

    public static class DescribeLiveDomainStagingConfigResponseBodyDomainConfigs extends TeaModel {
        @NameInMap("ConfigId")
        public String configId;

        @NameInMap("FunctionArgs")
        public java.util.List<DescribeLiveDomainStagingConfigResponseBodyDomainConfigsFunctionArgs> functionArgs;

        @NameInMap("FunctionName")
        public String functionName;

        @NameInMap("Status")
        public String status;

        public static DescribeLiveDomainStagingConfigResponseBodyDomainConfigs build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveDomainStagingConfigResponseBodyDomainConfigs self = new DescribeLiveDomainStagingConfigResponseBodyDomainConfigs();
            return TeaModel.build(map, self);
        }

        public DescribeLiveDomainStagingConfigResponseBodyDomainConfigs setConfigId(String configId) {
            this.configId = configId;
            return this;
        }
        public String getConfigId() {
            return this.configId;
        }

        public DescribeLiveDomainStagingConfigResponseBodyDomainConfigs setFunctionArgs(java.util.List<DescribeLiveDomainStagingConfigResponseBodyDomainConfigsFunctionArgs> functionArgs) {
            this.functionArgs = functionArgs;
            return this;
        }
        public java.util.List<DescribeLiveDomainStagingConfigResponseBodyDomainConfigsFunctionArgs> getFunctionArgs() {
            return this.functionArgs;
        }

        public DescribeLiveDomainStagingConfigResponseBodyDomainConfigs setFunctionName(String functionName) {
            this.functionName = functionName;
            return this;
        }
        public String getFunctionName() {
            return this.functionName;
        }

        public DescribeLiveDomainStagingConfigResponseBodyDomainConfigs setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
