// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20180308.models;

import com.aliyun.tea.*;

public class ModifyTaskRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p><a href="http://www.aliyun.com">http://www.aliyun.com</a></p>
     */
    @NameInMap("Address")
    public String address;

    /**
     * <strong>example:</strong>
     * <p>5e9b-4c12-b39e-7f277ac44b11</p>
     */
    @NameInMap("AlertIds")
    public String alertIds;

    /**
     * <strong>example:</strong>
     * <p>[{&quot;alarmActions&quot;:&quot;xxx&quot;,&quot;metricName&quot;:&quot;Availability&quot;,&quot;expression&quot;:&quot;$Availability&lt;96&quot;}]</p>
     */
    @NameInMap("AlertRule")
    public String alertRule;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Interval")
    public String interval;

    @NameInMap("IntervalUnit")
    public String intervalUnit;

    /**
     * <strong>example:</strong>
     * <p>[{&quot;city&quot;:&quot;546&quot;,&quot;isp&quot;:&quot;465&quot;},{&quot;city&quot;:&quot;572&quot;,&quot;isp&quot;:&quot;465&quot;},{&quot;city&quot;:&quot;738&quot;,&quot;isp&quot;:&quot;465&quot;}]</p>
     */
    @NameInMap("IspCity")
    public String ispCity;

    @NameInMap("Options")
    public String options;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>8f880e3d-d924-47ab-84d2-fa1a72e24211</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <strong>example:</strong>
     * <p>aliyunTest</p>
     */
    @NameInMap("TaskName")
    public String taskName;

    /**
     * <strong>example:</strong>
     * <p>cms</p>
     */
    @NameInMap("caller")
    public String caller;

    public static ModifyTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyTaskRequest self = new ModifyTaskRequest();
        return TeaModel.build(map, self);
    }

    public ModifyTaskRequest setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public ModifyTaskRequest setAlertIds(String alertIds) {
        this.alertIds = alertIds;
        return this;
    }
    public String getAlertIds() {
        return this.alertIds;
    }

    public ModifyTaskRequest setAlertRule(String alertRule) {
        this.alertRule = alertRule;
        return this;
    }
    public String getAlertRule() {
        return this.alertRule;
    }

    public ModifyTaskRequest setInterval(String interval) {
        this.interval = interval;
        return this;
    }
    public String getInterval() {
        return this.interval;
    }

    public ModifyTaskRequest setIntervalUnit(String intervalUnit) {
        this.intervalUnit = intervalUnit;
        return this;
    }
    public String getIntervalUnit() {
        return this.intervalUnit;
    }

    public ModifyTaskRequest setIspCity(String ispCity) {
        this.ispCity = ispCity;
        return this;
    }
    public String getIspCity() {
        return this.ispCity;
    }

    public ModifyTaskRequest setOptions(String options) {
        this.options = options;
        return this;
    }
    public String getOptions() {
        return this.options;
    }

    public ModifyTaskRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyTaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public ModifyTaskRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

    public ModifyTaskRequest setCaller(String caller) {
        this.caller = caller;
        return this;
    }
    public String getCaller() {
        return this.caller;
    }

}
