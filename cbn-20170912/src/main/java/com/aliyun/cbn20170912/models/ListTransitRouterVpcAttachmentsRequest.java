// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ListTransitRouterVpcAttachmentsRequest extends TeaModel {
    @NameInMap("CenId")
    public String cenId;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("Tag")
    public java.util.List<ListTransitRouterVpcAttachmentsRequestTag> tag;

    @NameInMap("TransitRouterAttachmentId")
    public String transitRouterAttachmentId;

    @NameInMap("TransitRouterId")
    public String transitRouterId;

    @NameInMap("VpcId")
    public String vpcId;

    public static ListTransitRouterVpcAttachmentsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTransitRouterVpcAttachmentsRequest self = new ListTransitRouterVpcAttachmentsRequest();
        return TeaModel.build(map, self);
    }

    public ListTransitRouterVpcAttachmentsRequest setCenId(String cenId) {
        this.cenId = cenId;
        return this;
    }
    public String getCenId() {
        return this.cenId;
    }

    public ListTransitRouterVpcAttachmentsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListTransitRouterVpcAttachmentsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListTransitRouterVpcAttachmentsRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ListTransitRouterVpcAttachmentsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ListTransitRouterVpcAttachmentsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListTransitRouterVpcAttachmentsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ListTransitRouterVpcAttachmentsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ListTransitRouterVpcAttachmentsRequest setTag(java.util.List<ListTransitRouterVpcAttachmentsRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<ListTransitRouterVpcAttachmentsRequestTag> getTag() {
        return this.tag;
    }

    public ListTransitRouterVpcAttachmentsRequest setTransitRouterAttachmentId(String transitRouterAttachmentId) {
        this.transitRouterAttachmentId = transitRouterAttachmentId;
        return this;
    }
    public String getTransitRouterAttachmentId() {
        return this.transitRouterAttachmentId;
    }

    public ListTransitRouterVpcAttachmentsRequest setTransitRouterId(String transitRouterId) {
        this.transitRouterId = transitRouterId;
        return this;
    }
    public String getTransitRouterId() {
        return this.transitRouterId;
    }

    public ListTransitRouterVpcAttachmentsRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public static class ListTransitRouterVpcAttachmentsRequestTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static ListTransitRouterVpcAttachmentsRequestTag build(java.util.Map<String, ?> map) throws Exception {
            ListTransitRouterVpcAttachmentsRequestTag self = new ListTransitRouterVpcAttachmentsRequestTag();
            return TeaModel.build(map, self);
        }

        public ListTransitRouterVpcAttachmentsRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListTransitRouterVpcAttachmentsRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
