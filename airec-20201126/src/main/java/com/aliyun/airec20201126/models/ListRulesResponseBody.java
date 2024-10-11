// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class ListRulesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>InternalServerError</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>An internal server error occurred</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>8F81A922-6C81-46D6-B78C-CC35E16B1691</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public java.util.List<ListRulesResponseBodyResult> result;

    public static ListRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRulesResponseBody self = new ListRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRulesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListRulesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRulesResponseBody setResult(java.util.List<ListRulesResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListRulesResponseBodyResult> getResult() {
        return this.result;
    }

    public static class ListRulesResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2020-04-27T06:38:28.000Z</p>
         */
        @NameInMap("gmtCreate")
        public String gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>2020-04-27T06:38:28.000Z</p>
         */
        @NameInMap("gmtModified")
        public String gmtModified;

        /**
         * <strong>example:</strong>
         * <p>98493A14-D619-4E88-9F8D-108939817F9F</p>
         */
        @NameInMap("ruleId")
        public String ruleId;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("status")
        public String status;

        public static ListRulesResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListRulesResponseBodyResult self = new ListRulesResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListRulesResponseBodyResult setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListRulesResponseBodyResult setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListRulesResponseBodyResult setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public ListRulesResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
