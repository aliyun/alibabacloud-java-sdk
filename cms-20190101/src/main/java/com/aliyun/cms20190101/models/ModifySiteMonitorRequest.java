// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class ModifySiteMonitorRequest extends TeaModel {
    /**
     * <p>The URL or IP address of the monitoring task.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://www.aliyun.com">http://www.aliyun.com</a></p>
     */
    @NameInMap("Address")
    public String address;

    /**
     * <p>The ID of the alert rule. The alert rule must already exist in CloudMonitor. You can call the <a href="https://help.aliyun.com/document_detail/114941.html">DescribeMetricRuleList</a> operation to query the alert rule ID.</p>
     * 
     * <strong>example:</strong>
     * <p>49f7c317-7645-4cc9-94fd-ea42e122****</p>
     */
    @NameInMap("AlertIds")
    public String alertIds;

    /**
     * <p>The custom probing schedule. You can select a specific time period from Monday to Sunday for probing.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;start_hour&quot;:0,&quot;end_hour&quot;:24, &quot;days&quot;:[0], &quot;time_zone&quot;:&quot;Local&quot;}</p>
     */
    @NameInMap("CustomSchedule")
    public String customSchedule;

    /**
     * <p>The monitoring frequency. Valid values: 1, 5, and 15. Unit: minutes. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Interval")
    public String interval;

    /**
     * <p>The unit of the monitoring metrics.</p>
     * <p>Unit: milliseconds (ms).</p>
     * 
     * <strong>example:</strong>
     * <p>ms</p>
     */
    @NameInMap("IntervalUnit")
    public String intervalUnit;

    /**
     * <p>The probe information. The value is a JSON array. Example: <code>[{&quot;city&quot;:&quot;546&quot;,&quot;isp&quot;:&quot;465&quot;},{&quot;city&quot;:&quot;572&quot;,&quot;isp&quot;:&quot;465&quot;},{&quot;city&quot;:&quot;738&quot;,&quot;isp&quot;:&quot;465&quot;}]</code>. The <code>city</code> values correspond to Beijing, Hangzhou, and Qingdao.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/115045.html">DescribeSiteMonitorISPCityList</a> operation to obtain the detection point information. If this parameter is left empty, the system randomly selects three detection points.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;city&quot;:&quot;546&quot;,&quot;isp&quot;:&quot;465&quot;},{&quot;city&quot;:&quot;572&quot;,&quot;isp&quot;:&quot;465&quot;},{&quot;city&quot;:&quot;738&quot;,&quot;isp&quot;:&quot;465&quot;}]</p>
     */
    @NameInMap("IspCities")
    public String ispCities;

    /**
     * <p>The advanced extension options for the protocol type of the monitoring task. Different protocol types correspond to different extension options.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;time_out&quot;:5000}</p>
     */
    @NameInMap("OptionsJson")
    public String optionsJson;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the monitoring task.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2c8dbdf9-a3ab-46a1-85a4-f094965e****</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>The name of the monitoring task. The name must be 4 to 100 characters in length and can contain letters, digits, underscores (_), and Chinese characters.</p>
     * 
     * <strong>example:</strong>
     * <p>HanZhou_ECS2</p>
     */
    @NameInMap("TaskName")
    public String taskName;

    public static ModifySiteMonitorRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifySiteMonitorRequest self = new ModifySiteMonitorRequest();
        return TeaModel.build(map, self);
    }

    public ModifySiteMonitorRequest setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public ModifySiteMonitorRequest setAlertIds(String alertIds) {
        this.alertIds = alertIds;
        return this;
    }
    public String getAlertIds() {
        return this.alertIds;
    }

    public ModifySiteMonitorRequest setCustomSchedule(String customSchedule) {
        this.customSchedule = customSchedule;
        return this;
    }
    public String getCustomSchedule() {
        return this.customSchedule;
    }

    public ModifySiteMonitorRequest setInterval(String interval) {
        this.interval = interval;
        return this;
    }
    public String getInterval() {
        return this.interval;
    }

    public ModifySiteMonitorRequest setIntervalUnit(String intervalUnit) {
        this.intervalUnit = intervalUnit;
        return this;
    }
    public String getIntervalUnit() {
        return this.intervalUnit;
    }

    public ModifySiteMonitorRequest setIspCities(String ispCities) {
        this.ispCities = ispCities;
        return this;
    }
    public String getIspCities() {
        return this.ispCities;
    }

    public ModifySiteMonitorRequest setOptionsJson(String optionsJson) {
        this.optionsJson = optionsJson;
        return this;
    }
    public String getOptionsJson() {
        return this.optionsJson;
    }

    public ModifySiteMonitorRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifySiteMonitorRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public ModifySiteMonitorRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

}
