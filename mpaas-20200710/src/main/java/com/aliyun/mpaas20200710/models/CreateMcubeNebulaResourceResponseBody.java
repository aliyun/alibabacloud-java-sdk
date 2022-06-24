// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20200710.models;

import com.aliyun.tea.*;

public class CreateMcubeNebulaResourceResponseBody extends TeaModel {
    @NameInMap("CreateMcubeNebulaResourceReslult")
    public CreateMcubeNebulaResourceResponseBodyCreateMcubeNebulaResourceReslult createMcubeNebulaResourceReslult;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    public static CreateMcubeNebulaResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateMcubeNebulaResourceResponseBody self = new CreateMcubeNebulaResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateMcubeNebulaResourceResponseBody setCreateMcubeNebulaResourceReslult(CreateMcubeNebulaResourceResponseBodyCreateMcubeNebulaResourceReslult createMcubeNebulaResourceReslult) {
        this.createMcubeNebulaResourceReslult = createMcubeNebulaResourceReslult;
        return this;
    }
    public CreateMcubeNebulaResourceResponseBodyCreateMcubeNebulaResourceReslult getCreateMcubeNebulaResourceReslult() {
        return this.createMcubeNebulaResourceReslult;
    }

    public CreateMcubeNebulaResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateMcubeNebulaResourceResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateMcubeNebulaResourceResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public static class CreateMcubeNebulaResourceResponseBodyCreateMcubeNebulaResourceReslult extends TeaModel {
        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("NebulaResourceId")
        public String nebulaResourceId;

        @NameInMap("RequestId")
        public String requestId;

        @NameInMap("ResultMsg")
        public String resultMsg;

        @NameInMap("Success")
        public Boolean success;

        public static CreateMcubeNebulaResourceResponseBodyCreateMcubeNebulaResourceReslult build(java.util.Map<String, ?> map) throws Exception {
            CreateMcubeNebulaResourceResponseBodyCreateMcubeNebulaResourceReslult self = new CreateMcubeNebulaResourceResponseBodyCreateMcubeNebulaResourceReslult();
            return TeaModel.build(map, self);
        }

        public CreateMcubeNebulaResourceResponseBodyCreateMcubeNebulaResourceReslult setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public CreateMcubeNebulaResourceResponseBodyCreateMcubeNebulaResourceReslult setNebulaResourceId(String nebulaResourceId) {
            this.nebulaResourceId = nebulaResourceId;
            return this;
        }
        public String getNebulaResourceId() {
            return this.nebulaResourceId;
        }

        public CreateMcubeNebulaResourceResponseBodyCreateMcubeNebulaResourceReslult setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public CreateMcubeNebulaResourceResponseBodyCreateMcubeNebulaResourceReslult setResultMsg(String resultMsg) {
            this.resultMsg = resultMsg;
            return this;
        }
        public String getResultMsg() {
            return this.resultMsg;
        }

        public CreateMcubeNebulaResourceResponseBodyCreateMcubeNebulaResourceReslult setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
