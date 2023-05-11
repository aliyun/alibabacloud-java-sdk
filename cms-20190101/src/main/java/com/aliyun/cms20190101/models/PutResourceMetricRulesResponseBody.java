// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class PutResourceMetricRulesResponseBody extends TeaModel {
    /**
     * <p>The callback URL to which a POST request is sent when an alert is triggered based on the alert rule.</p>
     * <br>
     * <p>Valid values of N: 1 to 500.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("FailedListResult")
    public PutResourceMetricRulesResponseBodyFailedListResult failedListResult;

    /**
     * <p>The ID of the alert rule.</p>
     * <br>
     * <p>Valid values of N: 1 to 500.</p>
     * <br>
     * <p>You can specify a new ID or the ID of an existing alert rule. For information about how to query the ID of an alert rule, see [DescribeMetricRuleList](~~114941~~).</p>
     * <br>
     * <p>>  If you specify a new ID, you create a threshold-triggered alert rule.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The alert rule that failed to be created.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The key of the tag.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static PutResourceMetricRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PutResourceMetricRulesResponseBody self = new PutResourceMetricRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public PutResourceMetricRulesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public PutResourceMetricRulesResponseBody setFailedListResult(PutResourceMetricRulesResponseBodyFailedListResult failedListResult) {
        this.failedListResult = failedListResult;
        return this;
    }
    public PutResourceMetricRulesResponseBodyFailedListResult getFailedListResult() {
        return this.failedListResult;
    }

    public PutResourceMetricRulesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public PutResourceMetricRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PutResourceMetricRulesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class PutResourceMetricRulesResponseBodyFailedListResultTargetResult extends TeaModel {
        /**
         * <p>For more information about common request parameters, see [Common parameters](~~199331~~).</p>
         */
        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("Success")
        public Boolean success;

        public static PutResourceMetricRulesResponseBodyFailedListResultTargetResult build(java.util.Map<String, ?> map) throws Exception {
            PutResourceMetricRulesResponseBodyFailedListResultTargetResult self = new PutResourceMetricRulesResponseBodyFailedListResultTargetResult();
            return TeaModel.build(map, self);
        }

        public PutResourceMetricRulesResponseBodyFailedListResultTargetResult setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public PutResourceMetricRulesResponseBodyFailedListResultTargetResult setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public PutResourceMetricRulesResponseBodyFailedListResultTargetResult setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

    public static class PutResourceMetricRulesResponseBodyFailedListResultTarget extends TeaModel {
        /**
         * <p>The alert rules that failed to be created for the resource.</p>
         */
        @NameInMap("Result")
        public PutResourceMetricRulesResponseBodyFailedListResultTargetResult result;

        /**
         * <p>The statistical period of the metric.</p>
         * <br>
         * <p>Unit: seconds. The default value is the interval at which the monitoring data of the metric is collected.</p>
         * <br>
         * <p>Valid values of N: 1 to 500.</p>
         * <br>
         * <p>>  For information about how to query the statistical period of a metric, see [Appendix 1: Metrics](~~163515~~).</p>
         */
        @NameInMap("RuleId")
        public String ruleId;

        public static PutResourceMetricRulesResponseBodyFailedListResultTarget build(java.util.Map<String, ?> map) throws Exception {
            PutResourceMetricRulesResponseBodyFailedListResultTarget self = new PutResourceMetricRulesResponseBodyFailedListResultTarget();
            return TeaModel.build(map, self);
        }

        public PutResourceMetricRulesResponseBodyFailedListResultTarget setResult(PutResourceMetricRulesResponseBodyFailedListResultTargetResult result) {
            this.result = result;
            return this;
        }
        public PutResourceMetricRulesResponseBodyFailedListResultTargetResult getResult() {
            return this.result;
        }

        public PutResourceMetricRulesResponseBodyFailedListResultTarget setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

    }

    public static class PutResourceMetricRulesResponseBodyFailedListResult extends TeaModel {
        @NameInMap("Target")
        public java.util.List<PutResourceMetricRulesResponseBodyFailedListResultTarget> target;

        public static PutResourceMetricRulesResponseBodyFailedListResult build(java.util.Map<String, ?> map) throws Exception {
            PutResourceMetricRulesResponseBodyFailedListResult self = new PutResourceMetricRulesResponseBodyFailedListResult();
            return TeaModel.build(map, self);
        }

        public PutResourceMetricRulesResponseBodyFailedListResult setTarget(java.util.List<PutResourceMetricRulesResponseBodyFailedListResultTarget> target) {
            this.target = target;
            return this;
        }
        public java.util.List<PutResourceMetricRulesResponseBodyFailedListResultTarget> getTarget() {
            return this.target;
        }

    }

}
