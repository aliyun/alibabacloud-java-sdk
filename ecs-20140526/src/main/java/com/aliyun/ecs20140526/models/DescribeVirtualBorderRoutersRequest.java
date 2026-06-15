// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeVirtualBorderRoutersRequest extends TeaModel {
    /**
     * <p>The filter conditions.</p>
     */
    @NameInMap("Filter")
    public java.util.List<DescribeVirtualBorderRoutersRequestFilter> filter;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The page number. Pages are numbered starting from 1. Default value: 1.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Valid values: 1 to 50. Default value: 10.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the region where the Virtual Border Router (VBR) is located. You can call the <code>DescribeRegions</code> operation to obtain the most recent list of regions.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static DescribeVirtualBorderRoutersRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVirtualBorderRoutersRequest self = new DescribeVirtualBorderRoutersRequest();
        return TeaModel.build(map, self);
    }

    public DescribeVirtualBorderRoutersRequest setFilter(java.util.List<DescribeVirtualBorderRoutersRequestFilter> filter) {
        this.filter = filter;
        return this;
    }
    public java.util.List<DescribeVirtualBorderRoutersRequestFilter> getFilter() {
        return this.filter;
    }

    public DescribeVirtualBorderRoutersRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeVirtualBorderRoutersRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeVirtualBorderRoutersRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeVirtualBorderRoutersRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeVirtualBorderRoutersRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeVirtualBorderRoutersRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public static class DescribeVirtualBorderRoutersRequestFilter extends TeaModel {
        /**
         * <p>The filter key. Set the value to <code>VbrId</code>.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The filter value. The value must be an array of VBR IDs.</p>
         */
        @NameInMap("Value")
        public java.util.List<String> value;

        public static DescribeVirtualBorderRoutersRequestFilter build(java.util.Map<String, ?> map) throws Exception {
            DescribeVirtualBorderRoutersRequestFilter self = new DescribeVirtualBorderRoutersRequestFilter();
            return TeaModel.build(map, self);
        }

        public DescribeVirtualBorderRoutersRequestFilter setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeVirtualBorderRoutersRequestFilter setValue(java.util.List<String> value) {
            this.value = value;
            return this;
        }
        public java.util.List<String> getValue() {
            return this.value;
        }

    }

}
