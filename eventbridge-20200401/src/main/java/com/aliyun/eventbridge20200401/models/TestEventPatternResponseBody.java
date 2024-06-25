// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class TestEventPatternResponseBody extends TeaModel {
    /**
     * <p>The returned response code. The value Success indicates that the request is successful. Other values indicate that the request failed. For more information about error codes, see Error codes.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned result.</p>
     */
    @NameInMap("Data")
    public TestEventPatternResponseBodyData data;

    /**
     * <p>The error message returned if the request failed.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>96D7C0AB-DCE5-5E82-96B8-4725E1706BB1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful. Valid values: true and false.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <p>The value true indicates that the event pattern matches the provided JSON format. The value false indicates that the event pattern does not match the provided JSON format.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
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
