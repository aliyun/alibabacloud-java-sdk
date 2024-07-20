// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class ListBandwidthackagesResponseBody extends TeaModel {
    /**
     * <p>The details of the bandwidth plans.</p>
     */
    @NameInMap("BandwidthPackages")
    public java.util.List<ListBandwidthackagesResponseBodyBandwidthPackages> bandwidthPackages;

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

    public static ListBandwidthackagesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListBandwidthackagesResponseBody self = new ListBandwidthackagesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListBandwidthackagesResponseBody setBandwidthPackages(java.util.List<ListBandwidthackagesResponseBodyBandwidthPackages> bandwidthPackages) {
        this.bandwidthPackages = bandwidthPackages;
        return this;
    }
    public java.util.List<ListBandwidthackagesResponseBodyBandwidthPackages> getBandwidthPackages() {
        return this.bandwidthPackages;
    }

    public ListBandwidthackagesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListBandwidthackagesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListBandwidthackagesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListBandwidthackagesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListBandwidthackagesResponseBodyBandwidthPackagesTags extends TeaModel {
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

        public static ListBandwidthackagesResponseBodyBandwidthPackagesTags build(java.util.Map<String, ?> map) throws Exception {
            ListBandwidthackagesResponseBodyBandwidthPackagesTags self = new ListBandwidthackagesResponseBodyBandwidthPackagesTags();
            return TeaModel.build(map, self);
        }

        public ListBandwidthackagesResponseBodyBandwidthPackagesTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListBandwidthackagesResponseBodyBandwidthPackagesTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListBandwidthackagesResponseBodyBandwidthPackages extends TeaModel {
        /**
         * <p>The IDs of the GA instances that are associated with the bandwidth plans.</p>
         */
        @NameInMap("Accelerators")
        public java.util.List<String> accelerators;

        /**
         * <p>The bandwidth of the bandwidth plan. Unit: Mbit/s.</p>
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
         * <p>The billing method of the bandwidth plan. Valid values:</p>
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
         * <p>The name of the GA instance.</p>
         * 
         * <strong>example:</strong>
         * <p>Accelerator</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>DE77A7F3-3B74-41C0-A5BC-CAFD188C28B6</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aekzzwgr7vz2liy</p>
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
         * <li><strong>locked:</strong> The bandwidth plan is locked.</li>
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
        public java.util.List<ListBandwidthackagesResponseBodyBandwidthPackagesTags> tags;

        public static ListBandwidthackagesResponseBodyBandwidthPackages build(java.util.Map<String, ?> map) throws Exception {
            ListBandwidthackagesResponseBodyBandwidthPackages self = new ListBandwidthackagesResponseBodyBandwidthPackages();
            return TeaModel.build(map, self);
        }

        public ListBandwidthackagesResponseBodyBandwidthPackages setAccelerators(java.util.List<String> accelerators) {
            this.accelerators = accelerators;
            return this;
        }
        public java.util.List<String> getAccelerators() {
            return this.accelerators;
        }

        public ListBandwidthackagesResponseBodyBandwidthPackages setBandwidth(Integer bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public Integer getBandwidth() {
            return this.bandwidth;
        }

        public ListBandwidthackagesResponseBodyBandwidthPackages setBandwidthPackageId(String bandwidthPackageId) {
            this.bandwidthPackageId = bandwidthPackageId;
            return this;
        }
        public String getBandwidthPackageId() {
            return this.bandwidthPackageId;
        }

        public ListBandwidthackagesResponseBodyBandwidthPackages setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public ListBandwidthackagesResponseBodyBandwidthPackages setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListBandwidthackagesResponseBodyBandwidthPackages setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListBandwidthackagesResponseBodyBandwidthPackages setExpiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public String getExpiredTime() {
            return this.expiredTime;
        }

        public ListBandwidthackagesResponseBodyBandwidthPackages setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListBandwidthackagesResponseBodyBandwidthPackages setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListBandwidthackagesResponseBodyBandwidthPackages setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public ListBandwidthackagesResponseBodyBandwidthPackages setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public ListBandwidthackagesResponseBodyBandwidthPackages setTags(java.util.List<ListBandwidthackagesResponseBodyBandwidthPackagesTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListBandwidthackagesResponseBodyBandwidthPackagesTags> getTags() {
            return this.tags;
        }

    }

}
