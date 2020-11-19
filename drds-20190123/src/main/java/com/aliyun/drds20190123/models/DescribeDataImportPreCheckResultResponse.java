// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeDataImportPreCheckResultResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("PreCheckResult")
    @Validation(required = true)
    public DescribeDataImportPreCheckResultResponsePreCheckResult preCheckResult;

    public static DescribeDataImportPreCheckResultResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataImportPreCheckResultResponse self = new DescribeDataImportPreCheckResultResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDataImportPreCheckResultResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDataImportPreCheckResultResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeDataImportPreCheckResultResponse setPreCheckResult(DescribeDataImportPreCheckResultResponsePreCheckResult preCheckResult) {
        this.preCheckResult = preCheckResult;
        return this;
    }
    public DescribeDataImportPreCheckResultResponsePreCheckResult getPreCheckResult() {
        return this.preCheckResult;
    }

    public static class DescribeDataImportPreCheckResultResponsePreCheckResultSubCheckItemsSubCheckItemsErrorMsgParams extends TeaModel {
        // ErrorMsgParams
        @NameInMap("ErrorMsgParams")
        @Validation(required = true)
        public java.util.List<String> errorMsgParams;

        public static DescribeDataImportPreCheckResultResponsePreCheckResultSubCheckItemsSubCheckItemsErrorMsgParams build(java.util.Map<String, ?> map) throws Exception {
            DescribeDataImportPreCheckResultResponsePreCheckResultSubCheckItemsSubCheckItemsErrorMsgParams self = new DescribeDataImportPreCheckResultResponsePreCheckResultSubCheckItemsSubCheckItemsErrorMsgParams();
            return TeaModel.build(map, self);
        }

        public DescribeDataImportPreCheckResultResponsePreCheckResultSubCheckItemsSubCheckItemsErrorMsgParams setErrorMsgParams(java.util.List<String> errorMsgParams) {
            this.errorMsgParams = errorMsgParams;
            return this;
        }
        public java.util.List<String> getErrorMsgParams() {
            return this.errorMsgParams;
        }

    }

    public static class DescribeDataImportPreCheckResultResponsePreCheckResultSubCheckItemsSubCheckItems extends TeaModel {
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
        public DescribeDataImportPreCheckResultResponsePreCheckResultSubCheckItemsSubCheckItemsErrorMsgParams errorMsgParams;

        public static DescribeDataImportPreCheckResultResponsePreCheckResultSubCheckItemsSubCheckItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeDataImportPreCheckResultResponsePreCheckResultSubCheckItemsSubCheckItems self = new DescribeDataImportPreCheckResultResponsePreCheckResultSubCheckItemsSubCheckItems();
            return TeaModel.build(map, self);
        }

        public DescribeDataImportPreCheckResultResponsePreCheckResultSubCheckItemsSubCheckItems setPreCheckItemName(String preCheckItemName) {
            this.preCheckItemName = preCheckItemName;
            return this;
        }
        public String getPreCheckItemName() {
            return this.preCheckItemName;
        }

        public DescribeDataImportPreCheckResultResponsePreCheckResultSubCheckItemsSubCheckItems setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeDataImportPreCheckResultResponsePreCheckResultSubCheckItemsSubCheckItems setErrorMsgCode(String errorMsgCode) {
            this.errorMsgCode = errorMsgCode;
            return this;
        }
        public String getErrorMsgCode() {
            return this.errorMsgCode;
        }

        public DescribeDataImportPreCheckResultResponsePreCheckResultSubCheckItemsSubCheckItems setErrorMsgParams(DescribeDataImportPreCheckResultResponsePreCheckResultSubCheckItemsSubCheckItemsErrorMsgParams errorMsgParams) {
            this.errorMsgParams = errorMsgParams;
            return this;
        }
        public DescribeDataImportPreCheckResultResponsePreCheckResultSubCheckItemsSubCheckItemsErrorMsgParams getErrorMsgParams() {
            return this.errorMsgParams;
        }

    }

    public static class DescribeDataImportPreCheckResultResponsePreCheckResultSubCheckItems extends TeaModel {
        @NameInMap("SubCheckItems")
        @Validation(required = true)
        public java.util.List<DescribeDataImportPreCheckResultResponsePreCheckResultSubCheckItemsSubCheckItems> subCheckItems;

        public static DescribeDataImportPreCheckResultResponsePreCheckResultSubCheckItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeDataImportPreCheckResultResponsePreCheckResultSubCheckItems self = new DescribeDataImportPreCheckResultResponsePreCheckResultSubCheckItems();
            return TeaModel.build(map, self);
        }

        public DescribeDataImportPreCheckResultResponsePreCheckResultSubCheckItems setSubCheckItems(java.util.List<DescribeDataImportPreCheckResultResponsePreCheckResultSubCheckItemsSubCheckItems> subCheckItems) {
            this.subCheckItems = subCheckItems;
            return this;
        }
        public java.util.List<DescribeDataImportPreCheckResultResponsePreCheckResultSubCheckItemsSubCheckItems> getSubCheckItems() {
            return this.subCheckItems;
        }

    }

    public static class DescribeDataImportPreCheckResultResponsePreCheckResult extends TeaModel {
        @NameInMap("PreCheckName")
        @Validation(required = true)
        public String preCheckName;

        @NameInMap("State")
        @Validation(required = true)
        public String state;

        @NameInMap("SubCheckItems")
        @Validation(required = true)
        public DescribeDataImportPreCheckResultResponsePreCheckResultSubCheckItems subCheckItems;

        public static DescribeDataImportPreCheckResultResponsePreCheckResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeDataImportPreCheckResultResponsePreCheckResult self = new DescribeDataImportPreCheckResultResponsePreCheckResult();
            return TeaModel.build(map, self);
        }

        public DescribeDataImportPreCheckResultResponsePreCheckResult setPreCheckName(String preCheckName) {
            this.preCheckName = preCheckName;
            return this;
        }
        public String getPreCheckName() {
            return this.preCheckName;
        }

        public DescribeDataImportPreCheckResultResponsePreCheckResult setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeDataImportPreCheckResultResponsePreCheckResult setSubCheckItems(DescribeDataImportPreCheckResultResponsePreCheckResultSubCheckItems subCheckItems) {
            this.subCheckItems = subCheckItems;
            return this;
        }
        public DescribeDataImportPreCheckResultResponsePreCheckResultSubCheckItems getSubCheckItems() {
            return this.subCheckItems;
        }

    }

}
