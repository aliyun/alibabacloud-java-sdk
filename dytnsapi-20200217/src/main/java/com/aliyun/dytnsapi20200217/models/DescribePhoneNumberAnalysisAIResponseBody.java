// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class DescribePhoneNumberAnalysisAIResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>The response code. Valid values:</p>
     * <br>
     * <p>*   OK: The request is successful.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The response parameters.</p>
     */
    @NameInMap("Data")
    public DescribePhoneNumberAnalysisAIResponseBodyData data;

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

    public static DescribePhoneNumberAnalysisAIResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePhoneNumberAnalysisAIResponseBody self = new DescribePhoneNumberAnalysisAIResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePhoneNumberAnalysisAIResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public DescribePhoneNumberAnalysisAIResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribePhoneNumberAnalysisAIResponseBody setData(DescribePhoneNumberAnalysisAIResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribePhoneNumberAnalysisAIResponseBodyData getData() {
        return this.data;
    }

    public DescribePhoneNumberAnalysisAIResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribePhoneNumberAnalysisAIResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribePhoneNumberAnalysisAIResponseBodyData extends TeaModel {
        /**
         * <p>The returned code.</p>
         * <br>
         * <p>*   YES: The specified phone number is valid.</p>
         * <p>*   NO: The specified phone number is invalid.</p>
         * <p>*   UNKNOWN: The specified phone number is unknown</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The specified phone number.</p>
         */
        @NameInMap("Number")
        public String number;

        public static DescribePhoneNumberAnalysisAIResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribePhoneNumberAnalysisAIResponseBodyData self = new DescribePhoneNumberAnalysisAIResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribePhoneNumberAnalysisAIResponseBodyData setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribePhoneNumberAnalysisAIResponseBodyData setNumber(String number) {
            this.number = number;
            return this;
        }
        public String getNumber() {
            return this.number;
        }

    }

}
