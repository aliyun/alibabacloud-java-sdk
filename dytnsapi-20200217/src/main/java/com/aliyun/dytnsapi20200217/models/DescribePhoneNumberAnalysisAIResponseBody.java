// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class DescribePhoneNumberAnalysisAIResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public DescribePhoneNumberAnalysisAIResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribePhoneNumberAnalysisAIResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePhoneNumberAnalysisAIResponseBody self = new DescribePhoneNumberAnalysisAIResponseBody();
        return TeaModel.build(map, self);
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
        @NameInMap("Code")
        public String code;

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
