// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeVpcsResponseBody extends TeaModel {
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("Vpcs")
    public DescribeVpcsResponseBodyVpcs vpcs;

    public static DescribeVpcsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVpcsResponseBody self = new DescribeVpcsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVpcsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeVpcsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVpcsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeVpcsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeVpcsResponseBody setVpcs(DescribeVpcsResponseBodyVpcs vpcs) {
        this.vpcs = vpcs;
        return this;
    }
    public DescribeVpcsResponseBodyVpcs getVpcs() {
        return this.vpcs;
    }

    public static class DescribeVpcsResponseBodyVpcsVpcVSwitchIds extends TeaModel {
        @NameInMap("VSwitchId")
        public java.util.List<String> vSwitchId;

        public static DescribeVpcsResponseBodyVpcsVpcVSwitchIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpcsResponseBodyVpcsVpcVSwitchIds self = new DescribeVpcsResponseBodyVpcsVpcVSwitchIds();
            return TeaModel.build(map, self);
        }

        public DescribeVpcsResponseBodyVpcsVpcVSwitchIds setVSwitchId(java.util.List<String> vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public java.util.List<String> getVSwitchId() {
            return this.vSwitchId;
        }

    }

    public static class DescribeVpcsResponseBodyVpcsVpcUserCidrs extends TeaModel {
        @NameInMap("UserCidr")
        public java.util.List<String> userCidr;

        public static DescribeVpcsResponseBodyVpcsVpcUserCidrs build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpcsResponseBodyVpcsVpcUserCidrs self = new DescribeVpcsResponseBodyVpcsVpcUserCidrs();
            return TeaModel.build(map, self);
        }

        public DescribeVpcsResponseBodyVpcsVpcUserCidrs setUserCidr(java.util.List<String> userCidr) {
            this.userCidr = userCidr;
            return this;
        }
        public java.util.List<String> getUserCidr() {
            return this.userCidr;
        }

    }

    public static class DescribeVpcsResponseBodyVpcsVpc extends TeaModel {
        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("VpcName")
        public String vpcName;

        @NameInMap("Status")
        public String status;

        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("VRouterId")
        public String VRouterId;

        @NameInMap("IsDefault")
        public Boolean isDefault;

        @NameInMap("CidrBlock")
        public String cidrBlock;

        @NameInMap("Description")
        public String description;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("VSwitchIds")
        public DescribeVpcsResponseBodyVpcsVpcVSwitchIds vSwitchIds;

        @NameInMap("UserCidrs")
        public DescribeVpcsResponseBodyVpcsVpcUserCidrs userCidrs;

        public static DescribeVpcsResponseBodyVpcsVpc build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpcsResponseBodyVpcsVpc self = new DescribeVpcsResponseBodyVpcsVpc();
            return TeaModel.build(map, self);
        }

        public DescribeVpcsResponseBodyVpcsVpc setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeVpcsResponseBodyVpcsVpc setVpcName(String vpcName) {
            this.vpcName = vpcName;
            return this;
        }
        public String getVpcName() {
            return this.vpcName;
        }

        public DescribeVpcsResponseBodyVpcsVpc setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeVpcsResponseBodyVpcsVpc setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeVpcsResponseBodyVpcsVpc setVRouterId(String VRouterId) {
            this.VRouterId = VRouterId;
            return this;
        }
        public String getVRouterId() {
            return this.VRouterId;
        }

        public DescribeVpcsResponseBodyVpcsVpc setIsDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        public DescribeVpcsResponseBodyVpcsVpc setCidrBlock(String cidrBlock) {
            this.cidrBlock = cidrBlock;
            return this;
        }
        public String getCidrBlock() {
            return this.cidrBlock;
        }

        public DescribeVpcsResponseBodyVpcsVpc setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeVpcsResponseBodyVpcsVpc setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeVpcsResponseBodyVpcsVpc setVSwitchIds(DescribeVpcsResponseBodyVpcsVpcVSwitchIds vSwitchIds) {
            this.vSwitchIds = vSwitchIds;
            return this;
        }
        public DescribeVpcsResponseBodyVpcsVpcVSwitchIds getVSwitchIds() {
            return this.vSwitchIds;
        }

        public DescribeVpcsResponseBodyVpcsVpc setUserCidrs(DescribeVpcsResponseBodyVpcsVpcUserCidrs userCidrs) {
            this.userCidrs = userCidrs;
            return this;
        }
        public DescribeVpcsResponseBodyVpcsVpcUserCidrs getUserCidrs() {
            return this.userCidrs;
        }

    }

    public static class DescribeVpcsResponseBodyVpcs extends TeaModel {
        @NameInMap("Vpc")
        public java.util.List<DescribeVpcsResponseBodyVpcsVpc> vpc;

        public static DescribeVpcsResponseBodyVpcs build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpcsResponseBodyVpcs self = new DescribeVpcsResponseBodyVpcs();
            return TeaModel.build(map, self);
        }

        public DescribeVpcsResponseBodyVpcs setVpc(java.util.List<DescribeVpcsResponseBodyVpcsVpc> vpc) {
            this.vpc = vpc;
            return this;
        }
        public java.util.List<DescribeVpcsResponseBodyVpcsVpc> getVpc() {
            return this.vpc;
        }

    }

}
