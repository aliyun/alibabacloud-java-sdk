// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnDomainStagingConfigResponseBody extends TeaModel {
    /**
     * <p>The domain name configurations.</p>
     */
    @NameInMap("DomainConfigs")
    public java.util.List<DescribeCdnDomainStagingConfigResponseBodyDomainConfigs> domainConfigs;

    /**
     * <p>The accelerated domain name.</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeCdnDomainStagingConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCdnDomainStagingConfigResponseBody self = new DescribeCdnDomainStagingConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCdnDomainStagingConfigResponseBody setDomainConfigs(java.util.List<DescribeCdnDomainStagingConfigResponseBodyDomainConfigs> domainConfigs) {
        this.domainConfigs = domainConfigs;
        return this;
    }
    public java.util.List<DescribeCdnDomainStagingConfigResponseBodyDomainConfigs> getDomainConfigs() {
        return this.domainConfigs;
    }

    public DescribeCdnDomainStagingConfigResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeCdnDomainStagingConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeCdnDomainStagingConfigResponseBodyDomainConfigsFunctionArgs extends TeaModel {
        /**
         * <p>The configuration name.</p>
         */
        @NameInMap("ArgName")
        public String argName;

        /**
         * <p>The configuration value.</p>
         */
        @NameInMap("ArgValue")
        public String argValue;

        public static DescribeCdnDomainStagingConfigResponseBodyDomainConfigsFunctionArgs build(java.util.Map<String, ?> map) throws Exception {
            DescribeCdnDomainStagingConfigResponseBodyDomainConfigsFunctionArgs self = new DescribeCdnDomainStagingConfigResponseBodyDomainConfigsFunctionArgs();
            return TeaModel.build(map, self);
        }

        public DescribeCdnDomainStagingConfigResponseBodyDomainConfigsFunctionArgs setArgName(String argName) {
            this.argName = argName;
            return this;
        }
        public String getArgName() {
            return this.argName;
        }

        public DescribeCdnDomainStagingConfigResponseBodyDomainConfigsFunctionArgs setArgValue(String argValue) {
            this.argValue = argValue;
            return this;
        }
        public String getArgValue() {
            return this.argValue;
        }

    }

    public static class DescribeCdnDomainStagingConfigResponseBodyDomainConfigs extends TeaModel {
        /**
         * <p>The configuration ID.</p>
         */
        @NameInMap("ConfigId")
        public String configId;

        /**
         * <p>The description of each feature.</p>
         */
        @NameInMap("FunctionArgs")
        public java.util.List<DescribeCdnDomainStagingConfigResponseBodyDomainConfigsFunctionArgs> functionArgs;

        /**
         * <p>The feature name.</p>
         */
        @NameInMap("FunctionName")
        public String functionName;

        /**
         * <p>The rule condition ID. This parameter is optional. To create a rule condition, you can configure the **condition** feature that is described in the [Parameters for configuring features for domain names](https://help.aliyun.com/document_detail/388460.html) topic. A rule condition can identify parameters that are included in requests and filter requests based on the identified parameters. Each rule condition has a [ConfigId](https://help.aliyun.com/document_detail/388994.html). You can reference ConfigId instead of ParentId in other features. This way, you can combine rule conditions and features for flexible configurations. For more information, see [BatchSetCdnDomainConfig](https://help.aliyun.com/document_detail/90915.html) or ParentId configuration example in this topic.</p>
         */
        @NameInMap("ParentId")
        public String parentId;

        /**
         * <p>The configuration status. Valid values:</p>
         * <br>
         * <p>*   **testing**</p>
         * <p>*   **configuring**</p>
         * <p>*   **success**</p>
         * <p>*   **failed**</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeCdnDomainStagingConfigResponseBodyDomainConfigs build(java.util.Map<String, ?> map) throws Exception {
            DescribeCdnDomainStagingConfigResponseBodyDomainConfigs self = new DescribeCdnDomainStagingConfigResponseBodyDomainConfigs();
            return TeaModel.build(map, self);
        }

        public DescribeCdnDomainStagingConfigResponseBodyDomainConfigs setConfigId(String configId) {
            this.configId = configId;
            return this;
        }
        public String getConfigId() {
            return this.configId;
        }

        public DescribeCdnDomainStagingConfigResponseBodyDomainConfigs setFunctionArgs(java.util.List<DescribeCdnDomainStagingConfigResponseBodyDomainConfigsFunctionArgs> functionArgs) {
            this.functionArgs = functionArgs;
            return this;
        }
        public java.util.List<DescribeCdnDomainStagingConfigResponseBodyDomainConfigsFunctionArgs> getFunctionArgs() {
            return this.functionArgs;
        }

        public DescribeCdnDomainStagingConfigResponseBodyDomainConfigs setFunctionName(String functionName) {
            this.functionName = functionName;
            return this;
        }
        public String getFunctionName() {
            return this.functionName;
        }

        public DescribeCdnDomainStagingConfigResponseBodyDomainConfigs setParentId(String parentId) {
            this.parentId = parentId;
            return this;
        }
        public String getParentId() {
            return this.parentId;
        }

        public DescribeCdnDomainStagingConfigResponseBodyDomainConfigs setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
