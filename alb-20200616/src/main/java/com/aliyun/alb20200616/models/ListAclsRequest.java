// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class ListAclsRequest extends TeaModel {
    /**
     * <p>Filter access control lists (ACLs) by ACL ID.</p>
     */
    @NameInMap("AclIds")
    public java.util.List<String> aclIds;

    /**
     * <p>The names of the network ACLs. You can specify at most 10 network ACL names in each request.</p>
     */
    @NameInMap("AclNames")
    public java.util.List<String> aclNames;

    /**
     * <p>The maximum number of entries to return. This parameter is optional. Valid values: <strong>1</strong> to <strong>100</strong>. Default value: <strong>20</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that is used for the next query. Valid values:</p>
     * <ul>
     * <li>If this is your first query or no next query is to be sent, ignore this parameter.</li>
     * <li>If a next query is to be sent, set the value to the value of NextToken that is returned from the last call.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>FFmyTO70tTpLG6I3FmYAXGKPd****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the resource group. You can filter the query results based on the specified ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-atstuj3rtopty****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<ListAclsRequestTag> tag;

    public static ListAclsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAclsRequest self = new ListAclsRequest();
        return TeaModel.build(map, self);
    }

    public ListAclsRequest setAclIds(java.util.List<String> aclIds) {
        this.aclIds = aclIds;
        return this;
    }
    public java.util.List<String> getAclIds() {
        return this.aclIds;
    }

    public ListAclsRequest setAclNames(java.util.List<String> aclNames) {
        this.aclNames = aclNames;
        return this;
    }
    public java.util.List<String> getAclNames() {
        return this.aclNames;
    }

    public ListAclsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListAclsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListAclsRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ListAclsRequest setTag(java.util.List<ListAclsRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<ListAclsRequestTag> getTag() {
        return this.tag;
    }

    public static class ListAclsRequestTag extends TeaModel {
        /**
         * <p>The tag key. The tag key can be up to 128 characters in length and cannot start with <code>acs:</code> or <code>aliyun</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>env</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value. The tag value can be up to 128 characters in length and cannot start with <code>acs:</code> or <code>aliyun</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>product</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListAclsRequestTag build(java.util.Map<String, ?> map) throws Exception {
            ListAclsRequestTag self = new ListAclsRequestTag();
            return TeaModel.build(map, self);
        }

        public ListAclsRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListAclsRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
