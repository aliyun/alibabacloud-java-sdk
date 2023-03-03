// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CreateSyntheticTaskShrinkRequest extends TeaModel {
    /**
     * <p>The common parameters.</p>
     */
    @NameInMap("CommonParam")
    public String commonParamShrink;

    /**
     * <p>The file download task.</p>
     */
    @NameInMap("Download")
    public String downloadShrink;

    /**
     * <p>The frequency.</p>
     */
    @NameInMap("ExtendInterval")
    public String extendIntervalShrink;

    /**
     * <p>The interval at which synthetic monitoring is performed. Unit: minutes. Valid values:</p>
     * <br>
     * <p>*   1</p>
     * <p>*   5</p>
     * <p>*   10</p>
     * <p>*   15</p>
     * <p>*   20</p>
     * <p>*   30</p>
     * <p>*   60</p>
     * <p>*   120</p>
     * <p>*   180</p>
     * <p>*   240</p>
     * <p>*   360</p>
     * <p>*   480</p>
     * <p>*   720</p>
     * <p>*   1440</p>
     */
    @NameInMap("IntervalTime")
    public String intervalTime;

    /**
     * <p>The interval type.</p>
     * <br>
     * <p>*   0: daily</p>
     * <p>*   1: custom frequency</p>
     */
    @NameInMap("IntervalType")
    public String intervalType;

    /**
     * <p>The IP address type:</p>
     * <br>
     * <p>*   0: an automatic IP address</p>
     * <p>*   1: IPv4</p>
     * <p>*   2: IPv6</p>
     */
    @NameInMap("IpType")
    public Long ipType;

    /**
     * <p>The list of monitoring points.</p>
     */
    @NameInMap("MonitorList")
    public String monitorListShrink;

    /**
     * <p>The monitoring items that are associated with the browse tasks.</p>
     */
    @NameInMap("Navigation")
    public String navigationShrink;

    /**
     * <p>The network synthetic monitoring task.</p>
     */
    @NameInMap("Net")
    public String netShrink;

    /**
     * <p>The API performance synthetic monitoring task.</p>
     */
    @NameInMap("Protocol")
    public String protocolShrink;

    /**
     * <p>The ID of the region in which the application is located.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The name of the task. To update a synthetic monitoring task, enter the task name and set the **UpdateTask** parameter to **true**.</p>
     */
    @NameInMap("TaskName")
    public String taskName;

    /**
     * <p>The type of the monitoring task. Valid values:</p>
     * <br>
     * <p>1.  3: web page performance - IE</p>
     * <p>2.  34: web Page Performance - Chrome</p>
     * <p>3.  0: network quality</p>
     * <p>4.  40: file download</p>
     * <p>5.  7:API performance</p>
     */
    @NameInMap("TaskType")
    public Long taskType;

    /**
     * <p>Specifies whether to update existing synthetic monitoring tasks.</p>
     * <br>
     * <p>*   true: updates existing synthetic monitoring tasks.</p>
     * <p>*   false: creates new synthetic monitoring tasks.</p>
     */
    @NameInMap("UpdateTask")
    public Boolean updateTask;

    /**
     * <p>The URL for synthetic monitoring.</p>
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
