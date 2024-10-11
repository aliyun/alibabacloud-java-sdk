// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class DescribeRuleResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>InternalServerError</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p><strong>null</strong></p>
     * 
     * <strong>example:</strong>
     * <p>An internal server error occurred</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>8F81A922-6C81-46D6-B78C-CC35E16B1691</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The ID of the rule.</p>
     */
    @NameInMap("result")
    public DescribeRuleResponseBodyResult result;

    public static DescribeRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRuleResponseBody self = new DescribeRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRuleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeRuleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRuleResponseBody setResult(DescribeRuleResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeRuleResponseBodyResult getResult() {
        return this.result;
    }

    public static class DescribeRuleResponseBodyResult extends TeaModel {
        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-04-27T06:38:28.000Z</p>
         */
        @NameInMap("gmtCreate")
        public String gmtCreate;

        /**
         * <p>The state of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-04-27T06:38:28.000Z</p>
         */
        @NameInMap("gmtModified")
        public String gmtModified;

        /**
         * <p>The time when the rule was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>98493A14-D619-4E88-9F8D-108939817F9F</p>
         */
        @NameInMap("ruleId")
        public String ruleId;

        /**
         * <p>The time when the rule was created.</p>
         * 
         * <strong>example:</strong>
         * <p>DRAFT</p>
         */
        @NameInMap("status")
        public String status;

        public static DescribeRuleResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeRuleResponseBodyResult self = new DescribeRuleResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeRuleResponseBodyResult setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeRuleResponseBodyResult setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DescribeRuleResponseBodyResult setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public DescribeRuleResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
