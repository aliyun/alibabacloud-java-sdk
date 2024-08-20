// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnDomainStagingConfigResponseBody extends TeaModel {
    /**
     * <p>The configurations of accelerated domain names returned.</p>
     */
    @NameInMap("DomainConfigs")
    public java.util.List<DescribeDcdnDomainStagingConfigResponseBodyDomainConfigs> domainConfigs;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>C80705BF-0F76-41FA-BAD1-5B59296A4E59</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDcdnDomainStagingConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnDomainStagingConfigResponseBody self = new DescribeDcdnDomainStagingConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnDomainStagingConfigResponseBody setDomainConfigs(java.util.List<DescribeDcdnDomainStagingConfigResponseBodyDomainConfigs> domainConfigs) {
        this.domainConfigs = domainConfigs;
        return this;
    }
    public java.util.List<DescribeDcdnDomainStagingConfigResponseBodyDomainConfigs> getDomainConfigs() {
        return this.domainConfigs;
    }

    public DescribeDcdnDomainStagingConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDcdnDomainStagingConfigResponseBodyDomainConfigsFunctionArgs extends TeaModel {
        /**
         * <p>The name of the configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>auth_type</p>
         */
        @NameInMap("ArgName")
        public String argName;

        /**
         * <p>The value of the configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>req_auth</p>
         */
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
        /**
         * <p>The ID of the configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>6295</p>
         */
        @NameInMap("ConfigId")
        public String configId;

        /**
         * <p>The following table describes the features.</p>
         */
        @NameInMap("FunctionArgs")
        public java.util.List<DescribeDcdnDomainStagingConfigResponseBodyDomainConfigsFunctionArgs> functionArgs;

        /**
         * <p>The name of the feature.</p>
         * 
         * <strong>example:</strong>
         * <p>aliauth</p>
         */
        @NameInMap("FunctionName")
        public String functionName;

        /**
         * <p>The status. Valid values:</p>
         * <ul>
         * <li>success: The configuration is successful.</li>
         * <li>testing: The configuration is under testing.</li>
         * <li>failed: The task failed.</li>
         * <li>configuring: The feature is being configured.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeDcdnDomainStagingConfigResponseBodyDomainConfigs build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnDomainStagingConfigResponseBodyDomainConfigs self = new DescribeDcdnDomainStagingConfigResponseBodyDomainConfigs();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnDomainStagingConfigResponseBodyDomainConfigs setConfigId(String configId) {
            this.configId = configId;
            return this;
        }
        public String getConfigId() {
            return this.configId;
        }

        public DescribeDcdnDomainStagingConfigResponseBodyDomainConfigs setFunctionArgs(java.util.List<DescribeDcdnDomainStagingConfigResponseBodyDomainConfigsFunctionArgs> functionArgs) {
            this.functionArgs = functionArgs;
            return this;
        }
        public java.util.List<DescribeDcdnDomainStagingConfigResponseBodyDomainConfigsFunctionArgs> getFunctionArgs() {
            return this.functionArgs;
        }

        public DescribeDcdnDomainStagingConfigResponseBodyDomainConfigs setFunctionName(String functionName) {
            this.functionName = functionName;
            return this;
        }
        public String getFunctionName() {
            return this.functionName;
        }

        public DescribeDcdnDomainStagingConfigResponseBodyDomainConfigs setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
