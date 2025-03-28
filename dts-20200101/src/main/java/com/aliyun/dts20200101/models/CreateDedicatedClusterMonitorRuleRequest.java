// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class CreateDedicatedClusterMonitorRuleRequest extends TeaModel {
    /**
     * <p>The alert threshold for CPU utilization. Unit: percentage.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("CpuAlarmThreshold")
    public Long cpuAlarmThreshold;

    /**
     * <p>The ID of the cluster.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dts-dasd22******</p>
     */
    @NameInMap("DedicatedClusterId")
    public String dedicatedClusterId;

    /**
     * <p>The alert threshold for disk usage. Unit: percentage.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("DiskAlarmThreshold")
    public Long diskAlarmThreshold;

    /**
     * <p>The alert threshold for DTS Unit (DU) usage. Unit: percentage.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("DuAlarmThreshold")
    public Long duAlarmThreshold;

    /**
     * <p>The ID of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-bp1162kryivb8****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The alert threshold for memory usage. Unit: percentage.</p>
     * 
     * <strong>example:</strong>
     * <p>40</p>
     */
    @NameInMap("MemAlarmThreshold")
    public Long memAlarmThreshold;

    /**
     * <p>Specifies whether to enable the alert feature. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: enables the alert feature.</li>
     * <li><strong>0</strong>: disables the alert feature.</li>
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
     * <p>The mobile phone number to which alerts are sent. Separate multiple mobile phone numbers with commas (,).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>186****7654</p>
     */
    @NameInMap("Phones")
    public String phones;

    /**
     * <p>The ID of the region in which the Data Transmission Service (DTS) instance resides.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The resource group ID. This parameter is a global parameter and not required.</p>
     * 
     * <strong>example:</strong>
     * <p>The resource group ID. This parameter is a global parameter and not required.</p>
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
