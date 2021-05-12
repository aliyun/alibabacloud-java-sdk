// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class ListAlicloudVPCResponseBody extends TeaModel {
    @NameInMap("data")
    public ListAlicloudVPCResponseBodyData data;

    @NameInMap("success")
    public Boolean success;

    public static ListAlicloudVPCResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAlicloudVPCResponseBody self = new ListAlicloudVPCResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAlicloudVPCResponseBody setData(ListAlicloudVPCResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListAlicloudVPCResponseBodyData getData() {
        return this.data;
    }

    public ListAlicloudVPCResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListAlicloudVPCResponseBodyDataVpcsVpcUserCidrs extends TeaModel {
        @NameInMap("UserCidr")
        public String userCidr;

        public static ListAlicloudVPCResponseBodyDataVpcsVpcUserCidrs build(java.util.Map<String, ?> map) throws Exception {
            ListAlicloudVPCResponseBodyDataVpcsVpcUserCidrs self = new ListAlicloudVPCResponseBodyDataVpcsVpcUserCidrs();
            return TeaModel.build(map, self);
        }

        public ListAlicloudVPCResponseBodyDataVpcsVpcUserCidrs setUserCidr(String userCidr) {
            this.userCidr = userCidr;
            return this;
        }
        public String getUserCidr() {
            return this.userCidr;
        }

    }

    public static class ListAlicloudVPCResponseBodyDataVpcsVpcVSwitchIds extends TeaModel {
        @NameInMap("VSwitchId")
        public java.util.List<String> vSwitchId;

        public static ListAlicloudVPCResponseBodyDataVpcsVpcVSwitchIds build(java.util.Map<String, ?> map) throws Exception {
            ListAlicloudVPCResponseBodyDataVpcsVpcVSwitchIds self = new ListAlicloudVPCResponseBodyDataVpcsVpcVSwitchIds();
            return TeaModel.build(map, self);
        }

        public ListAlicloudVPCResponseBodyDataVpcsVpcVSwitchIds setVSwitchId(java.util.List<String> vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public java.util.List<String> getVSwitchId() {
            return this.vSwitchId;
        }

    }

    public static class ListAlicloudVPCResponseBodyDataVpcsVpc extends TeaModel {
        @NameInMap("CidrBlock")
        public String cidrBlock;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("IsDefault")
        public Boolean isDefault;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("Status")
        public String status;

        @NameInMap("UserCidrs")
        public ListAlicloudVPCResponseBodyDataVpcsVpcUserCidrs userCidrs;

        @NameInMap("VRouterId")
        public String VRouterId;

        @NameInMap("VSwitchIds")
        public ListAlicloudVPCResponseBodyDataVpcsVpcVSwitchIds vSwitchIds;

        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("VpcName")
        public String vpcName;

        public static ListAlicloudVPCResponseBodyDataVpcsVpc build(java.util.Map<String, ?> map) throws Exception {
            ListAlicloudVPCResponseBodyDataVpcsVpc self = new ListAlicloudVPCResponseBodyDataVpcsVpc();
            return TeaModel.build(map, self);
        }

        public ListAlicloudVPCResponseBodyDataVpcsVpc setCidrBlock(String cidrBlock) {
            this.cidrBlock = cidrBlock;
            return this;
        }
        public String getCidrBlock() {
            return this.cidrBlock;
        }

        public ListAlicloudVPCResponseBodyDataVpcsVpc setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public ListAlicloudVPCResponseBodyDataVpcsVpc setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListAlicloudVPCResponseBodyDataVpcsVpc setIsDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        public ListAlicloudVPCResponseBodyDataVpcsVpc setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListAlicloudVPCResponseBodyDataVpcsVpc setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListAlicloudVPCResponseBodyDataVpcsVpc setUserCidrs(ListAlicloudVPCResponseBodyDataVpcsVpcUserCidrs userCidrs) {
            this.userCidrs = userCidrs;
            return this;
        }
        public ListAlicloudVPCResponseBodyDataVpcsVpcUserCidrs getUserCidrs() {
            return this.userCidrs;
        }

        public ListAlicloudVPCResponseBodyDataVpcsVpc setVRouterId(String VRouterId) {
            this.VRouterId = VRouterId;
            return this;
        }
        public String getVRouterId() {
            return this.VRouterId;
        }

        public ListAlicloudVPCResponseBodyDataVpcsVpc setVSwitchIds(ListAlicloudVPCResponseBodyDataVpcsVpcVSwitchIds vSwitchIds) {
            this.vSwitchIds = vSwitchIds;
            return this;
        }
        public ListAlicloudVPCResponseBodyDataVpcsVpcVSwitchIds getVSwitchIds() {
            return this.vSwitchIds;
        }

        public ListAlicloudVPCResponseBodyDataVpcsVpc setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public ListAlicloudVPCResponseBodyDataVpcsVpc setVpcName(String vpcName) {
            this.vpcName = vpcName;
            return this;
        }
        public String getVpcName() {
            return this.vpcName;
        }

    }

    public static class ListAlicloudVPCResponseBodyDataVpcs extends TeaModel {
        @NameInMap("Vpc")
        public java.util.List<ListAlicloudVPCResponseBodyDataVpcsVpc> vpc;

        public static ListAlicloudVPCResponseBodyDataVpcs build(java.util.Map<String, ?> map) throws Exception {
            ListAlicloudVPCResponseBodyDataVpcs self = new ListAlicloudVPCResponseBodyDataVpcs();
            return TeaModel.build(map, self);
        }

        public ListAlicloudVPCResponseBodyDataVpcs setVpc(java.util.List<ListAlicloudVPCResponseBodyDataVpcsVpc> vpc) {
            this.vpc = vpc;
            return this;
        }
        public java.util.List<ListAlicloudVPCResponseBodyDataVpcsVpc> getVpc() {
            return this.vpc;
        }

    }

    public static class ListAlicloudVPCResponseBodyData extends TeaModel {
        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("RequestId")
        public String requestId;

        @NameInMap("TotalCount")
        public Integer totalCount;

        @NameInMap("Vpcs")
        public ListAlicloudVPCResponseBodyDataVpcs vpcs;

        public static ListAlicloudVPCResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListAlicloudVPCResponseBodyData self = new ListAlicloudVPCResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListAlicloudVPCResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListAlicloudVPCResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListAlicloudVPCResponseBodyData setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public ListAlicloudVPCResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public ListAlicloudVPCResponseBodyData setVpcs(ListAlicloudVPCResponseBodyDataVpcs vpcs) {
            this.vpcs = vpcs;
            return this;
        }
        public ListAlicloudVPCResponseBodyDataVpcs getVpcs() {
            return this.vpcs;
        }

    }

}
