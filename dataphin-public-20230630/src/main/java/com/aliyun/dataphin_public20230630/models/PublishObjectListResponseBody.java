// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class PublishObjectListResponseBody extends TeaModel {
    /**
     * <p>The error code. A value of OK indicates that the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The HTTP status code returned by the backend.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The publish result.</p>
     */
    @NameInMap("PublishResult")
    public PublishObjectListResponseBodyPublishResult publishResult;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>75DD06F8-1661-5A6E-B0A6-7E23133BDC60</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static PublishObjectListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PublishObjectListResponseBody self = new PublishObjectListResponseBody();
        return TeaModel.build(map, self);
    }

    public PublishObjectListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public PublishObjectListResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public PublishObjectListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public PublishObjectListResponseBody setPublishResult(PublishObjectListResponseBodyPublishResult publishResult) {
        this.publishResult = publishResult;
        return this;
    }
    public PublishObjectListResponseBodyPublishResult getPublishResult() {
        return this.publishResult;
    }

    public PublishObjectListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PublishObjectListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class PublishObjectListResponseBodyPublishResult extends TeaModel {
        /**
         * <p>The list of pending publish record IDs.</p>
         */
        @NameInMap("SubmitIdList")
        public java.util.List<Long> submitIdList;

        public static PublishObjectListResponseBodyPublishResult build(java.util.Map<String, ?> map) throws Exception {
            PublishObjectListResponseBodyPublishResult self = new PublishObjectListResponseBodyPublishResult();
            return TeaModel.build(map, self);
        }

        public PublishObjectListResponseBodyPublishResult setSubmitIdList(java.util.List<Long> submitIdList) {
            this.submitIdList = submitIdList;
            return this;
        }
        public java.util.List<Long> getSubmitIdList() {
            return this.submitIdList;
        }

    }

}
