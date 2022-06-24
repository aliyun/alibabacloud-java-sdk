// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20200710.models;

import com.aliyun.tea.*;

public class UploadMcubeMiniPackageResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("UploadMiniPackageResult")
    public UploadMcubeMiniPackageResponseBodyUploadMiniPackageResult uploadMiniPackageResult;

    public static UploadMcubeMiniPackageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UploadMcubeMiniPackageResponseBody self = new UploadMcubeMiniPackageResponseBody();
        return TeaModel.build(map, self);
    }

    public UploadMcubeMiniPackageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UploadMcubeMiniPackageResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public UploadMcubeMiniPackageResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public UploadMcubeMiniPackageResponseBody setUploadMiniPackageResult(UploadMcubeMiniPackageResponseBodyUploadMiniPackageResult uploadMiniPackageResult) {
        this.uploadMiniPackageResult = uploadMiniPackageResult;
        return this;
    }
    public UploadMcubeMiniPackageResponseBodyUploadMiniPackageResult getUploadMiniPackageResult() {
        return this.uploadMiniPackageResult;
    }

    public static class UploadMcubeMiniPackageResponseBodyUploadMiniPackageResultReturnPackageResult extends TeaModel {
        @NameInMap("DebugUrl")
        public String debugUrl;

        @NameInMap("PackageId")
        public String packageId;

        @NameInMap("UserId")
        public String userId;

        public static UploadMcubeMiniPackageResponseBodyUploadMiniPackageResultReturnPackageResult build(java.util.Map<String, ?> map) throws Exception {
            UploadMcubeMiniPackageResponseBodyUploadMiniPackageResultReturnPackageResult self = new UploadMcubeMiniPackageResponseBodyUploadMiniPackageResultReturnPackageResult();
            return TeaModel.build(map, self);
        }

        public UploadMcubeMiniPackageResponseBodyUploadMiniPackageResultReturnPackageResult setDebugUrl(String debugUrl) {
            this.debugUrl = debugUrl;
            return this;
        }
        public String getDebugUrl() {
            return this.debugUrl;
        }

        public UploadMcubeMiniPackageResponseBodyUploadMiniPackageResultReturnPackageResult setPackageId(String packageId) {
            this.packageId = packageId;
            return this;
        }
        public String getPackageId() {
            return this.packageId;
        }

        public UploadMcubeMiniPackageResponseBodyUploadMiniPackageResultReturnPackageResult setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class UploadMcubeMiniPackageResponseBodyUploadMiniPackageResult extends TeaModel {
        @NameInMap("ResultMsg")
        public String resultMsg;

        @NameInMap("ReturnPackageResult")
        public UploadMcubeMiniPackageResponseBodyUploadMiniPackageResultReturnPackageResult returnPackageResult;

        @NameInMap("Success")
        public Boolean success;

        public static UploadMcubeMiniPackageResponseBodyUploadMiniPackageResult build(java.util.Map<String, ?> map) throws Exception {
            UploadMcubeMiniPackageResponseBodyUploadMiniPackageResult self = new UploadMcubeMiniPackageResponseBodyUploadMiniPackageResult();
            return TeaModel.build(map, self);
        }

        public UploadMcubeMiniPackageResponseBodyUploadMiniPackageResult setResultMsg(String resultMsg) {
            this.resultMsg = resultMsg;
            return this;
        }
        public String getResultMsg() {
            return this.resultMsg;
        }

        public UploadMcubeMiniPackageResponseBodyUploadMiniPackageResult setReturnPackageResult(UploadMcubeMiniPackageResponseBodyUploadMiniPackageResultReturnPackageResult returnPackageResult) {
            this.returnPackageResult = returnPackageResult;
            return this;
        }
        public UploadMcubeMiniPackageResponseBodyUploadMiniPackageResultReturnPackageResult getReturnPackageResult() {
            return this.returnPackageResult;
        }

        public UploadMcubeMiniPackageResponseBodyUploadMiniPackageResult setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
