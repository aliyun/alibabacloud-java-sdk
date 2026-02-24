// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class ListConfigRuleOperatorsResponseBody extends TeaModel {
    /**
     * <p>A list of operators.</p>
     */
    @NameInMap("Operators")
    public java.util.List<ListConfigRuleOperatorsResponseBodyOperators> operators;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>A68DD98C-DE65-46AC-B2D2-04A4A9AB****</p>
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
         * <p>The data type that the operator applies to.</p>
         * 
         * <strong>example:</strong>
         * <p>String</p>
         */
        @NameInMap("DataType")
        public String dataType;

        /**
         * <p>The description of the operator, which can be used to explain why a resource is non-compliant.</p>
         * 
         * <strong>example:</strong>
         * <p>The current value must equal the target value (case insensitive)</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the operator.</p>
         * 
         * <strong>example:</strong>
         * <p>StringEquals</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The operator for the rule\&quot;s input parameter. The available operators vary based on the data type retrieved using SelectPath.</p>
         * <ul>
         * <li><p>If the data type is String, valid values are:</p>
         * <ul>
         * <li><p>StringEquals: equals.</p>
         * </li>
         * <li><p>NotStringEquals: does not equal.</p>
         * </li>
         * <li><p>StringIn: is in.</p>
         * </li>
         * <li><p>NotStringIn: is not in.</p>
         * </li>
         * <li><p>StringContains: contains.</p>
         * </li>
         * <li><p>NotStringContains: does not contain.</p>
         * </li>
         * </ul>
         * </li>
         * <li><p>If the data type is Number, valid values are:</p>
         * <ul>
         * <li><p>Equals: equals.</p>
         * </li>
         * <li><p>NotEquals: does not equal.</p>
         * </li>
         * <li><p>Less: is less than.</p>
         * </li>
         * <li><p>LessOrEquals: is less than or equal to.</p>
         * </li>
         * <li><p>Greater: is greater than.</p>
         * </li>
         * <li><p>GreaterOrEquals: is greater than or equal to.</p>
         * </li>
         * </ul>
         * </li>
         * <li><p>If the data type is a Base64-encoded string, valid values are:</p>
         * <ul>
         * <li><p>Base64Contains: contains.</p>
         * </li>
         * <li><p>NotBase64Contains: does not contain.</p>
         * </li>
         * <li><p>Base64ContainsAll: contains all.</p>
         * </li>
         * <li><p>Base64ExcludeAll: excludes all.</p>
         * </li>
         * </ul>
         * </li>
         * <li><p>If the data type is Array, valid values are:</p>
         * <ul>
         * <li><p>Contains: contains.</p>
         * </li>
         * <li><p>NotContains: does not contain.</p>
         * </li>
         * <li><p>In: is in.</p>
         * </li>
         * <li><p>NotIn: is not in.</p>
         * </li>
         * <li><p>ContainsAll: contains all.</p>
         * </li>
         * <li><p>ExcludeAll: excludes all.</p>
         * </li>
         * <li><p>IsEmpty: is empty.</p>
         * </li>
         * </ul>
         * </li>
         * </ul>
         * 
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
