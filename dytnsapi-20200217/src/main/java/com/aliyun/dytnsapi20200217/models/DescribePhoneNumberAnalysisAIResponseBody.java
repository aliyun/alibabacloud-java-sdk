// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class DescribePhoneNumberAnalysisAIResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>The response code. Valid values:</p>
     * <ul>
     * <li>OK: The request is successful.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
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
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>68A40250-50CD-034C-B728-0BD******177</p>
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
         * <ul>
         * <li>YES: The specified phone number is valid.</li>
         * <li>NO: The specified phone number is invalid.</li>
         * <li>UNKNOWN: The specified phone number is unknown</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>YES</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The specified phone number.</p>
         * 
         * <strong>example:</strong>
         * <p>187****5620</p>
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
