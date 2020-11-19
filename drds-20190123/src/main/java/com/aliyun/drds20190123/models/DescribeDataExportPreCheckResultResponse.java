// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeDataExportPreCheckResultResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("PreCheckResult")
    @Validation(required = true)
    public DescribeDataExportPreCheckResultResponsePreCheckResult preCheckResult;

    public static DescribeDataExportPreCheckResultResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataExportPreCheckResultResponse self = new DescribeDataExportPreCheckResultResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDataExportPreCheckResultResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDataExportPreCheckResultResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeDataExportPreCheckResultResponse setPreCheckResult(DescribeDataExportPreCheckResultResponsePreCheckResult preCheckResult) {
        this.preCheckResult = preCheckResult;
        return this;
    }
    public DescribeDataExportPreCheckResultResponsePreCheckResult getPreCheckResult() {
        return this.preCheckResult;
    }

    public static class DescribeDataExportPreCheckResultResponsePreCheckResultSubCheckItemsSubCheckItemsErrorMsgParams extends TeaModel {
        // ErrorMsgParams
        @NameInMap("ErrorMsgParams")
        @Validation(required = true)
        public java.util.List<String> errorMsgParams;

        public static DescribeDataExportPreCheckResultResponsePreCheckResultSubCheckItemsSubCheckItemsErrorMsgParams build(java.util.Map<String, ?> map) throws Exception {
            DescribeDataExportPreCheckResultResponsePreCheckResultSubCheckItemsSubCheckItemsErrorMsgParams self = new DescribeDataExportPreCheckResultResponsePreCheckResultSubCheckItemsSubCheckItemsErrorMsgParams();
            return TeaModel.build(map, self);
        }

        public DescribeDataExportPreCheckResultResponsePreCheckResultSubCheckItemsSubCheckItemsErrorMsgParams setErrorMsgParams(java.util.List<String> errorMsgParams) {
            this.errorMsgParams = errorMsgParams;
            return this;
        }
        public java.util.List<String> getErrorMsgParams() {
            return this.errorMsgParams;
        }

    }

    public static class DescribeDataExportPreCheckResultResponsePreCheckResultSubCheckItemsSubCheckItems extends TeaModel {
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
        public DescribeDataExportPreCheckResultResponsePreCheckResultSubCheckItemsSubCheckItemsErrorMsgParams errorMsgParams;

        public static DescribeDataExportPreCheckResultResponsePreCheckResultSubCheckItemsSubCheckItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeDataExportPreCheckResultResponsePreCheckResultSubCheckItemsSubCheckItems self = new DescribeDataExportPreCheckResultResponsePreCheckResultSubCheckItemsSubCheckItems();
            return TeaModel.build(map, self);
        }

        public DescribeDataExportPreCheckResultResponsePreCheckResultSubCheckItemsSubCheckItems setPreCheckItemName(String preCheckItemName) {
            this.preCheckItemName = preCheckItemName;
            return this;
        }
        public String getPreCheckItemName() {
            return this.preCheckItemName;
        }

        public DescribeDataExportPreCheckResultResponsePreCheckResultSubCheckItemsSubCheckItems setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeDataExportPreCheckResultResponsePreCheckResultSubCheckItemsSubCheckItems setErrorMsgCode(String errorMsgCode) {
            this.errorMsgCode = errorMsgCode;
            return this;
        }
        public String getErrorMsgCode() {
            return this.errorMsgCode;
        }

        public DescribeDataExportPreCheckResultResponsePreCheckResultSubCheckItemsSubCheckItems setErrorMsgParams(DescribeDataExportPreCheckResultResponsePreCheckResultSubCheckItemsSubCheckItemsErrorMsgParams errorMsgParams) {
            this.errorMsgParams = errorMsgParams;
            return this;
        }
        public DescribeDataExportPreCheckResultResponsePreCheckResultSubCheckItemsSubCheckItemsErrorMsgParams getErrorMsgParams() {
            return this.errorMsgParams;
        }

    }

    public static class DescribeDataExportPreCheckResultResponsePreCheckResultSubCheckItems extends TeaModel {
        @NameInMap("SubCheckItems")
        @Validation(required = true)
        public java.util.List<DescribeDataExportPreCheckResultResponsePreCheckResultSubCheckItemsSubCheckItems> subCheckItems;

        public static DescribeDataExportPreCheckResultResponsePreCheckResultSubCheckItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeDataExportPreCheckResultResponsePreCheckResultSubCheckItems self = new DescribeDataExportPreCheckResultResponsePreCheckResultSubCheckItems();
            return TeaModel.build(map, self);
        }

        public DescribeDataExportPreCheckResultResponsePreCheckResultSubCheckItems setSubCheckItems(java.util.List<DescribeDataExportPreCheckResultResponsePreCheckResultSubCheckItemsSubCheckItems> subCheckItems) {
            this.subCheckItems = subCheckItems;
            return this;
        }
        public java.util.List<DescribeDataExportPreCheckResultResponsePreCheckResultSubCheckItemsSubCheckItems> getSubCheckItems() {
            return this.subCheckItems;
        }

    }

    public static class DescribeDataExportPreCheckResultResponsePreCheckResult extends TeaModel {
        @NameInMap("PreCheckName")
        @Validation(required = true)
        public String preCheckName;

        @NameInMap("State")
        @Validation(required = true)
        public String state;

        @NameInMap("SubCheckItems")
        @Validation(required = true)
        public DescribeDataExportPreCheckResultResponsePreCheckResultSubCheckItems subCheckItems;

        public static DescribeDataExportPreCheckResultResponsePreCheckResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeDataExportPreCheckResultResponsePreCheckResult self = new DescribeDataExportPreCheckResultResponsePreCheckResult();
            return TeaModel.build(map, self);
        }

        public DescribeDataExportPreCheckResultResponsePreCheckResult setPreCheckName(String preCheckName) {
            this.preCheckName = preCheckName;
            return this;
        }
        public String getPreCheckName() {
            return this.preCheckName;
        }

        public DescribeDataExportPreCheckResultResponsePreCheckResult setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeDataExportPreCheckResultResponsePreCheckResult setSubCheckItems(DescribeDataExportPreCheckResultResponsePreCheckResultSubCheckItems subCheckItems) {
            this.subCheckItems = subCheckItems;
            return this;
        }
        public DescribeDataExportPreCheckResultResponsePreCheckResultSubCheckItems getSubCheckItems() {
            return this.subCheckItems;
        }

    }

}
