// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QueryTagResourcesNewRequest extends TeaModel {
    @NameInMap("Category")
    public String category;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ProdCode")
    public String prodCode;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceId")
    public java.util.List<String> resourceId;

    @NameInMap("ResourceIdListString")
    public String resourceIdListString;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    @NameInMap("Tag")
    public java.util.List<QueryTagResourcesNewRequestTag> tag;

    @NameInMap("TagListString")
    public String tagListString;

    public static QueryTagResourcesNewRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTagResourcesNewRequest self = new QueryTagResourcesNewRequest();
        return TeaModel.build(map, self);
    }

    public QueryTagResourcesNewRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public QueryTagResourcesNewRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public QueryTagResourcesNewRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public QueryTagResourcesNewRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryTagResourcesNewRequest setProdCode(String prodCode) {
        this.prodCode = prodCode;
        return this;
    }
    public String getProdCode() {
        return this.prodCode;
    }

    public QueryTagResourcesNewRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public QueryTagResourcesNewRequest setResourceId(java.util.List<String> resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public java.util.List<String> getResourceId() {
        return this.resourceId;
    }

    public QueryTagResourcesNewRequest setResourceIdListString(String resourceIdListString) {
        this.resourceIdListString = resourceIdListString;
        return this;
    }
    public String getResourceIdListString() {
        return this.resourceIdListString;
    }

    public QueryTagResourcesNewRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public QueryTagResourcesNewRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public QueryTagResourcesNewRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public QueryTagResourcesNewRequest setTag(java.util.List<QueryTagResourcesNewRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<QueryTagResourcesNewRequestTag> getTag() {
        return this.tag;
    }

    public QueryTagResourcesNewRequest setTagListString(String tagListString) {
        this.tagListString = tagListString;
        return this;
    }
    public String getTagListString() {
        return this.tagListString;
    }

    public static class QueryTagResourcesNewRequestTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static QueryTagResourcesNewRequestTag build(java.util.Map<String, ?> map) throws Exception {
            QueryTagResourcesNewRequestTag self = new QueryTagResourcesNewRequestTag();
            return TeaModel.build(map, self);
        }

        public QueryTagResourcesNewRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public QueryTagResourcesNewRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
