// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ListTransitRouterMulticastDomainsRequest extends TeaModel {
    @NameInMap("CenId")
    public String cenId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("MaxResults")
    public Long maxResults;

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
    public java.util.List<ListTransitRouterMulticastDomainsRequestTag> tag;

    @NameInMap("TransitRouterId")
    public String transitRouterId;

    @NameInMap("TransitRouterMulticastDomainId")
    public String transitRouterMulticastDomainId;

    public static ListTransitRouterMulticastDomainsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTransitRouterMulticastDomainsRequest self = new ListTransitRouterMulticastDomainsRequest();
        return TeaModel.build(map, self);
    }

    public ListTransitRouterMulticastDomainsRequest setCenId(String cenId) {
        this.cenId = cenId;
        return this;
    }
    public String getCenId() {
        return this.cenId;
    }

    public ListTransitRouterMulticastDomainsRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ListTransitRouterMulticastDomainsRequest setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public ListTransitRouterMulticastDomainsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListTransitRouterMulticastDomainsRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ListTransitRouterMulticastDomainsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ListTransitRouterMulticastDomainsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListTransitRouterMulticastDomainsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ListTransitRouterMulticastDomainsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ListTransitRouterMulticastDomainsRequest setTag(java.util.List<ListTransitRouterMulticastDomainsRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<ListTransitRouterMulticastDomainsRequestTag> getTag() {
        return this.tag;
    }

    public ListTransitRouterMulticastDomainsRequest setTransitRouterId(String transitRouterId) {
        this.transitRouterId = transitRouterId;
        return this;
    }
    public String getTransitRouterId() {
        return this.transitRouterId;
    }

    public ListTransitRouterMulticastDomainsRequest setTransitRouterMulticastDomainId(String transitRouterMulticastDomainId) {
        this.transitRouterMulticastDomainId = transitRouterMulticastDomainId;
        return this;
    }
    public String getTransitRouterMulticastDomainId() {
        return this.transitRouterMulticastDomainId;
    }

    public static class ListTransitRouterMulticastDomainsRequestTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static ListTransitRouterMulticastDomainsRequestTag build(java.util.Map<String, ?> map) throws Exception {
            ListTransitRouterMulticastDomainsRequestTag self = new ListTransitRouterMulticastDomainsRequestTag();
            return TeaModel.build(map, self);
        }

        public ListTransitRouterMulticastDomainsRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListTransitRouterMulticastDomainsRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
