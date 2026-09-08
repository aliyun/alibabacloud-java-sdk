// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ListTransitRouterPeerAttachmentsRequest extends TeaModel {
    /**
     * <p>The CEN instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cen-j3jzhw1zpau2km****</p>
     */
    @NameInMap("CenId")
    public String cenId;

    /**
     * <p>The number of entries per page for a paged query. Default value: <strong>20</strong>. Maximum value: <strong>100</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that determines the start point of the query. Valid values:</p>
     * <ul>
     * <li>If this is the first query or no subsequent query is to be sent, you do not need to specify this parameter.</li>
     * <li>If a subsequent query is to be sent, set the value to the <strong>NextToken</strong> value returned in the previous API call.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the Enterprise Edition transit router instance.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The tag information.</p>
     * <p>You can specify up to 20 tags at a time.</p>
     */
    @NameInMap("Tag")
    public java.util.List<ListTransitRouterPeerAttachmentsRequestTag> tag;

    /**
     * <p>The inter-region connection ID.</p>
     * 
     * <strong>example:</strong>
     * <p>tr-attach-5u4qbayfv2io5v****</p>
     */
    @NameInMap("TransitRouterAttachmentId")
    public String transitRouterAttachmentId;

    /**
     * <p>The Enterprise Edition transit router instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>tr-bp1su1ytdxtataupl****</p>
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
         * <p>The tag key of the resource.</p>
         * <p>Once specified, the tag key cannot be an empty string. The tag key can be up to 64 characters in length and cannot start with <code>aliyun</code> or <code>acs:</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
         * <p>You can specify up to 20 tag keys at a time.</p>
         * 
         * <strong>example:</strong>
         * <p>tagtest</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the resource.</p>
         * <p>The tag value can be an empty string or up to 128 characters in length. It cannot start with <code>aliyun</code> or <code>acs:</code>, and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * <p>Each tag key corresponds to one tag value. You can specify up to 20 tag values at a time.</p>
         * 
         * <strong>example:</strong>
         * <p>tagtest</p>
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
