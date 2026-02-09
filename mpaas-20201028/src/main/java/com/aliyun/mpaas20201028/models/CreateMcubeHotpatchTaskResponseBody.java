// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class CreateMcubeHotpatchTaskResponseBody extends TeaModel {
    @NameInMap("CreateHotpatchTaskResult")
    public CreateMcubeHotpatchTaskResponseBodyCreateHotpatchTaskResult createHotpatchTaskResult;

    /**
     * <strong>example:</strong>
     * <p>11E66B29-9E5E-5C10-B64E-B5A0E0F26355</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("ResultCode")
    public String resultCode;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("ResultMessage")
    public String resultMessage;

    public static CreateMcubeHotpatchTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateMcubeHotpatchTaskResponseBody self = new CreateMcubeHotpatchTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateMcubeHotpatchTaskResponseBody setCreateHotpatchTaskResult(CreateMcubeHotpatchTaskResponseBodyCreateHotpatchTaskResult createHotpatchTaskResult) {
        this.createHotpatchTaskResult = createHotpatchTaskResult;
        return this;
    }
    public CreateMcubeHotpatchTaskResponseBodyCreateHotpatchTaskResult getCreateHotpatchTaskResult() {
        return this.createHotpatchTaskResult;
    }

    public CreateMcubeHotpatchTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateMcubeHotpatchTaskResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateMcubeHotpatchTaskResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public static class CreateMcubeHotpatchTaskResponseBodyCreateHotpatchTaskResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>OK</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <strong>example:</strong>
         * <p>1490</p>
         */
        @NameInMap("HotpatchTaskId")
        public String hotpatchTaskId;

        /**
         * <strong>example:</strong>
         * <p>FD352990-0D38-5580-B6E1-EBE64B234059</p>
         */
        @NameInMap("RequestId")
        public String requestId;

        /**
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("ResultMsg")
        public String resultMsg;

        /**
         * <strong>example:</strong>
         * <p>True</p>
         */
        @NameInMap("Success")
        public Boolean success;

        public static CreateMcubeHotpatchTaskResponseBodyCreateHotpatchTaskResult build(java.util.Map<String, ?> map) throws Exception {
            CreateMcubeHotpatchTaskResponseBodyCreateHotpatchTaskResult self = new CreateMcubeHotpatchTaskResponseBodyCreateHotpatchTaskResult();
            return TeaModel.build(map, self);
        }

        public CreateMcubeHotpatchTaskResponseBodyCreateHotpatchTaskResult setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public CreateMcubeHotpatchTaskResponseBodyCreateHotpatchTaskResult setHotpatchTaskId(String hotpatchTaskId) {
            this.hotpatchTaskId = hotpatchTaskId;
            return this;
        }
        public String getHotpatchTaskId() {
            return this.hotpatchTaskId;
        }

        public CreateMcubeHotpatchTaskResponseBodyCreateHotpatchTaskResult setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public CreateMcubeHotpatchTaskResponseBodyCreateHotpatchTaskResult setResultMsg(String resultMsg) {
            this.resultMsg = resultMsg;
            return this;
        }
        public String getResultMsg() {
            return this.resultMsg;
        }

        public CreateMcubeHotpatchTaskResponseBodyCreateHotpatchTaskResult setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
