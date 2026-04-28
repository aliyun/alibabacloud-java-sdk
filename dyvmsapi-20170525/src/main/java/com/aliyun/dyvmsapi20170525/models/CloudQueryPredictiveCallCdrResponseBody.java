// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudQueryPredictiveCallCdrResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CloudQueryPredictiveCallCdrResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>7BF47617-7851-48F7-A3A1-2021342A78E2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CloudQueryPredictiveCallCdrResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CloudQueryPredictiveCallCdrResponseBody self = new CloudQueryPredictiveCallCdrResponseBody();
        return TeaModel.build(map, self);
    }

    public CloudQueryPredictiveCallCdrResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public CloudQueryPredictiveCallCdrResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CloudQueryPredictiveCallCdrResponseBody setData(CloudQueryPredictiveCallCdrResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CloudQueryPredictiveCallCdrResponseBodyData getData() {
        return this.data;
    }

    public CloudQueryPredictiveCallCdrResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CloudQueryPredictiveCallCdrResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CloudQueryPredictiveCallCdrResponseBodyDataListRecordFile extends TeaModel {
        /**
         * <p>录音文件名</p>
         * 
         * <strong>example:</strong>
         * <p>name3</p>
         */
        @NameInMap("File")
        public String file;

        /**
         * <ol>
         * <li>混音 2. 分线录音（保留2个单声道WAV） 3.留言 5. 分线录音（保留1个双声道WAV）</li>
         * </ol>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Monitor_type")
        public Long monitorType;

        /**
         * <p>取值：record,voicemail 说明：record是录音， voicemail是留言</p>
         * 
         * <strong>example:</strong>
         * <p>record</p>
         */
        @NameInMap("Type")
        public String type;

        public static CloudQueryPredictiveCallCdrResponseBodyDataListRecordFile build(java.util.Map<String, ?> map) throws Exception {
            CloudQueryPredictiveCallCdrResponseBodyDataListRecordFile self = new CloudQueryPredictiveCallCdrResponseBodyDataListRecordFile();
            return TeaModel.build(map, self);
        }

        public CloudQueryPredictiveCallCdrResponseBodyDataListRecordFile setFile(String file) {
            this.file = file;
            return this;
        }
        public String getFile() {
            return this.file;
        }

        public CloudQueryPredictiveCallCdrResponseBodyDataListRecordFile setMonitorType(Long monitorType) {
            this.monitorType = monitorType;
            return this;
        }
        public Long getMonitorType() {
            return this.monitorType;
        }

        public CloudQueryPredictiveCallCdrResponseBodyDataListRecordFile setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CloudQueryPredictiveCallCdrResponseBodyDataList extends TeaModel {
        /**
         * <p>座席姓名, 如\&quot;张三1010\&quot;</p>
         * 
         * <strong>example:</strong>
         * <p>示例值</p>
         */
        @NameInMap("AgentName")
        public String agentName;

        /**
         * <p>系统接听时间，时间戳，精确到s，如1480904471</p>
         * 
         * <strong>example:</strong>
         * <p>1775024775</p>
         */
        @NameInMap("AnswerTime")
        public String answerTime;

        /**
         * <p>服务处理时长秒数，单位是s</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("BridgeDuration")
        public String bridgeDuration;

        /**
         * <p>座席接听时间，时间戳，精确到s，如1480904471</p>
         * 
         * <strong>example:</strong>
         * <p>1774822305</p>
         */
        @NameInMap("BridgeTime")
        public String bridgeTime;

        /**
         * <p>通话唯一标识</p>
         * 
         * <strong>example:</strong>
         * <p>3cdf8d08-0216-42df-bba5-0fd45c93c9b3</p>
         */
        @NameInMap("CallId")
        public String callId;

        /**
         * <p>呼叫类型 webcall</p>
         * 
         * <strong>example:</strong>
         * <p>示例值</p>
         */
        @NameInMap("CallType")
        public String callType;

        /**
         * <p>第二侧外显号码</p>
         * 
         * <strong>example:</strong>
         * <p>15553333</p>
         */
        @NameInMap("CalleeClid")
        public String calleeClid;

        /**
         * <p>第二侧真实外显号码</p>
         * 
         * <strong>example:</strong>
         * <p>02138276106</p>
         */
        @NameInMap("CalleeDisplayNumber")
        public String calleeDisplayNumber;

        /**
         * <p>座席电话 区号 +7或8位的固话号码，区号与固话号码之间无\&quot;-\&quot;；或11位长度的手机号码。0104100596</p>
         * 
         * <strong>example:</strong>
         * <p>0104100596</p>
         */
        @NameInMap("CalleeNumber")
        public String calleeNumber;

        /**
         * <p>客户响铃时间，时间戳，精确到s，如1480904471</p>
         * 
         * <strong>example:</strong>
         * <p>1775024775</p>
         */
        @NameInMap("CalleeRingingTime")
        public String calleeRingingTime;

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
         * <p>客户号码归属城市,北京</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值示例值</p>
         */
        @NameInMap("CustomerCity")
        public String customerCity;

        /**
         * <p>客户号码 国内固话或手机，区号 + 7或8位的固话号码，区号与固话号码之间无\&quot;-\&quot;；或11位长度的手机号码。如 01041005968或18701051984 或虚拟号-分机号场景格式，如 18701051984-7538</p>
         * 
         * <strong>example:</strong>
         * <p>18701051984</p>
         */
        @NameInMap("CustomerNumber")
        public String customerNumber;

        /**
         * <p>客户号码归属省份，如 北京</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值示例值</p>
         */
        @NameInMap("CustomerProvince")
        public String customerProvince;

        /**
         * <p>话机后话机响铃时间，时间戳，精确到s；无或未转接时可能为 0；如1480904471</p>
         * 
         * <strong>example:</strong>
         * <p>1775024775</p>
         */
        @NameInMap("DetailRingingTime")
        public String detailRingingTime;

        /**
         * <p>客户侧真实外显号码，当使用AXB场景进行外呼时，客户侧的真实外显号码为虚拟号</p>
         * 
         * <strong>example:</strong>
         * <p>1775024</p>
         */
        @NameInMap("DisplayNumber")
        public String displayNumber;

        /**
         * <p>是否呼叫降级, 0-否, 1-是</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("DownGrade")
        public String downGrade;

        /**
         * <p>降级次数</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("DownGradeCounts")
        public String downGradeCounts;

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
         * <p>外呼组号：座席所属外呼组编号，如2000</p>
         * 
         * <strong>example:</strong>
         * <p>2000</p>
         */
        @NameInMap("Gno")
        public String gno;

        /**
         * <p>通话记录主键标识；</p>
         * 
         * <strong>example:</strong>
         * <p>123546546</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>是否真人接听：1 - 是、0 - 否、空值</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("IsRealAnswer")
        public String isRealAnswer;

        /**
         * <p>IVR名称，默认自定义</p>
         * 
         * <strong>example:</strong>
         * <p>IvrName</p>
         */
        @NameInMap("IvrName")
        public String ivrName;

        /**
         * <p>中继号码</p>
         * 
         * <strong>example:</strong>
         * <p>15322355</p>
         */
        @NameInMap("NumberTrunk")
        public String numberTrunk;

        /**
         * <p>队列号，如1000</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("Qno")
        public String qno;

        /**
         * <p>真人接听时间，时间戳，精确到s，如1480904471</p>
         * 
         * <strong>example:</strong>
         * <p>1774904471</p>
         */
        @NameInMap("RealAnswerTime")
        public String realAnswerTime;

        /**
         * <p>通话记录录音数组，json格式</p>
         */
        @NameInMap("RecordFile")
        public java.util.List<CloudQueryPredictiveCallCdrResponseBodyDataListRecordFile> recordFile;

        /**
         * <p>用户自定义通话标识字段</p>
         * 
         * <strong>example:</strong>
         * <p>543252344</p>
         */
        @NameInMap("RequestUniqueId")
        public String requestUniqueId;

        /**
         * <p>号码状态识别编码，详见</p>
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
         * <p>电话进入系统时间，时间戳，精确到s，如1480904471</p>
         * 
         * <strong>example:</strong>
         * <p>1774822300</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>外呼结果， 如客户接听</p>
         * 
         * <strong>example:</strong>
         * <p>示例值</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>外呼结果状态码：40 客户未接听；41 客户接听；42 已呼叫；43 双方接听；详见接口文档请求参数中 status 说明</p>
         * 
         * <strong>example:</strong>
         * <p>41</p>
         */
        @NameInMap("StatusCode")
        public String statusCode;

        /**
         * <p>任务文件id</p>
         * 
         * <strong>example:</strong>
         * <p>111</p>
         */
        @NameInMap("TaskFileId")
        public String taskFileId;

        /**
         * <p>任务id</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>任务名称</p>
         * 
         * <strong>example:</strong>
         * <p>name2</p>
         */
        @NameInMap("TaskName")
        public String taskName;

        /**
         * <p>总通话时长秒数，单位是s</p>
         * 
         * <strong>example:</strong>
         * <p>55</p>
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
         * <p>电话唯一标识</p>
         * 
         * <strong>example:</strong>
         * <p>uniq_1-162046xxxx.12</p>
         */
        @NameInMap("UniqueId")
        public String uniqueId;

        /**
         * <p>通话记录自定义字段，json格式</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("UserField")
        public java.util.Map<String, ?> userField;

        /**
         * <p>通话质量百分比，0–100，in/out 方向说话占用百分比</p>
         * 
         * <strong>example:</strong>
         * <p>23</p>
         */
        @NameInMap("VadIn")
        public String vadIn;

        /**
         * <p>通话质量百分比，0–100，in/out 方向说话占用百分比</p>
         * 
         * <strong>example:</strong>
         * <p>77</p>
         */
        @NameInMap("VadOut")
        public String vadOut;

        /**
         * <p>客户等待时长秒数，单位是s</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("WaitDuration")
        public String waitDuration;

        /**
         * <p>虚拟号</p>
         * 
         * <strong>example:</strong>
         * <p>6677333</p>
         */
        @NameInMap("XNumber")
        public String XNumber;

        public static CloudQueryPredictiveCallCdrResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            CloudQueryPredictiveCallCdrResponseBodyDataList self = new CloudQueryPredictiveCallCdrResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public CloudQueryPredictiveCallCdrResponseBodyDataList setAgentName(String agentName) {
            this.agentName = agentName;
            return this;
        }
        public String getAgentName() {
            return this.agentName;
        }

        public CloudQueryPredictiveCallCdrResponseBodyDataList setAnswerTime(String answerTime) {
            this.answerTime = answerTime;
            return this;
        }
        public String getAnswerTime() {
            return this.answerTime;
        }

        public CloudQueryPredictiveCallCdrResponseBodyDataList setBridgeDuration(String bridgeDuration) {
            this.bridgeDuration = bridgeDuration;
            return this;
        }
        public String getBridgeDuration() {
            return this.bridgeDuration;
        }

        public CloudQueryPredictiveCallCdrResponseBodyDataList setBridgeTime(String bridgeTime) {
            this.bridgeTime = bridgeTime;
            return this;
        }
        public String getBridgeTime() {
            return this.bridgeTime;
        }

        public CloudQueryPredictiveCallCdrResponseBodyDataList setCallId(String callId) {
            this.callId = callId;
            return this;
        }
        public String getCallId() {
            return this.callId;
        }

        public CloudQueryPredictiveCallCdrResponseBodyDataList setCallType(String callType) {
            this.callType = callType;
            return this;
        }
        public String getCallType() {
            return this.callType;
        }

        public CloudQueryPredictiveCallCdrResponseBodyDataList setCalleeClid(String calleeClid) {
            this.calleeClid = calleeClid;
            return this;
        }
        public String getCalleeClid() {
            return this.calleeClid;
        }

        public CloudQueryPredictiveCallCdrResponseBodyDataList setCalleeDisplayNumber(String calleeDisplayNumber) {
            this.calleeDisplayNumber = calleeDisplayNumber;
            return this;
        }
        public String getCalleeDisplayNumber() {
            return this.calleeDisplayNumber;
        }

        public CloudQueryPredictiveCallCdrResponseBodyDataList setCalleeNumber(String calleeNumber) {
            this.calleeNumber = calleeNumber;
            return this;
        }
        public String getCalleeNumber() {
            return this.calleeNumber;
        }

        public CloudQueryPredictiveCallCdrResponseBodyDataList setCalleeRingingTime(String calleeRingingTime) {
            this.calleeRingingTime = calleeRingingTime;
            return this;
        }
        public String getCalleeRingingTime() {
            return this.calleeRingingTime;
        }

        public CloudQueryPredictiveCallCdrResponseBodyDataList setClid(String clid) {
            this.clid = clid;
            return this;
        }
        public String getClid() {
            return this.clid;
        }

        public CloudQueryPredictiveCallCdrResponseBodyDataList setCno(String cno) {
            this.cno = cno;
            return this;
        }
        public String getCno() {
            return this.cno;
        }

        public CloudQueryPredictiveCallCdrResponseBodyDataList setCustomerCity(String customerCity) {
            this.customerCity = customerCity;
            return this;
        }
        public String getCustomerCity() {
            return this.customerCity;
        }

        public CloudQueryPredictiveCallCdrResponseBodyDataList setCustomerNumber(String customerNumber) {
            this.customerNumber = customerNumber;
            return this;
        }
        public String getCustomerNumber() {
            return this.customerNumber;
        }

        public CloudQueryPredictiveCallCdrResponseBodyDataList setCustomerProvince(String customerProvince) {
            this.customerProvince = customerProvince;
            return this;
        }
        public String getCustomerProvince() {
            return this.customerProvince;
        }

        public CloudQueryPredictiveCallCdrResponseBodyDataList setDetailRingingTime(String detailRingingTime) {
            this.detailRingingTime = detailRingingTime;
            return this;
        }
        public String getDetailRingingTime() {
            return this.detailRingingTime;
        }

        public CloudQueryPredictiveCallCdrResponseBodyDataList setDisplayNumber(String displayNumber) {
            this.displayNumber = displayNumber;
            return this;
        }
        public String getDisplayNumber() {
            return this.displayNumber;
        }

        public CloudQueryPredictiveCallCdrResponseBodyDataList setDownGrade(String downGrade) {
            this.downGrade = downGrade;
            return this;
        }
        public String getDownGrade() {
            return this.downGrade;
        }

        public CloudQueryPredictiveCallCdrResponseBodyDataList setDownGradeCounts(String downGradeCounts) {
            this.downGradeCounts = downGradeCounts;
            return this;
        }
        public String getDownGradeCounts() {
            return this.downGradeCounts;
        }

        public CloudQueryPredictiveCallCdrResponseBodyDataList setEndReason(String endReason) {
            this.endReason = endReason;
            return this;
        }
        public String getEndReason() {
            return this.endReason;
        }

        public CloudQueryPredictiveCallCdrResponseBodyDataList setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public CloudQueryPredictiveCallCdrResponseBodyDataList setGno(String gno) {
            this.gno = gno;
            return this;
        }
        public String getGno() {
            return this.gno;
        }

        public CloudQueryPredictiveCallCdrResponseBodyDataList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CloudQueryPredictiveCallCdrResponseBodyDataList setIsRealAnswer(String isRealAnswer) {
            this.isRealAnswer = isRealAnswer;
            return this;
        }
        public String getIsRealAnswer() {
            return this.isRealAnswer;
        }

        public CloudQueryPredictiveCallCdrResponseBodyDataList setIvrName(String ivrName) {
            this.ivrName = ivrName;
            return this;
        }
        public String getIvrName() {
            return this.ivrName;
        }

        public CloudQueryPredictiveCallCdrResponseBodyDataList setNumberTrunk(String numberTrunk) {
            this.numberTrunk = numberTrunk;
            return this;
        }
        public String getNumberTrunk() {
            return this.numberTrunk;
        }

        public CloudQueryPredictiveCallCdrResponseBodyDataList setQno(String qno) {
            this.qno = qno;
            return this;
        }
        public String getQno() {
            return this.qno;
        }

        public CloudQueryPredictiveCallCdrResponseBodyDataList setRealAnswerTime(String realAnswerTime) {
            this.realAnswerTime = realAnswerTime;
            return this;
        }
        public String getRealAnswerTime() {
            return this.realAnswerTime;
        }

        public CloudQueryPredictiveCallCdrResponseBodyDataList setRecordFile(java.util.List<CloudQueryPredictiveCallCdrResponseBodyDataListRecordFile> recordFile) {
            this.recordFile = recordFile;
            return this;
        }
        public java.util.List<CloudQueryPredictiveCallCdrResponseBodyDataListRecordFile> getRecordFile() {
            return this.recordFile;
        }

        public CloudQueryPredictiveCallCdrResponseBodyDataList setRequestUniqueId(String requestUniqueId) {
            this.requestUniqueId = requestUniqueId;
            return this;
        }
        public String getRequestUniqueId() {
            return this.requestUniqueId;
        }

        public CloudQueryPredictiveCallCdrResponseBodyDataList setSipCause(String sipCause) {
            this.sipCause = sipCause;
            return this;
        }
        public String getSipCause() {
            return this.sipCause;
        }

        public CloudQueryPredictiveCallCdrResponseBodyDataList setSipCauseStr(String sipCauseStr) {
            this.sipCauseStr = sipCauseStr;
            return this;
        }
        public String getSipCauseStr() {
            return this.sipCauseStr;
        }

        public CloudQueryPredictiveCallCdrResponseBodyDataList setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public CloudQueryPredictiveCallCdrResponseBodyDataList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public CloudQueryPredictiveCallCdrResponseBodyDataList setStatusCode(String statusCode) {
            this.statusCode = statusCode;
            return this;
        }
        public String getStatusCode() {
            return this.statusCode;
        }

        public CloudQueryPredictiveCallCdrResponseBodyDataList setTaskFileId(String taskFileId) {
            this.taskFileId = taskFileId;
            return this;
        }
        public String getTaskFileId() {
            return this.taskFileId;
        }

        public CloudQueryPredictiveCallCdrResponseBodyDataList setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public CloudQueryPredictiveCallCdrResponseBodyDataList setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

        public CloudQueryPredictiveCallCdrResponseBodyDataList setTotalDuration(String totalDuration) {
            this.totalDuration = totalDuration;
            return this;
        }
        public String getTotalDuration() {
            return this.totalDuration;
        }

        public CloudQueryPredictiveCallCdrResponseBodyDataList setTrunkGroupKey(String trunkGroupKey) {
            this.trunkGroupKey = trunkGroupKey;
            return this;
        }
        public String getTrunkGroupKey() {
            return this.trunkGroupKey;
        }

        public CloudQueryPredictiveCallCdrResponseBodyDataList setUniqueId(String uniqueId) {
            this.uniqueId = uniqueId;
            return this;
        }
        public String getUniqueId() {
            return this.uniqueId;
        }

        public CloudQueryPredictiveCallCdrResponseBodyDataList setUserField(java.util.Map<String, ?> userField) {
            this.userField = userField;
            return this;
        }
        public java.util.Map<String, ?> getUserField() {
            return this.userField;
        }

        public CloudQueryPredictiveCallCdrResponseBodyDataList setVadIn(String vadIn) {
            this.vadIn = vadIn;
            return this;
        }
        public String getVadIn() {
            return this.vadIn;
        }

        public CloudQueryPredictiveCallCdrResponseBodyDataList setVadOut(String vadOut) {
            this.vadOut = vadOut;
            return this;
        }
        public String getVadOut() {
            return this.vadOut;
        }

        public CloudQueryPredictiveCallCdrResponseBodyDataList setWaitDuration(String waitDuration) {
            this.waitDuration = waitDuration;
            return this;
        }
        public String getWaitDuration() {
            return this.waitDuration;
        }

        public CloudQueryPredictiveCallCdrResponseBodyDataList setXNumber(String XNumber) {
            this.XNumber = XNumber;
            return this;
        }
        public String getXNumber() {
            return this.XNumber;
        }

    }

    public static class CloudQueryPredictiveCallCdrResponseBodyData extends TeaModel {
        /**
         * <p>预测式外呼通话记录数组</p>
         */
        @NameInMap("List")
        public java.util.List<CloudQueryPredictiveCallCdrResponseBodyDataList> list;

        public static CloudQueryPredictiveCallCdrResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CloudQueryPredictiveCallCdrResponseBodyData self = new CloudQueryPredictiveCallCdrResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CloudQueryPredictiveCallCdrResponseBodyData setList(java.util.List<CloudQueryPredictiveCallCdrResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<CloudQueryPredictiveCallCdrResponseBodyDataList> getList() {
            return this.list;
        }

    }

}
