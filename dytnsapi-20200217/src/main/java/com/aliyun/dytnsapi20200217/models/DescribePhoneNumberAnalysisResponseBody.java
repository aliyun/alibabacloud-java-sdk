// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class DescribePhoneNumberAnalysisResponseBody extends TeaModel {
    /**
     * <p>The details about the access denial. This parameter is returned only if RAM verification fails.</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>The request status code. Valid values:</p>
     * <p> <strong>OK</strong>: The request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The information about the phone number analysis result.</p>
     */
    @NameInMap("Data")
    public DescribePhoneNumberAnalysisResponseBodyData data;

    /**
     * <p>The description of the phone number status.</p>
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
     * <p>CC3BB6D2-2FDF-4321-9DCE-B38165CE4C47</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribePhoneNumberAnalysisResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePhoneNumberAnalysisResponseBody self = new DescribePhoneNumberAnalysisResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePhoneNumberAnalysisResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public DescribePhoneNumberAnalysisResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribePhoneNumberAnalysisResponseBody setData(DescribePhoneNumberAnalysisResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribePhoneNumberAnalysisResponseBodyData getData() {
        return this.data;
    }

    public DescribePhoneNumberAnalysisResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribePhoneNumberAnalysisResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribePhoneNumberAnalysisResponseBodyDataList extends TeaModel {
        /**
         * <p>The result code returned.</p>
         * <ul>
         * <li>YES: valid</li>
         * <li>NO: invalid</li>
         * <li>UNKNOWN: unknown</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NO</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The mobile phone number that is passed in.</p>
         * 
         * <strong>example:</strong>
         * <p>187****5620</p>
         */
        @NameInMap("Number")
        public String number;

        public static DescribePhoneNumberAnalysisResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            DescribePhoneNumberAnalysisResponseBodyDataList self = new DescribePhoneNumberAnalysisResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public DescribePhoneNumberAnalysisResponseBodyDataList setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribePhoneNumberAnalysisResponseBodyDataList setNumber(String number) {
            this.number = number;
            return this;
        }
        public String getNumber() {
            return this.number;
        }

    }

    public static class DescribePhoneNumberAnalysisResponseBodyData extends TeaModel {
        /**
         * <p>The data list.</p>
         */
        @NameInMap("List")
        public java.util.List<DescribePhoneNumberAnalysisResponseBodyDataList> list;

        public static DescribePhoneNumberAnalysisResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribePhoneNumberAnalysisResponseBodyData self = new DescribePhoneNumberAnalysisResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribePhoneNumberAnalysisResponseBodyData setList(java.util.List<DescribePhoneNumberAnalysisResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<DescribePhoneNumberAnalysisResponseBodyDataList> getList() {
            return this.list;
        }

    }

}
