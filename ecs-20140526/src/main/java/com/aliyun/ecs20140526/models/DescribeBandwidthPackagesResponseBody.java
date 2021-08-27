// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeBandwidthPackagesResponseBody extends TeaModel {
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("BandwidthPackages")
    public DescribeBandwidthPackagesResponseBodyBandwidthPackages bandwidthPackages;

    public static DescribeBandwidthPackagesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBandwidthPackagesResponseBody self = new DescribeBandwidthPackagesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBandwidthPackagesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeBandwidthPackagesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeBandwidthPackagesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeBandwidthPackagesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeBandwidthPackagesResponseBody setBandwidthPackages(DescribeBandwidthPackagesResponseBodyBandwidthPackages bandwidthPackages) {
        this.bandwidthPackages = bandwidthPackages;
        return this;
    }
    public DescribeBandwidthPackagesResponseBodyBandwidthPackages getBandwidthPackages() {
        return this.bandwidthPackages;
    }

    public static class DescribeBandwidthPackagesResponseBodyBandwidthPackagesBandwidthPackagePublicIpAddressesPublicIpAddresse extends TeaModel {
        @NameInMap("IpAddress")
        public String ipAddress;

        @NameInMap("AllocationId")
        public String allocationId;

        public static DescribeBandwidthPackagesResponseBodyBandwidthPackagesBandwidthPackagePublicIpAddressesPublicIpAddresse build(java.util.Map<String, ?> map) throws Exception {
            DescribeBandwidthPackagesResponseBodyBandwidthPackagesBandwidthPackagePublicIpAddressesPublicIpAddresse self = new DescribeBandwidthPackagesResponseBodyBandwidthPackagesBandwidthPackagePublicIpAddressesPublicIpAddresse();
            return TeaModel.build(map, self);
        }

        public DescribeBandwidthPackagesResponseBodyBandwidthPackagesBandwidthPackagePublicIpAddressesPublicIpAddresse setIpAddress(String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public String getIpAddress() {
            return this.ipAddress;
        }

        public DescribeBandwidthPackagesResponseBodyBandwidthPackagesBandwidthPackagePublicIpAddressesPublicIpAddresse setAllocationId(String allocationId) {
            this.allocationId = allocationId;
            return this;
        }
        public String getAllocationId() {
            return this.allocationId;
        }

    }

    public static class DescribeBandwidthPackagesResponseBodyBandwidthPackagesBandwidthPackagePublicIpAddresses extends TeaModel {
        @NameInMap("PublicIpAddresse")
        public java.util.List<DescribeBandwidthPackagesResponseBodyBandwidthPackagesBandwidthPackagePublicIpAddressesPublicIpAddresse> publicIpAddresse;

        public static DescribeBandwidthPackagesResponseBodyBandwidthPackagesBandwidthPackagePublicIpAddresses build(java.util.Map<String, ?> map) throws Exception {
            DescribeBandwidthPackagesResponseBodyBandwidthPackagesBandwidthPackagePublicIpAddresses self = new DescribeBandwidthPackagesResponseBodyBandwidthPackagesBandwidthPackagePublicIpAddresses();
            return TeaModel.build(map, self);
        }

        public DescribeBandwidthPackagesResponseBodyBandwidthPackagesBandwidthPackagePublicIpAddresses setPublicIpAddresse(java.util.List<DescribeBandwidthPackagesResponseBodyBandwidthPackagesBandwidthPackagePublicIpAddressesPublicIpAddresse> publicIpAddresse) {
            this.publicIpAddresse = publicIpAddresse;
            return this;
        }
        public java.util.List<DescribeBandwidthPackagesResponseBodyBandwidthPackagesBandwidthPackagePublicIpAddressesPublicIpAddresse> getPublicIpAddresse() {
            return this.publicIpAddresse;
        }

    }

    public static class DescribeBandwidthPackagesResponseBodyBandwidthPackagesBandwidthPackage extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("IpCount")
        public String ipCount;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("InstanceChargeType")
        public String instanceChargeType;

        @NameInMap("BandwidthPackageId")
        public String bandwidthPackageId;

        @NameInMap("Description")
        public String description;

        @NameInMap("Bandwidth")
        public String bandwidth;

        @NameInMap("NatGatewayId")
        public String natGatewayId;

        @NameInMap("ZoneId")
        public String zoneId;

        @NameInMap("InternetChargeType")
        public String internetChargeType;

        @NameInMap("BusinessStatus")
        public String businessStatus;

        @NameInMap("Name")
        public String name;

        @NameInMap("ISP")
        public String ISP;

        @NameInMap("PublicIpAddresses")
        public DescribeBandwidthPackagesResponseBodyBandwidthPackagesBandwidthPackagePublicIpAddresses publicIpAddresses;

        public static DescribeBandwidthPackagesResponseBodyBandwidthPackagesBandwidthPackage build(java.util.Map<String, ?> map) throws Exception {
            DescribeBandwidthPackagesResponseBodyBandwidthPackagesBandwidthPackage self = new DescribeBandwidthPackagesResponseBodyBandwidthPackagesBandwidthPackage();
            return TeaModel.build(map, self);
        }

        public DescribeBandwidthPackagesResponseBodyBandwidthPackagesBandwidthPackage setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeBandwidthPackagesResponseBodyBandwidthPackagesBandwidthPackage setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeBandwidthPackagesResponseBodyBandwidthPackagesBandwidthPackage setIpCount(String ipCount) {
            this.ipCount = ipCount;
            return this;
        }
        public String getIpCount() {
            return this.ipCount;
        }

        public DescribeBandwidthPackagesResponseBodyBandwidthPackagesBandwidthPackage setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeBandwidthPackagesResponseBodyBandwidthPackagesBandwidthPackage setInstanceChargeType(String instanceChargeType) {
            this.instanceChargeType = instanceChargeType;
            return this;
        }
        public String getInstanceChargeType() {
            return this.instanceChargeType;
        }

        public DescribeBandwidthPackagesResponseBodyBandwidthPackagesBandwidthPackage setBandwidthPackageId(String bandwidthPackageId) {
            this.bandwidthPackageId = bandwidthPackageId;
            return this;
        }
        public String getBandwidthPackageId() {
            return this.bandwidthPackageId;
        }

        public DescribeBandwidthPackagesResponseBodyBandwidthPackagesBandwidthPackage setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeBandwidthPackagesResponseBodyBandwidthPackagesBandwidthPackage setBandwidth(String bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public String getBandwidth() {
            return this.bandwidth;
        }

        public DescribeBandwidthPackagesResponseBodyBandwidthPackagesBandwidthPackage setNatGatewayId(String natGatewayId) {
            this.natGatewayId = natGatewayId;
            return this;
        }
        public String getNatGatewayId() {
            return this.natGatewayId;
        }

        public DescribeBandwidthPackagesResponseBodyBandwidthPackagesBandwidthPackage setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public DescribeBandwidthPackagesResponseBodyBandwidthPackagesBandwidthPackage setInternetChargeType(String internetChargeType) {
            this.internetChargeType = internetChargeType;
            return this;
        }
        public String getInternetChargeType() {
            return this.internetChargeType;
        }

        public DescribeBandwidthPackagesResponseBodyBandwidthPackagesBandwidthPackage setBusinessStatus(String businessStatus) {
            this.businessStatus = businessStatus;
            return this;
        }
        public String getBusinessStatus() {
            return this.businessStatus;
        }

        public DescribeBandwidthPackagesResponseBodyBandwidthPackagesBandwidthPackage setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeBandwidthPackagesResponseBodyBandwidthPackagesBandwidthPackage setISP(String ISP) {
            this.ISP = ISP;
            return this;
        }
        public String getISP() {
            return this.ISP;
        }

        public DescribeBandwidthPackagesResponseBodyBandwidthPackagesBandwidthPackage setPublicIpAddresses(DescribeBandwidthPackagesResponseBodyBandwidthPackagesBandwidthPackagePublicIpAddresses publicIpAddresses) {
            this.publicIpAddresses = publicIpAddresses;
            return this;
        }
        public DescribeBandwidthPackagesResponseBodyBandwidthPackagesBandwidthPackagePublicIpAddresses getPublicIpAddresses() {
            return this.publicIpAddresses;
        }

    }

    public static class DescribeBandwidthPackagesResponseBodyBandwidthPackages extends TeaModel {
        @NameInMap("BandwidthPackage")
        public java.util.List<DescribeBandwidthPackagesResponseBodyBandwidthPackagesBandwidthPackage> bandwidthPackage;

        public static DescribeBandwidthPackagesResponseBodyBandwidthPackages build(java.util.Map<String, ?> map) throws Exception {
            DescribeBandwidthPackagesResponseBodyBandwidthPackages self = new DescribeBandwidthPackagesResponseBodyBandwidthPackages();
            return TeaModel.build(map, self);
        }

        public DescribeBandwidthPackagesResponseBodyBandwidthPackages setBandwidthPackage(java.util.List<DescribeBandwidthPackagesResponseBodyBandwidthPackagesBandwidthPackage> bandwidthPackage) {
            this.bandwidthPackage = bandwidthPackage;
            return this;
        }
        public java.util.List<DescribeBandwidthPackagesResponseBodyBandwidthPackagesBandwidthPackage> getBandwidthPackage() {
            return this.bandwidthPackage;
        }

    }

}
