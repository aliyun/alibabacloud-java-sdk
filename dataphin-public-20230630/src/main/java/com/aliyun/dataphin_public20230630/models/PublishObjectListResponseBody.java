// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class PublishObjectListResponseBody extends TeaModel {
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

    @NameInMap("PublishResult")
    public PublishObjectListResponseBodyPublishResult publishResult;

    /**
     * <strong>example:</strong>
     * <p>75DD06F8-1661-5A6E-B0A6-7E23133BDC60</p>
     */
    @NameInMap("RequestId")
    public String requestId;

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
