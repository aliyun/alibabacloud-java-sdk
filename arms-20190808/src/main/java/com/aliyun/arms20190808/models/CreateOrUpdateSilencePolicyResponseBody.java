// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CreateOrUpdateSilencePolicyResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>A5EC8221-08F2-4C95-9AF1-49FD998C****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The silence policy.</p>
     */
    @NameInMap("SilencePolicy")
    public CreateOrUpdateSilencePolicyResponseBodySilencePolicy silencePolicy;

    public static CreateOrUpdateSilencePolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateOrUpdateSilencePolicyResponseBody self = new CreateOrUpdateSilencePolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateOrUpdateSilencePolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateOrUpdateSilencePolicyResponseBody setSilencePolicy(CreateOrUpdateSilencePolicyResponseBodySilencePolicy silencePolicy) {
        this.silencePolicy = silencePolicy;
        return this;
    }
    public CreateOrUpdateSilencePolicyResponseBodySilencePolicy getSilencePolicy() {
        return this.silencePolicy;
    }

    public static class CreateOrUpdateSilencePolicyResponseBodySilencePolicyMatchingRulesMatchingConditions extends TeaModel {
        /**
         * <p>The key of the matching condition.</p>
         * 
         * <strong>example:</strong>
         * <p>altertname</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The logical operator of the matching condition. Valid values:</p>
         * <ul>
         * <li><code>eq</code>: equal to</li>
         * <li><code>neq</code>: not equal to</li>
         * <li><code>in</code>: contains</li>
         * <li><code>nin</code>: does not contain</li>
         * <li><code>re</code>: regular expression match</li>
         * <li><code>nre</code>: regular expression mismatch</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>eq</p>
         */
        @NameInMap("Operator")
        public String operator;

        /**
         * <p>The value of the matching condition.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateOrUpdateSilencePolicyResponseBodySilencePolicyMatchingRulesMatchingConditions build(java.util.Map<String, ?> map) throws Exception {
            CreateOrUpdateSilencePolicyResponseBodySilencePolicyMatchingRulesMatchingConditions self = new CreateOrUpdateSilencePolicyResponseBodySilencePolicyMatchingRulesMatchingConditions();
            return TeaModel.build(map, self);
        }

        public CreateOrUpdateSilencePolicyResponseBodySilencePolicyMatchingRulesMatchingConditions setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateOrUpdateSilencePolicyResponseBodySilencePolicyMatchingRulesMatchingConditions setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public CreateOrUpdateSilencePolicyResponseBodySilencePolicyMatchingRulesMatchingConditions setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateOrUpdateSilencePolicyResponseBodySilencePolicyMatchingRules extends TeaModel {
        /**
         * <p>A list of matching conditions.</p>
         */
        @NameInMap("MatchingConditions")
        public java.util.List<CreateOrUpdateSilencePolicyResponseBodySilencePolicyMatchingRulesMatchingConditions> matchingConditions;

        public static CreateOrUpdateSilencePolicyResponseBodySilencePolicyMatchingRules build(java.util.Map<String, ?> map) throws Exception {
            CreateOrUpdateSilencePolicyResponseBodySilencePolicyMatchingRules self = new CreateOrUpdateSilencePolicyResponseBodySilencePolicyMatchingRules();
            return TeaModel.build(map, self);
        }

        public CreateOrUpdateSilencePolicyResponseBodySilencePolicyMatchingRules setMatchingConditions(java.util.List<CreateOrUpdateSilencePolicyResponseBodySilencePolicyMatchingRulesMatchingConditions> matchingConditions) {
            this.matchingConditions = matchingConditions;
            return this;
        }
        public java.util.List<CreateOrUpdateSilencePolicyResponseBodySilencePolicyMatchingRulesMatchingConditions> getMatchingConditions() {
            return this.matchingConditions;
        }

    }

    public static class CreateOrUpdateSilencePolicyResponseBodySilencePolicy extends TeaModel {
        /**
         * <p>The effective type. Valid values: PERMANENT: The policy is effective permanently. CYCLE_EFFECT: The policy is effective cyclically. CUSTOM_TIME: The policy is effective during a custom time period.</p>
         * 
         * <strong>example:</strong>
         * <p>PERMANENT</p>
         */
        @NameInMap("EffectiveTimeType")
        public String effectiveTimeType;

        /**
         * <p>The ID of the silence policy.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>A list of matching rules.</p>
         */
        @NameInMap("MatchingRules")
        public java.util.List<CreateOrUpdateSilencePolicyResponseBodySilencePolicyMatchingRules> matchingRules;

        /**
         * <p>The name of the silence policy.</p>
         * 
         * <strong>example:</strong>
         * <p>silencepolicy_test</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Specifies whether to enable the silence policy. Valid values: enable and disable.</p>
         * 
         * <strong>example:</strong>
         * <p>enable</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <p>Effective period. Valid values: DAY: daily WEEK: weekly</p>
         * 
         * <strong>example:</strong>
         * <p>WEEK</p>
         */
        @NameInMap("TimePeriod")
        public String timePeriod;

        /**
         * <p>The time period during which the silence policy is effective.</p>
         * 
         * <strong>example:</strong>
         * <p>[{startWeek: &quot;1&quot;, startTime: &quot;00:00&quot;, endTime: &quot;11:59&quot;, endWeek:&quot;7&quot;}]</p>
         */
        @NameInMap("TimeSlots")
        public String timeSlots;

        public static CreateOrUpdateSilencePolicyResponseBodySilencePolicy build(java.util.Map<String, ?> map) throws Exception {
            CreateOrUpdateSilencePolicyResponseBodySilencePolicy self = new CreateOrUpdateSilencePolicyResponseBodySilencePolicy();
            return TeaModel.build(map, self);
        }

        public CreateOrUpdateSilencePolicyResponseBodySilencePolicy setEffectiveTimeType(String effectiveTimeType) {
            this.effectiveTimeType = effectiveTimeType;
            return this;
        }
        public String getEffectiveTimeType() {
            return this.effectiveTimeType;
        }

        public CreateOrUpdateSilencePolicyResponseBodySilencePolicy setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public CreateOrUpdateSilencePolicyResponseBodySilencePolicy setMatchingRules(java.util.List<CreateOrUpdateSilencePolicyResponseBodySilencePolicyMatchingRules> matchingRules) {
            this.matchingRules = matchingRules;
            return this;
        }
        public java.util.List<CreateOrUpdateSilencePolicyResponseBodySilencePolicyMatchingRules> getMatchingRules() {
            return this.matchingRules;
        }

        public CreateOrUpdateSilencePolicyResponseBodySilencePolicy setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateOrUpdateSilencePolicyResponseBodySilencePolicy setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public CreateOrUpdateSilencePolicyResponseBodySilencePolicy setTimePeriod(String timePeriod) {
            this.timePeriod = timePeriod;
            return this;
        }
        public String getTimePeriod() {
            return this.timePeriod;
        }

        public CreateOrUpdateSilencePolicyResponseBodySilencePolicy setTimeSlots(String timeSlots) {
            this.timeSlots = timeSlots;
            return this;
        }
        public String getTimeSlots() {
            return this.timeSlots;
        }

    }

}
