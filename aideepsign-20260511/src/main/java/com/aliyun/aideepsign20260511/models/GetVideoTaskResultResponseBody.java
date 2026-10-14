// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aideepsign20260511.models;

import com.aliyun.tea.*;

public class GetVideoTaskResultResponseBody extends TeaModel {
    /**
     * <p><strong>Business error code.</strong> Returns &quot;OK&quot; if the request succeeds.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The cause of the failure. This field is returned only when the task status is failed.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>A1B2C3D4-E5F6-7890-ABCD-EF1234567890</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The task status. Valid values: running, succeeded, and failed. Set the polling interval to at least 5 seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>succeeded</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>Indicates whether the request is successful.</p>
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

    /**
     * <p>The list of video information.</p>
     */
    @NameInMap("Videos")
    public java.util.List<GetVideoTaskResultResponseBodyVideos> videos;

    public static GetVideoTaskResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetVideoTaskResultResponseBody self = new GetVideoTaskResultResponseBody();
        return TeaModel.build(map, self);
    }

    public GetVideoTaskResultResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetVideoTaskResultResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetVideoTaskResultResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetVideoTaskResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetVideoTaskResultResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetVideoTaskResultResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetVideoTaskResultResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public GetVideoTaskResultResponseBody setVideos(java.util.List<GetVideoTaskResultResponseBodyVideos> videos) {
        this.videos = videos;
        return this;
    }
    public java.util.List<GetVideoTaskResultResponseBodyVideos> getVideos() {
        return this.videos;
    }

    public static class GetVideoTaskResultResponseBodyVideos extends TeaModel {
        /**
         * <p>The OSS key of the output object.</p>
         * 
         * <strong>example:</strong>
         * <p>ai_deep_sign/1192853035118460/image-generation/2026/06/25/024d6974-1b14-4741-8919-9d02b7e3901b.mp4</p>
         */
        @NameInMap("ObjectKey")
        public String objectKey;

        /**
         * <p>The presigned download URL of the video stored in OSS after C2PA signing.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://duguang-database-public.oss-cn-hangzhou.aliyuncs.com/cosmetic_plicense_init/024d6974-1b14-4741-8919-9d02b7e3901b.mp4">http://duguang-database-public.oss-cn-hangzhou.aliyuncs.com/cosmetic_plicense_init/024d6974-1b14-4741-8919-9d02b7e3901b.mp4</a></p>
         */
        @NameInMap("Url")
        public String url;

        public static GetVideoTaskResultResponseBodyVideos build(java.util.Map<String, ?> map) throws Exception {
            GetVideoTaskResultResponseBodyVideos self = new GetVideoTaskResultResponseBodyVideos();
            return TeaModel.build(map, self);
        }

        public GetVideoTaskResultResponseBodyVideos setObjectKey(String objectKey) {
            this.objectKey = objectKey;
            return this;
        }
        public String getObjectKey() {
            return this.objectKey;
        }

        public GetVideoTaskResultResponseBodyVideos setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
