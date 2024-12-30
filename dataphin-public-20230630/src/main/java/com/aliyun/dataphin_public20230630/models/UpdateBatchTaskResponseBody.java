// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class UpdateBatchTaskResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

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

    @NameInMap("UpdateResult")
    public UpdateBatchTaskResponseBodyUpdateResult updateResult;

    public static UpdateBatchTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateBatchTaskResponseBody self = new UpdateBatchTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateBatchTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateBatchTaskResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public UpdateBatchTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateBatchTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateBatchTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public UpdateBatchTaskResponseBody setUpdateResult(UpdateBatchTaskResponseBodyUpdateResult updateResult) {
        this.updateResult = updateResult;
        return this;
    }
    public UpdateBatchTaskResponseBodyUpdateResult getUpdateResult() {
        return this.updateResult;
    }

    public static class UpdateBatchTaskResponseBodyUpdateResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>12113111</p>
         */
        @NameInMap("FileId")
        public Long fileId;

        public static UpdateBatchTaskResponseBodyUpdateResult build(java.util.Map<String, ?> map) throws Exception {
            UpdateBatchTaskResponseBodyUpdateResult self = new UpdateBatchTaskResponseBodyUpdateResult();
            return TeaModel.build(map, self);
        }

        public UpdateBatchTaskResponseBodyUpdateResult setFileId(Long fileId) {
            this.fileId = fileId;
            return this;
        }
        public Long getFileId() {
            return this.fileId;
        }

    }

}
