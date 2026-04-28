// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudGetObCdrResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CloudGetObCdrResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>9FF70B74-1B3C-44C1-ACDF-8DF962988F0E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CloudGetObCdrResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CloudGetObCdrResponseBody self = new CloudGetObCdrResponseBody();
        return TeaModel.build(map, self);
    }

    public CloudGetObCdrResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public CloudGetObCdrResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CloudGetObCdrResponseBody setData(CloudGetObCdrResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CloudGetObCdrResponseBodyData getData() {
        return this.data;
    }

    public CloudGetObCdrResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CloudGetObCdrResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CloudGetObCdrResponseBodyDataList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>name1</p>
         */
        @NameInMap("AgentName")
        public String agentName;

        /**
         * <p>客户接听时间，时间戳，精确到s，如1480904471</p>
         * 
         * <strong>example:</strong>
         * <p>1775024775</p>
         */
        @NameInMap("AnswerTime")
        public String answerTime;

        /**
         * <p>通话唯一标识</p>
         * 
         * <strong>example:</strong>
         * <p>uniq_1-162046xxxx.12</p>
         */
        @NameInMap("CallId")
        public String callId;

        /**
         * <p>呼叫类型 转移</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("CallType")
        public String callType;

        /**
         * <p>呼叫类型编码，如102</p>
         * 
         * <strong>example:</strong>
         * <p>102</p>
         */
        @NameInMap("CallTypeCode")
        public String callTypeCode;

        /**
         * <p>被叫号码区号</p>
         * 
         * <strong>example:</strong>
         * <p>010</p>
         */
        @NameInMap("CalleeAreaCode")
        public String calleeAreaCode;

        /**
         * <p>呼叫的号码，可能是座席也可能是普通电话</p>
         * 
         * <strong>example:</strong>
         * <p>01041003090</p>
         */
        @NameInMap("CalleeNumber")
        public String calleeNumber;

        /**
         * <p>外显号码</p>
         * 
         * <strong>example:</strong>
         * <p>02138276106</p>
         */
        @NameInMap("Clid")
        public String clid;

        /**
         * <p>座席工号，如2000</p>
         * 
         * <strong>example:</strong>
         * <p>1111</p>
         */
        @NameInMap("Cno")
        public String cno;

        /**
         * <p>客户侧真实外显号码，当使用AXB场景进行外呼时，客户侧真实外显号码为虚拟号</p>
         * 
         * <strong>example:</strong>
         * <p>02138276106</p>
         */
        @NameInMap("DisplayNumber")
        public String displayNumber;

        /**
         * <p>结束原因,接听之后的挂机原因 1000:主通道挂机 1001:非主通道挂机 1002:被强拆</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("EndReason")
        public String endReason;

        /**
         * <p>电话结束时间，时间戳，精确到s，如1480904471</p>
         * 
         * <strong>example:</strong>
         * <p>1775024775</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <strong>example:</strong>
         * <p>WH514097</p>
         */
        @NameInMap("Gno")
        public String gno;

        /**
         * <p>Id</p>
         * 
         * <strong>example:</strong>
         * <p>797880898</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>入队列时间，时间戳，精确到s，如1480904471</p>
         * 
         * <strong>example:</strong>
         * <p>1775024775</p>
         */
        @NameInMap("JoinQueueTime")
        public String joinQueueTime;

        /**
         * <p>主通话记录来电类型 主叫外呼</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("MainCallType")
        public String mainCallType;

        /**
         * <p>主外呼通话记录唯一标识</p>
         * 
         * <strong>example:</strong>
         * <p>uniq_1-162046xxxx.12</p>
         */
        @NameInMap("MainUniqueId")
        public String mainUniqueId;

        /**
         * <p>队列号</p>
         * 
         * <strong>example:</strong>
         * <p>131</p>
         */
        @NameInMap("Qno")
        public String qno;

        /**
         * <p>进入队列时间</p>
         * 
         * <strong>example:</strong>
         * <p>1775024775</p>
         */
        @NameInMap("QueueName")
        public String queueName;

        @NameInMap("RecordFile")
        public java.util.List<String> recordFile;

        /**
         * <p>响铃时间，时间戳，精确到s，如1480904471</p>
         * 
         * <strong>example:</strong>
         * <p>1775024775</p>
         */
        @NameInMap("RingingTime")
        public String ringingTime;

        /**
         * <p>SIP响应码：200 ~ 699</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("SipCause")
        public String sipCause;

        /**
         * <p>呼叫结果</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值示例值</p>
         */
        @NameInMap("SipCauseStr")
        public String sipCauseStr;

        /**
         * <p>呼叫客户时间，时间戳，精确到s，如1480904471</p>
         * 
         * <strong>example:</strong>
         * <p>1775024775</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>外呼结果，如接听</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("StatusCode")
        public String statusCode;

        /**
         * <strong>example:</strong>
         * <p>示例值</p>
         */
        @NameInMap("TaskName")
        public String taskName;

        /**
         * <p>总通话时长秒数，单位是s</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("TotalDuration")
        public String totalDuration;

        /**
         * <p>中继群组代号</p>
         * 
         * <strong>example:</strong>
         * <p>30019</p>
         */
        @NameInMap("TrunkGroupKey")
        public String trunkGroupKey;

        /**
         * <p>号码状态识别录音文件名</p>
         * 
         * <strong>example:</strong>
         * <p>name5</p>
         */
        @NameInMap("TsiFile")
        public String tsiFile;

        /**
         * <p>从通道唯一标识</p>
         * 
         * <strong>example:</strong>
         * <p>uniq_1-162046xxxx.12</p>
         */
        @NameInMap("UniqueId")
        public String uniqueId;

        /**
         * <strong>example:</strong>
         * <p>示例值</p>
         */
        @NameInMap("XNumber")
        public String XNumber;

        public static CloudGetObCdrResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            CloudGetObCdrResponseBodyDataList self = new CloudGetObCdrResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public CloudGetObCdrResponseBodyDataList setAgentName(String agentName) {
            this.agentName = agentName;
            return this;
        }
        public String getAgentName() {
            return this.agentName;
        }

        public CloudGetObCdrResponseBodyDataList setAnswerTime(String answerTime) {
            this.answerTime = answerTime;
            return this;
        }
        public String getAnswerTime() {
            return this.answerTime;
        }

        public CloudGetObCdrResponseBodyDataList setCallId(String callId) {
            this.callId = callId;
            return this;
        }
        public String getCallId() {
            return this.callId;
        }

        public CloudGetObCdrResponseBodyDataList setCallType(String callType) {
            this.callType = callType;
            return this;
        }
        public String getCallType() {
            return this.callType;
        }

        public CloudGetObCdrResponseBodyDataList setCallTypeCode(String callTypeCode) {
            this.callTypeCode = callTypeCode;
            return this;
        }
        public String getCallTypeCode() {
            return this.callTypeCode;
        }

        public CloudGetObCdrResponseBodyDataList setCalleeAreaCode(String calleeAreaCode) {
            this.calleeAreaCode = calleeAreaCode;
            return this;
        }
        public String getCalleeAreaCode() {
            return this.calleeAreaCode;
        }

        public CloudGetObCdrResponseBodyDataList setCalleeNumber(String calleeNumber) {
            this.calleeNumber = calleeNumber;
            return this;
        }
        public String getCalleeNumber() {
            return this.calleeNumber;
        }

        public CloudGetObCdrResponseBodyDataList setClid(String clid) {
            this.clid = clid;
            return this;
        }
        public String getClid() {
            return this.clid;
        }

        public CloudGetObCdrResponseBodyDataList setCno(String cno) {
            this.cno = cno;
            return this;
        }
        public String getCno() {
            return this.cno;
        }

        public CloudGetObCdrResponseBodyDataList setDisplayNumber(String displayNumber) {
            this.displayNumber = displayNumber;
            return this;
        }
        public String getDisplayNumber() {
            return this.displayNumber;
        }

        public CloudGetObCdrResponseBodyDataList setEndReason(String endReason) {
            this.endReason = endReason;
            return this;
        }
        public String getEndReason() {
            return this.endReason;
        }

        public CloudGetObCdrResponseBodyDataList setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public CloudGetObCdrResponseBodyDataList setGno(String gno) {
            this.gno = gno;
            return this;
        }
        public String getGno() {
            return this.gno;
        }

        public CloudGetObCdrResponseBodyDataList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CloudGetObCdrResponseBodyDataList setJoinQueueTime(String joinQueueTime) {
            this.joinQueueTime = joinQueueTime;
            return this;
        }
        public String getJoinQueueTime() {
            return this.joinQueueTime;
        }

        public CloudGetObCdrResponseBodyDataList setMainCallType(String mainCallType) {
            this.mainCallType = mainCallType;
            return this;
        }
        public String getMainCallType() {
            return this.mainCallType;
        }

        public CloudGetObCdrResponseBodyDataList setMainUniqueId(String mainUniqueId) {
            this.mainUniqueId = mainUniqueId;
            return this;
        }
        public String getMainUniqueId() {
            return this.mainUniqueId;
        }

        public CloudGetObCdrResponseBodyDataList setQno(String qno) {
            this.qno = qno;
            return this;
        }
        public String getQno() {
            return this.qno;
        }

        public CloudGetObCdrResponseBodyDataList setQueueName(String queueName) {
            this.queueName = queueName;
            return this;
        }
        public String getQueueName() {
            return this.queueName;
        }

        public CloudGetObCdrResponseBodyDataList setRecordFile(java.util.List<String> recordFile) {
            this.recordFile = recordFile;
            return this;
        }
        public java.util.List<String> getRecordFile() {
            return this.recordFile;
        }

        public CloudGetObCdrResponseBodyDataList setRingingTime(String ringingTime) {
            this.ringingTime = ringingTime;
            return this;
        }
        public String getRingingTime() {
            return this.ringingTime;
        }

        public CloudGetObCdrResponseBodyDataList setSipCause(String sipCause) {
            this.sipCause = sipCause;
            return this;
        }
        public String getSipCause() {
            return this.sipCause;
        }

        public CloudGetObCdrResponseBodyDataList setSipCauseStr(String sipCauseStr) {
            this.sipCauseStr = sipCauseStr;
            return this;
        }
        public String getSipCauseStr() {
            return this.sipCauseStr;
        }

        public CloudGetObCdrResponseBodyDataList setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public CloudGetObCdrResponseBodyDataList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public CloudGetObCdrResponseBodyDataList setStatusCode(String statusCode) {
            this.statusCode = statusCode;
            return this;
        }
        public String getStatusCode() {
            return this.statusCode;
        }

        public CloudGetObCdrResponseBodyDataList setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

        public CloudGetObCdrResponseBodyDataList setTotalDuration(String totalDuration) {
            this.totalDuration = totalDuration;
            return this;
        }
        public String getTotalDuration() {
            return this.totalDuration;
        }

        public CloudGetObCdrResponseBodyDataList setTrunkGroupKey(String trunkGroupKey) {
            this.trunkGroupKey = trunkGroupKey;
            return this;
        }
        public String getTrunkGroupKey() {
            return this.trunkGroupKey;
        }

        public CloudGetObCdrResponseBodyDataList setTsiFile(String tsiFile) {
            this.tsiFile = tsiFile;
            return this;
        }
        public String getTsiFile() {
            return this.tsiFile;
        }

        public CloudGetObCdrResponseBodyDataList setUniqueId(String uniqueId) {
            this.uniqueId = uniqueId;
            return this;
        }
        public String getUniqueId() {
            return this.uniqueId;
        }

        public CloudGetObCdrResponseBodyDataList setXNumber(String XNumber) {
            this.XNumber = XNumber;
            return this;
        }
        public String getXNumber() {
            return this.XNumber;
        }

    }

    public static class CloudGetObCdrResponseBodyData extends TeaModel {
        /**
         * <p>座席外呼通话记录详情</p>
         */
        @NameInMap("List")
        public java.util.List<CloudGetObCdrResponseBodyDataList> list;

        public static CloudGetObCdrResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CloudGetObCdrResponseBodyData self = new CloudGetObCdrResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CloudGetObCdrResponseBodyData setList(java.util.List<CloudGetObCdrResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<CloudGetObCdrResponseBodyDataList> getList() {
            return this.list;
        }

    }

}
