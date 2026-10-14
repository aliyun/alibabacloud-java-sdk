// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aideepsign20260511.models;

import com.aliyun.tea.*;

public class GetWatermarkEmbedTaskResultResponseBody extends TeaModel {
    /**
     * <p><strong>The business error code.</strong> The value OK is returned if the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p><strong>The HTTP status code.</strong> The value 200 is returned if the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The failure reason when the task fails. This parameter is returned only when Status is failed.</p>
     * 
     * <strong>example:</strong>
     * <p>poll timeout: no result within 10m0s</p>
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
     * <p>The task status. The processing time is approximately equal to the media duration. Valid values:</p>
     * <ul>
     * <li>pending: The task is waiting.</li>
     * <li>running: The task is running.</li>
     * <li>succeeded: The task succeeded.</li>
     * <li>failed: The task failed.</li>
     * </ul>
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
     * <p>The invisible watermark embedding task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>f47ac10b-58cc-4372-a567-0e02b2c3d479</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>The pre-signed URL for accessing the watermarked file. This parameter is returned only when Status is succeeded.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://oss-bucket.example.com/aideepsign/">https://oss-bucket.example.com/aideepsign/</a>...</p>
     */
    @NameInMap("Url")
    public String url;

    public static GetWatermarkEmbedTaskResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetWatermarkEmbedTaskResultResponseBody self = new GetWatermarkEmbedTaskResultResponseBody();
        return TeaModel.build(map, self);
    }

    public GetWatermarkEmbedTaskResultResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetWatermarkEmbedTaskResultResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetWatermarkEmbedTaskResultResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetWatermarkEmbedTaskResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetWatermarkEmbedTaskResultResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetWatermarkEmbedTaskResultResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetWatermarkEmbedTaskResultResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public GetWatermarkEmbedTaskResultResponseBody setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
