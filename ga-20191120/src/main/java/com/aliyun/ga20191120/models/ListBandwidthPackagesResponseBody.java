// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class ListBandwidthPackagesResponseBody extends TeaModel {
    /**
     * <p>The details of the bandwidth plans.</p>
     */
    @NameInMap("BandwidthPackages")
    public java.util.List<ListBandwidthPackagesResponseBodyBandwidthPackages> bandwidthPackages;

    /**
     * <p>The page number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>4B6DBBB0-2D01-4C6A-A384-4129266E6B78</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
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
         * 
         * <strong>example:</strong>
         * <p>tag-key</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the bandwidth plan.</p>
         * 
         * <strong>example:</strong>
         * <p>tag-value</p>
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
         * <p>The IDs of the GA instances that are associated with the bandwidth plans.</p>
         */
        @NameInMap("Accelerators")
        public java.util.List<String> accelerators;

        /**
         * <p>The bandwidth value of the bandwidth plan. Unit: Mbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Bandwidth")
        public Integer bandwidth;

        /**
         * <p>The ID of the bandwidth plan.</p>
         * 
         * <strong>example:</strong>
         * <p>gbwp-bp1sgzldyj6b4q7cx****</p>
         */
        @NameInMap("BandwidthPackageId")
        public String bandwidthPackageId;

        /**
         * <p>The type of the bandwidth. Valid values:</p>
         * <ul>
         * <li><strong>Basic</strong></li>
         * <li><strong>Enhanced</strong></li>
         * <li><strong>Advanced</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Basic</p>
         */
        @NameInMap("BandwidthType")
        public String bandwidthType;

        /**
         * <p>The metering method that is used when you use the pay-as-you-go billing method.</p>
         * <ul>
         * <li><strong>PayByTraffic</strong>: pay-by-data-transfer.</li>
         * <li><strong>PayBY95</strong>: pay-by-95th-percentile.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PayByTraffic</p>
         */
        @NameInMap("BillingType")
        public String billingType;

        /**
         * <p>Area A of the cross-region acceleration bandwidth plan. <strong>China-mainland</strong> is returned.</p>
         * <p>This parameter is returned only if you call the operation on the international site (alibabacloud.com).</p>
         * 
         * <strong>example:</strong>
         * <p>China-mainland</p>
         */
        @NameInMap("CbnGeographicRegionIdA")
        public String cbnGeographicRegionIdA;

        /**
         * <p>Area B of the cross-region acceleration bandwidth plan. <strong>Global</strong> is returned.</p>
         * <p>This parameter is returned only if you call the operation on the international site (alibabacloud.com).</p>
         * 
         * <strong>example:</strong>
         * <p>Global</p>
         */
        @NameInMap("CbnGeographicRegionIdB")
        public String cbnGeographicRegionIdB;

        /**
         * <p>The billing method of the bandwidth plan.</p>
         * <ul>
         * <li><strong>PREPAY</strong>: subscription. This is the default value.</li>
         * <li><strong>POSTPAY</strong>: pay-as-you-go.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PREPAY</p>
         */
        @NameInMap("ChargeType")
        public String chargeType;

        /**
         * <p>The time when the bandwidth plan was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1578966918000</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The description of the bandwidth plan.</p>
         * 
         * <strong>example:</strong>
         * <p>testDescription</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The expiration time of the bandwidth plan.</p>
         * 
         * <strong>example:</strong>
         * <p>1578966918000</p>
         */
        @NameInMap("ExpiredTime")
        public String expiredTime;

        /**
         * <p>The name of the bandwidth plan.</p>
         * 
         * <strong>example:</strong>
         * <p>testName</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The percentage of the guaranteed minimum bandwidth if the pay-by-95th-percentile metering method is used.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("Ratio")
        public Integer ratio;

        /**
         * <p>The ID of the region where the GA instance is deployed. <strong>cn-hangzhou</strong> is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aek2ry6mp2c****</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The status of the bandwidth plan. Valid values:</p>
         * <ul>
         * <li><strong>init:</strong> The bandwidth plan is being initialized.</li>
         * <li><strong>active:</strong> The bandwidth plan is available.</li>
         * <li><strong>binded:</strong> The bandwidth plan is associated with a GA instance.</li>
         * <li><strong>binding:</strong> The bandwidth plan is being associated with a GA instance.</li>
         * <li><strong>unbinding:</strong> The bandwidth plan is being disassociated from a GA instance.</li>
         * <li><strong>updating:</strong> The bandwidth plan is being updated.</li>
         * <li><strong>finacialLocked:</strong> The bandwidth plan is locked due to overdue payments.</li>
         * <li><strong>locked</strong>: The bandwidth plan is locked.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>active</p>
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
         * <ul>
         * <li><strong>Basic:</strong> a basic bandwidth plan.</li>
         * <li><strong>CrossDomain:</strong> a cross-region acceleration bandwidth plan.</li>
         * </ul>
         * <p>If you call the operation on the China site (aliyun.com), <strong>Basic</strong> is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>Basic</p>
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
