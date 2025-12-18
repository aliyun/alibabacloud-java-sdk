// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class ListConfigRuleOperatorsResponseBody extends TeaModel {
    @NameInMap("Operators")
    public java.util.List<ListConfigRuleOperatorsResponseBodyOperators> operators;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>A68DD98C-DE65-46AC-B2D2-04A4A9AB5B99</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListConfigRuleOperatorsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListConfigRuleOperatorsResponseBody self = new ListConfigRuleOperatorsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListConfigRuleOperatorsResponseBody setOperators(java.util.List<ListConfigRuleOperatorsResponseBodyOperators> operators) {
        this.operators = operators;
        return this;
    }
    public java.util.List<ListConfigRuleOperatorsResponseBodyOperators> getOperators() {
        return this.operators;
    }

    public ListConfigRuleOperatorsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListConfigRuleOperatorsResponseBodyOperators extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>String</p>
         */
        @NameInMap("DataType")
        public String dataType;

        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>StringEquals</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>StringEquals</p>
         */
        @NameInMap("Operator")
        public String operator;

        public static ListConfigRuleOperatorsResponseBodyOperators build(java.util.Map<String, ?> map) throws Exception {
            ListConfigRuleOperatorsResponseBodyOperators self = new ListConfigRuleOperatorsResponseBodyOperators();
            return TeaModel.build(map, self);
        }

        public ListConfigRuleOperatorsResponseBodyOperators setDataType(String dataType) {
            this.dataType = dataType;
            return this;
        }
        public String getDataType() {
            return this.dataType;
        }

        public ListConfigRuleOperatorsResponseBodyOperators setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListConfigRuleOperatorsResponseBodyOperators setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListConfigRuleOperatorsResponseBodyOperators setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

    }

}
