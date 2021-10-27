// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeDataImportPreCheckResultResponseBody extends TeaModel {
    @NameInMap("PreCheckResult")
    public DescribeDataImportPreCheckResultResponseBodyPreCheckResult preCheckResult;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeDataImportPreCheckResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataImportPreCheckResultResponseBody self = new DescribeDataImportPreCheckResultResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDataImportPreCheckResultResponseBody setPreCheckResult(DescribeDataImportPreCheckResultResponseBodyPreCheckResult preCheckResult) {
        this.preCheckResult = preCheckResult;
        return this;
    }
    public DescribeDataImportPreCheckResultResponseBodyPreCheckResult getPreCheckResult() {
        return this.preCheckResult;
    }

    public DescribeDataImportPreCheckResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDataImportPreCheckResultResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeDataImportPreCheckResultResponseBodyPreCheckResultSubCheckItemsSubCheckItemsErrorMsgParams extends TeaModel {
        @NameInMap("ErrorMsgParams")
        public java.util.List<String> errorMsgParams;

        public static DescribeDataImportPreCheckResultResponseBodyPreCheckResultSubCheckItemsSubCheckItemsErrorMsgParams build(java.util.Map<String, ?> map) throws Exception {
            DescribeDataImportPreCheckResultResponseBodyPreCheckResultSubCheckItemsSubCheckItemsErrorMsgParams self = new DescribeDataImportPreCheckResultResponseBodyPreCheckResultSubCheckItemsSubCheckItemsErrorMsgParams();
            return TeaModel.build(map, self);
        }

        public DescribeDataImportPreCheckResultResponseBodyPreCheckResultSubCheckItemsSubCheckItemsErrorMsgParams setErrorMsgParams(java.util.List<String> errorMsgParams) {
            this.errorMsgParams = errorMsgParams;
            return this;
        }
        public java.util.List<String> getErrorMsgParams() {
            return this.errorMsgParams;
        }

    }

    public static class DescribeDataImportPreCheckResultResponseBodyPreCheckResultSubCheckItemsSubCheckItems extends TeaModel {
        @NameInMap("ErrorMsgCode")
        public String errorMsgCode;

        @NameInMap("ErrorMsgParams")
        public DescribeDataImportPreCheckResultResponseBodyPreCheckResultSubCheckItemsSubCheckItemsErrorMsgParams errorMsgParams;

        @NameInMap("PreCheckItemName")
        public String preCheckItemName;

        @NameInMap("State")
        public String state;

        public static DescribeDataImportPreCheckResultResponseBodyPreCheckResultSubCheckItemsSubCheckItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeDataImportPreCheckResultResponseBodyPreCheckResultSubCheckItemsSubCheckItems self = new DescribeDataImportPreCheckResultResponseBodyPreCheckResultSubCheckItemsSubCheckItems();
            return TeaModel.build(map, self);
        }

        public DescribeDataImportPreCheckResultResponseBodyPreCheckResultSubCheckItemsSubCheckItems setErrorMsgCode(String errorMsgCode) {
            this.errorMsgCode = errorMsgCode;
            return this;
        }
        public String getErrorMsgCode() {
            return this.errorMsgCode;
        }

        public DescribeDataImportPreCheckResultResponseBodyPreCheckResultSubCheckItemsSubCheckItems setErrorMsgParams(DescribeDataImportPreCheckResultResponseBodyPreCheckResultSubCheckItemsSubCheckItemsErrorMsgParams errorMsgParams) {
            this.errorMsgParams = errorMsgParams;
            return this;
        }
        public DescribeDataImportPreCheckResultResponseBodyPreCheckResultSubCheckItemsSubCheckItemsErrorMsgParams getErrorMsgParams() {
            return this.errorMsgParams;
        }

        public DescribeDataImportPreCheckResultResponseBodyPreCheckResultSubCheckItemsSubCheckItems setPreCheckItemName(String preCheckItemName) {
            this.preCheckItemName = preCheckItemName;
            return this;
        }
        public String getPreCheckItemName() {
            return this.preCheckItemName;
        }

        public DescribeDataImportPreCheckResultResponseBodyPreCheckResultSubCheckItemsSubCheckItems setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

    public static class DescribeDataImportPreCheckResultResponseBodyPreCheckResultSubCheckItems extends TeaModel {
        @NameInMap("SubCheckItems")
        public java.util.List<DescribeDataImportPreCheckResultResponseBodyPreCheckResultSubCheckItemsSubCheckItems> subCheckItems;

        public static DescribeDataImportPreCheckResultResponseBodyPreCheckResultSubCheckItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeDataImportPreCheckResultResponseBodyPreCheckResultSubCheckItems self = new DescribeDataImportPreCheckResultResponseBodyPreCheckResultSubCheckItems();
            return TeaModel.build(map, self);
        }

        public DescribeDataImportPreCheckResultResponseBodyPreCheckResultSubCheckItems setSubCheckItems(java.util.List<DescribeDataImportPreCheckResultResponseBodyPreCheckResultSubCheckItemsSubCheckItems> subCheckItems) {
            this.subCheckItems = subCheckItems;
            return this;
        }
        public java.util.List<DescribeDataImportPreCheckResultResponseBodyPreCheckResultSubCheckItemsSubCheckItems> getSubCheckItems() {
            return this.subCheckItems;
        }

    }

    public static class DescribeDataImportPreCheckResultResponseBodyPreCheckResult extends TeaModel {
        @NameInMap("PreCheckName")
        public String preCheckName;

        @NameInMap("State")
        public String state;

        @NameInMap("SubCheckItems")
        public DescribeDataImportPreCheckResultResponseBodyPreCheckResultSubCheckItems subCheckItems;

        public static DescribeDataImportPreCheckResultResponseBodyPreCheckResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeDataImportPreCheckResultResponseBodyPreCheckResult self = new DescribeDataImportPreCheckResultResponseBodyPreCheckResult();
            return TeaModel.build(map, self);
        }

        public DescribeDataImportPreCheckResultResponseBodyPreCheckResult setPreCheckName(String preCheckName) {
            this.preCheckName = preCheckName;
            return this;
        }
        public String getPreCheckName() {
            return this.preCheckName;
        }

        public DescribeDataImportPreCheckResultResponseBodyPreCheckResult setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeDataImportPreCheckResultResponseBodyPreCheckResult setSubCheckItems(DescribeDataImportPreCheckResultResponseBodyPreCheckResultSubCheckItems subCheckItems) {
            this.subCheckItems = subCheckItems;
            return this;
        }
        public DescribeDataImportPreCheckResultResponseBodyPreCheckResultSubCheckItems getSubCheckItems() {
            return this.subCheckItems;
        }

    }

}
