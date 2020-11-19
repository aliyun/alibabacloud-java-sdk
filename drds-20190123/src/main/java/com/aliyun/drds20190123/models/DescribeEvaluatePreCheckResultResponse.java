// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeEvaluatePreCheckResultResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("PreCheckResult")
    @Validation(required = true)
    public DescribeEvaluatePreCheckResultResponsePreCheckResult preCheckResult;

    public static DescribeEvaluatePreCheckResultResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEvaluatePreCheckResultResponse self = new DescribeEvaluatePreCheckResultResponse();
        return TeaModel.build(map, self);
    }

    public DescribeEvaluatePreCheckResultResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeEvaluatePreCheckResultResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeEvaluatePreCheckResultResponse setPreCheckResult(DescribeEvaluatePreCheckResultResponsePreCheckResult preCheckResult) {
        this.preCheckResult = preCheckResult;
        return this;
    }
    public DescribeEvaluatePreCheckResultResponsePreCheckResult getPreCheckResult() {
        return this.preCheckResult;
    }

    public static class DescribeEvaluatePreCheckResultResponsePreCheckResultSubCheckItemsSubCheckItemsErrorMsgParams extends TeaModel {
        // ErrorMsgParams
        @NameInMap("ErrorMsgParams")
        @Validation(required = true)
        public java.util.List<String> errorMsgParams;

        public static DescribeEvaluatePreCheckResultResponsePreCheckResultSubCheckItemsSubCheckItemsErrorMsgParams build(java.util.Map<String, ?> map) throws Exception {
            DescribeEvaluatePreCheckResultResponsePreCheckResultSubCheckItemsSubCheckItemsErrorMsgParams self = new DescribeEvaluatePreCheckResultResponsePreCheckResultSubCheckItemsSubCheckItemsErrorMsgParams();
            return TeaModel.build(map, self);
        }

        public DescribeEvaluatePreCheckResultResponsePreCheckResultSubCheckItemsSubCheckItemsErrorMsgParams setErrorMsgParams(java.util.List<String> errorMsgParams) {
            this.errorMsgParams = errorMsgParams;
            return this;
        }
        public java.util.List<String> getErrorMsgParams() {
            return this.errorMsgParams;
        }

    }

    public static class DescribeEvaluatePreCheckResultResponsePreCheckResultSubCheckItemsSubCheckItems extends TeaModel {
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
        public DescribeEvaluatePreCheckResultResponsePreCheckResultSubCheckItemsSubCheckItemsErrorMsgParams errorMsgParams;

        public static DescribeEvaluatePreCheckResultResponsePreCheckResultSubCheckItemsSubCheckItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeEvaluatePreCheckResultResponsePreCheckResultSubCheckItemsSubCheckItems self = new DescribeEvaluatePreCheckResultResponsePreCheckResultSubCheckItemsSubCheckItems();
            return TeaModel.build(map, self);
        }

        public DescribeEvaluatePreCheckResultResponsePreCheckResultSubCheckItemsSubCheckItems setPreCheckItemName(String preCheckItemName) {
            this.preCheckItemName = preCheckItemName;
            return this;
        }
        public String getPreCheckItemName() {
            return this.preCheckItemName;
        }

        public DescribeEvaluatePreCheckResultResponsePreCheckResultSubCheckItemsSubCheckItems setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeEvaluatePreCheckResultResponsePreCheckResultSubCheckItemsSubCheckItems setErrorMsgCode(String errorMsgCode) {
            this.errorMsgCode = errorMsgCode;
            return this;
        }
        public String getErrorMsgCode() {
            return this.errorMsgCode;
        }

        public DescribeEvaluatePreCheckResultResponsePreCheckResultSubCheckItemsSubCheckItems setErrorMsgParams(DescribeEvaluatePreCheckResultResponsePreCheckResultSubCheckItemsSubCheckItemsErrorMsgParams errorMsgParams) {
            this.errorMsgParams = errorMsgParams;
            return this;
        }
        public DescribeEvaluatePreCheckResultResponsePreCheckResultSubCheckItemsSubCheckItemsErrorMsgParams getErrorMsgParams() {
            return this.errorMsgParams;
        }

    }

    public static class DescribeEvaluatePreCheckResultResponsePreCheckResultSubCheckItems extends TeaModel {
        @NameInMap("SubCheckItems")
        @Validation(required = true)
        public java.util.List<DescribeEvaluatePreCheckResultResponsePreCheckResultSubCheckItemsSubCheckItems> subCheckItems;

        public static DescribeEvaluatePreCheckResultResponsePreCheckResultSubCheckItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeEvaluatePreCheckResultResponsePreCheckResultSubCheckItems self = new DescribeEvaluatePreCheckResultResponsePreCheckResultSubCheckItems();
            return TeaModel.build(map, self);
        }

        public DescribeEvaluatePreCheckResultResponsePreCheckResultSubCheckItems setSubCheckItems(java.util.List<DescribeEvaluatePreCheckResultResponsePreCheckResultSubCheckItemsSubCheckItems> subCheckItems) {
            this.subCheckItems = subCheckItems;
            return this;
        }
        public java.util.List<DescribeEvaluatePreCheckResultResponsePreCheckResultSubCheckItemsSubCheckItems> getSubCheckItems() {
            return this.subCheckItems;
        }

    }

    public static class DescribeEvaluatePreCheckResultResponsePreCheckResult extends TeaModel {
        @NameInMap("PreCheckName")
        @Validation(required = true)
        public String preCheckName;

        @NameInMap("State")
        @Validation(required = true)
        public String state;

        @NameInMap("SubCheckItems")
        @Validation(required = true)
        public DescribeEvaluatePreCheckResultResponsePreCheckResultSubCheckItems subCheckItems;

        public static DescribeEvaluatePreCheckResultResponsePreCheckResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeEvaluatePreCheckResultResponsePreCheckResult self = new DescribeEvaluatePreCheckResultResponsePreCheckResult();
            return TeaModel.build(map, self);
        }

        public DescribeEvaluatePreCheckResultResponsePreCheckResult setPreCheckName(String preCheckName) {
            this.preCheckName = preCheckName;
            return this;
        }
        public String getPreCheckName() {
            return this.preCheckName;
        }

        public DescribeEvaluatePreCheckResultResponsePreCheckResult setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeEvaluatePreCheckResultResponsePreCheckResult setSubCheckItems(DescribeEvaluatePreCheckResultResponsePreCheckResultSubCheckItems subCheckItems) {
            this.subCheckItems = subCheckItems;
            return this;
        }
        public DescribeEvaluatePreCheckResultResponsePreCheckResultSubCheckItems getSubCheckItems() {
            return this.subCheckItems;
        }

    }

}
