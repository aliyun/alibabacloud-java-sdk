// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aideepsign20260511.models;

import com.aliyun.tea.*;

public class GetImageTaskResultResponseBody extends TeaModel {
    /**
     * <p>The business error code. The value <code>OK</code> is returned if the request succeeds.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The error message. This parameter is returned only when the task status is <code>failed</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>Instance access forbidden.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The HTTP status code. The value <code>200</code> is returned if the request succeeds.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The list of generated images. This parameter is returned only when <code>Status</code> is <code>succeeded</code>.</p>
     */
    @NameInMap("Images")
    public java.util.List<GetImageTaskResultResponseBodyImages> images;

    /**
     * <p>The additional information. The value <code>success</code> is returned if the request succeeds. An error message is returned if the task fails. This parameter is returned only when <code>Status</code> is <code>failed</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A1B2C3D4-E5F6-7890-ABCD-EF1234567890</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The task status. Valid values: <code>pending</code> (waiting), <code>running</code> (in progress), <code>succeeded</code> (completed), <code>failed</code> (failed).</p>
     * 
     * <strong>example:</strong>
     * <p>succeeded</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>f47ac10b-58cc-4372-a567-0e02b2c3d479</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static GetImageTaskResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetImageTaskResultResponseBody self = new GetImageTaskResultResponseBody();
        return TeaModel.build(map, self);
    }

    public GetImageTaskResultResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetImageTaskResultResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetImageTaskResultResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetImageTaskResultResponseBody setImages(java.util.List<GetImageTaskResultResponseBodyImages> images) {
        this.images = images;
        return this;
    }
    public java.util.List<GetImageTaskResultResponseBodyImages> getImages() {
        return this.images;
    }

    public GetImageTaskResultResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetImageTaskResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetImageTaskResultResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetImageTaskResultResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetImageTaskResultResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public static class GetImageTaskResultResponseBodyImages extends TeaModel {
        /**
         * <p>The <code>ObjectKey</code> of the image in OSS. You can use this value in subsequent API calls.</p>
         * 
         * <strong>example:</strong>
         * <p>deepsign/123456789/image-generation/abc12345-def6-7890-abcd-ef1234567890.png</p>
         */
        @NameInMap("ObjectKey")
        public String objectKey;

        /**
         * <p>The pre-signed download URL of the image. The URL is valid for 1 hour.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://bucket.oss-cn-hangzhou.aliyuncs.com/deepsign/123456789/image-generation/abc12345.png?Expires=1718700000&OSSAccessKeyId=">https://bucket.oss-cn-hangzhou.aliyuncs.com/deepsign/123456789/image-generation/abc12345.png?Expires=1718700000&amp;OSSAccessKeyId=</a>...</p>
         */
        @NameInMap("Url")
        public String url;

        public static GetImageTaskResultResponseBodyImages build(java.util.Map<String, ?> map) throws Exception {
            GetImageTaskResultResponseBodyImages self = new GetImageTaskResultResponseBodyImages();
            return TeaModel.build(map, self);
        }

        public GetImageTaskResultResponseBodyImages setObjectKey(String objectKey) {
            this.objectKey = objectKey;
            return this;
        }
        public String getObjectKey() {
            return this.objectKey;
        }

        public GetImageTaskResultResponseBodyImages setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
