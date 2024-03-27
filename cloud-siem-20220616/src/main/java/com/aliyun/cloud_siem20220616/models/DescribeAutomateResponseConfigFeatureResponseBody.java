// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeAutomateResponseConfigFeatureResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public java.util.List<DescribeAutomateResponseConfigFeatureResponseBodyData> data;

    /**
     * <p>The returned message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>*   true</p>
     * <p>*   false</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeAutomateResponseConfigFeatureResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAutomateResponseConfigFeatureResponseBody self = new DescribeAutomateResponseConfigFeatureResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAutomateResponseConfigFeatureResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeAutomateResponseConfigFeatureResponseBody setData(java.util.List<DescribeAutomateResponseConfigFeatureResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeAutomateResponseConfigFeatureResponseBodyData> getData() {
        return this.data;
    }

    public DescribeAutomateResponseConfigFeatureResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeAutomateResponseConfigFeatureResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAutomateResponseConfigFeatureResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeAutomateResponseConfigFeatureResponseBodyDataRightValueEnums extends TeaModel {
        /**
         * <p>The enumerated value of the right operand.</p>
         */
        @NameInMap("Value")
        public String value;

        /**
         * <p>The internal code of the enumerated value.</p>
         */
        @NameInMap("ValueMds")
        public String valueMds;

        public static DescribeAutomateResponseConfigFeatureResponseBodyDataRightValueEnums build(java.util.Map<String, ?> map) throws Exception {
            DescribeAutomateResponseConfigFeatureResponseBodyDataRightValueEnums self = new DescribeAutomateResponseConfigFeatureResponseBodyDataRightValueEnums();
            return TeaModel.build(map, self);
        }

        public DescribeAutomateResponseConfigFeatureResponseBodyDataRightValueEnums setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public DescribeAutomateResponseConfigFeatureResponseBodyDataRightValueEnums setValueMds(String valueMds) {
            this.valueMds = valueMds;
            return this;
        }
        public String getValueMds() {
            return this.valueMds;
        }

    }

    public static class DescribeAutomateResponseConfigFeatureResponseBodyDataSupportOperators extends TeaModel {
        /**
         * <p>Indicates whether the right operand is required. Valid values:</p>
         * <br>
         * <p>*   true</p>
         * <p>*   false</p>
         */
        @NameInMap("HasRightValue")
        public Boolean hasRightValue;

        /**
         * <p>The position of the operator in the operator list.</p>
         */
        @NameInMap("Index")
        public Integer index;

        /**
         * <p>The operator.</p>
         */
        @NameInMap("Operator")
        public String operator;

        /**
         * <p>The description of the operator in Chinese.</p>
         */
        @NameInMap("OperatorDescCn")
        public String operatorDescCn;

        /**
         * <p>The description of the operator in English.</p>
         */
        @NameInMap("OperatorDescEn")
        public String operatorDescEn;

        /**
         * <p>The name of the operator.</p>
         */
        @NameInMap("OperatorName")
        public String operatorName;

        /**
         * <p>The data types that are supported by the operator. The data types are separated by commas (,).</p>
         */
        @NameInMap("SupportDataType")
        public String supportDataType;

        /**
         * <p>The scenarios that are supported by the operator. Multiple scenarios are separated by commas (,), such as aggregation scenarios. By default, this parameter is empty.</p>
         */
        @NameInMap("SupportTag")
        public java.util.List<String> supportTag;

        public static DescribeAutomateResponseConfigFeatureResponseBodyDataSupportOperators build(java.util.Map<String, ?> map) throws Exception {
            DescribeAutomateResponseConfigFeatureResponseBodyDataSupportOperators self = new DescribeAutomateResponseConfigFeatureResponseBodyDataSupportOperators();
            return TeaModel.build(map, self);
        }

        public DescribeAutomateResponseConfigFeatureResponseBodyDataSupportOperators setHasRightValue(Boolean hasRightValue) {
            this.hasRightValue = hasRightValue;
            return this;
        }
        public Boolean getHasRightValue() {
            return this.hasRightValue;
        }

        public DescribeAutomateResponseConfigFeatureResponseBodyDataSupportOperators setIndex(Integer index) {
            this.index = index;
            return this;
        }
        public Integer getIndex() {
            return this.index;
        }

        public DescribeAutomateResponseConfigFeatureResponseBodyDataSupportOperators setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public DescribeAutomateResponseConfigFeatureResponseBodyDataSupportOperators setOperatorDescCn(String operatorDescCn) {
            this.operatorDescCn = operatorDescCn;
            return this;
        }
        public String getOperatorDescCn() {
            return this.operatorDescCn;
        }

        public DescribeAutomateResponseConfigFeatureResponseBodyDataSupportOperators setOperatorDescEn(String operatorDescEn) {
            this.operatorDescEn = operatorDescEn;
            return this;
        }
        public String getOperatorDescEn() {
            return this.operatorDescEn;
        }

        public DescribeAutomateResponseConfigFeatureResponseBodyDataSupportOperators setOperatorName(String operatorName) {
            this.operatorName = operatorName;
            return this;
        }
        public String getOperatorName() {
            return this.operatorName;
        }

        public DescribeAutomateResponseConfigFeatureResponseBodyDataSupportOperators setSupportDataType(String supportDataType) {
            this.supportDataType = supportDataType;
            return this;
        }
        public String getSupportDataType() {
            return this.supportDataType;
        }

        public DescribeAutomateResponseConfigFeatureResponseBodyDataSupportOperators setSupportTag(java.util.List<String> supportTag) {
            this.supportTag = supportTag;
            return this;
        }
        public java.util.List<String> getSupportTag() {
            return this.supportTag;
        }

    }

    public static class DescribeAutomateResponseConfigFeatureResponseBodyData extends TeaModel {
        /**
         * <p>The data type of the condition field in the automated response rule.</p>
         */
        @NameInMap("DataType")
        public String dataType;

        /**
         * <p>The name of the condition field in the automated response rule.</p>
         */
        @NameInMap("Feature")
        public String feature;

        /**
         * <p>The enumerated values of the right operand for the field.</p>
         */
        @NameInMap("RightValueEnums")
        public java.util.List<DescribeAutomateResponseConfigFeatureResponseBodyDataRightValueEnums> rightValueEnums;

        /**
         * <p>The operators that are supported for the condition field.</p>
         */
        @NameInMap("SupportOperators")
        public java.util.List<DescribeAutomateResponseConfigFeatureResponseBodyDataSupportOperators> supportOperators;

        public static DescribeAutomateResponseConfigFeatureResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeAutomateResponseConfigFeatureResponseBodyData self = new DescribeAutomateResponseConfigFeatureResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeAutomateResponseConfigFeatureResponseBodyData setDataType(String dataType) {
            this.dataType = dataType;
            return this;
        }
        public String getDataType() {
            return this.dataType;
        }

        public DescribeAutomateResponseConfigFeatureResponseBodyData setFeature(String feature) {
            this.feature = feature;
            return this;
        }
        public String getFeature() {
            return this.feature;
        }

        public DescribeAutomateResponseConfigFeatureResponseBodyData setRightValueEnums(java.util.List<DescribeAutomateResponseConfigFeatureResponseBodyDataRightValueEnums> rightValueEnums) {
            this.rightValueEnums = rightValueEnums;
            return this;
        }
        public java.util.List<DescribeAutomateResponseConfigFeatureResponseBodyDataRightValueEnums> getRightValueEnums() {
            return this.rightValueEnums;
        }

        public DescribeAutomateResponseConfigFeatureResponseBodyData setSupportOperators(java.util.List<DescribeAutomateResponseConfigFeatureResponseBodyDataSupportOperators> supportOperators) {
            this.supportOperators = supportOperators;
            return this;
        }
        public java.util.List<DescribeAutomateResponseConfigFeatureResponseBodyDataSupportOperators> getSupportOperators() {
            return this.supportOperators;
        }

    }

}
