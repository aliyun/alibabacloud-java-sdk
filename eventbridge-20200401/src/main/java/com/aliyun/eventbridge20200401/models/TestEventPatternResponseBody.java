// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class TestEventPatternResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public TestEventPatternResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static TestEventPatternResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TestEventPatternResponseBody self = new TestEventPatternResponseBody();
        return TeaModel.build(map, self);
    }

    public TestEventPatternResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public TestEventPatternResponseBody setData(TestEventPatternResponseBodyData data) {
        this.data = data;
        return this;
    }
    public TestEventPatternResponseBodyData getData() {
        return this.data;
    }

    public TestEventPatternResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public TestEventPatternResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public TestEventPatternResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class TestEventPatternResponseBodyData extends TeaModel {
        @NameInMap("Result")
        public Boolean result;

        public static TestEventPatternResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            TestEventPatternResponseBodyData self = new TestEventPatternResponseBodyData();
            return TeaModel.build(map, self);
        }

        public TestEventPatternResponseBodyData setResult(Boolean result) {
            this.result = result;
            return this;
        }
        public Boolean getResult() {
            return this.result;
        }

    }

}
