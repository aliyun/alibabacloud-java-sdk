// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class CreateJobMonitorRuleRequest extends TeaModel {
    @NameInMap("DelayRuleTime")
    public Long delayRuleTime;

    @NameInMap("DtsJobId")
    public String dtsJobId;

    @NameInMap("NoticeValue")
    public Integer noticeValue;

    @NameInMap("Period")
    public Integer period;

    @NameInMap("Phone")
    public String phone;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("State")
    public String state;

    @NameInMap("Times")
    public Integer times;

    @NameInMap("Type")
    public String type;

    public static CreateJobMonitorRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateJobMonitorRuleRequest self = new CreateJobMonitorRuleRequest();
        return TeaModel.build(map, self);
    }

    public CreateJobMonitorRuleRequest setDelayRuleTime(Long delayRuleTime) {
        this.delayRuleTime = delayRuleTime;
        return this;
    }
    public Long getDelayRuleTime() {
        return this.delayRuleTime;
    }

    public CreateJobMonitorRuleRequest setDtsJobId(String dtsJobId) {
        this.dtsJobId = dtsJobId;
        return this;
    }
    public String getDtsJobId() {
        return this.dtsJobId;
    }

    public CreateJobMonitorRuleRequest setNoticeValue(Integer noticeValue) {
        this.noticeValue = noticeValue;
        return this;
    }
    public Integer getNoticeValue() {
        return this.noticeValue;
    }

    public CreateJobMonitorRuleRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public CreateJobMonitorRuleRequest setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    public String getPhone() {
        return this.phone;
    }

    public CreateJobMonitorRuleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateJobMonitorRuleRequest setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public CreateJobMonitorRuleRequest setTimes(Integer times) {
        this.times = times;
        return this;
    }
    public Integer getTimes() {
        return this.times;
    }

    public CreateJobMonitorRuleRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
