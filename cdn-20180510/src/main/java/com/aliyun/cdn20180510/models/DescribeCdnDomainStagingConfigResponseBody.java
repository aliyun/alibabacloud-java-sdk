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
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>C80705BF-0F76-41FA-BAD1-5B59296A4E59</p>
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
         * 
         * <strong>example:</strong>
         * <p>auth_type</p>
         */
        @NameInMap("ArgName")
        public String argName;

        /**
         * <p>The configuration value.</p>
         * 
         * <strong>example:</strong>
         * <p>req_auth</p>
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
         * 
         * <strong>example:</strong>
         * <p>6xx5</p>
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
         * 
         * <strong>example:</strong>
         * <p>aliauth</p>
         */
        @NameInMap("FunctionName")
        public String functionName;

        /**
         * <p>The rule condition ID. This parameter is optional. To create a rule condition, you can configure the <strong>condition</strong> feature that is described in the <a href="https://help.aliyun.com/document_detail/388460.html">Parameters for configuring features for domain names</a> topic. A rule condition can identify parameters that are included in requests and filter requests based on the identified parameters. Each rule condition has a <a href="https://help.aliyun.com/document_detail/388994.html">ConfigId</a>. You can reference ConfigId instead of ParentId in other features. This way, you can combine rule conditions and features for flexible configurations. For more information, see <a href="https://help.aliyun.com/document_detail/90915.html">BatchSetCdnDomainConfig</a> or ParentId configuration example in this topic.</p>
         * 
         * <strong>example:</strong>
         * <p>222728944812032</p>
         */
        @NameInMap("ParentId")
        public String parentId;

        /**
         * <p>The configuration status. Valid values:</p>
         * <ul>
         * <li><strong>testing</strong></li>
         * <li><strong>configuring</strong></li>
         * <li><strong>success</strong></li>
         * <li><strong>failed</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>success</p>
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
