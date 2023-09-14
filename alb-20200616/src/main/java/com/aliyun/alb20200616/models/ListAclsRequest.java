// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class ListAclsRequest extends TeaModel {
    /**
     * <p>The ACL IDs.</p>
     */
    @NameInMap("AclIds")
    public java.util.List<String> aclIds;

    /**
     * <p>The ACL names. You can specify up to 10 ACL names in each request.</p>
     */
    @NameInMap("AclNames")
    public java.util.List<String> aclNames;

    /**
     * <p>The maximum number of entries to return. This parameter is optional. Valid values: **1** to **100**. Default value: **20**.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. Valid values:</p>
     * <br>
     * <p>*   You do not need to specify this parameter for the first request.</p>
     * <p>*   You must specify the token that is obtained from the previous query as the value of NextToken.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The resource group ID. You can filter the results based on the specified ID.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

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
        @NameInMap("Key")
        public String key;

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
