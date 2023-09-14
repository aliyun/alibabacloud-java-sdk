// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class TimeTrigger extends TeaModel {
    /**
     * <p>结束时间戳。单位为毫秒。</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>定时任务触发操作失败后，在此时间内重试。单位为秒，取值范围：0~3600。</p>
     */
    @NameInMap("LaunchExpirationTime")
    public Integer launchExpirationTime;

    /**
     * <p>启动时间。</p>
     */
    @NameInMap("LaunchTime")
    public String launchTime;

    /**
     * <p>指定时间规则的执行类型。</p>
     */
    @NameInMap("RecurrenceType")
    public String recurrenceType;

    /**
     * <p>重复执行定时任务的数值。具体取值取决于 recurrenceType 设置。</p>
     * <p>- recurrenceType 取 MINUTELY 时，只能填一个数值，取值范围：1~1440。</p>
     * <p>- recurrenceType 取 HOURLY 时，只能填一个数值，取值范围：1~24。</p>
     * <p>- recurrenceType 取 DAILY 时，只能填一个数值，取值范围：1~31。</p>
     * <p>- recurrenceType 取 WEEKLY 时，可以填入多个值，填多个值时使用英文逗号（,）分隔。周一到周天分别用MON，TUE，WED，THU，FRI，SAT，SUN代替。 比如 MON,FRI,SUN 代表周一、周五、周天。</p>
     * <p>- recurrenceType 取 MONTHLY 时，格式为A-B或者A,B。A、B的取值范围为1~31，如果使用A-B时B必须大于A。</p>
     */
    @NameInMap("RecurrenceValue")
    public String recurrenceValue;

    /**
     * <p>开始时间戳。单位为毫秒。</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    public static TimeTrigger build(java.util.Map<String, ?> map) throws Exception {
        TimeTrigger self = new TimeTrigger();
        return TeaModel.build(map, self);
    }

    public TimeTrigger setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public TimeTrigger setLaunchExpirationTime(Integer launchExpirationTime) {
        this.launchExpirationTime = launchExpirationTime;
        return this;
    }
    public Integer getLaunchExpirationTime() {
        return this.launchExpirationTime;
    }

    public TimeTrigger setLaunchTime(String launchTime) {
        this.launchTime = launchTime;
        return this;
    }
    public String getLaunchTime() {
        return this.launchTime;
    }

    public TimeTrigger setRecurrenceType(String recurrenceType) {
        this.recurrenceType = recurrenceType;
        return this;
    }
    public String getRecurrenceType() {
        return this.recurrenceType;
    }

    public TimeTrigger setRecurrenceValue(String recurrenceValue) {
        this.recurrenceValue = recurrenceValue;
        return this;
    }
    public String getRecurrenceValue() {
        return this.recurrenceValue;
    }

    public TimeTrigger setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
