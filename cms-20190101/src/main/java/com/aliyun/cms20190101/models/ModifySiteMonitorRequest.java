// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class ModifySiteMonitorRequest extends TeaModel {
    /**
     * <p>The URL or IP address that is monitored by the task.</p>
     */
    @NameInMap("Address")
    public String address;

    /**
     * <p>The ID of the alert rule. You can call the DescribeMetricRuleList operation to query the IDs of existing alert rules in CloudMonitor. For more information, see [DescribeMetricRuleList](~~114941~~).</p>
     */
    @NameInMap("AlertIds")
    public String alertIds;

    /**
     * <p>The custom detection period. You can only select a time period from Monday to Sunday for detection.</p>
     */
    @NameInMap("CustomSchedule")
    public String customSchedule;

    /**
     * <p>The interval at which detection requests are sent. Valid values: 1, 5, and 15. Unit: minutes. Default value: 1.</p>
     */
    @NameInMap("Interval")
    public String interval;

    /**
     * <p>The unit of the metric.</p>
     * <br>
     * <p>Unit: milliseconds.</p>
     */
    @NameInMap("IntervalUnit")
    public String intervalUnit;

    /**
     * <p>The information of the detection points. The value is a JSON array. Example: `[{"city":"546","isp":"465"},{"city":"572","isp":"465"},{"city":"738","isp":"465"}]`. The values of the `city` field indicate Beijing, Hangzhou, and Qingdao.</p>
     * <br>
     * <p>> You can call the DescribeSiteMonitorISPCityList operation to query the detection points. For more information, see [DescribeSiteMonitorISPCityList](~~115045~~). If you leave this parameter empty, the system randomly selects three detection points.</p>
     */
    @NameInMap("IspCities")
    public String ispCities;

    /**
     * <p>The extended options of the protocol that is used by the site monitoring task. The options vary based on the protocol.</p>
     */
    @NameInMap("OptionsJson")
    public String optionsJson;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the site monitoring task.</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>The name of the site monitoring task. The name must be 4 to 100 characters in length, and can contain letters, digits, and underscores (\_).</p>
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
