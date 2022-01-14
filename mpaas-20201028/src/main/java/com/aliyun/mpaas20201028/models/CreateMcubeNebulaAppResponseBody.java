// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class CreateMcubeNebulaAppResponseBody extends TeaModel {
    @NameInMap("CreateNebulaAppResult")
    public CreateMcubeNebulaAppResponseBodyCreateNebulaAppResult createNebulaAppResult;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    public static CreateMcubeNebulaAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateMcubeNebulaAppResponseBody self = new CreateMcubeNebulaAppResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateMcubeNebulaAppResponseBody setCreateNebulaAppResult(CreateMcubeNebulaAppResponseBodyCreateNebulaAppResult createNebulaAppResult) {
        this.createNebulaAppResult = createNebulaAppResult;
        return this;
    }
    public CreateMcubeNebulaAppResponseBodyCreateNebulaAppResult getCreateNebulaAppResult() {
        return this.createNebulaAppResult;
    }

    public CreateMcubeNebulaAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateMcubeNebulaAppResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateMcubeNebulaAppResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public static class CreateMcubeNebulaAppResponseBodyCreateNebulaAppResult extends TeaModel {
        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("RequestId")
        public String requestId;

        @NameInMap("ResultMsg")
        public String resultMsg;

        @NameInMap("Success")
        public Boolean success;

        public static CreateMcubeNebulaAppResponseBodyCreateNebulaAppResult build(java.util.Map<String, ?> map) throws Exception {
            CreateMcubeNebulaAppResponseBodyCreateNebulaAppResult self = new CreateMcubeNebulaAppResponseBodyCreateNebulaAppResult();
            return TeaModel.build(map, self);
        }

        public CreateMcubeNebulaAppResponseBodyCreateNebulaAppResult setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public CreateMcubeNebulaAppResponseBodyCreateNebulaAppResult setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public CreateMcubeNebulaAppResponseBodyCreateNebulaAppResult setResultMsg(String resultMsg) {
            this.resultMsg = resultMsg;
            return this;
        }
        public String getResultMsg() {
            return this.resultMsg;
        }

        public CreateMcubeNebulaAppResponseBodyCreateNebulaAppResult setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
