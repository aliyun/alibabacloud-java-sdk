// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribePreCheckResultResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("PreCheckResult")
    @Validation(required = true)
    public DescribePreCheckResultResponsePreCheckResult preCheckResult;

    public static DescribePreCheckResultResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePreCheckResultResponse self = new DescribePreCheckResultResponse();
        return TeaModel.build(map, self);
    }

    public DescribePreCheckResultResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePreCheckResultResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribePreCheckResultResponse setPreCheckResult(DescribePreCheckResultResponsePreCheckResult preCheckResult) {
        this.preCheckResult = preCheckResult;
        return this;
    }
    public DescribePreCheckResultResponsePreCheckResult getPreCheckResult() {
        return this.preCheckResult;
    }

    public static class DescribePreCheckResultResponsePreCheckResultSubCheckItems extends TeaModel {
        @NameInMap("PreCheckItemName")
        @Validation(required = true)
        public String preCheckItemName;

        @NameInMap("State")
        @Validation(required = true)
        public String state;

        @NameInMap("ErrorMsgCode")
        @Validation(required = true)
        public String errorMsgCode;

        @NameInMap("ErrorMsgParams")
        @Validation(required = true)
        public java.util.List<String> errorMsgParams;

        public static DescribePreCheckResultResponsePreCheckResultSubCheckItems build(java.util.Map<String, ?> map) throws Exception {
            DescribePreCheckResultResponsePreCheckResultSubCheckItems self = new DescribePreCheckResultResponsePreCheckResultSubCheckItems();
            return TeaModel.build(map, self);
        }

        public DescribePreCheckResultResponsePreCheckResultSubCheckItems setPreCheckItemName(String preCheckItemName) {
            this.preCheckItemName = preCheckItemName;
            return this;
        }
        public String getPreCheckItemName() {
            return this.preCheckItemName;
        }

        public DescribePreCheckResultResponsePreCheckResultSubCheckItems setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribePreCheckResultResponsePreCheckResultSubCheckItems setErrorMsgCode(String errorMsgCode) {
            this.errorMsgCode = errorMsgCode;
            return this;
        }
        public String getErrorMsgCode() {
            return this.errorMsgCode;
        }

        public DescribePreCheckResultResponsePreCheckResultSubCheckItems setErrorMsgParams(java.util.List<String> errorMsgParams) {
            this.errorMsgParams = errorMsgParams;
            return this;
        }
        public java.util.List<String> getErrorMsgParams() {
            return this.errorMsgParams;
        }

    }

    public static class DescribePreCheckResultResponsePreCheckResult extends TeaModel {
        @NameInMap("PreCheckName")
        @Validation(required = true)
        public String preCheckName;

        @NameInMap("State")
        @Validation(required = true)
        public String state;

        @NameInMap("SubCheckItems")
        @Validation(required = true)
        public java.util.List<DescribePreCheckResultResponsePreCheckResultSubCheckItems> subCheckItems;

        public static DescribePreCheckResultResponsePreCheckResult build(java.util.Map<String, ?> map) throws Exception {
            DescribePreCheckResultResponsePreCheckResult self = new DescribePreCheckResultResponsePreCheckResult();
            return TeaModel.build(map, self);
        }

        public DescribePreCheckResultResponsePreCheckResult setPreCheckName(String preCheckName) {
            this.preCheckName = preCheckName;
            return this;
        }
        public String getPreCheckName() {
            return this.preCheckName;
        }

        public DescribePreCheckResultResponsePreCheckResult setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribePreCheckResultResponsePreCheckResult setSubCheckItems(java.util.List<DescribePreCheckResultResponsePreCheckResultSubCheckItems> subCheckItems) {
            this.subCheckItems = subCheckItems;
            return this;
        }
        public java.util.List<DescribePreCheckResultResponsePreCheckResultSubCheckItems> getSubCheckItems() {
            return this.subCheckItems;
        }

    }

}
