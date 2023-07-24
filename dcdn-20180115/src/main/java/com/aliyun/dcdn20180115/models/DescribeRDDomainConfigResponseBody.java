// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeRDDomainConfigResponseBody extends TeaModel {
    /**
     * <p>The configuration of the domain name.</p>
     */
    @NameInMap("DomainConfigs")
    public java.util.List<DescribeRDDomainConfigResponseBodyDomainConfigs> domainConfigs;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeRDDomainConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRDDomainConfigResponseBody self = new DescribeRDDomainConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRDDomainConfigResponseBody setDomainConfigs(java.util.List<DescribeRDDomainConfigResponseBodyDomainConfigs> domainConfigs) {
        this.domainConfigs = domainConfigs;
        return this;
    }
    public java.util.List<DescribeRDDomainConfigResponseBodyDomainConfigs> getDomainConfigs() {
        return this.domainConfigs;
    }

    public DescribeRDDomainConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeRDDomainConfigResponseBodyDomainConfigsFunctionArgs extends TeaModel {
        /**
         * <p>The name of the configuration.</p>
         */
        @NameInMap("ArgName")
        public String argName;

        /**
         * <p>The value of the configuration.</p>
         */
        @NameInMap("ArgValue")
        public String argValue;

        public static DescribeRDDomainConfigResponseBodyDomainConfigsFunctionArgs build(java.util.Map<String, ?> map) throws Exception {
            DescribeRDDomainConfigResponseBodyDomainConfigsFunctionArgs self = new DescribeRDDomainConfigResponseBodyDomainConfigsFunctionArgs();
            return TeaModel.build(map, self);
        }

        public DescribeRDDomainConfigResponseBodyDomainConfigsFunctionArgs setArgName(String argName) {
            this.argName = argName;
            return this;
        }
        public String getArgName() {
            return this.argName;
        }

        public DescribeRDDomainConfigResponseBodyDomainConfigsFunctionArgs setArgValue(String argValue) {
            this.argValue = argValue;
            return this;
        }
        public String getArgValue() {
            return this.argValue;
        }

    }

    public static class DescribeRDDomainConfigResponseBodyDomainConfigs extends TeaModel {
        /**
         * <p>The ID of the configuration.</p>
         */
        @NameInMap("ConfigId")
        public Long configId;

        /**
         * <p>The configurations of the features.</p>
         */
        @NameInMap("FunctionArgs")
        public java.util.List<DescribeRDDomainConfigResponseBodyDomainConfigsFunctionArgs> functionArgs;

        /**
         * <p>The name of the feature.</p>
         */
        @NameInMap("FunctionName")
        public String functionName;

        /**
         * <p>The ID of the advanced condition configuration.</p>
         */
        @NameInMap("ParentId")
        public String parentId;

        /**
         * <p>The status. Valid values:</p>
         * <br>
         * <p>*   **success**</p>
         * <p>*   **testing**</p>
         * <p>*   **failed**</p>
         * <p>*   **configuring**</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeRDDomainConfigResponseBodyDomainConfigs build(java.util.Map<String, ?> map) throws Exception {
            DescribeRDDomainConfigResponseBodyDomainConfigs self = new DescribeRDDomainConfigResponseBodyDomainConfigs();
            return TeaModel.build(map, self);
        }

        public DescribeRDDomainConfigResponseBodyDomainConfigs setConfigId(Long configId) {
            this.configId = configId;
            return this;
        }
        public Long getConfigId() {
            return this.configId;
        }

        public DescribeRDDomainConfigResponseBodyDomainConfigs setFunctionArgs(java.util.List<DescribeRDDomainConfigResponseBodyDomainConfigsFunctionArgs> functionArgs) {
            this.functionArgs = functionArgs;
            return this;
        }
        public java.util.List<DescribeRDDomainConfigResponseBodyDomainConfigsFunctionArgs> getFunctionArgs() {
            return this.functionArgs;
        }

        public DescribeRDDomainConfigResponseBodyDomainConfigs setFunctionName(String functionName) {
            this.functionName = functionName;
            return this;
        }
        public String getFunctionName() {
            return this.functionName;
        }

        public DescribeRDDomainConfigResponseBodyDomainConfigs setParentId(String parentId) {
            this.parentId = parentId;
            return this;
        }
        public String getParentId() {
            return this.parentId;
        }

        public DescribeRDDomainConfigResponseBodyDomainConfigs setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
