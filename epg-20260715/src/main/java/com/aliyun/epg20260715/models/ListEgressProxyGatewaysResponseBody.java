// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.epg20260715.models;

import com.aliyun.tea.*;

public class ListEgressProxyGatewaysResponseBody extends TeaModel {
    @NameInMap("EgressProxyGateways")
    public java.util.List<ListEgressProxyGatewaysResponseBodyEgressProxyGateways> egressProxyGateways;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>FFmyTO70tTpLG6I4FmYAXGKPd****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>01A05AB6-3B8A-561C-8CC6-D061498BDEBC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListEgressProxyGatewaysResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListEgressProxyGatewaysResponseBody self = new ListEgressProxyGatewaysResponseBody();
        return TeaModel.build(map, self);
    }

    public ListEgressProxyGatewaysResponseBody setEgressProxyGateways(java.util.List<ListEgressProxyGatewaysResponseBodyEgressProxyGateways> egressProxyGateways) {
        this.egressProxyGateways = egressProxyGateways;
        return this;
    }
    public java.util.List<ListEgressProxyGatewaysResponseBodyEgressProxyGateways> getEgressProxyGateways() {
        return this.egressProxyGateways;
    }

    public ListEgressProxyGatewaysResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListEgressProxyGatewaysResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListEgressProxyGatewaysResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListEgressProxyGatewaysResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListEgressProxyGatewaysResponseBodyEgressProxyGatewaysTags extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>epg</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListEgressProxyGatewaysResponseBodyEgressProxyGatewaysTags build(java.util.Map<String, ?> map) throws Exception {
            ListEgressProxyGatewaysResponseBodyEgressProxyGatewaysTags self = new ListEgressProxyGatewaysResponseBodyEgressProxyGatewaysTags();
            return TeaModel.build(map, self);
        }

        public ListEgressProxyGatewaysResponseBodyEgressProxyGatewaysTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListEgressProxyGatewaysResponseBodyEgressProxyGatewaysTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListEgressProxyGatewaysResponseBodyEgressProxyGateways extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2022-07-02T02:49:05Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>eppool-gw80d96a96ca0b00****</p>
         */
        @NameInMap("DefaultEgressProxyIpPoolId")
        public String defaultEgressProxyIpPoolId;

        /**
         * <strong>example:</strong>
         * <p>created by epg</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>epc-uf609a6a8fdf9f4****</p>
         */
        @NameInMap("EgressProxyConfigurationId")
        public String egressProxyConfigurationId;

        /**
         * <strong>example:</strong>
         * <p>epg-gw80bb6a94f835db****</p>
         */
        @NameInMap("EgressProxyGatewayId")
        public String egressProxyGatewayId;

        /**
         * <strong>example:</strong>
         * <p>testEpg</p>
         */
        @NameInMap("EgressProxyGatewayName")
        public String egressProxyGatewayName;

        /**
         * <strong>example:</strong>
         * <p>rg-acfmypqurk****</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <strong>example:</strong>
         * <p>Provisioning</p>
         */
        @NameInMap("Status")
        public String status;

        @NameInMap("Tags")
        public java.util.List<ListEgressProxyGatewaysResponseBodyEgressProxyGatewaysTags> tags;

        /**
         * <strong>example:</strong>
         * <p>vpc-m5e03az9xwn6siqft****</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        public static ListEgressProxyGatewaysResponseBodyEgressProxyGateways build(java.util.Map<String, ?> map) throws Exception {
            ListEgressProxyGatewaysResponseBodyEgressProxyGateways self = new ListEgressProxyGatewaysResponseBodyEgressProxyGateways();
            return TeaModel.build(map, self);
        }

        public ListEgressProxyGatewaysResponseBodyEgressProxyGateways setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListEgressProxyGatewaysResponseBodyEgressProxyGateways setDefaultEgressProxyIpPoolId(String defaultEgressProxyIpPoolId) {
            this.defaultEgressProxyIpPoolId = defaultEgressProxyIpPoolId;
            return this;
        }
        public String getDefaultEgressProxyIpPoolId() {
            return this.defaultEgressProxyIpPoolId;
        }

        public ListEgressProxyGatewaysResponseBodyEgressProxyGateways setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListEgressProxyGatewaysResponseBodyEgressProxyGateways setEgressProxyConfigurationId(String egressProxyConfigurationId) {
            this.egressProxyConfigurationId = egressProxyConfigurationId;
            return this;
        }
        public String getEgressProxyConfigurationId() {
            return this.egressProxyConfigurationId;
        }

        public ListEgressProxyGatewaysResponseBodyEgressProxyGateways setEgressProxyGatewayId(String egressProxyGatewayId) {
            this.egressProxyGatewayId = egressProxyGatewayId;
            return this;
        }
        public String getEgressProxyGatewayId() {
            return this.egressProxyGatewayId;
        }

        public ListEgressProxyGatewaysResponseBodyEgressProxyGateways setEgressProxyGatewayName(String egressProxyGatewayName) {
            this.egressProxyGatewayName = egressProxyGatewayName;
            return this;
        }
        public String getEgressProxyGatewayName() {
            return this.egressProxyGatewayName;
        }

        public ListEgressProxyGatewaysResponseBodyEgressProxyGateways setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public ListEgressProxyGatewaysResponseBodyEgressProxyGateways setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListEgressProxyGatewaysResponseBodyEgressProxyGateways setTags(java.util.List<ListEgressProxyGatewaysResponseBodyEgressProxyGatewaysTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListEgressProxyGatewaysResponseBodyEgressProxyGatewaysTags> getTags() {
            return this.tags;
        }

        public ListEgressProxyGatewaysResponseBodyEgressProxyGateways setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
