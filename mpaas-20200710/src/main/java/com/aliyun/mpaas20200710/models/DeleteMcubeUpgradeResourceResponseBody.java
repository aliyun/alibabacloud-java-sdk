// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20200710.models;

import com.aliyun.tea.*;

public class DeleteMcubeUpgradeResourceResponseBody extends TeaModel {
    @NameInMap("DeleteResult")
    public DeleteMcubeUpgradeResourceResponseBodyDeleteResult deleteResult;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    public static DeleteMcubeUpgradeResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteMcubeUpgradeResourceResponseBody self = new DeleteMcubeUpgradeResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteMcubeUpgradeResourceResponseBody setDeleteResult(DeleteMcubeUpgradeResourceResponseBodyDeleteResult deleteResult) {
        this.deleteResult = deleteResult;
        return this;
    }
    public DeleteMcubeUpgradeResourceResponseBodyDeleteResult getDeleteResult() {
        return this.deleteResult;
    }

    public DeleteMcubeUpgradeResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteMcubeUpgradeResourceResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public DeleteMcubeUpgradeResourceResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public static class DeleteMcubeUpgradeResourceResponseBodyDeleteResult extends TeaModel {
        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("RequestId")
        public String requestId;

        @NameInMap("ResultMsg")
        public String resultMsg;

        @NameInMap("Success")
        public Boolean success;

        public static DeleteMcubeUpgradeResourceResponseBodyDeleteResult build(java.util.Map<String, ?> map) throws Exception {
            DeleteMcubeUpgradeResourceResponseBodyDeleteResult self = new DeleteMcubeUpgradeResourceResponseBodyDeleteResult();
            return TeaModel.build(map, self);
        }

        public DeleteMcubeUpgradeResourceResponseBodyDeleteResult setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public DeleteMcubeUpgradeResourceResponseBodyDeleteResult setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public DeleteMcubeUpgradeResourceResponseBodyDeleteResult setResultMsg(String resultMsg) {
            this.resultMsg = resultMsg;
            return this;
        }
        public String getResultMsg() {
            return this.resultMsg;
        }

        public DeleteMcubeUpgradeResourceResponseBodyDeleteResult setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
