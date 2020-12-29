// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DescribeCenBandwidthPackagesResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("CenBandwidthPackages")
    public java.util.List<DescribeCenBandwidthPackagesResponseBodyCenBandwidthPackages> cenBandwidthPackages;

    public static DescribeCenBandwidthPackagesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCenBandwidthPackagesResponseBody self = new DescribeCenBandwidthPackagesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCenBandwidthPackagesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
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

    public DescribeCenBandwidthPackagesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeCenBandwidthPackagesResponseBody setCenBandwidthPackages(java.util.List<DescribeCenBandwidthPackagesResponseBodyCenBandwidthPackages> cenBandwidthPackages) {
        this.cenBandwidthPackages = cenBandwidthPackages;
        return this;
    }
    public java.util.List<DescribeCenBandwidthPackagesResponseBodyCenBandwidthPackages> getCenBandwidthPackages() {
        return this.cenBandwidthPackages;
    }

    public static class DescribeCenBandwidthPackagesResponseBodyCenBandwidthPackagesOrginInterRegionBandwidthLimits extends TeaModel {
        @NameInMap("OppositeRegionId")
        public String oppositeRegionId;

        @NameInMap("GeographicSpanId")
        public String geographicSpanId;

        @NameInMap("LocalRegionId")
        public String localRegionId;

        @NameInMap("BandwidthLimit")
        public String bandwidthLimit;

        public static DescribeCenBandwidthPackagesResponseBodyCenBandwidthPackagesOrginInterRegionBandwidthLimits build(java.util.Map<String, ?> map) throws Exception {
            DescribeCenBandwidthPackagesResponseBodyCenBandwidthPackagesOrginInterRegionBandwidthLimits self = new DescribeCenBandwidthPackagesResponseBodyCenBandwidthPackagesOrginInterRegionBandwidthLimits();
            return TeaModel.build(map, self);
        }

        public DescribeCenBandwidthPackagesResponseBodyCenBandwidthPackagesOrginInterRegionBandwidthLimits setOppositeRegionId(String oppositeRegionId) {
            this.oppositeRegionId = oppositeRegionId;
            return this;
        }
        public String getOppositeRegionId() {
            return this.oppositeRegionId;
        }

        public DescribeCenBandwidthPackagesResponseBodyCenBandwidthPackagesOrginInterRegionBandwidthLimits setGeographicSpanId(String geographicSpanId) {
            this.geographicSpanId = geographicSpanId;
            return this;
        }
        public String getGeographicSpanId() {
            return this.geographicSpanId;
        }

        public DescribeCenBandwidthPackagesResponseBodyCenBandwidthPackagesOrginInterRegionBandwidthLimits setLocalRegionId(String localRegionId) {
            this.localRegionId = localRegionId;
            return this;
        }
        public String getLocalRegionId() {
            return this.localRegionId;
        }

        public DescribeCenBandwidthPackagesResponseBodyCenBandwidthPackagesOrginInterRegionBandwidthLimits setBandwidthLimit(String bandwidthLimit) {
            this.bandwidthLimit = bandwidthLimit;
            return this;
        }
        public String getBandwidthLimit() {
            return this.bandwidthLimit;
        }

    }

    public static class DescribeCenBandwidthPackagesResponseBodyCenBandwidthPackages extends TeaModel {
        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("Status")
        public String status;

        @NameInMap("ReservationActiveTime")
        public String reservationActiveTime;

        @NameInMap("ReservationOrderType")
        public String reservationOrderType;

        @NameInMap("BandwidthPackageChargeType")
        public String bandwidthPackageChargeType;

        @NameInMap("CenBandwidthPackageId")
        public String cenBandwidthPackageId;

        @NameInMap("OrginInterRegionBandwidthLimits")
        public java.util.List<DescribeCenBandwidthPackagesResponseBodyCenBandwidthPackagesOrginInterRegionBandwidthLimits> orginInterRegionBandwidthLimits;

        @NameInMap("CenIds")
        public java.util.List<String> cenIds;

        @NameInMap("GeographicRegionAId")
        public String geographicRegionAId;

        @NameInMap("Ratio")
        public String ratio;

        @NameInMap("ReservationInternetChargeType")
        public String reservationInternetChargeType;

        @NameInMap("TypeFor95")
        public String typeFor95;

        @NameInMap("Bandwidth")
        public Long bandwidth;

        @NameInMap("Description")
        public String description;

        @NameInMap("ExpiredTime")
        public String expiredTime;

        @NameInMap("ReservationBandwidth")
        public String reservationBandwidth;

        @NameInMap("GeographicSpanId")
        public String geographicSpanId;

        @NameInMap("GeographicRegionBId")
        public String geographicRegionBId;

        @NameInMap("IsCrossBorder")
        public Boolean isCrossBorder;

        @NameInMap("BusinessStatus")
        public String businessStatus;

        @NameInMap("Name")
        public String name;

        @NameInMap("HasReservationData")
        public String hasReservationData;

        public static DescribeCenBandwidthPackagesResponseBodyCenBandwidthPackages build(java.util.Map<String, ?> map) throws Exception {
            DescribeCenBandwidthPackagesResponseBodyCenBandwidthPackages self = new DescribeCenBandwidthPackagesResponseBodyCenBandwidthPackages();
            return TeaModel.build(map, self);
        }

        public DescribeCenBandwidthPackagesResponseBodyCenBandwidthPackages setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeCenBandwidthPackagesResponseBodyCenBandwidthPackages setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeCenBandwidthPackagesResponseBodyCenBandwidthPackages setReservationActiveTime(String reservationActiveTime) {
            this.reservationActiveTime = reservationActiveTime;
            return this;
        }
        public String getReservationActiveTime() {
            return this.reservationActiveTime;
        }

        public DescribeCenBandwidthPackagesResponseBodyCenBandwidthPackages setReservationOrderType(String reservationOrderType) {
            this.reservationOrderType = reservationOrderType;
            return this;
        }
        public String getReservationOrderType() {
            return this.reservationOrderType;
        }

        public DescribeCenBandwidthPackagesResponseBodyCenBandwidthPackages setBandwidthPackageChargeType(String bandwidthPackageChargeType) {
            this.bandwidthPackageChargeType = bandwidthPackageChargeType;
            return this;
        }
        public String getBandwidthPackageChargeType() {
            return this.bandwidthPackageChargeType;
        }

        public DescribeCenBandwidthPackagesResponseBodyCenBandwidthPackages setCenBandwidthPackageId(String cenBandwidthPackageId) {
            this.cenBandwidthPackageId = cenBandwidthPackageId;
            return this;
        }
        public String getCenBandwidthPackageId() {
            return this.cenBandwidthPackageId;
        }

        public DescribeCenBandwidthPackagesResponseBodyCenBandwidthPackages setOrginInterRegionBandwidthLimits(java.util.List<DescribeCenBandwidthPackagesResponseBodyCenBandwidthPackagesOrginInterRegionBandwidthLimits> orginInterRegionBandwidthLimits) {
            this.orginInterRegionBandwidthLimits = orginInterRegionBandwidthLimits;
            return this;
        }
        public java.util.List<DescribeCenBandwidthPackagesResponseBodyCenBandwidthPackagesOrginInterRegionBandwidthLimits> getOrginInterRegionBandwidthLimits() {
            return this.orginInterRegionBandwidthLimits;
        }

        public DescribeCenBandwidthPackagesResponseBodyCenBandwidthPackages setCenIds(java.util.List<String> cenIds) {
            this.cenIds = cenIds;
            return this;
        }
        public java.util.List<String> getCenIds() {
            return this.cenIds;
        }

        public DescribeCenBandwidthPackagesResponseBodyCenBandwidthPackages setGeographicRegionAId(String geographicRegionAId) {
            this.geographicRegionAId = geographicRegionAId;
            return this;
        }
        public String getGeographicRegionAId() {
            return this.geographicRegionAId;
        }

        public DescribeCenBandwidthPackagesResponseBodyCenBandwidthPackages setRatio(String ratio) {
            this.ratio = ratio;
            return this;
        }
        public String getRatio() {
            return this.ratio;
        }

        public DescribeCenBandwidthPackagesResponseBodyCenBandwidthPackages setReservationInternetChargeType(String reservationInternetChargeType) {
            this.reservationInternetChargeType = reservationInternetChargeType;
            return this;
        }
        public String getReservationInternetChargeType() {
            return this.reservationInternetChargeType;
        }

        public DescribeCenBandwidthPackagesResponseBodyCenBandwidthPackages setTypeFor95(String typeFor95) {
            this.typeFor95 = typeFor95;
            return this;
        }
        public String getTypeFor95() {
            return this.typeFor95;
        }

        public DescribeCenBandwidthPackagesResponseBodyCenBandwidthPackages setBandwidth(Long bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public Long getBandwidth() {
            return this.bandwidth;
        }

        public DescribeCenBandwidthPackagesResponseBodyCenBandwidthPackages setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeCenBandwidthPackagesResponseBodyCenBandwidthPackages setExpiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public String getExpiredTime() {
            return this.expiredTime;
        }

        public DescribeCenBandwidthPackagesResponseBodyCenBandwidthPackages setReservationBandwidth(String reservationBandwidth) {
            this.reservationBandwidth = reservationBandwidth;
            return this;
        }
        public String getReservationBandwidth() {
            return this.reservationBandwidth;
        }

        public DescribeCenBandwidthPackagesResponseBodyCenBandwidthPackages setGeographicSpanId(String geographicSpanId) {
            this.geographicSpanId = geographicSpanId;
            return this;
        }
        public String getGeographicSpanId() {
            return this.geographicSpanId;
        }

        public DescribeCenBandwidthPackagesResponseBodyCenBandwidthPackages setGeographicRegionBId(String geographicRegionBId) {
            this.geographicRegionBId = geographicRegionBId;
            return this;
        }
        public String getGeographicRegionBId() {
            return this.geographicRegionBId;
        }

        public DescribeCenBandwidthPackagesResponseBodyCenBandwidthPackages setIsCrossBorder(Boolean isCrossBorder) {
            this.isCrossBorder = isCrossBorder;
            return this;
        }
        public Boolean getIsCrossBorder() {
            return this.isCrossBorder;
        }

        public DescribeCenBandwidthPackagesResponseBodyCenBandwidthPackages setBusinessStatus(String businessStatus) {
            this.businessStatus = businessStatus;
            return this;
        }
        public String getBusinessStatus() {
            return this.businessStatus;
        }

        public DescribeCenBandwidthPackagesResponseBodyCenBandwidthPackages setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeCenBandwidthPackagesResponseBodyCenBandwidthPackages setHasReservationData(String hasReservationData) {
            this.hasReservationData = hasReservationData;
            return this;
        }
        public String getHasReservationData() {
            return this.hasReservationData;
        }

    }

}
