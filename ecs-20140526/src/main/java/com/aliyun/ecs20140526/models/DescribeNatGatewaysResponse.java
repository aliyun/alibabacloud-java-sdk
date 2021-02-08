// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeNatGatewaysResponse extends TeaModel {
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

    @NameInMap("NatGateways")
    @Validation(required = true)
    public DescribeNatGatewaysResponseNatGateways natGateways;

    public static DescribeNatGatewaysResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeNatGatewaysResponse self = new DescribeNatGatewaysResponse();
        return TeaModel.build(map, self);
    }

    public DescribeNatGatewaysResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeNatGatewaysResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeNatGatewaysResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeNatGatewaysResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeNatGatewaysResponse setNatGateways(DescribeNatGatewaysResponseNatGateways natGateways) {
        this.natGateways = natGateways;
        return this;
    }
    public DescribeNatGatewaysResponseNatGateways getNatGateways() {
        return this.natGateways;
    }

    public static class DescribeNatGatewaysResponseNatGatewaysNatGatewayForwardTableIds extends TeaModel {
        // ForwardTableId
        @NameInMap("ForwardTableId")
        @Validation(required = true)
        public java.util.List<String> forwardTableId;

        public static DescribeNatGatewaysResponseNatGatewaysNatGatewayForwardTableIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeNatGatewaysResponseNatGatewaysNatGatewayForwardTableIds self = new DescribeNatGatewaysResponseNatGatewaysNatGatewayForwardTableIds();
            return TeaModel.build(map, self);
        }

        public DescribeNatGatewaysResponseNatGatewaysNatGatewayForwardTableIds setForwardTableId(java.util.List<String> forwardTableId) {
            this.forwardTableId = forwardTableId;
            return this;
        }
        public java.util.List<String> getForwardTableId() {
            return this.forwardTableId;
        }

    }

    public static class DescribeNatGatewaysResponseNatGatewaysNatGatewayBandwidthPackageIds extends TeaModel {
        // BandwidthPackageId
        @NameInMap("BandwidthPackageId")
        @Validation(required = true)
        public java.util.List<String> bandwidthPackageId;

        public static DescribeNatGatewaysResponseNatGatewaysNatGatewayBandwidthPackageIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeNatGatewaysResponseNatGatewaysNatGatewayBandwidthPackageIds self = new DescribeNatGatewaysResponseNatGatewaysNatGatewayBandwidthPackageIds();
            return TeaModel.build(map, self);
        }

        public DescribeNatGatewaysResponseNatGatewaysNatGatewayBandwidthPackageIds setBandwidthPackageId(java.util.List<String> bandwidthPackageId) {
            this.bandwidthPackageId = bandwidthPackageId;
            return this;
        }
        public java.util.List<String> getBandwidthPackageId() {
            return this.bandwidthPackageId;
        }

    }

    public static class DescribeNatGatewaysResponseNatGatewaysNatGateway extends TeaModel {
        @NameInMap("NatGatewayId")
        @Validation(required = true)
        public String natGatewayId;

        @NameInMap("RegionId")
        @Validation(required = true)
        public String regionId;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("VpcId")
        @Validation(required = true)
        public String vpcId;

        @NameInMap("Spec")
        @Validation(required = true)
        public String spec;

        @NameInMap("InstanceChargeType")
        @Validation(required = true)
        public String instanceChargeType;

        @NameInMap("BusinessStatus")
        @Validation(required = true)
        public String businessStatus;

        @NameInMap("CreationTime")
        @Validation(required = true)
        public String creationTime;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("ForwardTableIds")
        @Validation(required = true)
        public DescribeNatGatewaysResponseNatGatewaysNatGatewayForwardTableIds forwardTableIds;

        @NameInMap("BandwidthPackageIds")
        @Validation(required = true)
        public DescribeNatGatewaysResponseNatGatewaysNatGatewayBandwidthPackageIds bandwidthPackageIds;

        public static DescribeNatGatewaysResponseNatGatewaysNatGateway build(java.util.Map<String, ?> map) throws Exception {
            DescribeNatGatewaysResponseNatGatewaysNatGateway self = new DescribeNatGatewaysResponseNatGatewaysNatGateway();
            return TeaModel.build(map, self);
        }

        public DescribeNatGatewaysResponseNatGatewaysNatGateway setNatGatewayId(String natGatewayId) {
            this.natGatewayId = natGatewayId;
            return this;
        }
        public String getNatGatewayId() {
            return this.natGatewayId;
        }

        public DescribeNatGatewaysResponseNatGatewaysNatGateway setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeNatGatewaysResponseNatGatewaysNatGateway setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeNatGatewaysResponseNatGatewaysNatGateway setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeNatGatewaysResponseNatGatewaysNatGateway setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeNatGatewaysResponseNatGatewaysNatGateway setSpec(String spec) {
            this.spec = spec;
            return this;
        }
        public String getSpec() {
            return this.spec;
        }

        public DescribeNatGatewaysResponseNatGatewaysNatGateway setInstanceChargeType(String instanceChargeType) {
            this.instanceChargeType = instanceChargeType;
            return this;
        }
        public String getInstanceChargeType() {
            return this.instanceChargeType;
        }

        public DescribeNatGatewaysResponseNatGatewaysNatGateway setBusinessStatus(String businessStatus) {
            this.businessStatus = businessStatus;
            return this;
        }
        public String getBusinessStatus() {
            return this.businessStatus;
        }

        public DescribeNatGatewaysResponseNatGatewaysNatGateway setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeNatGatewaysResponseNatGatewaysNatGateway setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeNatGatewaysResponseNatGatewaysNatGateway setForwardTableIds(DescribeNatGatewaysResponseNatGatewaysNatGatewayForwardTableIds forwardTableIds) {
            this.forwardTableIds = forwardTableIds;
            return this;
        }
        public DescribeNatGatewaysResponseNatGatewaysNatGatewayForwardTableIds getForwardTableIds() {
            return this.forwardTableIds;
        }

        public DescribeNatGatewaysResponseNatGatewaysNatGateway setBandwidthPackageIds(DescribeNatGatewaysResponseNatGatewaysNatGatewayBandwidthPackageIds bandwidthPackageIds) {
            this.bandwidthPackageIds = bandwidthPackageIds;
            return this;
        }
        public DescribeNatGatewaysResponseNatGatewaysNatGatewayBandwidthPackageIds getBandwidthPackageIds() {
            return this.bandwidthPackageIds;
        }

    }

    public static class DescribeNatGatewaysResponseNatGateways extends TeaModel {
        @NameInMap("NatGateway")
        @Validation(required = true)
        public java.util.List<DescribeNatGatewaysResponseNatGatewaysNatGateway> natGateway;

        public static DescribeNatGatewaysResponseNatGateways build(java.util.Map<String, ?> map) throws Exception {
            DescribeNatGatewaysResponseNatGateways self = new DescribeNatGatewaysResponseNatGateways();
            return TeaModel.build(map, self);
        }

        public DescribeNatGatewaysResponseNatGateways setNatGateway(java.util.List<DescribeNatGatewaysResponseNatGatewaysNatGateway> natGateway) {
            this.natGateway = natGateway;
            return this;
        }
        public java.util.List<DescribeNatGatewaysResponseNatGatewaysNatGateway> getNatGateway() {
            return this.natGateway;
        }

    }

}
