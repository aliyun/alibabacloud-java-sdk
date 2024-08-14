// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class InsertInterveneRuleResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public InsertInterveneRuleResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>DD656AF9-0839-521A-A3D2-F320009F9C87</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static InsertInterveneRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InsertInterveneRuleResponseBody self = new InsertInterveneRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public InsertInterveneRuleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public InsertInterveneRuleResponseBody setData(InsertInterveneRuleResponseBodyData data) {
        this.data = data;
        return this;
    }
    public InsertInterveneRuleResponseBodyData getData() {
        return this.data;
    }

    public InsertInterveneRuleResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public InsertInterveneRuleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public InsertInterveneRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public InsertInterveneRuleResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class InsertInterveneRuleResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>12345</p>
         */
        @NameInMap("RuleId")
        public Long ruleId;

        public static InsertInterveneRuleResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            InsertInterveneRuleResponseBodyData self = new InsertInterveneRuleResponseBodyData();
            return TeaModel.build(map, self);
        }

        public InsertInterveneRuleResponseBodyData setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
            return this.ruleId;
        }

    }

}
