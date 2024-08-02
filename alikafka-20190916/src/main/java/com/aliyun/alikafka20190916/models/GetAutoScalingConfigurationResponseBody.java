// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class GetAutoScalingConfigurationResponseBody extends TeaModel {
    /**
     * <p>The response code. The value 200 indicates that the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Long code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public GetAutoScalingConfigurationResponseBodyData data;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>operation success.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>B7A39AE5-0B36-4442-A304-E0885265***</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetAutoScalingConfigurationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAutoScalingConfigurationResponseBody self = new GetAutoScalingConfigurationResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAutoScalingConfigurationResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public GetAutoScalingConfigurationResponseBody setData(GetAutoScalingConfigurationResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetAutoScalingConfigurationResponseBodyData getData() {
        return this.data;
    }

    public GetAutoScalingConfigurationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAutoScalingConfigurationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAutoScalingConfigurationResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetAutoScalingConfigurationResponseBodyDataScheduledScalingRulesScheduledScalingRulesWeeklyTypes extends TeaModel {
        @NameInMap("WeeklyTypes")
        public java.util.List<String> weeklyTypes;

        public static GetAutoScalingConfigurationResponseBodyDataScheduledScalingRulesScheduledScalingRulesWeeklyTypes build(java.util.Map<String, ?> map) throws Exception {
            GetAutoScalingConfigurationResponseBodyDataScheduledScalingRulesScheduledScalingRulesWeeklyTypes self = new GetAutoScalingConfigurationResponseBodyDataScheduledScalingRulesScheduledScalingRulesWeeklyTypes();
            return TeaModel.build(map, self);
        }

        public GetAutoScalingConfigurationResponseBodyDataScheduledScalingRulesScheduledScalingRulesWeeklyTypes setWeeklyTypes(java.util.List<String> weeklyTypes) {
            this.weeklyTypes = weeklyTypes;
            return this;
        }
        public java.util.List<String> getWeeklyTypes() {
            return this.weeklyTypes;
        }

    }

    public static class GetAutoScalingConfigurationResponseBodyDataScheduledScalingRulesScheduledScalingRules extends TeaModel {
        /**
         * <p>The duration of a scheduled scaling task. Unit: minutes.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("DurationMinutes")
        public Long durationMinutes;

        /**
         * <p>Indicates whether the scheduled scaling rule is enabled. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enable")
        public Boolean enable;

        /**
         * <p>The estimated scale-in duration. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>780</p>
         */
        @NameInMap("EstimatedElasticScalingDownTimeSecs")
        public Long estimatedElasticScalingDownTimeSecs;

        /**
         * <p>The estimated scale-out duration. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>780</p>
         */
        @NameInMap("EstimatedElasticScalingUpTimeSecs")
        public Long estimatedElasticScalingUpTimeSecs;

        /**
         * <p>The timestamp that indicates the start time of the scheduled scaling task.</p>
         * 
         * <strong>example:</strong>
         * <p>1714467540000</p>
         */
        @NameInMap("FirstScheduledTime")
        public Long firstScheduledTime;

        /**
         * <p>The frequency at which the scheduled scaling task is executed. This parameter is returned only if ScheduleType is set to repeat. Valid values:</p>
         * <ul>
         * <li><p>Daily: The scheduled scaling task is executed every day.</p>
         * </li>
         * <li><p>Weekly: The scheduled scaling task is executed every week.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Weekly</p>
         */
        @NameInMap("RepeatType")
        public String repeatType;

        /**
         * <p>The reserved production capacity for scheduled scaling. Unit: MB/s.</p>
         * 
         * <strong>example:</strong>
         * <p>120</p>
         */
        @NameInMap("ReservedPubFlow")
        public Long reservedPubFlow;

        /**
         * <p>The reserved consumption capacity for scheduled scaling. Unit: MB/s.</p>
         * 
         * <strong>example:</strong>
         * <p>120</p>
         */
        @NameInMap("ReservedSubFlow")
        public Long reservedSubFlow;

        /**
         * <p>The ID of the scheduled scaling rule.</p>
         * 
         * <strong>example:</strong>
         * <p>64</p>
         */
        @NameInMap("RuleId")
        public Long ruleId;

        /**
         * <p>The name of the scheduled scaling rule.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>The type of the scheduled scaling task. Valid values:</p>
         * <ul>
         * <li>at: The scheduled scaling task is executed only once.</li>
         * <li>repeat: The scheduled scaling task is repeatedly executed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>at</p>
         */
        @NameInMap("ScheduleType")
        public String scheduleType;

        /**
         * <p>The time zone in Coordinated Universal Time (UTC).</p>
         * 
         * <strong>example:</strong>
         * <p>GMT+8</p>
         */
        @NameInMap("TimeZone")
        public String timeZone;

        /**
         * <p>The day on which the scheduled scaling task is repeatedly executed. You can specify multiple days for this parameter.</p>
         */
        @NameInMap("WeeklyTypes")
        public GetAutoScalingConfigurationResponseBodyDataScheduledScalingRulesScheduledScalingRulesWeeklyTypes weeklyTypes;

        public static GetAutoScalingConfigurationResponseBodyDataScheduledScalingRulesScheduledScalingRules build(java.util.Map<String, ?> map) throws Exception {
            GetAutoScalingConfigurationResponseBodyDataScheduledScalingRulesScheduledScalingRules self = new GetAutoScalingConfigurationResponseBodyDataScheduledScalingRulesScheduledScalingRules();
            return TeaModel.build(map, self);
        }

        public GetAutoScalingConfigurationResponseBodyDataScheduledScalingRulesScheduledScalingRules setDurationMinutes(Long durationMinutes) {
            this.durationMinutes = durationMinutes;
            return this;
        }
        public Long getDurationMinutes() {
            return this.durationMinutes;
        }

        public GetAutoScalingConfigurationResponseBodyDataScheduledScalingRulesScheduledScalingRules setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public GetAutoScalingConfigurationResponseBodyDataScheduledScalingRulesScheduledScalingRules setEstimatedElasticScalingDownTimeSecs(Long estimatedElasticScalingDownTimeSecs) {
            this.estimatedElasticScalingDownTimeSecs = estimatedElasticScalingDownTimeSecs;
            return this;
        }
        public Long getEstimatedElasticScalingDownTimeSecs() {
            return this.estimatedElasticScalingDownTimeSecs;
        }

        public GetAutoScalingConfigurationResponseBodyDataScheduledScalingRulesScheduledScalingRules setEstimatedElasticScalingUpTimeSecs(Long estimatedElasticScalingUpTimeSecs) {
            this.estimatedElasticScalingUpTimeSecs = estimatedElasticScalingUpTimeSecs;
            return this;
        }
        public Long getEstimatedElasticScalingUpTimeSecs() {
            return this.estimatedElasticScalingUpTimeSecs;
        }

        public GetAutoScalingConfigurationResponseBodyDataScheduledScalingRulesScheduledScalingRules setFirstScheduledTime(Long firstScheduledTime) {
            this.firstScheduledTime = firstScheduledTime;
            return this;
        }
        public Long getFirstScheduledTime() {
            return this.firstScheduledTime;
        }

        public GetAutoScalingConfigurationResponseBodyDataScheduledScalingRulesScheduledScalingRules setRepeatType(String repeatType) {
            this.repeatType = repeatType;
            return this;
        }
        public String getRepeatType() {
            return this.repeatType;
        }

        public GetAutoScalingConfigurationResponseBodyDataScheduledScalingRulesScheduledScalingRules setReservedPubFlow(Long reservedPubFlow) {
            this.reservedPubFlow = reservedPubFlow;
            return this;
        }
        public Long getReservedPubFlow() {
            return this.reservedPubFlow;
        }

        public GetAutoScalingConfigurationResponseBodyDataScheduledScalingRulesScheduledScalingRules setReservedSubFlow(Long reservedSubFlow) {
            this.reservedSubFlow = reservedSubFlow;
            return this;
        }
        public Long getReservedSubFlow() {
            return this.reservedSubFlow;
        }

        public GetAutoScalingConfigurationResponseBodyDataScheduledScalingRulesScheduledScalingRules setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
            return this.ruleId;
        }

        public GetAutoScalingConfigurationResponseBodyDataScheduledScalingRulesScheduledScalingRules setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public GetAutoScalingConfigurationResponseBodyDataScheduledScalingRulesScheduledScalingRules setScheduleType(String scheduleType) {
            this.scheduleType = scheduleType;
            return this;
        }
        public String getScheduleType() {
            return this.scheduleType;
        }

        public GetAutoScalingConfigurationResponseBodyDataScheduledScalingRulesScheduledScalingRules setTimeZone(String timeZone) {
            this.timeZone = timeZone;
            return this;
        }
        public String getTimeZone() {
            return this.timeZone;
        }

        public GetAutoScalingConfigurationResponseBodyDataScheduledScalingRulesScheduledScalingRules setWeeklyTypes(GetAutoScalingConfigurationResponseBodyDataScheduledScalingRulesScheduledScalingRulesWeeklyTypes weeklyTypes) {
            this.weeklyTypes = weeklyTypes;
            return this;
        }
        public GetAutoScalingConfigurationResponseBodyDataScheduledScalingRulesScheduledScalingRulesWeeklyTypes getWeeklyTypes() {
            return this.weeklyTypes;
        }

    }

    public static class GetAutoScalingConfigurationResponseBodyDataScheduledScalingRules extends TeaModel {
        @NameInMap("ScheduledScalingRules")
        public java.util.List<GetAutoScalingConfigurationResponseBodyDataScheduledScalingRulesScheduledScalingRules> scheduledScalingRules;

        public static GetAutoScalingConfigurationResponseBodyDataScheduledScalingRules build(java.util.Map<String, ?> map) throws Exception {
            GetAutoScalingConfigurationResponseBodyDataScheduledScalingRules self = new GetAutoScalingConfigurationResponseBodyDataScheduledScalingRules();
            return TeaModel.build(map, self);
        }

        public GetAutoScalingConfigurationResponseBodyDataScheduledScalingRules setScheduledScalingRules(java.util.List<GetAutoScalingConfigurationResponseBodyDataScheduledScalingRulesScheduledScalingRules> scheduledScalingRules) {
            this.scheduledScalingRules = scheduledScalingRules;
            return this;
        }
        public java.util.List<GetAutoScalingConfigurationResponseBodyDataScheduledScalingRulesScheduledScalingRules> getScheduledScalingRules() {
            return this.scheduledScalingRules;
        }

    }

    public static class GetAutoScalingConfigurationResponseBodyData extends TeaModel {
        /**
         * <p>The scheduled scaling rules.</p>
         */
        @NameInMap("ScheduledScalingRules")
        public GetAutoScalingConfigurationResponseBodyDataScheduledScalingRules scheduledScalingRules;

        public static GetAutoScalingConfigurationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAutoScalingConfigurationResponseBodyData self = new GetAutoScalingConfigurationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAutoScalingConfigurationResponseBodyData setScheduledScalingRules(GetAutoScalingConfigurationResponseBodyDataScheduledScalingRules scheduledScalingRules) {
            this.scheduledScalingRules = scheduledScalingRules;
            return this;
        }
        public GetAutoScalingConfigurationResponseBodyDataScheduledScalingRules getScheduledScalingRules() {
            return this.scheduledScalingRules;
        }

    }

}
