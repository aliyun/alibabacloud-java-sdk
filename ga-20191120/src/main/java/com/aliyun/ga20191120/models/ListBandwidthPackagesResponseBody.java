// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class ListBandwidthPackagesResponseBody extends TeaModel {
    /**
     * <p>Details about the bandwidth plans.</p>
     */
    @NameInMap("BandwidthPackages")
    public java.util.List<ListBandwidthPackagesResponseBodyBandwidthPackages> bandwidthPackages;

    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListBandwidthPackagesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListBandwidthPackagesResponseBody self = new ListBandwidthPackagesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListBandwidthPackagesResponseBody setBandwidthPackages(java.util.List<ListBandwidthPackagesResponseBodyBandwidthPackages> bandwidthPackages) {
        this.bandwidthPackages = bandwidthPackages;
        return this;
    }
    public java.util.List<ListBandwidthPackagesResponseBodyBandwidthPackages> getBandwidthPackages() {
        return this.bandwidthPackages;
    }

    public ListBandwidthPackagesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListBandwidthPackagesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListBandwidthPackagesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListBandwidthPackagesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListBandwidthPackagesResponseBodyBandwidthPackagesTags extends TeaModel {
        /**
         * <p>The tag key of the bandwidth plan.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the bandwidth plan.</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListBandwidthPackagesResponseBodyBandwidthPackagesTags build(java.util.Map<String, ?> map) throws Exception {
            ListBandwidthPackagesResponseBodyBandwidthPackagesTags self = new ListBandwidthPackagesResponseBodyBandwidthPackagesTags();
            return TeaModel.build(map, self);
        }

        public ListBandwidthPackagesResponseBodyBandwidthPackagesTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListBandwidthPackagesResponseBodyBandwidthPackagesTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListBandwidthPackagesResponseBodyBandwidthPackages extends TeaModel {
        /**
         * <p>The ID of the GA instance that is associated with the bandwidth plan.</p>
         */
        @NameInMap("Accelerators")
        public java.util.List<String> accelerators;

        /**
         * <p>The bandwidth value of the bandwidth plan. Unit: Mbit/s.</p>
         */
        @NameInMap("Bandwidth")
        public Integer bandwidth;

        /**
         * <p>The ID of the bandwidth plan.</p>
         */
        @NameInMap("BandwidthPackageId")
        public String bandwidthPackageId;

        /**
         * <p>The type of the bandwidth. Valid values:</p>
         * <br>
         * <p>*   **Basic**: standard</p>
         * <p>*   **Enhanced**: enhanced</p>
         * <p>*   **Advanced**: premium</p>
         */
        @NameInMap("BandwidthType")
        public String bandwidthType;

        /**
         * <p>The metering method that is used when you use the pay-as-you-go billing method.</p>
         * <br>
         * <p>*   **PayByTraffic**: pay-by-data-transfer</p>
         * <p>*   **PayBY95**: pay-by-95th-percentile</p>
         */
        @NameInMap("BillingType")
        public String billingType;

        /**
         * <p>Area A of the cross-border acceleration bandwidth plan. Only **China-mainland** (the Chinese mainland) is returned.</p>
         * <br>
         * <p>This parameter is returned only if you call this operation on the international site (alibabacloud.com).</p>
         */
        @NameInMap("CbnGeographicRegionIdA")
        public String cbnGeographicRegionIdA;

        /**
         * <p>Area B of the cross-border acceleration bandwidth plan. Only **Global** (global) is returned.</p>
         * <br>
         * <p>This parameter is returned only if you call this operation on the international site (alibabacloud.com).</p>
         */
        @NameInMap("CbnGeographicRegionIdB")
        public String cbnGeographicRegionIdB;

        /**
         * <p>The billing method of the bandwidth plan. Only **PREPAY** is returned, which indicates the subscription billing method.</p>
         */
        @NameInMap("ChargeType")
        public String chargeType;

        /**
         * <p>The time when the bandwidth plan was created.</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The description of the bandwidth plan.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The timestamp when the bandwidth plan expires.</p>
         */
        @NameInMap("ExpiredTime")
        public String expiredTime;

        /**
         * <p>The name of the bandwidth plan.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The percentage of the minimum bandwidth guaranteed if the pay-by-95th-percentile metering method is used.</p>
         */
        @NameInMap("Ratio")
        public Integer ratio;

        /**
         * <p>The ID of the region where the GA instance is deployed. **cn-hangzhou** is returned.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The ID of the resource group.</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The status of the bandwidth plan. Valid values:</p>
         * <br>
         * <p>*   **init**: The bandwidth plan is being initialized.</p>
         * <p>*   **active**: The bandwidth plan is available.</p>
         * <p>*   **binded**: The bandwidth plan is associated.</p>
         * <p>*   **binding**: The bandwidth plan is being associated.</p>
         * <p>*   **unbinding**: The bandwidth plan is being disassociated.</p>
         * <p>*   **updating**: The bandwidth plan is being updated.</p>
         * <p>*   **finacialLocked**: The bandwidth plan is locked due to overdue payments.</p>
         * <p>*   **locked**: The bandwidth plan is locked.</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <p>The tag of the bandwidth plan.</p>
         */
        @NameInMap("Tags")
        public java.util.List<ListBandwidthPackagesResponseBodyBandwidthPackagesTags> tags;

        /**
         * <p>The type of the bandwidth plan. Valid values:</p>
         * <br>
         * <p>*   **Basic**: a basic bandwidth plan</p>
         * <p>*   **CrossDomain**: a cross-border acceleration bandwidth plan</p>
         * <br>
         * <p>If you call this operation on the China site (aliyun.com), only **Basic** is returned.</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListBandwidthPackagesResponseBodyBandwidthPackages build(java.util.Map<String, ?> map) throws Exception {
            ListBandwidthPackagesResponseBodyBandwidthPackages self = new ListBandwidthPackagesResponseBodyBandwidthPackages();
            return TeaModel.build(map, self);
        }

        public ListBandwidthPackagesResponseBodyBandwidthPackages setAccelerators(java.util.List<String> accelerators) {
            this.accelerators = accelerators;
            return this;
        }
        public java.util.List<String> getAccelerators() {
            return this.accelerators;
        }

        public ListBandwidthPackagesResponseBodyBandwidthPackages setBandwidth(Integer bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public Integer getBandwidth() {
            return this.bandwidth;
        }

        public ListBandwidthPackagesResponseBodyBandwidthPackages setBandwidthPackageId(String bandwidthPackageId) {
            this.bandwidthPackageId = bandwidthPackageId;
            return this;
        }
        public String getBandwidthPackageId() {
            return this.bandwidthPackageId;
        }

        public ListBandwidthPackagesResponseBodyBandwidthPackages setBandwidthType(String bandwidthType) {
            this.bandwidthType = bandwidthType;
            return this;
        }
        public String getBandwidthType() {
            return this.bandwidthType;
        }

        public ListBandwidthPackagesResponseBodyBandwidthPackages setBillingType(String billingType) {
            this.billingType = billingType;
            return this;
        }
        public String getBillingType() {
            return this.billingType;
        }

        public ListBandwidthPackagesResponseBodyBandwidthPackages setCbnGeographicRegionIdA(String cbnGeographicRegionIdA) {
            this.cbnGeographicRegionIdA = cbnGeographicRegionIdA;
            return this;
        }
        public String getCbnGeographicRegionIdA() {
            return this.cbnGeographicRegionIdA;
        }

        public ListBandwidthPackagesResponseBodyBandwidthPackages setCbnGeographicRegionIdB(String cbnGeographicRegionIdB) {
            this.cbnGeographicRegionIdB = cbnGeographicRegionIdB;
            return this;
        }
        public String getCbnGeographicRegionIdB() {
            return this.cbnGeographicRegionIdB;
        }

        public ListBandwidthPackagesResponseBodyBandwidthPackages setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public ListBandwidthPackagesResponseBodyBandwidthPackages setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListBandwidthPackagesResponseBodyBandwidthPackages setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListBandwidthPackagesResponseBodyBandwidthPackages setExpiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public String getExpiredTime() {
            return this.expiredTime;
        }

        public ListBandwidthPackagesResponseBodyBandwidthPackages setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListBandwidthPackagesResponseBodyBandwidthPackages setRatio(Integer ratio) {
            this.ratio = ratio;
            return this;
        }
        public Integer getRatio() {
            return this.ratio;
        }

        public ListBandwidthPackagesResponseBodyBandwidthPackages setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListBandwidthPackagesResponseBodyBandwidthPackages setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public ListBandwidthPackagesResponseBodyBandwidthPackages setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public ListBandwidthPackagesResponseBodyBandwidthPackages setTags(java.util.List<ListBandwidthPackagesResponseBodyBandwidthPackagesTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListBandwidthPackagesResponseBodyBandwidthPackagesTags> getTags() {
            return this.tags;
        }

        public ListBandwidthPackagesResponseBodyBandwidthPackages setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
