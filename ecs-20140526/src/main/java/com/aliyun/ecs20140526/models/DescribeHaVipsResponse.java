// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeHaVipsResponse extends TeaModel {
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

    @NameInMap("HaVips")
    @Validation(required = true)
    public DescribeHaVipsResponseHaVips haVips;

    public static DescribeHaVipsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeHaVipsResponse self = new DescribeHaVipsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeHaVipsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeHaVipsResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeHaVipsResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeHaVipsResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeHaVipsResponse setHaVips(DescribeHaVipsResponseHaVips haVips) {
        this.haVips = haVips;
        return this;
    }
    public DescribeHaVipsResponseHaVips getHaVips() {
        return this.haVips;
    }

    public static class DescribeHaVipsResponseHaVipsHaVipAssociatedInstances extends TeaModel {
        // associatedInstance
        @NameInMap("associatedInstance")
        @Validation(required = true)
        public java.util.List<String> associatedInstance;

        public static DescribeHaVipsResponseHaVipsHaVipAssociatedInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeHaVipsResponseHaVipsHaVipAssociatedInstances self = new DescribeHaVipsResponseHaVipsHaVipAssociatedInstances();
            return TeaModel.build(map, self);
        }

        public DescribeHaVipsResponseHaVipsHaVipAssociatedInstances setAssociatedInstance(java.util.List<String> associatedInstance) {
            this.associatedInstance = associatedInstance;
            return this;
        }
        public java.util.List<String> getAssociatedInstance() {
            return this.associatedInstance;
        }

    }

    public static class DescribeHaVipsResponseHaVipsHaVipAssociatedEipAddresses extends TeaModel {
        // associatedEipAddresse
        @NameInMap("associatedEipAddresse")
        @Validation(required = true)
        public java.util.List<String> associatedEipAddresse;

        public static DescribeHaVipsResponseHaVipsHaVipAssociatedEipAddresses build(java.util.Map<String, ?> map) throws Exception {
            DescribeHaVipsResponseHaVipsHaVipAssociatedEipAddresses self = new DescribeHaVipsResponseHaVipsHaVipAssociatedEipAddresses();
            return TeaModel.build(map, self);
        }

        public DescribeHaVipsResponseHaVipsHaVipAssociatedEipAddresses setAssociatedEipAddresse(java.util.List<String> associatedEipAddresse) {
            this.associatedEipAddresse = associatedEipAddresse;
            return this;
        }
        public java.util.List<String> getAssociatedEipAddresse() {
            return this.associatedEipAddresse;
        }

    }

    public static class DescribeHaVipsResponseHaVipsHaVip extends TeaModel {
        @NameInMap("HaVipId")
        @Validation(required = true)
        public String haVipId;

        @NameInMap("RegionId")
        @Validation(required = true)
        public String regionId;

        @NameInMap("VpcId")
        @Validation(required = true)
        public String vpcId;

        @NameInMap("VSwitchId")
        @Validation(required = true)
        public String vSwitchId;

        @NameInMap("IpAddress")
        @Validation(required = true)
        public String ipAddress;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("MasterInstanceId")
        @Validation(required = true)
        public String masterInstanceId;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("CreateTime")
        @Validation(required = true)
        public String createTime;

        @NameInMap("AssociatedInstances")
        @Validation(required = true)
        public DescribeHaVipsResponseHaVipsHaVipAssociatedInstances associatedInstances;

        @NameInMap("AssociatedEipAddresses")
        @Validation(required = true)
        public DescribeHaVipsResponseHaVipsHaVipAssociatedEipAddresses associatedEipAddresses;

        public static DescribeHaVipsResponseHaVipsHaVip build(java.util.Map<String, ?> map) throws Exception {
            DescribeHaVipsResponseHaVipsHaVip self = new DescribeHaVipsResponseHaVipsHaVip();
            return TeaModel.build(map, self);
        }

        public DescribeHaVipsResponseHaVipsHaVip setHaVipId(String haVipId) {
            this.haVipId = haVipId;
            return this;
        }
        public String getHaVipId() {
            return this.haVipId;
        }

        public DescribeHaVipsResponseHaVipsHaVip setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeHaVipsResponseHaVipsHaVip setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeHaVipsResponseHaVipsHaVip setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeHaVipsResponseHaVipsHaVip setIpAddress(String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public String getIpAddress() {
            return this.ipAddress;
        }

        public DescribeHaVipsResponseHaVipsHaVip setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeHaVipsResponseHaVipsHaVip setMasterInstanceId(String masterInstanceId) {
            this.masterInstanceId = masterInstanceId;
            return this;
        }
        public String getMasterInstanceId() {
            return this.masterInstanceId;
        }

        public DescribeHaVipsResponseHaVipsHaVip setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeHaVipsResponseHaVipsHaVip setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeHaVipsResponseHaVipsHaVip setAssociatedInstances(DescribeHaVipsResponseHaVipsHaVipAssociatedInstances associatedInstances) {
            this.associatedInstances = associatedInstances;
            return this;
        }
        public DescribeHaVipsResponseHaVipsHaVipAssociatedInstances getAssociatedInstances() {
            return this.associatedInstances;
        }

        public DescribeHaVipsResponseHaVipsHaVip setAssociatedEipAddresses(DescribeHaVipsResponseHaVipsHaVipAssociatedEipAddresses associatedEipAddresses) {
            this.associatedEipAddresses = associatedEipAddresses;
            return this;
        }
        public DescribeHaVipsResponseHaVipsHaVipAssociatedEipAddresses getAssociatedEipAddresses() {
            return this.associatedEipAddresses;
        }

    }

    public static class DescribeHaVipsResponseHaVips extends TeaModel {
        @NameInMap("HaVip")
        @Validation(required = true)
        public java.util.List<DescribeHaVipsResponseHaVipsHaVip> haVip;

        public static DescribeHaVipsResponseHaVips build(java.util.Map<String, ?> map) throws Exception {
            DescribeHaVipsResponseHaVips self = new DescribeHaVipsResponseHaVips();
            return TeaModel.build(map, self);
        }

        public DescribeHaVipsResponseHaVips setHaVip(java.util.List<DescribeHaVipsResponseHaVipsHaVip> haVip) {
            this.haVip = haVip;
            return this;
        }
        public java.util.List<DescribeHaVipsResponseHaVipsHaVip> getHaVip() {
            return this.haVip;
        }

    }

}
