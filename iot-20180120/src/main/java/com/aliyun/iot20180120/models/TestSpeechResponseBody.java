// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class TestSpeechResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Code")
    public String code;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Data")
    public TestSpeechResponseBodyData data;

    public static TestSpeechResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TestSpeechResponseBody self = new TestSpeechResponseBody();
        return TeaModel.build(map, self);
    }

    public TestSpeechResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public TestSpeechResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public TestSpeechResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public TestSpeechResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public TestSpeechResponseBody setData(TestSpeechResponseBodyData data) {
        this.data = data;
        return this;
    }
    public TestSpeechResponseBodyData getData() {
        return this.data;
    }

    public static class TestSpeechResponseBodyData extends TeaModel {
        @NameInMap("items")
        public java.util.List<String> items;

        public static TestSpeechResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            TestSpeechResponseBodyData self = new TestSpeechResponseBodyData();
            return TeaModel.build(map, self);
        }

        public TestSpeechResponseBodyData setItems(java.util.List<String> items) {
            this.items = items;
            return this;
        }
        public java.util.List<String> getItems() {
            return this.items;
        }

    }

}
