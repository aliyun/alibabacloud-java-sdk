// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20200710.models;

import com.aliyun.tea.*;

public class DeleteMcubeNebulaAppResponseBody extends TeaModel {
    @NameInMap("DeleteMcubeNebulaAppResult")
    public DeleteMcubeNebulaAppResponseBodyDeleteMcubeNebulaAppResult deleteMcubeNebulaAppResult;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    public static DeleteMcubeNebulaAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteMcubeNebulaAppResponseBody self = new DeleteMcubeNebulaAppResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteMcubeNebulaAppResponseBody setDeleteMcubeNebulaAppResult(DeleteMcubeNebulaAppResponseBodyDeleteMcubeNebulaAppResult deleteMcubeNebulaAppResult) {
        this.deleteMcubeNebulaAppResult = deleteMcubeNebulaAppResult;
        return this;
    }
    public DeleteMcubeNebulaAppResponseBodyDeleteMcubeNebulaAppResult getDeleteMcubeNebulaAppResult() {
        return this.deleteMcubeNebulaAppResult;
    }

    public DeleteMcubeNebulaAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteMcubeNebulaAppResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public DeleteMcubeNebulaAppResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public static class DeleteMcubeNebulaAppResponseBodyDeleteMcubeNebulaAppResult extends TeaModel {
        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("RequestId")
        public String requestId;

        @NameInMap("ResultMsg")
        public String resultMsg;

        @NameInMap("Success")
        public Boolean success;

        public static DeleteMcubeNebulaAppResponseBodyDeleteMcubeNebulaAppResult build(java.util.Map<String, ?> map) throws Exception {
            DeleteMcubeNebulaAppResponseBodyDeleteMcubeNebulaAppResult self = new DeleteMcubeNebulaAppResponseBodyDeleteMcubeNebulaAppResult();
            return TeaModel.build(map, self);
        }

        public DeleteMcubeNebulaAppResponseBodyDeleteMcubeNebulaAppResult setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public DeleteMcubeNebulaAppResponseBodyDeleteMcubeNebulaAppResult setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public DeleteMcubeNebulaAppResponseBodyDeleteMcubeNebulaAppResult setResultMsg(String resultMsg) {
            this.resultMsg = resultMsg;
            return this;
        }
        public String getResultMsg() {
            return this.resultMsg;
        }

        public DeleteMcubeNebulaAppResponseBodyDeleteMcubeNebulaAppResult setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
