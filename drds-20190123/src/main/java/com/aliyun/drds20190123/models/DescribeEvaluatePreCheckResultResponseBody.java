// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeEvaluatePreCheckResultResponseBody extends TeaModel {
    @NameInMap("PreCheckResult")
    public DescribeEvaluatePreCheckResultResponseBodyPreCheckResult preCheckResult;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeEvaluatePreCheckResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeEvaluatePreCheckResultResponseBody self = new DescribeEvaluatePreCheckResultResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeEvaluatePreCheckResultResponseBody setPreCheckResult(DescribeEvaluatePreCheckResultResponseBodyPreCheckResult preCheckResult) {
        this.preCheckResult = preCheckResult;
        return this;
    }
    public DescribeEvaluatePreCheckResultResponseBodyPreCheckResult getPreCheckResult() {
        return this.preCheckResult;
    }

    public DescribeEvaluatePreCheckResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeEvaluatePreCheckResultResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeEvaluatePreCheckResultResponseBodyPreCheckResultSubCheckItemsSubCheckItemsErrorMsgParams extends TeaModel {
        @NameInMap("ErrorMsgParams")
        public java.util.List<String> errorMsgParams;

        public static DescribeEvaluatePreCheckResultResponseBodyPreCheckResultSubCheckItemsSubCheckItemsErrorMsgParams build(java.util.Map<String, ?> map) throws Exception {
            DescribeEvaluatePreCheckResultResponseBodyPreCheckResultSubCheckItemsSubCheckItemsErrorMsgParams self = new DescribeEvaluatePreCheckResultResponseBodyPreCheckResultSubCheckItemsSubCheckItemsErrorMsgParams();
            return TeaModel.build(map, self);
        }

        public DescribeEvaluatePreCheckResultResponseBodyPreCheckResultSubCheckItemsSubCheckItemsErrorMsgParams setErrorMsgParams(java.util.List<String> errorMsgParams) {
            this.errorMsgParams = errorMsgParams;
            return this;
        }
        public java.util.List<String> getErrorMsgParams() {
            return this.errorMsgParams;
        }

    }

    public static class DescribeEvaluatePreCheckResultResponseBodyPreCheckResultSubCheckItemsSubCheckItems extends TeaModel {
        @NameInMap("ErrorMsgCode")
        public String errorMsgCode;

        @NameInMap("ErrorMsgParams")
        public DescribeEvaluatePreCheckResultResponseBodyPreCheckResultSubCheckItemsSubCheckItemsErrorMsgParams errorMsgParams;

        @NameInMap("PreCheckItemName")
        public String preCheckItemName;

        @NameInMap("State")
        public String state;

        public static DescribeEvaluatePreCheckResultResponseBodyPreCheckResultSubCheckItemsSubCheckItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeEvaluatePreCheckResultResponseBodyPreCheckResultSubCheckItemsSubCheckItems self = new DescribeEvaluatePreCheckResultResponseBodyPreCheckResultSubCheckItemsSubCheckItems();
            return TeaModel.build(map, self);
        }

        public DescribeEvaluatePreCheckResultResponseBodyPreCheckResultSubCheckItemsSubCheckItems setErrorMsgCode(String errorMsgCode) {
            this.errorMsgCode = errorMsgCode;
            return this;
        }
        public String getErrorMsgCode() {
            return this.errorMsgCode;
        }

        public DescribeEvaluatePreCheckResultResponseBodyPreCheckResultSubCheckItemsSubCheckItems setErrorMsgParams(DescribeEvaluatePreCheckResultResponseBodyPreCheckResultSubCheckItemsSubCheckItemsErrorMsgParams errorMsgParams) {
            this.errorMsgParams = errorMsgParams;
            return this;
        }
        public DescribeEvaluatePreCheckResultResponseBodyPreCheckResultSubCheckItemsSubCheckItemsErrorMsgParams getErrorMsgParams() {
            return this.errorMsgParams;
        }

        public DescribeEvaluatePreCheckResultResponseBodyPreCheckResultSubCheckItemsSubCheckItems setPreCheckItemName(String preCheckItemName) {
            this.preCheckItemName = preCheckItemName;
            return this;
        }
        public String getPreCheckItemName() {
            return this.preCheckItemName;
        }

        public DescribeEvaluatePreCheckResultResponseBodyPreCheckResultSubCheckItemsSubCheckItems setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

    public static class DescribeEvaluatePreCheckResultResponseBodyPreCheckResultSubCheckItems extends TeaModel {
        @NameInMap("SubCheckItems")
        public java.util.List<DescribeEvaluatePreCheckResultResponseBodyPreCheckResultSubCheckItemsSubCheckItems> subCheckItems;

        public static DescribeEvaluatePreCheckResultResponseBodyPreCheckResultSubCheckItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeEvaluatePreCheckResultResponseBodyPreCheckResultSubCheckItems self = new DescribeEvaluatePreCheckResultResponseBodyPreCheckResultSubCheckItems();
            return TeaModel.build(map, self);
        }

        public DescribeEvaluatePreCheckResultResponseBodyPreCheckResultSubCheckItems setSubCheckItems(java.util.List<DescribeEvaluatePreCheckResultResponseBodyPreCheckResultSubCheckItemsSubCheckItems> subCheckItems) {
            this.subCheckItems = subCheckItems;
            return this;
        }
        public java.util.List<DescribeEvaluatePreCheckResultResponseBodyPreCheckResultSubCheckItemsSubCheckItems> getSubCheckItems() {
            return this.subCheckItems;
        }

    }

    public static class DescribeEvaluatePreCheckResultResponseBodyPreCheckResult extends TeaModel {
        @NameInMap("PreCheckName")
        public String preCheckName;

        @NameInMap("State")
        public String state;

        @NameInMap("SubCheckItems")
        public DescribeEvaluatePreCheckResultResponseBodyPreCheckResultSubCheckItems subCheckItems;

        public static DescribeEvaluatePreCheckResultResponseBodyPreCheckResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeEvaluatePreCheckResultResponseBodyPreCheckResult self = new DescribeEvaluatePreCheckResultResponseBodyPreCheckResult();
            return TeaModel.build(map, self);
        }

        public DescribeEvaluatePreCheckResultResponseBodyPreCheckResult setPreCheckName(String preCheckName) {
            this.preCheckName = preCheckName;
            return this;
        }
        public String getPreCheckName() {
            return this.preCheckName;
        }

        public DescribeEvaluatePreCheckResultResponseBodyPreCheckResult setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeEvaluatePreCheckResultResponseBodyPreCheckResult setSubCheckItems(DescribeEvaluatePreCheckResultResponseBodyPreCheckResultSubCheckItems subCheckItems) {
            this.subCheckItems = subCheckItems;
            return this;
        }
        public DescribeEvaluatePreCheckResultResponseBodyPreCheckResultSubCheckItems getSubCheckItems() {
            return this.subCheckItems;
        }

    }

}
