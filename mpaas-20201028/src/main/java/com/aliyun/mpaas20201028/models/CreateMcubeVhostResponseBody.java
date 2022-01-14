// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class CreateMcubeVhostResponseBody extends TeaModel {
    @NameInMap("CreateVhostResult")
    public CreateMcubeVhostResponseBodyCreateVhostResult createVhostResult;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    public static CreateMcubeVhostResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateMcubeVhostResponseBody self = new CreateMcubeVhostResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateMcubeVhostResponseBody setCreateVhostResult(CreateMcubeVhostResponseBodyCreateVhostResult createVhostResult) {
        this.createVhostResult = createVhostResult;
        return this;
    }
    public CreateMcubeVhostResponseBodyCreateVhostResult getCreateVhostResult() {
        return this.createVhostResult;
    }

    public CreateMcubeVhostResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateMcubeVhostResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateMcubeVhostResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public static class CreateMcubeVhostResponseBodyCreateVhostResult extends TeaModel {
        @NameInMap("Data")
        public String data;

        @NameInMap("ResultMsg")
        public String resultMsg;

        @NameInMap("Success")
        public Boolean success;

        public static CreateMcubeVhostResponseBodyCreateVhostResult build(java.util.Map<String, ?> map) throws Exception {
            CreateMcubeVhostResponseBodyCreateVhostResult self = new CreateMcubeVhostResponseBodyCreateVhostResult();
            return TeaModel.build(map, self);
        }

        public CreateMcubeVhostResponseBodyCreateVhostResult setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

        public CreateMcubeVhostResponseBodyCreateVhostResult setResultMsg(String resultMsg) {
            this.resultMsg = resultMsg;
            return this;
        }
        public String getResultMsg() {
            return this.resultMsg;
        }

        public CreateMcubeVhostResponseBodyCreateVhostResult setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
