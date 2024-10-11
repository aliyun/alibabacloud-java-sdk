// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class CreateQualityCheckTaskResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("cost")
    public Long cost;

    @NameInMap("data")
    public CreateQualityCheckTaskResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("dataType")
    public String dataType;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("errCode")
    public String errCode;

    /**
     * <strong>example:</strong>
     * <p>ok</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>EF4B5C9B-3BC8-5171-A47B-4C5CF3DC3258</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>2024-04-24 11:54:34</p>
     */
    @NameInMap("time")
    public String time;

    public static CreateQualityCheckTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateQualityCheckTaskResponseBody self = new CreateQualityCheckTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateQualityCheckTaskResponseBody setCost(Long cost) {
        this.cost = cost;
        return this;
    }
    public Long getCost() {
        return this.cost;
    }

    public CreateQualityCheckTaskResponseBody setData(CreateQualityCheckTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateQualityCheckTaskResponseBodyData getData() {
        return this.data;
    }

    public CreateQualityCheckTaskResponseBody setDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }
    public String getDataType() {
        return this.dataType;
    }

    public CreateQualityCheckTaskResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public CreateQualityCheckTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateQualityCheckTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateQualityCheckTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CreateQualityCheckTaskResponseBody setTime(String time) {
        this.time = time;
        return this;
    }
    public String getTime() {
        return this.time;
    }

    public static class CreateQualityCheckTaskResponseBodyData extends TeaModel {
        /**
         * <p>taskId</p>
         * 
         * <strong>example:</strong>
         * <p>172373500521</p>
         */
        @NameInMap("taskId")
        public String taskId;

        public static CreateQualityCheckTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateQualityCheckTaskResponseBodyData self = new CreateQualityCheckTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateQualityCheckTaskResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
