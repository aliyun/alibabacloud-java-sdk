// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class TestEventSourceConfigResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<TestEventSourceConfigResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>FF942675-F937-549C-A942-EB94FFE28DD3</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
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
         * <strong>example:</strong>
         * <p>CHECK_CONNECTION</p>
         */
        @NameInMap("CheckItem")
        public String checkItem;

        /**
         * <strong>example:</strong>
         * <p>Connection established successfully.</p>
         */
        @NameInMap("ErrorMsg")
        public String errorMsg;

        /**
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
