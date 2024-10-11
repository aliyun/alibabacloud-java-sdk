// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class ListRuleConditionsResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>InternalServerError</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>An internal server error occurred</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>8F81A922-6C81-46D6-B78C-CC35E16B1691</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The returned results.</p>
     */
    @NameInMap("result")
    public java.util.List<ListRuleConditionsResponseBodyResult> result;

    public static ListRuleConditionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRuleConditionsResponseBody self = new ListRuleConditionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRuleConditionsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListRuleConditionsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListRuleConditionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRuleConditionsResponseBody setResult(java.util.List<ListRuleConditionsResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListRuleConditionsResponseBodyResult> getResult() {
        return this.result;
    }

    public static class ListRuleConditionsResponseBodyResult extends TeaModel {
        /**
         * <p>The type of the filtering condition for the item selection rule.</p>
         * 
         * <strong>example:</strong>
         * <p>QUERY_ITEM_TYPE</p>
         */
        @NameInMap("selectType")
        public String selectType;

        /**
         * <p>The specific value of the filtering condition for the item selection rule.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("selectValue")
        public String selectValue;

        /**
         * <p>The operation on the filtering condition for the item selection rule.</p>
         * 
         * <strong>example:</strong>
         * <p>QUERY_VALUE_IN</p>
         */
        @NameInMap("selectionOperation")
        public String selectionOperation;

        public static ListRuleConditionsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListRuleConditionsResponseBodyResult self = new ListRuleConditionsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListRuleConditionsResponseBodyResult setSelectType(String selectType) {
            this.selectType = selectType;
            return this;
        }
        public String getSelectType() {
            return this.selectType;
        }

        public ListRuleConditionsResponseBodyResult setSelectValue(String selectValue) {
            this.selectValue = selectValue;
            return this;
        }
        public String getSelectValue() {
            return this.selectValue;
        }

        public ListRuleConditionsResponseBodyResult setSelectionOperation(String selectionOperation) {
            this.selectionOperation = selectionOperation;
            return this;
        }
        public String getSelectionOperation() {
            return this.selectionOperation;
        }

    }

}
