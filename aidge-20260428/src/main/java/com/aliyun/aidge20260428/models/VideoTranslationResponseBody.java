// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class VideoTranslationResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>Processing</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The asynchronous task submit status.</p>
     */
    @NameInMap("Data")
    public VideoTranslationResponseBodyData data;

    /**
     * <p>The description message.</p>
     * 
     * <strong>example:</strong>
     * <p>Translation processing</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request trace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>req_20260608_jkl012</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call is successful. Valid values: true: The call is successful. false: The call failed.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static VideoTranslationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        VideoTranslationResponseBody self = new VideoTranslationResponseBody();
        return TeaModel.build(map, self);
    }

    public VideoTranslationResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public VideoTranslationResponseBody setData(VideoTranslationResponseBodyData data) {
        this.data = data;
        return this;
    }
    public VideoTranslationResponseBodyData getData() {
        return this.data;
    }

    public VideoTranslationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public VideoTranslationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public VideoTranslationResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class VideoTranslationResponseBodyData extends TeaModel {
        /**
         * <p>The asynchronous task ID, used for subsequent queries.</p>
         * 
         * <strong>example:</strong>
         * <p>0ea3b66e88a543658520c994f08896a0</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        public static VideoTranslationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            VideoTranslationResponseBodyData self = new VideoTranslationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public VideoTranslationResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
