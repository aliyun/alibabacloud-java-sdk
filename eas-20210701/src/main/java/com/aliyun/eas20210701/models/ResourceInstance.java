// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class ResourceInstance extends TeaModel {
    // 实例是否自动续费
    @NameInMap("AutoRenewal")
    public Boolean autoRenewal;

    // 实例的计费类型
    @NameInMap("ChargeType")
    public String chargeType;

    // 实例的创建时间
    @NameInMap("CreateTime")
    public String createTime;

    // 实例过期时间
    @NameInMap("ExpiredTime")
    public String expiredTime;

    // 实例的Cpu个数
    @NameInMap("InstanceCpuCount")
    public Integer instanceCpuCount;

    // 实例的Gpu个数
    @NameInMap("InstanceGpuCount")
    public Integer instanceGpuCount;

    // 实例ID
    @NameInMap("InstanceId")
    public String instanceId;

    // 实例IP
    @NameInMap("InstanceIp")
    public String instanceIp;

    // 实例的内存大小
    @NameInMap("InstanceMemory")
    public String instanceMemory;

    // 实例名称
    @NameInMap("InstanceName")
    public String instanceName;

    // 实例状态
    @NameInMap("InstanceStatus")
    public String instanceStatus;

    // 实例的机型
    @NameInMap("InstanceType")
    public String instanceType;

    // 实例被使用的CPU数量
    @NameInMap("InstanceUsedCpu")
    public Float instanceUsedCpu;

    // 实例被使用的GPU数量
    @NameInMap("InstanceUsedGpu")
    public Integer instanceUsedGpu;

    // 实例被使用的内存大小
    @NameInMap("InstanceUsedMemory")
    public String instanceUsedMemory;

    public static ResourceInstance build(java.util.Map<String, ?> map) throws Exception {
        ResourceInstance self = new ResourceInstance();
        return TeaModel.build(map, self);
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

    public ResourceInstance setInstanceUsedGpu(Integer instanceUsedGpu) {
        this.instanceUsedGpu = instanceUsedGpu;
        return this;
    }
    public Integer getInstanceUsedGpu() {
        return this.instanceUsedGpu;
    }

    public ResourceInstance setInstanceUsedMemory(String instanceUsedMemory) {
        this.instanceUsedMemory = instanceUsedMemory;
        return this;
    }
    public String getInstanceUsedMemory() {
        return this.instanceUsedMemory;
    }

}
