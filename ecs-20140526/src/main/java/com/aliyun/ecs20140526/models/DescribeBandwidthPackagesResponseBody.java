// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeBandwidthPackagesResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("BandwidthPackages")
    public java.util.List<DescribeBandwidthPackagesResponseBodyBandwidthPackages> bandwidthPackages;

    public static DescribeBandwidthPackagesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBandwidthPackagesResponseBody self = new DescribeBandwidthPackagesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBandwidthPackagesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
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

    public DescribeBandwidthPackagesResponseBody setBandwidthPackages(java.util.List<DescribeBandwidthPackagesResponseBodyBandwidthPackages> bandwidthPackages) {
        this.bandwidthPackages = bandwidthPackages;
        return this;
    }
    public java.util.List<DescribeBandwidthPackagesResponseBodyBandwidthPackages> getBandwidthPackages() {
        return this.bandwidthPackages;
    }

    public static class DescribeBandwidthPackagesResponseBodyBandwidthPackagesPublicIpAddresses extends TeaModel {
        @NameInMap("IpAddress")
        public String ipAddress;

        @NameInMap("AllocationId")
        public String allocationId;

        public static DescribeBandwidthPackagesResponseBodyBandwidthPackagesPublicIpAddresses build(java.util.Map<String, ?> map) throws Exception {
            DescribeBandwidthPackagesResponseBodyBandwidthPackagesPublicIpAddresses self = new DescribeBandwidthPackagesResponseBodyBandwidthPackagesPublicIpAddresses();
            return TeaModel.build(map, self);
        }

        public DescribeBandwidthPackagesResponseBodyBandwidthPackagesPublicIpAddresses setIpAddress(String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public String getIpAddress() {
            return this.ipAddress;
        }

        public DescribeBandwidthPackagesResponseBodyBandwidthPackagesPublicIpAddresses setAllocationId(String allocationId) {
            this.allocationId = allocationId;
            return this;
        }
        public String getAllocationId() {
            return this.allocationId;
        }

    }

    public static class DescribeBandwidthPackagesResponseBodyBandwidthPackages extends TeaModel {
        @NameInMap("PublicIpAddresses")
        public java.util.List<DescribeBandwidthPackagesResponseBodyBandwidthPackagesPublicIpAddresses> publicIpAddresses;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("Status")
        public String status;

        @NameInMap("IpCount")
        public String ipCount;

        @NameInMap("InstanceChargeType")
        public String instanceChargeType;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("BandwidthPackageId")
        public String bandwidthPackageId;

        @NameInMap("Bandwidth")
        public String bandwidth;

        @NameInMap("Description")
        public String description;

        @NameInMap("NatGatewayId")
        public String natGatewayId;

        @NameInMap("InternetChargeType")
        public String internetChargeType;

        @NameInMap("ZoneId")
        public String zoneId;

        @NameInMap("BusinessStatus")
        public String businessStatus;

        @NameInMap("Name")
        public String name;

        @NameInMap("ISP")
        public String ISP;

        public static DescribeBandwidthPackagesResponseBodyBandwidthPackages build(java.util.Map<String, ?> map) throws Exception {
            DescribeBandwidthPackagesResponseBodyBandwidthPackages self = new DescribeBandwidthPackagesResponseBodyBandwidthPackages();
            return TeaModel.build(map, self);
        }

        public DescribeBandwidthPackagesResponseBodyBandwidthPackages setPublicIpAddresses(java.util.List<DescribeBandwidthPackagesResponseBodyBandwidthPackagesPublicIpAddresses> publicIpAddresses) {
            this.publicIpAddresses = publicIpAddresses;
            return this;
        }
        public java.util.List<DescribeBandwidthPackagesResponseBodyBandwidthPackagesPublicIpAddresses> getPublicIpAddresses() {
            return this.publicIpAddresses;
        }

        public DescribeBandwidthPackagesResponseBodyBandwidthPackages setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeBandwidthPackagesResponseBodyBandwidthPackages setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeBandwidthPackagesResponseBodyBandwidthPackages setIpCount(String ipCount) {
            this.ipCount = ipCount;
            return this;
        }
        public String getIpCount() {
            return this.ipCount;
        }

        public DescribeBandwidthPackagesResponseBodyBandwidthPackages setInstanceChargeType(String instanceChargeType) {
            this.instanceChargeType = instanceChargeType;
            return this;
        }
        public String getInstanceChargeType() {
            return this.instanceChargeType;
        }

        public DescribeBandwidthPackagesResponseBodyBandwidthPackages setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeBandwidthPackagesResponseBodyBandwidthPackages setBandwidthPackageId(String bandwidthPackageId) {
            this.bandwidthPackageId = bandwidthPackageId;
            return this;
        }
        public String getBandwidthPackageId() {
            return this.bandwidthPackageId;
        }

        public DescribeBandwidthPackagesResponseBodyBandwidthPackages setBandwidth(String bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public String getBandwidth() {
            return this.bandwidth;
        }

        public DescribeBandwidthPackagesResponseBodyBandwidthPackages setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeBandwidthPackagesResponseBodyBandwidthPackages setNatGatewayId(String natGatewayId) {
            this.natGatewayId = natGatewayId;
            return this;
        }
        public String getNatGatewayId() {
            return this.natGatewayId;
        }

        public DescribeBandwidthPackagesResponseBodyBandwidthPackages setInternetChargeType(String internetChargeType) {
            this.internetChargeType = internetChargeType;
            return this;
        }
        public String getInternetChargeType() {
            return this.internetChargeType;
        }

        public DescribeBandwidthPackagesResponseBodyBandwidthPackages setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public DescribeBandwidthPackagesResponseBodyBandwidthPackages setBusinessStatus(String businessStatus) {
            this.businessStatus = businessStatus;
            return this;
        }
        public String getBusinessStatus() {
            return this.businessStatus;
        }

        public DescribeBandwidthPackagesResponseBodyBandwidthPackages setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeBandwidthPackagesResponseBodyBandwidthPackages setISP(String ISP) {
            this.ISP = ISP;
            return this;
        }
        public String getISP() {
            return this.ISP;
        }

    }

}
