// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20230516.models;

import com.aliyun.tea.*;

public class AgentCallListResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("Code")
    public Long code;

    /**
     * <strong>example:</strong>
     * <p>示例值</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("Model")
    public AgentCallListResponseBodyModel model;

    /**
     * <strong>example:</strong>
     * <p>示例值</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>89</p>
     */
    @NameInMap("Timestamp")
    public Long timestamp;

    public static AgentCallListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AgentCallListResponseBody self = new AgentCallListResponseBody();
        return TeaModel.build(map, self);
    }

    public AgentCallListResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public AgentCallListResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public AgentCallListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AgentCallListResponseBody setModel(AgentCallListResponseBodyModel model) {
        this.model = model;
        return this;
    }
    public AgentCallListResponseBodyModel getModel() {
        return this.model;
    }

    public AgentCallListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AgentCallListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public AgentCallListResponseBody setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public Long getTimestamp() {
        return this.timestamp;
    }

    public static class AgentCallListResponseBodyModelList extends TeaModel {
        /**
         * <p>坐席分机</p>
         * 
         * <strong>example:</strong>
         * <p>a</p>
         */
        @NameInMap("AgentExtension")
        public String agentExtension;

        /**
         * <p>分配坐席ID</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AgentId")
        public Long agentId;

        /**
         * <p>坐席通话时长，单位：秒</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AgentSpeakingDuration")
        public Long agentSpeakingDuration;

        /**
         * <p>坐席通话时长，单位：大于1分钟，显示分钟秒，小于1分钟，显示秒</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AgentSpeakingTime")
        public String agentSpeakingTime;

        /**
         * <p>坐席标签</p>
         * 
         * <strong>example:</strong>
         * <p>a</p>
         */
        @NameInMap("AgentTag")
        public String agentTag;

        /**
         * <p>接通时间 格式：2019-11-23 14:47:06</p>
         * 
         * <strong>example:</strong>
         * <p>2019-11-23 14:47:06</p>
         */
        @NameInMap("AnswerTime")
        public String answerTime;

        /**
         * <p>导入号码时返回的批次号</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("BatchId")
        public String batchId;

        /**
         * <p>开始通话时间, 格式：2019-11-23 14:47:06</p>
         * 
         * <strong>example:</strong>
         * <p>2019-11-23 14:47:06</p>
         */
        @NameInMap("CallBeginTime")
        public String callBeginTime;

        /**
         * <p>外呼ID</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CallId")
        public String callId;

        /**
         * <p>可选项：1001：坐席-人工外呼，1002：坐席-AI外呼-不转人工，1003：坐席-AI外呼-接通转人工，1004：坐席-AI外呼-智能转人工；</p>
         * 
         * <strong>example:</strong>
         * <p>1001</p>
         */
        @NameInMap("CallType")
        public Long callType;

        /**
         * <p>对话录音</p>
         * 
         * <strong>example:</strong>
         * <p>URL</p>
         */
        @NameInMap("ChatRecord")
        public String chatRecord;

        /**
         * <p>挂断时间 格式：2019-11-23 14:47:06</p>
         * 
         * <strong>example:</strong>
         * <p>2019-11-23 14:47:06</p>
         */
        @NameInMap("HangupTime")
        public String hangupTime;

        /**
         * <p>挂机方式  AI挂机1，坐席挂机2，客户挂机3</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("HangupType")
        public Long hangupType;

        /**
         * <p>导入时间,格式：2019-11-23 14:47:06</p>
         * 
         * <strong>example:</strong>
         * <p>2019-11-23 14:47:06</p>
         */
        @NameInMap("ImportTime")
        public String importTime;

        /**
         * <p>个性标签</p>
         * 
         * <strong>example:</strong>
         * <p>如投诉,非本人</p>
         */
        @NameInMap("IndividualTag")
        public String individualTag;

        /**
         * <p>意向说明 如：确认本人,未承诺还款</p>
         * 
         * <strong>example:</strong>
         * <p>如：确认本人</p>
         */
        @NameInMap("IntentDescription")
        public String intentDescription;

        /**
         * <p>意向标签, 如“C”</p>
         * 
         * <strong>example:</strong>
         * <p>C</p>
         */
        @NameInMap("IntentTag")
        public String intentTag;

        /**
         * <p>拦截原因 当状态为已拦截时，可选值：黑名单拦截，灰名单拦截，异常号码拦截</p>
         * 
         * <strong>example:</strong>
         * <p>黑名单拦截</p>
         */
        @NameInMap("InterceptReason")
        public String interceptReason;

        /**
         * <p>回复关键词</p>
         * 
         * <strong>example:</strong>
         * <p>如链接,利息</p>
         */
        @NameInMap("Keywords")
        public String keywords;

        /**
         * <p>外呼号码</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Number")
        public String number;

        /**
         * <p>外呼号码MD5</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("NumberMD5")
        public String numberMD5;

        /**
         * <p>导入号码时的参数值</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;电话号码&quot;:&quot;13100000000&quot;}</p>
         */
        @NameInMap("Properties")
        public String properties;

        /**
         * <p>人工备注信息</p>
         * 
         * <strong>example:</strong>
         * <p>abcd</p>
         */
        @NameInMap("Remark")
        public String remark;

        /**
         * <p>振铃时长 单位：毫秒</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RingTime")
        public Long ringTime;

        /**
         * <p>挂机短信 1:发送，2:不发送</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Sms")
        public String sms;

        /**
         * <p>通话时长 单位：秒</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SpeakingDuration")
        public Long speakingDuration;

        /**
         * <p>通话时长 单位：大于1分钟，显示分钟秒，小于1分钟，显示秒</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SpeakingTime")
        public String speakingTime;

        /**
         * <p>对话轮次</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SpeakingTurns")
        public String speakingTurns;

        /**
         * <p>外呼状态编码</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("StatusCode")
        public Long statusCode;

        /**
         * <p>外呼状态，如“已接听”“拒接”，转外呼状态编码与描述对应 1-已接听,2-关机</p>
         * 
         * <strong>example:</strong>
         * <p>已接听</p>
         */
        @NameInMap("StatusDescription")
        public String statusDescription;

        /**
         * <p>用户自定义标签</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Tag")
        public String tag;

        /**
         * <p>外呼任务ID</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TaskId")
        public Long taskId;

        /**
         * <p>AI话术ID</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TemplateId")
        public Long templateId;

        /**
         * <p>转人工状态 0-未触发</p>
         * 
         * <strong>example:</strong>
         * <p>未触发</p>
         */
        @NameInMap("TransferStatus")
        public String transferStatus;

        /**
         * <p>转人工状态编码</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("TransferStatusCode")
        public Long transferStatusCode;

        /**
         * <p>转接人工时间</p>
         * 
         * <strong>example:</strong>
         * <p>2019-01-09 14:14:19</p>
         */
        @NameInMap("TransferTime")
        public String transferTime;

        public static AgentCallListResponseBodyModelList build(java.util.Map<String, ?> map) throws Exception {
            AgentCallListResponseBodyModelList self = new AgentCallListResponseBodyModelList();
            return TeaModel.build(map, self);
        }

        public AgentCallListResponseBodyModelList setAgentExtension(String agentExtension) {
            this.agentExtension = agentExtension;
            return this;
        }
        public String getAgentExtension() {
            return this.agentExtension;
        }

        public AgentCallListResponseBodyModelList setAgentId(Long agentId) {
            this.agentId = agentId;
            return this;
        }
        public Long getAgentId() {
            return this.agentId;
        }

        public AgentCallListResponseBodyModelList setAgentSpeakingDuration(Long agentSpeakingDuration) {
            this.agentSpeakingDuration = agentSpeakingDuration;
            return this;
        }
        public Long getAgentSpeakingDuration() {
            return this.agentSpeakingDuration;
        }

        public AgentCallListResponseBodyModelList setAgentSpeakingTime(String agentSpeakingTime) {
            this.agentSpeakingTime = agentSpeakingTime;
            return this;
        }
        public String getAgentSpeakingTime() {
            return this.agentSpeakingTime;
        }

        public AgentCallListResponseBodyModelList setAgentTag(String agentTag) {
            this.agentTag = agentTag;
            return this;
        }
        public String getAgentTag() {
            return this.agentTag;
        }

        public AgentCallListResponseBodyModelList setAnswerTime(String answerTime) {
            this.answerTime = answerTime;
            return this;
        }
        public String getAnswerTime() {
            return this.answerTime;
        }

        public AgentCallListResponseBodyModelList setBatchId(String batchId) {
            this.batchId = batchId;
            return this;
        }
        public String getBatchId() {
            return this.batchId;
        }

        public AgentCallListResponseBodyModelList setCallBeginTime(String callBeginTime) {
            this.callBeginTime = callBeginTime;
            return this;
        }
        public String getCallBeginTime() {
            return this.callBeginTime;
        }

        public AgentCallListResponseBodyModelList setCallId(String callId) {
            this.callId = callId;
            return this;
        }
        public String getCallId() {
            return this.callId;
        }

        public AgentCallListResponseBodyModelList setCallType(Long callType) {
            this.callType = callType;
            return this;
        }
        public Long getCallType() {
            return this.callType;
        }

        public AgentCallListResponseBodyModelList setChatRecord(String chatRecord) {
            this.chatRecord = chatRecord;
            return this;
        }
        public String getChatRecord() {
            return this.chatRecord;
        }

        public AgentCallListResponseBodyModelList setHangupTime(String hangupTime) {
            this.hangupTime = hangupTime;
            return this;
        }
        public String getHangupTime() {
            return this.hangupTime;
        }

        public AgentCallListResponseBodyModelList setHangupType(Long hangupType) {
            this.hangupType = hangupType;
            return this;
        }
        public Long getHangupType() {
            return this.hangupType;
        }

        public AgentCallListResponseBodyModelList setImportTime(String importTime) {
            this.importTime = importTime;
            return this;
        }
        public String getImportTime() {
            return this.importTime;
        }

        public AgentCallListResponseBodyModelList setIndividualTag(String individualTag) {
            this.individualTag = individualTag;
            return this;
        }
        public String getIndividualTag() {
            return this.individualTag;
        }

        public AgentCallListResponseBodyModelList setIntentDescription(String intentDescription) {
            this.intentDescription = intentDescription;
            return this;
        }
        public String getIntentDescription() {
            return this.intentDescription;
        }

        public AgentCallListResponseBodyModelList setIntentTag(String intentTag) {
            this.intentTag = intentTag;
            return this;
        }
        public String getIntentTag() {
            return this.intentTag;
        }

        public AgentCallListResponseBodyModelList setInterceptReason(String interceptReason) {
            this.interceptReason = interceptReason;
            return this;
        }
        public String getInterceptReason() {
            return this.interceptReason;
        }

        public AgentCallListResponseBodyModelList setKeywords(String keywords) {
            this.keywords = keywords;
            return this;
        }
        public String getKeywords() {
            return this.keywords;
        }

        public AgentCallListResponseBodyModelList setNumber(String number) {
            this.number = number;
            return this;
        }
        public String getNumber() {
            return this.number;
        }

        public AgentCallListResponseBodyModelList setNumberMD5(String numberMD5) {
            this.numberMD5 = numberMD5;
            return this;
        }
        public String getNumberMD5() {
            return this.numberMD5;
        }

        public AgentCallListResponseBodyModelList setProperties(String properties) {
            this.properties = properties;
            return this;
        }
        public String getProperties() {
            return this.properties;
        }

        public AgentCallListResponseBodyModelList setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public AgentCallListResponseBodyModelList setRingTime(Long ringTime) {
            this.ringTime = ringTime;
            return this;
        }
        public Long getRingTime() {
            return this.ringTime;
        }

        public AgentCallListResponseBodyModelList setSms(String sms) {
            this.sms = sms;
            return this;
        }
        public String getSms() {
            return this.sms;
        }

        public AgentCallListResponseBodyModelList setSpeakingDuration(Long speakingDuration) {
            this.speakingDuration = speakingDuration;
            return this;
        }
        public Long getSpeakingDuration() {
            return this.speakingDuration;
        }

        public AgentCallListResponseBodyModelList setSpeakingTime(String speakingTime) {
            this.speakingTime = speakingTime;
            return this;
        }
        public String getSpeakingTime() {
            return this.speakingTime;
        }

        public AgentCallListResponseBodyModelList setSpeakingTurns(String speakingTurns) {
            this.speakingTurns = speakingTurns;
            return this;
        }
        public String getSpeakingTurns() {
            return this.speakingTurns;
        }

        public AgentCallListResponseBodyModelList setStatusCode(Long statusCode) {
            this.statusCode = statusCode;
            return this;
        }
        public Long getStatusCode() {
            return this.statusCode;
        }

        public AgentCallListResponseBodyModelList setStatusDescription(String statusDescription) {
            this.statusDescription = statusDescription;
            return this;
        }
        public String getStatusDescription() {
            return this.statusDescription;
        }

        public AgentCallListResponseBodyModelList setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

        public AgentCallListResponseBodyModelList setTaskId(Long taskId) {
            this.taskId = taskId;
            return this;
        }
        public Long getTaskId() {
            return this.taskId;
        }

        public AgentCallListResponseBodyModelList setTemplateId(Long templateId) {
            this.templateId = templateId;
            return this;
        }
        public Long getTemplateId() {
            return this.templateId;
        }

        public AgentCallListResponseBodyModelList setTransferStatus(String transferStatus) {
            this.transferStatus = transferStatus;
            return this;
        }
        public String getTransferStatus() {
            return this.transferStatus;
        }

        public AgentCallListResponseBodyModelList setTransferStatusCode(Long transferStatusCode) {
            this.transferStatusCode = transferStatusCode;
            return this;
        }
        public Long getTransferStatusCode() {
            return this.transferStatusCode;
        }

        public AgentCallListResponseBodyModelList setTransferTime(String transferTime) {
            this.transferTime = transferTime;
            return this;
        }
        public String getTransferTime() {
            return this.transferTime;
        }

    }

    public static class AgentCallListResponseBodyModel extends TeaModel {
        @NameInMap("List")
        public java.util.List<AgentCallListResponseBodyModelList> list;

        /**
         * <strong>example:</strong>
         * <p>44</p>
         */
        @NameInMap("PageNo")
        public Long pageNo;

        /**
         * <strong>example:</strong>
         * <p>40</p>
         */
        @NameInMap("PageSize")
        public Long pageSize;

        /**
         * <strong>example:</strong>
         * <p>27</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        /**
         * <strong>example:</strong>
         * <p>49</p>
         */
        @NameInMap("TotalPage")
        public Long totalPage;

        public static AgentCallListResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            AgentCallListResponseBodyModel self = new AgentCallListResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public AgentCallListResponseBodyModel setList(java.util.List<AgentCallListResponseBodyModelList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<AgentCallListResponseBodyModelList> getList() {
            return this.list;
        }

        public AgentCallListResponseBodyModel setPageNo(Long pageNo) {
            this.pageNo = pageNo;
            return this;
        }
        public Long getPageNo() {
            return this.pageNo;
        }

        public AgentCallListResponseBodyModel setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public AgentCallListResponseBodyModel setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public AgentCallListResponseBodyModel setTotalPage(Long totalPage) {
            this.totalPage = totalPage;
            return this;
        }
        public Long getTotalPage() {
            return this.totalPage;
        }

    }

}
