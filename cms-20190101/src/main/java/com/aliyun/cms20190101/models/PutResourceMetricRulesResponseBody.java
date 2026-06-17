// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class PutResourceMetricRulesResponseBody extends TeaModel {
    /**
     * <p>状态码。</p>
     * <blockquote>
     * <p>200表示成功。</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("FailedListResult")
    public PutResourceMetricRulesResponseBodyFailedListResult failedListResult;

    /**
     * <p>错误信息。</p>
     * 
     * <strong>example:</strong>
     * <p>The request processing has failed due to some unknown error.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>请求ID。</p>
     * 
     * <strong>example:</strong>
     * <p>15D1440E-BF24-5A41-93E4-36864635179E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>操作是否成功。取值：</p>
     * <ul>
     * <li><p>true：成功。</p>
     * </li>
     * <li><p>false：失败。</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
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
        @NameInMap("Result")
        public PutResourceMetricRulesResponseBodyFailedListResultTargetResult result;

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
