// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CreateSyntheticTaskShrinkRequest extends TeaModel {
    @NameInMap("CommonParam")
    public String commonParamShrink;

    @NameInMap("Download")
    public String downloadShrink;

    @NameInMap("ExtendInterval")
    public String extendIntervalShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("IntervalTime")
    public String intervalTime;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("IntervalType")
    public String intervalType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("IpType")
    public Long ipType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("MonitorList")
    public String monitorListShrink;

    @NameInMap("Navigation")
    public String navigationShrink;

    @NameInMap("Net")
    public String netShrink;

    @NameInMap("Protocol")
    public String protocolShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TaskName")
    public String taskName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("TaskType")
    public Long taskType;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("UpdateTask")
    public Boolean updateTask;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://www.example.com">https://www.example.com</a></p>
     */
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

    public CreateSyntheticTaskShrinkRequest setDownloadShrink(String downloadShrink) {
        this.downloadShrink = downloadShrink;
        return this;
    }
    public String getDownloadShrink() {
        return this.downloadShrink;
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

    public CreateSyntheticTaskShrinkRequest setNavigationShrink(String navigationShrink) {
        this.navigationShrink = navigationShrink;
        return this;
    }
    public String getNavigationShrink() {
        return this.navigationShrink;
    }

    public CreateSyntheticTaskShrinkRequest setNetShrink(String netShrink) {
        this.netShrink = netShrink;
        return this;
    }
    public String getNetShrink() {
        return this.netShrink;
    }

    public CreateSyntheticTaskShrinkRequest setProtocolShrink(String protocolShrink) {
        this.protocolShrink = protocolShrink;
        return this;
    }
    public String getProtocolShrink() {
        return this.protocolShrink;
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

    public CreateSyntheticTaskShrinkRequest setUpdateTask(Boolean updateTask) {
        this.updateTask = updateTask;
        return this;
    }
    public Boolean getUpdateTask() {
        return this.updateTask;
    }

    public CreateSyntheticTaskShrinkRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
