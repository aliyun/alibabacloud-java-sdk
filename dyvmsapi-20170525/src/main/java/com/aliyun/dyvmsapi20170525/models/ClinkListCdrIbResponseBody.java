// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class ClinkListCdrIbResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ClinkListCdrIbResponseBodyData data;

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

    public static ClinkListCdrIbResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ClinkListCdrIbResponseBody self = new ClinkListCdrIbResponseBody();
        return TeaModel.build(map, self);
    }

    public ClinkListCdrIbResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public ClinkListCdrIbResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ClinkListCdrIbResponseBody setData(ClinkListCdrIbResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ClinkListCdrIbResponseBodyData getData() {
        return this.data;
    }

    public ClinkListCdrIbResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ClinkListCdrIbResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ClinkListCdrIbResponseBodyDataCdrIb extends TeaModel {
        /**
         * <p>首次及时应答</p>
         * 
         * <strong>example:</strong>
         * <p>1775024775</p>
         */
        @NameInMap("AgentAnswerInTime")
        public String agentAnswerInTime;

        /**
         * <p>接听设备</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("BindType")
        public Long bindType;

        /**
         * <p>通话时长</p>
         * 
         * <strong>example:</strong>
         * <p>32</p>
         */
        @NameInMap("BridgeDuration")
        public Long bridgeDuration;

        /**
         * <p>首次接听时间</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        @NameInMap("BridgeTime")
        public Long bridgeTime;

        /**
         * <p>业务记录ID</p>
         */
        @NameInMap("BusinessIds")
        public java.util.List<String> businessIds;

        /**
         * <p>CallID</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("CallId")
        public String callId;

        /**
         * <p>客户号码城市</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("CustomerCity")
        public String customerCity;

        /**
         * <p>客户号码</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("CustomerNumber")
        public String customerNumber;

        /**
         * <p>客户号码加密串</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("CustomerNumberEncrypt")
        public String customerNumberEncrypt;

        /**
         * <p>客户号码省份</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("CustomerProvince")
        public String customerProvince;

        /**
         * <p>结束时间</p>
         * 
         * <strong>example:</strong>
         * <p>1775024775</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>是否邀评</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("Evaluation")
        public String evaluation;

        /**
         * <p>首呼座席姓名</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("FirstCallCname")
        public String firstCallCname;

        /**
         * <p>首呼座席工号</p>
         * 
         * <strong>example:</strong>
         * <p>1212</p>
         */
        @NameInMap("FirstCallCno")
        public String firstCallCno;

        /**
         * <p>首呼座席电话</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("FirstCallNumber")
        public String firstCallNumber;

        /**
         * <p>首呼队列名称</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("FirstCallQname")
        public String firstCallQname;

        /**
         * <p>首呼队列号</p>
         * 
         * <strong>example:</strong>
         * <p>1111</p>
         */
        @NameInMap("FirstCallQno")
        public String firstCallQno;

        /**
         * <p>首次进入队列时间</p>
         * 
         * <strong>example:</strong>
         * <p>1713848594</p>
         */
        @NameInMap("FirstJoinQueueTime")
        public Long firstJoinQueueTime;

        /**
         * <p>首次离开队列时间</p>
         * 
         * <strong>example:</strong>
         * <p>19</p>
         */
        @NameInMap("FirstLeaveQueueTime")
        public Long firstLeaveQueueTime;

        /**
         * <p>首呼队列排队时长</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("FirstQueueDuration")
        public Long firstQueueDuration;

        /**
         * <p>热线号码</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值示例值</p>
         */
        @NameInMap("Hotline")
        public String hotline;

        /**
         * <p>热线别名</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("HotlineName")
        public String hotlineName;

        /**
         * <p>满意度评价</p>
         * 
         * <strong>example:</strong>
         * <p>59</p>
         */
        @NameInMap("InvestigationKeys")
        public Long investigationKeys;

        /**
         * <p>IVR名称</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值示例值</p>
         */
        @NameInMap("IvrName")
        public String ivrName;

        /**
         * <p>通话ID</p>
         * 
         * <strong>example:</strong>
         * <p>medias_1-162046xxxx.12</p>
         */
        @NameInMap("MainUniqueId")
        public String mainUniqueId;

        /**
         * <p>备注</p>
         * 
         * <strong>example:</strong>
         * <p>示例值</p>
         */
        @NameInMap("MarkData")
        public String markData;

        /**
         * <p>挂断方</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("OnHookSource")
        public String onHookSource;

        /**
         * <p>录音文件</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("RecordFile")
        public String recordFile;

        /**
         * <p>rtcUid</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("RtcUid")
        public String rtcUid;

        /**
         * <p>语音播报时长</p>
         * 
         * <strong>example:</strong>
         * <p>43</p>
         */
        @NameInMap("SayVoiceDuration")
        public Long sayVoiceDuration;

        /**
         * <p>开始时间</p>
         * 
         * <strong>example:</strong>
         * <p>1713848570</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        /**
         * <p>接听状态</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>呼叫结果</p>
         * 
         * <strong>example:</strong>
         * <p>示例值</p>
         */
        @NameInMap("StatusResult")
        public String statusResult;

        /**
         * <p>机器人接听状态</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("StatusRobot")
        public String statusRobot;

        /**
         * <p>通话标签</p>
         */
        @NameInMap("TagNames")
        public java.util.List<String> tagNames;

        /**
         * <p>工单ID</p>
         */
        @NameInMap("TicketIds")
        public java.util.List<String> ticketIds;

        /**
         * <p>总时长</p>
         * 
         * <strong>example:</strong>
         * <p>73</p>
         */
        @NameInMap("TotalDuration")
        public Long totalDuration;

        /**
         * <p>自定义字段</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("UserField")
        public String userField;

        /**
         * <p>WebRTCCallID</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("WebrtcCallId")
        public String webrtcCallId;

        /**
         * <p>虚拟号码</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("Xnumber")
        public String xnumber;

        public static ClinkListCdrIbResponseBodyDataCdrIb build(java.util.Map<String, ?> map) throws Exception {
            ClinkListCdrIbResponseBodyDataCdrIb self = new ClinkListCdrIbResponseBodyDataCdrIb();
            return TeaModel.build(map, self);
        }

        public ClinkListCdrIbResponseBodyDataCdrIb setAgentAnswerInTime(String agentAnswerInTime) {
            this.agentAnswerInTime = agentAnswerInTime;
            return this;
        }
        public String getAgentAnswerInTime() {
            return this.agentAnswerInTime;
        }

        public ClinkListCdrIbResponseBodyDataCdrIb setBindType(Long bindType) {
            this.bindType = bindType;
            return this;
        }
        public Long getBindType() {
            return this.bindType;
        }

        public ClinkListCdrIbResponseBodyDataCdrIb setBridgeDuration(Long bridgeDuration) {
            this.bridgeDuration = bridgeDuration;
            return this;
        }
        public Long getBridgeDuration() {
            return this.bridgeDuration;
        }

        public ClinkListCdrIbResponseBodyDataCdrIb setBridgeTime(Long bridgeTime) {
            this.bridgeTime = bridgeTime;
            return this;
        }
        public Long getBridgeTime() {
            return this.bridgeTime;
        }

        public ClinkListCdrIbResponseBodyDataCdrIb setBusinessIds(java.util.List<String> businessIds) {
            this.businessIds = businessIds;
            return this;
        }
        public java.util.List<String> getBusinessIds() {
            return this.businessIds;
        }

        public ClinkListCdrIbResponseBodyDataCdrIb setCallId(String callId) {
            this.callId = callId;
            return this;
        }
        public String getCallId() {
            return this.callId;
        }

        public ClinkListCdrIbResponseBodyDataCdrIb setCustomerCity(String customerCity) {
            this.customerCity = customerCity;
            return this;
        }
        public String getCustomerCity() {
            return this.customerCity;
        }

        public ClinkListCdrIbResponseBodyDataCdrIb setCustomerNumber(String customerNumber) {
            this.customerNumber = customerNumber;
            return this;
        }
        public String getCustomerNumber() {
            return this.customerNumber;
        }

        public ClinkListCdrIbResponseBodyDataCdrIb setCustomerNumberEncrypt(String customerNumberEncrypt) {
            this.customerNumberEncrypt = customerNumberEncrypt;
            return this;
        }
        public String getCustomerNumberEncrypt() {
            return this.customerNumberEncrypt;
        }

        public ClinkListCdrIbResponseBodyDataCdrIb setCustomerProvince(String customerProvince) {
            this.customerProvince = customerProvince;
            return this;
        }
        public String getCustomerProvince() {
            return this.customerProvince;
        }

        public ClinkListCdrIbResponseBodyDataCdrIb setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public ClinkListCdrIbResponseBodyDataCdrIb setEvaluation(String evaluation) {
            this.evaluation = evaluation;
            return this;
        }
        public String getEvaluation() {
            return this.evaluation;
        }

        public ClinkListCdrIbResponseBodyDataCdrIb setFirstCallCname(String firstCallCname) {
            this.firstCallCname = firstCallCname;
            return this;
        }
        public String getFirstCallCname() {
            return this.firstCallCname;
        }

        public ClinkListCdrIbResponseBodyDataCdrIb setFirstCallCno(String firstCallCno) {
            this.firstCallCno = firstCallCno;
            return this;
        }
        public String getFirstCallCno() {
            return this.firstCallCno;
        }

        public ClinkListCdrIbResponseBodyDataCdrIb setFirstCallNumber(String firstCallNumber) {
            this.firstCallNumber = firstCallNumber;
            return this;
        }
        public String getFirstCallNumber() {
            return this.firstCallNumber;
        }

        public ClinkListCdrIbResponseBodyDataCdrIb setFirstCallQname(String firstCallQname) {
            this.firstCallQname = firstCallQname;
            return this;
        }
        public String getFirstCallQname() {
            return this.firstCallQname;
        }

        public ClinkListCdrIbResponseBodyDataCdrIb setFirstCallQno(String firstCallQno) {
            this.firstCallQno = firstCallQno;
            return this;
        }
        public String getFirstCallQno() {
            return this.firstCallQno;
        }

        public ClinkListCdrIbResponseBodyDataCdrIb setFirstJoinQueueTime(Long firstJoinQueueTime) {
            this.firstJoinQueueTime = firstJoinQueueTime;
            return this;
        }
        public Long getFirstJoinQueueTime() {
            return this.firstJoinQueueTime;
        }

        public ClinkListCdrIbResponseBodyDataCdrIb setFirstLeaveQueueTime(Long firstLeaveQueueTime) {
            this.firstLeaveQueueTime = firstLeaveQueueTime;
            return this;
        }
        public Long getFirstLeaveQueueTime() {
            return this.firstLeaveQueueTime;
        }

        public ClinkListCdrIbResponseBodyDataCdrIb setFirstQueueDuration(Long firstQueueDuration) {
            this.firstQueueDuration = firstQueueDuration;
            return this;
        }
        public Long getFirstQueueDuration() {
            return this.firstQueueDuration;
        }

        public ClinkListCdrIbResponseBodyDataCdrIb setHotline(String hotline) {
            this.hotline = hotline;
            return this;
        }
        public String getHotline() {
            return this.hotline;
        }

        public ClinkListCdrIbResponseBodyDataCdrIb setHotlineName(String hotlineName) {
            this.hotlineName = hotlineName;
            return this;
        }
        public String getHotlineName() {
            return this.hotlineName;
        }

        public ClinkListCdrIbResponseBodyDataCdrIb setInvestigationKeys(Long investigationKeys) {
            this.investigationKeys = investigationKeys;
            return this;
        }
        public Long getInvestigationKeys() {
            return this.investigationKeys;
        }

        public ClinkListCdrIbResponseBodyDataCdrIb setIvrName(String ivrName) {
            this.ivrName = ivrName;
            return this;
        }
        public String getIvrName() {
            return this.ivrName;
        }

        public ClinkListCdrIbResponseBodyDataCdrIb setMainUniqueId(String mainUniqueId) {
            this.mainUniqueId = mainUniqueId;
            return this;
        }
        public String getMainUniqueId() {
            return this.mainUniqueId;
        }

        public ClinkListCdrIbResponseBodyDataCdrIb setMarkData(String markData) {
            this.markData = markData;
            return this;
        }
        public String getMarkData() {
            return this.markData;
        }

        public ClinkListCdrIbResponseBodyDataCdrIb setOnHookSource(String onHookSource) {
            this.onHookSource = onHookSource;
            return this;
        }
        public String getOnHookSource() {
            return this.onHookSource;
        }

        public ClinkListCdrIbResponseBodyDataCdrIb setRecordFile(String recordFile) {
            this.recordFile = recordFile;
            return this;
        }
        public String getRecordFile() {
            return this.recordFile;
        }

        public ClinkListCdrIbResponseBodyDataCdrIb setRtcUid(String rtcUid) {
            this.rtcUid = rtcUid;
            return this;
        }
        public String getRtcUid() {
            return this.rtcUid;
        }

        public ClinkListCdrIbResponseBodyDataCdrIb setSayVoiceDuration(Long sayVoiceDuration) {
            this.sayVoiceDuration = sayVoiceDuration;
            return this;
        }
        public Long getSayVoiceDuration() {
            return this.sayVoiceDuration;
        }

        public ClinkListCdrIbResponseBodyDataCdrIb setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public ClinkListCdrIbResponseBodyDataCdrIb setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ClinkListCdrIbResponseBodyDataCdrIb setStatusResult(String statusResult) {
            this.statusResult = statusResult;
            return this;
        }
        public String getStatusResult() {
            return this.statusResult;
        }

        public ClinkListCdrIbResponseBodyDataCdrIb setStatusRobot(String statusRobot) {
            this.statusRobot = statusRobot;
            return this;
        }
        public String getStatusRobot() {
            return this.statusRobot;
        }

        public ClinkListCdrIbResponseBodyDataCdrIb setTagNames(java.util.List<String> tagNames) {
            this.tagNames = tagNames;
            return this;
        }
        public java.util.List<String> getTagNames() {
            return this.tagNames;
        }

        public ClinkListCdrIbResponseBodyDataCdrIb setTicketIds(java.util.List<String> ticketIds) {
            this.ticketIds = ticketIds;
            return this;
        }
        public java.util.List<String> getTicketIds() {
            return this.ticketIds;
        }

        public ClinkListCdrIbResponseBodyDataCdrIb setTotalDuration(Long totalDuration) {
            this.totalDuration = totalDuration;
            return this;
        }
        public Long getTotalDuration() {
            return this.totalDuration;
        }

        public ClinkListCdrIbResponseBodyDataCdrIb setUserField(String userField) {
            this.userField = userField;
            return this;
        }
        public String getUserField() {
            return this.userField;
        }

        public ClinkListCdrIbResponseBodyDataCdrIb setWebrtcCallId(String webrtcCallId) {
            this.webrtcCallId = webrtcCallId;
            return this;
        }
        public String getWebrtcCallId() {
            return this.webrtcCallId;
        }

        public ClinkListCdrIbResponseBodyDataCdrIb setXnumber(String xnumber) {
            this.xnumber = xnumber;
            return this;
        }
        public String getXnumber() {
            return this.xnumber;
        }

    }

    public static class ClinkListCdrIbResponseBodyData extends TeaModel {
        /**
         * <p>[客户来电记录列表] #客户来电记录列表</p>
         */
        @NameInMap("CdrIb")
        public java.util.List<ClinkListCdrIbResponseBodyDataCdrIb> cdrIb;

        /**
         * <p>请求 id</p>
         * 
         * <strong>example:</strong>
         * <p>1713848594</p>
         */
        @NameInMap("ClinkRequestId")
        public String clinkRequestId;

        /**
         * <p>当前页码</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Long pageNumber;

        /**
         * <p>一页展示条数</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Long pageSize;

        /**
         * <p>滚动查询ID</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("ScrollId")
        public String scrollId;

        /**
         * <p>总条数</p>
         * 
         * <strong>example:</strong>
         * <p>69</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        public static ClinkListCdrIbResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ClinkListCdrIbResponseBodyData self = new ClinkListCdrIbResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ClinkListCdrIbResponseBodyData setCdrIb(java.util.List<ClinkListCdrIbResponseBodyDataCdrIb> cdrIb) {
            this.cdrIb = cdrIb;
            return this;
        }
        public java.util.List<ClinkListCdrIbResponseBodyDataCdrIb> getCdrIb() {
            return this.cdrIb;
        }

        public ClinkListCdrIbResponseBodyData setClinkRequestId(String clinkRequestId) {
            this.clinkRequestId = clinkRequestId;
            return this;
        }
        public String getClinkRequestId() {
            return this.clinkRequestId;
        }

        public ClinkListCdrIbResponseBodyData setPageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Long getPageNumber() {
            return this.pageNumber;
        }

        public ClinkListCdrIbResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public ClinkListCdrIbResponseBodyData setScrollId(String scrollId) {
            this.scrollId = scrollId;
            return this;
        }
        public String getScrollId() {
            return this.scrollId;
        }

        public ClinkListCdrIbResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
