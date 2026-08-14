// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class CreateDedicatedClusterMonitorRuleRequest extends TeaModel {
    /**
     * <p>The CPU alert threshold. Unit: %.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("CpuAlarmThreshold")
    public Long cpuAlarmThreshold;

    /**
     * <p>The cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dts-dasd22******</p>
     */
    @NameInMap("DedicatedClusterId")
    public String dedicatedClusterId;

    /**
     * <p>The disk alert threshold. Unit: %.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("DiskAlarmThreshold")
    public Long diskAlarmThreshold;

    /**
     * <p>The DU alert threshold. Unit: %.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("DuAlarmThreshold")
    public Long duAlarmThreshold;

    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-bp1162kryivb8****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The memory alert threshold. Unit: %.</p>
     * 
     * <strong>example:</strong>
     * <p>40</p>
     */
    @NameInMap("MemAlarmThreshold")
    public Long memAlarmThreshold;

    /**
     * <p>The alert switch. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: on.</li>
     * <li><strong>0</strong>: off.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("NoticeSwitch")
    public Long noticeSwitch;

    @NameInMap("OwnerId")
    public String ownerId;

    /**
     * <p>The alert phone numbers. Separate multiple phone numbers with commas (,).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>186****7654</p>
     */
    @NameInMap("Phones")
    public String phones;

    /**
     * <p>The region in which the DTS instance resides.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The resource group ID. This is a global parameter and does not need to be passed in for this API operation.</p>
     * 
     * <strong>example:</strong>
     * <p>资源组ID，全局参数，当前API无需传入。</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static CreateDedicatedClusterMonitorRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDedicatedClusterMonitorRuleRequest self = new CreateDedicatedClusterMonitorRuleRequest();
        return TeaModel.build(map, self);
    }

    public CreateDedicatedClusterMonitorRuleRequest setCpuAlarmThreshold(Long cpuAlarmThreshold) {
        this.cpuAlarmThreshold = cpuAlarmThreshold;
        return this;
    }
    public Long getCpuAlarmThreshold() {
        return this.cpuAlarmThreshold;
    }

    public CreateDedicatedClusterMonitorRuleRequest setDedicatedClusterId(String dedicatedClusterId) {
        this.dedicatedClusterId = dedicatedClusterId;
        return this;
    }
    public String getDedicatedClusterId() {
        return this.dedicatedClusterId;
    }

    public CreateDedicatedClusterMonitorRuleRequest setDiskAlarmThreshold(Long diskAlarmThreshold) {
        this.diskAlarmThreshold = diskAlarmThreshold;
        return this;
    }
    public Long getDiskAlarmThreshold() {
        return this.diskAlarmThreshold;
    }

    public CreateDedicatedClusterMonitorRuleRequest setDuAlarmThreshold(Long duAlarmThreshold) {
        this.duAlarmThreshold = duAlarmThreshold;
        return this;
    }
    public Long getDuAlarmThreshold() {
        return this.duAlarmThreshold;
    }

    public CreateDedicatedClusterMonitorRuleRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateDedicatedClusterMonitorRuleRequest setMemAlarmThreshold(Long memAlarmThreshold) {
        this.memAlarmThreshold = memAlarmThreshold;
        return this;
    }
    public Long getMemAlarmThreshold() {
        return this.memAlarmThreshold;
    }

    public CreateDedicatedClusterMonitorRuleRequest setNoticeSwitch(Long noticeSwitch) {
        this.noticeSwitch = noticeSwitch;
        return this;
    }
    public Long getNoticeSwitch() {
        return this.noticeSwitch;
    }

    public CreateDedicatedClusterMonitorRuleRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public CreateDedicatedClusterMonitorRuleRequest setPhones(String phones) {
        this.phones = phones;
        return this;
    }
    public String getPhones() {
        return this.phones;
    }

    public CreateDedicatedClusterMonitorRuleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateDedicatedClusterMonitorRuleRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
