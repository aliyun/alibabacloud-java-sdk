// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CreateSyntheticTaskShrinkRequest extends TeaModel {
    @NameInMap("CommonParam")
    public String commonParamShrink;

    @NameInMap("ExtendInterval")
    public String extendIntervalShrink;

    @NameInMap("IntervalTime")
    public String intervalTime;

    @NameInMap("IntervalType")
    public String intervalType;

    @NameInMap("IpType")
    public Long ipType;

    @NameInMap("MonitorList")
    public String monitorListShrink;

    @NameInMap("Net")
    public String netShrink;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("TaskName")
    public String taskName;

    @NameInMap("TaskType")
    public Long taskType;

    @NameInMap("Url")
    public String url;

    public static CreateSyntheticTaskShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSyntheticTaskShrinkRequest self = new CreateSyntheticTaskShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateSyntheticTaskShrinkRequest setCommonParamShrink(String commonParamShrink) {
        this.commonParamShrink = commonParamShrink;
        return this;
    }
    public String getCommonParamShrink() {
        return this.commonParamShrink;
    }

    public CreateSyntheticTaskShrinkRequest setExtendIntervalShrink(String extendIntervalShrink) {
        this.extendIntervalShrink = extendIntervalShrink;
        return this;
    }
    public String getExtendIntervalShrink() {
        return this.extendIntervalShrink;
    }

    public CreateSyntheticTaskShrinkRequest setIntervalTime(String intervalTime) {
        this.intervalTime = intervalTime;
        return this;
    }
    public String getIntervalTime() {
        return this.intervalTime;
    }

    public CreateSyntheticTaskShrinkRequest setIntervalType(String intervalType) {
        this.intervalType = intervalType;
        return this;
    }
    public String getIntervalType() {
        return this.intervalType;
    }

    public CreateSyntheticTaskShrinkRequest setIpType(Long ipType) {
        this.ipType = ipType;
        return this;
    }
    public Long getIpType() {
        return this.ipType;
    }

    public CreateSyntheticTaskShrinkRequest setMonitorListShrink(String monitorListShrink) {
        this.monitorListShrink = monitorListShrink;
        return this;
    }
    public String getMonitorListShrink() {
        return this.monitorListShrink;
    }

    public CreateSyntheticTaskShrinkRequest setNetShrink(String netShrink) {
        this.netShrink = netShrink;
        return this;
    }
    public String getNetShrink() {
        return this.netShrink;
    }

    public CreateSyntheticTaskShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateSyntheticTaskShrinkRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

    public CreateSyntheticTaskShrinkRequest setTaskType(Long taskType) {
        this.taskType = taskType;
        return this;
    }
    public Long getTaskType() {
        return this.taskType;
    }

    public CreateSyntheticTaskShrinkRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
