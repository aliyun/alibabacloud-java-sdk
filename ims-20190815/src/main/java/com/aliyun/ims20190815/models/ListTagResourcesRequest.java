// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class ListTagResourcesRequest extends TeaModel {
    /**
     * <p>The token that is used to initiate the next request if the response of the current request is truncated. You can use the token to initiate another request and obtain the remaining records.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The number of entries per page. If a response is truncated because it reaches the value of PageSize, the value of IsTruncated will be true. Valid values: 1 to 100. Default value: 100.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of resource N.</p>
     * <br>
     * <p>Valid values of N: 1 to 50. If ResourceType is set to user, the resource ID is the ID of the RAM user.</p>
     * <br>
     * <p>> You must specify only one of the following parameters: ResourceId and ResourcePrincipalName.</p>
     */
    @NameInMap("ResourceId")
    public java.util.List<String> resourceId;

    /**
     * <p>The name of resource N.</p>
     * <br>
     * <p>Valid values of N: 1 to 50. If ResourceType is set to user, the resource name is the name of the RAM user.</p>
     * <br>
     * <p>> You must specify only one of the following parameters: ResourceId and ResourcePrincipalName.</p>
     */
    @NameInMap("ResourcePrincipalName")
    public java.util.List<String> resourcePrincipalName;

    /**
     * <p>The type of the resource. Valid value:</p>
     * <br>
     * <p>*   user: a RAM user</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The tag value.</p>
     * <br>
     * <p>Valid values of N: 1 to 20. N must be consecutive.</p>
     */
    @NameInMap("Tag")
    public java.util.List<ListTagResourcesRequestTag> tag;

    public static ListTagResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTagResourcesRequest self = new ListTagResourcesRequest();
        return TeaModel.build(map, self);
    }

    public ListTagResourcesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListTagResourcesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListTagResourcesRequest setResourceId(java.util.List<String> resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public java.util.List<String> getResourceId() {
        return this.resourceId;
    }

    public ListTagResourcesRequest setResourcePrincipalName(java.util.List<String> resourcePrincipalName) {
        this.resourcePrincipalName = resourcePrincipalName;
        return this;
    }
    public java.util.List<String> getResourcePrincipalName() {
        return this.resourcePrincipalName;
    }

    public ListTagResourcesRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public ListTagResourcesRequest setTag(java.util.List<ListTagResourcesRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<ListTagResourcesRequestTag> getTag() {
        return this.tag;
    }

    public static class ListTagResourcesRequestTag extends TeaModel {
        /**
         * <p>The key of tag N.</p>
         * <br>
         * <p>Valid values of N: 1 to 20. N must be consecutive.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of tag N.</p>
         * <br>
         * <p>Valid values of N: 1 to 20. N must be consecutive.</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListTagResourcesRequestTag build(java.util.Map<String, ?> map) throws Exception {
            ListTagResourcesRequestTag self = new ListTagResourcesRequestTag();
            return TeaModel.build(map, self);
        }

        public ListTagResourcesRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListTagResourcesRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
