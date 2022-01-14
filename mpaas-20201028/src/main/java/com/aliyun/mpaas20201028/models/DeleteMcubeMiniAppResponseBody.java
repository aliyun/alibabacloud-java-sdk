// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class DeleteMcubeMiniAppResponseBody extends TeaModel {
    @NameInMap("DeleteMiniResult")
    public DeleteMcubeMiniAppResponseBodyDeleteMiniResult deleteMiniResult;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    public static DeleteMcubeMiniAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteMcubeMiniAppResponseBody self = new DeleteMcubeMiniAppResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteMcubeMiniAppResponseBody setDeleteMiniResult(DeleteMcubeMiniAppResponseBodyDeleteMiniResult deleteMiniResult) {
        this.deleteMiniResult = deleteMiniResult;
        return this;
    }
    public DeleteMcubeMiniAppResponseBodyDeleteMiniResult getDeleteMiniResult() {
        return this.deleteMiniResult;
    }

    public DeleteMcubeMiniAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteMcubeMiniAppResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public DeleteMcubeMiniAppResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public static class DeleteMcubeMiniAppResponseBodyDeleteMiniResult extends TeaModel {
        @NameInMap("Data")
        public String data;

        @NameInMap("ResultMsg")
        public String resultMsg;

        @NameInMap("Success")
        public Boolean success;

        public static DeleteMcubeMiniAppResponseBodyDeleteMiniResult build(java.util.Map<String, ?> map) throws Exception {
            DeleteMcubeMiniAppResponseBodyDeleteMiniResult self = new DeleteMcubeMiniAppResponseBodyDeleteMiniResult();
            return TeaModel.build(map, self);
        }

        public DeleteMcubeMiniAppResponseBodyDeleteMiniResult setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

        public DeleteMcubeMiniAppResponseBodyDeleteMiniResult setResultMsg(String resultMsg) {
            this.resultMsg = resultMsg;
            return this;
        }
        public String getResultMsg() {
            return this.resultMsg;
        }

        public DeleteMcubeMiniAppResponseBodyDeleteMiniResult setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
