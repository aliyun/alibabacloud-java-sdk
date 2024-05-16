// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class GetAutoScalingConfigurationResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public GetAutoScalingConfigurationResponseBodyData data;

    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("DurationMinutes")
        public Long durationMinutes;

        @NameInMap("Enable")
        public Boolean enable;

        @NameInMap("EstimatedElasticScalingDownTimeSecs")
        public Long estimatedElasticScalingDownTimeSecs;

        @NameInMap("EstimatedElasticScalingUpTimeSecs")
        public Long estimatedElasticScalingUpTimeSecs;

        @NameInMap("FirstScheduledTime")
        public Long firstScheduledTime;

        @NameInMap("RepeatType")
        public String repeatType;

        @NameInMap("ReservedPubFlow")
        public Long reservedPubFlow;

        @NameInMap("ReservedSubFlow")
        public Long reservedSubFlow;

        @NameInMap("RuleId")
        public Long ruleId;

        @NameInMap("RuleName")
        public String ruleName;

        @NameInMap("ScheduleType")
        public String scheduleType;

        @NameInMap("TimeZone")
        public String timeZone;

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
