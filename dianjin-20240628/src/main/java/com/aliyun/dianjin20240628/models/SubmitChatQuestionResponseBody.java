// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class SubmitChatQuestionResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("cost")
    public Long cost;

    @NameInMap("data")
    public SubmitChatQuestionResponseBodyData data;

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
     * <p>915AAAB9-4908-5224-9E53-9E9D7D0AA94B</p>
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

    public static SubmitChatQuestionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitChatQuestionResponseBody self = new SubmitChatQuestionResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitChatQuestionResponseBody setCost(Long cost) {
        this.cost = cost;
        return this;
    }
    public Long getCost() {
        return this.cost;
    }

    public SubmitChatQuestionResponseBody setData(SubmitChatQuestionResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SubmitChatQuestionResponseBodyData getData() {
        return this.data;
    }

    public SubmitChatQuestionResponseBody setDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }
    public String getDataType() {
        return this.dataType;
    }

    public SubmitChatQuestionResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public SubmitChatQuestionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SubmitChatQuestionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SubmitChatQuestionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public SubmitChatQuestionResponseBody setTime(String time) {
        this.time = time;
        return this;
    }
    public String getTime() {
        return this.time;
    }

    public static class SubmitChatQuestionResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1869307330227937280</p>
         */
        @NameInMap("batchId")
        public String batchId;

        public static SubmitChatQuestionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SubmitChatQuestionResponseBodyData self = new SubmitChatQuestionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SubmitChatQuestionResponseBodyData setBatchId(String batchId) {
            this.batchId = batchId;
            return this;
        }
        public String getBatchId() {
            return this.batchId;
        }

    }

}
