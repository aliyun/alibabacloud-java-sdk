// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class CreateMcubeHotpatchResourceResponseBody extends TeaModel {
    @NameInMap("CreateHotpatchResourceResult")
    public CreateMcubeHotpatchResourceResponseBodyCreateHotpatchResourceResult createHotpatchResourceResult;

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
        /**
         * <strong>example:</strong>
         * <p>OK</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <strong>example:</strong>
         * <p>1768</p>
         */
        @NameInMap("HotpatchResourceId")
        public String hotpatchResourceId;

        /**
         * <strong>example:</strong>
         * <p>EA606F90-F758-5EDC-A70F-939F089CA496</p>
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
