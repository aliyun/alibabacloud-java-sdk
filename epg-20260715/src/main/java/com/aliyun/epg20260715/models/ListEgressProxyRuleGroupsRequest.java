// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.epg20260715.models;

import com.aliyun.tea.*;

public class ListEgressProxyRuleGroupsRequest extends TeaModel {
    @NameInMap("EgressProxyRuleGroupIds")
    public java.util.List<String> egressProxyRuleGroupIds;

    @NameInMap("EgressProxyRuleGroupNames")
    public java.util.List<String> egressProxyRuleGroupNames;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>FFmyTO70tTpLG6I3FmYAXGKPd****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>rg-acfmwk2r5tq****</p>
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
     * <p>Available</p>
     */
    @NameInMap("Status")
    public String status;

    @NameInMap("Tag")
    public java.util.List<ListEgressProxyRuleGroupsRequestTag> tag;

    public static ListEgressProxyRuleGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListEgressProxyRuleGroupsRequest self = new ListEgressProxyRuleGroupsRequest();
        return TeaModel.build(map, self);
    }

    public ListEgressProxyRuleGroupsRequest setEgressProxyRuleGroupIds(java.util.List<String> egressProxyRuleGroupIds) {
        this.egressProxyRuleGroupIds = egressProxyRuleGroupIds;
        return this;
    }
    public java.util.List<String> getEgressProxyRuleGroupIds() {
        return this.egressProxyRuleGroupIds;
    }

    public ListEgressProxyRuleGroupsRequest setEgressProxyRuleGroupNames(java.util.List<String> egressProxyRuleGroupNames) {
        this.egressProxyRuleGroupNames = egressProxyRuleGroupNames;
        return this;
    }
    public java.util.List<String> getEgressProxyRuleGroupNames() {
        return this.egressProxyRuleGroupNames;
    }

    public ListEgressProxyRuleGroupsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListEgressProxyRuleGroupsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListEgressProxyRuleGroupsRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ListEgressProxyRuleGroupsRequest setSkip(Integer skip) {
        this.skip = skip;
        return this;
    }
    public Integer getSkip() {
        return this.skip;
    }

    public ListEgressProxyRuleGroupsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListEgressProxyRuleGroupsRequest setTag(java.util.List<ListEgressProxyRuleGroupsRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<ListEgressProxyRuleGroupsRequestTag> getTag() {
        return this.tag;
    }

    public static class ListEgressProxyRuleGroupsRequestTag extends TeaModel {
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

        public static ListEgressProxyRuleGroupsRequestTag build(java.util.Map<String, ?> map) throws Exception {
            ListEgressProxyRuleGroupsRequestTag self = new ListEgressProxyRuleGroupsRequestTag();
            return TeaModel.build(map, self);
        }

        public ListEgressProxyRuleGroupsRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListEgressProxyRuleGroupsRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
