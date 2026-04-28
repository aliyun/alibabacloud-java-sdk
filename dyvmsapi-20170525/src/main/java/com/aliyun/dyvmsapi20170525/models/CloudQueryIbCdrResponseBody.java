// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudQueryIbCdrResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CloudQueryIbCdrResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>F655A8D5-B967-440B-8683-DAD6FF8DE990</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CloudQueryIbCdrResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CloudQueryIbCdrResponseBody self = new CloudQueryIbCdrResponseBody();
        return TeaModel.build(map, self);
    }

    public CloudQueryIbCdrResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public CloudQueryIbCdrResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CloudQueryIbCdrResponseBody setData(CloudQueryIbCdrResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CloudQueryIbCdrResponseBodyData getData() {
        return this.data;
    }

    public CloudQueryIbCdrResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CloudQueryIbCdrResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CloudQueryIbCdrResponseBodyDataListRecordFile extends TeaModel {
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

        public static CloudQueryIbCdrResponseBodyDataListRecordFile build(java.util.Map<String, ?> map) throws Exception {
            CloudQueryIbCdrResponseBodyDataListRecordFile self = new CloudQueryIbCdrResponseBodyDataListRecordFile();
            return TeaModel.build(map, self);
        }

        public CloudQueryIbCdrResponseBodyDataListRecordFile setFile(String file) {
            this.file = file;
            return this;
        }
        public String getFile() {
            return this.file;
        }

        public CloudQueryIbCdrResponseBodyDataListRecordFile setMonitorType(Long monitorType) {
            this.monitorType = monitorType;
            return this;
        }
        public Long getMonitorType() {
            return this.monitorType;
        }

        public CloudQueryIbCdrResponseBodyDataListRecordFile setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CloudQueryIbCdrResponseBodyDataList extends TeaModel {
        /**
         * <p>座席名称</p>
         * 
         * <strong>example:</strong>
         * <p>name1</p>
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
         * <p>10</p>
         */
        @NameInMap("BridgeDuration")
        public String bridgeDuration;

        /**
         * <p>座席接听时间，时间戳，精确到s，如1480904471</p>
         * 
         * <strong>example:</strong>
         * <p>1775024775</p>
         */
        @NameInMap("BridgeTime")
        public String bridgeTime;

        /**
         * <p>呼叫类型 呼入</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值示例值</p>
         */
        @NameInMap("CallType")
        public String callType;

        /**
         * <p>座席电话 区号 +7或8位的固话号码，区号与固话号码之间无\&quot;-\&quot;；或11位长度的手机号码。0104100596</p>
         * 
         * <strong>example:</strong>
         * <p>0104100596</p>
         */
        @NameInMap("CalleeNumber")
        public String calleeNumber;

        /**
         * <p>座席工号，如2000</p>
         * 
         * <strong>example:</strong>
         * <p>1111</p>
         */
        @NameInMap("Cno")
        public String cno;

        /**
         * <p>客户号码区号</p>
         * 
         * <strong>example:</strong>
         * <p>010</p>
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
         * <p>客户号码 国内固话或手机，区号 + 7或8位的固话号码，区号与固话号码之间无\&quot;-\&quot;；或11位长度的手机号码。如 01041005968或18701051984</p>
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
         * <p>热线号码</p>
         * 
         * <strong>example:</strong>
         * <p>89193631</p>
         */
        @NameInMap("Hotline")
        public String hotline;

        /**
         * <p>IVR名称，默认自定义</p>
         * 
         * <strong>example:</strong>
         * <p>ivrname</p>
         */
        @NameInMap("IvrName")
        public String ivrName;

        /**
         * <p>离开队列原因 参数说明：-1:该字段没值, 1:呼转座席接听 , 2: 队列中放弃 , 3: 队列中超时溢出 , 4: 队列中无座席溢出</p>
         * 
         * <strong>example:</strong>
         * <p>-1</p>
         */
        @NameInMap("LeaveQueueCode")
        public Long leaveQueueCode;

        /**
         * <p>中继号码</p>
         * 
         * <strong>example:</strong>
         * <p>89193631</p>
         */
        @NameInMap("NumberTrunk")
        public String numberTrunk;

        /**
         * <p>中继号码区号</p>
         * 
         * <strong>example:</strong>
         * <p>010</p>
         */
        @NameInMap("NumberTrunkAreaCode")
        public String numberTrunkAreaCode;

        /**
         * <p>队列号，如1000</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("Qno")
        public String qno;

        /**
         * <p>通话记录录音数组，json格式</p>
         */
        @NameInMap("RecordFile")
        public java.util.List<CloudQueryIbCdrResponseBodyDataListRecordFile> recordFile;

        /**
         * <p>电话进入系统时间，时间戳，精确到s，如1480904471</p>
         * 
         * <strong>example:</strong>
         * <p>1775024775</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>外呼结果， 如人工接听</p>
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
         * <p>3</p>
         */
        @NameInMap("StatusCode")
        public String statusCode;

        /**
         * <p>总通话时长秒数，单位是s</p>
         * 
         * <strong>example:</strong>
         * <p>133</p>
         */
        @NameInMap("TotalDuration")
        public String totalDuration;

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

        public static CloudQueryIbCdrResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            CloudQueryIbCdrResponseBodyDataList self = new CloudQueryIbCdrResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public CloudQueryIbCdrResponseBodyDataList setAgentName(String agentName) {
            this.agentName = agentName;
            return this;
        }
        public String getAgentName() {
            return this.agentName;
        }

        public CloudQueryIbCdrResponseBodyDataList setAnswerTime(String answerTime) {
            this.answerTime = answerTime;
            return this;
        }
        public String getAnswerTime() {
            return this.answerTime;
        }

        public CloudQueryIbCdrResponseBodyDataList setBridgeDuration(String bridgeDuration) {
            this.bridgeDuration = bridgeDuration;
            return this;
        }
        public String getBridgeDuration() {
            return this.bridgeDuration;
        }

        public CloudQueryIbCdrResponseBodyDataList setBridgeTime(String bridgeTime) {
            this.bridgeTime = bridgeTime;
            return this;
        }
        public String getBridgeTime() {
            return this.bridgeTime;
        }

        public CloudQueryIbCdrResponseBodyDataList setCallType(String callType) {
            this.callType = callType;
            return this;
        }
        public String getCallType() {
            return this.callType;
        }

        public CloudQueryIbCdrResponseBodyDataList setCalleeNumber(String calleeNumber) {
            this.calleeNumber = calleeNumber;
            return this;
        }
        public String getCalleeNumber() {
            return this.calleeNumber;
        }

        public CloudQueryIbCdrResponseBodyDataList setCno(String cno) {
            this.cno = cno;
            return this;
        }
        public String getCno() {
            return this.cno;
        }

        public CloudQueryIbCdrResponseBodyDataList setCustomerAreaCode(String customerAreaCode) {
            this.customerAreaCode = customerAreaCode;
            return this;
        }
        public String getCustomerAreaCode() {
            return this.customerAreaCode;
        }

        public CloudQueryIbCdrResponseBodyDataList setCustomerCity(String customerCity) {
            this.customerCity = customerCity;
            return this;
        }
        public String getCustomerCity() {
            return this.customerCity;
        }

        public CloudQueryIbCdrResponseBodyDataList setCustomerNumber(String customerNumber) {
            this.customerNumber = customerNumber;
            return this;
        }
        public String getCustomerNumber() {
            return this.customerNumber;
        }

        public CloudQueryIbCdrResponseBodyDataList setCustomerProvince(String customerProvince) {
            this.customerProvince = customerProvince;
            return this;
        }
        public String getCustomerProvince() {
            return this.customerProvince;
        }

        public CloudQueryIbCdrResponseBodyDataList setEndReason(String endReason) {
            this.endReason = endReason;
            return this;
        }
        public String getEndReason() {
            return this.endReason;
        }

        public CloudQueryIbCdrResponseBodyDataList setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public CloudQueryIbCdrResponseBodyDataList setHotline(String hotline) {
            this.hotline = hotline;
            return this;
        }
        public String getHotline() {
            return this.hotline;
        }

        public CloudQueryIbCdrResponseBodyDataList setIvrName(String ivrName) {
            this.ivrName = ivrName;
            return this;
        }
        public String getIvrName() {
            return this.ivrName;
        }

        public CloudQueryIbCdrResponseBodyDataList setLeaveQueueCode(Long leaveQueueCode) {
            this.leaveQueueCode = leaveQueueCode;
            return this;
        }
        public Long getLeaveQueueCode() {
            return this.leaveQueueCode;
        }

        public CloudQueryIbCdrResponseBodyDataList setNumberTrunk(String numberTrunk) {
            this.numberTrunk = numberTrunk;
            return this;
        }
        public String getNumberTrunk() {
            return this.numberTrunk;
        }

        public CloudQueryIbCdrResponseBodyDataList setNumberTrunkAreaCode(String numberTrunkAreaCode) {
            this.numberTrunkAreaCode = numberTrunkAreaCode;
            return this;
        }
        public String getNumberTrunkAreaCode() {
            return this.numberTrunkAreaCode;
        }

        public CloudQueryIbCdrResponseBodyDataList setQno(String qno) {
            this.qno = qno;
            return this;
        }
        public String getQno() {
            return this.qno;
        }

        public CloudQueryIbCdrResponseBodyDataList setRecordFile(java.util.List<CloudQueryIbCdrResponseBodyDataListRecordFile> recordFile) {
            this.recordFile = recordFile;
            return this;
        }
        public java.util.List<CloudQueryIbCdrResponseBodyDataListRecordFile> getRecordFile() {
            return this.recordFile;
        }

        public CloudQueryIbCdrResponseBodyDataList setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public CloudQueryIbCdrResponseBodyDataList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public CloudQueryIbCdrResponseBodyDataList setStatusCode(String statusCode) {
            this.statusCode = statusCode;
            return this;
        }
        public String getStatusCode() {
            return this.statusCode;
        }

        public CloudQueryIbCdrResponseBodyDataList setTotalDuration(String totalDuration) {
            this.totalDuration = totalDuration;
            return this;
        }
        public String getTotalDuration() {
            return this.totalDuration;
        }

        public CloudQueryIbCdrResponseBodyDataList setUniqueId(String uniqueId) {
            this.uniqueId = uniqueId;
            return this;
        }
        public String getUniqueId() {
            return this.uniqueId;
        }

        public CloudQueryIbCdrResponseBodyDataList setUserField(java.util.Map<String, ?> userField) {
            this.userField = userField;
            return this;
        }
        public java.util.Map<String, ?> getUserField() {
            return this.userField;
        }

    }

    public static class CloudQueryIbCdrResponseBodyData extends TeaModel {
        /**
         * <p>来电通话记录数组</p>
         */
        @NameInMap("List")
        public java.util.List<CloudQueryIbCdrResponseBodyDataList> list;

        public static CloudQueryIbCdrResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CloudQueryIbCdrResponseBodyData self = new CloudQueryIbCdrResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CloudQueryIbCdrResponseBodyData setList(java.util.List<CloudQueryIbCdrResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<CloudQueryIbCdrResponseBodyDataList> getList() {
            return this.list;
        }

    }

}
