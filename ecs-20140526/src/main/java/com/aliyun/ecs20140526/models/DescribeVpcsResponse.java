// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeVpcsResponse extends TeaModel {
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

    @NameInMap("Vpcs")
    @Validation(required = true)
    public DescribeVpcsResponseVpcs vpcs;

    public static DescribeVpcsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVpcsResponse self = new DescribeVpcsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVpcsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVpcsResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeVpcsResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeVpcsResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeVpcsResponse setVpcs(DescribeVpcsResponseVpcs vpcs) {
        this.vpcs = vpcs;
        return this;
    }
    public DescribeVpcsResponseVpcs getVpcs() {
        return this.vpcs;
    }

    public static class DescribeVpcsResponseVpcsVpcVSwitchIds extends TeaModel {
        // VSwitchId
        @NameInMap("VSwitchId")
        @Validation(required = true)
        public java.util.List<String> vSwitchId;

        public static DescribeVpcsResponseVpcsVpcVSwitchIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpcsResponseVpcsVpcVSwitchIds self = new DescribeVpcsResponseVpcsVpcVSwitchIds();
            return TeaModel.build(map, self);
        }

        public DescribeVpcsResponseVpcsVpcVSwitchIds setVSwitchId(java.util.List<String> vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public java.util.List<String> getVSwitchId() {
            return this.vSwitchId;
        }

    }

    public static class DescribeVpcsResponseVpcsVpcUserCidrs extends TeaModel {
        // UserCidr
        @NameInMap("UserCidr")
        @Validation(required = true)
        public java.util.List<String> userCidr;

        public static DescribeVpcsResponseVpcsVpcUserCidrs build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpcsResponseVpcsVpcUserCidrs self = new DescribeVpcsResponseVpcsVpcUserCidrs();
            return TeaModel.build(map, self);
        }

        public DescribeVpcsResponseVpcsVpcUserCidrs setUserCidr(java.util.List<String> userCidr) {
            this.userCidr = userCidr;
            return this;
        }
        public java.util.List<String> getUserCidr() {
            return this.userCidr;
        }

    }

    public static class DescribeVpcsResponseVpcsVpc extends TeaModel {
        @NameInMap("VpcId")
        @Validation(required = true)
        public String vpcId;

        @NameInMap("RegionId")
        @Validation(required = true)
        public String regionId;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("VpcName")
        @Validation(required = true)
        public String vpcName;

        @NameInMap("CreationTime")
        @Validation(required = true)
        public String creationTime;

        @NameInMap("CidrBlock")
        @Validation(required = true)
        public String cidrBlock;

        @NameInMap("VRouterId")
        @Validation(required = true)
        public String VRouterId;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("IsDefault")
        @Validation(required = true)
        public Boolean isDefault;

        @NameInMap("VSwitchIds")
        @Validation(required = true)
        public DescribeVpcsResponseVpcsVpcVSwitchIds vSwitchIds;

        @NameInMap("UserCidrs")
        @Validation(required = true)
        public DescribeVpcsResponseVpcsVpcUserCidrs userCidrs;

        public static DescribeVpcsResponseVpcsVpc build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpcsResponseVpcsVpc self = new DescribeVpcsResponseVpcsVpc();
            return TeaModel.build(map, self);
        }

        public DescribeVpcsResponseVpcsVpc setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeVpcsResponseVpcsVpc setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeVpcsResponseVpcsVpc setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeVpcsResponseVpcsVpc setVpcName(String vpcName) {
            this.vpcName = vpcName;
            return this;
        }
        public String getVpcName() {
            return this.vpcName;
        }

        public DescribeVpcsResponseVpcsVpc setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeVpcsResponseVpcsVpc setCidrBlock(String cidrBlock) {
            this.cidrBlock = cidrBlock;
            return this;
        }
        public String getCidrBlock() {
            return this.cidrBlock;
        }

        public DescribeVpcsResponseVpcsVpc setVRouterId(String VRouterId) {
            this.VRouterId = VRouterId;
            return this;
        }
        public String getVRouterId() {
            return this.VRouterId;
        }

        public DescribeVpcsResponseVpcsVpc setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeVpcsResponseVpcsVpc setIsDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        public DescribeVpcsResponseVpcsVpc setVSwitchIds(DescribeVpcsResponseVpcsVpcVSwitchIds vSwitchIds) {
            this.vSwitchIds = vSwitchIds;
            return this;
        }
        public DescribeVpcsResponseVpcsVpcVSwitchIds getVSwitchIds() {
            return this.vSwitchIds;
        }

        public DescribeVpcsResponseVpcsVpc setUserCidrs(DescribeVpcsResponseVpcsVpcUserCidrs userCidrs) {
            this.userCidrs = userCidrs;
            return this;
        }
        public DescribeVpcsResponseVpcsVpcUserCidrs getUserCidrs() {
            return this.userCidrs;
        }

    }

    public static class DescribeVpcsResponseVpcs extends TeaModel {
        @NameInMap("Vpc")
        @Validation(required = true)
        public java.util.List<DescribeVpcsResponseVpcsVpc> vpc;

        public static DescribeVpcsResponseVpcs build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpcsResponseVpcs self = new DescribeVpcsResponseVpcs();
            return TeaModel.build(map, self);
        }

        public DescribeVpcsResponseVpcs setVpc(java.util.List<DescribeVpcsResponseVpcsVpc> vpc) {
            this.vpc = vpc;
            return this;
        }
        public java.util.List<DescribeVpcsResponseVpcsVpc> getVpc() {
            return this.vpc;
        }

    }

}
