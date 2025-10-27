// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fnf20190315.models;

import com.aliyun.tea.*;

public class DescribeFlowAliasResponseBody extends TeaModel {
    @NameInMap("Alias")
    public DescribeFlowAliasResponseBodyAlias alias;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>294D68C1-5108-5971-853A-1A9CC87B4816</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeFlowAliasResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeFlowAliasResponseBody self = new DescribeFlowAliasResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeFlowAliasResponseBody setAlias(DescribeFlowAliasResponseBodyAlias alias) {
        this.alias = alias;
        return this;
    }
    public DescribeFlowAliasResponseBodyAlias getAlias() {
        return this.alias;
    }

    public DescribeFlowAliasResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeFlowAliasResponseBodyAliasRoutingConfigurations extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Version")
        public String version;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Weight")
        public Integer weight;

        public static DescribeFlowAliasResponseBodyAliasRoutingConfigurations build(java.util.Map<String, ?> map) throws Exception {
            DescribeFlowAliasResponseBodyAliasRoutingConfigurations self = new DescribeFlowAliasResponseBodyAliasRoutingConfigurations();
            return TeaModel.build(map, self);
        }

        public DescribeFlowAliasResponseBodyAliasRoutingConfigurations setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public DescribeFlowAliasResponseBodyAliasRoutingConfigurations setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

    }

    public static class DescribeFlowAliasResponseBodyAlias extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2024-04-22T06:09:39.907Z</p>
         */
        @NameInMap("CreatedTime")
        public String createdTime;

        /**
         * <strong>example:</strong>
         * <p>alias description</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>alias-name</p>
         */
        @NameInMap("Name")
        public String name;

        @NameInMap("RoutingConfigurations")
        public java.util.List<DescribeFlowAliasResponseBodyAliasRoutingConfigurations> routingConfigurations;

        public static DescribeFlowAliasResponseBodyAlias build(java.util.Map<String, ?> map) throws Exception {
            DescribeFlowAliasResponseBodyAlias self = new DescribeFlowAliasResponseBodyAlias();
            return TeaModel.build(map, self);
        }

        public DescribeFlowAliasResponseBodyAlias setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public DescribeFlowAliasResponseBodyAlias setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeFlowAliasResponseBodyAlias setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeFlowAliasResponseBodyAlias setRoutingConfigurations(java.util.List<DescribeFlowAliasResponseBodyAliasRoutingConfigurations> routingConfigurations) {
            this.routingConfigurations = routingConfigurations;
            return this;
        }
        public java.util.List<DescribeFlowAliasResponseBodyAliasRoutingConfigurations> getRoutingConfigurations() {
            return this.routingConfigurations;
        }

    }

}
