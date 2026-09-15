// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafkastreaming20260202.models;

import com.aliyun.tea.*;

public class GetComputeInstanceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public GetComputeInstanceResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>019F5939-507B-57C1-B82C-E55821456FA6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>POST_PAID</p>
         */
        @NameInMap("ChargeType")
        public String chargeType;

        /**
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ssZ</p>
         * 
         * <strong>example:</strong>
         * <p>2026-09-02T16:00:00Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>4.0</p>
         */
        @NameInMap("CuLimitSum")
        public Double cuLimitSum;

        /**
         * <strong>example:</strong>
         * <p>2.0</p>
         */
        @NameInMap("CuReservedSum")
        public Double cuReservedSum;

        /**
         * <strong>example:</strong>
         * <p>2.5</p>
         */
        @NameInMap("CuUsedSum")
        public Double cuUsedSum;

        /**
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ssZ</p>
         * 
         * <strong>example:</strong>
         * <p>2027-09-02T16:00:00Z</p>
         */
        @NameInMap("ExpireTime")
        public String expireTime;

        /**
         * <strong>example:</strong>
         * <p>alikafka_streaming-cn-pe333xxxxxx</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>streaming-prod</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("ServiceStatus")
        public String serviceStatus;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("TotalJobs")
        public Long totalJobs;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("TotalRunningJobs")
        public Long totalRunningJobs;

        @NameInMap("VSwitchIds")
        public java.util.List<String> vSwitchIds;

        /**
         * <strong>example:</strong>
         * <p>vpc-bp1abcdefg</p>
         */
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
