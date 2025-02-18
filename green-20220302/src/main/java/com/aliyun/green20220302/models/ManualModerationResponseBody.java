// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220302.models;

import com.aliyun.tea.*;

public class ManualModerationResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public ManualModerationResponseBodyData data;

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

    public static ManualModerationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ManualModerationResponseBody self = new ManualModerationResponseBody();
        return TeaModel.build(map, self);
    }

    public ManualModerationResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ManualModerationResponseBody setData(ManualModerationResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ManualModerationResponseBodyData getData() {
        return this.data;
    }

    public ManualModerationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ManualModerationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ManualModerationResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2a5389eb-4ff8-4584-ac99-644e2a539aa1</p>
         */
        @NameInMap("DataId")
        public String dataId;

        /**
         * <strong>example:</strong>
         * <p>xxxxx-xxxxx</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        public static ManualModerationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ManualModerationResponseBodyData self = new ManualModerationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ManualModerationResponseBodyData setDataId(String dataId) {
            this.dataId = dataId;
            return this;
        }
        public String getDataId() {
            return this.dataId;
        }

        public ManualModerationResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
