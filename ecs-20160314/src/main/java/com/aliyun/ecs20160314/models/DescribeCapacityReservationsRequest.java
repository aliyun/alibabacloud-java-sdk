// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class DescribeCapacityReservationsRequest extends TeaModel {
    @NameInMap("CapacityReservationIds")
    public String capacityReservationIds;

    @NameInMap("CapacityReservationName")
    public String capacityReservationName;

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
    public java.util.List<Tag> tag;

    @NameInMap("ZoneId")
    public String zoneId;

    public static DescribeCapacityReservationsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCapacityReservationsRequest self = new DescribeCapacityReservationsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCapacityReservationsRequest setCapacityReservationIds(String capacityReservationIds) {
        this.capacityReservationIds = capacityReservationIds;
        return this;
    }
    public String getCapacityReservationIds() {
        return this.capacityReservationIds;
    }

    public DescribeCapacityReservationsRequest setCapacityReservationName(String capacityReservationName) {
        this.capacityReservationName = capacityReservationName;
        return this;
    }
    public String getCapacityReservationName() {
        return this.capacityReservationName;
    }

    public DescribeCapacityReservationsRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeCapacityReservationsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeCapacityReservationsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeCapacityReservationsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeCapacityReservationsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeCapacityReservationsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeCapacityReservationsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeCapacityReservationsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeCapacityReservationsRequest setTag(java.util.List<Tag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<Tag> getTag() {
        return this.tag;
    }

    public DescribeCapacityReservationsRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public static class Tag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static Tag build(java.util.Map<String, ?> map) throws Exception {
            Tag self = new Tag();
            return TeaModel.build(map, self);
        }

        public Tag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public Tag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
