// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class ListResponseRuleFieldsResponseBody extends TeaModel {
    /**
     * <p>The list of response rule fields.</p>
     */
    @NameInMap("ListResponseRuleFields")
    public java.util.List<ListResponseRuleFieldsResponseBodyListResponseRuleFields> listResponseRuleFields;

    /**
     * <p>The maximum number of entries to return in this request.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token for the next query. Valid values: leave this parameter empty for the first query or if no more results exist. If a next query exists, set this parameter to the NextToken value returned by the previous API call.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAUqcj6VO4E3ECWIrFczs****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6276D891-*****-55B2-87B9-74D413F7****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListResponseRuleFieldsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListResponseRuleFieldsResponseBody self = new ListResponseRuleFieldsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListResponseRuleFieldsResponseBody setListResponseRuleFields(java.util.List<ListResponseRuleFieldsResponseBodyListResponseRuleFields> listResponseRuleFields) {
        this.listResponseRuleFields = listResponseRuleFields;
        return this;
    }
    public java.util.List<ListResponseRuleFieldsResponseBodyListResponseRuleFields> getListResponseRuleFields() {
        return this.listResponseRuleFields;
    }

    public ListResponseRuleFieldsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListResponseRuleFieldsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListResponseRuleFieldsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListResponseRuleFieldsResponseBodyListResponseRuleFieldsRightValue extends TeaModel {
        /**
         * <p>The right-side value.</p>
         * 
         * <strong>example:</strong>
         * <p>dev_selectdb_cluster</p>
         */
        @NameInMap("Value")
        public String value;

        /**
         * <p>The display name of the enumeration value.</p>
         * 
         * <strong>example:</strong>
         * <p>high</p>
         */
        @NameInMap("ValueName")
        public String valueName;

        public static ListResponseRuleFieldsResponseBodyListResponseRuleFieldsRightValue build(java.util.Map<String, ?> map) throws Exception {
            ListResponseRuleFieldsResponseBodyListResponseRuleFieldsRightValue self = new ListResponseRuleFieldsResponseBodyListResponseRuleFieldsRightValue();
            return TeaModel.build(map, self);
        }

        public ListResponseRuleFieldsResponseBodyListResponseRuleFieldsRightValue setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public ListResponseRuleFieldsResponseBodyListResponseRuleFieldsRightValue setValueName(String valueName) {
            this.valueName = valueName;
            return this;
        }
        public String getValueName() {
            return this.valueName;
        }

    }

    public static class ListResponseRuleFieldsResponseBodyListResponseRuleFieldsSupportOperators extends TeaModel {
        /**
         * <p>Indicates whether a right-side value is required. Valid values:</p>
         * <ul>
         * <li>true: Required.</li>
         * <li>false: Not required.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("HasRightValue")
        public String hasRightValue;

        /**
         * <p>The position of the operator in the operator list.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Index")
        public Integer index;

        /**
         * <p>The aggregation method for the dispatch rule condition. Valid values:</p>
         * <ul>
         * <li><code>=</code>: equal to</li>
         * <li><code>&lt;&gt;</code>: not equal to</li>
         * <li><code>in</code>: contains</li>
         * <li><code>not in</code>: does not contain</li>
         * <li><code>REGEXP</code>: matches the regular expression</li>
         * <li><code>NOT REGEXP</code>: does not match the regular expression</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>BETWEEN</p>
         */
        @NameInMap("Operator")
        public String operator;

        /**
         * <p>The display name of the operator.</p>
         * 
         * <strong>example:</strong>
         * <p>autotest-operator</p>
         */
        @NameInMap("OperatorName")
        public String operatorName;

        /**
         * <p>The data types supported by the current operator, separated by commas.</p>
         * 
         * <strong>example:</strong>
         * <p>ip</p>
         */
        @NameInMap("SupportDataType")
        public String supportDataType;

        public static ListResponseRuleFieldsResponseBodyListResponseRuleFieldsSupportOperators build(java.util.Map<String, ?> map) throws Exception {
            ListResponseRuleFieldsResponseBodyListResponseRuleFieldsSupportOperators self = new ListResponseRuleFieldsResponseBodyListResponseRuleFieldsSupportOperators();
            return TeaModel.build(map, self);
        }

        public ListResponseRuleFieldsResponseBodyListResponseRuleFieldsSupportOperators setHasRightValue(String hasRightValue) {
            this.hasRightValue = hasRightValue;
            return this;
        }
        public String getHasRightValue() {
            return this.hasRightValue;
        }

        public ListResponseRuleFieldsResponseBodyListResponseRuleFieldsSupportOperators setIndex(Integer index) {
            this.index = index;
            return this;
        }
        public Integer getIndex() {
            return this.index;
        }

        public ListResponseRuleFieldsResponseBodyListResponseRuleFieldsSupportOperators setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public ListResponseRuleFieldsResponseBodyListResponseRuleFieldsSupportOperators setOperatorName(String operatorName) {
            this.operatorName = operatorName;
            return this;
        }
        public String getOperatorName() {
            return this.operatorName;
        }

        public ListResponseRuleFieldsResponseBodyListResponseRuleFieldsSupportOperators setSupportDataType(String supportDataType) {
            this.supportDataType = supportDataType;
            return this;
        }
        public String getSupportDataType() {
            return this.supportDataType;
        }

    }

    public static class ListResponseRuleFieldsResponseBodyListResponseRuleFields extends TeaModel {
        /**
         * <p>The data type of the automated response rule condition field.</p>
         * 
         * <strong>example:</strong>
         * <p>ip</p>
         */
        @NameInMap("DataType")
        public String dataType;

        /**
         * <p>The whitelisted field.</p>
         * 
         * <strong>example:</strong>
         * <p>appname</p>
         */
        @NameInMap("Field")
        public String field;

        /**
         * <p>The name of the rule field.</p>
         * 
         * <strong>example:</strong>
         * <p>OriginIP,ConsoleLog,CPUTime,Duration,ErrorCode,ErrorMessage,ResponseSize,ResponseStatus,RoutineName,ClientRequestID,LogTimestamp,FetchStatus,SubRequestID</p>
         */
        @NameInMap("FieldName")
        public String fieldName;

        /**
         * <p>The normalization object type to which the field belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>alert</p>
         */
        @NameInMap("FieldNormalization")
        public String fieldNormalization;

        /**
         * <p>The list of optional enumeration values for the field. This parameter is not returned if no enumeration values are available.</p>
         */
        @NameInMap("RightValue")
        public java.util.List<ListResponseRuleFieldsResponseBodyListResponseRuleFieldsRightValue> rightValue;

        /**
         * <p>The English descriptions of the operators.</p>
         */
        @NameInMap("SupportOperators")
        public java.util.List<ListResponseRuleFieldsResponseBodyListResponseRuleFieldsSupportOperators> supportOperators;

        public static ListResponseRuleFieldsResponseBodyListResponseRuleFields build(java.util.Map<String, ?> map) throws Exception {
            ListResponseRuleFieldsResponseBodyListResponseRuleFields self = new ListResponseRuleFieldsResponseBodyListResponseRuleFields();
            return TeaModel.build(map, self);
        }

        public ListResponseRuleFieldsResponseBodyListResponseRuleFields setDataType(String dataType) {
            this.dataType = dataType;
            return this;
        }
        public String getDataType() {
            return this.dataType;
        }

        public ListResponseRuleFieldsResponseBodyListResponseRuleFields setField(String field) {
            this.field = field;
            return this;
        }
        public String getField() {
            return this.field;
        }

        public ListResponseRuleFieldsResponseBodyListResponseRuleFields setFieldName(String fieldName) {
            this.fieldName = fieldName;
            return this;
        }
        public String getFieldName() {
            return this.fieldName;
        }

        public ListResponseRuleFieldsResponseBodyListResponseRuleFields setFieldNormalization(String fieldNormalization) {
            this.fieldNormalization = fieldNormalization;
            return this;
        }
        public String getFieldNormalization() {
            return this.fieldNormalization;
        }

        public ListResponseRuleFieldsResponseBodyListResponseRuleFields setRightValue(java.util.List<ListResponseRuleFieldsResponseBodyListResponseRuleFieldsRightValue> rightValue) {
            this.rightValue = rightValue;
            return this;
        }
        public java.util.List<ListResponseRuleFieldsResponseBodyListResponseRuleFieldsRightValue> getRightValue() {
            return this.rightValue;
        }

        public ListResponseRuleFieldsResponseBodyListResponseRuleFields setSupportOperators(java.util.List<ListResponseRuleFieldsResponseBodyListResponseRuleFieldsSupportOperators> supportOperators) {
            this.supportOperators = supportOperators;
            return this;
        }
        public java.util.List<ListResponseRuleFieldsResponseBodyListResponseRuleFieldsSupportOperators> getSupportOperators() {
            return this.supportOperators;
        }

    }

}
