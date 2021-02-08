// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeBandwidthPackagesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("BandwidthPackages")
    @Validation(required = true)
    public DescribeBandwidthPackagesResponseBandwidthPackages bandwidthPackages;

    public static DescribeBandwidthPackagesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBandwidthPackagesResponse self = new DescribeBandwidthPackagesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBandwidthPackagesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeBandwidthPackagesResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeBandwidthPackagesResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeBandwidthPackagesResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeBandwidthPackagesResponse setBandwidthPackages(DescribeBandwidthPackagesResponseBandwidthPackages bandwidthPackages) {
        this.bandwidthPackages = bandwidthPackages;
        return this;
    }
    public DescribeBandwidthPackagesResponseBandwidthPackages getBandwidthPackages() {
        return this.bandwidthPackages;
    }

    public static class DescribeBandwidthPackagesResponseBandwidthPackagesBandwidthPackagePublicIpAddressesPublicIpAddresse extends TeaModel {
        @NameInMap("AllocationId")
        @Validation(required = true)
        public String allocationId;

        @NameInMap("IpAddress")
        @Validation(required = true)
        public String ipAddress;

        public static DescribeBandwidthPackagesResponseBandwidthPackagesBandwidthPackagePublicIpAddressesPublicIpAddresse build(java.util.Map<String, ?> map) throws Exception {
            DescribeBandwidthPackagesResponseBandwidthPackagesBandwidthPackagePublicIpAddressesPublicIpAddresse self = new DescribeBandwidthPackagesResponseBandwidthPackagesBandwidthPackagePublicIpAddressesPublicIpAddresse();
            return TeaModel.build(map, self);
        }

        public DescribeBandwidthPackagesResponseBandwidthPackagesBandwidthPackagePublicIpAddressesPublicIpAddresse setAllocationId(String allocationId) {
            this.allocationId = allocationId;
            return this;
        }
        public String getAllocationId() {
            return this.allocationId;
        }

        public DescribeBandwidthPackagesResponseBandwidthPackagesBandwidthPackagePublicIpAddressesPublicIpAddresse setIpAddress(String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public String getIpAddress() {
            return this.ipAddress;
        }

    }

    public static class DescribeBandwidthPackagesResponseBandwidthPackagesBandwidthPackagePublicIpAddresses extends TeaModel {
        @NameInMap("PublicIpAddresse")
        @Validation(required = true)
        public java.util.List<DescribeBandwidthPackagesResponseBandwidthPackagesBandwidthPackagePublicIpAddressesPublicIpAddresse> publicIpAddresse;

        public static DescribeBandwidthPackagesResponseBandwidthPackagesBandwidthPackagePublicIpAddresses build(java.util.Map<String, ?> map) throws Exception {
            DescribeBandwidthPackagesResponseBandwidthPackagesBandwidthPackagePublicIpAddresses self = new DescribeBandwidthPackagesResponseBandwidthPackagesBandwidthPackagePublicIpAddresses();
            return TeaModel.build(map, self);
        }

        public DescribeBandwidthPackagesResponseBandwidthPackagesBandwidthPackagePublicIpAddresses setPublicIpAddresse(java.util.List<DescribeBandwidthPackagesResponseBandwidthPackagesBandwidthPackagePublicIpAddressesPublicIpAddresse> publicIpAddresse) {
            this.publicIpAddresse = publicIpAddresse;
            return this;
        }
        public java.util.List<DescribeBandwidthPackagesResponseBandwidthPackagesBandwidthPackagePublicIpAddressesPublicIpAddresse> getPublicIpAddresse() {
            return this.publicIpAddresse;
        }

    }

    public static class DescribeBandwidthPackagesResponseBandwidthPackagesBandwidthPackage extends TeaModel {
        @NameInMap("BandwidthPackageId")
        @Validation(required = true)
        public String bandwidthPackageId;

        @NameInMap("RegionId")
        @Validation(required = true)
        public String regionId;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("ZoneId")
        @Validation(required = true)
        public String zoneId;

        @NameInMap("NatGatewayId")
        @Validation(required = true)
        public String natGatewayId;

        @NameInMap("Bandwidth")
        @Validation(required = true)
        public String bandwidth;

        @NameInMap("InstanceChargeType")
        @Validation(required = true)
        public String instanceChargeType;

        @NameInMap("InternetChargeType")
        @Validation(required = true)
        public String internetChargeType;

        @NameInMap("BusinessStatus")
        @Validation(required = true)
        public String businessStatus;

        @NameInMap("IpCount")
        @Validation(required = true)
        public String ipCount;

        @NameInMap("ISP")
        @Validation(required = true)
        public String ISP;

        @NameInMap("CreationTime")
        @Validation(required = true)
        public String creationTime;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("PublicIpAddresses")
        @Validation(required = true)
        public DescribeBandwidthPackagesResponseBandwidthPackagesBandwidthPackagePublicIpAddresses publicIpAddresses;

        public static DescribeBandwidthPackagesResponseBandwidthPackagesBandwidthPackage build(java.util.Map<String, ?> map) throws Exception {
            DescribeBandwidthPackagesResponseBandwidthPackagesBandwidthPackage self = new DescribeBandwidthPackagesResponseBandwidthPackagesBandwidthPackage();
            return TeaModel.build(map, self);
        }

        public DescribeBandwidthPackagesResponseBandwidthPackagesBandwidthPackage setBandwidthPackageId(String bandwidthPackageId) {
            this.bandwidthPackageId = bandwidthPackageId;
            return this;
        }
        public String getBandwidthPackageId() {
            return this.bandwidthPackageId;
        }

        public DescribeBandwidthPackagesResponseBandwidthPackagesBandwidthPackage setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeBandwidthPackagesResponseBandwidthPackagesBandwidthPackage setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeBandwidthPackagesResponseBandwidthPackagesBandwidthPackage setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeBandwidthPackagesResponseBandwidthPackagesBandwidthPackage setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public DescribeBandwidthPackagesResponseBandwidthPackagesBandwidthPackage setNatGatewayId(String natGatewayId) {
            this.natGatewayId = natGatewayId;
            return this;
        }
        public String getNatGatewayId() {
            return this.natGatewayId;
        }

        public DescribeBandwidthPackagesResponseBandwidthPackagesBandwidthPackage setBandwidth(String bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public String getBandwidth() {
            return this.bandwidth;
        }

        public DescribeBandwidthPackagesResponseBandwidthPackagesBandwidthPackage setInstanceChargeType(String instanceChargeType) {
            this.instanceChargeType = instanceChargeType;
            return this;
        }
        public String getInstanceChargeType() {
            return this.instanceChargeType;
        }

        public DescribeBandwidthPackagesResponseBandwidthPackagesBandwidthPackage setInternetChargeType(String internetChargeType) {
            this.internetChargeType = internetChargeType;
            return this;
        }
        public String getInternetChargeType() {
            return this.internetChargeType;
        }

        public DescribeBandwidthPackagesResponseBandwidthPackagesBandwidthPackage setBusinessStatus(String businessStatus) {
            this.businessStatus = businessStatus;
            return this;
        }
        public String getBusinessStatus() {
            return this.businessStatus;
        }

        public DescribeBandwidthPackagesResponseBandwidthPackagesBandwidthPackage setIpCount(String ipCount) {
            this.ipCount = ipCount;
            return this;
        }
        public String getIpCount() {
            return this.ipCount;
        }

        public DescribeBandwidthPackagesResponseBandwidthPackagesBandwidthPackage setISP(String ISP) {
            this.ISP = ISP;
            return this;
        }
        public String getISP() {
            return this.ISP;
        }

        public DescribeBandwidthPackagesResponseBandwidthPackagesBandwidthPackage setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeBandwidthPackagesResponseBandwidthPackagesBandwidthPackage setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeBandwidthPackagesResponseBandwidthPackagesBandwidthPackage setPublicIpAddresses(DescribeBandwidthPackagesResponseBandwidthPackagesBandwidthPackagePublicIpAddresses publicIpAddresses) {
            this.publicIpAddresses = publicIpAddresses;
            return this;
        }
        public DescribeBandwidthPackagesResponseBandwidthPackagesBandwidthPackagePublicIpAddresses getPublicIpAddresses() {
            return this.publicIpAddresses;
        }

    }

    public static class DescribeBandwidthPackagesResponseBandwidthPackages extends TeaModel {
        @NameInMap("BandwidthPackage")
        @Validation(required = true)
        public java.util.List<DescribeBandwidthPackagesResponseBandwidthPackagesBandwidthPackage> bandwidthPackage;

        public static DescribeBandwidthPackagesResponseBandwidthPackages build(java.util.Map<String, ?> map) throws Exception {
            DescribeBandwidthPackagesResponseBandwidthPackages self = new DescribeBandwidthPackagesResponseBandwidthPackages();
            return TeaModel.build(map, self);
        }

        public DescribeBandwidthPackagesResponseBandwidthPackages setBandwidthPackage(java.util.List<DescribeBandwidthPackagesResponseBandwidthPackagesBandwidthPackage> bandwidthPackage) {
            this.bandwidthPackage = bandwidthPackage;
            return this;
        }
        public java.util.List<DescribeBandwidthPackagesResponseBandwidthPackagesBandwidthPackage> getBandwidthPackage() {
            return this.bandwidthPackage;
        }

    }

}
