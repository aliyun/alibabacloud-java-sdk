// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class TraceSiteResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9574AFDC-ABF1-5068-AAE3-6958CEBD8740</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The HTTP status code of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("StatusCode")
    public Integer statusCode;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The trace information of the call chain.</p>
     */
    @NameInMap("Trace")
    public java.util.List<TraceSiteResponseBodyTrace> trace;

    public static TraceSiteResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TraceSiteResponseBody self = new TraceSiteResponseBody();
        return TeaModel.build(map, self);
    }

    public TraceSiteResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public TraceSiteResponseBody setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TraceSiteResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public TraceSiteResponseBody setTrace(java.util.List<TraceSiteResponseBodyTrace> trace) {
        this.trace = trace;
        return this;
    }
    public java.util.List<TraceSiteResponseBodyTrace> getTrace() {
        return this.trace;
    }

    public static class TraceSiteResponseBodyTraceTrace extends TeaModel {
        /**
         * <p>The action to perform.</p>
         * 
         * <strong>example:</strong>
         * <p>deny</p>
         */
        @NameInMap("Action")
        public String action;

        /**
         * <p>The configuration type.</p>
         * 
         * <strong>example:</strong>
         * <p>rule</p>
         */
        @NameInMap("ConfigType")
        public String configType;

        /**
         * <p>The mitigation capability (China).</p>
         * 
         * <strong>example:</strong>
         * <p>cn300</p>
         */
        @NameInMap("DdosLevelDomestic")
        public String ddosLevelDomestic;

        /**
         * <p>The mitigation capability (global, excluding China).</p>
         * 
         * <strong>example:</strong>
         * <p>unlimit</p>
         */
        @NameInMap("DdosLevelOversea")
        public String ddosLevelOversea;

        /**
         * <p>The environment.</p>
         * 
         * <strong>example:</strong>
         * <p>Production</p>
         */
        @NameInMap("EnvName")
        public String envName;

        /**
         * <p>The rule expression.</p>
         * 
         * <strong>example:</strong>
         * <p>(ip.geoip.country eq \&quot;CN\&quot;)</p>
         */
        @NameInMap("Expression")
        public String expression;

        /**
         * <p>The mitigation capability.</p>
         * 
         * <strong>example:</strong>
         * <p>week</p>
         */
        @NameInMap("Level")
        public String level;

        /**
         * <p>The load balancer domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>Ib.test.example.com</p>
         */
        @NameInMap("LoadBalancerName")
        public String loadBalancerName;

        /**
         * <p>The name of the origin pool.</p>
         * 
         * <strong>example:</strong>
         * <p>21212.origin-pool.example.com</p>
         */
        @NameInMap("OriginPoolName")
        public String originPoolName;

        /**
         * <p>The routine ID.</p>
         * 
         * <strong>example:</strong>
         * <p>test.1097011697834102</p>
         */
        @NameInMap("RoutineId")
        public String routineId;

        /**
         * <p>The security rule ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1297141</p>
         */
        @NameInMap("RuleId")
        public Integer ruleId;

        /**
         * <p>The name of the matched rule.</p>
         * 
         * <strong>example:</strong>
         * <p>cache_test</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>The version.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SiteVersion")
        public Integer siteVersion;

        /**
         * <p>The security-related rule type.</p>
         * 
         * <strong>example:</strong>
         * <p>l4_ddos</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The value specified in the IP access rule.</p>
         * 
         * <strong>example:</strong>
         * <p>1.1.1.1</p>
         */
        @NameInMap("Value")
        public String value;

        public static TraceSiteResponseBodyTraceTrace build(java.util.Map<String, ?> map) throws Exception {
            TraceSiteResponseBodyTraceTrace self = new TraceSiteResponseBodyTraceTrace();
            return TeaModel.build(map, self);
        }

        public TraceSiteResponseBodyTraceTrace setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public TraceSiteResponseBodyTraceTrace setConfigType(String configType) {
            this.configType = configType;
            return this;
        }
        public String getConfigType() {
            return this.configType;
        }

        public TraceSiteResponseBodyTraceTrace setDdosLevelDomestic(String ddosLevelDomestic) {
            this.ddosLevelDomestic = ddosLevelDomestic;
            return this;
        }
        public String getDdosLevelDomestic() {
            return this.ddosLevelDomestic;
        }

        public TraceSiteResponseBodyTraceTrace setDdosLevelOversea(String ddosLevelOversea) {
            this.ddosLevelOversea = ddosLevelOversea;
            return this;
        }
        public String getDdosLevelOversea() {
            return this.ddosLevelOversea;
        }

        public TraceSiteResponseBodyTraceTrace setEnvName(String envName) {
            this.envName = envName;
            return this;
        }
        public String getEnvName() {
            return this.envName;
        }

        public TraceSiteResponseBodyTraceTrace setExpression(String expression) {
            this.expression = expression;
            return this;
        }
        public String getExpression() {
            return this.expression;
        }

        public TraceSiteResponseBodyTraceTrace setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public TraceSiteResponseBodyTraceTrace setLoadBalancerName(String loadBalancerName) {
            this.loadBalancerName = loadBalancerName;
            return this;
        }
        public String getLoadBalancerName() {
            return this.loadBalancerName;
        }

        public TraceSiteResponseBodyTraceTrace setOriginPoolName(String originPoolName) {
            this.originPoolName = originPoolName;
            return this;
        }
        public String getOriginPoolName() {
            return this.originPoolName;
        }

        public TraceSiteResponseBodyTraceTrace setRoutineId(String routineId) {
            this.routineId = routineId;
            return this;
        }
        public String getRoutineId() {
            return this.routineId;
        }

        public TraceSiteResponseBodyTraceTrace setRuleId(Integer ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Integer getRuleId() {
            return this.ruleId;
        }

        public TraceSiteResponseBodyTraceTrace setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public TraceSiteResponseBodyTraceTrace setSiteVersion(Integer siteVersion) {
            this.siteVersion = siteVersion;
            return this;
        }
        public Integer getSiteVersion() {
            return this.siteVersion;
        }

        public TraceSiteResponseBodyTraceTrace setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public TraceSiteResponseBodyTraceTrace setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class TraceSiteResponseBodyTrace extends TeaModel {
        /**
         * <p>Indicates whether the module is matched. Valid values: true and false.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Matched")
        public Boolean matched;

        /**
         * <p>The feature module.</p>
         * 
         * <strong>example:</strong>
         * <p>SecRules</p>
         */
        @NameInMap("StepModuleName")
        public String stepModuleName;

        /**
         * <p>The matching results of rules in the feature module.</p>
         */
        @NameInMap("Trace")
        public java.util.List<TraceSiteResponseBodyTraceTrace> trace;

        public static TraceSiteResponseBodyTrace build(java.util.Map<String, ?> map) throws Exception {
            TraceSiteResponseBodyTrace self = new TraceSiteResponseBodyTrace();
            return TeaModel.build(map, self);
        }

        public TraceSiteResponseBodyTrace setMatched(Boolean matched) {
            this.matched = matched;
            return this;
        }
        public Boolean getMatched() {
            return this.matched;
        }

        public TraceSiteResponseBodyTrace setStepModuleName(String stepModuleName) {
            this.stepModuleName = stepModuleName;
            return this;
        }
        public String getStepModuleName() {
            return this.stepModuleName;
        }

        public TraceSiteResponseBodyTrace setTrace(java.util.List<TraceSiteResponseBodyTraceTrace> trace) {
            this.trace = trace;
            return this;
        }
        public java.util.List<TraceSiteResponseBodyTraceTrace> getTrace() {
            return this.trace;
        }

    }

}
