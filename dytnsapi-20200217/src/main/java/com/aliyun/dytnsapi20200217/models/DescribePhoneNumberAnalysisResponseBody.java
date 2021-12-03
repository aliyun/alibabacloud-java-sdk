// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class DescribePhoneNumberAnalysisResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<DescribePhoneNumberAnalysisResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribePhoneNumberAnalysisResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePhoneNumberAnalysisResponseBody self = new DescribePhoneNumberAnalysisResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePhoneNumberAnalysisResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribePhoneNumberAnalysisResponseBody setData(java.util.List<DescribePhoneNumberAnalysisResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribePhoneNumberAnalysisResponseBodyData> getData() {
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

    public static class DescribePhoneNumberAnalysisResponseBodyData extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Number")
        public String number;

        public static DescribePhoneNumberAnalysisResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribePhoneNumberAnalysisResponseBodyData self = new DescribePhoneNumberAnalysisResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribePhoneNumberAnalysisResponseBodyData setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribePhoneNumberAnalysisResponseBodyData setNumber(String number) {
            this.number = number;
            return this;
        }
        public String getNumber() {
            return this.number;
        }

    }

}
