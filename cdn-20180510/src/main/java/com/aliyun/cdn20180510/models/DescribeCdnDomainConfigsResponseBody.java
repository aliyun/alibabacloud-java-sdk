// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnDomainConfigsResponseBody extends TeaModel {
    /**
     * <p>The configurations of the domain name.</p>
     */
    @NameInMap("DomainConfigs")
    public DescribeCdnDomainConfigsResponseBodyDomainConfigs domainConfigs;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>C80705BF-0F76-41FA-BAD1-5B59296A4E59</p>
     */
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
        /**
         * <p>The parameter name, which is the configuration item of <strong>functionName</strong>. You can configure multiple configuration items.</p>
         * 
         * <strong>example:</strong>
         * <p>auth_type</p>
         */
        @NameInMap("ArgName")
        public String argName;

        /**
         * <p>The parameter value, which is the value of the configuration item of <strong>functionName</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>req_auth</p>
         */
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
        /**
         * <p>The ID of the configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>6295</p>
         */
        @NameInMap("ConfigId")
        public String configId;

        /**
         * <p>The configuration of each feature.</p>
         */
        @NameInMap("FunctionArgs")
        public DescribeCdnDomainConfigsResponseBodyDomainConfigsDomainConfigFunctionArgs functionArgs;

        /**
         * <p>The name of the feature.</p>
         * 
         * <strong>example:</strong>
         * <p>aliauth</p>
         */
        @NameInMap("FunctionName")
        public String functionName;

        /**
         * <p>The ID of the rule condition. This parameter is optional.</p>
         * <p>To create a rule condition, you can configure the <strong>condition</strong> feature that is described in the <a href="https://help.aliyun.com/document_detail/388460.html">Parameters for configuring features for domain names</a> topic. A rule condition can identify parameters that are included in requests and filter requests based on the identified parameters. Each rule condition has a <a href="https://help.aliyun.com/document_detail/388994.html">ConfigId</a>. You can use ConfigId as ParentId that is referenced by other features. This way, you can combine rule conditions and features for flexible configurations.</p>
         * <p>For more information, see <a href="https://help.aliyun.com/document_detail/90915.html">BatchSetCdnDomainConfig</a> or ParentId configuration example in this topic.</p>
         * 
         * <strong>example:</strong>
         * <p>222728944812032</p>
         */
        @NameInMap("ParentId")
        public String parentId;

        /**
         * <p>The status of the configuration. Valid values:</p>
         * <ul>
         * <li><strong>success</strong></li>
         * <li><strong>testing</strong></li>
         * <li><strong>failed</strong></li>
         * <li><strong>configuring</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
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
