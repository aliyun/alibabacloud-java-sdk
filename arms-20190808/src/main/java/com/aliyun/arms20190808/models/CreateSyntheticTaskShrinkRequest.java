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
     * <ul>
     * <li>1</li>
     * <li>5</li>
     * <li>10</li>
     * <li>15</li>
     * <li>20</li>
     * <li>30</li>
     * <li>60</li>
     * <li>120</li>
     * <li>180</li>
     * <li>240</li>
     * <li>360</li>
     * <li>480</li>
     * <li>720</li>
     * <li>1440</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("IntervalTime")
    public String intervalTime;

    /**
     * <p>The interval type.</p>
     * <ul>
     * <li>0: daily</li>
     * <li>1: custom frequency</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("IntervalType")
    public String intervalType;

    /**
     * <p>The IP address type:</p>
     * <ul>
     * <li>0: an automatic IP address</li>
     * <li>1: IPv4</li>
     * <li>2: IPv6</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("IpType")
    public Long ipType;

    /**
     * <p>The list of monitoring points.</p>
     * <p>This parameter is required.</p>
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
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The name of the task. To update a synthetic monitoring task, enter the task name and set the <strong>UpdateTask</strong> parameter to <strong>true</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Network synthetic monitoring task</p>
     */
    @NameInMap("TaskName")
    public String taskName;

    /**
     * <p>The type of the monitoring task. Valid values:</p>
     * <ol>
     * <li>3: web page performance - IE</li>
     * <li>34: web Page Performance - Chrome</li>
     * <li>0: network quality</li>
     * <li>40: file download</li>
     * <li>7:API performance</li>
     * </ol>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("TaskType")
    public Long taskType;

    /**
     * <p>Specifies whether to update existing synthetic monitoring tasks.</p>
     * <ul>
     * <li>true: updates existing synthetic monitoring tasks.</li>
     * <li>false: creates new synthetic monitoring tasks.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("UpdateTask")
    public Boolean updateTask;

    /**
     * <p>The URL for synthetic monitoring.</p>
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
