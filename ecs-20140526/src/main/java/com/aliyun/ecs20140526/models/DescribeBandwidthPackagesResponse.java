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

    }

    public static class DescribeBandwidthPackagesResponseBandwidthPackagesBandwidthPackagePublicIpAddresses extends TeaModel {
        @NameInMap("PublicIpAddresse")
        @Validation(required = true)
        public java.util.List<DescribeBandwidthPackagesResponseBandwidthPackagesBandwidthPackagePublicIpAddressesPublicIpAddresse> publicIpAddresse;

        public static DescribeBandwidthPackagesResponseBandwidthPackagesBandwidthPackagePublicIpAddresses build(java.util.Map<String, ?> map) throws Exception {
            DescribeBandwidthPackagesResponseBandwidthPackagesBandwidthPackagePublicIpAddresses self = new DescribeBandwidthPackagesResponseBandwidthPackagesBandwidthPackagePublicIpAddresses();
            return TeaModel.build(map, self);
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

    }

    public static class DescribeBandwidthPackagesResponseBandwidthPackages extends TeaModel {
        @NameInMap("BandwidthPackage")
        @Validation(required = true)
        public java.util.List<DescribeBandwidthPackagesResponseBandwidthPackagesBandwidthPackage> bandwidthPackage;

        public static DescribeBandwidthPackagesResponseBandwidthPackages build(java.util.Map<String, ?> map) throws Exception {
            DescribeBandwidthPackagesResponseBandwidthPackages self = new DescribeBandwidthPackagesResponseBandwidthPackages();
            return TeaModel.build(map, self);
        }

    }

}
