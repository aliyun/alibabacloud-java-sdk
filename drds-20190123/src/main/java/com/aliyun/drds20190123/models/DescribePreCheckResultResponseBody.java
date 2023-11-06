// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribePreCheckResultResponseBody extends TeaModel {
    /**
     * <p>Indicates the result of the precheck task.</p>
     */
    @NameInMap("PreCheckResult")
    public DescribePreCheckResultResponseBodyPreCheckResult preCheckResult;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribePreCheckResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePreCheckResultResponseBody self = new DescribePreCheckResultResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePreCheckResultResponseBody setPreCheckResult(DescribePreCheckResultResponseBodyPreCheckResult preCheckResult) {
        this.preCheckResult = preCheckResult;
        return this;
    }
    public DescribePreCheckResultResponseBodyPreCheckResult getPreCheckResult() {
        return this.preCheckResult;
    }

    public DescribePreCheckResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePreCheckResultResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribePreCheckResultResponseBodyPreCheckResultSubCheckItems extends TeaModel {
        /**
         * <p>Indicates the error code that is returned by a subtask.</p>
         */
        @NameInMap("ErrorMsgCode")
        public String errorMsgCode;

        /**
         * <p>Indicates an error message.</p>
         */
        @NameInMap("ErrorMsgParams")
        public java.util.List<String> errorMsgParams;

        /**
         * <p>Indicates the name of the subtask.</p>
         */
        @NameInMap("PreCheckItemName")
        public String preCheckItemName;

        /**
         * <p>Indicates the state of the subtask.</p>
         */
        @NameInMap("State")
        public String state;

        public static DescribePreCheckResultResponseBodyPreCheckResultSubCheckItems build(java.util.Map<String, ?> map) throws Exception {
            DescribePreCheckResultResponseBodyPreCheckResultSubCheckItems self = new DescribePreCheckResultResponseBodyPreCheckResultSubCheckItems();
            return TeaModel.build(map, self);
        }

        public DescribePreCheckResultResponseBodyPreCheckResultSubCheckItems setErrorMsgCode(String errorMsgCode) {
            this.errorMsgCode = errorMsgCode;
            return this;
        }
        public String getErrorMsgCode() {
            return this.errorMsgCode;
        }

        public DescribePreCheckResultResponseBodyPreCheckResultSubCheckItems setErrorMsgParams(java.util.List<String> errorMsgParams) {
            this.errorMsgParams = errorMsgParams;
            return this;
        }
        public java.util.List<String> getErrorMsgParams() {
            return this.errorMsgParams;
        }

        public DescribePreCheckResultResponseBodyPreCheckResultSubCheckItems setPreCheckItemName(String preCheckItemName) {
            this.preCheckItemName = preCheckItemName;
            return this;
        }
        public String getPreCheckItemName() {
            return this.preCheckItemName;
        }

        public DescribePreCheckResultResponseBodyPreCheckResultSubCheckItems setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

    public static class DescribePreCheckResultResponseBodyPreCheckResult extends TeaModel {
        /**
         * <p>Indicates the name of the precheck task.</p>
         */
        @NameInMap("PreCheckName")
        public String preCheckName;

        /**
         * <p>Indicates the state of the precheck task.</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <p>Indicates the details about the subtasks of the precheck task.</p>
         */
        @NameInMap("SubCheckItems")
        public java.util.List<DescribePreCheckResultResponseBodyPreCheckResultSubCheckItems> subCheckItems;

        public static DescribePreCheckResultResponseBodyPreCheckResult build(java.util.Map<String, ?> map) throws Exception {
            DescribePreCheckResultResponseBodyPreCheckResult self = new DescribePreCheckResultResponseBodyPreCheckResult();
            return TeaModel.build(map, self);
        }

        public DescribePreCheckResultResponseBodyPreCheckResult setPreCheckName(String preCheckName) {
            this.preCheckName = preCheckName;
            return this;
        }
        public String getPreCheckName() {
            return this.preCheckName;
        }

        public DescribePreCheckResultResponseBodyPreCheckResult setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribePreCheckResultResponseBodyPreCheckResult setSubCheckItems(java.util.List<DescribePreCheckResultResponseBodyPreCheckResultSubCheckItems> subCheckItems) {
            this.subCheckItems = subCheckItems;
            return this;
        }
        public java.util.List<DescribePreCheckResultResponseBodyPreCheckResultSubCheckItems> getSubCheckItems() {
            return this.subCheckItems;
        }

    }

}
