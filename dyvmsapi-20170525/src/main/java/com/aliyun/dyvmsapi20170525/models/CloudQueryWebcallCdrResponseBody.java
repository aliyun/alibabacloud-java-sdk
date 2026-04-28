// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudQueryWebcallCdrResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CloudQueryWebcallCdrResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>90E63D28-E31D-1EB2-8939-A9486641****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CloudQueryWebcallCdrResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CloudQueryWebcallCdrResponseBody self = new CloudQueryWebcallCdrResponseBody();
        return TeaModel.build(map, self);
    }

    public CloudQueryWebcallCdrResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public CloudQueryWebcallCdrResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CloudQueryWebcallCdrResponseBody setData(CloudQueryWebcallCdrResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CloudQueryWebcallCdrResponseBodyData getData() {
        return this.data;
    }

    public CloudQueryWebcallCdrResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CloudQueryWebcallCdrResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CloudQueryWebcallCdrResponseBodyDataListRecordFile extends TeaModel {
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
         * <p>取值：record,voicemail说明：record是录音， voicemail是留言</p>
         * 
         * <strong>example:</strong>
         * <p>record</p>
         */
        @NameInMap("Type")
        public String type;

        public static CloudQueryWebcallCdrResponseBodyDataListRecordFile build(java.util.Map<String, ?> map) throws Exception {
            CloudQueryWebcallCdrResponseBodyDataListRecordFile self = new CloudQueryWebcallCdrResponseBodyDataListRecordFile();
            return TeaModel.build(map, self);
        }

        public CloudQueryWebcallCdrResponseBodyDataListRecordFile setFile(String file) {
            this.file = file;
            return this;
        }
        public String getFile() {
            return this.file;
        }

        public CloudQueryWebcallCdrResponseBodyDataListRecordFile setMonitorType(Long monitorType) {
            this.monitorType = monitorType;
            return this;
        }
        public Long getMonitorType() {
            return this.monitorType;
        }

        public CloudQueryWebcallCdrResponseBodyDataListRecordFile setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CloudQueryWebcallCdrResponseBodyDataList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("AgentName")
        public String agentName;

        /**
         * <p>系统接听时间，时间戳，精确到s，如1480904471</p>
         * 
         * <strong>example:</strong>
         * <p>1774822302</p>
         */
        @NameInMap("AnswerTime")
        public String answerTime;

        /**
         * <p>服务处理时长秒数，单位是s</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("BridgeDuration")
        public String bridgeDuration;

        /**
         * <p>座席接听时间，时间戳，精确到s，如1480904471</p>
         * 
         * <strong>example:</strong>
         * <p>1774822308</p>
         */
        @NameInMap("BridgeTime")
        public String bridgeTime;

        /**
         * <p>通话唯一标识</p>
         * 
         * <strong>example:</strong>
         * <p>4e18e73a-af6a-4a77-92ea-628a6effd64b</p>
         */
        @NameInMap("CallId")
        public String callId;

        /**
         * <p>呼叫类型 webcall</p>
         * 
         * <strong>example:</strong>
         * <p>webcall</p>
         */
        @NameInMap("CallType")
        public String callType;

        /**
         * <p>第二侧外显号码</p>
         * 
         * <strong>example:</strong>
         * <p>02138276106</p>
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
         * <p>1774822302</p>
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
         * <p>2000</p>
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
         * <p>转话机后,话机响铃时间</p>
         * 
         * <strong>example:</strong>
         * <p>1774822303</p>
         */
        @NameInMap("DetailRingingTime")
        public String detailRingingTime;

        /**
         * <p>真实外显号码，当使用AXB场景进行外呼时，真实外显号码为虚拟号</p>
         * 
         * <strong>example:</strong>
         * <p>02138276106</p>
         */
        @NameInMap("DisplayNumber")
        public String displayNumber;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("DownGrade")
        public String downGrade;

        /**
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
         * <p>1774822312</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <strong>example:</strong>
         * <p>WH333</p>
         */
        @NameInMap("Gno")
        public String gno;

        /**
         * <p>Id</p>
         * 
         * <strong>example:</strong>
         * <p>14454</p>
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
         * <p>webcall</p>
         */
        @NameInMap("IvrName")
        public String ivrName;

        /**
         * <p>中继号码</p>
         * 
         * <strong>example:</strong>
         * <p>42003255</p>
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
         * <p>1775024775</p>
         */
        @NameInMap("RealAnswerTime")
        public String realAnswerTime;

        /**
         * <p>通话记录录音数组</p>
         */
        @NameInMap("RecordFile")
        public java.util.List<CloudQueryWebcallCdrResponseBodyDataListRecordFile> recordFile;

        /**
         * <p>用户自定义通话标识字段</p>
         * 
         * <strong>example:</strong>
         * <p>214b76605a43d02f4aab4e61cfa63128</p>
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
         * <p>示例值示例值</p>
         */
        @NameInMap("SipCauseStr")
        public String sipCauseStr;

        /**
         * <p>电话进入系统时间，时间戳，精确到s，如1480904471</p>
         * 
         * <strong>example:</strong>
         * <p>1774822302</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>外呼结果， 如客户接听</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>status对应的状态码</p>
         * 
         * <strong>example:</strong>
         * <p>24</p>
         */
        @NameInMap("StatusCode")
        public String statusCode;

        /**
         * <p>任务文件id</p>
         * 
         * <strong>example:</strong>
         * <p>12144</p>
         */
        @NameInMap("TaskFileId")
        public String taskFileId;

        /**
         * <p>任务id</p>
         * 
         * <strong>example:</strong>
         * <p>13354</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>总通话时长秒数，单位是s</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("TotalDuration")
        public String totalDuration;

        /**
         * <p>中继组标识</p>
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
         * <strong>example:</strong>
         * <p>6</p>
         */
        @NameInMap("WaitDuration")
        public String waitDuration;

        public static CloudQueryWebcallCdrResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            CloudQueryWebcallCdrResponseBodyDataList self = new CloudQueryWebcallCdrResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public CloudQueryWebcallCdrResponseBodyDataList setAgentName(String agentName) {
            this.agentName = agentName;
            return this;
        }
        public String getAgentName() {
            return this.agentName;
        }

        public CloudQueryWebcallCdrResponseBodyDataList setAnswerTime(String answerTime) {
            this.answerTime = answerTime;
            return this;
        }
        public String getAnswerTime() {
            return this.answerTime;
        }

        public CloudQueryWebcallCdrResponseBodyDataList setBridgeDuration(String bridgeDuration) {
            this.bridgeDuration = bridgeDuration;
            return this;
        }
        public String getBridgeDuration() {
            return this.bridgeDuration;
        }

        public CloudQueryWebcallCdrResponseBodyDataList setBridgeTime(String bridgeTime) {
            this.bridgeTime = bridgeTime;
            return this;
        }
        public String getBridgeTime() {
            return this.bridgeTime;
        }

        public CloudQueryWebcallCdrResponseBodyDataList setCallId(String callId) {
            this.callId = callId;
            return this;
        }
        public String getCallId() {
            return this.callId;
        }

        public CloudQueryWebcallCdrResponseBodyDataList setCallType(String callType) {
            this.callType = callType;
            return this;
        }
        public String getCallType() {
            return this.callType;
        }

        public CloudQueryWebcallCdrResponseBodyDataList setCalleeClid(String calleeClid) {
            this.calleeClid = calleeClid;
            return this;
        }
        public String getCalleeClid() {
            return this.calleeClid;
        }

        public CloudQueryWebcallCdrResponseBodyDataList setCalleeDisplayNumber(String calleeDisplayNumber) {
            this.calleeDisplayNumber = calleeDisplayNumber;
            return this;
        }
        public String getCalleeDisplayNumber() {
            return this.calleeDisplayNumber;
        }

        public CloudQueryWebcallCdrResponseBodyDataList setCalleeNumber(String calleeNumber) {
            this.calleeNumber = calleeNumber;
            return this;
        }
        public String getCalleeNumber() {
            return this.calleeNumber;
        }

        public CloudQueryWebcallCdrResponseBodyDataList setCalleeRingingTime(String calleeRingingTime) {
            this.calleeRingingTime = calleeRingingTime;
            return this;
        }
        public String getCalleeRingingTime() {
            return this.calleeRingingTime;
        }

        public CloudQueryWebcallCdrResponseBodyDataList setClid(String clid) {
            this.clid = clid;
            return this;
        }
        public String getClid() {
            return this.clid;
        }

        public CloudQueryWebcallCdrResponseBodyDataList setCno(String cno) {
            this.cno = cno;
            return this;
        }
        public String getCno() {
            return this.cno;
        }

        public CloudQueryWebcallCdrResponseBodyDataList setCustomerCity(String customerCity) {
            this.customerCity = customerCity;
            return this;
        }
        public String getCustomerCity() {
            return this.customerCity;
        }

        public CloudQueryWebcallCdrResponseBodyDataList setCustomerNumber(String customerNumber) {
            this.customerNumber = customerNumber;
            return this;
        }
        public String getCustomerNumber() {
            return this.customerNumber;
        }

        public CloudQueryWebcallCdrResponseBodyDataList setCustomerProvince(String customerProvince) {
            this.customerProvince = customerProvince;
            return this;
        }
        public String getCustomerProvince() {
            return this.customerProvince;
        }

        public CloudQueryWebcallCdrResponseBodyDataList setDetailRingingTime(String detailRingingTime) {
            this.detailRingingTime = detailRingingTime;
            return this;
        }
        public String getDetailRingingTime() {
            return this.detailRingingTime;
        }

        public CloudQueryWebcallCdrResponseBodyDataList setDisplayNumber(String displayNumber) {
            this.displayNumber = displayNumber;
            return this;
        }
        public String getDisplayNumber() {
            return this.displayNumber;
        }

        public CloudQueryWebcallCdrResponseBodyDataList setDownGrade(String downGrade) {
            this.downGrade = downGrade;
            return this;
        }
        public String getDownGrade() {
            return this.downGrade;
        }

        public CloudQueryWebcallCdrResponseBodyDataList setDownGradeCounts(String downGradeCounts) {
            this.downGradeCounts = downGradeCounts;
            return this;
        }
        public String getDownGradeCounts() {
            return this.downGradeCounts;
        }

        public CloudQueryWebcallCdrResponseBodyDataList setEndReason(String endReason) {
            this.endReason = endReason;
            return this;
        }
        public String getEndReason() {
            return this.endReason;
        }

        public CloudQueryWebcallCdrResponseBodyDataList setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public CloudQueryWebcallCdrResponseBodyDataList setGno(String gno) {
            this.gno = gno;
            return this;
        }
        public String getGno() {
            return this.gno;
        }

        public CloudQueryWebcallCdrResponseBodyDataList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CloudQueryWebcallCdrResponseBodyDataList setIsRealAnswer(String isRealAnswer) {
            this.isRealAnswer = isRealAnswer;
            return this;
        }
        public String getIsRealAnswer() {
            return this.isRealAnswer;
        }

        public CloudQueryWebcallCdrResponseBodyDataList setIvrName(String ivrName) {
            this.ivrName = ivrName;
            return this;
        }
        public String getIvrName() {
            return this.ivrName;
        }

        public CloudQueryWebcallCdrResponseBodyDataList setNumberTrunk(String numberTrunk) {
            this.numberTrunk = numberTrunk;
            return this;
        }
        public String getNumberTrunk() {
            return this.numberTrunk;
        }

        public CloudQueryWebcallCdrResponseBodyDataList setQno(String qno) {
            this.qno = qno;
            return this;
        }
        public String getQno() {
            return this.qno;
        }

        public CloudQueryWebcallCdrResponseBodyDataList setRealAnswerTime(String realAnswerTime) {
            this.realAnswerTime = realAnswerTime;
            return this;
        }
        public String getRealAnswerTime() {
            return this.realAnswerTime;
        }

        public CloudQueryWebcallCdrResponseBodyDataList setRecordFile(java.util.List<CloudQueryWebcallCdrResponseBodyDataListRecordFile> recordFile) {
            this.recordFile = recordFile;
            return this;
        }
        public java.util.List<CloudQueryWebcallCdrResponseBodyDataListRecordFile> getRecordFile() {
            return this.recordFile;
        }

        public CloudQueryWebcallCdrResponseBodyDataList setRequestUniqueId(String requestUniqueId) {
            this.requestUniqueId = requestUniqueId;
            return this;
        }
        public String getRequestUniqueId() {
            return this.requestUniqueId;
        }

        public CloudQueryWebcallCdrResponseBodyDataList setSipCause(String sipCause) {
            this.sipCause = sipCause;
            return this;
        }
        public String getSipCause() {
            return this.sipCause;
        }

        public CloudQueryWebcallCdrResponseBodyDataList setSipCauseStr(String sipCauseStr) {
            this.sipCauseStr = sipCauseStr;
            return this;
        }
        public String getSipCauseStr() {
            return this.sipCauseStr;
        }

        public CloudQueryWebcallCdrResponseBodyDataList setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public CloudQueryWebcallCdrResponseBodyDataList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public CloudQueryWebcallCdrResponseBodyDataList setStatusCode(String statusCode) {
            this.statusCode = statusCode;
            return this;
        }
        public String getStatusCode() {
            return this.statusCode;
        }

        public CloudQueryWebcallCdrResponseBodyDataList setTaskFileId(String taskFileId) {
            this.taskFileId = taskFileId;
            return this;
        }
        public String getTaskFileId() {
            return this.taskFileId;
        }

        public CloudQueryWebcallCdrResponseBodyDataList setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public CloudQueryWebcallCdrResponseBodyDataList setTotalDuration(String totalDuration) {
            this.totalDuration = totalDuration;
            return this;
        }
        public String getTotalDuration() {
            return this.totalDuration;
        }

        public CloudQueryWebcallCdrResponseBodyDataList setTrunkGroupKey(String trunkGroupKey) {
            this.trunkGroupKey = trunkGroupKey;
            return this;
        }
        public String getTrunkGroupKey() {
            return this.trunkGroupKey;
        }

        public CloudQueryWebcallCdrResponseBodyDataList setUniqueId(String uniqueId) {
            this.uniqueId = uniqueId;
            return this;
        }
        public String getUniqueId() {
            return this.uniqueId;
        }

        public CloudQueryWebcallCdrResponseBodyDataList setWaitDuration(String waitDuration) {
            this.waitDuration = waitDuration;
            return this;
        }
        public String getWaitDuration() {
            return this.waitDuration;
        }

    }

    public static class CloudQueryWebcallCdrResponseBodyData extends TeaModel {
        /**
         * <p>webcall通话记录数组</p>
         */
        @NameInMap("List")
        public java.util.List<CloudQueryWebcallCdrResponseBodyDataList> list;

        public static CloudQueryWebcallCdrResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CloudQueryWebcallCdrResponseBodyData self = new CloudQueryWebcallCdrResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CloudQueryWebcallCdrResponseBodyData setList(java.util.List<CloudQueryWebcallCdrResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<CloudQueryWebcallCdrResponseBodyDataList> getList() {
            return this.list;
        }

    }

}
