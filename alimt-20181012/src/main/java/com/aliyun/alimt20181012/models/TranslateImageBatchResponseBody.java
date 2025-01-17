// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alimt20181012.models;

import com.aliyun.tea.*;

public class TranslateImageBatchResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public TranslateImageBatchResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>D774D33D-F1CB-5A2C-A787-E0A2179239CE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static TranslateImageBatchResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TranslateImageBatchResponseBody self = new TranslateImageBatchResponseBody();
        return TeaModel.build(map, self);
    }

    public TranslateImageBatchResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public TranslateImageBatchResponseBody setData(TranslateImageBatchResponseBodyData data) {
        this.data = data;
        return this;
    }
    public TranslateImageBatchResponseBodyData getData() {
        return this.data;
    }

    public TranslateImageBatchResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public TranslateImageBatchResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class TranslateImageBatchResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>EEA28E6D-4828-5031-BD8C-8FF1B3216842</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        public static TranslateImageBatchResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            TranslateImageBatchResponseBodyData self = new TranslateImageBatchResponseBodyData();
            return TeaModel.build(map, self);
        }

        public TranslateImageBatchResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
