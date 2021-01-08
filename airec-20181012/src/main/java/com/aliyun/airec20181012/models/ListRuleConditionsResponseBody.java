// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20181012.models;

import com.aliyun.tea.*;

public class ListRuleConditionsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<ListRuleConditionsResponseBodyResult> result;

    public static ListRuleConditionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRuleConditionsResponseBody self = new ListRuleConditionsResponseBody();
        return TeaModel.build(map, self);
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
        @NameInMap("SelectionOperation")
        public String selectionOperation;

        @NameInMap("SelectValue")
        public String selectValue;

        @NameInMap("SelectType")
        public String selectType;

        public static ListRuleConditionsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListRuleConditionsResponseBodyResult self = new ListRuleConditionsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListRuleConditionsResponseBodyResult setSelectionOperation(String selectionOperation) {
            this.selectionOperation = selectionOperation;
            return this;
        }
        public String getSelectionOperation() {
            return this.selectionOperation;
        }

        public ListRuleConditionsResponseBodyResult setSelectValue(String selectValue) {
            this.selectValue = selectValue;
            return this;
        }
        public String getSelectValue() {
            return this.selectValue;
        }

        public ListRuleConditionsResponseBodyResult setSelectType(String selectType) {
            this.selectType = selectType;
            return this;
        }
        public String getSelectType() {
            return this.selectType;
        }

    }

}
