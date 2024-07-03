// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220302.models;

import com.aliyun.tea.*;

public class VoiceModerationResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public VoiceModerationResponseBodyData data;

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

    public static VoiceModerationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        VoiceModerationResponseBody self = new VoiceModerationResponseBody();
        return TeaModel.build(map, self);
    }

    public VoiceModerationResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public VoiceModerationResponseBody setData(VoiceModerationResponseBodyData data) {
        this.data = data;
        return this;
    }
    public VoiceModerationResponseBodyData getData() {
        return this.data;
    }

    public VoiceModerationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public VoiceModerationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class VoiceModerationResponseBodyData extends TeaModel {
        @NameInMap("DataId")
        public String dataId;

        /**
         * <strong>example:</strong>
         * <p>xxxxx-xxxxx</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        public static VoiceModerationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            VoiceModerationResponseBodyData self = new VoiceModerationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public VoiceModerationResponseBodyData setDataId(String dataId) {
            this.dataId = dataId;
            return this;
        }
        public String getDataId() {
            return this.dataId;
        }

        public VoiceModerationResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
