// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class ListRuleTasksResponseBody extends TeaModel {
    /**
     * <p>Queries the status of a rule-specific task.</p>
     * 
     * <strong>example:</strong>
     * <p>InternalServerError</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The ID of the scene.</p>
     * 
     * <strong>example:</strong>
     * <p>An internal server error occurred</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The ID of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>8F81A922-6C81-46D6-B78C-CC35E16B1691</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The error message.</p>
     */
    @NameInMap("result")
    public ListRuleTasksResponseBodyResult result;

    public static ListRuleTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRuleTasksResponseBody self = new ListRuleTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRuleTasksResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListRuleTasksResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListRuleTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRuleTasksResponseBody setResult(ListRuleTasksResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public ListRuleTasksResponseBodyResult getResult() {
        return this.result;
    }

    public static class ListRuleTasksResponseBodyResult extends TeaModel {
        /**
         * <p>The ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("finishRate")
        public Integer finishRate;

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>1588240081</p>
         */
        @NameInMap("finishTime")
        public Integer finishTime;

        public static ListRuleTasksResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListRuleTasksResponseBodyResult self = new ListRuleTasksResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListRuleTasksResponseBodyResult setFinishRate(Integer finishRate) {
            this.finishRate = finishRate;
            return this;
        }
        public Integer getFinishRate() {
            return this.finishRate;
        }

        public ListRuleTasksResponseBodyResult setFinishTime(Integer finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public Integer getFinishTime() {
            return this.finishTime;
        }

    }

}
