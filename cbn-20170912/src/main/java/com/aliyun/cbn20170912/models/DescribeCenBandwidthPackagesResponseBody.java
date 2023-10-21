// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DescribeCenBandwidthPackagesResponseBody extends TeaModel {
    /**
     * <p>The details about the bandwidth plan.</p>
     */
    @NameInMap("CenBandwidthPackages")
    public DescribeCenBandwidthPackagesResponseBodyCenBandwidthPackages cenBandwidthPackages;

    /**
     * <p>The number of the returned page.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeCenBandwidthPackagesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCenBandwidthPackagesResponseBody self = new DescribeCenBandwidthPackagesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCenBandwidthPackagesResponseBody setCenBandwidthPackages(DescribeCenBandwidthPackagesResponseBodyCenBandwidthPackages cenBandwidthPackages) {
        this.cenBandwidthPackages = cenBandwidthPackages;
        return this;
    }
    public DescribeCenBandwidthPackagesResponseBodyCenBandwidthPackages getCenBandwidthPackages() {
        return this.cenBandwidthPackages;
    }

    public DescribeCenBandwidthPackagesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeCenBandwidthPackagesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeCenBandwidthPackagesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCenBandwidthPackagesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeCenBandwidthPackagesResponseBodyCenBandwidthPackagesCenBandwidthPackageCenIds extends TeaModel {
        @NameInMap("CenId")
        public java.util.List<String> cenId;

        public static DescribeCenBandwidthPackagesResponseBodyCenBandwidthPackagesCenBandwidthPackageCenIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeCenBandwidthPackagesResponseBodyCenBandwidthPackagesCenBandwidthPackageCenIds self = new DescribeCenBandwidthPackagesResponseBodyCenBandwidthPackagesCenBandwidthPackageCenIds();
            return TeaModel.build(map, self);
        }

        public DescribeCenBandwidthPackagesResponseBodyCenBandwidthPackagesCenBandwidthPackageCenIds setCenId(java.util.List<String> cenId) {
            this.cenId = cenId;
            return this;
        }
        public java.util.List<String> getCenId() {
            return this.cenId;
        }

    }

    public static class DescribeCenBandwidthPackagesResponseBodyCenBandwidthPackagesCenBandwidthPackageOrginInterRegionBandwidthLimitsOrginInterRegionBandwidthLimit extends TeaModel {
        /**
         * <p>The maximum bandwidth value for the inter-region connection.</p>
         */
        @NameInMap("BandwidthLimit")
        public String bandwidthLimit;

        /**
         * <p>The connected regions.</p>
         */
        @NameInMap("GeographicSpanId")
        public String geographicSpanId;

        /**
         * <p>The ID of the local region.</p>
         */
        @NameInMap("LocalRegionId")
        public String localRegionId;

        /**
         * <p>The ID of the peer region.</p>
         */
        @NameInMap("OppositeRegionId")
        public String oppositeRegionId;

        public static DescribeCenBandwidthPackagesResponseBodyCenBandwidthPackagesCenBandwidthPackageOrginInterRegionBandwidthLimitsOrginInterRegionBandwidthLimit build(java.util.Map<String, ?> map) throws Exception {
            DescribeCenBandwidthPackagesResponseBodyCenBandwidthPackagesCenBandwidthPackageOrginInterRegionBandwidthLimitsOrginInterRegionBandwidthLimit self = new DescribeCenBandwidthPackagesResponseBodyCenBandwidthPackagesCenBandwidthPackageOrginInterRegionBandwidthLimitsOrginInterRegionBandwidthLimit();
            return TeaModel.build(map, self);
        }

        public DescribeCenBandwidthPackagesResponseBodyCenBandwidthPackagesCenBandwidthPackageOrginInterRegionBandwidthLimitsOrginInterRegionBandwidthLimit setBandwidthLimit(String bandwidthLimit) {
            this.bandwidthLimit = bandwidthLimit;
            return this;
        }
        public String getBandwidthLimit() {
            return this.bandwidthLimit;
        }

        public DescribeCenBandwidthPackagesResponseBodyCenBandwidthPackagesCenBandwidthPackageOrginInterRegionBandwidthLimitsOrginInterRegionBandwidthLimit setGeographicSpanId(String geographicSpanId) {
            this.geographicSpanId = geographicSpanId;
            return this;
        }
        public String getGeographicSpanId() {
            return this.geographicSpanId;
        }

        public DescribeCenBandwidthPackagesResponseBodyCenBandwidthPackagesCenBandwidthPackageOrginInterRegionBandwidthLimitsOrginInterRegionBandwidthLimit setLocalRegionId(String localRegionId) {
            this.localRegionId = localRegionId;
            return this;
        }
        public String getLocalRegionId() {
            return this.localRegionId;
        }

        public DescribeCenBandwidthPackagesResponseBodyCenBandwidthPackagesCenBandwidthPackageOrginInterRegionBandwidthLimitsOrginInterRegionBandwidthLimit setOppositeRegionId(String oppositeRegionId) {
            this.oppositeRegionId = oppositeRegionId;
            return this;
        }
        public String getOppositeRegionId() {
            return this.oppositeRegionId;
        }

    }

    public static class DescribeCenBandwidthPackagesResponseBodyCenBandwidthPackagesCenBandwidthPackageOrginInterRegionBandwidthLimits extends TeaModel {
        @NameInMap("OrginInterRegionBandwidthLimit")
        public java.util.List<DescribeCenBandwidthPackagesResponseBodyCenBandwidthPackagesCenBandwidthPackageOrginInterRegionBandwidthLimitsOrginInterRegionBandwidthLimit> orginInterRegionBandwidthLimit;

        public static DescribeCenBandwidthPackagesResponseBodyCenBandwidthPackagesCenBandwidthPackageOrginInterRegionBandwidthLimits build(java.util.Map<String, ?> map) throws Exception {
            DescribeCenBandwidthPackagesResponseBodyCenBandwidthPackagesCenBandwidthPackageOrginInterRegionBandwidthLimits self = new DescribeCenBandwidthPackagesResponseBodyCenBandwidthPackagesCenBandwidthPackageOrginInterRegionBandwidthLimits();
            return TeaModel.build(map, self);
        }

        public DescribeCenBandwidthPackagesResponseBodyCenBandwidthPackagesCenBandwidthPackageOrginInterRegionBandwidthLimits setOrginInterRegionBandwidthLimit(java.util.List<DescribeCenBandwidthPackagesResponseBodyCenBandwidthPackagesCenBandwidthPackageOrginInterRegionBandwidthLimitsOrginInterRegionBandwidthLimit> orginInterRegionBandwidthLimit) {
            this.orginInterRegionBandwidthLimit = orginInterRegionBandwidthLimit;
            return this;
        }
        public java.util.List<DescribeCenBandwidthPackagesResponseBodyCenBandwidthPackagesCenBandwidthPackageOrginInterRegionBandwidthLimitsOrginInterRegionBandwidthLimit> getOrginInterRegionBandwidthLimit() {
            return this.orginInterRegionBandwidthLimit;
        }

    }

    public static class DescribeCenBandwidthPackagesResponseBodyCenBandwidthPackagesCenBandwidthPackageTagsTag extends TeaModel {
        /**
         * <p>The tag key.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeCenBandwidthPackagesResponseBodyCenBandwidthPackagesCenBandwidthPackageTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeCenBandwidthPackagesResponseBodyCenBandwidthPackagesCenBandwidthPackageTagsTag self = new DescribeCenBandwidthPackagesResponseBodyCenBandwidthPackagesCenBandwidthPackageTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeCenBandwidthPackagesResponseBodyCenBandwidthPackagesCenBandwidthPackageTagsTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeCenBandwidthPackagesResponseBodyCenBandwidthPackagesCenBandwidthPackageTagsTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeCenBandwidthPackagesResponseBodyCenBandwidthPackagesCenBandwidthPackageTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<DescribeCenBandwidthPackagesResponseBodyCenBandwidthPackagesCenBandwidthPackageTagsTag> tag;

        public static DescribeCenBandwidthPackagesResponseBodyCenBandwidthPackagesCenBandwidthPackageTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeCenBandwidthPackagesResponseBodyCenBandwidthPackagesCenBandwidthPackageTags self = new DescribeCenBandwidthPackagesResponseBodyCenBandwidthPackagesCenBandwidthPackageTags();
            return TeaModel.build(map, self);
        }

        public DescribeCenBandwidthPackagesResponseBodyCenBandwidthPackagesCenBandwidthPackageTags setTag(java.util.List<DescribeCenBandwidthPackagesResponseBodyCenBandwidthPackagesCenBandwidthPackageTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeCenBandwidthPackagesResponseBodyCenBandwidthPackagesCenBandwidthPackageTagsTag> getTag() {
            return this.tag;
        }

    }

    public static class DescribeCenBandwidthPackagesResponseBodyCenBandwidthPackagesCenBandwidthPackage extends TeaModel {
        /**
         * <p>The maximum bandwidth of the bandwidth plan.</p>
         */
        @NameInMap("Bandwidth")
        public Long bandwidth;

        /**
         * <p>The billing method of the bandwidth plan.</p>
         */
        @NameInMap("BandwidthPackageChargeType")
        public String bandwidthPackageChargeType;

        /**
         * <p>The status of the bandwidth plan. Valid values:</p>
         * <br>
         * <p>*   **Normal**: running as expected.</p>
         * <p>*   **FinancialLocked**: locked due to overdue payments.</p>
         * <p>*   **SecurityLocked**: locked due to security reasons</p>
         */
        @NameInMap("BusinessStatus")
        public String businessStatus;

        /**
         * <p>The ID of the bandwidth plan.</p>
         */
        @NameInMap("CenBandwidthPackageId")
        public String cenBandwidthPackageId;

        /**
         * <p>A list of CEN instances that are associated with the bandwidth plan.</p>
         */
        @NameInMap("CenIds")
        public DescribeCenBandwidthPackagesResponseBodyCenBandwidthPackagesCenBandwidthPackageCenIds cenIds;

        /**
         * <p>The time when the bandwidth plan was created. The time is displayed in the ISO8601 standard in the YYYY-MM-DDThh:mmZ format.</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The description of the bandwidth plan.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The time when the bandwidth plan expires.</p>
         */
        @NameInMap("ExpiredTime")
        public String expiredTime;

        /**
         * <p>The ID of the area that you want to query. Valid values:</p>
         * <br>
         * <p>*   **china**: Chinese mainland.</p>
         * <p>*   **asia-pacific**: Asia Pacific</p>
         * <p>*   **europe**: Europe</p>
         * <p>*   **australia**: Australia</p>
         * <p>*   **north-america**: North America</p>
         */
        @NameInMap("GeographicRegionAId")
        public String geographicRegionAId;

        /**
         * <p>The ID of the other area connected by the bandwidth plan. Valid values:</p>
         * <br>
         * <p>*   **china**: Chinese mainland.</p>
         * <p>*   **asia-pacific**: Asia Pacific</p>
         * <p>*   **europe**: Europe</p>
         * <p>*   **australia**: Australia</p>
         * <p>*   **north-america**: North America</p>
         */
        @NameInMap("GeographicRegionBId")
        public String geographicRegionBId;

        /**
         * <p>The ID of the connected area.</p>
         */
        @NameInMap("GeographicSpanId")
        public String geographicSpanId;

        /**
         * <p>Indicates whether renewal data is included.</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         * <br>
         * <p>>  This parameter returns **true** only when the **IncludeReservationData** parameter is set to **true** and a pending order exists.</p>
         */
        @NameInMap("HasReservationData")
        public String hasReservationData;

        /**
         * <p>Indicates whether the bandwidth plan supports cross-border communication.</p>
         * <br>
         * <p>*   **false**</p>
         * <p>*   **true**</p>
         */
        @NameInMap("IsCrossBorder")
        public Boolean isCrossBorder;

        /**
         * <p>The name of the bandwidth plan.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The details about the connected regions.</p>
         */
        @NameInMap("OrginInterRegionBandwidthLimits")
        public DescribeCenBandwidthPackagesResponseBodyCenBandwidthPackagesCenBandwidthPackageOrginInterRegionBandwidthLimits orginInterRegionBandwidthLimits;

        /**
         * <p>The expiration time of the temporary upgrade.</p>
         */
        @NameInMap("ReservationActiveTime")
        public String reservationActiveTime;

        /**
         * <p>The bandwidth value to which the bandwidth plan is restored when the temporary upgrade ends.</p>
         */
        @NameInMap("ReservationBandwidth")
        public String reservationBandwidth;

        /**
         * <p>The new billing method.</p>
         */
        @NameInMap("ReservationInternetChargeType")
        public String reservationInternetChargeType;

        /**
         * <p>The renewal method.</p>
         * <br>
         * <p>*   **TEMP_UPGRADE**: temporary upgrade</p>
         * <p>*   **UPGRADE**: upgrade</p>
         */
        @NameInMap("ReservationOrderType")
        public String reservationOrderType;

        /**
         * <p>The ID of the resource group to which the ACL belongs.</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>Indicates whether the bandwidth plan is associated with a CEN instance.</p>
         * <br>
         * <p>*   **Idle**</p>
         * <p>*   **InUse**</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The tags of the bandwidth plan.</p>
         */
        @NameInMap("Tags")
        public DescribeCenBandwidthPackagesResponseBodyCenBandwidthPackagesCenBandwidthPackageTags tags;

        public static DescribeCenBandwidthPackagesResponseBodyCenBandwidthPackagesCenBandwidthPackage build(java.util.Map<String, ?> map) throws Exception {
            DescribeCenBandwidthPackagesResponseBodyCenBandwidthPackagesCenBandwidthPackage self = new DescribeCenBandwidthPackagesResponseBodyCenBandwidthPackagesCenBandwidthPackage();
            return TeaModel.build(map, self);
        }

        public DescribeCenBandwidthPackagesResponseBodyCenBandwidthPackagesCenBandwidthPackage setBandwidth(Long bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public Long getBandwidth() {
            return this.bandwidth;
        }

        public DescribeCenBandwidthPackagesResponseBodyCenBandwidthPackagesCenBandwidthPackage setBandwidthPackageChargeType(String bandwidthPackageChargeType) {
            this.bandwidthPackageChargeType = bandwidthPackageChargeType;
            return this;
        }
        public String getBandwidthPackageChargeType() {
            return this.bandwidthPackageChargeType;
        }

        public DescribeCenBandwidthPackagesResponseBodyCenBandwidthPackagesCenBandwidthPackage setBusinessStatus(String businessStatus) {
            this.businessStatus = businessStatus;
            return this;
        }
        public String getBusinessStatus() {
            return this.businessStatus;
        }

        public DescribeCenBandwidthPackagesResponseBodyCenBandwidthPackagesCenBandwidthPackage setCenBandwidthPackageId(String cenBandwidthPackageId) {
            this.cenBandwidthPackageId = cenBandwidthPackageId;
            return this;
        }
        public String getCenBandwidthPackageId() {
            return this.cenBandwidthPackageId;
        }

        public DescribeCenBandwidthPackagesResponseBodyCenBandwidthPackagesCenBandwidthPackage setCenIds(DescribeCenBandwidthPackagesResponseBodyCenBandwidthPackagesCenBandwidthPackageCenIds cenIds) {
            this.cenIds = cenIds;
            return this;
        }
        public DescribeCenBandwidthPackagesResponseBodyCenBandwidthPackagesCenBandwidthPackageCenIds getCenIds() {
            return this.cenIds;
        }

        public DescribeCenBandwidthPackagesResponseBodyCenBandwidthPackagesCenBandwidthPackage setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeCenBandwidthPackagesResponseBodyCenBandwidthPackagesCenBandwidthPackage setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeCenBandwidthPackagesResponseBodyCenBandwidthPackagesCenBandwidthPackage setExpiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public String getExpiredTime() {
            return this.expiredTime;
        }

        public DescribeCenBandwidthPackagesResponseBodyCenBandwidthPackagesCenBandwidthPackage setGeographicRegionAId(String geographicRegionAId) {
            this.geographicRegionAId = geographicRegionAId;
            return this;
        }
        public String getGeographicRegionAId() {
            return this.geographicRegionAId;
        }

        public DescribeCenBandwidthPackagesResponseBodyCenBandwidthPackagesCenBandwidthPackage setGeographicRegionBId(String geographicRegionBId) {
            this.geographicRegionBId = geographicRegionBId;
            return this;
        }
        public String getGeographicRegionBId() {
            return this.geographicRegionBId;
        }

        public DescribeCenBandwidthPackagesResponseBodyCenBandwidthPackagesCenBandwidthPackage setGeographicSpanId(String geographicSpanId) {
            this.geographicSpanId = geographicSpanId;
            return this;
        }
        public String getGeographicSpanId() {
            return this.geographicSpanId;
        }

        public DescribeCenBandwidthPackagesResponseBodyCenBandwidthPackagesCenBandwidthPackage setHasReservationData(String hasReservationData) {
            this.hasReservationData = hasReservationData;
            return this;
        }
        public String getHasReservationData() {
            return this.hasReservationData;
        }

        public DescribeCenBandwidthPackagesResponseBodyCenBandwidthPackagesCenBandwidthPackage setIsCrossBorder(Boolean isCrossBorder) {
            this.isCrossBorder = isCrossBorder;
            return this;
        }
        public Boolean getIsCrossBorder() {
            return this.isCrossBorder;
        }

        public DescribeCenBandwidthPackagesResponseBodyCenBandwidthPackagesCenBandwidthPackage setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeCenBandwidthPackagesResponseBodyCenBandwidthPackagesCenBandwidthPackage setOrginInterRegionBandwidthLimits(DescribeCenBandwidthPackagesResponseBodyCenBandwidthPackagesCenBandwidthPackageOrginInterRegionBandwidthLimits orginInterRegionBandwidthLimits) {
            this.orginInterRegionBandwidthLimits = orginInterRegionBandwidthLimits;
            return this;
        }
        public DescribeCenBandwidthPackagesResponseBodyCenBandwidthPackagesCenBandwidthPackageOrginInterRegionBandwidthLimits getOrginInterRegionBandwidthLimits() {
            return this.orginInterRegionBandwidthLimits;
        }

        public DescribeCenBandwidthPackagesResponseBodyCenBandwidthPackagesCenBandwidthPackage setReservationActiveTime(String reservationActiveTime) {
            this.reservationActiveTime = reservationActiveTime;
            return this;
        }
        public String getReservationActiveTime() {
            return this.reservationActiveTime;
        }

        public DescribeCenBandwidthPackagesResponseBodyCenBandwidthPackagesCenBandwidthPackage setReservationBandwidth(String reservationBandwidth) {
            this.reservationBandwidth = reservationBandwidth;
            return this;
        }
        public String getReservationBandwidth() {
            return this.reservationBandwidth;
        }

        public DescribeCenBandwidthPackagesResponseBodyCenBandwidthPackagesCenBandwidthPackage setReservationInternetChargeType(String reservationInternetChargeType) {
            this.reservationInternetChargeType = reservationInternetChargeType;
            return this;
        }
        public String getReservationInternetChargeType() {
            return this.reservationInternetChargeType;
        }

        public DescribeCenBandwidthPackagesResponseBodyCenBandwidthPackagesCenBandwidthPackage setReservationOrderType(String reservationOrderType) {
            this.reservationOrderType = reservationOrderType;
            return this;
        }
        public String getReservationOrderType() {
            return this.reservationOrderType;
        }

        public DescribeCenBandwidthPackagesResponseBodyCenBandwidthPackagesCenBandwidthPackage setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeCenBandwidthPackagesResponseBodyCenBandwidthPackagesCenBandwidthPackage setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeCenBandwidthPackagesResponseBodyCenBandwidthPackagesCenBandwidthPackage setTags(DescribeCenBandwidthPackagesResponseBodyCenBandwidthPackagesCenBandwidthPackageTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribeCenBandwidthPackagesResponseBodyCenBandwidthPackagesCenBandwidthPackageTags getTags() {
            return this.tags;
        }

    }

    public static class DescribeCenBandwidthPackagesResponseBodyCenBandwidthPackages extends TeaModel {
        @NameInMap("CenBandwidthPackage")
        public java.util.List<DescribeCenBandwidthPackagesResponseBodyCenBandwidthPackagesCenBandwidthPackage> cenBandwidthPackage;

        public static DescribeCenBandwidthPackagesResponseBodyCenBandwidthPackages build(java.util.Map<String, ?> map) throws Exception {
            DescribeCenBandwidthPackagesResponseBodyCenBandwidthPackages self = new DescribeCenBandwidthPackagesResponseBodyCenBandwidthPackages();
            return TeaModel.build(map, self);
        }

        public DescribeCenBandwidthPackagesResponseBodyCenBandwidthPackages setCenBandwidthPackage(java.util.List<DescribeCenBandwidthPackagesResponseBodyCenBandwidthPackagesCenBandwidthPackage> cenBandwidthPackage) {
            this.cenBandwidthPackage = cenBandwidthPackage;
            return this;
        }
        public java.util.List<DescribeCenBandwidthPackagesResponseBodyCenBandwidthPackagesCenBandwidthPackage> getCenBandwidthPackage() {
            return this.cenBandwidthPackage;
        }

    }

}
