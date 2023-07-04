// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20230516.models;

import com.aliyun.tea.*;

public class TaskCallListResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Message")
    public String message;

    @NameInMap("Model")
    public TaskCallListResponseBodyModel model;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public String success;

    @NameInMap("Timestamp")
    public Long timestamp;

    public static TaskCallListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TaskCallListResponseBody self = new TaskCallListResponseBody();
        return TeaModel.build(map, self);
    }

    public TaskCallListResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public TaskCallListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public TaskCallListResponseBody setModel(TaskCallListResponseBodyModel model) {
        this.model = model;
        return this;
    }
    public TaskCallListResponseBodyModel getModel() {
        return this.model;
    }

    public TaskCallListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public TaskCallListResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public TaskCallListResponseBody setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public Long getTimestamp() {
        return this.timestamp;
    }

    public static class TaskCallListResponseBodyModelList extends TeaModel {
        /**
         * <p>加微</p>
         */
        @NameInMap("AddWx")
        public Long addWx;

        /**
         * <p>加微进度</p>
         */
        @NameInMap("AddWxStatus")
        public String addWxStatus;

        /**
         * <p>坐席分机</p>
         */
        @NameInMap("AgentExtension")
        public String agentExtension;

        /**
         * <p>坐席ID</p>
         */
        @NameInMap("AgentId")
        public Long agentId;

        /**
         * <p>人工通话时长</p>
         */
        @NameInMap("AgentSpeakingDuration")
        public Long agentSpeakingDuration;

        /**
         * <p>人工通话时长</p>
         */
        @NameInMap("AgentSpeakingTime")
        public String agentSpeakingTime;

        /**
         * <p>坐席标签</p>
         */
        @NameInMap("AgentTag")
        public String agentTag;

        /**
         * <p>是否接通重呼</p>
         */
        @NameInMap("AnswerRecall")
        public Long answerRecall;

        /**
         * <p>接通时间</p>
         */
        @NameInMap("AnswerTime")
        public String answerTime;

        /**
         * <p>批次ID</p>
         */
        @NameInMap("BatchId")
        public String batchId;

        /**
         * <p>开始通话时间</p>
         */
        @NameInMap("CallBeginTime")
        public String callBeginTime;

        /**
         * <p>外呼ID</p>
         */
        @NameInMap("CallId")
        public String callId;

        /**
         * <p>呼叫次数</p>
         */
        @NameInMap("CallTimes")
        public String callTimes;

        /**
         * <p>外呼类型</p>
         */
        @NameInMap("CallType")
        public Long callType;

        /**
         * <p>对话录音</p>
         */
        @NameInMap("ChatRecord")
        public String chatRecord;

        /**
         * <p>外呼网关</p>
         */
        @NameInMap("Gateway")
        public String gateway;

        /**
         * <p>挂断时间</p>
         */
        @NameInMap("HangupTime")
        public String hangupTime;

        /**
         * <p>挂机方式</p>
         */
        @NameInMap("HangupType")
        public Long hangupType;

        /**
         * <p>导入时间</p>
         */
        @NameInMap("ImportTime")
        public String importTime;

        /**
         * <p>个性标签</p>
         */
        @NameInMap("IndividualTag")
        public String individualTag;

        /**
         * <p>意向说明</p>
         */
        @NameInMap("IntentDescription")
        public String intentDescription;

        /**
         * <p>意向标签</p>
         */
        @NameInMap("IntentTag")
        public String intentTag;

        /**
         * <p>拦截原因</p>
         */
        @NameInMap("InterceptReason")
        public String interceptReason;

        /**
         * <p>回复关键词</p>
         */
        @NameInMap("Keywords")
        public String keywords;

        /**
         * <p>外呼号码</p>
         */
        @NameInMap("Number")
        public String number;

        /**
         * <p>外呼号码MD5</p>
         */
        @NameInMap("NumberMD5")
        public String numberMD5;

        /**
         * <p>参数</p>
         */
        @NameInMap("Properties")
        public String properties;

        /**
         * <p>备注</p>
         */
        @NameInMap("Remark")
        public String remark;

        /**
         * <p>振铃时长</p>
         */
        @NameInMap("RingTime")
        public Long ringTime;

        /**
         * <p>挂机短信</p>
         */
        @NameInMap("Sms")
        public String sms;

        /**
         * <p>AI通话时长</p>
         */
        @NameInMap("SpeakingDuration")
        public Long speakingDuration;

        /**
         * <p>AI通话时长</p>
         */
        @NameInMap("SpeakingTime")
        public String speakingTime;

        /**
         * <p>对话轮次</p>
         */
        @NameInMap("SpeakingTurns")
        public String speakingTurns;

        /**
         * <p>外呼状态</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>外呼状态编码</p>
         */
        @NameInMap("StatusCode")
        public Long statusCode;

        /**
         * <p>外呼状态描述</p>
         */
        @NameInMap("StatusDescription")
        public String statusDescription;

        /**
         * <p>用户自定义标签</p>
         */
        @NameInMap("Tag")
        public String tag;

        /**
         * <p>外呼任务ID</p>
         */
        @NameInMap("TaskId")
        public Long taskId;

        /**
         * <p>AI话术ID</p>
         */
        @NameInMap("TemplateId")
        public Long templateId;

        /**
         * <p>转人工状态</p>
         */
        @NameInMap("TransferStatus")
        public String transferStatus;

        /**
         * <p>转人工状态编码</p>
         */
        @NameInMap("TransferStatusCode")
        public Long transferStatusCode;

        public static TaskCallListResponseBodyModelList build(java.util.Map<String, ?> map) throws Exception {
            TaskCallListResponseBodyModelList self = new TaskCallListResponseBodyModelList();
            return TeaModel.build(map, self);
        }

        public TaskCallListResponseBodyModelList setAddWx(Long addWx) {
            this.addWx = addWx;
            return this;
        }
        public Long getAddWx() {
            return this.addWx;
        }

        public TaskCallListResponseBodyModelList setAddWxStatus(String addWxStatus) {
            this.addWxStatus = addWxStatus;
            return this;
        }
        public String getAddWxStatus() {
            return this.addWxStatus;
        }

        public TaskCallListResponseBodyModelList setAgentExtension(String agentExtension) {
            this.agentExtension = agentExtension;
            return this;
        }
        public String getAgentExtension() {
            return this.agentExtension;
        }

        public TaskCallListResponseBodyModelList setAgentId(Long agentId) {
            this.agentId = agentId;
            return this;
        }
        public Long getAgentId() {
            return this.agentId;
        }

        public TaskCallListResponseBodyModelList setAgentSpeakingDuration(Long agentSpeakingDuration) {
            this.agentSpeakingDuration = agentSpeakingDuration;
            return this;
        }
        public Long getAgentSpeakingDuration() {
            return this.agentSpeakingDuration;
        }

        public TaskCallListResponseBodyModelList setAgentSpeakingTime(String agentSpeakingTime) {
            this.agentSpeakingTime = agentSpeakingTime;
            return this;
        }
        public String getAgentSpeakingTime() {
            return this.agentSpeakingTime;
        }

        public TaskCallListResponseBodyModelList setAgentTag(String agentTag) {
            this.agentTag = agentTag;
            return this;
        }
        public String getAgentTag() {
            return this.agentTag;
        }

        public TaskCallListResponseBodyModelList setAnswerRecall(Long answerRecall) {
            this.answerRecall = answerRecall;
            return this;
        }
        public Long getAnswerRecall() {
            return this.answerRecall;
        }

        public TaskCallListResponseBodyModelList setAnswerTime(String answerTime) {
            this.answerTime = answerTime;
            return this;
        }
        public String getAnswerTime() {
            return this.answerTime;
        }

        public TaskCallListResponseBodyModelList setBatchId(String batchId) {
            this.batchId = batchId;
            return this;
        }
        public String getBatchId() {
            return this.batchId;
        }

        public TaskCallListResponseBodyModelList setCallBeginTime(String callBeginTime) {
            this.callBeginTime = callBeginTime;
            return this;
        }
        public String getCallBeginTime() {
            return this.callBeginTime;
        }

        public TaskCallListResponseBodyModelList setCallId(String callId) {
            this.callId = callId;
            return this;
        }
        public String getCallId() {
            return this.callId;
        }

        public TaskCallListResponseBodyModelList setCallTimes(String callTimes) {
            this.callTimes = callTimes;
            return this;
        }
        public String getCallTimes() {
            return this.callTimes;
        }

        public TaskCallListResponseBodyModelList setCallType(Long callType) {
            this.callType = callType;
            return this;
        }
        public Long getCallType() {
            return this.callType;
        }

        public TaskCallListResponseBodyModelList setChatRecord(String chatRecord) {
            this.chatRecord = chatRecord;
            return this;
        }
        public String getChatRecord() {
            return this.chatRecord;
        }

        public TaskCallListResponseBodyModelList setGateway(String gateway) {
            this.gateway = gateway;
            return this;
        }
        public String getGateway() {
            return this.gateway;
        }

        public TaskCallListResponseBodyModelList setHangupTime(String hangupTime) {
            this.hangupTime = hangupTime;
            return this;
        }
        public String getHangupTime() {
            return this.hangupTime;
        }

        public TaskCallListResponseBodyModelList setHangupType(Long hangupType) {
            this.hangupType = hangupType;
            return this;
        }
        public Long getHangupType() {
            return this.hangupType;
        }

        public TaskCallListResponseBodyModelList setImportTime(String importTime) {
            this.importTime = importTime;
            return this;
        }
        public String getImportTime() {
            return this.importTime;
        }

        public TaskCallListResponseBodyModelList setIndividualTag(String individualTag) {
            this.individualTag = individualTag;
            return this;
        }
        public String getIndividualTag() {
            return this.individualTag;
        }

        public TaskCallListResponseBodyModelList setIntentDescription(String intentDescription) {
            this.intentDescription = intentDescription;
            return this;
        }
        public String getIntentDescription() {
            return this.intentDescription;
        }

        public TaskCallListResponseBodyModelList setIntentTag(String intentTag) {
            this.intentTag = intentTag;
            return this;
        }
        public String getIntentTag() {
            return this.intentTag;
        }

        public TaskCallListResponseBodyModelList setInterceptReason(String interceptReason) {
            this.interceptReason = interceptReason;
            return this;
        }
        public String getInterceptReason() {
            return this.interceptReason;
        }

        public TaskCallListResponseBodyModelList setKeywords(String keywords) {
            this.keywords = keywords;
            return this;
        }
        public String getKeywords() {
            return this.keywords;
        }

        public TaskCallListResponseBodyModelList setNumber(String number) {
            this.number = number;
            return this;
        }
        public String getNumber() {
            return this.number;
        }

        public TaskCallListResponseBodyModelList setNumberMD5(String numberMD5) {
            this.numberMD5 = numberMD5;
            return this;
        }
        public String getNumberMD5() {
            return this.numberMD5;
        }

        public TaskCallListResponseBodyModelList setProperties(String properties) {
            this.properties = properties;
            return this;
        }
        public String getProperties() {
            return this.properties;
        }

        public TaskCallListResponseBodyModelList setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public TaskCallListResponseBodyModelList setRingTime(Long ringTime) {
            this.ringTime = ringTime;
            return this;
        }
        public Long getRingTime() {
            return this.ringTime;
        }

        public TaskCallListResponseBodyModelList setSms(String sms) {
            this.sms = sms;
            return this;
        }
        public String getSms() {
            return this.sms;
        }

        public TaskCallListResponseBodyModelList setSpeakingDuration(Long speakingDuration) {
            this.speakingDuration = speakingDuration;
            return this;
        }
        public Long getSpeakingDuration() {
            return this.speakingDuration;
        }

        public TaskCallListResponseBodyModelList setSpeakingTime(String speakingTime) {
            this.speakingTime = speakingTime;
            return this;
        }
        public String getSpeakingTime() {
            return this.speakingTime;
        }

        public TaskCallListResponseBodyModelList setSpeakingTurns(String speakingTurns) {
            this.speakingTurns = speakingTurns;
            return this;
        }
        public String getSpeakingTurns() {
            return this.speakingTurns;
        }

        public TaskCallListResponseBodyModelList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public TaskCallListResponseBodyModelList setStatusCode(Long statusCode) {
            this.statusCode = statusCode;
            return this;
        }
        public Long getStatusCode() {
            return this.statusCode;
        }

        public TaskCallListResponseBodyModelList setStatusDescription(String statusDescription) {
            this.statusDescription = statusDescription;
            return this;
        }
        public String getStatusDescription() {
            return this.statusDescription;
        }

        public TaskCallListResponseBodyModelList setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

        public TaskCallListResponseBodyModelList setTaskId(Long taskId) {
            this.taskId = taskId;
            return this;
        }
        public Long getTaskId() {
            return this.taskId;
        }

        public TaskCallListResponseBodyModelList setTemplateId(Long templateId) {
            this.templateId = templateId;
            return this;
        }
        public Long getTemplateId() {
            return this.templateId;
        }

        public TaskCallListResponseBodyModelList setTransferStatus(String transferStatus) {
            this.transferStatus = transferStatus;
            return this;
        }
        public String getTransferStatus() {
            return this.transferStatus;
        }

        public TaskCallListResponseBodyModelList setTransferStatusCode(Long transferStatusCode) {
            this.transferStatusCode = transferStatusCode;
            return this;
        }
        public Long getTransferStatusCode() {
            return this.transferStatusCode;
        }

    }

    public static class TaskCallListResponseBodyModel extends TeaModel {
        @NameInMap("List")
        public java.util.List<TaskCallListResponseBodyModelList> list;

        @NameInMap("PageNo")
        public Long pageNo;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("TotalCount")
        public Long totalCount;

        @NameInMap("TotalPage")
        public Long totalPage;

        public static TaskCallListResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            TaskCallListResponseBodyModel self = new TaskCallListResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public TaskCallListResponseBodyModel setList(java.util.List<TaskCallListResponseBodyModelList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<TaskCallListResponseBodyModelList> getList() {
            return this.list;
        }

        public TaskCallListResponseBodyModel setPageNo(Long pageNo) {
            this.pageNo = pageNo;
            return this;
        }
        public Long getPageNo() {
            return this.pageNo;
        }

        public TaskCallListResponseBodyModel setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public TaskCallListResponseBodyModel setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public TaskCallListResponseBodyModel setTotalPage(Long totalPage) {
            this.totalPage = totalPage;
            return this;
        }
        public Long getTotalPage() {
            return this.totalPage;
        }

    }

}
