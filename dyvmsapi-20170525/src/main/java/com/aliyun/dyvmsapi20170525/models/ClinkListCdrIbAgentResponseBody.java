// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class ClinkListCdrIbAgentResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ClinkListCdrIbAgentResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>D9CB3933-9FE3-4870-BA8E-2BEE91B69D23</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ClinkListCdrIbAgentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ClinkListCdrIbAgentResponseBody self = new ClinkListCdrIbAgentResponseBody();
        return TeaModel.build(map, self);
    }

    public ClinkListCdrIbAgentResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public ClinkListCdrIbAgentResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ClinkListCdrIbAgentResponseBody setData(ClinkListCdrIbAgentResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ClinkListCdrIbAgentResponseBodyData getData() {
        return this.data;
    }

    public ClinkListCdrIbAgentResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ClinkListCdrIbAgentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ClinkListCdrIbAgentResponseBodyDataCdrIbAgent extends TeaModel {
        /**
         * <p>及时应答</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AgentAnswerInTime")
        public Long agentAnswerInTime;

        /**
         * <p>接听时间</p>
         * 
         * <strong>example:</strong>
         * <p>1775024775</p>
         */
        @NameInMap("AnswerTime")
        public Long answerTime;

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
         * <p>30</p>
         */
        @NameInMap("BridgeDuration")
        public Long bridgeDuration;

        /**
         * <p>接听状态</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("BridgeStatus")
        public String bridgeStatus;

        /**
         * <p>呼叫结果</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("BridgeStatusDetail")
        public String bridgeStatusDetail;

        /**
         * <p>CallID</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("CallId")
        public String callId;

        /**
         * <p>座席名称</p>
         * 
         * <strong>example:</strong>
         * <p>ClientName</p>
         */
        @NameInMap("ClientName")
        public String clientName;

        /**
         * <p>座席电话</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("ClientNumber")
        public String clientNumber;

        /**
         * <p>座席号</p>
         * 
         * <strong>example:</strong>
         * <p>1122</p>
         */
        @NameInMap("Cno")
        public String cno;

        /**
         * <p>客户号码城市</p>
         * 
         * <strong>example:</strong>
         * <p>示例值</p>
         */
        @NameInMap("CustomerCity")
        public String customerCity;

        /**
         * <p>客户号码，带区号</p>
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
         * <p>示例值示例值</p>
         */
        @NameInMap("CustomerProvince")
        public String customerProvince;

        /**
         * <p>呼叫类型</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("DetailCallType")
        public String detailCallType;

        /**
         * <p>结束时间</p>
         * 
         * <strong>example:</strong>
         * <p>82</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>热线号码</p>
         * 
         * <strong>example:</strong>
         * <p>Hotline</p>
         */
        @NameInMap("Hotline")
        public String hotline;

        /**
         * <p>热线别名</p>
         * 
         * <strong>example:</strong>
         * <p>HotlineName</p>
         */
        @NameInMap("HotlineName")
        public String hotlineName;

        /**
         * <p>振铃时长</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("IbRingingDuration")
        public Long ibRingingDuration;

        /**
         * <p>通话ID</p>
         * 
         * <strong>example:</strong>
         * <p>medias_1-162046xxxx.12</p>
         */
        @NameInMap("MainUniqueId")
        public String mainUniqueId;

        /**
         * <p>座席接起时间</p>
         * 
         * <strong>example:</strong>
         * <p>1775024775</p>
         */
        @NameInMap("OffhookTime")
        public Long offhookTime;

        /**
         * <p>挂断方</p>
         * 
         * <strong>example:</strong>
         * <p>示例值</p>
         */
        @NameInMap("OnHookSource")
        public String onHookSource;

        /**
         * <p>来电队列名称</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值示例值</p>
         */
        @NameInMap("Qname")
        public String qname;

        /**
         * <p>来电队列号</p>
         * 
         * <strong>example:</strong>
         * <p>2233</p>
         */
        @NameInMap("Qno")
        public String qno;

        /**
         * <p>录音文件名</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("RecordFile")
        public String recordFile;

        /**
         * <p>主叫记忆。obRemember: 外呼主叫记忆，ibRemember: 来电主叫记忆</p>
         * 
         * <strong>example:</strong>
         * <p>obRemember</p>
         */
        @NameInMap("Remember")
        public String remember;

        /**
         * <p>振铃时间</p>
         * 
         * <strong>example:</strong>
         * <p>1775024775</p>
         */
        @NameInMap("RingTime")
        public Long ringTime;

        /**
         * <p>语音播报时长</p>
         * 
         * <strong>example:</strong>
         * <p>51</p>
         */
        @NameInMap("SayVoiceDuration")
        public Long sayVoiceDuration;

        /**
         * <p>呼叫情况</p>
         * 
         * <strong>example:</strong>
         * <p>示例值</p>
         */
        @NameInMap("SipCauseDesc")
        public String sipCauseDesc;

        /**
         * <p>开始时间</p>
         * 
         * <strong>example:</strong>
         * <p>1775024775</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        /**
         * <p>唯一标识</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("UniqueId")
        public String uniqueId;

        /**
         * <p>WebRTCCallID</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("WebrtcCallId")
        public String webrtcCallId;

        public static ClinkListCdrIbAgentResponseBodyDataCdrIbAgent build(java.util.Map<String, ?> map) throws Exception {
            ClinkListCdrIbAgentResponseBodyDataCdrIbAgent self = new ClinkListCdrIbAgentResponseBodyDataCdrIbAgent();
            return TeaModel.build(map, self);
        }

        public ClinkListCdrIbAgentResponseBodyDataCdrIbAgent setAgentAnswerInTime(Long agentAnswerInTime) {
            this.agentAnswerInTime = agentAnswerInTime;
            return this;
        }
        public Long getAgentAnswerInTime() {
            return this.agentAnswerInTime;
        }

        public ClinkListCdrIbAgentResponseBodyDataCdrIbAgent setAnswerTime(Long answerTime) {
            this.answerTime = answerTime;
            return this;
        }
        public Long getAnswerTime() {
            return this.answerTime;
        }

        public ClinkListCdrIbAgentResponseBodyDataCdrIbAgent setBindType(Long bindType) {
            this.bindType = bindType;
            return this;
        }
        public Long getBindType() {
            return this.bindType;
        }

        public ClinkListCdrIbAgentResponseBodyDataCdrIbAgent setBridgeDuration(Long bridgeDuration) {
            this.bridgeDuration = bridgeDuration;
            return this;
        }
        public Long getBridgeDuration() {
            return this.bridgeDuration;
        }

        public ClinkListCdrIbAgentResponseBodyDataCdrIbAgent setBridgeStatus(String bridgeStatus) {
            this.bridgeStatus = bridgeStatus;
            return this;
        }
        public String getBridgeStatus() {
            return this.bridgeStatus;
        }

        public ClinkListCdrIbAgentResponseBodyDataCdrIbAgent setBridgeStatusDetail(String bridgeStatusDetail) {
            this.bridgeStatusDetail = bridgeStatusDetail;
            return this;
        }
        public String getBridgeStatusDetail() {
            return this.bridgeStatusDetail;
        }

        public ClinkListCdrIbAgentResponseBodyDataCdrIbAgent setCallId(String callId) {
            this.callId = callId;
            return this;
        }
        public String getCallId() {
            return this.callId;
        }

        public ClinkListCdrIbAgentResponseBodyDataCdrIbAgent setClientName(String clientName) {
            this.clientName = clientName;
            return this;
        }
        public String getClientName() {
            return this.clientName;
        }

        public ClinkListCdrIbAgentResponseBodyDataCdrIbAgent setClientNumber(String clientNumber) {
            this.clientNumber = clientNumber;
            return this;
        }
        public String getClientNumber() {
            return this.clientNumber;
        }

        public ClinkListCdrIbAgentResponseBodyDataCdrIbAgent setCno(String cno) {
            this.cno = cno;
            return this;
        }
        public String getCno() {
            return this.cno;
        }

        public ClinkListCdrIbAgentResponseBodyDataCdrIbAgent setCustomerCity(String customerCity) {
            this.customerCity = customerCity;
            return this;
        }
        public String getCustomerCity() {
            return this.customerCity;
        }

        public ClinkListCdrIbAgentResponseBodyDataCdrIbAgent setCustomerNumber(String customerNumber) {
            this.customerNumber = customerNumber;
            return this;
        }
        public String getCustomerNumber() {
            return this.customerNumber;
        }

        public ClinkListCdrIbAgentResponseBodyDataCdrIbAgent setCustomerNumberEncrypt(String customerNumberEncrypt) {
            this.customerNumberEncrypt = customerNumberEncrypt;
            return this;
        }
        public String getCustomerNumberEncrypt() {
            return this.customerNumberEncrypt;
        }

        public ClinkListCdrIbAgentResponseBodyDataCdrIbAgent setCustomerProvince(String customerProvince) {
            this.customerProvince = customerProvince;
            return this;
        }
        public String getCustomerProvince() {
            return this.customerProvince;
        }

        public ClinkListCdrIbAgentResponseBodyDataCdrIbAgent setDetailCallType(String detailCallType) {
            this.detailCallType = detailCallType;
            return this;
        }
        public String getDetailCallType() {
            return this.detailCallType;
        }

        public ClinkListCdrIbAgentResponseBodyDataCdrIbAgent setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public ClinkListCdrIbAgentResponseBodyDataCdrIbAgent setHotline(String hotline) {
            this.hotline = hotline;
            return this;
        }
        public String getHotline() {
            return this.hotline;
        }

        public ClinkListCdrIbAgentResponseBodyDataCdrIbAgent setHotlineName(String hotlineName) {
            this.hotlineName = hotlineName;
            return this;
        }
        public String getHotlineName() {
            return this.hotlineName;
        }

        public ClinkListCdrIbAgentResponseBodyDataCdrIbAgent setIbRingingDuration(Long ibRingingDuration) {
            this.ibRingingDuration = ibRingingDuration;
            return this;
        }
        public Long getIbRingingDuration() {
            return this.ibRingingDuration;
        }

        public ClinkListCdrIbAgentResponseBodyDataCdrIbAgent setMainUniqueId(String mainUniqueId) {
            this.mainUniqueId = mainUniqueId;
            return this;
        }
        public String getMainUniqueId() {
            return this.mainUniqueId;
        }

        public ClinkListCdrIbAgentResponseBodyDataCdrIbAgent setOffhookTime(Long offhookTime) {
            this.offhookTime = offhookTime;
            return this;
        }
        public Long getOffhookTime() {
            return this.offhookTime;
        }

        public ClinkListCdrIbAgentResponseBodyDataCdrIbAgent setOnHookSource(String onHookSource) {
            this.onHookSource = onHookSource;
            return this;
        }
        public String getOnHookSource() {
            return this.onHookSource;
        }

        public ClinkListCdrIbAgentResponseBodyDataCdrIbAgent setQname(String qname) {
            this.qname = qname;
            return this;
        }
        public String getQname() {
            return this.qname;
        }

        public ClinkListCdrIbAgentResponseBodyDataCdrIbAgent setQno(String qno) {
            this.qno = qno;
            return this;
        }
        public String getQno() {
            return this.qno;
        }

        public ClinkListCdrIbAgentResponseBodyDataCdrIbAgent setRecordFile(String recordFile) {
            this.recordFile = recordFile;
            return this;
        }
        public String getRecordFile() {
            return this.recordFile;
        }

        public ClinkListCdrIbAgentResponseBodyDataCdrIbAgent setRemember(String remember) {
            this.remember = remember;
            return this;
        }
        public String getRemember() {
            return this.remember;
        }

        public ClinkListCdrIbAgentResponseBodyDataCdrIbAgent setRingTime(Long ringTime) {
            this.ringTime = ringTime;
            return this;
        }
        public Long getRingTime() {
            return this.ringTime;
        }

        public ClinkListCdrIbAgentResponseBodyDataCdrIbAgent setSayVoiceDuration(Long sayVoiceDuration) {
            this.sayVoiceDuration = sayVoiceDuration;
            return this;
        }
        public Long getSayVoiceDuration() {
            return this.sayVoiceDuration;
        }

        public ClinkListCdrIbAgentResponseBodyDataCdrIbAgent setSipCauseDesc(String sipCauseDesc) {
            this.sipCauseDesc = sipCauseDesc;
            return this;
        }
        public String getSipCauseDesc() {
            return this.sipCauseDesc;
        }

        public ClinkListCdrIbAgentResponseBodyDataCdrIbAgent setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public ClinkListCdrIbAgentResponseBodyDataCdrIbAgent setUniqueId(String uniqueId) {
            this.uniqueId = uniqueId;
            return this;
        }
        public String getUniqueId() {
            return this.uniqueId;
        }

        public ClinkListCdrIbAgentResponseBodyDataCdrIbAgent setWebrtcCallId(String webrtcCallId) {
            this.webrtcCallId = webrtcCallId;
            return this;
        }
        public String getWebrtcCallId() {
            return this.webrtcCallId;
        }

    }

    public static class ClinkListCdrIbAgentResponseBodyData extends TeaModel {
        /**
         * <p>[座席接听记录列表] #座席接听记录列表</p>
         */
        @NameInMap("CdrIbAgent")
        public java.util.List<ClinkListCdrIbAgentResponseBodyDataCdrIbAgent> cdrIbAgent;

        /**
         * <p>请求 id</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
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
         * <p>20</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        public static ClinkListCdrIbAgentResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ClinkListCdrIbAgentResponseBodyData self = new ClinkListCdrIbAgentResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ClinkListCdrIbAgentResponseBodyData setCdrIbAgent(java.util.List<ClinkListCdrIbAgentResponseBodyDataCdrIbAgent> cdrIbAgent) {
            this.cdrIbAgent = cdrIbAgent;
            return this;
        }
        public java.util.List<ClinkListCdrIbAgentResponseBodyDataCdrIbAgent> getCdrIbAgent() {
            return this.cdrIbAgent;
        }

        public ClinkListCdrIbAgentResponseBodyData setClinkRequestId(String clinkRequestId) {
            this.clinkRequestId = clinkRequestId;
            return this;
        }
        public String getClinkRequestId() {
            return this.clinkRequestId;
        }

        public ClinkListCdrIbAgentResponseBodyData setPageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Long getPageNumber() {
            return this.pageNumber;
        }

        public ClinkListCdrIbAgentResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public ClinkListCdrIbAgentResponseBodyData setScrollId(String scrollId) {
            this.scrollId = scrollId;
            return this;
        }
        public String getScrollId() {
            return this.scrollId;
        }

        public ClinkListCdrIbAgentResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
