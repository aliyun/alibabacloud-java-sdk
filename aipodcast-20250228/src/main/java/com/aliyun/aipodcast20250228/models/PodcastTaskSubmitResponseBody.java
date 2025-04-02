// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aipodcast20250228.models;

import com.aliyun.tea.*;

public class PodcastTaskSubmitResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>&quot;success&quot;</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public PodcastTaskSubmitResponseBodyData data;

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
     * <p>9CE5B91A-6E6B-55FB-A1AF-037DF01C84B3</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static PodcastTaskSubmitResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PodcastTaskSubmitResponseBody self = new PodcastTaskSubmitResponseBody();
        return TeaModel.build(map, self);
    }

    public PodcastTaskSubmitResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public PodcastTaskSubmitResponseBody setData(PodcastTaskSubmitResponseBodyData data) {
        this.data = data;
        return this;
    }
    public PodcastTaskSubmitResponseBodyData getData() {
        return this.data;
    }

    public PodcastTaskSubmitResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public PodcastTaskSubmitResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public PodcastTaskSubmitResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PodcastTaskSubmitResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class PodcastTaskSubmitResponseBodyData extends TeaModel {
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

        public static PodcastTaskSubmitResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            PodcastTaskSubmitResponseBodyData self = new PodcastTaskSubmitResponseBodyData();
            return TeaModel.build(map, self);
        }

        public PodcastTaskSubmitResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public PodcastTaskSubmitResponseBodyData setTaskStatus(String taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public String getTaskStatus() {
            return this.taskStatus;
        }

    }

}
