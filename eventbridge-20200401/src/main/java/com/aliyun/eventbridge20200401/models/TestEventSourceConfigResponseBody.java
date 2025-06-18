// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class TestEventSourceConfigResponseBody extends TeaModel {
    /**
     * <p>The response code. Valid values:</p>
     * <ul>
     * <li>Success: The request was successful.</li>
     * <li>Other codes indicate that the request failed. For information about error codes, see Error codes.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The update result.</p>
     */
    @NameInMap("Data")
    public java.util.List<TestEventSourceConfigResponseBodyData> data;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>FF942675-F937-549C-A942-EB94FFE28DD3</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the operation was successful. If the operation was successful, the value true is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static TestEventSourceConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TestEventSourceConfigResponseBody self = new TestEventSourceConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public TestEventSourceConfigResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public TestEventSourceConfigResponseBody setData(java.util.List<TestEventSourceConfigResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<TestEventSourceConfigResponseBodyData> getData() {
        return this.data;
    }

    public TestEventSourceConfigResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public TestEventSourceConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public TestEventSourceConfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class TestEventSourceConfigResponseBodyData extends TeaModel {
        /**
         * <p>The name of the check item.</p>
         * 
         * <strong>example:</strong>
         * <p>CHECK_CONNECTION</p>
         */
        @NameInMap("CheckItem")
        public String checkItem;

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>Connection established successfully.</p>
         */
        @NameInMap("ErrorMsg")
        public String errorMsg;

        /**
         * <p>Indicates whether the check item is executed.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsSucceed")
        public String isSucceed;

        public static TestEventSourceConfigResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            TestEventSourceConfigResponseBodyData self = new TestEventSourceConfigResponseBodyData();
            return TeaModel.build(map, self);
        }

        public TestEventSourceConfigResponseBodyData setCheckItem(String checkItem) {
            this.checkItem = checkItem;
            return this;
        }
        public String getCheckItem() {
            return this.checkItem;
        }

        public TestEventSourceConfigResponseBodyData setErrorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }
        public String getErrorMsg() {
            return this.errorMsg;
        }

        public TestEventSourceConfigResponseBodyData setIsSucceed(String isSucceed) {
            this.isSucceed = isSucceed;
            return this;
        }
        public String getIsSucceed() {
            return this.isSucceed;
        }

    }

}
