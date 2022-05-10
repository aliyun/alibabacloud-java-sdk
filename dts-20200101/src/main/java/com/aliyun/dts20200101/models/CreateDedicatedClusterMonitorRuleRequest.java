// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class CreateDedicatedClusterMonitorRuleRequest extends TeaModel {
    @NameInMap("CpuAlarmThreshold")
    public Long cpuAlarmThreshold;

    @NameInMap("DedicatedClusterId")
    public String dedicatedClusterId;

    @NameInMap("DiskAlarmThreshold")
    public Long diskAlarmThreshold;

    @NameInMap("DuAlarmThreshold")
    public Long duAlarmThreshold;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("MemAlarmThreshold")
    public Long memAlarmThreshold;

    @NameInMap("NoticeSwitch")
    public Long noticeSwitch;

    @NameInMap("OwnerId")
    public String ownerId;

    @NameInMap("Phones")
    public String phones;

    @NameInMap("RegionId")
    public String regionId;

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

}
