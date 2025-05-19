// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20180308.models;

import com.aliyun.tea.*;

public class CreateTaskRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://www.aliyun.com">http://www.aliyun.com</a></p>
     */
    @NameInMap("Address")
    public String address;

    @NameInMap("AlertIds")
    public String alertIds;

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
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;city&quot;:&quot;546&quot;,&quot;isp&quot;:&quot;465&quot;},{&quot;city&quot;:&quot;572&quot;,&quot;isp&quot;:&quot;465&quot;},{&quot;city&quot;:&quot;738&quot;,&quot;isp&quot;:&quot;465&quot;}]</p>
     */
    @NameInMap("IspCity")
    public String ispCity;

    /**
     * <strong>example:</strong>
     * <p>{&quot;http_method&quot;:&quot;get&quot;,&quot;header&quot;:&quot;xx=bb&quot;,&quot;cookie&quot;:&quot;test=aa&quot;,&quot;time_out&quot;:30000,&quot;match_rule&quot;:0,&quot;response_content&quot;:&quot;aa&quot;}</p>
     */
    @NameInMap("Options")
    public String options;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>aliyunTest</p>
     */
    @NameInMap("TaskName")
    public String taskName;

    /**
     * <p>1.http
     * 2.ping
     * 3.tcp
     * 4.udp
     * 5.dns
     * 6.smtp
     * 7.pop3
     * 8.ftp</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TaskType")
    public String taskType;

    @NameInMap("caller")
    public String caller;

    public static CreateTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTaskRequest self = new CreateTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateTaskRequest setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public CreateTaskRequest setAlertIds(String alertIds) {
        this.alertIds = alertIds;
        return this;
    }
    public String getAlertIds() {
        return this.alertIds;
    }

    public CreateTaskRequest setAlertRule(String alertRule) {
        this.alertRule = alertRule;
        return this;
    }
    public String getAlertRule() {
        return this.alertRule;
    }

    public CreateTaskRequest setInterval(String interval) {
        this.interval = interval;
        return this;
    }
    public String getInterval() {
        return this.interval;
    }

    public CreateTaskRequest setIntervalUnit(String intervalUnit) {
        this.intervalUnit = intervalUnit;
        return this;
    }
    public String getIntervalUnit() {
        return this.intervalUnit;
    }

    public CreateTaskRequest setIspCity(String ispCity) {
        this.ispCity = ispCity;
        return this;
    }
    public String getIspCity() {
        return this.ispCity;
    }

    public CreateTaskRequest setOptions(String options) {
        this.options = options;
        return this;
    }
    public String getOptions() {
        return this.options;
    }

    public CreateTaskRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateTaskRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

    public CreateTaskRequest setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

    public CreateTaskRequest setCaller(String caller) {
        this.caller = caller;
        return this;
    }
    public String getCaller() {
        return this.caller;
    }

}
