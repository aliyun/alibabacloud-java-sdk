// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class ClinkDetailCdrIbResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ClinkDetailCdrIbResponseBodyData data;

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

    public static ClinkDetailCdrIbResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ClinkDetailCdrIbResponseBody self = new ClinkDetailCdrIbResponseBody();
        return TeaModel.build(map, self);
    }

    public ClinkDetailCdrIbResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public ClinkDetailCdrIbResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ClinkDetailCdrIbResponseBody setData(ClinkDetailCdrIbResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ClinkDetailCdrIbResponseBodyData getData() {
        return this.data;
    }

    public ClinkDetailCdrIbResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ClinkDetailCdrIbResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ClinkDetailCdrIbResponseBodyDataCdrIbDetailInvestigation extends TeaModel {
        /**
         * <p>座席名称</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("ClientName")
        public String clientName;

        /**
         * <p>座席号</p>
         * 
         * <strong>example:</strong>
         * <p>11221</p>
         */
        @NameInMap("Cno")
        public String cno;

        /**
         * <p>结束时间</p>
         * 
         * <strong>example:</strong>
         * <p>1731483979</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>满意度导航</p>
         * 
         * <strong>example:</strong>
         * <p>示例值</p>
         */
        @NameInMap("InvestigationName")
        public String investigationName;

        /**
         * <p>按键值</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        @NameInMap("Keys")
        public Long keys;

        /**
         * <p>多按键值</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("MultiKeys")
        public String multiKeys;

        /**
         * <p>开始时间</p>
         * 
         * <strong>example:</strong>
         * <p>1731483974</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        public static ClinkDetailCdrIbResponseBodyDataCdrIbDetailInvestigation build(java.util.Map<String, ?> map) throws Exception {
            ClinkDetailCdrIbResponseBodyDataCdrIbDetailInvestigation self = new ClinkDetailCdrIbResponseBodyDataCdrIbDetailInvestigation();
            return TeaModel.build(map, self);
        }

        public ClinkDetailCdrIbResponseBodyDataCdrIbDetailInvestigation setClientName(String clientName) {
            this.clientName = clientName;
            return this;
        }
        public String getClientName() {
            return this.clientName;
        }

        public ClinkDetailCdrIbResponseBodyDataCdrIbDetailInvestigation setCno(String cno) {
            this.cno = cno;
            return this;
        }
        public String getCno() {
            return this.cno;
        }

        public ClinkDetailCdrIbResponseBodyDataCdrIbDetailInvestigation setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public ClinkDetailCdrIbResponseBodyDataCdrIbDetailInvestigation setInvestigationName(String investigationName) {
            this.investigationName = investigationName;
            return this;
        }
        public String getInvestigationName() {
            return this.investigationName;
        }

        public ClinkDetailCdrIbResponseBodyDataCdrIbDetailInvestigation setKeys(Long keys) {
            this.keys = keys;
            return this;
        }
        public Long getKeys() {
            return this.keys;
        }

        public ClinkDetailCdrIbResponseBodyDataCdrIbDetailInvestigation setMultiKeys(String multiKeys) {
            this.multiKeys = multiKeys;
            return this;
        }
        public String getMultiKeys() {
            return this.multiKeys;
        }

        public ClinkDetailCdrIbResponseBodyDataCdrIbDetailInvestigation setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

    }

    public static class ClinkDetailCdrIbResponseBodyDataCdrIbDetailIvrFlows extends TeaModel {
        /**
         * <p>执行动作</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Action")
        public Long action;

        /**
         * <p>结束时间</p>
         * 
         * <strong>example:</strong>
         * <p>1731483927</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>ivr 名称</p>
         * 
         * <strong>example:</strong>
         * <p>78</p>
         */
        @NameInMap("Name")
        public Long name;

        /**
         * <p>节点 id</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("Path")
        public String path;

        /**
         * <p>节点名称</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("PathName")
        public String pathName;

        /**
         * <p>按键值</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("PressKey")
        public String pressKey;

        /**
         * <p>按键时间</p>
         * 
         * <strong>example:</strong>
         * <p>1731483814</p>
         */
        @NameInMap("PressTime")
        public Long pressTime;

        /**
         * <p>路由结束时间</p>
         * 
         * <strong>example:</strong>
         * <p>1731483897</p>
         */
        @NameInMap("RouterEndTime")
        public Long routerEndTime;

        /**
         * <p>路由名称</p>
         * 
         * <strong>example:</strong>
         * <p>78</p>
         */
        @NameInMap("RouterName")
        public Long routerName;

        /**
         * <p>路由开始时间</p>
         * 
         * <strong>example:</strong>
         * <p>1731483814</p>
         */
        @NameInMap("RouterStartTime")
        public Long routerStartTime;

        /**
         * <p>开始时间</p>
         * 
         * <strong>example:</strong>
         * <p>1731483814</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        public static ClinkDetailCdrIbResponseBodyDataCdrIbDetailIvrFlows build(java.util.Map<String, ?> map) throws Exception {
            ClinkDetailCdrIbResponseBodyDataCdrIbDetailIvrFlows self = new ClinkDetailCdrIbResponseBodyDataCdrIbDetailIvrFlows();
            return TeaModel.build(map, self);
        }

        public ClinkDetailCdrIbResponseBodyDataCdrIbDetailIvrFlows setAction(Long action) {
            this.action = action;
            return this;
        }
        public Long getAction() {
            return this.action;
        }

        public ClinkDetailCdrIbResponseBodyDataCdrIbDetailIvrFlows setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public ClinkDetailCdrIbResponseBodyDataCdrIbDetailIvrFlows setName(Long name) {
            this.name = name;
            return this;
        }
        public Long getName() {
            return this.name;
        }

        public ClinkDetailCdrIbResponseBodyDataCdrIbDetailIvrFlows setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public ClinkDetailCdrIbResponseBodyDataCdrIbDetailIvrFlows setPathName(String pathName) {
            this.pathName = pathName;
            return this;
        }
        public String getPathName() {
            return this.pathName;
        }

        public ClinkDetailCdrIbResponseBodyDataCdrIbDetailIvrFlows setPressKey(String pressKey) {
            this.pressKey = pressKey;
            return this;
        }
        public String getPressKey() {
            return this.pressKey;
        }

        public ClinkDetailCdrIbResponseBodyDataCdrIbDetailIvrFlows setPressTime(Long pressTime) {
            this.pressTime = pressTime;
            return this;
        }
        public Long getPressTime() {
            return this.pressTime;
        }

        public ClinkDetailCdrIbResponseBodyDataCdrIbDetailIvrFlows setRouterEndTime(Long routerEndTime) {
            this.routerEndTime = routerEndTime;
            return this;
        }
        public Long getRouterEndTime() {
            return this.routerEndTime;
        }

        public ClinkDetailCdrIbResponseBodyDataCdrIbDetailIvrFlows setRouterName(Long routerName) {
            this.routerName = routerName;
            return this;
        }
        public Long getRouterName() {
            return this.routerName;
        }

        public ClinkDetailCdrIbResponseBodyDataCdrIbDetailIvrFlows setRouterStartTime(Long routerStartTime) {
            this.routerStartTime = routerStartTime;
            return this;
        }
        public Long getRouterStartTime() {
            return this.routerStartTime;
        }

        public ClinkDetailCdrIbResponseBodyDataCdrIbDetailIvrFlows setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

    }

    public static class ClinkDetailCdrIbResponseBodyDataCdrIbDetail extends TeaModel {
        /**
         * <p>首次及时应答</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
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
         * <p>17</p>
         */
        @NameInMap("BridgeDuration")
        public Long bridgeDuration;

        /**
         * <p>首次接听时间</p>
         * 
         * <strong>example:</strong>
         * <p>1713848599</p>
         */
        @NameInMap("BridgeTime")
        public Long bridgeTime;

        /**
         * <p>CallID</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("CallId")
        public String callId;

        /**
         * <p>客户号码城市</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值示例值</p>
         */
        @NameInMap("CustomerCity")
        public String customerCity;

        /**
         * <p>客户号码</p>
         * 
         * <strong>example:</strong>
         * <p>138xxxx8888</p>
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
         * <p>示例值</p>
         */
        @NameInMap("CustomerProvince")
        public String customerProvince;

        /**
         * <p>结束时间</p>
         * 
         * <strong>example:</strong>
         * <p>1713848599</p>
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
         * <p>zhangsan</p>
         */
        @NameInMap("FirstCallCname")
        public String firstCallCname;

        /**
         * <p>首呼座席工号</p>
         * 
         * <strong>example:</strong>
         * <p>2233</p>
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
         * <p>xxx</p>
         */
        @NameInMap("FirstCallQname")
        public String firstCallQname;

        /**
         * <p>首呼队列号</p>
         * 
         * <strong>example:</strong>
         * <p>223</p>
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
         * <p>1713848595</p>
         */
        @NameInMap("FirstLeaveQueueTime")
        public Long firstLeaveQueueTime;

        /**
         * <p>首呼队列排队时长</p>
         * 
         * <strong>example:</strong>
         * <p>12233</p>
         */
        @NameInMap("FirstQueueDuration")
        public Long firstQueueDuration;

        /**
         * <p>热线号码</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("Hotline")
        public String hotline;

        /**
         * <p>热线别名</p>
         * 
         * <strong>example:</strong>
         * <p>hotline3</p>
         */
        @NameInMap("HotlineName")
        public String hotlineName;

        /**
         * <p>[满意度记录] #满意度记录</p>
         */
        @NameInMap("Investigation")
        public ClinkDetailCdrIbResponseBodyDataCdrIbDetailInvestigation investigation;

        /**
         * <p>满意度评价</p>
         * 
         * <strong>example:</strong>
         * <p>38</p>
         */
        @NameInMap("InvestigationKeys")
        public Long investigationKeys;

        /**
         * <p>[路由和IVR] #路由和IVR</p>
         */
        @NameInMap("IvrFlows")
        public java.util.List<ClinkDetailCdrIbResponseBodyDataCdrIbDetailIvrFlows> ivrFlows;

        /**
         * <p>IVR名称</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
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
         * <p>mark</p>
         */
        @NameInMap("MarkData")
        public String markData;

        /**
         * <p>挂断方</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("OnHookSource")
        public String onHookSource;

        /**
         * <p>录音文件</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("RecordFile")
        public String recordFile;

        /**
         * <p>rtcUid</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("RtcUid")
        public String rtcUid;

        /**
         * <p>语音播报时长</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
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
         * <p>示例值示例值</p>
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
         * <p>总时长</p>
         * 
         * <strong>example:</strong>
         * <p>98</p>
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
         * <p>null</p>
         */
        @NameInMap("WebrtcCallId")
        public String webrtcCallId;

        /**
         * <p>虚拟号码</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("Xnumber")
        public String xnumber;

        public static ClinkDetailCdrIbResponseBodyDataCdrIbDetail build(java.util.Map<String, ?> map) throws Exception {
            ClinkDetailCdrIbResponseBodyDataCdrIbDetail self = new ClinkDetailCdrIbResponseBodyDataCdrIbDetail();
            return TeaModel.build(map, self);
        }

        public ClinkDetailCdrIbResponseBodyDataCdrIbDetail setAgentAnswerInTime(String agentAnswerInTime) {
            this.agentAnswerInTime = agentAnswerInTime;
            return this;
        }
        public String getAgentAnswerInTime() {
            return this.agentAnswerInTime;
        }

        public ClinkDetailCdrIbResponseBodyDataCdrIbDetail setBindType(Long bindType) {
            this.bindType = bindType;
            return this;
        }
        public Long getBindType() {
            return this.bindType;
        }

        public ClinkDetailCdrIbResponseBodyDataCdrIbDetail setBridgeDuration(Long bridgeDuration) {
            this.bridgeDuration = bridgeDuration;
            return this;
        }
        public Long getBridgeDuration() {
            return this.bridgeDuration;
        }

        public ClinkDetailCdrIbResponseBodyDataCdrIbDetail setBridgeTime(Long bridgeTime) {
            this.bridgeTime = bridgeTime;
            return this;
        }
        public Long getBridgeTime() {
            return this.bridgeTime;
        }

        public ClinkDetailCdrIbResponseBodyDataCdrIbDetail setCallId(String callId) {
            this.callId = callId;
            return this;
        }
        public String getCallId() {
            return this.callId;
        }

        public ClinkDetailCdrIbResponseBodyDataCdrIbDetail setCustomerCity(String customerCity) {
            this.customerCity = customerCity;
            return this;
        }
        public String getCustomerCity() {
            return this.customerCity;
        }

        public ClinkDetailCdrIbResponseBodyDataCdrIbDetail setCustomerNumber(String customerNumber) {
            this.customerNumber = customerNumber;
            return this;
        }
        public String getCustomerNumber() {
            return this.customerNumber;
        }

        public ClinkDetailCdrIbResponseBodyDataCdrIbDetail setCustomerNumberEncrypt(String customerNumberEncrypt) {
            this.customerNumberEncrypt = customerNumberEncrypt;
            return this;
        }
        public String getCustomerNumberEncrypt() {
            return this.customerNumberEncrypt;
        }

        public ClinkDetailCdrIbResponseBodyDataCdrIbDetail setCustomerProvince(String customerProvince) {
            this.customerProvince = customerProvince;
            return this;
        }
        public String getCustomerProvince() {
            return this.customerProvince;
        }

        public ClinkDetailCdrIbResponseBodyDataCdrIbDetail setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public ClinkDetailCdrIbResponseBodyDataCdrIbDetail setEvaluation(String evaluation) {
            this.evaluation = evaluation;
            return this;
        }
        public String getEvaluation() {
            return this.evaluation;
        }

        public ClinkDetailCdrIbResponseBodyDataCdrIbDetail setFirstCallCname(String firstCallCname) {
            this.firstCallCname = firstCallCname;
            return this;
        }
        public String getFirstCallCname() {
            return this.firstCallCname;
        }

        public ClinkDetailCdrIbResponseBodyDataCdrIbDetail setFirstCallCno(String firstCallCno) {
            this.firstCallCno = firstCallCno;
            return this;
        }
        public String getFirstCallCno() {
            return this.firstCallCno;
        }

        public ClinkDetailCdrIbResponseBodyDataCdrIbDetail setFirstCallNumber(String firstCallNumber) {
            this.firstCallNumber = firstCallNumber;
            return this;
        }
        public String getFirstCallNumber() {
            return this.firstCallNumber;
        }

        public ClinkDetailCdrIbResponseBodyDataCdrIbDetail setFirstCallQname(String firstCallQname) {
            this.firstCallQname = firstCallQname;
            return this;
        }
        public String getFirstCallQname() {
            return this.firstCallQname;
        }

        public ClinkDetailCdrIbResponseBodyDataCdrIbDetail setFirstCallQno(String firstCallQno) {
            this.firstCallQno = firstCallQno;
            return this;
        }
        public String getFirstCallQno() {
            return this.firstCallQno;
        }

        public ClinkDetailCdrIbResponseBodyDataCdrIbDetail setFirstJoinQueueTime(Long firstJoinQueueTime) {
            this.firstJoinQueueTime = firstJoinQueueTime;
            return this;
        }
        public Long getFirstJoinQueueTime() {
            return this.firstJoinQueueTime;
        }

        public ClinkDetailCdrIbResponseBodyDataCdrIbDetail setFirstLeaveQueueTime(Long firstLeaveQueueTime) {
            this.firstLeaveQueueTime = firstLeaveQueueTime;
            return this;
        }
        public Long getFirstLeaveQueueTime() {
            return this.firstLeaveQueueTime;
        }

        public ClinkDetailCdrIbResponseBodyDataCdrIbDetail setFirstQueueDuration(Long firstQueueDuration) {
            this.firstQueueDuration = firstQueueDuration;
            return this;
        }
        public Long getFirstQueueDuration() {
            return this.firstQueueDuration;
        }

        public ClinkDetailCdrIbResponseBodyDataCdrIbDetail setHotline(String hotline) {
            this.hotline = hotline;
            return this;
        }
        public String getHotline() {
            return this.hotline;
        }

        public ClinkDetailCdrIbResponseBodyDataCdrIbDetail setHotlineName(String hotlineName) {
            this.hotlineName = hotlineName;
            return this;
        }
        public String getHotlineName() {
            return this.hotlineName;
        }

        public ClinkDetailCdrIbResponseBodyDataCdrIbDetail setInvestigation(ClinkDetailCdrIbResponseBodyDataCdrIbDetailInvestigation investigation) {
            this.investigation = investigation;
            return this;
        }
        public ClinkDetailCdrIbResponseBodyDataCdrIbDetailInvestigation getInvestigation() {
            return this.investigation;
        }

        public ClinkDetailCdrIbResponseBodyDataCdrIbDetail setInvestigationKeys(Long investigationKeys) {
            this.investigationKeys = investigationKeys;
            return this;
        }
        public Long getInvestigationKeys() {
            return this.investigationKeys;
        }

        public ClinkDetailCdrIbResponseBodyDataCdrIbDetail setIvrFlows(java.util.List<ClinkDetailCdrIbResponseBodyDataCdrIbDetailIvrFlows> ivrFlows) {
            this.ivrFlows = ivrFlows;
            return this;
        }
        public java.util.List<ClinkDetailCdrIbResponseBodyDataCdrIbDetailIvrFlows> getIvrFlows() {
            return this.ivrFlows;
        }

        public ClinkDetailCdrIbResponseBodyDataCdrIbDetail setIvrName(String ivrName) {
            this.ivrName = ivrName;
            return this;
        }
        public String getIvrName() {
            return this.ivrName;
        }

        public ClinkDetailCdrIbResponseBodyDataCdrIbDetail setMainUniqueId(String mainUniqueId) {
            this.mainUniqueId = mainUniqueId;
            return this;
        }
        public String getMainUniqueId() {
            return this.mainUniqueId;
        }

        public ClinkDetailCdrIbResponseBodyDataCdrIbDetail setMarkData(String markData) {
            this.markData = markData;
            return this;
        }
        public String getMarkData() {
            return this.markData;
        }

        public ClinkDetailCdrIbResponseBodyDataCdrIbDetail setOnHookSource(String onHookSource) {
            this.onHookSource = onHookSource;
            return this;
        }
        public String getOnHookSource() {
            return this.onHookSource;
        }

        public ClinkDetailCdrIbResponseBodyDataCdrIbDetail setRecordFile(String recordFile) {
            this.recordFile = recordFile;
            return this;
        }
        public String getRecordFile() {
            return this.recordFile;
        }

        public ClinkDetailCdrIbResponseBodyDataCdrIbDetail setRtcUid(String rtcUid) {
            this.rtcUid = rtcUid;
            return this;
        }
        public String getRtcUid() {
            return this.rtcUid;
        }

        public ClinkDetailCdrIbResponseBodyDataCdrIbDetail setSayVoiceDuration(Long sayVoiceDuration) {
            this.sayVoiceDuration = sayVoiceDuration;
            return this;
        }
        public Long getSayVoiceDuration() {
            return this.sayVoiceDuration;
        }

        public ClinkDetailCdrIbResponseBodyDataCdrIbDetail setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public ClinkDetailCdrIbResponseBodyDataCdrIbDetail setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ClinkDetailCdrIbResponseBodyDataCdrIbDetail setStatusResult(String statusResult) {
            this.statusResult = statusResult;
            return this;
        }
        public String getStatusResult() {
            return this.statusResult;
        }

        public ClinkDetailCdrIbResponseBodyDataCdrIbDetail setStatusRobot(String statusRobot) {
            this.statusRobot = statusRobot;
            return this;
        }
        public String getStatusRobot() {
            return this.statusRobot;
        }

        public ClinkDetailCdrIbResponseBodyDataCdrIbDetail setTagNames(java.util.List<String> tagNames) {
            this.tagNames = tagNames;
            return this;
        }
        public java.util.List<String> getTagNames() {
            return this.tagNames;
        }

        public ClinkDetailCdrIbResponseBodyDataCdrIbDetail setTotalDuration(Long totalDuration) {
            this.totalDuration = totalDuration;
            return this;
        }
        public Long getTotalDuration() {
            return this.totalDuration;
        }

        public ClinkDetailCdrIbResponseBodyDataCdrIbDetail setUserField(String userField) {
            this.userField = userField;
            return this;
        }
        public String getUserField() {
            return this.userField;
        }

        public ClinkDetailCdrIbResponseBodyDataCdrIbDetail setWebrtcCallId(String webrtcCallId) {
            this.webrtcCallId = webrtcCallId;
            return this;
        }
        public String getWebrtcCallId() {
            return this.webrtcCallId;
        }

        public ClinkDetailCdrIbResponseBodyDataCdrIbDetail setXnumber(String xnumber) {
            this.xnumber = xnumber;
            return this;
        }
        public String getXnumber() {
            return this.xnumber;
        }

    }

    public static class ClinkDetailCdrIbResponseBodyData extends TeaModel {
        /**
         * <p>[客户来电记录详情] #客户来电记录详情</p>
         */
        @NameInMap("CdrIbDetail")
        public java.util.List<ClinkDetailCdrIbResponseBodyDataCdrIbDetail> cdrIbDetail;

        /**
         * <p>请求 id</p>
         * 
         * <strong>example:</strong>
         * <p>示例值</p>
         */
        @NameInMap("ClinkRequestId")
        public String clinkRequestId;

        public static ClinkDetailCdrIbResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ClinkDetailCdrIbResponseBodyData self = new ClinkDetailCdrIbResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ClinkDetailCdrIbResponseBodyData setCdrIbDetail(java.util.List<ClinkDetailCdrIbResponseBodyDataCdrIbDetail> cdrIbDetail) {
            this.cdrIbDetail = cdrIbDetail;
            return this;
        }
        public java.util.List<ClinkDetailCdrIbResponseBodyDataCdrIbDetail> getCdrIbDetail() {
            return this.cdrIbDetail;
        }

        public ClinkDetailCdrIbResponseBodyData setClinkRequestId(String clinkRequestId) {
            this.clinkRequestId = clinkRequestId;
            return this;
        }
        public String getClinkRequestId() {
            return this.clinkRequestId;
        }

    }

}
