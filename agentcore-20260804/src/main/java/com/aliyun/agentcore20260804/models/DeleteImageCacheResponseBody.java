// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class DeleteImageCacheResponseBody extends TeaModel {
    /**
     * <p>The business response code.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The result of deleting the image cache.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("data")
    public DeleteImageCacheResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The response message.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request ID, which is used for troubleshooting.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>req-example</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful. This does not mean that the cache creation is complete.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static DeleteImageCacheResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteImageCacheResponseBody self = new DeleteImageCacheResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteImageCacheResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteImageCacheResponseBody setData(DeleteImageCacheResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DeleteImageCacheResponseBodyData getData() {
        return this.data;
    }

    public DeleteImageCacheResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DeleteImageCacheResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteImageCacheResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteImageCacheResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DeleteImageCacheResponseBodyData extends TeaModel {
        /**
         * <p>Indicates whether the deletion is still in progress. A value of true indicates that the deletion is accepted but not yet complete, and a Get request returns DELETING until ImageCacheNotFound is explicitly returned. A value of false indicates that the current workspace is deleted or no longer exists.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("deletionPending")
        public Boolean deletionPending;

        /**
         * <p>The image cache ID, which matches the request. The requested ID is still returned even if the current workspace no longer exists.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>img-example</p>
         */
        @NameInMap("imageId")
        public String imageId;

        public static DeleteImageCacheResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DeleteImageCacheResponseBodyData self = new DeleteImageCacheResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DeleteImageCacheResponseBodyData setDeletionPending(Boolean deletionPending) {
            this.deletionPending = deletionPending;
            return this;
        }
        public Boolean getDeletionPending() {
            return this.deletionPending;
        }

        public DeleteImageCacheResponseBodyData setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

    }

}
