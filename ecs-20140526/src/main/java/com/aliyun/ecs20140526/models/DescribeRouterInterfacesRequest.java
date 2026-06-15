// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeRouterInterfacesRequest extends TeaModel {
    /**
     * <p>The filters.</p>
     */
    @NameInMap("Filter")
    public java.util.List<DescribeRouterInterfacesRequestFilter> filter;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The page number.</p>
     * <p>Page numbering starts from 1.</p>
     * <p>Default: 1.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return per page.</p>
     * <p>Valid values: 1 to 100.</p>
     * <p>Default: 10.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the region. You can call the <code>DescribeRegions</code> operation to get the latest list of regions.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static DescribeRouterInterfacesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRouterInterfacesRequest self = new DescribeRouterInterfacesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRouterInterfacesRequest setFilter(java.util.List<DescribeRouterInterfacesRequestFilter> filter) {
        this.filter = filter;
        return this;
    }
    public java.util.List<DescribeRouterInterfacesRequestFilter> getFilter() {
        return this.filter;
    }

    public DescribeRouterInterfacesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeRouterInterfacesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeRouterInterfacesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeRouterInterfacesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeRouterInterfacesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeRouterInterfacesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public static class DescribeRouterInterfacesRequestFilter extends TeaModel {
        /**
         * <p>The filter key. Supported values:</p>
         * <ul>
         * <li><p><code>RouterInterfaceId</code>: The ID of the router interface.</p>
         * </li>
         * <li><p><code>RouterId</code>: The ID of the router that the router interface is attached to.</p>
         * </li>
         * <li><p><code>RouterType</code>: The type of the router. Valid values: <code>VRouter</code> and <code>VBR</code>.</p>
         * </li>
         * <li><p><code>Status</code>: The status of the router interface.</p>
         * </li>
         * <li><p><code>Name</code>: The name of the router interface.</p>
         * </li>
         * <li><p><code>Role</code>: The role of the router interface. Valid values: <code>InitiatingSide</code> and <code>AcceptingSide</code>.</p>
         * </li>
         * </ul>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The values for the filter key. You can specify a maximum of 20 values.</p>
         */
        @NameInMap("Value")
        public java.util.List<String> value;

        public static DescribeRouterInterfacesRequestFilter build(java.util.Map<String, ?> map) throws Exception {
            DescribeRouterInterfacesRequestFilter self = new DescribeRouterInterfacesRequestFilter();
            return TeaModel.build(map, self);
        }

        public DescribeRouterInterfacesRequestFilter setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeRouterInterfacesRequestFilter setValue(java.util.List<String> value) {
            this.value = value;
            return this;
        }
        public java.util.List<String> getValue() {
            return this.value;
        }

    }

}
