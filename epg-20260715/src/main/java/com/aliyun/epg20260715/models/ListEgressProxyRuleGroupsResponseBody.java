// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.epg20260715.models;

import com.aliyun.tea.*;

public class ListEgressProxyRuleGroupsResponseBody extends TeaModel {
    @NameInMap("EgressProxyRuleGroups")
    public java.util.List<ListEgressProxyRuleGroupsResponseBodyEgressProxyRuleGroups> egressProxyRuleGroups;

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
     * <p>01A05AB5-5BED-56ED-8EE9-304FBC2F8537</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListEgressProxyRuleGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListEgressProxyRuleGroupsResponseBody self = new ListEgressProxyRuleGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListEgressProxyRuleGroupsResponseBody setEgressProxyRuleGroups(java.util.List<ListEgressProxyRuleGroupsResponseBodyEgressProxyRuleGroups> egressProxyRuleGroups) {
        this.egressProxyRuleGroups = egressProxyRuleGroups;
        return this;
    }
    public java.util.List<ListEgressProxyRuleGroupsResponseBodyEgressProxyRuleGroups> getEgressProxyRuleGroups() {
        return this.egressProxyRuleGroups;
    }

    public ListEgressProxyRuleGroupsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListEgressProxyRuleGroupsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListEgressProxyRuleGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListEgressProxyRuleGroupsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListEgressProxyRuleGroupsResponseBodyEgressProxyRuleGroupsTags extends TeaModel {
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

        public static ListEgressProxyRuleGroupsResponseBodyEgressProxyRuleGroupsTags build(java.util.Map<String, ?> map) throws Exception {
            ListEgressProxyRuleGroupsResponseBodyEgressProxyRuleGroupsTags self = new ListEgressProxyRuleGroupsResponseBodyEgressProxyRuleGroupsTags();
            return TeaModel.build(map, self);
        }

        public ListEgressProxyRuleGroupsResponseBodyEgressProxyRuleGroupsTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListEgressProxyRuleGroupsResponseBodyEgressProxyRuleGroupsTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListEgressProxyRuleGroupsResponseBodyEgressProxyRuleGroups extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2026-08-06T03:18:12Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>testEpg</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>eppool-2ze06f6a9a2067ae****</p>
         */
        @NameInMap("EgressProxyIpPoolId")
        public String egressProxyIpPoolId;

        /**
         * <strong>example:</strong>
         * <p>eprg-uf60966a9633667c****</p>
         */
        @NameInMap("EgressProxyRuleGroupId")
        public String egressProxyRuleGroupId;

        /**
         * <strong>example:</strong>
         * <p>testEpg</p>
         */
        @NameInMap("EgressProxyRuleGroupName")
        public String egressProxyRuleGroupName;

        /**
         * <strong>example:</strong>
         * <p>rg-acfmwj4y6s7***</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <strong>example:</strong>
         * <p>Available</p>
         */
        @NameInMap("Status")
        public String status;

        @NameInMap("Tags")
        public java.util.List<ListEgressProxyRuleGroupsResponseBodyEgressProxyRuleGroupsTags> tags;

        public static ListEgressProxyRuleGroupsResponseBodyEgressProxyRuleGroups build(java.util.Map<String, ?> map) throws Exception {
            ListEgressProxyRuleGroupsResponseBodyEgressProxyRuleGroups self = new ListEgressProxyRuleGroupsResponseBodyEgressProxyRuleGroups();
            return TeaModel.build(map, self);
        }

        public ListEgressProxyRuleGroupsResponseBodyEgressProxyRuleGroups setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListEgressProxyRuleGroupsResponseBodyEgressProxyRuleGroups setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListEgressProxyRuleGroupsResponseBodyEgressProxyRuleGroups setEgressProxyIpPoolId(String egressProxyIpPoolId) {
            this.egressProxyIpPoolId = egressProxyIpPoolId;
            return this;
        }
        public String getEgressProxyIpPoolId() {
            return this.egressProxyIpPoolId;
        }

        public ListEgressProxyRuleGroupsResponseBodyEgressProxyRuleGroups setEgressProxyRuleGroupId(String egressProxyRuleGroupId) {
            this.egressProxyRuleGroupId = egressProxyRuleGroupId;
            return this;
        }
        public String getEgressProxyRuleGroupId() {
            return this.egressProxyRuleGroupId;
        }

        public ListEgressProxyRuleGroupsResponseBodyEgressProxyRuleGroups setEgressProxyRuleGroupName(String egressProxyRuleGroupName) {
            this.egressProxyRuleGroupName = egressProxyRuleGroupName;
            return this;
        }
        public String getEgressProxyRuleGroupName() {
            return this.egressProxyRuleGroupName;
        }

        public ListEgressProxyRuleGroupsResponseBodyEgressProxyRuleGroups setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public ListEgressProxyRuleGroupsResponseBodyEgressProxyRuleGroups setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListEgressProxyRuleGroupsResponseBodyEgressProxyRuleGroups setTags(java.util.List<ListEgressProxyRuleGroupsResponseBodyEgressProxyRuleGroupsTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListEgressProxyRuleGroupsResponseBodyEgressProxyRuleGroupsTags> getTags() {
            return this.tags;
        }

    }

}
