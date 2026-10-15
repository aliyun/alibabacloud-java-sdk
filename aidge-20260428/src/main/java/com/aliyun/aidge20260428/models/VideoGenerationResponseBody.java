// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class VideoGenerationResponseBody extends TeaModel {
    /**
     * <p>The response code. A value of success indicates that the call is successful, and a value of failed indicates that the call fails.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The struct information of the returned result.</p>
     */
    @NameInMap("Data")
    public VideoGenerationResponseBodyData data;

    /**
     * <p>The returned message. An error message is returned when the call fails.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID, which is used to identify a unique request call.</p>
     * 
     * <strong>example:</strong>
     * <p>70CBEFDF-BB17-1EB3-8A21-569F3124738F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call is successful. A value of true indicates success, and a value of false indicates failure.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static VideoGenerationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        VideoGenerationResponseBody self = new VideoGenerationResponseBody();
        return TeaModel.build(map, self);
    }

    public VideoGenerationResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public VideoGenerationResponseBody setData(VideoGenerationResponseBodyData data) {
        this.data = data;
        return this;
    }
    public VideoGenerationResponseBodyData getData() {
        return this.data;
    }

    public VideoGenerationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public VideoGenerationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public VideoGenerationResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class VideoGenerationResponseBodyData extends TeaModel {
        /**
         * <p>The downstream task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>778fa8bd21804828a5d147050e30edac</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>The metering and usage information.</p>
         */
        @NameInMap("UsageMap")
        public java.util.Map<String, Long> usageMap;

        public static VideoGenerationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            VideoGenerationResponseBodyData self = new VideoGenerationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public VideoGenerationResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public VideoGenerationResponseBodyData setUsageMap(java.util.Map<String, Long> usageMap) {
            this.usageMap = usageMap;
            return this;
        }
        public java.util.Map<String, Long> getUsageMap() {
            return this.usageMap;
        }

    }

}
