// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220302.models;

import com.aliyun.tea.*;

public class FileModerationResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public FileModerationResponseBodyData data;

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

    public static FileModerationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        FileModerationResponseBody self = new FileModerationResponseBody();
        return TeaModel.build(map, self);
    }

    public FileModerationResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public FileModerationResponseBody setData(FileModerationResponseBodyData data) {
        this.data = data;
        return this;
    }
    public FileModerationResponseBodyData getData() {
        return this.data;
    }

    public FileModerationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public FileModerationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class FileModerationResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxxxx-xxxxx</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        public static FileModerationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            FileModerationResponseBodyData self = new FileModerationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public FileModerationResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
