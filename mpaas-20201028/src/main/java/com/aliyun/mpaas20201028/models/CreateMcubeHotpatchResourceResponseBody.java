// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class CreateMcubeHotpatchResourceResponseBody extends TeaModel {
    @NameInMap("CreateHotpatchResourceResult")
    public CreateMcubeHotpatchResourceResponseBodyCreateHotpatchResourceResult createHotpatchResourceResult;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    public static CreateMcubeHotpatchResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateMcubeHotpatchResourceResponseBody self = new CreateMcubeHotpatchResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateMcubeHotpatchResourceResponseBody setCreateHotpatchResourceResult(CreateMcubeHotpatchResourceResponseBodyCreateHotpatchResourceResult createHotpatchResourceResult) {
        this.createHotpatchResourceResult = createHotpatchResourceResult;
        return this;
    }
    public CreateMcubeHotpatchResourceResponseBodyCreateHotpatchResourceResult getCreateHotpatchResourceResult() {
        return this.createHotpatchResourceResult;
    }

    public CreateMcubeHotpatchResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateMcubeHotpatchResourceResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateMcubeHotpatchResourceResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public static class CreateMcubeHotpatchResourceResponseBodyCreateHotpatchResourceResult extends TeaModel {
        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("HotpatchResourceId")
        public String hotpatchResourceId;

        @NameInMap("RequestId")
        public String requestId;

        @NameInMap("ResultMsg")
        public String resultMsg;

        @NameInMap("Success")
        public Boolean success;

        public static CreateMcubeHotpatchResourceResponseBodyCreateHotpatchResourceResult build(java.util.Map<String, ?> map) throws Exception {
            CreateMcubeHotpatchResourceResponseBodyCreateHotpatchResourceResult self = new CreateMcubeHotpatchResourceResponseBodyCreateHotpatchResourceResult();
            return TeaModel.build(map, self);
        }

        public CreateMcubeHotpatchResourceResponseBodyCreateHotpatchResourceResult setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public CreateMcubeHotpatchResourceResponseBodyCreateHotpatchResourceResult setHotpatchResourceId(String hotpatchResourceId) {
            this.hotpatchResourceId = hotpatchResourceId;
            return this;
        }
        public String getHotpatchResourceId() {
            return this.hotpatchResourceId;
        }

        public CreateMcubeHotpatchResourceResponseBodyCreateHotpatchResourceResult setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public CreateMcubeHotpatchResourceResponseBodyCreateHotpatchResourceResult setResultMsg(String resultMsg) {
            this.resultMsg = resultMsg;
            return this;
        }
        public String getResultMsg() {
            return this.resultMsg;
        }

        public CreateMcubeHotpatchResourceResponseBodyCreateHotpatchResourceResult setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
