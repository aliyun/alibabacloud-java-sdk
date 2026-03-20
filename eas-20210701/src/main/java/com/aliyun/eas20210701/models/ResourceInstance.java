// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class ResourceInstance extends TeaModel {
    /**
     * <p>The system architecture of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>arm64</p>
     */
    @NameInMap("Arch")
    public String arch;

    /**
     * <p>Indicates whether auto-renewal is enabled for the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoRenewal")
    public Boolean autoRenewal;

    /**
     * <p>The billing method of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>PrePaid</p>
     */
    @NameInMap("ChargeType")
    public String chargeType;

    /**
     * <p>The time when the instance was created.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-07-05T22:51:32Z</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>The time when the instance expires.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-08-05T22:51:32Z</p>
     */
    @NameInMap("ExpiredTime")
    public String expiredTime;

    /**
     * <p>The number of CPU cores for the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("InstanceCpuCount")
    public Integer instanceCpuCount;

    /**
     * <p>The number of GPUs for the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("InstanceGpuCount")
    public Integer instanceGpuCount;

    /**
     * <p>The GPU memory size of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>0G</p>
     */
    @NameInMap("InstanceGpuMemory")
    public String instanceGpuMemory;

    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>eas-i-1800z74n30kao****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The IP address of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>11.227.XX.XX</p>
     */
    @NameInMap("InstanceIp")
    public String instanceIp;

    /**
     * <p>The memory size of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>8192M</p>
     */
    @NameInMap("InstanceMemory")
    public String instanceMemory;

    /**
     * <p>The instance name.</p>
     * 
     * <strong>example:</strong>
     * <p>eas01122713204*****</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    @NameInMap("InstancePhase")
    public String instancePhase;

    /**
     * <p>The instance status.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>Ready-SchedulingDisabled</li>
     * <li>Ready</li>
     * <li>NotReady</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Ready</p>
     */
    @NameInMap("InstanceStatus")
    public String instanceStatus;

    /**
     * <p>The system disk size of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("InstanceSystemDiskSize")
    public Integer instanceSystemDiskSize;

    /**
     * <p>The IP address of the instance in the VPC.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.xx.xx</p>
     */
    @NameInMap("InstanceTenantIp")
    public String instanceTenantIp;

    /**
     * <p>The instance type.</p>
     * 
     * <strong>example:</strong>
     * <p>ecs.s6-c1m2.xlarge</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>The number of CPU cores used by the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>2.4</p>
     */
    @NameInMap("InstanceUsedCpu")
    public Float instanceUsedCpu;

    /**
     * <p>The number of GPUs used by the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("InstanceUsedGpu")
    public Float instanceUsedGpu;

    /**
     * <p>The size of the GPU memory used by the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>470M</p>
     */
    @NameInMap("InstanceUsedGpuMemory")
    public String instanceUsedGpuMemory;

    /**
     * <p>The size of the memory used by the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>1000M</p>
     */
    @NameInMap("InstanceUsedMemory")
    public String instanceUsedMemory;

    /**
     * <p>The instance tags.</p>
     */
    @NameInMap("Labels")
    public java.util.List<ResourceInstanceLabels> labels;

    @NameInMap("LastCordonOperator")
    public String lastCordonOperator;

    @NameInMap("LastCordonReason")
    public String lastCordonReason;

    /**
     * <p>The region ID of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>The ID of the resource group to which the instance belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>eas-r-xxxxx</p>
     */
    @NameInMap("ResourceId")
    public String resourceId;

    /**
     * <p>The ID of the zone to which the instance belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-b</p>
     */
    @NameInMap("Zone")
    public String zone;

    public static ResourceInstance build(java.util.Map<String, ?> map) throws Exception {
        ResourceInstance self = new ResourceInstance();
        return TeaModel.build(map, self);
    }

    public ResourceInstance setArch(String arch) {
        this.arch = arch;
        return this;
    }
    public String getArch() {
        return this.arch;
    }

    public ResourceInstance setAutoRenewal(Boolean autoRenewal) {
        this.autoRenewal = autoRenewal;
        return this;
    }
    public Boolean getAutoRenewal() {
        return this.autoRenewal;
    }

    public ResourceInstance setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public ResourceInstance setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public ResourceInstance setExpiredTime(String expiredTime) {
        this.expiredTime = expiredTime;
        return this;
    }
    public String getExpiredTime() {
        return this.expiredTime;
    }

    public ResourceInstance setInstanceCpuCount(Integer instanceCpuCount) {
        this.instanceCpuCount = instanceCpuCount;
        return this;
    }
    public Integer getInstanceCpuCount() {
        return this.instanceCpuCount;
    }

    public ResourceInstance setInstanceGpuCount(Integer instanceGpuCount) {
        this.instanceGpuCount = instanceGpuCount;
        return this;
    }
    public Integer getInstanceGpuCount() {
        return this.instanceGpuCount;
    }

    public ResourceInstance setInstanceGpuMemory(String instanceGpuMemory) {
        this.instanceGpuMemory = instanceGpuMemory;
        return this;
    }
    public String getInstanceGpuMemory() {
        return this.instanceGpuMemory;
    }

    public ResourceInstance setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ResourceInstance setInstanceIp(String instanceIp) {
        this.instanceIp = instanceIp;
        return this;
    }
    public String getInstanceIp() {
        return this.instanceIp;
    }

    public ResourceInstance setInstanceMemory(String instanceMemory) {
        this.instanceMemory = instanceMemory;
        return this;
    }
    public String getInstanceMemory() {
        return this.instanceMemory;
    }

    public ResourceInstance setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public ResourceInstance setInstancePhase(String instancePhase) {
        this.instancePhase = instancePhase;
        return this;
    }
    public String getInstancePhase() {
        return this.instancePhase;
    }

    public ResourceInstance setInstanceStatus(String instanceStatus) {
        this.instanceStatus = instanceStatus;
        return this;
    }
    public String getInstanceStatus() {
        return this.instanceStatus;
    }

    public ResourceInstance setInstanceSystemDiskSize(Integer instanceSystemDiskSize) {
        this.instanceSystemDiskSize = instanceSystemDiskSize;
        return this;
    }
    public Integer getInstanceSystemDiskSize() {
        return this.instanceSystemDiskSize;
    }

    public ResourceInstance setInstanceTenantIp(String instanceTenantIp) {
        this.instanceTenantIp = instanceTenantIp;
        return this;
    }
    public String getInstanceTenantIp() {
        return this.instanceTenantIp;
    }

    public ResourceInstance setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public ResourceInstance setInstanceUsedCpu(Float instanceUsedCpu) {
        this.instanceUsedCpu = instanceUsedCpu;
        return this;
    }
    public Float getInstanceUsedCpu() {
        return this.instanceUsedCpu;
    }

    public ResourceInstance setInstanceUsedGpu(Float instanceUsedGpu) {
        this.instanceUsedGpu = instanceUsedGpu;
        return this;
    }
    public Float getInstanceUsedGpu() {
        return this.instanceUsedGpu;
    }

    public ResourceInstance setInstanceUsedGpuMemory(String instanceUsedGpuMemory) {
        this.instanceUsedGpuMemory = instanceUsedGpuMemory;
        return this;
    }
    public String getInstanceUsedGpuMemory() {
        return this.instanceUsedGpuMemory;
    }

    public ResourceInstance setInstanceUsedMemory(String instanceUsedMemory) {
        this.instanceUsedMemory = instanceUsedMemory;
        return this;
    }
    public String getInstanceUsedMemory() {
        return this.instanceUsedMemory;
    }

    public ResourceInstance setLabels(java.util.List<ResourceInstanceLabels> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.List<ResourceInstanceLabels> getLabels() {
        return this.labels;
    }

    public ResourceInstance setLastCordonOperator(String lastCordonOperator) {
        this.lastCordonOperator = lastCordonOperator;
        return this;
    }
    public String getLastCordonOperator() {
        return this.lastCordonOperator;
    }

    public ResourceInstance setLastCordonReason(String lastCordonReason) {
        this.lastCordonReason = lastCordonReason;
        return this;
    }
    public String getLastCordonReason() {
        return this.lastCordonReason;
    }

    public ResourceInstance setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public ResourceInstance setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public ResourceInstance setZone(String zone) {
        this.zone = zone;
        return this;
    }
    public String getZone() {
        return this.zone;
    }

    public static class ResourceInstanceLabels extends TeaModel {
        /**
         * <p>The tag key of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>key</p>
         */
        @NameInMap("LabelKey")
        public String labelKey;

        /**
         * <p>The tag value of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>value</p>
         */
        @NameInMap("LabelValue")
        public String labelValue;

        public static ResourceInstanceLabels build(java.util.Map<String, ?> map) throws Exception {
            ResourceInstanceLabels self = new ResourceInstanceLabels();
            return TeaModel.build(map, self);
        }

        public ResourceInstanceLabels setLabelKey(String labelKey) {
            this.labelKey = labelKey;
            return this;
        }
        public String getLabelKey() {
            return this.labelKey;
        }

        public ResourceInstanceLabels setLabelValue(String labelValue) {
            this.labelValue = labelValue;
            return this;
        }
        public String getLabelValue() {
            return this.labelValue;
        }

    }

}
