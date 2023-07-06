// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class DescribePhoneNumberAnalysisResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public DescribePhoneNumberAnalysisResponseBodyData data;

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
        @NameInMap("Code")
        public String code;

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
