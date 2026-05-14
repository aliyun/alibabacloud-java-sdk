// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class ClinkDescribeCdrIbResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ClinkDescribeCdrIbResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>088A4C31-A613-5339-B9E7-E4C4B8BE0F00</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ClinkDescribeCdrIbResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ClinkDescribeCdrIbResponseBody self = new ClinkDescribeCdrIbResponseBody();
        return TeaModel.build(map, self);
    }

    public ClinkDescribeCdrIbResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public ClinkDescribeCdrIbResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ClinkDescribeCdrIbResponseBody setData(ClinkDescribeCdrIbResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ClinkDescribeCdrIbResponseBodyData getData() {
        return this.data;
    }

    public ClinkDescribeCdrIbResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ClinkDescribeCdrIbResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ClinkDescribeCdrIbResponseBodyDataCdrIbInvestigation extends TeaModel {
        /**
         * <p>座席名称</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("ClientName")
        public String clientName;

        /**
         * <p>座席号</p>
         * 
         * <strong>example:</strong>
         * <p>1111</p>
         */
        @NameInMap("Cno")
        public String cno;

        /**
         * <p>结束时间</p>
         * 
         * <strong>example:</strong>
         * <p>1775024775</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>按键值</p>
         * 
         * <strong>example:</strong>
         * <p>9</p>
         */
        @NameInMap("Keys")
        public Long keys;

        /**
         * <p>多按键值</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("MultiKeys")
        public String multiKeys;

        /**
         * <p>开始时间</p>
         * 
         * <strong>example:</strong>
         * <p>1775024775</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        public static ClinkDescribeCdrIbResponseBodyDataCdrIbInvestigation build(java.util.Map<String, ?> map) throws Exception {
            ClinkDescribeCdrIbResponseBodyDataCdrIbInvestigation self = new ClinkDescribeCdrIbResponseBodyDataCdrIbInvestigation();
            return TeaModel.build(map, self);
        }

        public ClinkDescribeCdrIbResponseBodyDataCdrIbInvestigation setClientName(String clientName) {
            this.clientName = clientName;
            return this;
        }
        public String getClientName() {
            return this.clientName;
        }

        public ClinkDescribeCdrIbResponseBodyDataCdrIbInvestigation setCno(String cno) {
            this.cno = cno;
            return this;
        }
        public String getCno() {
            return this.cno;
        }

        public ClinkDescribeCdrIbResponseBodyDataCdrIbInvestigation setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public ClinkDescribeCdrIbResponseBodyDataCdrIbInvestigation setKeys(Long keys) {
            this.keys = keys;
            return this;
        }
        public Long getKeys() {
            return this.keys;
        }

        public ClinkDescribeCdrIbResponseBodyDataCdrIbInvestigation setMultiKeys(String multiKeys) {
            this.multiKeys = multiKeys;
            return this;
        }
        public String getMultiKeys() {
            return this.multiKeys;
        }

        public ClinkDescribeCdrIbResponseBodyDataCdrIbInvestigation setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

    }

    public static class ClinkDescribeCdrIbResponseBodyDataCdrIbIvrFlows extends TeaModel {
        /**
         * <p>执行动作</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Action")
        public Long action;

        /**
         * <p>结束时间</p>
         * 
         * <strong>example:</strong>
         * <p>1775024775</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>ivr 名称</p>
         * 
         * <strong>example:</strong>
         * <p>--</p>
         */
        @NameInMap("IvrName")
        public Long ivrName;

        /**
         * <p>节点 id</p>
         * 
         * <strong>example:</strong>
         * <p>13321</p>
         */
        @NameInMap("Path")
        public String path;

        /**
         * <p>节点名称</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("PathName")
        public String pathName;

        /**
         * <p>按键值</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        @NameInMap("PressKey")
        public String pressKey;

        /**
         * <p>按键时间</p>
         * 
         * <strong>example:</strong>
         * <p>1775024775</p>
         */
        @NameInMap("PressTime")
        public Long pressTime;

        /**
         * <p>路由结束时间</p>
         * 
         * <strong>example:</strong>
         * <p>1775024775</p>
         */
        @NameInMap("RouterEndTime")
        public Long routerEndTime;

        /**
         * <p>路由名称</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("RouterName")
        public Long routerName;

        /**
         * <p>路由开始时间</p>
         * 
         * <strong>example:</strong>
         * <p>1775024775</p>
         */
        @NameInMap("RouterStartTime")
        public Long routerStartTime;

        /**
         * <p>开始时间</p>
         * 
         * <strong>example:</strong>
         * <p>1775024775</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        public static ClinkDescribeCdrIbResponseBodyDataCdrIbIvrFlows build(java.util.Map<String, ?> map) throws Exception {
            ClinkDescribeCdrIbResponseBodyDataCdrIbIvrFlows self = new ClinkDescribeCdrIbResponseBodyDataCdrIbIvrFlows();
            return TeaModel.build(map, self);
        }

        public ClinkDescribeCdrIbResponseBodyDataCdrIbIvrFlows setAction(Long action) {
            this.action = action;
            return this;
        }
        public Long getAction() {
            return this.action;
        }

        public ClinkDescribeCdrIbResponseBodyDataCdrIbIvrFlows setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public ClinkDescribeCdrIbResponseBodyDataCdrIbIvrFlows setIvrName(Long ivrName) {
            this.ivrName = ivrName;
            return this;
        }
        public Long getIvrName() {
            return this.ivrName;
        }

        public ClinkDescribeCdrIbResponseBodyDataCdrIbIvrFlows setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public ClinkDescribeCdrIbResponseBodyDataCdrIbIvrFlows setPathName(String pathName) {
            this.pathName = pathName;
            return this;
        }
        public String getPathName() {
            return this.pathName;
        }

        public ClinkDescribeCdrIbResponseBodyDataCdrIbIvrFlows setPressKey(String pressKey) {
            this.pressKey = pressKey;
            return this;
        }
        public String getPressKey() {
            return this.pressKey;
        }

        public ClinkDescribeCdrIbResponseBodyDataCdrIbIvrFlows setPressTime(Long pressTime) {
            this.pressTime = pressTime;
            return this;
        }
        public Long getPressTime() {
            return this.pressTime;
        }

        public ClinkDescribeCdrIbResponseBodyDataCdrIbIvrFlows setRouterEndTime(Long routerEndTime) {
            this.routerEndTime = routerEndTime;
            return this;
        }
        public Long getRouterEndTime() {
            return this.routerEndTime;
        }

        public ClinkDescribeCdrIbResponseBodyDataCdrIbIvrFlows setRouterName(Long routerName) {
            this.routerName = routerName;
            return this;
        }
        public Long getRouterName() {
            return this.routerName;
        }

        public ClinkDescribeCdrIbResponseBodyDataCdrIbIvrFlows setRouterStartTime(Long routerStartTime) {
            this.routerStartTime = routerStartTime;
            return this;
        }
        public Long getRouterStartTime() {
            return this.routerStartTime;
        }

        public ClinkDescribeCdrIbResponseBodyDataCdrIbIvrFlows setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

    }

    public static class ClinkDescribeCdrIbResponseBodyDataCdrIb extends TeaModel {
        /**
         * <p>接通时长</p>
         * 
         * <strong>example:</strong>
         * <p>33</p>
         */
        @NameInMap("BridgeDuration")
        public Long bridgeDuration;

        /**
         * <p>接通时间</p>
         * 
         * <strong>example:</strong>
         * <p>1775024775</p>
         */
        @NameInMap("BridgeTime")
        public Long bridgeTime;

        /**
         * <p>通话记录ID</p>
         * 
         * <strong>example:</strong>
         * <p>b1651313-0e70-487c-99fd-3ea342b35b00</p>
         */
        @NameInMap("CallId")
        public String callId;

        /**
         * <p>呼入类型</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("CallType")
        public String callType;

        /**
         * <p>座席名称</p>
         * 
         * <strong>example:</strong>
         * <p>示例值</p>
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
         * <p>座席接起时间</p>
         * 
         * <strong>example:</strong>
         * <p>1775024775</p>
         */
        @NameInMap("ClientOffhookTime")
        public Long clientOffhookTime;

        /**
         * <p>座席响铃时间</p>
         * 
         * <strong>example:</strong>
         * <p>1775024775</p>
         */
        @NameInMap("ClientRingingTime")
        public Long clientRingingTime;

        /**
         * <p>座席号</p>
         * 
         * <strong>example:</strong>
         * <p>1111</p>
         */
        @NameInMap("Cno")
        public String cno;

        /**
         * <p>客户来电城市</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("CustomerCity")
        public String customerCity;

        /**
         * <p>客户来电号码，带区号</p>
         * 
         * <strong>example:</strong>
         * <p>010xxx</p>
         */
        @NameInMap("CustomerNumber")
        public String customerNumber;

        /**
         * <p>客户来电号码加密串</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("CustomerNumberEncrypt")
        public String customerNumberEncrypt;

        /**
         * <p>客户来电省份</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("CustomerProvince")
        public String customerProvince;

        /**
         * <p>挂机方</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("EndReason")
        public String endReason;

        /**
         * <p>结束时间</p>
         * 
         * <strong>example:</strong>
         * <p>1775024775</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>是否邀评 0: 否 1: 是</p>
         * 
         * <strong>example:</strong>
         * <p>39</p>
         */
        @NameInMap("Evaluation")
        public Long evaluation;

        /**
         * <p>客户速挂，true：是；false：否</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("FastHangUp")
        public Boolean fastHangUp;

        /**
         * <p>首次进入队列时间</p>
         * 
         * <strong>example:</strong>
         * <p>1775024775</p>
         */
        @NameInMap("FirstJoinQueueTime")
        public Long firstJoinQueueTime;

        /**
         * <p>来电热线号码</p>
         * 
         * <strong>example:</strong>
         * <p>02788xxx888</p>
         */
        @NameInMap("Hotline")
        public String hotline;

        /**
         * <p>热线别名</p>
         * 
         * <strong>example:</strong>
         * <p>示例值</p>
         */
        @NameInMap("HotlineName")
        public String hotlineName;

        /**
         * <p>座席振铃时长</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("IbRingingDuration")
        public Long ibRingingDuration;

        /**
         * <p>排队时长</p>
         * 
         * <strong>example:</strong>
         * <p>96</p>
         */
        @NameInMap("IbWaitDuration")
        public Long ibWaitDuration;

        /**
         * <p>[满意度记录] #满意度记录</p>
         */
        @NameInMap("Investigation")
        public ClinkDescribeCdrIbResponseBodyDataCdrIbInvestigation investigation;

        /**
         * <p>[路由和IVR] #路由和IVR</p>
         */
        @NameInMap("IvrFlows")
        public java.util.List<ClinkDescribeCdrIbResponseBodyDataCdrIbIvrFlows> ivrFlows;

        /**
         * <p>IVR名称</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值示例值</p>
         */
        @NameInMap("IvrName")
        public String ivrName;

        /**
         * <p>进入队列时间</p>
         * 
         * <strong>example:</strong>
         * <p>1775024775</p>
         */
        @NameInMap("JoinQueueTime")
        public Long joinQueueTime;

        /**
         * <p>离开队列时间</p>
         * 
         * <strong>example:</strong>
         * <p>1775024775</p>
         */
        @NameInMap("LeaveQueueTime")
        public Long leaveQueueTime;

        /**
         * <p>标记</p>
         * 
         * <strong>example:</strong>
         * <p>77</p>
         */
        @NameInMap("Mark")
        public Long mark;

        /**
         * <p>备注</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("MarkData")
        public String markData;

        /**
         * <p>来电队列号</p>
         * 
         * <strong>example:</strong>
         * <p>1122</p>
         */
        @NameInMap("Qno")
        public String qno;

        /**
         * <p>队列及时应答</p>
         * 
         * <strong>example:</strong>
         * <p>1775024775</p>
         */
        @NameInMap("QueueAnswerInTime")
        public Long queueAnswerInTime;

        /**
         * <p>录音文件名</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("RecordFile")
        public String recordFile;

        /**
         * <p>语音播报时长</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("SayVoiceDuration")
        public Long sayVoiceDuration;

        /**
         * <p>呼叫结果</p>
         * 
         * <strong>example:</strong>
         * <p>示例值</p>
         */
        @NameInMap("SipCause")
        public String sipCause;

        /**
         * <p>开始时间</p>
         * 
         * <strong>example:</strong>
         * <p>1775024775</p>
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
         * <p>接听状态映射</p>
         * 
         * <strong>example:</strong>
         * <p>示例值</p>
         */
        @NameInMap("StatusCode")
        public String statusCode;

        /**
         * <p>展示通话标签详情,当请求参数fields中包含tagNames时返回</p>
         */
        @NameInMap("TagNames")
        public java.util.List<String> tagNames;

        /**
         * <p>标签</p>
         */
        @NameInMap("Tags")
        public java.util.List<String> tags;

        /**
         * <p>总时长</p>
         * 
         * <strong>example:</strong>
         * <p>87</p>
         */
        @NameInMap("TotalDuration")
        public Long totalDuration;

        /**
         * <p>通话记录唯一标识</p>
         * 
         * <strong>example:</strong>
         * <p>示例值</p>
         */
        @NameInMap("UniqueId")
        public String uniqueId;

        public static ClinkDescribeCdrIbResponseBodyDataCdrIb build(java.util.Map<String, ?> map) throws Exception {
            ClinkDescribeCdrIbResponseBodyDataCdrIb self = new ClinkDescribeCdrIbResponseBodyDataCdrIb();
            return TeaModel.build(map, self);
        }

        public ClinkDescribeCdrIbResponseBodyDataCdrIb setBridgeDuration(Long bridgeDuration) {
            this.bridgeDuration = bridgeDuration;
            return this;
        }
        public Long getBridgeDuration() {
            return this.bridgeDuration;
        }

        public ClinkDescribeCdrIbResponseBodyDataCdrIb setBridgeTime(Long bridgeTime) {
            this.bridgeTime = bridgeTime;
            return this;
        }
        public Long getBridgeTime() {
            return this.bridgeTime;
        }

        public ClinkDescribeCdrIbResponseBodyDataCdrIb setCallId(String callId) {
            this.callId = callId;
            return this;
        }
        public String getCallId() {
            return this.callId;
        }

        public ClinkDescribeCdrIbResponseBodyDataCdrIb setCallType(String callType) {
            this.callType = callType;
            return this;
        }
        public String getCallType() {
            return this.callType;
        }

        public ClinkDescribeCdrIbResponseBodyDataCdrIb setClientName(String clientName) {
            this.clientName = clientName;
            return this;
        }
        public String getClientName() {
            return this.clientName;
        }

        public ClinkDescribeCdrIbResponseBodyDataCdrIb setClientNumber(String clientNumber) {
            this.clientNumber = clientNumber;
            return this;
        }
        public String getClientNumber() {
            return this.clientNumber;
        }

        public ClinkDescribeCdrIbResponseBodyDataCdrIb setClientOffhookTime(Long clientOffhookTime) {
            this.clientOffhookTime = clientOffhookTime;
            return this;
        }
        public Long getClientOffhookTime() {
            return this.clientOffhookTime;
        }

        public ClinkDescribeCdrIbResponseBodyDataCdrIb setClientRingingTime(Long clientRingingTime) {
            this.clientRingingTime = clientRingingTime;
            return this;
        }
        public Long getClientRingingTime() {
            return this.clientRingingTime;
        }

        public ClinkDescribeCdrIbResponseBodyDataCdrIb setCno(String cno) {
            this.cno = cno;
            return this;
        }
        public String getCno() {
            return this.cno;
        }

        public ClinkDescribeCdrIbResponseBodyDataCdrIb setCustomerCity(String customerCity) {
            this.customerCity = customerCity;
            return this;
        }
        public String getCustomerCity() {
            return this.customerCity;
        }

        public ClinkDescribeCdrIbResponseBodyDataCdrIb setCustomerNumber(String customerNumber) {
            this.customerNumber = customerNumber;
            return this;
        }
        public String getCustomerNumber() {
            return this.customerNumber;
        }

        public ClinkDescribeCdrIbResponseBodyDataCdrIb setCustomerNumberEncrypt(String customerNumberEncrypt) {
            this.customerNumberEncrypt = customerNumberEncrypt;
            return this;
        }
        public String getCustomerNumberEncrypt() {
            return this.customerNumberEncrypt;
        }

        public ClinkDescribeCdrIbResponseBodyDataCdrIb setCustomerProvince(String customerProvince) {
            this.customerProvince = customerProvince;
            return this;
        }
        public String getCustomerProvince() {
            return this.customerProvince;
        }

        public ClinkDescribeCdrIbResponseBodyDataCdrIb setEndReason(String endReason) {
            this.endReason = endReason;
            return this;
        }
        public String getEndReason() {
            return this.endReason;
        }

        public ClinkDescribeCdrIbResponseBodyDataCdrIb setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public ClinkDescribeCdrIbResponseBodyDataCdrIb setEvaluation(Long evaluation) {
            this.evaluation = evaluation;
            return this;
        }
        public Long getEvaluation() {
            return this.evaluation;
        }

        public ClinkDescribeCdrIbResponseBodyDataCdrIb setFastHangUp(Boolean fastHangUp) {
            this.fastHangUp = fastHangUp;
            return this;
        }
        public Boolean getFastHangUp() {
            return this.fastHangUp;
        }

        public ClinkDescribeCdrIbResponseBodyDataCdrIb setFirstJoinQueueTime(Long firstJoinQueueTime) {
            this.firstJoinQueueTime = firstJoinQueueTime;
            return this;
        }
        public Long getFirstJoinQueueTime() {
            return this.firstJoinQueueTime;
        }

        public ClinkDescribeCdrIbResponseBodyDataCdrIb setHotline(String hotline) {
            this.hotline = hotline;
            return this;
        }
        public String getHotline() {
            return this.hotline;
        }

        public ClinkDescribeCdrIbResponseBodyDataCdrIb setHotlineName(String hotlineName) {
            this.hotlineName = hotlineName;
            return this;
        }
        public String getHotlineName() {
            return this.hotlineName;
        }

        public ClinkDescribeCdrIbResponseBodyDataCdrIb setIbRingingDuration(Long ibRingingDuration) {
            this.ibRingingDuration = ibRingingDuration;
            return this;
        }
        public Long getIbRingingDuration() {
            return this.ibRingingDuration;
        }

        public ClinkDescribeCdrIbResponseBodyDataCdrIb setIbWaitDuration(Long ibWaitDuration) {
            this.ibWaitDuration = ibWaitDuration;
            return this;
        }
        public Long getIbWaitDuration() {
            return this.ibWaitDuration;
        }

        public ClinkDescribeCdrIbResponseBodyDataCdrIb setInvestigation(ClinkDescribeCdrIbResponseBodyDataCdrIbInvestigation investigation) {
            this.investigation = investigation;
            return this;
        }
        public ClinkDescribeCdrIbResponseBodyDataCdrIbInvestigation getInvestigation() {
            return this.investigation;
        }

        public ClinkDescribeCdrIbResponseBodyDataCdrIb setIvrFlows(java.util.List<ClinkDescribeCdrIbResponseBodyDataCdrIbIvrFlows> ivrFlows) {
            this.ivrFlows = ivrFlows;
            return this;
        }
        public java.util.List<ClinkDescribeCdrIbResponseBodyDataCdrIbIvrFlows> getIvrFlows() {
            return this.ivrFlows;
        }

        public ClinkDescribeCdrIbResponseBodyDataCdrIb setIvrName(String ivrName) {
            this.ivrName = ivrName;
            return this;
        }
        public String getIvrName() {
            return this.ivrName;
        }

        public ClinkDescribeCdrIbResponseBodyDataCdrIb setJoinQueueTime(Long joinQueueTime) {
            this.joinQueueTime = joinQueueTime;
            return this;
        }
        public Long getJoinQueueTime() {
            return this.joinQueueTime;
        }

        public ClinkDescribeCdrIbResponseBodyDataCdrIb setLeaveQueueTime(Long leaveQueueTime) {
            this.leaveQueueTime = leaveQueueTime;
            return this;
        }
        public Long getLeaveQueueTime() {
            return this.leaveQueueTime;
        }

        public ClinkDescribeCdrIbResponseBodyDataCdrIb setMark(Long mark) {
            this.mark = mark;
            return this;
        }
        public Long getMark() {
            return this.mark;
        }

        public ClinkDescribeCdrIbResponseBodyDataCdrIb setMarkData(String markData) {
            this.markData = markData;
            return this;
        }
        public String getMarkData() {
            return this.markData;
        }

        public ClinkDescribeCdrIbResponseBodyDataCdrIb setQno(String qno) {
            this.qno = qno;
            return this;
        }
        public String getQno() {
            return this.qno;
        }

        public ClinkDescribeCdrIbResponseBodyDataCdrIb setQueueAnswerInTime(Long queueAnswerInTime) {
            this.queueAnswerInTime = queueAnswerInTime;
            return this;
        }
        public Long getQueueAnswerInTime() {
            return this.queueAnswerInTime;
        }

        public ClinkDescribeCdrIbResponseBodyDataCdrIb setRecordFile(String recordFile) {
            this.recordFile = recordFile;
            return this;
        }
        public String getRecordFile() {
            return this.recordFile;
        }

        public ClinkDescribeCdrIbResponseBodyDataCdrIb setSayVoiceDuration(Long sayVoiceDuration) {
            this.sayVoiceDuration = sayVoiceDuration;
            return this;
        }
        public Long getSayVoiceDuration() {
            return this.sayVoiceDuration;
        }

        public ClinkDescribeCdrIbResponseBodyDataCdrIb setSipCause(String sipCause) {
            this.sipCause = sipCause;
            return this;
        }
        public String getSipCause() {
            return this.sipCause;
        }

        public ClinkDescribeCdrIbResponseBodyDataCdrIb setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public ClinkDescribeCdrIbResponseBodyDataCdrIb setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ClinkDescribeCdrIbResponseBodyDataCdrIb setStatusCode(String statusCode) {
            this.statusCode = statusCode;
            return this;
        }
        public String getStatusCode() {
            return this.statusCode;
        }

        public ClinkDescribeCdrIbResponseBodyDataCdrIb setTagNames(java.util.List<String> tagNames) {
            this.tagNames = tagNames;
            return this;
        }
        public java.util.List<String> getTagNames() {
            return this.tagNames;
        }

        public ClinkDescribeCdrIbResponseBodyDataCdrIb setTags(java.util.List<String> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<String> getTags() {
            return this.tags;
        }

        public ClinkDescribeCdrIbResponseBodyDataCdrIb setTotalDuration(Long totalDuration) {
            this.totalDuration = totalDuration;
            return this;
        }
        public Long getTotalDuration() {
            return this.totalDuration;
        }

        public ClinkDescribeCdrIbResponseBodyDataCdrIb setUniqueId(String uniqueId) {
            this.uniqueId = uniqueId;
            return this;
        }
        public String getUniqueId() {
            return this.uniqueId;
        }

    }

    public static class ClinkDescribeCdrIbResponseBodyData extends TeaModel {
        /**
         * <p>[呼入通话记录] #呼入通话记录</p>
         */
        @NameInMap("CdrIb")
        public ClinkDescribeCdrIbResponseBodyDataCdrIb cdrIb;

        /**
         * <p>请求 id</p>
         * 
         * <strong>example:</strong>
         * <p>xxxx</p>
         */
        @NameInMap("ClinkRequestId")
        public String clinkRequestId;

        public static ClinkDescribeCdrIbResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ClinkDescribeCdrIbResponseBodyData self = new ClinkDescribeCdrIbResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ClinkDescribeCdrIbResponseBodyData setCdrIb(ClinkDescribeCdrIbResponseBodyDataCdrIb cdrIb) {
            this.cdrIb = cdrIb;
            return this;
        }
        public ClinkDescribeCdrIbResponseBodyDataCdrIb getCdrIb() {
            return this.cdrIb;
        }

        public ClinkDescribeCdrIbResponseBodyData setClinkRequestId(String clinkRequestId) {
            this.clinkRequestId = clinkRequestId;
            return this;
        }
        public String getClinkRequestId() {
            return this.clinkRequestId;
        }

    }

}
