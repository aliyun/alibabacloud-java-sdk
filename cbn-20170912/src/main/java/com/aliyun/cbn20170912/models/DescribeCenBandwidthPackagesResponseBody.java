// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DescribeCenBandwidthPackagesResponseBody extends TeaModel {
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("CenBandwidthPackages")
    public DescribeCenBandwidthPackagesResponseBodyCenBandwidthPackages cenBandwidthPackages;

    public static DescribeCenBandwidthPackagesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCenBandwidthPackagesResponseBody self = new DescribeCenBandwidthPackagesResponseBody();
        return TeaModel.build(map, self);
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

    public DescribeCenBandwidthPackagesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeCenBandwidthPackagesResponseBody setCenBandwidthPackages(DescribeCenBandwidthPackagesResponseBodyCenBandwidthPackages cenBandwidthPackages) {
        this.cenBandwidthPackages = cenBandwidthPackages;
        return this;
    }
    public DescribeCenBandwidthPackagesResponseBodyCenBandwidthPackages getCenBandwidthPackages() {
        return this.cenBandwidthPackages;
    }

    public static class DescribeCenBandwidthPackagesResponseBodyCenBandwidthPackagesCenBandwidthPackageOrginInterRegionBandwidthLimitsOrginInterRegionBandwidthLimit extends TeaModel {
        @NameInMap("BandwidthLimit")
        public String bandwidthLimit;

        @NameInMap("OppositeRegionId")
        public String oppositeRegionId;

        @NameInMap("GeographicSpanId")
        public String geographicSpanId;

        @NameInMap("LocalRegionId")
        public String localRegionId;

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

        public DescribeCenBandwidthPackagesResponseBodyCenBandwidthPackagesCenBandwidthPackageOrginInterRegionBandwidthLimitsOrginInterRegionBandwidthLimit setOppositeRegionId(String oppositeRegionId) {
            this.oppositeRegionId = oppositeRegionId;
            return this;
        }
        public String getOppositeRegionId() {
            return this.oppositeRegionId;
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

    public static class DescribeCenBandwidthPackagesResponseBodyCenBandwidthPackagesCenBandwidthPackage extends TeaModel {
        @NameInMap("ReservationActiveTime")
        public String reservationActiveTime;

        @NameInMap("Status")
        public String status;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("ReservationOrderType")
        public String reservationOrderType;

        @NameInMap("BandwidthPackageChargeType")
        public String bandwidthPackageChargeType;

        @NameInMap("CenBandwidthPackageId")
        public String cenBandwidthPackageId;

        @NameInMap("ReservationInternetChargeType")
        public String reservationInternetChargeType;

        @NameInMap("Ratio")
        public String ratio;

        @NameInMap("GeographicRegionAId")
        public String geographicRegionAId;

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

        @NameInMap("OrginInterRegionBandwidthLimits")
        public DescribeCenBandwidthPackagesResponseBodyCenBandwidthPackagesCenBandwidthPackageOrginInterRegionBandwidthLimits orginInterRegionBandwidthLimits;

        @NameInMap("CenIds")
        public DescribeCenBandwidthPackagesResponseBodyCenBandwidthPackagesCenBandwidthPackageCenIds cenIds;

        public static DescribeCenBandwidthPackagesResponseBodyCenBandwidthPackagesCenBandwidthPackage build(java.util.Map<String, ?> map) throws Exception {
            DescribeCenBandwidthPackagesResponseBodyCenBandwidthPackagesCenBandwidthPackage self = new DescribeCenBandwidthPackagesResponseBodyCenBandwidthPackagesCenBandwidthPackage();
            return TeaModel.build(map, self);
        }

        public DescribeCenBandwidthPackagesResponseBodyCenBandwidthPackagesCenBandwidthPackage setReservationActiveTime(String reservationActiveTime) {
            this.reservationActiveTime = reservationActiveTime;
            return this;
        }
        public String getReservationActiveTime() {
            return this.reservationActiveTime;
        }

        public DescribeCenBandwidthPackagesResponseBodyCenBandwidthPackagesCenBandwidthPackage setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeCenBandwidthPackagesResponseBodyCenBandwidthPackagesCenBandwidthPackage setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeCenBandwidthPackagesResponseBodyCenBandwidthPackagesCenBandwidthPackage setReservationOrderType(String reservationOrderType) {
            this.reservationOrderType = reservationOrderType;
            return this;
        }
        public String getReservationOrderType() {
            return this.reservationOrderType;
        }

        public DescribeCenBandwidthPackagesResponseBodyCenBandwidthPackagesCenBandwidthPackage setBandwidthPackageChargeType(String bandwidthPackageChargeType) {
            this.bandwidthPackageChargeType = bandwidthPackageChargeType;
            return this;
        }
        public String getBandwidthPackageChargeType() {
            return this.bandwidthPackageChargeType;
        }

        public DescribeCenBandwidthPackagesResponseBodyCenBandwidthPackagesCenBandwidthPackage setCenBandwidthPackageId(String cenBandwidthPackageId) {
            this.cenBandwidthPackageId = cenBandwidthPackageId;
            return this;
        }
        public String getCenBandwidthPackageId() {
            return this.cenBandwidthPackageId;
        }

        public DescribeCenBandwidthPackagesResponseBodyCenBandwidthPackagesCenBandwidthPackage setReservationInternetChargeType(String reservationInternetChargeType) {
            this.reservationInternetChargeType = reservationInternetChargeType;
            return this;
        }
        public String getReservationInternetChargeType() {
            return this.reservationInternetChargeType;
        }

        public DescribeCenBandwidthPackagesResponseBodyCenBandwidthPackagesCenBandwidthPackage setRatio(String ratio) {
            this.ratio = ratio;
            return this;
        }
        public String getRatio() {
            return this.ratio;
        }

        public DescribeCenBandwidthPackagesResponseBodyCenBandwidthPackagesCenBandwidthPackage setGeographicRegionAId(String geographicRegionAId) {
            this.geographicRegionAId = geographicRegionAId;
            return this;
        }
        public String getGeographicRegionAId() {
            return this.geographicRegionAId;
        }

        public DescribeCenBandwidthPackagesResponseBodyCenBandwidthPackagesCenBandwidthPackage setTypeFor95(String typeFor95) {
            this.typeFor95 = typeFor95;
            return this;
        }
        public String getTypeFor95() {
            return this.typeFor95;
        }

        public DescribeCenBandwidthPackagesResponseBodyCenBandwidthPackagesCenBandwidthPackage setBandwidth(Long bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public Long getBandwidth() {
            return this.bandwidth;
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

        public DescribeCenBandwidthPackagesResponseBodyCenBandwidthPackagesCenBandwidthPackage setReservationBandwidth(String reservationBandwidth) {
            this.reservationBandwidth = reservationBandwidth;
            return this;
        }
        public String getReservationBandwidth() {
            return this.reservationBandwidth;
        }

        public DescribeCenBandwidthPackagesResponseBodyCenBandwidthPackagesCenBandwidthPackage setGeographicSpanId(String geographicSpanId) {
            this.geographicSpanId = geographicSpanId;
            return this;
        }
        public String getGeographicSpanId() {
            return this.geographicSpanId;
        }

        public DescribeCenBandwidthPackagesResponseBodyCenBandwidthPackagesCenBandwidthPackage setGeographicRegionBId(String geographicRegionBId) {
            this.geographicRegionBId = geographicRegionBId;
            return this;
        }
        public String getGeographicRegionBId() {
            return this.geographicRegionBId;
        }

        public DescribeCenBandwidthPackagesResponseBodyCenBandwidthPackagesCenBandwidthPackage setIsCrossBorder(Boolean isCrossBorder) {
            this.isCrossBorder = isCrossBorder;
            return this;
        }
        public Boolean getIsCrossBorder() {
            return this.isCrossBorder;
        }

        public DescribeCenBandwidthPackagesResponseBodyCenBandwidthPackagesCenBandwidthPackage setBusinessStatus(String businessStatus) {
            this.businessStatus = businessStatus;
            return this;
        }
        public String getBusinessStatus() {
            return this.businessStatus;
        }

        public DescribeCenBandwidthPackagesResponseBodyCenBandwidthPackagesCenBandwidthPackage setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeCenBandwidthPackagesResponseBodyCenBandwidthPackagesCenBandwidthPackage setHasReservationData(String hasReservationData) {
            this.hasReservationData = hasReservationData;
            return this;
        }
        public String getHasReservationData() {
            return this.hasReservationData;
        }

        public DescribeCenBandwidthPackagesResponseBodyCenBandwidthPackagesCenBandwidthPackage setOrginInterRegionBandwidthLimits(DescribeCenBandwidthPackagesResponseBodyCenBandwidthPackagesCenBandwidthPackageOrginInterRegionBandwidthLimits orginInterRegionBandwidthLimits) {
            this.orginInterRegionBandwidthLimits = orginInterRegionBandwidthLimits;
            return this;
        }
        public DescribeCenBandwidthPackagesResponseBodyCenBandwidthPackagesCenBandwidthPackageOrginInterRegionBandwidthLimits getOrginInterRegionBandwidthLimits() {
            return this.orginInterRegionBandwidthLimits;
        }

        public DescribeCenBandwidthPackagesResponseBodyCenBandwidthPackagesCenBandwidthPackage setCenIds(DescribeCenBandwidthPackagesResponseBodyCenBandwidthPackagesCenBandwidthPackageCenIds cenIds) {
            this.cenIds = cenIds;
            return this;
        }
        public DescribeCenBandwidthPackagesResponseBodyCenBandwidthPackagesCenBandwidthPackageCenIds getCenIds() {
            return this.cenIds;
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
