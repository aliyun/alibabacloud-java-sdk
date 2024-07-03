// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220302.models;

import com.aliyun.tea.*;

public class VideoModerationResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public VideoModerationResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAA-BBBB-CCCCC-DDDD-EEEEEEEE****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static VideoModerationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        VideoModerationResponseBody self = new VideoModerationResponseBody();
        return TeaModel.build(map, self);
    }

    public VideoModerationResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public VideoModerationResponseBody setData(VideoModerationResponseBodyData data) {
        this.data = data;
        return this;
    }
    public VideoModerationResponseBodyData getData() {
        return this.data;
    }

    public VideoModerationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public VideoModerationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class VideoModerationResponseBodyData extends TeaModel {
        @NameInMap("DataId")
        public String dataId;

        /**
         * <strong>example:</strong>
         * <p>xxxxx-xxxxx</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        public static VideoModerationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            VideoModerationResponseBodyData self = new VideoModerationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public VideoModerationResponseBodyData setDataId(String dataId) {
            this.dataId = dataId;
            return this;
        }
        public String getDataId() {
            return this.dataId;
        }

        public VideoModerationResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
