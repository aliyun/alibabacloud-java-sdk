// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeVirtualBorderRoutersForPhysicalConnectionRequest extends TeaModel {
    @NameInMap("Filter")
    public java.util.List<DescribeVirtualBorderRoutersForPhysicalConnectionRequestFilter> filter;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("PhysicalConnectionId")
    public String physicalConnectionId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static DescribeVirtualBorderRoutersForPhysicalConnectionRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVirtualBorderRoutersForPhysicalConnectionRequest self = new DescribeVirtualBorderRoutersForPhysicalConnectionRequest();
        return TeaModel.build(map, self);
    }

    public DescribeVirtualBorderRoutersForPhysicalConnectionRequest setFilter(java.util.List<DescribeVirtualBorderRoutersForPhysicalConnectionRequestFilter> filter) {
        this.filter = filter;
        return this;
    }
    public java.util.List<DescribeVirtualBorderRoutersForPhysicalConnectionRequestFilter> getFilter() {
        return this.filter;
    }

    public DescribeVirtualBorderRoutersForPhysicalConnectionRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeVirtualBorderRoutersForPhysicalConnectionRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeVirtualBorderRoutersForPhysicalConnectionRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeVirtualBorderRoutersForPhysicalConnectionRequest setPhysicalConnectionId(String physicalConnectionId) {
        this.physicalConnectionId = physicalConnectionId;
        return this;
    }
    public String getPhysicalConnectionId() {
        return this.physicalConnectionId;
    }

    public DescribeVirtualBorderRoutersForPhysicalConnectionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeVirtualBorderRoutersForPhysicalConnectionRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeVirtualBorderRoutersForPhysicalConnectionRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public static class DescribeVirtualBorderRoutersForPhysicalConnectionRequestFilter extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public java.util.List<String> value;

        public static DescribeVirtualBorderRoutersForPhysicalConnectionRequestFilter build(java.util.Map<String, ?> map) throws Exception {
            DescribeVirtualBorderRoutersForPhysicalConnectionRequestFilter self = new DescribeVirtualBorderRoutersForPhysicalConnectionRequestFilter();
            return TeaModel.build(map, self);
        }

        public DescribeVirtualBorderRoutersForPhysicalConnectionRequestFilter setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeVirtualBorderRoutersForPhysicalConnectionRequestFilter setValue(java.util.List<String> value) {
            this.value = value;
            return this;
        }
        public java.util.List<String> getValue() {
            return this.value;
        }

    }

}
