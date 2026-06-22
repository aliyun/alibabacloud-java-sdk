// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class TimeTrigger extends TeaModel {
    /**
     * <p>The timestamp that specifies the end time. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1639714800000</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The time period during which a scheduled task can be retried after it fails. Unit: seconds. Valid values: 0 to 3600.</p>
     * 
     * <strong>example:</strong>
     * <p>600</p>
     */
    @NameInMap("LaunchExpirationTime")
    public Integer launchExpirationTime;

    /**
     * <p>The execution time of the scaling rule. This parameter is required. The value is a string in the HH:MM format.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>17:30</p>
     */
    @NameInMap("LaunchTime")
    public String launchTime;

    /**
     * <p>The frequency of executing the specified rule whose trigger mode is scaling by time. Valid values:</p>
     * <ul>
     * <li>DAILY</li>
     * <li>WEEKLY</li>
     * <li>MONTHLY</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>WEEKLY</p>
     */
    @NameInMap("RecurrenceType")
    public String recurrenceType;

    /**
     * <p>The number of recurrences of the scheduled task. The value of this parameter depends on the value of RecurrenceType.</p>
     * <ul>
     * <li>If the RecurrenceType parameter is set to DAILY, you can specify only one value for this parameter. Valid values: 1 to 31.</li>
     * <li>If the RecurrenceType parameter is set to WEEKLY, you can specify multiple values for this parameter and separate them with commas (,). The values MON, TUE, WED, THU, FRI, SAT, and SUN indicate the days from Monday to Sunday. For example, the value MON,FRI,SUN stands for Monday, Friday, and Sunday.</li>
     * <li>If the RecurrenceType parameter is set to MONTHLY, the value of this parameter is in the A-B or A,B format. The values of A and B are both in the range of 1 to 31. If you use the A-B format, the value of B must be greater than the value of A.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>MON,FRI,SUN</p>
     */
    @NameInMap("RecurrenceValue")
    public String recurrenceValue;

    /**
     * <p>The timestamp that specifies the start time. This parameter is required. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1639714800000</p>
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
