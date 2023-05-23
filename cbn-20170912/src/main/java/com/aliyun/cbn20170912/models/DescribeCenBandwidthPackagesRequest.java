// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DescribeCenBandwidthPackagesRequest extends TeaModel {
    /**
     * <p>The description of the bandwidth plan.</p>
     */
    @NameInMap("Filter")
    public java.util.List<DescribeCenBandwidthPackagesRequestFilter> filter;

    /**
     * <p>Specifies whether to include renewal data. Valid values:</p>
     * <br>
     * <p>*   **true**: yes</p>
     * <p>*   **false**: no</p>
     */
    @NameInMap("IncludeReservationData")
    public Boolean includeReservationData;

    /**
     * <p>The ID of the other connected area of the bandwidth plan. Valid values:</p>
     * <br>
     * <p>*   **china**: Chinese mainland.</p>
     * <p>*   **asia-pacific**: Asia Pacific</p>
     * <p>*   **europe**: Europe</p>
     * <p>*   **australia**: Australia</p>
     * <p>*   **north-america**: North America</p>
     */
    @NameInMap("IsOrKey")
    public Boolean isOrKey;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>Specify a filter value based on the **Key** parameter.</p>
     * <br>
     * <p>You can specify multiple values for a **filter key**. The logical relation among multiple filter values is **OR**. If a bandwidth package matches one of the values that you specify, the bandwidth package matches the filter condition.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The ID of the peer region.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("Tag")
    public java.util.List<DescribeCenBandwidthPackagesRequestTag> tag;

    public static DescribeCenBandwidthPackagesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCenBandwidthPackagesRequest self = new DescribeCenBandwidthPackagesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCenBandwidthPackagesRequest setFilter(java.util.List<DescribeCenBandwidthPackagesRequestFilter> filter) {
        this.filter = filter;
        return this;
    }
    public java.util.List<DescribeCenBandwidthPackagesRequestFilter> getFilter() {
        return this.filter;
    }

    public DescribeCenBandwidthPackagesRequest setIncludeReservationData(Boolean includeReservationData) {
        this.includeReservationData = includeReservationData;
        return this;
    }
    public Boolean getIncludeReservationData() {
        return this.includeReservationData;
    }

    public DescribeCenBandwidthPackagesRequest setIsOrKey(Boolean isOrKey) {
        this.isOrKey = isOrKey;
        return this;
    }
    public Boolean getIsOrKey() {
        return this.isOrKey;
    }

    public DescribeCenBandwidthPackagesRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeCenBandwidthPackagesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeCenBandwidthPackagesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeCenBandwidthPackagesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeCenBandwidthPackagesRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeCenBandwidthPackagesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeCenBandwidthPackagesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeCenBandwidthPackagesRequest setTag(java.util.List<DescribeCenBandwidthPackagesRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeCenBandwidthPackagesRequestTag> getTag() {
        return this.tag;
    }

    public static class DescribeCenBandwidthPackagesRequestFilter extends TeaModel {
        /**
         * <p>The operation that you want to perform. Set the value to **DescribeCenBandwidthPackages**.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The status of the bandwidth plan. Valid values:</p>
         * <br>
         * <p>*   **Normal**: normal</p>
         * <p>*   **FinancialLocked**: locked due to overdue payments</p>
         * <p>*   **SecurityLocked**: locked due to security reasons</p>
         */
        @NameInMap("Value")
        public java.util.List<String> value;

        public static DescribeCenBandwidthPackagesRequestFilter build(java.util.Map<String, ?> map) throws Exception {
            DescribeCenBandwidthPackagesRequestFilter self = new DescribeCenBandwidthPackagesRequestFilter();
            return TeaModel.build(map, self);
        }

        public DescribeCenBandwidthPackagesRequestFilter setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeCenBandwidthPackagesRequestFilter setValue(java.util.List<String> value) {
            this.value = value;
            return this;
        }
        public java.util.List<String> getValue() {
            return this.value;
        }

    }

    public static class DescribeCenBandwidthPackagesRequestTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static DescribeCenBandwidthPackagesRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeCenBandwidthPackagesRequestTag self = new DescribeCenBandwidthPackagesRequestTag();
            return TeaModel.build(map, self);
        }

        public DescribeCenBandwidthPackagesRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeCenBandwidthPackagesRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
