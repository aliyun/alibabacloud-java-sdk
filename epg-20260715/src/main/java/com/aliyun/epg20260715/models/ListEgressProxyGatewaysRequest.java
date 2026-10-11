// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.epg20260715.models;

import com.aliyun.tea.*;

public class ListEgressProxyGatewaysRequest extends TeaModel {
    @NameInMap("EgressProxyConfigurationIds")
    public java.util.List<String> egressProxyConfigurationIds;

    @NameInMap("EgressProxyGatewayIds")
    public java.util.List<String> egressProxyGatewayIds;

    @NameInMap("EgressProxyGatewayNames")
    public java.util.List<String> egressProxyGatewayNames;

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
     * <p>rg-acfm4jcyx5e****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Skip")
    public Integer skip;

    /**
     * <strong>example:</strong>
     * <p>Active</p>
     */
    @NameInMap("Status")
    public String status;

    @NameInMap("Tag")
    public java.util.List<ListEgressProxyGatewaysRequestTag> tag;

    @NameInMap("VpcIds")
    public java.util.List<String> vpcIds;

    public static ListEgressProxyGatewaysRequest build(java.util.Map<String, ?> map) throws Exception {
        ListEgressProxyGatewaysRequest self = new ListEgressProxyGatewaysRequest();
        return TeaModel.build(map, self);
    }

    public ListEgressProxyGatewaysRequest setEgressProxyConfigurationIds(java.util.List<String> egressProxyConfigurationIds) {
        this.egressProxyConfigurationIds = egressProxyConfigurationIds;
        return this;
    }
    public java.util.List<String> getEgressProxyConfigurationIds() {
        return this.egressProxyConfigurationIds;
    }

    public ListEgressProxyGatewaysRequest setEgressProxyGatewayIds(java.util.List<String> egressProxyGatewayIds) {
        this.egressProxyGatewayIds = egressProxyGatewayIds;
        return this;
    }
    public java.util.List<String> getEgressProxyGatewayIds() {
        return this.egressProxyGatewayIds;
    }

    public ListEgressProxyGatewaysRequest setEgressProxyGatewayNames(java.util.List<String> egressProxyGatewayNames) {
        this.egressProxyGatewayNames = egressProxyGatewayNames;
        return this;
    }
    public java.util.List<String> getEgressProxyGatewayNames() {
        return this.egressProxyGatewayNames;
    }

    public ListEgressProxyGatewaysRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListEgressProxyGatewaysRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListEgressProxyGatewaysRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ListEgressProxyGatewaysRequest setSkip(Integer skip) {
        this.skip = skip;
        return this;
    }
    public Integer getSkip() {
        return this.skip;
    }

    public ListEgressProxyGatewaysRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListEgressProxyGatewaysRequest setTag(java.util.List<ListEgressProxyGatewaysRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<ListEgressProxyGatewaysRequestTag> getTag() {
        return this.tag;
    }

    public ListEgressProxyGatewaysRequest setVpcIds(java.util.List<String> vpcIds) {
        this.vpcIds = vpcIds;
        return this;
    }
    public java.util.List<String> getVpcIds() {
        return this.vpcIds;
    }

    public static class ListEgressProxyGatewaysRequestTag extends TeaModel {
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

        public static ListEgressProxyGatewaysRequestTag build(java.util.Map<String, ?> map) throws Exception {
            ListEgressProxyGatewaysRequestTag self = new ListEgressProxyGatewaysRequestTag();
            return TeaModel.build(map, self);
        }

        public ListEgressProxyGatewaysRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListEgressProxyGatewaysRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
