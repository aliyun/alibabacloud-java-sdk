// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafkastreaming20260202.models;

import com.aliyun.tea.*;

public class GetComputeInstanceResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public GetComputeInstanceResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetComputeInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetComputeInstanceResponseBody self = new GetComputeInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetComputeInstanceResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public GetComputeInstanceResponseBody setData(GetComputeInstanceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetComputeInstanceResponseBodyData getData() {
        return this.data;
    }

    public GetComputeInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetComputeInstanceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetComputeInstanceResponseBodyData extends TeaModel {
        @NameInMap("ChargeType")
        public String chargeType;

        /**
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ssZ</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("CuLimitSum")
        public Double cuLimitSum;

        @NameInMap("CuReservedSum")
        public Double cuReservedSum;

        @NameInMap("CuUsedSum")
        public Double cuUsedSum;

        /**
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ssZ</p>
         */
        @NameInMap("ExpireTime")
        public String expireTime;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("OrderId")
        public String orderId;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("ServiceStatus")
        public String serviceStatus;

        @NameInMap("ServiceVersion")
        public String serviceVersion;

        @NameInMap("TotalJobs")
        public Long totalJobs;

        @NameInMap("TotalRunningJobs")
        public Long totalRunningJobs;

        @NameInMap("VSwitchIds")
        public java.util.List<String> vSwitchIds;

        @NameInMap("VpcId")
        public String vpcId;

        public static GetComputeInstanceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetComputeInstanceResponseBodyData self = new GetComputeInstanceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetComputeInstanceResponseBodyData setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public GetComputeInstanceResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetComputeInstanceResponseBodyData setCuLimitSum(Double cuLimitSum) {
            this.cuLimitSum = cuLimitSum;
            return this;
        }
        public Double getCuLimitSum() {
            return this.cuLimitSum;
        }

        public GetComputeInstanceResponseBodyData setCuReservedSum(Double cuReservedSum) {
            this.cuReservedSum = cuReservedSum;
            return this;
        }
        public Double getCuReservedSum() {
            return this.cuReservedSum;
        }

        public GetComputeInstanceResponseBodyData setCuUsedSum(Double cuUsedSum) {
            this.cuUsedSum = cuUsedSum;
            return this;
        }
        public Double getCuUsedSum() {
            return this.cuUsedSum;
        }

        public GetComputeInstanceResponseBodyData setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public GetComputeInstanceResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetComputeInstanceResponseBodyData setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public GetComputeInstanceResponseBodyData setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

        public GetComputeInstanceResponseBodyData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetComputeInstanceResponseBodyData setServiceStatus(String serviceStatus) {
            this.serviceStatus = serviceStatus;
            return this;
        }
        public String getServiceStatus() {
            return this.serviceStatus;
        }

        public GetComputeInstanceResponseBodyData setServiceVersion(String serviceVersion) {
            this.serviceVersion = serviceVersion;
            return this;
        }
        public String getServiceVersion() {
            return this.serviceVersion;
        }

        public GetComputeInstanceResponseBodyData setTotalJobs(Long totalJobs) {
            this.totalJobs = totalJobs;
            return this;
        }
        public Long getTotalJobs() {
            return this.totalJobs;
        }

        public GetComputeInstanceResponseBodyData setTotalRunningJobs(Long totalRunningJobs) {
            this.totalRunningJobs = totalRunningJobs;
            return this;
        }
        public Long getTotalRunningJobs() {
            return this.totalRunningJobs;
        }

        public GetComputeInstanceResponseBodyData setVSwitchIds(java.util.List<String> vSwitchIds) {
            this.vSwitchIds = vSwitchIds;
            return this;
        }
        public java.util.List<String> getVSwitchIds() {
            return this.vSwitchIds;
        }

        public GetComputeInstanceResponseBodyData setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
