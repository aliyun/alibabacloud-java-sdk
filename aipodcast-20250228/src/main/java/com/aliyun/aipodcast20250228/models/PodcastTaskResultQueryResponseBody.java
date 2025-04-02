// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aipodcast20250228.models;

import com.aliyun.tea.*;

public class PodcastTaskResultQueryResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>&quot;success&quot;</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public PodcastTaskResultQueryResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public String httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>&quot;success&quot;</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>C38F034D-7F36-531C-95AC-0C752F80E840</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static PodcastTaskResultQueryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PodcastTaskResultQueryResponseBody self = new PodcastTaskResultQueryResponseBody();
        return TeaModel.build(map, self);
    }

    public PodcastTaskResultQueryResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public PodcastTaskResultQueryResponseBody setData(PodcastTaskResultQueryResponseBodyData data) {
        this.data = data;
        return this;
    }
    public PodcastTaskResultQueryResponseBodyData getData() {
        return this.data;
    }

    public PodcastTaskResultQueryResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public PodcastTaskResultQueryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public PodcastTaskResultQueryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PodcastTaskResultQueryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class PodcastTaskResultQueryResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>{
         *             &quot;audio&quot;: &quot;<a href="http://note-ai-file.oss-cn-beijing.aliyuncs.com/202503241702148295/audio.mp3?OSSAccessKeyId=LTAI5tPLWJfJHNkZbfnQv245&Expires=1742810788&Signature=b5p83nh443Gr7foqdvgrI4%2FKZVM%3D">http://note-ai-file.oss-cn-beijing.aliyuncs.com/202503241702148295/audio.mp3?OSSAccessKeyId=LTAI5tPLWJfJHNkZbfnQv245&amp;Expires=1742810788&amp;Signature=b5p83nh443Gr7foqdvgrI4%2FKZVM%3D</a>&quot;,
         *             &quot;script&quot;: &quot;<a href="http://note-ai-file.oss-cn-beijing.aliyuncs.com/202503241702148295/script.txt?OSSAccessKeyId=LTAI5tPLWJfJHNkZbfnQv245&Expires=1742810622&Signature=TBBdikHzOWW3YqDw3sNMTXiMo6A%3D">http://note-ai-file.oss-cn-beijing.aliyuncs.com/202503241702148295/script.txt?OSSAccessKeyId=LTAI5tPLWJfJHNkZbfnQv245&amp;Expires=1742810622&amp;Signature=TBBdikHzOWW3YqDw3sNMTXiMo6A%3D</a>&quot;
         * }</p>
         */
        @NameInMap("resultUrl")
        public Object resultUrl;

        @NameInMap("script")
        public String script;

        /**
         * <strong>example:</strong>
         * <p>63c4e0eaab3b4c0db208ecafa990e8d1</p>
         */
        @NameInMap("taskId")
        public String taskId;

        /**
         * <strong>example:</strong>
         * <p>SUCCEEDED</p>
         */
        @NameInMap("taskStatus")
        public String taskStatus;

        public static PodcastTaskResultQueryResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            PodcastTaskResultQueryResponseBodyData self = new PodcastTaskResultQueryResponseBodyData();
            return TeaModel.build(map, self);
        }

        public PodcastTaskResultQueryResponseBodyData setResultUrl(Object resultUrl) {
            this.resultUrl = resultUrl;
            return this;
        }
        public Object getResultUrl() {
            return this.resultUrl;
        }

        public PodcastTaskResultQueryResponseBodyData setScript(String script) {
            this.script = script;
            return this;
        }
        public String getScript() {
            return this.script;
        }

        public PodcastTaskResultQueryResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public PodcastTaskResultQueryResponseBodyData setTaskStatus(String taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public String getTaskStatus() {
            return this.taskStatus;
        }

    }

}
