// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CreateOrUpdateSilencePolicyResponseBody extends TeaModel {
    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // An array of silence policy objects.
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
        // The key of the matching condition.
        @NameInMap("Key")
        public String key;

        // The logical operator of the matching condition. Valid values:
        // 
        // *   `eq`: equal to.
        // *   `neq`: not equal to.
        // *   `in`: contains.
        // *   `nin`: does not contain.
        // *   `re`: regular expression match.
        // *   `nre`: regular expression mismatch.
        @NameInMap("Operator")
        public String operator;

        // The value of the matching condition.
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
        // An array of matching condition objects.
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
        // The ID of the silence policy.
        @NameInMap("Id")
        public Long id;

        // An array of matching rule objects.
        @NameInMap("MatchingRules")
        public java.util.List<CreateOrUpdateSilencePolicyResponseBodySilencePolicyMatchingRules> matchingRules;

        // The name of the silence policy.
        @NameInMap("Name")
        public String name;

        public static CreateOrUpdateSilencePolicyResponseBodySilencePolicy build(java.util.Map<String, ?> map) throws Exception {
            CreateOrUpdateSilencePolicyResponseBodySilencePolicy self = new CreateOrUpdateSilencePolicyResponseBodySilencePolicy();
            return TeaModel.build(map, self);
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

    }

}
