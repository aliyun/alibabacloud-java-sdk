// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class ListServerGroupsRequest extends TeaModel {
    /**
     * <p>The number of entries per page. Valid values: <strong>1</strong> to <strong>100</strong>. Default value: <strong>20</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. Valid values:</p>
     * <ul>
     * <li>You do not need to specify this parameter for the first request.</li>
     * <li>You must specify the token that is obtained from the previous query as the value of <strong>NextToken</strong>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>FFmyTO70tTpLG6I3FmYAXG****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the resource group to which the server group belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-atstuj3rtop****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The server group IDs.</p>
     */
    @NameInMap("ServerGroupIds")
    public java.util.List<String> serverGroupIds;

    /**
     * <p>The names of the server groups to be queried. You can specify at most 10 server group names.</p>
     */
    @NameInMap("ServerGroupNames")
    public java.util.List<String> serverGroupNames;

    /**
     * <strong>example:</strong>
     * <p>Instance</p>
     */
    @NameInMap("ServerGroupType")
    public String serverGroupType;

    /**
     * <p>The tags that are added to the server group. You can specify up to 10 tags in each call.</p>
     * 
     * <strong>example:</strong>
     * <p>Instance</p>
     */
    @NameInMap("Tag")
    public java.util.List<ListServerGroupsRequestTag> tag;

    /**
     * <p>The ID of the virtual private cloud (VPC).</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-bp15zckdt37pq72zv****</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    public static ListServerGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListServerGroupsRequest self = new ListServerGroupsRequest();
        return TeaModel.build(map, self);
    }

    public ListServerGroupsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListServerGroupsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListServerGroupsRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ListServerGroupsRequest setServerGroupIds(java.util.List<String> serverGroupIds) {
        this.serverGroupIds = serverGroupIds;
        return this;
    }
    public java.util.List<String> getServerGroupIds() {
        return this.serverGroupIds;
    }

    public ListServerGroupsRequest setServerGroupNames(java.util.List<String> serverGroupNames) {
        this.serverGroupNames = serverGroupNames;
        return this;
    }
    public java.util.List<String> getServerGroupNames() {
        return this.serverGroupNames;
    }

    public ListServerGroupsRequest setServerGroupType(String serverGroupType) {
        this.serverGroupType = serverGroupType;
        return this;
    }
    public String getServerGroupType() {
        return this.serverGroupType;
    }

    public ListServerGroupsRequest setTag(java.util.List<ListServerGroupsRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<ListServerGroupsRequestTag> getTag() {
        return this.tag;
    }

    public ListServerGroupsRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public static class ListServerGroupsRequestTag extends TeaModel {
        /**
         * <p>The tag key. You can specify up to 10 tag keys.</p>
         * <p>The tag key can be up to 64 characters in length and cannot contain <code>http://</code> or <code>https://</code>. It cannot start with <code>aliyun</code> or <code>acs:</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>Test</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value. You can specify up to 10 tag values.</p>
         * <p>The tag value can be up to 128 characters in length, and cannot contain <code>http://</code> or <code>https://</code>. It cannot start with <code>aliyun</code> or <code>acs:</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>Test</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListServerGroupsRequestTag build(java.util.Map<String, ?> map) throws Exception {
            ListServerGroupsRequestTag self = new ListServerGroupsRequestTag();
            return TeaModel.build(map, self);
        }

        public ListServerGroupsRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListServerGroupsRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
