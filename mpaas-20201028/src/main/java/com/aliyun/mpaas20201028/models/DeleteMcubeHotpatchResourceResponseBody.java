// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class DeleteMcubeHotpatchResourceResponseBody extends TeaModel {
    @NameInMap("DeleteHotpatchResourceResult")
    public DeleteMcubeHotpatchResourceResponseBodyDeleteHotpatchResourceResult deleteHotpatchResourceResult;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    public static DeleteMcubeHotpatchResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteMcubeHotpatchResourceResponseBody self = new DeleteMcubeHotpatchResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteMcubeHotpatchResourceResponseBody setDeleteHotpatchResourceResult(DeleteMcubeHotpatchResourceResponseBodyDeleteHotpatchResourceResult deleteHotpatchResourceResult) {
        this.deleteHotpatchResourceResult = deleteHotpatchResourceResult;
        return this;
    }
    public DeleteMcubeHotpatchResourceResponseBodyDeleteHotpatchResourceResult getDeleteHotpatchResourceResult() {
        return this.deleteHotpatchResourceResult;
    }

    public DeleteMcubeHotpatchResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteMcubeHotpatchResourceResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public DeleteMcubeHotpatchResourceResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public static class DeleteMcubeHotpatchResourceResponseBodyDeleteHotpatchResourceResult extends TeaModel {
        @NameInMap("DeleteResult")
        public String deleteResult;

        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("RequestId")
        public String requestId;

        @NameInMap("ResultMsg")
        public String resultMsg;

        @NameInMap("Success")
        public Boolean success;

        public static DeleteMcubeHotpatchResourceResponseBodyDeleteHotpatchResourceResult build(java.util.Map<String, ?> map) throws Exception {
            DeleteMcubeHotpatchResourceResponseBodyDeleteHotpatchResourceResult self = new DeleteMcubeHotpatchResourceResponseBodyDeleteHotpatchResourceResult();
            return TeaModel.build(map, self);
        }

        public DeleteMcubeHotpatchResourceResponseBodyDeleteHotpatchResourceResult setDeleteResult(String deleteResult) {
            this.deleteResult = deleteResult;
            return this;
        }
        public String getDeleteResult() {
            return this.deleteResult;
        }

        public DeleteMcubeHotpatchResourceResponseBodyDeleteHotpatchResourceResult setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public DeleteMcubeHotpatchResourceResponseBodyDeleteHotpatchResourceResult setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public DeleteMcubeHotpatchResourceResponseBodyDeleteHotpatchResourceResult setResultMsg(String resultMsg) {
            this.resultMsg = resultMsg;
            return this;
        }
        public String getResultMsg() {
            return this.resultMsg;
        }

        public DeleteMcubeHotpatchResourceResponseBodyDeleteHotpatchResourceResult setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
