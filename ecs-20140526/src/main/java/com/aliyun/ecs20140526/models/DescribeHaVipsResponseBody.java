// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeHaVipsResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("HaVips")
    public java.util.List<DescribeHaVipsResponseBodyHaVips> haVips;

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

    public DescribeHaVipsResponseBody setHaVips(java.util.List<DescribeHaVipsResponseBodyHaVips> haVips) {
        this.haVips = haVips;
        return this;
    }
    public java.util.List<DescribeHaVipsResponseBodyHaVips> getHaVips() {
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

    public static class DescribeHaVipsResponseBodyHaVips extends TeaModel {
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
        public java.util.List<String> associatedInstances;

        @NameInMap("MasterInstanceId")
        public String masterInstanceId;

        @NameInMap("AssociatedEipAddresses")
        public java.util.List<String> associatedEipAddresses;

        @NameInMap("RegionId")
        public String regionId;

        public static DescribeHaVipsResponseBodyHaVips build(java.util.Map<String, ?> map) throws Exception {
            DescribeHaVipsResponseBodyHaVips self = new DescribeHaVipsResponseBodyHaVips();
            return TeaModel.build(map, self);
        }

        public DescribeHaVipsResponseBodyHaVips setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeHaVipsResponseBodyHaVips setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeHaVipsResponseBodyHaVips setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeHaVipsResponseBodyHaVips setIpAddress(String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public String getIpAddress() {
            return this.ipAddress;
        }

        public DescribeHaVipsResponseBodyHaVips setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeHaVipsResponseBodyHaVips setHaVipId(String haVipId) {
            this.haVipId = haVipId;
            return this;
        }
        public String getHaVipId() {
            return this.haVipId;
        }

        public DescribeHaVipsResponseBodyHaVips setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeHaVipsResponseBodyHaVips setAssociatedInstances(java.util.List<String> associatedInstances) {
            this.associatedInstances = associatedInstances;
            return this;
        }
        public java.util.List<String> getAssociatedInstances() {
            return this.associatedInstances;
        }

        public DescribeHaVipsResponseBodyHaVips setMasterInstanceId(String masterInstanceId) {
            this.masterInstanceId = masterInstanceId;
            return this;
        }
        public String getMasterInstanceId() {
            return this.masterInstanceId;
        }

        public DescribeHaVipsResponseBodyHaVips setAssociatedEipAddresses(java.util.List<String> associatedEipAddresses) {
            this.associatedEipAddresses = associatedEipAddresses;
            return this;
        }
        public java.util.List<String> getAssociatedEipAddresses() {
            return this.associatedEipAddresses;
        }

        public DescribeHaVipsResponseBodyHaVips setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

}
