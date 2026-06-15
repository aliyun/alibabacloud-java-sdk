// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeHaVipsRequest extends TeaModel {
    /**
     * <p>The query filters. You can specify 1 to 20 filters.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Filter")
    public java.util.List<DescribeHaVipsRequestFilter> filter;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The page number. Default value: 1.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Maximum value: 50. Default value: 10.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the region.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static DescribeHaVipsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeHaVipsRequest self = new DescribeHaVipsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeHaVipsRequest setFilter(java.util.List<DescribeHaVipsRequestFilter> filter) {
        this.filter = filter;
        return this;
    }
    public java.util.List<DescribeHaVipsRequestFilter> getFilter() {
        return this.filter;
    }

    public DescribeHaVipsRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeHaVipsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeHaVipsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeHaVipsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeHaVipsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeHaVipsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeHaVipsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public static class DescribeHaVipsRequestFilter extends TeaModel {
        /**
         * <p>The filter key. Valid values:</p>
         * <p><code>HaVipId</code>: The ID of the high-availability virtual IP (HAVIP).</p>
         * <p><code>HaVipName</code>: The name of the HAVIP.</p>
         * <p><code>VpcId</code>: The ID of the VPC to which the HAVIP belongs.</p>
         * <p><code>VSwitchId</code>: The ID of the vSwitch to which the HAVIP belongs.</p>
         * <p><code>IpAddress</code>: The IP address of the HAVIP.</p>
         * <p><code>AssociatedInstanceType</code>: The type of instance associated with the HAVIP. The value must be <code>EcsInstance</code>.</p>
         * <p><code>AssociatedInstanceId</code>: The ID of the instance associated with the HAVIP.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>A list of 1 to 20 values.</p>
         */
        @NameInMap("Value")
        public java.util.List<String> value;

        public static DescribeHaVipsRequestFilter build(java.util.Map<String, ?> map) throws Exception {
            DescribeHaVipsRequestFilter self = new DescribeHaVipsRequestFilter();
            return TeaModel.build(map, self);
        }

        public DescribeHaVipsRequestFilter setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeHaVipsRequestFilter setValue(java.util.List<String> value) {
            this.value = value;
            return this;
        }
        public java.util.List<String> getValue() {
            return this.value;
        }

    }

}
