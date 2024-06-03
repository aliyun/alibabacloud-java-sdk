// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class ByTimeScalingRule extends TeaModel {
    /**
     * <p>重复执行定时任务的结束时间戳。单位为毫秒。</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>定时任务触发操作失败后，在此时间内重试。单位为秒，取值范围：0~3600。</p>
     */
    @NameInMap("LaunchExpirationTime")
    public Integer launchExpirationTime;

    /**
     * <p>启动时间戳。单位为毫秒。</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("LaunchTime")
    public Long launchTime;

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

    public static ByTimeScalingRule build(java.util.Map<String, ?> map) throws Exception {
        ByTimeScalingRule self = new ByTimeScalingRule();
        return TeaModel.build(map, self);
    }

    public ByTimeScalingRule setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public ByTimeScalingRule setLaunchExpirationTime(Integer launchExpirationTime) {
        this.launchExpirationTime = launchExpirationTime;
        return this;
    }
    public Integer getLaunchExpirationTime() {
        return this.launchExpirationTime;
    }

    public ByTimeScalingRule setLaunchTime(Long launchTime) {
        this.launchTime = launchTime;
        return this;
    }
    public Long getLaunchTime() {
        return this.launchTime;
    }

    public ByTimeScalingRule setRecurrenceType(String recurrenceType) {
        this.recurrenceType = recurrenceType;
        return this;
    }
    public String getRecurrenceType() {
        return this.recurrenceType;
    }

    public ByTimeScalingRule setRecurrenceValue(String recurrenceValue) {
        this.recurrenceValue = recurrenceValue;
        return this;
    }
    public String getRecurrenceValue() {
        return this.recurrenceValue;
    }

}
