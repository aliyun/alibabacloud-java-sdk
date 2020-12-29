// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeHaVipsResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("HaVips")
    public DescribeHaVipsResponseBodyHaVips haVips;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    public static DescribeHaVipsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeHaVipsResponseBody self = new DescribeHaVipsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeHaVipsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeHaVipsResponseBody setHaVips(DescribeHaVipsResponseBodyHaVips haVips) {
        this.haVips = haVips;
        return this;
    }
    public DescribeHaVipsResponseBodyHaVips getHaVips() {
        return this.haVips;
    }

    public DescribeHaVipsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeHaVipsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeHaVipsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public static class DescribeHaVipsResponseBodyHaVipsHaVipAssociatedInstances extends TeaModel {
        @NameInMap("associatedInstance")
        public java.util.List<String> associatedInstance;

        public static DescribeHaVipsResponseBodyHaVipsHaVipAssociatedInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeHaVipsResponseBodyHaVipsHaVipAssociatedInstances self = new DescribeHaVipsResponseBodyHaVipsHaVipAssociatedInstances();
            return TeaModel.build(map, self);
        }

        public DescribeHaVipsResponseBodyHaVipsHaVipAssociatedInstances setAssociatedInstance(java.util.List<String> associatedInstance) {
            this.associatedInstance = associatedInstance;
            return this;
        }
        public java.util.List<String> getAssociatedInstance() {
            return this.associatedInstance;
        }

    }

    public static class DescribeHaVipsResponseBodyHaVipsHaVipAssociatedEipAddresses extends TeaModel {
        @NameInMap("associatedEipAddresse")
        public java.util.List<String> associatedEipAddresse;

        public static DescribeHaVipsResponseBodyHaVipsHaVipAssociatedEipAddresses build(java.util.Map<String, ?> map) throws Exception {
            DescribeHaVipsResponseBodyHaVipsHaVipAssociatedEipAddresses self = new DescribeHaVipsResponseBodyHaVipsHaVipAssociatedEipAddresses();
            return TeaModel.build(map, self);
        }

        public DescribeHaVipsResponseBodyHaVipsHaVipAssociatedEipAddresses setAssociatedEipAddresse(java.util.List<String> associatedEipAddresse) {
            this.associatedEipAddresse = associatedEipAddresse;
            return this;
        }
        public java.util.List<String> getAssociatedEipAddresse() {
            return this.associatedEipAddresse;
        }

    }

    public static class DescribeHaVipsResponseBodyHaVipsHaVip extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("VSwitchId")
        public String vSwitchId;

        @NameInMap("IpAddress")
        public String ipAddress;

        @NameInMap("Description")
        public String description;

        @NameInMap("HaVipId")
        public String haVipId;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("AssociatedInstances")
        public DescribeHaVipsResponseBodyHaVipsHaVipAssociatedInstances associatedInstances;

        @NameInMap("MasterInstanceId")
        public String masterInstanceId;

        @NameInMap("AssociatedEipAddresses")
        public DescribeHaVipsResponseBodyHaVipsHaVipAssociatedEipAddresses associatedEipAddresses;

        @NameInMap("RegionId")
        public String regionId;

        public static DescribeHaVipsResponseBodyHaVipsHaVip build(java.util.Map<String, ?> map) throws Exception {
            DescribeHaVipsResponseBodyHaVipsHaVip self = new DescribeHaVipsResponseBodyHaVipsHaVip();
            return TeaModel.build(map, self);
        }

        public DescribeHaVipsResponseBodyHaVipsHaVip setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeHaVipsResponseBodyHaVipsHaVip setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeHaVipsResponseBodyHaVipsHaVip setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeHaVipsResponseBodyHaVipsHaVip setIpAddress(String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public String getIpAddress() {
            return this.ipAddress;
        }

        public DescribeHaVipsResponseBodyHaVipsHaVip setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeHaVipsResponseBodyHaVipsHaVip setHaVipId(String haVipId) {
            this.haVipId = haVipId;
            return this;
        }
        public String getHaVipId() {
            return this.haVipId;
        }

        public DescribeHaVipsResponseBodyHaVipsHaVip setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeHaVipsResponseBodyHaVipsHaVip setAssociatedInstances(DescribeHaVipsResponseBodyHaVipsHaVipAssociatedInstances associatedInstances) {
            this.associatedInstances = associatedInstances;
            return this;
        }
        public DescribeHaVipsResponseBodyHaVipsHaVipAssociatedInstances getAssociatedInstances() {
            return this.associatedInstances;
        }

        public DescribeHaVipsResponseBodyHaVipsHaVip setMasterInstanceId(String masterInstanceId) {
            this.masterInstanceId = masterInstanceId;
            return this;
        }
        public String getMasterInstanceId() {
            return this.masterInstanceId;
        }

        public DescribeHaVipsResponseBodyHaVipsHaVip setAssociatedEipAddresses(DescribeHaVipsResponseBodyHaVipsHaVipAssociatedEipAddresses associatedEipAddresses) {
            this.associatedEipAddresses = associatedEipAddresses;
            return this;
        }
        public DescribeHaVipsResponseBodyHaVipsHaVipAssociatedEipAddresses getAssociatedEipAddresses() {
            return this.associatedEipAddresses;
        }

        public DescribeHaVipsResponseBodyHaVipsHaVip setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

    public static class DescribeHaVipsResponseBodyHaVips extends TeaModel {
        @NameInMap("HaVip")
        public java.util.List<DescribeHaVipsResponseBodyHaVipsHaVip> haVip;

        public static DescribeHaVipsResponseBodyHaVips build(java.util.Map<String, ?> map) throws Exception {
            DescribeHaVipsResponseBodyHaVips self = new DescribeHaVipsResponseBodyHaVips();
            return TeaModel.build(map, self);
        }

        public DescribeHaVipsResponseBodyHaVips setHaVip(java.util.List<DescribeHaVipsResponseBodyHaVipsHaVip> haVip) {
            this.haVip = haVip;
            return this;
        }
        public java.util.List<DescribeHaVipsResponseBodyHaVipsHaVip> getHaVip() {
            return this.haVip;
        }

    }

}
