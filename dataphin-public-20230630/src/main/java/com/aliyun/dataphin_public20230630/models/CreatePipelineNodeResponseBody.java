// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class CreatePipelineNodeResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CreatePipelineNodeResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>75DD06F8-1661-5A6E-B0A6-7E23133BDC60</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static CreatePipelineNodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreatePipelineNodeResponseBody self = new CreatePipelineNodeResponseBody();
        return TeaModel.build(map, self);
    }

    public CreatePipelineNodeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreatePipelineNodeResponseBody setData(CreatePipelineNodeResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreatePipelineNodeResponseBodyData getData() {
        return this.data;
    }

    public CreatePipelineNodeResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CreatePipelineNodeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreatePipelineNodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreatePipelineNodeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreatePipelineNodeResponseBodyData extends TeaModel {
        @NameInMap("ErrorCodeList")
        public java.util.List<String> errorCodeList;

        @NameInMap("ErrorMessageList")
        public java.util.List<String> errorMessageList;

        /**
         * <strong>example:</strong>
         * <p>33749</p>
         */
        @NameInMap("PipelineId")
        public Long pipelineId;

        public static CreatePipelineNodeResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreatePipelineNodeResponseBodyData self = new CreatePipelineNodeResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreatePipelineNodeResponseBodyData setErrorCodeList(java.util.List<String> errorCodeList) {
            this.errorCodeList = errorCodeList;
            return this;
        }
        public java.util.List<String> getErrorCodeList() {
            return this.errorCodeList;
        }

        public CreatePipelineNodeResponseBodyData setErrorMessageList(java.util.List<String> errorMessageList) {
            this.errorMessageList = errorMessageList;
            return this;
        }
        public java.util.List<String> getErrorMessageList() {
            return this.errorMessageList;
        }

        public CreatePipelineNodeResponseBodyData setPipelineId(Long pipelineId) {
            this.pipelineId = pipelineId;
            return this;
        }
        public Long getPipelineId() {
            return this.pipelineId;
        }

    }

}
