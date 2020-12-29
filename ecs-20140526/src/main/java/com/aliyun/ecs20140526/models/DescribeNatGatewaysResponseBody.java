// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeNatGatewaysResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("NatGateways")
    public DescribeNatGatewaysResponseBodyNatGateways natGateways;

    public static DescribeNatGatewaysResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeNatGatewaysResponseBody self = new DescribeNatGatewaysResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeNatGatewaysResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeNatGatewaysResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeNatGatewaysResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeNatGatewaysResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeNatGatewaysResponseBody setNatGateways(DescribeNatGatewaysResponseBodyNatGateways natGateways) {
        this.natGateways = natGateways;
        return this;
    }
    public DescribeNatGatewaysResponseBodyNatGateways getNatGateways() {
        return this.natGateways;
    }

    public static class DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayBandwidthPackageIds extends TeaModel {
        @NameInMap("BandwidthPackageId")
        public java.util.List<String> bandwidthPackageId;

        public static DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayBandwidthPackageIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayBandwidthPackageIds self = new DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayBandwidthPackageIds();
            return TeaModel.build(map, self);
        }

        public DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayBandwidthPackageIds setBandwidthPackageId(java.util.List<String> bandwidthPackageId) {
            this.bandwidthPackageId = bandwidthPackageId;
            return this;
        }
        public java.util.List<String> getBandwidthPackageId() {
            return this.bandwidthPackageId;
        }

    }

    public static class DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayForwardTableIds extends TeaModel {
        @NameInMap("ForwardTableId")
        public java.util.List<String> forwardTableId;

        public static DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayForwardTableIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayForwardTableIds self = new DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayForwardTableIds();
            return TeaModel.build(map, self);
        }

        public DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayForwardTableIds setForwardTableId(java.util.List<String> forwardTableId) {
            this.forwardTableId = forwardTableId;
            return this;
        }
        public java.util.List<String> getForwardTableId() {
            return this.forwardTableId;
        }

    }

    public static class DescribeNatGatewaysResponseBodyNatGatewaysNatGateway extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("BandwidthPackageIds")
        public DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayBandwidthPackageIds bandwidthPackageIds;

        @NameInMap("Spec")
        public String spec;

        @NameInMap("InstanceChargeType")
        public String instanceChargeType;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("Description")
        public String description;

        @NameInMap("NatGatewayId")
        public String natGatewayId;

        @NameInMap("ForwardTableIds")
        public DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayForwardTableIds forwardTableIds;

        @NameInMap("BusinessStatus")
        public String businessStatus;

        @NameInMap("Name")
        public String name;

        public static DescribeNatGatewaysResponseBodyNatGatewaysNatGateway build(java.util.Map<String, ?> map) throws Exception {
            DescribeNatGatewaysResponseBodyNatGatewaysNatGateway self = new DescribeNatGatewaysResponseBodyNatGatewaysNatGateway();
            return TeaModel.build(map, self);
        }

        public DescribeNatGatewaysResponseBodyNatGatewaysNatGateway setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeNatGatewaysResponseBodyNatGatewaysNatGateway setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeNatGatewaysResponseBodyNatGatewaysNatGateway setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeNatGatewaysResponseBodyNatGatewaysNatGateway setBandwidthPackageIds(DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayBandwidthPackageIds bandwidthPackageIds) {
            this.bandwidthPackageIds = bandwidthPackageIds;
            return this;
        }
        public DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayBandwidthPackageIds getBandwidthPackageIds() {
            return this.bandwidthPackageIds;
        }

        public DescribeNatGatewaysResponseBodyNatGatewaysNatGateway setSpec(String spec) {
            this.spec = spec;
            return this;
        }
        public String getSpec() {
            return this.spec;
        }

        public DescribeNatGatewaysResponseBodyNatGatewaysNatGateway setInstanceChargeType(String instanceChargeType) {
            this.instanceChargeType = instanceChargeType;
            return this;
        }
        public String getInstanceChargeType() {
            return this.instanceChargeType;
        }

        public DescribeNatGatewaysResponseBodyNatGatewaysNatGateway setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeNatGatewaysResponseBodyNatGatewaysNatGateway setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeNatGatewaysResponseBodyNatGatewaysNatGateway setNatGatewayId(String natGatewayId) {
            this.natGatewayId = natGatewayId;
            return this;
        }
        public String getNatGatewayId() {
            return this.natGatewayId;
        }

        public DescribeNatGatewaysResponseBodyNatGatewaysNatGateway setForwardTableIds(DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayForwardTableIds forwardTableIds) {
            this.forwardTableIds = forwardTableIds;
            return this;
        }
        public DescribeNatGatewaysResponseBodyNatGatewaysNatGatewayForwardTableIds getForwardTableIds() {
            return this.forwardTableIds;
        }

        public DescribeNatGatewaysResponseBodyNatGatewaysNatGateway setBusinessStatus(String businessStatus) {
            this.businessStatus = businessStatus;
            return this;
        }
        public String getBusinessStatus() {
            return this.businessStatus;
        }

        public DescribeNatGatewaysResponseBodyNatGatewaysNatGateway setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeNatGatewaysResponseBodyNatGateways extends TeaModel {
        @NameInMap("NatGateway")
        public java.util.List<DescribeNatGatewaysResponseBodyNatGatewaysNatGateway> natGateway;

        public static DescribeNatGatewaysResponseBodyNatGateways build(java.util.Map<String, ?> map) throws Exception {
            DescribeNatGatewaysResponseBodyNatGateways self = new DescribeNatGatewaysResponseBodyNatGateways();
            return TeaModel.build(map, self);
        }

        public DescribeNatGatewaysResponseBodyNatGateways setNatGateway(java.util.List<DescribeNatGatewaysResponseBodyNatGatewaysNatGateway> natGateway) {
            this.natGateway = natGateway;
            return this;
        }
        public java.util.List<DescribeNatGatewaysResponseBodyNatGatewaysNatGateway> getNatGateway() {
            return this.natGateway;
        }

    }

}
