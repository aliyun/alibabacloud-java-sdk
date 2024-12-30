// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class CreateBatchTaskResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("CreateResult")
    public CreateBatchTaskResponseBodyCreateResult createResult;

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

    public static CreateBatchTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateBatchTaskResponseBody self = new CreateBatchTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateBatchTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateBatchTaskResponseBody setCreateResult(CreateBatchTaskResponseBodyCreateResult createResult) {
        this.createResult = createResult;
        return this;
    }
    public CreateBatchTaskResponseBodyCreateResult getCreateResult() {
        return this.createResult;
    }

    public CreateBatchTaskResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CreateBatchTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateBatchTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateBatchTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateBatchTaskResponseBodyCreateResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>12113111</p>
         */
        @NameInMap("FileId")
        public Long fileId;

        public static CreateBatchTaskResponseBodyCreateResult build(java.util.Map<String, ?> map) throws Exception {
            CreateBatchTaskResponseBodyCreateResult self = new CreateBatchTaskResponseBodyCreateResult();
            return TeaModel.build(map, self);
        }

        public CreateBatchTaskResponseBodyCreateResult setFileId(Long fileId) {
            this.fileId = fileId;
            return this;
        }
        public Long getFileId() {
            return this.fileId;
        }

    }

}
