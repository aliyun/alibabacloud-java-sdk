// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class ResourceInstance extends TeaModel {
    @NameInMap("Arch")
    public String arch;

    @NameInMap("AutoRenewal")
    public Boolean autoRenewal;

    @NameInMap("ChargeType")
    public String chargeType;

    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("ExpiredTime")
    public String expiredTime;

    @NameInMap("InstanceCpuCount")
    public Integer instanceCpuCount;

    @NameInMap("InstanceGpuCount")
    public Integer instanceGpuCount;

    @NameInMap("InstanceGpuMemory")
    public String instanceGpuMemory;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("InstanceIp")
    public String instanceIp;

    @NameInMap("InstanceMemory")
    public String instanceMemory;

    @NameInMap("InstanceName")
    public String instanceName;

    @NameInMap("InstanceStatus")
    public String instanceStatus;

    @NameInMap("InstanceSystemDiskSize")
    public Integer instanceSystemDiskSize;

    @NameInMap("InstanceTenantIp")
    public String instanceTenantIp;

    @NameInMap("InstanceType")
    public String instanceType;

    @NameInMap("InstanceUsedCpu")
    public Float instanceUsedCpu;

    @NameInMap("InstanceUsedGpu")
    public Float instanceUsedGpu;

    @NameInMap("InstanceUsedGpuMemory")
    public String instanceUsedGpuMemory;

    @NameInMap("InstanceUsedMemory")
    public String instanceUsedMemory;

    @NameInMap("Region")
    public String region;

    @NameInMap("ResourceId")
    public String resourceId;

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

}
