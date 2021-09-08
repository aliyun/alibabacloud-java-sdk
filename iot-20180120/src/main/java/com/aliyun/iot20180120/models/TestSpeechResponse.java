// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class TestSpeechResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("ErrorMessage")
    @Validation(required = true)
    public String errorMessage;

    @NameInMap("Data")
    @Validation(required = true)
    public TestSpeechResponseData data;

    public static TestSpeechResponse build(java.util.Map<String, ?> map) throws Exception {
        TestSpeechResponse self = new TestSpeechResponse();
        return TeaModel.build(map, self);
    }

    public TestSpeechResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public TestSpeechResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public TestSpeechResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public TestSpeechResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public TestSpeechResponse setData(TestSpeechResponseData data) {
        this.data = data;
        return this;
    }
    public TestSpeechResponseData getData() {
        return this.data;
    }

    public static class TestSpeechResponseData extends TeaModel {
        @NameInMap("items")
        @Validation(required = true)
        public java.util.List<String> items;

        public static TestSpeechResponseData build(java.util.Map<String, ?> map) throws Exception {
            TestSpeechResponseData self = new TestSpeechResponseData();
            return TeaModel.build(map, self);
        }

        public TestSpeechResponseData setItems(java.util.List<String> items) {
            this.items = items;
            return this;
        }
        public java.util.List<String> getItems() {
            return this.items;
        }

    }

}
