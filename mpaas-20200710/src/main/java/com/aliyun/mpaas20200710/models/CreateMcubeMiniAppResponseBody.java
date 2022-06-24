// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20200710.models;

import com.aliyun.tea.*;

public class CreateMcubeMiniAppResponseBody extends TeaModel {
    @NameInMap("CreateMiniResult")
    public CreateMcubeMiniAppResponseBodyCreateMiniResult createMiniResult;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    public static CreateMcubeMiniAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateMcubeMiniAppResponseBody self = new CreateMcubeMiniAppResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateMcubeMiniAppResponseBody setCreateMiniResult(CreateMcubeMiniAppResponseBodyCreateMiniResult createMiniResult) {
        this.createMiniResult = createMiniResult;
        return this;
    }
    public CreateMcubeMiniAppResponseBodyCreateMiniResult getCreateMiniResult() {
        return this.createMiniResult;
    }

    public CreateMcubeMiniAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateMcubeMiniAppResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateMcubeMiniAppResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public static class CreateMcubeMiniAppResponseBodyCreateMiniResult extends TeaModel {
        @NameInMap("Data")
        public String data;

        @NameInMap("ResultMsg")
        public String resultMsg;

        @NameInMap("Success")
        public Boolean success;

        public static CreateMcubeMiniAppResponseBodyCreateMiniResult build(java.util.Map<String, ?> map) throws Exception {
            CreateMcubeMiniAppResponseBodyCreateMiniResult self = new CreateMcubeMiniAppResponseBodyCreateMiniResult();
            return TeaModel.build(map, self);
        }

        public CreateMcubeMiniAppResponseBodyCreateMiniResult setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

        public CreateMcubeMiniAppResponseBodyCreateMiniResult setResultMsg(String resultMsg) {
            this.resultMsg = resultMsg;
            return this;
        }
        public String getResultMsg() {
            return this.resultMsg;
        }

        public CreateMcubeMiniAppResponseBodyCreateMiniResult setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
