// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220302.models;

import com.aliyun.tea.*;

public class MultiModalGuardAsyncResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public MultiModalGuardAsyncResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
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

    public static MultiModalGuardAsyncResponseBody build(java.util.Map<String, ?> map) throws Exception {
        MultiModalGuardAsyncResponseBody self = new MultiModalGuardAsyncResponseBody();
        return TeaModel.build(map, self);
    }

    public MultiModalGuardAsyncResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public MultiModalGuardAsyncResponseBody setData(MultiModalGuardAsyncResponseBodyData data) {
        this.data = data;
        return this;
    }
    public MultiModalGuardAsyncResponseBodyData getData() {
        return this.data;
    }

    public MultiModalGuardAsyncResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public MultiModalGuardAsyncResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class MultiModalGuardAsyncResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>dataIdxxx</p>
         */
        @NameInMap("DataId")
        public String dataId;

        /**
         * <strong>example:</strong>
         * <p>au_f_xxxxx</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        public static MultiModalGuardAsyncResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            MultiModalGuardAsyncResponseBodyData self = new MultiModalGuardAsyncResponseBodyData();
            return TeaModel.build(map, self);
        }

        public MultiModalGuardAsyncResponseBodyData setDataId(String dataId) {
            this.dataId = dataId;
            return this;
        }
        public String getDataId() {
            return this.dataId;
        }

        public MultiModalGuardAsyncResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
