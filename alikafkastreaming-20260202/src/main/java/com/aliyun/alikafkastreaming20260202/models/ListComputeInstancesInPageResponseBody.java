// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafkastreaming20260202.models;

import com.aliyun.tea.*;

public class ListComputeInstancesInPageResponseBody extends TeaModel {
    /**
     * <p>The return code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Long code;

    /**
     * <p>The current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListComputeInstancesInPageResponseBodyData> data;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9079DD86-09F1-5303-A64F-D9089F96BC16</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total number of entries that meet the query conditions.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
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
        /**
         * <p>Indicates whether auto-renewal is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("AutoRenewFlag")
        public Boolean autoRenewFlag;

        /**
         * <p>The billing method.</p>
         * 
         * <strong>example:</strong>
         * <p>POST_PAID</p>
         */
        @NameInMap("ChargeType")
        public String chargeType;

        /**
         * <p>The creation time.</p>
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ssZ</p>
         * 
         * <strong>example:</strong>
         * <p>2026-09-02T16:00:00Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The total CU limit.</p>
         * 
         * <strong>example:</strong>
         * <p>4.0</p>
         */
        @NameInMap("CuLimitSum")
        public Double cuLimitSum;

        /**
         * <p>The total number of reserved CUs.</p>
         * 
         * <strong>example:</strong>
         * <p>2.0</p>
         */
        @NameInMap("CuReservedSum")
        public Double cuReservedSum;

        /**
         * <p>The total number of used CUs.</p>
         * 
         * <strong>example:</strong>
         * <p>2.5</p>
         */
        @NameInMap("CuUsedSum")
        public Double cuUsedSum;

        /**
         * <p>The expiration time.</p>
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
         * 
         * <strong>example:</strong>
         * <p>2027-09-02T16:00:00Z</p>
         */
        @NameInMap("ExpireTime")
        public String expireTime;

        /**
         * <p>The compute instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>alikafka_streaming-cn-xxxxxxx</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The instance name.</p>
         * 
         * <strong>example:</strong>
         * <p>streaming-prod</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The owner of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>1234567890123456</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The service status of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("ServiceStatus")
        public String serviceStatus;

        /**
         * <p>The total number of jobs.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("TotalJobs")
        public Long totalJobs;

        /**
         * <p>The number of running jobs.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("TotalRunningJobs")
        public Long totalRunningJobs;

        /**
         * <p>The list of vSwitch IDs.</p>
         */
        @NameInMap("VSwitchIds")
        public java.util.List<String> vSwitchIds;

        /**
         * <p>The VPC ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp1abcdefg</p>
         */
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

        public ListComputeInstancesInPageResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
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

        public ListComputeInstancesInPageResponseBodyData setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
