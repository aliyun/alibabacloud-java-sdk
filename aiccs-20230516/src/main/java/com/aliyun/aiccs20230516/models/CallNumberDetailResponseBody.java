// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20230516.models;

import com.aliyun.tea.*;

public class CallNumberDetailResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Code")
    public Long code;

    /**
     * <strong>example:</strong>
     * <p>示例值示例值</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("Model")
    public CallNumberDetailResponseBodyModel model;

    /**
     * <strong>example:</strong>
     * <p>示例值示例值</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>48</p>
     */
    @NameInMap("Timestamp")
    public Long timestamp;

    public static CallNumberDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CallNumberDetailResponseBody self = new CallNumberDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public CallNumberDetailResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public CallNumberDetailResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public CallNumberDetailResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CallNumberDetailResponseBody setModel(CallNumberDetailResponseBodyModel model) {
        this.model = model;
        return this;
    }
    public CallNumberDetailResponseBodyModel getModel() {
        return this.model;
    }

    public CallNumberDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CallNumberDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CallNumberDetailResponseBody setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public Long getTimestamp() {
        return this.timestamp;
    }

    public static class CallNumberDetailResponseBodyModel extends TeaModel {
        /**
         * <p>导入号码时返回的批次号</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("BatchId")
        public String batchId;

        /**
         * <p>通话时长，单位为毫秒，实际计费需向上取整转换为秒</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Bill")
        public Long bill;

        /**
         * <p>每次呼叫的唯一标识</p>
         * 
         * <strong>example:</strong>
         * <p>a</p>
         */
        @NameInMap("CallId")
        public String callId;

        /**
         * <p>可选项 1-AI外呼，6-语音通知</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CallType")
        public Long callType;

        /**
         * <p>号码编号</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>意向标签</p>
         * 
         * <strong>example:</strong>
         * <p>a</p>
         */
        @NameInMap("IntentTag")
        public String intentTag;

        /**
         * <p>回复关键词</p>
         * 
         * <strong>example:</strong>
         * <p>a</p>
         */
        @NameInMap("Keywords")
        public String keywords;

        /**
         * <p>外呼号码</p>
         * 
         * <strong>example:</strong>
         * <p>a</p>
         */
        @NameInMap("Number")
        public String number;

        /**
         * <p>外呼号码MD5</p>
         * 
         * <strong>example:</strong>
         * <p>a</p>
         */
        @NameInMap("NumberMd5")
        public String numberMd5;

        /**
         * <p>个性标签</p>
         * 
         * <strong>example:</strong>
         * <p>a</p>
         */
        @NameInMap("PersonalityTag")
        public String personalityTag;

        /**
         * <p>外呼状态编码</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("StatusCode")
        public Long statusCode;

        /**
         * <p>用户自定义标签</p>
         * 
         * <strong>example:</strong>
         * <p>a</p>
         */
        @NameInMap("Tag")
        public String tag;

        /**
         * <p>任务ID</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TaskId")
        public Long taskId;

        /**
         * <p>外呼使用的模板ID</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TemplateId")
        public Long templateId;

        /**
         * <p>转人工状态 0-未触发,</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("TransferStatus")
        public Long transferStatus;

        public static CallNumberDetailResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            CallNumberDetailResponseBodyModel self = new CallNumberDetailResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public CallNumberDetailResponseBodyModel setBatchId(String batchId) {
            this.batchId = batchId;
            return this;
        }
        public String getBatchId() {
            return this.batchId;
        }

        public CallNumberDetailResponseBodyModel setBill(Long bill) {
            this.bill = bill;
            return this;
        }
        public Long getBill() {
            return this.bill;
        }

        public CallNumberDetailResponseBodyModel setCallId(String callId) {
            this.callId = callId;
            return this;
        }
        public String getCallId() {
            return this.callId;
        }

        public CallNumberDetailResponseBodyModel setCallType(Long callType) {
            this.callType = callType;
            return this;
        }
        public Long getCallType() {
            return this.callType;
        }

        public CallNumberDetailResponseBodyModel setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public CallNumberDetailResponseBodyModel setIntentTag(String intentTag) {
            this.intentTag = intentTag;
            return this;
        }
        public String getIntentTag() {
            return this.intentTag;
        }

        public CallNumberDetailResponseBodyModel setKeywords(String keywords) {
            this.keywords = keywords;
            return this;
        }
        public String getKeywords() {
            return this.keywords;
        }

        public CallNumberDetailResponseBodyModel setNumber(String number) {
            this.number = number;
            return this;
        }
        public String getNumber() {
            return this.number;
        }

        public CallNumberDetailResponseBodyModel setNumberMd5(String numberMd5) {
            this.numberMd5 = numberMd5;
            return this;
        }
        public String getNumberMd5() {
            return this.numberMd5;
        }

        public CallNumberDetailResponseBodyModel setPersonalityTag(String personalityTag) {
            this.personalityTag = personalityTag;
            return this;
        }
        public String getPersonalityTag() {
            return this.personalityTag;
        }

        public CallNumberDetailResponseBodyModel setStatusCode(Long statusCode) {
            this.statusCode = statusCode;
            return this;
        }
        public Long getStatusCode() {
            return this.statusCode;
        }

        public CallNumberDetailResponseBodyModel setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

        public CallNumberDetailResponseBodyModel setTaskId(Long taskId) {
            this.taskId = taskId;
            return this;
        }
        public Long getTaskId() {
            return this.taskId;
        }

        public CallNumberDetailResponseBodyModel setTemplateId(Long templateId) {
            this.templateId = templateId;
            return this;
        }
        public Long getTemplateId() {
            return this.templateId;
        }

        public CallNumberDetailResponseBodyModel setTransferStatus(Long transferStatus) {
            this.transferStatus = transferStatus;
            return this;
        }
        public Long getTransferStatus() {
            return this.transferStatus;
        }

    }

}
