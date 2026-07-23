// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class TestEventPatternResponseBody extends TeaModel {
    /**
     * <p>The return code. <code>Success</code> indicates that the call was successful. For more information about other return codes, see Error codes.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The result of the test.</p>
     */
    @NameInMap("Data")
    public TestEventPatternResponseBodyData data;

    /**
     * <p>The error message.</p>
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
     * <p>Indicates if the request was successful.</p>
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
         * <p>Indicates if the event matches the event pattern.</p>
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
