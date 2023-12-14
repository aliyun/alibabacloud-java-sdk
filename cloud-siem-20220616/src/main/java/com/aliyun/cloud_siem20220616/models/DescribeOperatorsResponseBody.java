// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeOperatorsResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public java.util.List<DescribeOperatorsResponseBodyData> data;

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

    public static DescribeOperatorsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeOperatorsResponseBody self = new DescribeOperatorsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeOperatorsResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeOperatorsResponseBody setData(java.util.List<DescribeOperatorsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeOperatorsResponseBodyData> getData() {
        return this.data;
    }

    public DescribeOperatorsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeOperatorsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeOperatorsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeOperatorsResponseBodyData extends TeaModel {
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
         * <p>The display name of the operator.</p>
         */
        @NameInMap("OperatorName")
        public String operatorName;

        /**
         * <p>The data types that are supported by the current operator. The data types are separated by commas (,).</p>
         */
        @NameInMap("SupportDataType")
        public String supportDataType;

        /**
         * <p>The scenarios that are supported by the operator. Multiple scenarios are separated by commas (,), such as AGGREGATE scenarios. This parameter is empty by default.</p>
         */
        @NameInMap("SupportTag")
        public java.util.List<String> supportTag;

        public static DescribeOperatorsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeOperatorsResponseBodyData self = new DescribeOperatorsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeOperatorsResponseBodyData setIndex(Integer index) {
            this.index = index;
            return this;
        }
        public Integer getIndex() {
            return this.index;
        }

        public DescribeOperatorsResponseBodyData setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public DescribeOperatorsResponseBodyData setOperatorDescCn(String operatorDescCn) {
            this.operatorDescCn = operatorDescCn;
            return this;
        }
        public String getOperatorDescCn() {
            return this.operatorDescCn;
        }

        public DescribeOperatorsResponseBodyData setOperatorDescEn(String operatorDescEn) {
            this.operatorDescEn = operatorDescEn;
            return this;
        }
        public String getOperatorDescEn() {
            return this.operatorDescEn;
        }

        public DescribeOperatorsResponseBodyData setOperatorName(String operatorName) {
            this.operatorName = operatorName;
            return this;
        }
        public String getOperatorName() {
            return this.operatorName;
        }

        public DescribeOperatorsResponseBodyData setSupportDataType(String supportDataType) {
            this.supportDataType = supportDataType;
            return this;
        }
        public String getSupportDataType() {
            return this.supportDataType;
        }

        public DescribeOperatorsResponseBodyData setSupportTag(java.util.List<String> supportTag) {
            this.supportTag = supportTag;
            return this;
        }
        public java.util.List<String> getSupportTag() {
            return this.supportTag;
        }

    }

}
