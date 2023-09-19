// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class CreateSiteMonitorRequest extends TeaModel {
    /**
     * <p>The URL or IP address that is monitored by the task.</p>
     */
    @NameInMap("Address")
    public String address;

    /**
     * <p>The ID of the alert rule.</p>
     * <br>
     * <p>For more information about how to obtain the ID of an alert rule, see [DescribeMetricRuleList](~~114941~~).</p>
     */
    @NameInMap("AlertIds")
    public String alertIds;

    /**
     * <p>The custom detection period. You can only select a time period from Monday to Sunday for detection.</p>
     */
    @NameInMap("CustomSchedule")
    public String customSchedule;

    /**
     * <p>The interval at which detection requests are sent.</p>
     * <br>
     * <p>Valid values: 1, 5, 15, 30, and 60. Unit: minutes.</p>
     * <br>
     * <p>Default value: 1.</p>
     */
    @NameInMap("Interval")
    public String interval;

    /**
     * <p>The information of the detection points. If you leave this parameter empty, the system randomly selects three detection points.</p>
     * <br>
     * <p>The value is a JSON array. Example: `[{"city":"546","isp":"465"},{"city":"572","isp":"465"},{"city":"738","isp":"465"}]`. The values of the city field indicate Beijing, Hangzhou, and Qingdao.</p>
     * <br>
     * <p>For information about how to obtain detection points, see [DescribeSiteMonitorISPCityList](~~115045~~).</p>
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
     * <p>The name of the site monitoring task.</p>
     * <br>
     * <p>The name must be 4 to 100 characters in length, and can contain letters, digits, and underscores (\_).</p>
     */
    @NameInMap("TaskName")
    public String taskName;

    /**
     * <p>The type of the site monitoring task.</p>
     * <br>
     * <p>Valid values: HTTP, HTTPS, PING, TCP, UDP, DNS, SMTP, POP3, and FTP.</p>
     */
    @NameInMap("TaskType")
    public String taskType;

    public static CreateSiteMonitorRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSiteMonitorRequest self = new CreateSiteMonitorRequest();
        return TeaModel.build(map, self);
    }

    public CreateSiteMonitorRequest setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public CreateSiteMonitorRequest setAlertIds(String alertIds) {
        this.alertIds = alertIds;
        return this;
    }
    public String getAlertIds() {
        return this.alertIds;
    }

    public CreateSiteMonitorRequest setCustomSchedule(String customSchedule) {
        this.customSchedule = customSchedule;
        return this;
    }
    public String getCustomSchedule() {
        return this.customSchedule;
    }

    public CreateSiteMonitorRequest setInterval(String interval) {
        this.interval = interval;
        return this;
    }
    public String getInterval() {
        return this.interval;
    }

    public CreateSiteMonitorRequest setIspCities(String ispCities) {
        this.ispCities = ispCities;
        return this;
    }
    public String getIspCities() {
        return this.ispCities;
    }

    public CreateSiteMonitorRequest setOptionsJson(String optionsJson) {
        this.optionsJson = optionsJson;
        return this;
    }
    public String getOptionsJson() {
        return this.optionsJson;
    }

    public CreateSiteMonitorRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateSiteMonitorRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

    public CreateSiteMonitorRequest setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

}
