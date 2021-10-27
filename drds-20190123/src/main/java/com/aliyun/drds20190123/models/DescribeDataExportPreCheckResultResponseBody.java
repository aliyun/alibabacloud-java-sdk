// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeDataExportPreCheckResultResponseBody extends TeaModel {
    @NameInMap("PreCheckResult")
    public DescribeDataExportPreCheckResultResponseBodyPreCheckResult preCheckResult;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeDataExportPreCheckResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataExportPreCheckResultResponseBody self = new DescribeDataExportPreCheckResultResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDataExportPreCheckResultResponseBody setPreCheckResult(DescribeDataExportPreCheckResultResponseBodyPreCheckResult preCheckResult) {
        this.preCheckResult = preCheckResult;
        return this;
    }
    public DescribeDataExportPreCheckResultResponseBodyPreCheckResult getPreCheckResult() {
        return this.preCheckResult;
    }

    public DescribeDataExportPreCheckResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDataExportPreCheckResultResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeDataExportPreCheckResultResponseBodyPreCheckResultSubCheckItemsSubCheckItemsErrorMsgParams extends TeaModel {
        @NameInMap("ErrorMsgParams")
        public java.util.List<String> errorMsgParams;

        public static DescribeDataExportPreCheckResultResponseBodyPreCheckResultSubCheckItemsSubCheckItemsErrorMsgParams build(java.util.Map<String, ?> map) throws Exception {
            DescribeDataExportPreCheckResultResponseBodyPreCheckResultSubCheckItemsSubCheckItemsErrorMsgParams self = new DescribeDataExportPreCheckResultResponseBodyPreCheckResultSubCheckItemsSubCheckItemsErrorMsgParams();
            return TeaModel.build(map, self);
        }

        public DescribeDataExportPreCheckResultResponseBodyPreCheckResultSubCheckItemsSubCheckItemsErrorMsgParams setErrorMsgParams(java.util.List<String> errorMsgParams) {
            this.errorMsgParams = errorMsgParams;
            return this;
        }
        public java.util.List<String> getErrorMsgParams() {
            return this.errorMsgParams;
        }

    }

    public static class DescribeDataExportPreCheckResultResponseBodyPreCheckResultSubCheckItemsSubCheckItems extends TeaModel {
        @NameInMap("ErrorMsgCode")
        public String errorMsgCode;

        @NameInMap("ErrorMsgParams")
        public DescribeDataExportPreCheckResultResponseBodyPreCheckResultSubCheckItemsSubCheckItemsErrorMsgParams errorMsgParams;

        @NameInMap("PreCheckItemName")
        public String preCheckItemName;

        @NameInMap("State")
        public String state;

        public static DescribeDataExportPreCheckResultResponseBodyPreCheckResultSubCheckItemsSubCheckItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeDataExportPreCheckResultResponseBodyPreCheckResultSubCheckItemsSubCheckItems self = new DescribeDataExportPreCheckResultResponseBodyPreCheckResultSubCheckItemsSubCheckItems();
            return TeaModel.build(map, self);
        }

        public DescribeDataExportPreCheckResultResponseBodyPreCheckResultSubCheckItemsSubCheckItems setErrorMsgCode(String errorMsgCode) {
            this.errorMsgCode = errorMsgCode;
            return this;
        }
        public String getErrorMsgCode() {
            return this.errorMsgCode;
        }

        public DescribeDataExportPreCheckResultResponseBodyPreCheckResultSubCheckItemsSubCheckItems setErrorMsgParams(DescribeDataExportPreCheckResultResponseBodyPreCheckResultSubCheckItemsSubCheckItemsErrorMsgParams errorMsgParams) {
            this.errorMsgParams = errorMsgParams;
            return this;
        }
        public DescribeDataExportPreCheckResultResponseBodyPreCheckResultSubCheckItemsSubCheckItemsErrorMsgParams getErrorMsgParams() {
            return this.errorMsgParams;
        }

        public DescribeDataExportPreCheckResultResponseBodyPreCheckResultSubCheckItemsSubCheckItems setPreCheckItemName(String preCheckItemName) {
            this.preCheckItemName = preCheckItemName;
            return this;
        }
        public String getPreCheckItemName() {
            return this.preCheckItemName;
        }

        public DescribeDataExportPreCheckResultResponseBodyPreCheckResultSubCheckItemsSubCheckItems setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

    public static class DescribeDataExportPreCheckResultResponseBodyPreCheckResultSubCheckItems extends TeaModel {
        @NameInMap("SubCheckItems")
        public java.util.List<DescribeDataExportPreCheckResultResponseBodyPreCheckResultSubCheckItemsSubCheckItems> subCheckItems;

        public static DescribeDataExportPreCheckResultResponseBodyPreCheckResultSubCheckItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeDataExportPreCheckResultResponseBodyPreCheckResultSubCheckItems self = new DescribeDataExportPreCheckResultResponseBodyPreCheckResultSubCheckItems();
            return TeaModel.build(map, self);
        }

        public DescribeDataExportPreCheckResultResponseBodyPreCheckResultSubCheckItems setSubCheckItems(java.util.List<DescribeDataExportPreCheckResultResponseBodyPreCheckResultSubCheckItemsSubCheckItems> subCheckItems) {
            this.subCheckItems = subCheckItems;
            return this;
        }
        public java.util.List<DescribeDataExportPreCheckResultResponseBodyPreCheckResultSubCheckItemsSubCheckItems> getSubCheckItems() {
            return this.subCheckItems;
        }

    }

    public static class DescribeDataExportPreCheckResultResponseBodyPreCheckResult extends TeaModel {
        @NameInMap("PreCheckName")
        public String preCheckName;

        @NameInMap("State")
        public String state;

        @NameInMap("SubCheckItems")
        public DescribeDataExportPreCheckResultResponseBodyPreCheckResultSubCheckItems subCheckItems;

        public static DescribeDataExportPreCheckResultResponseBodyPreCheckResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeDataExportPreCheckResultResponseBodyPreCheckResult self = new DescribeDataExportPreCheckResultResponseBodyPreCheckResult();
            return TeaModel.build(map, self);
        }

        public DescribeDataExportPreCheckResultResponseBodyPreCheckResult setPreCheckName(String preCheckName) {
            this.preCheckName = preCheckName;
            return this;
        }
        public String getPreCheckName() {
            return this.preCheckName;
        }

        public DescribeDataExportPreCheckResultResponseBodyPreCheckResult setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeDataExportPreCheckResultResponseBodyPreCheckResult setSubCheckItems(DescribeDataExportPreCheckResultResponseBodyPreCheckResultSubCheckItems subCheckItems) {
            this.subCheckItems = subCheckItems;
            return this;
        }
        public DescribeDataExportPreCheckResultResponseBodyPreCheckResultSubCheckItems getSubCheckItems() {
            return this.subCheckItems;
        }

    }

}
