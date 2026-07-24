// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafkastreaming20260202.models;

import com.aliyun.tea.*;

public class ListComputeInstancesInPageResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("Data")
    public java.util.List<ListComputeInstancesInPageResponseBodyData> data;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Total")
    public Long total;

    public static ListComputeInstancesInPageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListComputeInstancesInPageResponseBody self = new ListComputeInstancesInPageResponseBody();
        return TeaModel.build(map, self);
    }

    public ListComputeInstancesInPageResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public ListComputeInstancesInPageResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListComputeInstancesInPageResponseBody setData(java.util.List<ListComputeInstancesInPageResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListComputeInstancesInPageResponseBodyData> getData() {
        return this.data;
    }

    public ListComputeInstancesInPageResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListComputeInstancesInPageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListComputeInstancesInPageResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListComputeInstancesInPageResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class ListComputeInstancesInPageResponseBodyData extends TeaModel {
        @NameInMap("AutoRenewFlag")
        public Boolean autoRenewFlag;

        @NameInMap("ChargeType")
        public String chargeType;

        @NameInMap("CommodityCode")
        public String commodityCode;

        /**
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ssZ</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Cu")
        public Integer cu;

        @NameInMap("CuLimitSum")
        public Double cuLimitSum;

        @NameInMap("CuReservedSum")
        public Double cuReservedSum;

        @NameInMap("CuUsedSum")
        public Double cuUsedSum;

        /**
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
         */
        @NameInMap("ExpireTime")
        public String expireTime;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("Owner")
        public String owner;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("ServiceStatus")
        public String serviceStatus;

        @NameInMap("TotalJobs")
        public Long totalJobs;

        @NameInMap("TotalRunningJobs")
        public Long totalRunningJobs;

        @NameInMap("VSwitchIds")
        public java.util.List<String> vSwitchIds;

        @NameInMap("Version")
        public String version;

        @NameInMap("VpcId")
        public String vpcId;

        public static ListComputeInstancesInPageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListComputeInstancesInPageResponseBodyData self = new ListComputeInstancesInPageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListComputeInstancesInPageResponseBodyData setAutoRenewFlag(Boolean autoRenewFlag) {
            this.autoRenewFlag = autoRenewFlag;
            return this;
        }
        public Boolean getAutoRenewFlag() {
            return this.autoRenewFlag;
        }

        public ListComputeInstancesInPageResponseBodyData setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public ListComputeInstancesInPageResponseBodyData setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

        public ListComputeInstancesInPageResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListComputeInstancesInPageResponseBodyData setCu(Integer cu) {
            this.cu = cu;
            return this;
        }
        public Integer getCu() {
            return this.cu;
        }

        public ListComputeInstancesInPageResponseBodyData setCuLimitSum(Double cuLimitSum) {
            this.cuLimitSum = cuLimitSum;
            return this;
        }
        public Double getCuLimitSum() {
            return this.cuLimitSum;
        }

        public ListComputeInstancesInPageResponseBodyData setCuReservedSum(Double cuReservedSum) {
            this.cuReservedSum = cuReservedSum;
            return this;
        }
        public Double getCuReservedSum() {
            return this.cuReservedSum;
        }

        public ListComputeInstancesInPageResponseBodyData setCuUsedSum(Double cuUsedSum) {
            this.cuUsedSum = cuUsedSum;
            return this;
        }
        public Double getCuUsedSum() {
            return this.cuUsedSum;
        }

        public ListComputeInstancesInPageResponseBodyData setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public ListComputeInstancesInPageResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListComputeInstancesInPageResponseBodyData setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public ListComputeInstancesInPageResponseBodyData setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public ListComputeInstancesInPageResponseBodyData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListComputeInstancesInPageResponseBodyData setServiceStatus(String serviceStatus) {
            this.serviceStatus = serviceStatus;
            return this;
        }
        public String getServiceStatus() {
            return this.serviceStatus;
        }

        public ListComputeInstancesInPageResponseBodyData setTotalJobs(Long totalJobs) {
            this.totalJobs = totalJobs;
            return this;
        }
        public Long getTotalJobs() {
            return this.totalJobs;
        }

        public ListComputeInstancesInPageResponseBodyData setTotalRunningJobs(Long totalRunningJobs) {
            this.totalRunningJobs = totalRunningJobs;
            return this;
        }
        public Long getTotalRunningJobs() {
            return this.totalRunningJobs;
        }

        public ListComputeInstancesInPageResponseBodyData setVSwitchIds(java.util.List<String> vSwitchIds) {
            this.vSwitchIds = vSwitchIds;
            return this;
        }
        public java.util.List<String> getVSwitchIds() {
            return this.vSwitchIds;
        }

        public ListComputeInstancesInPageResponseBodyData setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public ListComputeInstancesInPageResponseBodyData setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
