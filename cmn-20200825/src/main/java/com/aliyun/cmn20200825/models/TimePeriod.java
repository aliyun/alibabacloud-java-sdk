// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class TimePeriod extends TeaModel {
    @NameInMap("CronExpression")
    public String cronExpression;

    @NameInMap("GmtCreate")
    public String gmtCreate;

    @NameInMap("GmtModified")
    public String gmtModified;

    @NameInMap("Source")
    public String source;

    @NameInMap("TimePeriodDescription")
    public String timePeriodDescription;

    @NameInMap("TimePeriodId")
    public String timePeriodId;

    @NameInMap("TimePeriodName")
    public String timePeriodName;

    public static TimePeriod build(java.util.Map<String, ?> map) throws Exception {
        TimePeriod self = new TimePeriod();
        return TeaModel.build(map, self);
    }

    public TimePeriod setCronExpression(String cronExpression) {
        this.cronExpression = cronExpression;
        return this;
    }
    public String getCronExpression() {
        return this.cronExpression;
    }

    public TimePeriod setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public TimePeriod setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public TimePeriod setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public TimePeriod setTimePeriodDescription(String timePeriodDescription) {
        this.timePeriodDescription = timePeriodDescription;
        return this;
    }
    public String getTimePeriodDescription() {
        return this.timePeriodDescription;
    }

    public TimePeriod setTimePeriodId(String timePeriodId) {
        this.timePeriodId = timePeriodId;
        return this;
    }
    public String getTimePeriodId() {
        return this.timePeriodId;
    }

    public TimePeriod setTimePeriodName(String timePeriodName) {
        this.timePeriodName = timePeriodName;
        return this;
    }
    public String getTimePeriodName() {
        return this.timePeriodName;
    }

}
