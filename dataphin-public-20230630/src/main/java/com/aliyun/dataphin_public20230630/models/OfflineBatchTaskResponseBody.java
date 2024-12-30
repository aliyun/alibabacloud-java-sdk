// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class OfflineBatchTaskResponseBody extends TeaModel {
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

    @NameInMap("OfflineResult")
    public OfflineBatchTaskResponseBodyOfflineResult offlineResult;

    /**
     * <strong>example:</strong>
     * <p>75DD06F8-1661-5A6E-B0A6-7E23133BDC60</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static OfflineBatchTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OfflineBatchTaskResponseBody self = new OfflineBatchTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public OfflineBatchTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public OfflineBatchTaskResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public OfflineBatchTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public OfflineBatchTaskResponseBody setOfflineResult(OfflineBatchTaskResponseBodyOfflineResult offlineResult) {
        this.offlineResult = offlineResult;
        return this;
    }
    public OfflineBatchTaskResponseBodyOfflineResult getOfflineResult() {
        return this.offlineResult;
    }

    public OfflineBatchTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public OfflineBatchTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class OfflineBatchTaskResponseBodyOfflineResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>10211123</p>
         */
        @NameInMap("PublishObjectId")
        public Long publishObjectId;

        public static OfflineBatchTaskResponseBodyOfflineResult build(java.util.Map<String, ?> map) throws Exception {
            OfflineBatchTaskResponseBodyOfflineResult self = new OfflineBatchTaskResponseBodyOfflineResult();
            return TeaModel.build(map, self);
        }

        public OfflineBatchTaskResponseBodyOfflineResult setPublishObjectId(Long publishObjectId) {
            this.publishObjectId = publishObjectId;
            return this;
        }
        public Long getPublishObjectId() {
            return this.publishObjectId;
        }

    }

}
