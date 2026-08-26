// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveDomainStagingConfigResponseBody extends TeaModel {
    /**
     * <p>The domain name configurations.</p>
     */
    @NameInMap("DomainConfigs")
    public java.util.List<DescribeLiveDomainStagingConfigResponseBodyDomainConfigs> domainConfigs;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>C80705BF-0F76-41FA-BAD1-5B59296A4E59</p>
     */
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
        /**
         * <p>The name of the configuration parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>auth_type</p>
         */
        @NameInMap("ArgName")
        public String argName;

        /**
         * <p>The value of the configuration parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>req_auth</p>
         */
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
        /**
         * <p>The ID of the configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>6295</p>
         */
        @NameInMap("ConfigId")
        public String configId;

        /**
         * <p>The configurations of the feature.</p>
         */
        @NameInMap("FunctionArgs")
        public java.util.List<DescribeLiveDomainStagingConfigResponseBodyDomainConfigsFunctionArgs> functionArgs;

        /**
         * <p>The name of the feature.</p>
         * 
         * <strong>example:</strong>
         * <p>aliauth</p>
         */
        @NameInMap("FunctionName")
        public String functionName;

        /**
         * <p>The status of the configuration. Valid values:</p>
         * <ul>
         * <li><p><strong>success</strong>: Successful.</p>
         * </li>
         * <li><p><strong>testing</strong>: The configuration is being verified.</p>
         * </li>
         * <li><p><strong>failed</strong>: Failed.</p>
         * </li>
         * <li><p><strong>configuring</strong>: The configuration is in progress.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
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
