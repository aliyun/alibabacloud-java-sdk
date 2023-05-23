// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ListTransitRoutersRequest extends TeaModel {
    @NameInMap("CenId")
    public String cenId;

    @NameInMap("FeatureFilter")
    public java.util.List<ListTransitRoutersRequestFeatureFilter> featureFilter;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("Status")
    public String status;

    @NameInMap("Tag")
    public java.util.List<ListTransitRoutersRequestTag> tag;

    @NameInMap("TransitRouterId")
    public String transitRouterId;

    @NameInMap("TransitRouterName")
    public String transitRouterName;

    @NameInMap("Type")
    public String type;

    public static ListTransitRoutersRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTransitRoutersRequest self = new ListTransitRoutersRequest();
        return TeaModel.build(map, self);
    }

    public ListTransitRoutersRequest setCenId(String cenId) {
        this.cenId = cenId;
        return this;
    }
    public String getCenId() {
        return this.cenId;
    }

    public ListTransitRoutersRequest setFeatureFilter(java.util.List<ListTransitRoutersRequestFeatureFilter> featureFilter) {
        this.featureFilter = featureFilter;
        return this;
    }
    public java.util.List<ListTransitRoutersRequestFeatureFilter> getFeatureFilter() {
        return this.featureFilter;
    }

    public ListTransitRoutersRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ListTransitRoutersRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ListTransitRoutersRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListTransitRoutersRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListTransitRoutersRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListTransitRoutersRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ListTransitRoutersRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ListTransitRoutersRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListTransitRoutersRequest setTag(java.util.List<ListTransitRoutersRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<ListTransitRoutersRequestTag> getTag() {
        return this.tag;
    }

    public ListTransitRoutersRequest setTransitRouterId(String transitRouterId) {
        this.transitRouterId = transitRouterId;
        return this;
    }
    public String getTransitRouterId() {
        return this.transitRouterId;
    }

    public ListTransitRoutersRequest setTransitRouterName(String transitRouterName) {
        this.transitRouterName = transitRouterName;
        return this;
    }
    public String getTransitRouterName() {
        return this.transitRouterName;
    }

    public ListTransitRoutersRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public static class ListTransitRoutersRequestFeatureFilter extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public java.util.List<String> value;

        public static ListTransitRoutersRequestFeatureFilter build(java.util.Map<String, ?> map) throws Exception {
            ListTransitRoutersRequestFeatureFilter self = new ListTransitRoutersRequestFeatureFilter();
            return TeaModel.build(map, self);
        }

        public ListTransitRoutersRequestFeatureFilter setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListTransitRoutersRequestFeatureFilter setValue(java.util.List<String> value) {
            this.value = value;
            return this;
        }
        public java.util.List<String> getValue() {
            return this.value;
        }

    }

    public static class ListTransitRoutersRequestTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static ListTransitRoutersRequestTag build(java.util.Map<String, ?> map) throws Exception {
            ListTransitRoutersRequestTag self = new ListTransitRoutersRequestTag();
            return TeaModel.build(map, self);
        }

        public ListTransitRoutersRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListTransitRoutersRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
