// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ListTransitRouterPeerAttachmentsRequest extends TeaModel {
    /**
     * <p>The ID of the CEN instance.</p>
     */
    @NameInMap("CenId")
    public String cenId;

    /**
     * <p>The number of entries to return per page. The default value is **20**. The maximum value is **100**.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that is used for the next query. Valid values:</p>
     * <br>
     * <p>*   If this is your first query or no next query is to be sent, ignore this parameter.</p>
     * <p>*   If a next query is to be sent, set the value to the value of **NextToken** that is returned from the last call.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the region where the Enterprise Edition transit router is deployed.</p>
     * <br>
     * <p>You can call the [DescribeRegions](~~36063~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<ListTransitRouterPeerAttachmentsRequestTag> tag;

    /**
     * <p>The ID of the cross-region connection.</p>
     */
    @NameInMap("TransitRouterAttachmentId")
    public String transitRouterAttachmentId;

    /**
     * <p>The ID of the Enterprise Edition transit router.</p>
     */
    @NameInMap("TransitRouterId")
    public String transitRouterId;

    public static ListTransitRouterPeerAttachmentsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTransitRouterPeerAttachmentsRequest self = new ListTransitRouterPeerAttachmentsRequest();
        return TeaModel.build(map, self);
    }

    public ListTransitRouterPeerAttachmentsRequest setCenId(String cenId) {
        this.cenId = cenId;
        return this;
    }
    public String getCenId() {
        return this.cenId;
    }

    public ListTransitRouterPeerAttachmentsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListTransitRouterPeerAttachmentsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListTransitRouterPeerAttachmentsRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ListTransitRouterPeerAttachmentsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ListTransitRouterPeerAttachmentsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListTransitRouterPeerAttachmentsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ListTransitRouterPeerAttachmentsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ListTransitRouterPeerAttachmentsRequest setTag(java.util.List<ListTransitRouterPeerAttachmentsRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<ListTransitRouterPeerAttachmentsRequestTag> getTag() {
        return this.tag;
    }

    public ListTransitRouterPeerAttachmentsRequest setTransitRouterAttachmentId(String transitRouterAttachmentId) {
        this.transitRouterAttachmentId = transitRouterAttachmentId;
        return this;
    }
    public String getTransitRouterAttachmentId() {
        return this.transitRouterAttachmentId;
    }

    public ListTransitRouterPeerAttachmentsRequest setTransitRouterId(String transitRouterId) {
        this.transitRouterId = transitRouterId;
        return this;
    }
    public String getTransitRouterId() {
        return this.transitRouterId;
    }

    public static class ListTransitRouterPeerAttachmentsRequestTag extends TeaModel {
        /**
         * <p>The tag keys of the resources. </p>
         * <br>
         * <p>The tag keys cannot be an empty string. The tag keys can be up to 64 characters in length and cannot start with `acs:` or `aliyun`. It cannot contain `http://` or `https://`.  </p>
         * <br>
         * <p>You can specify at most 20 tag keys.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag values of the resources. </p>
         * <br>
         * <p>The tag values can be 0 to 128 characters in length, and cannot start with `aliyun` or `acs:`. It cannot contain `http://` or `https://`.  </p>
         * <br>
         * <p>Each tag key has a unique tag value. You can specify at most 20 tag values in each call.</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListTransitRouterPeerAttachmentsRequestTag build(java.util.Map<String, ?> map) throws Exception {
            ListTransitRouterPeerAttachmentsRequestTag self = new ListTransitRouterPeerAttachmentsRequestTag();
            return TeaModel.build(map, self);
        }

        public ListTransitRouterPeerAttachmentsRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListTransitRouterPeerAttachmentsRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
