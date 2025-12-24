// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ListLiveTagResourcesRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>q2j8bLtBdhONLRkgaPBa6A==</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceId")
    public java.util.List<String> resourceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>DOMAIN</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    @NameInMap("Tag")
    public java.util.List<ListLiveTagResourcesRequestTag> tag;

    /**
     * <strong>example:</strong>
     * <p>26842</p>
     */
    @NameInMap("TagOwnerBid")
    public String tagOwnerBid;

    /**
     * <strong>example:</strong>
     * <p>xxx1234xxx</p>
     */
    @NameInMap("TagOwnerUid")
    public String tagOwnerUid;

    public static ListLiveTagResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListLiveTagResourcesRequest self = new ListLiveTagResourcesRequest();
        return TeaModel.build(map, self);
    }

    public ListLiveTagResourcesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListLiveTagResourcesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ListLiveTagResourcesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListLiveTagResourcesRequest setResourceId(java.util.List<String> resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public java.util.List<String> getResourceId() {
        return this.resourceId;
    }

    public ListLiveTagResourcesRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public ListLiveTagResourcesRequest setTag(java.util.List<ListLiveTagResourcesRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<ListLiveTagResourcesRequestTag> getTag() {
        return this.tag;
    }

    public ListLiveTagResourcesRequest setTagOwnerBid(String tagOwnerBid) {
        this.tagOwnerBid = tagOwnerBid;
        return this;
    }
    public String getTagOwnerBid() {
        return this.tagOwnerBid;
    }

    public ListLiveTagResourcesRequest setTagOwnerUid(String tagOwnerUid) {
        this.tagOwnerUid = tagOwnerUid;
        return this;
    }
    public String getTagOwnerUid() {
        return this.tagOwnerUid;
    }

    public static class ListLiveTagResourcesRequestTag extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>env</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <strong>example:</strong>
         * <p>dev</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListLiveTagResourcesRequestTag build(java.util.Map<String, ?> map) throws Exception {
            ListLiveTagResourcesRequestTag self = new ListLiveTagResourcesRequestTag();
            return TeaModel.build(map, self);
        }

        public ListLiveTagResourcesRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListLiveTagResourcesRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
