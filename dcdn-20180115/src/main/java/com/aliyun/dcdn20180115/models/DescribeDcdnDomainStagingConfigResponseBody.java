// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnDomainStagingConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DomainConfigs")
    public java.util.List<DescribeDcdnDomainStagingConfigResponseBodyDomainConfigs> domainConfigs;

    public static DescribeDcdnDomainStagingConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnDomainStagingConfigResponseBody self = new DescribeDcdnDomainStagingConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnDomainStagingConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDcdnDomainStagingConfigResponseBody setDomainConfigs(java.util.List<DescribeDcdnDomainStagingConfigResponseBodyDomainConfigs> domainConfigs) {
        this.domainConfigs = domainConfigs;
        return this;
    }
    public java.util.List<DescribeDcdnDomainStagingConfigResponseBodyDomainConfigs> getDomainConfigs() {
        return this.domainConfigs;
    }

    public static class DescribeDcdnDomainStagingConfigResponseBodyDomainConfigsFunctionArgs extends TeaModel {
        @NameInMap("ArgName")
        public String argName;

        @NameInMap("ArgValue")
        public String argValue;

        public static DescribeDcdnDomainStagingConfigResponseBodyDomainConfigsFunctionArgs build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnDomainStagingConfigResponseBodyDomainConfigsFunctionArgs self = new DescribeDcdnDomainStagingConfigResponseBodyDomainConfigsFunctionArgs();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnDomainStagingConfigResponseBodyDomainConfigsFunctionArgs setArgName(String argName) {
            this.argName = argName;
            return this;
        }
        public String getArgName() {
            return this.argName;
        }

        public DescribeDcdnDomainStagingConfigResponseBodyDomainConfigsFunctionArgs setArgValue(String argValue) {
            this.argValue = argValue;
            return this;
        }
        public String getArgValue() {
            return this.argValue;
        }

    }

    public static class DescribeDcdnDomainStagingConfigResponseBodyDomainConfigs extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("ConfigId")
        public String configId;

        @NameInMap("FunctionName")
        public String functionName;

        @NameInMap("FunctionArgs")
        public java.util.List<DescribeDcdnDomainStagingConfigResponseBodyDomainConfigsFunctionArgs> functionArgs;

        public static DescribeDcdnDomainStagingConfigResponseBodyDomainConfigs build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnDomainStagingConfigResponseBodyDomainConfigs self = new DescribeDcdnDomainStagingConfigResponseBodyDomainConfigs();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnDomainStagingConfigResponseBodyDomainConfigs setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeDcdnDomainStagingConfigResponseBodyDomainConfigs setConfigId(String configId) {
            this.configId = configId;
            return this;
        }
        public String getConfigId() {
            return this.configId;
        }

        public DescribeDcdnDomainStagingConfigResponseBodyDomainConfigs setFunctionName(String functionName) {
            this.functionName = functionName;
            return this;
        }
        public String getFunctionName() {
            return this.functionName;
        }

        public DescribeDcdnDomainStagingConfigResponseBodyDomainConfigs setFunctionArgs(java.util.List<DescribeDcdnDomainStagingConfigResponseBodyDomainConfigsFunctionArgs> functionArgs) {
            this.functionArgs = functionArgs;
            return this;
        }
        public java.util.List<DescribeDcdnDomainStagingConfigResponseBodyDomainConfigsFunctionArgs> getFunctionArgs() {
            return this.functionArgs;
        }

    }

}
