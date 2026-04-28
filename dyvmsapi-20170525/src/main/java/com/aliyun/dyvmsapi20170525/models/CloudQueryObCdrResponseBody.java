// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudQueryObCdrResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CloudQueryObCdrResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>6086693B-2250-17CE-A41F-06259AB6DB1B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CloudQueryObCdrResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CloudQueryObCdrResponseBody self = new CloudQueryObCdrResponseBody();
        return TeaModel.build(map, self);
    }

    public CloudQueryObCdrResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public CloudQueryObCdrResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CloudQueryObCdrResponseBody setData(CloudQueryObCdrResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CloudQueryObCdrResponseBodyData getData() {
        return this.data;
    }

    public CloudQueryObCdrResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CloudQueryObCdrResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CloudQueryObCdrResponseBodyDataListRecordFile extends TeaModel {
        /**
         * <p>录音文件名</p>
         * 
         * <strong>example:</strong>
         * <p>record_file_name.</p>
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

        public static CloudQueryObCdrResponseBodyDataListRecordFile build(java.util.Map<String, ?> map) throws Exception {
            CloudQueryObCdrResponseBodyDataListRecordFile self = new CloudQueryObCdrResponseBodyDataListRecordFile();
            return TeaModel.build(map, self);
        }

        public CloudQueryObCdrResponseBodyDataListRecordFile setFile(String file) {
            this.file = file;
            return this;
        }
        public String getFile() {
            return this.file;
        }

        public CloudQueryObCdrResponseBodyDataListRecordFile setMonitorType(Long monitorType) {
            this.monitorType = monitorType;
            return this;
        }
        public Long getMonitorType() {
            return this.monitorType;
        }

        public CloudQueryObCdrResponseBodyDataListRecordFile setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CloudQueryObCdrResponseBodyDataList extends TeaModel {
        /**
         * <p>座席侧外显号码</p>
         * 
         * <strong>example:</strong>
         * <p>02138276106</p>
         */
        @NameInMap("AgentClid")
        public String agentClid;

        /**
         * <p>座席名称</p>
         * 
         * <strong>example:</strong>
         * <p>name3</p>
         */
        @NameInMap("AgentName")
        public String agentName;

        /**
         * <p>座席电话 区号 +7或8位的固话号码，区号与固话号码之间无\&quot;-\&quot;；或11位长度的手机号码。0104100596</p>
         * 
         * <strong>example:</strong>
         * <p>0104100596</p>
         */
        @NameInMap("AgentNumber")
        public String agentNumber;

        /**
         * <p>座席接听时间，时间戳，精确到s，如1480904471</p>
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
         * <p>10</p>
         */
        @NameInMap("BridgeDuration")
        public String bridgeDuration;

        /**
         * <p>双方接听时间，时间戳，精确到s，如1480904471</p>
         * 
         * <strong>example:</strong>
         * <p>1775024775</p>
         */
        @NameInMap("BridgeTime")
        public String bridgeTime;

        /**
         * <p>通话唯一标识</p>
         * 
         * <strong>example:</strong>
         * <p>uniq_1-162046xxxx.12</p>
         */
        @NameInMap("CallId")
        public String callId;

        /**
         * <p>呼叫类型：4、预览外呼; 6、主叫外呼</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("CallType")
        public String callType;

        /**
         * <p>客户侧响铃时间，时间戳，精确到s，如1480904471</p>
         * 
         * <strong>example:</strong>
         * <p>1775024775</p>
         */
        @NameInMap("CalleeRingingTime")
        public String calleeRingingTime;

        /**
         * <p>客户侧外显号码，当使用虚拟号进行AXB外呼且开关打开时，实际返回的客户侧外显号码是虚拟号</p>
         * 
         * <strong>example:</strong>
         * <p>41008502</p>
         */
        @NameInMap("Clid")
        public String clid;

        /**
         * <p>座席工号，如2000</p>
         * 
         * <strong>example:</strong>
         * <p>2000</p>
         */
        @NameInMap("Cno")
        public String cno;

        /**
         * <p>客户号码区号</p>
         * 
         * <strong>example:</strong>
         * <p>028</p>
         */
        @NameInMap("CustomerAreaCode")
        public String customerAreaCode;

        /**
         * <p>客户号码归属城市,北京</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("CustomerCity")
        public String customerCity;

        /**
         * <p>客户号码 国内固话或手机，区号 + 7或8位的固话号码，区号与固话号码之间无\&quot;-\&quot;；或11位长度的手机号码。如 01041005968或18701051984 或虚拟号-分机号场景格式，如 18701051984-7538</p>
         * 
         * <strong>example:</strong>
         * <p>01041005968</p>
         */
        @NameInMap("CustomerNumber")
        public String customerNumber;

        /**
         * <p>客户号码归属省份，如 北京</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("CustomerProvince")
        public String customerProvince;

        /**
         * <p>座席侧真实外显号码，当使用AXB场景进行外呼时，座席侧真实外显号码为虚拟号</p>
         * 
         * <strong>example:</strong>
         * <p>41008502</p>
         */
        @NameInMap("DisplayNumber")
        public String displayNumber;

        /**
         * <p>是否呼叫降级, 0-否, 1-是</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DownGrade")
        public String downGrade;

        /**
         * <p>降级次数</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
         * <p>1775024875</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <strong>example:</strong>
         * <p>133</p>
         */
        @NameInMap("Gno")
        public String gno;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("HangupReason")
        public String hangupReason;

        /**
         * <p>Id</p>
         * 
         * <strong>example:</strong>
         * <p>9075217226</p>
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
         * <p>客户侧真实外显号码，当使用AXB场景进行外呼时，客户侧真实外显号码为虚拟号</p>
         * 
         * <strong>example:</strong>
         * <p>13322225555</p>
         */
        @NameInMap("LeftDisplayNumber")
        public String leftDisplayNumber;

        /**
         * <p>分机外呼，话机响铃时间</p>
         * 
         * <strong>example:</strong>
         * <p>1775024775</p>
         */
        @NameInMap("MainRingingTime")
        public String mainRingingTime;

        /**
         * <p>真人接听时间，时间戳，精确到s，如1480904471</p>
         * 
         * <strong>example:</strong>
         * <p>1775024775</p>
         */
        @NameInMap("RealAnswerTime")
        public String realAnswerTime;

        /**
         * <p>通话记录录音数组，json格式</p>
         */
        @NameInMap("RecordFile")
        public java.util.List<CloudQueryObCdrResponseBodyDataListRecordFile> recordFile;

        /**
         * <p>请求唯一id</p>
         * 
         * <strong>example:</strong>
         * <p>uniq_1-162046xxxx.12</p>
         */
        @NameInMap("RequestUniqueId")
        public String requestUniqueId;

        /**
         * <p>RTC总通话时长秒数，单位是s，在呼叫类型为主叫外呼(RTC)时有效，计算规则：endTime-startTime</p>
         * 
         * <strong>example:</strong>
         * <p>133</p>
         */
        @NameInMap("RtcTotalDuration")
        public String rtcTotalDuration;

        /**
         * <p>SIP响应码：200 ~ 699 详见 注：主叫外呼RTC座席侧没有SIP协商的概念，并未发起呼叫，因此该值默认为0</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("SipCause")
        public String sipCause;

        /**
         * <p>座席开始外呼时间，时间戳，精确到s，如1480904471</p>
         * 
         * <strong>example:</strong>
         * <p>1775024775</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>外呼结果：30 座席未接听; 31 座席接听,未呼叫客户; 32 座席接听,客户未接听; 33 双方接听; 50 主叫外呼接听; 51 主叫外呼,客户未接听; 52 主叫外呼,双方接听。</p>
         * 
         * <strong>example:</strong>
         * <p>33</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>33</p>
         */
        @NameInMap("StatusCode")
        public String statusCode;

        /**
         * <p>通话状态原因（主叫外呼）描述：1 - 企业黑名单; 2 - 风控系统拦截; 20001 - 呼叫限制；20002 - 黑名单或非白名单；20003 - 禁拨时间段； 3 - 无效的外显号码; 4 - 错误的语音导航; 5 - 企业停机; 6 - 无权限外呼; 7 - 超出呼叫次数限制; 8 - 错误号码; 9 - 其他错误；</p>
         * 
         * <strong>example:</strong>
         * <p>9</p>
         */
        @NameInMap("StatusReason")
        public String statusReason;

        /**
         * <p>座席自动外呼任务id</p>
         * 
         * <strong>example:</strong>
         * <p>333</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>总通话时长秒数，单位是s</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("TotalDuration")
        public String totalDuration;

        /**
         * <p>中继群组代号</p>
         * 
         * <strong>example:</strong>
         * <p>30020</p>
         */
        @NameInMap("TrunkGroupKey")
        public String trunkGroupKey;

        /**
         * <p>彩铃文件名称</p>
         * 
         * <strong>example:</strong>
         * <p>name2</p>
         */
        @NameInMap("TsiFile")
        public String tsiFile;

        /**
         * <p>彩铃文件类型</p>
         * 
         * <strong>example:</strong>
         * <p>mp3</p>
         */
        @NameInMap("TsiFileFormat")
        public String tsiFileFormat;

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
         * <p>通话质量百分比,数据是0-100之间，in方向说话占用的百分比</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("VadIn")
        public String vadIn;

        /**
         * <p>通话质量百分比,数据是0-100之间，out方向说话占用的百分比</p>
         * 
         * <strong>example:</strong>
         * <p>70</p>
         */
        @NameInMap("VadOut")
        public String vadOut;

        /**
         * <p>客户等待时长秒数，单位是s</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("WaitDuration")
        public String waitDuration;

        /**
         * <p>虚拟号码</p>
         * 
         * <strong>example:</strong>
         * <p>13322444</p>
         */
        @NameInMap("XNumber")
        public String XNumber;

        public static CloudQueryObCdrResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            CloudQueryObCdrResponseBodyDataList self = new CloudQueryObCdrResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public CloudQueryObCdrResponseBodyDataList setAgentClid(String agentClid) {
            this.agentClid = agentClid;
            return this;
        }
        public String getAgentClid() {
            return this.agentClid;
        }

        public CloudQueryObCdrResponseBodyDataList setAgentName(String agentName) {
            this.agentName = agentName;
            return this;
        }
        public String getAgentName() {
            return this.agentName;
        }

        public CloudQueryObCdrResponseBodyDataList setAgentNumber(String agentNumber) {
            this.agentNumber = agentNumber;
            return this;
        }
        public String getAgentNumber() {
            return this.agentNumber;
        }

        public CloudQueryObCdrResponseBodyDataList setAnswerTime(String answerTime) {
            this.answerTime = answerTime;
            return this;
        }
        public String getAnswerTime() {
            return this.answerTime;
        }

        public CloudQueryObCdrResponseBodyDataList setBridgeDuration(String bridgeDuration) {
            this.bridgeDuration = bridgeDuration;
            return this;
        }
        public String getBridgeDuration() {
            return this.bridgeDuration;
        }

        public CloudQueryObCdrResponseBodyDataList setBridgeTime(String bridgeTime) {
            this.bridgeTime = bridgeTime;
            return this;
        }
        public String getBridgeTime() {
            return this.bridgeTime;
        }

        public CloudQueryObCdrResponseBodyDataList setCallId(String callId) {
            this.callId = callId;
            return this;
        }
        public String getCallId() {
            return this.callId;
        }

        public CloudQueryObCdrResponseBodyDataList setCallType(String callType) {
            this.callType = callType;
            return this;
        }
        public String getCallType() {
            return this.callType;
        }

        public CloudQueryObCdrResponseBodyDataList setCalleeRingingTime(String calleeRingingTime) {
            this.calleeRingingTime = calleeRingingTime;
            return this;
        }
        public String getCalleeRingingTime() {
            return this.calleeRingingTime;
        }

        public CloudQueryObCdrResponseBodyDataList setClid(String clid) {
            this.clid = clid;
            return this;
        }
        public String getClid() {
            return this.clid;
        }

        public CloudQueryObCdrResponseBodyDataList setCno(String cno) {
            this.cno = cno;
            return this;
        }
        public String getCno() {
            return this.cno;
        }

        public CloudQueryObCdrResponseBodyDataList setCustomerAreaCode(String customerAreaCode) {
            this.customerAreaCode = customerAreaCode;
            return this;
        }
        public String getCustomerAreaCode() {
            return this.customerAreaCode;
        }

        public CloudQueryObCdrResponseBodyDataList setCustomerCity(String customerCity) {
            this.customerCity = customerCity;
            return this;
        }
        public String getCustomerCity() {
            return this.customerCity;
        }

        public CloudQueryObCdrResponseBodyDataList setCustomerNumber(String customerNumber) {
            this.customerNumber = customerNumber;
            return this;
        }
        public String getCustomerNumber() {
            return this.customerNumber;
        }

        public CloudQueryObCdrResponseBodyDataList setCustomerProvince(String customerProvince) {
            this.customerProvince = customerProvince;
            return this;
        }
        public String getCustomerProvince() {
            return this.customerProvince;
        }

        public CloudQueryObCdrResponseBodyDataList setDisplayNumber(String displayNumber) {
            this.displayNumber = displayNumber;
            return this;
        }
        public String getDisplayNumber() {
            return this.displayNumber;
        }

        public CloudQueryObCdrResponseBodyDataList setDownGrade(String downGrade) {
            this.downGrade = downGrade;
            return this;
        }
        public String getDownGrade() {
            return this.downGrade;
        }

        public CloudQueryObCdrResponseBodyDataList setDownGradeCounts(String downGradeCounts) {
            this.downGradeCounts = downGradeCounts;
            return this;
        }
        public String getDownGradeCounts() {
            return this.downGradeCounts;
        }

        public CloudQueryObCdrResponseBodyDataList setEndReason(String endReason) {
            this.endReason = endReason;
            return this;
        }
        public String getEndReason() {
            return this.endReason;
        }

        public CloudQueryObCdrResponseBodyDataList setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public CloudQueryObCdrResponseBodyDataList setGno(String gno) {
            this.gno = gno;
            return this;
        }
        public String getGno() {
            return this.gno;
        }

        public CloudQueryObCdrResponseBodyDataList setHangupReason(String hangupReason) {
            this.hangupReason = hangupReason;
            return this;
        }
        public String getHangupReason() {
            return this.hangupReason;
        }

        public CloudQueryObCdrResponseBodyDataList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CloudQueryObCdrResponseBodyDataList setIsRealAnswer(String isRealAnswer) {
            this.isRealAnswer = isRealAnswer;
            return this;
        }
        public String getIsRealAnswer() {
            return this.isRealAnswer;
        }

        public CloudQueryObCdrResponseBodyDataList setLeftDisplayNumber(String leftDisplayNumber) {
            this.leftDisplayNumber = leftDisplayNumber;
            return this;
        }
        public String getLeftDisplayNumber() {
            return this.leftDisplayNumber;
        }

        public CloudQueryObCdrResponseBodyDataList setMainRingingTime(String mainRingingTime) {
            this.mainRingingTime = mainRingingTime;
            return this;
        }
        public String getMainRingingTime() {
            return this.mainRingingTime;
        }

        public CloudQueryObCdrResponseBodyDataList setRealAnswerTime(String realAnswerTime) {
            this.realAnswerTime = realAnswerTime;
            return this;
        }
        public String getRealAnswerTime() {
            return this.realAnswerTime;
        }

        public CloudQueryObCdrResponseBodyDataList setRecordFile(java.util.List<CloudQueryObCdrResponseBodyDataListRecordFile> recordFile) {
            this.recordFile = recordFile;
            return this;
        }
        public java.util.List<CloudQueryObCdrResponseBodyDataListRecordFile> getRecordFile() {
            return this.recordFile;
        }

        public CloudQueryObCdrResponseBodyDataList setRequestUniqueId(String requestUniqueId) {
            this.requestUniqueId = requestUniqueId;
            return this;
        }
        public String getRequestUniqueId() {
            return this.requestUniqueId;
        }

        public CloudQueryObCdrResponseBodyDataList setRtcTotalDuration(String rtcTotalDuration) {
            this.rtcTotalDuration = rtcTotalDuration;
            return this;
        }
        public String getRtcTotalDuration() {
            return this.rtcTotalDuration;
        }

        public CloudQueryObCdrResponseBodyDataList setSipCause(String sipCause) {
            this.sipCause = sipCause;
            return this;
        }
        public String getSipCause() {
            return this.sipCause;
        }

        public CloudQueryObCdrResponseBodyDataList setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public CloudQueryObCdrResponseBodyDataList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public CloudQueryObCdrResponseBodyDataList setStatusCode(String statusCode) {
            this.statusCode = statusCode;
            return this;
        }
        public String getStatusCode() {
            return this.statusCode;
        }

        public CloudQueryObCdrResponseBodyDataList setStatusReason(String statusReason) {
            this.statusReason = statusReason;
            return this;
        }
        public String getStatusReason() {
            return this.statusReason;
        }

        public CloudQueryObCdrResponseBodyDataList setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public CloudQueryObCdrResponseBodyDataList setTotalDuration(String totalDuration) {
            this.totalDuration = totalDuration;
            return this;
        }
        public String getTotalDuration() {
            return this.totalDuration;
        }

        public CloudQueryObCdrResponseBodyDataList setTrunkGroupKey(String trunkGroupKey) {
            this.trunkGroupKey = trunkGroupKey;
            return this;
        }
        public String getTrunkGroupKey() {
            return this.trunkGroupKey;
        }

        public CloudQueryObCdrResponseBodyDataList setTsiFile(String tsiFile) {
            this.tsiFile = tsiFile;
            return this;
        }
        public String getTsiFile() {
            return this.tsiFile;
        }

        public CloudQueryObCdrResponseBodyDataList setTsiFileFormat(String tsiFileFormat) {
            this.tsiFileFormat = tsiFileFormat;
            return this;
        }
        public String getTsiFileFormat() {
            return this.tsiFileFormat;
        }

        public CloudQueryObCdrResponseBodyDataList setUniqueId(String uniqueId) {
            this.uniqueId = uniqueId;
            return this;
        }
        public String getUniqueId() {
            return this.uniqueId;
        }

        public CloudQueryObCdrResponseBodyDataList setUserField(java.util.Map<String, ?> userField) {
            this.userField = userField;
            return this;
        }
        public java.util.Map<String, ?> getUserField() {
            return this.userField;
        }

        public CloudQueryObCdrResponseBodyDataList setVadIn(String vadIn) {
            this.vadIn = vadIn;
            return this;
        }
        public String getVadIn() {
            return this.vadIn;
        }

        public CloudQueryObCdrResponseBodyDataList setVadOut(String vadOut) {
            this.vadOut = vadOut;
            return this;
        }
        public String getVadOut() {
            return this.vadOut;
        }

        public CloudQueryObCdrResponseBodyDataList setWaitDuration(String waitDuration) {
            this.waitDuration = waitDuration;
            return this;
        }
        public String getWaitDuration() {
            return this.waitDuration;
        }

        public CloudQueryObCdrResponseBodyDataList setXNumber(String XNumber) {
            this.XNumber = XNumber;
            return this;
        }
        public String getXNumber() {
            return this.XNumber;
        }

    }

    public static class CloudQueryObCdrResponseBodyData extends TeaModel {
        /**
         * <p>座席外呼通话记录数组</p>
         */
        @NameInMap("List")
        public java.util.List<CloudQueryObCdrResponseBodyDataList> list;

        public static CloudQueryObCdrResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CloudQueryObCdrResponseBodyData self = new CloudQueryObCdrResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CloudQueryObCdrResponseBodyData setList(java.util.List<CloudQueryObCdrResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<CloudQueryObCdrResponseBodyDataList> getList() {
            return this.list;
        }

    }

}
