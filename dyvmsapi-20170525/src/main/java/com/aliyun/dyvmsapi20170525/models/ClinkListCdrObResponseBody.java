// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class ClinkListCdrObResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ClinkListCdrObResponseBodyData data;

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

    public static ClinkListCdrObResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ClinkListCdrObResponseBody self = new ClinkListCdrObResponseBody();
        return TeaModel.build(map, self);
    }

    public ClinkListCdrObResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public ClinkListCdrObResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ClinkListCdrObResponseBody setData(ClinkListCdrObResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ClinkListCdrObResponseBodyData getData() {
        return this.data;
    }

    public ClinkListCdrObResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ClinkListCdrObResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ClinkListCdrObResponseBodyDataCdrOb extends TeaModel {
        /**
         * <p>转写记录标识 1：存在，0：不存在</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AsrRecord")
        public Long asrRecord;

        /**
         * <p>通话时长</p>
         * 
         * <strong>example:</strong>
         * <p>76</p>
         */
        @NameInMap("BridgeDuration")
        public Long bridgeDuration;

        /**
         * <p>客户接听时间</p>
         * 
         * <strong>example:</strong>
         * <p>1715326248</p>
         */
        @NameInMap("BridgeTime")
        public Long bridgeTime;

        /**
         * <p>业务记录ID</p>
         */
        @NameInMap("BusinessIds")
        public java.util.List<Long> businessIds;

        /**
         * <p>CallID</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("CallId")
        public String callId;

        /**
         * <p>通话类型</p>
         * 
         * <strong>example:</strong>
         * <p>示例值</p>
         */
        @NameInMap("CallType")
        public String callType;

        /**
         * <p>通话类型Key值</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("CallTypeKey")
        public Long callTypeKey;

        /**
         * <p>客户响铃时长</p>
         * 
         * <strong>example:</strong>
         * <p>29</p>
         */
        @NameInMap("CalleeRingingDuration")
        public Long calleeRingingDuration;

        /**
         * <p>客户响铃时间</p>
         * 
         * <strong>example:</strong>
         * <p>1715326251</p>
         */
        @NameInMap("CalleeRingingTime")
        public Long calleeRingingTime;

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
         * <p>座席工号</p>
         * 
         * <strong>example:</strong>
         * <p>1111</p>
         */
        @NameInMap("Cno")
        public String cno;

        /**
         * <p>客户地区，省份/城市</p>
         * 
         * <strong>example:</strong>
         * <p>示例值</p>
         */
        @NameInMap("CustomerArea")
        public String customerArea;

        /**
         * <p>客户号码区号</p>
         * 
         * <strong>example:</strong>
         * <p>010</p>
         */
        @NameInMap("CustomerAreaCode")
        public String customerAreaCode;

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
         * <p>追加客户邮编</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("CustomerPostCode")
        public String customerPostCode;

        /**
         * <p>客户号码省份</p>
         * 
         * <strong>example:</strong>
         * <p>示例值</p>
         */
        @NameInMap("CustomerProvince")
        public String customerProvince;

        /**
         * <p>客户VIP标识</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CustomerVip")
        public Long customerVip;

        /**
         * <p>结束时间</p>
         * 
         * <strong>example:</strong>
         * <p>1715326248</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>企业号</p>
         * 
         * <strong>example:</strong>
         * <p>8004970</p>
         */
        @NameInMap("EnterpriseId")
        public Long enterpriseId;

        /**
         * <p>是否邀评</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Evaluation")
        public String evaluation;

        /**
         * <p>是否存在业务记录</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ExistBusiness")
        public Long existBusiness;

        /**
         * <p>是否存在客户资料</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ExistCustomer")
        public Boolean existCustomer;

        /**
         * <p>是否存在工单</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ExistTicket")
        public Long existTicket;

        /**
         * <p>满意度评价</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("InvestigationKeys")
        public Long investigationKeys;

        /**
         * <p>外显号码</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("LeftClid")
        public String leftClid;

        /**
         * <p>外显号码归属地区，省份/城市</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("LeftClidArea")
        public String leftClidArea;

        /**
         * <p>外显号码归属城市</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值示例值</p>
         */
        @NameInMap("LeftClidCity")
        public String leftClidCity;

        /**
         * <p>外显号码归属省份</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("LeftClidProvince")
        public String leftClidProvince;

        /**
         * <p>通话ID</p>
         * 
         * <strong>example:</strong>
         * <p>medias_1-171532xxxx.53</p>
         */
        @NameInMap("MainUniqueId")
        public String mainUniqueId;

        /**
         * <p>备注</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("MarkData")
        public String markData;

        /**
         * <p>呼叫结果</p>
         * 
         * <strong>example:</strong>
         * <p>示例值</p>
         */
        @NameInMap("ObSipCause")
        public String obSipCause;

        /**
         * <p>被叫状态</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值示例值</p>
         */
        @NameInMap("ObSipCauseRaw")
        public String obSipCauseRaw;

        /**
         * <p>外呼等待时长</p>
         * 
         * <strong>example:</strong>
         * <p>24</p>
         */
        @NameInMap("ObWaitDuration")
        public Long obWaitDuration;

        /**
         * <p>挂断方</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("OnHookSource")
        public String onHookSource;

        /**
         * <p>响铃前等待时长</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PreRingWaitDuration")
        public Long preRingWaitDuration;

        /**
         * <p>录音文件</p>
         * 
         * <strong>example:</strong>
         * <p>RecordFile</p>
         */
        @NameInMap("RecordFile")
        public String recordFile;

        /**
         * <p>通话唯一ID</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("RequestUniqueId")
        public String requestUniqueId;

        /**
         * <p>RtcUid</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("RtcUid")
        public String rtcUid;

        /**
         * <p>开始时间</p>
         * 
         * <strong>example:</strong>
         * <p>1715326248</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        /**
         * <p>接听状态值</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Status")
        public Long status;

        /**
         * <p>接听状态描述</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("StatusDesc")
        public String statusDesc;

        /**
         * <p>通话标签</p>
         */
        @NameInMap("TagNames")
        public java.util.List<String> tagNames;

        /**
         * <p>外呼任务id</p>
         * 
         * <strong>example:</strong>
         * <p>85</p>
         */
        @NameInMap("TaskId")
        public Long taskId;

        /**
         * <p>外呼任务详情id</p>
         * 
         * <strong>example:</strong>
         * <p>83</p>
         */
        @NameInMap("TaskInventoryId")
        public Long taskInventoryId;

        /**
         * <p>外呼任务名称</p>
         * 
         * <strong>example:</strong>
         * <p>TaskName</p>
         */
        @NameInMap("TaskName")
        public String taskName;

        /**
         * <p>工单id</p>
         */
        @NameInMap("TicketIds")
        public java.util.List<Long> ticketIds;

        /**
         * <p>总时长</p>
         * 
         * <strong>example:</strong>
         * <p>27</p>
         */
        @NameInMap("TotalDuration")
        public Long totalDuration;

        /**
         * <p>中继组号</p>
         * 
         * <strong>example:</strong>
         * <p>10088</p>
         */
        @NameInMap("TrunkGroupKey")
        public String trunkGroupKey;

        /**
         * <p>座席接起时间</p>
         * 
         * <strong>example:</strong>
         * <p>1715326251</p>
         */
        @NameInMap("UpTime")
        public Long upTime;

        /**
         * <p>WebRTCCallID</p>
         * 
         * <strong>example:</strong>
         * <p>xxxx</p>
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

        /**
         * <p>虚拟号码归属地区，省份/城市</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("XnumberArea")
        public String xnumberArea;

        /**
         * <p>虚拟号码归属城市</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("XnumberCity")
        public String xnumberCity;

        /**
         * <p>虚拟号码归属省份</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("XnumberProvince")
        public String xnumberProvince;

        public static ClinkListCdrObResponseBodyDataCdrOb build(java.util.Map<String, ?> map) throws Exception {
            ClinkListCdrObResponseBodyDataCdrOb self = new ClinkListCdrObResponseBodyDataCdrOb();
            return TeaModel.build(map, self);
        }

        public ClinkListCdrObResponseBodyDataCdrOb setAsrRecord(Long asrRecord) {
            this.asrRecord = asrRecord;
            return this;
        }
        public Long getAsrRecord() {
            return this.asrRecord;
        }

        public ClinkListCdrObResponseBodyDataCdrOb setBridgeDuration(Long bridgeDuration) {
            this.bridgeDuration = bridgeDuration;
            return this;
        }
        public Long getBridgeDuration() {
            return this.bridgeDuration;
        }

        public ClinkListCdrObResponseBodyDataCdrOb setBridgeTime(Long bridgeTime) {
            this.bridgeTime = bridgeTime;
            return this;
        }
        public Long getBridgeTime() {
            return this.bridgeTime;
        }

        public ClinkListCdrObResponseBodyDataCdrOb setBusinessIds(java.util.List<Long> businessIds) {
            this.businessIds = businessIds;
            return this;
        }
        public java.util.List<Long> getBusinessIds() {
            return this.businessIds;
        }

        public ClinkListCdrObResponseBodyDataCdrOb setCallId(String callId) {
            this.callId = callId;
            return this;
        }
        public String getCallId() {
            return this.callId;
        }

        public ClinkListCdrObResponseBodyDataCdrOb setCallType(String callType) {
            this.callType = callType;
            return this;
        }
        public String getCallType() {
            return this.callType;
        }

        public ClinkListCdrObResponseBodyDataCdrOb setCallTypeKey(Long callTypeKey) {
            this.callTypeKey = callTypeKey;
            return this;
        }
        public Long getCallTypeKey() {
            return this.callTypeKey;
        }

        public ClinkListCdrObResponseBodyDataCdrOb setCalleeRingingDuration(Long calleeRingingDuration) {
            this.calleeRingingDuration = calleeRingingDuration;
            return this;
        }
        public Long getCalleeRingingDuration() {
            return this.calleeRingingDuration;
        }

        public ClinkListCdrObResponseBodyDataCdrOb setCalleeRingingTime(Long calleeRingingTime) {
            this.calleeRingingTime = calleeRingingTime;
            return this;
        }
        public Long getCalleeRingingTime() {
            return this.calleeRingingTime;
        }

        public ClinkListCdrObResponseBodyDataCdrOb setClientName(String clientName) {
            this.clientName = clientName;
            return this;
        }
        public String getClientName() {
            return this.clientName;
        }

        public ClinkListCdrObResponseBodyDataCdrOb setClientNumber(String clientNumber) {
            this.clientNumber = clientNumber;
            return this;
        }
        public String getClientNumber() {
            return this.clientNumber;
        }

        public ClinkListCdrObResponseBodyDataCdrOb setCno(String cno) {
            this.cno = cno;
            return this;
        }
        public String getCno() {
            return this.cno;
        }

        public ClinkListCdrObResponseBodyDataCdrOb setCustomerArea(String customerArea) {
            this.customerArea = customerArea;
            return this;
        }
        public String getCustomerArea() {
            return this.customerArea;
        }

        public ClinkListCdrObResponseBodyDataCdrOb setCustomerAreaCode(String customerAreaCode) {
            this.customerAreaCode = customerAreaCode;
            return this;
        }
        public String getCustomerAreaCode() {
            return this.customerAreaCode;
        }

        public ClinkListCdrObResponseBodyDataCdrOb setCustomerCity(String customerCity) {
            this.customerCity = customerCity;
            return this;
        }
        public String getCustomerCity() {
            return this.customerCity;
        }

        public ClinkListCdrObResponseBodyDataCdrOb setCustomerNumber(String customerNumber) {
            this.customerNumber = customerNumber;
            return this;
        }
        public String getCustomerNumber() {
            return this.customerNumber;
        }

        public ClinkListCdrObResponseBodyDataCdrOb setCustomerNumberEncrypt(String customerNumberEncrypt) {
            this.customerNumberEncrypt = customerNumberEncrypt;
            return this;
        }
        public String getCustomerNumberEncrypt() {
            return this.customerNumberEncrypt;
        }

        public ClinkListCdrObResponseBodyDataCdrOb setCustomerPostCode(String customerPostCode) {
            this.customerPostCode = customerPostCode;
            return this;
        }
        public String getCustomerPostCode() {
            return this.customerPostCode;
        }

        public ClinkListCdrObResponseBodyDataCdrOb setCustomerProvince(String customerProvince) {
            this.customerProvince = customerProvince;
            return this;
        }
        public String getCustomerProvince() {
            return this.customerProvince;
        }

        public ClinkListCdrObResponseBodyDataCdrOb setCustomerVip(Long customerVip) {
            this.customerVip = customerVip;
            return this;
        }
        public Long getCustomerVip() {
            return this.customerVip;
        }

        public ClinkListCdrObResponseBodyDataCdrOb setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public ClinkListCdrObResponseBodyDataCdrOb setEnterpriseId(Long enterpriseId) {
            this.enterpriseId = enterpriseId;
            return this;
        }
        public Long getEnterpriseId() {
            return this.enterpriseId;
        }

        public ClinkListCdrObResponseBodyDataCdrOb setEvaluation(String evaluation) {
            this.evaluation = evaluation;
            return this;
        }
        public String getEvaluation() {
            return this.evaluation;
        }

        public ClinkListCdrObResponseBodyDataCdrOb setExistBusiness(Long existBusiness) {
            this.existBusiness = existBusiness;
            return this;
        }
        public Long getExistBusiness() {
            return this.existBusiness;
        }

        public ClinkListCdrObResponseBodyDataCdrOb setExistCustomer(Boolean existCustomer) {
            this.existCustomer = existCustomer;
            return this;
        }
        public Boolean getExistCustomer() {
            return this.existCustomer;
        }

        public ClinkListCdrObResponseBodyDataCdrOb setExistTicket(Long existTicket) {
            this.existTicket = existTicket;
            return this;
        }
        public Long getExistTicket() {
            return this.existTicket;
        }

        public ClinkListCdrObResponseBodyDataCdrOb setInvestigationKeys(Long investigationKeys) {
            this.investigationKeys = investigationKeys;
            return this;
        }
        public Long getInvestigationKeys() {
            return this.investigationKeys;
        }

        public ClinkListCdrObResponseBodyDataCdrOb setLeftClid(String leftClid) {
            this.leftClid = leftClid;
            return this;
        }
        public String getLeftClid() {
            return this.leftClid;
        }

        public ClinkListCdrObResponseBodyDataCdrOb setLeftClidArea(String leftClidArea) {
            this.leftClidArea = leftClidArea;
            return this;
        }
        public String getLeftClidArea() {
            return this.leftClidArea;
        }

        public ClinkListCdrObResponseBodyDataCdrOb setLeftClidCity(String leftClidCity) {
            this.leftClidCity = leftClidCity;
            return this;
        }
        public String getLeftClidCity() {
            return this.leftClidCity;
        }

        public ClinkListCdrObResponseBodyDataCdrOb setLeftClidProvince(String leftClidProvince) {
            this.leftClidProvince = leftClidProvince;
            return this;
        }
        public String getLeftClidProvince() {
            return this.leftClidProvince;
        }

        public ClinkListCdrObResponseBodyDataCdrOb setMainUniqueId(String mainUniqueId) {
            this.mainUniqueId = mainUniqueId;
            return this;
        }
        public String getMainUniqueId() {
            return this.mainUniqueId;
        }

        public ClinkListCdrObResponseBodyDataCdrOb setMarkData(String markData) {
            this.markData = markData;
            return this;
        }
        public String getMarkData() {
            return this.markData;
        }

        public ClinkListCdrObResponseBodyDataCdrOb setObSipCause(String obSipCause) {
            this.obSipCause = obSipCause;
            return this;
        }
        public String getObSipCause() {
            return this.obSipCause;
        }

        public ClinkListCdrObResponseBodyDataCdrOb setObSipCauseRaw(String obSipCauseRaw) {
            this.obSipCauseRaw = obSipCauseRaw;
            return this;
        }
        public String getObSipCauseRaw() {
            return this.obSipCauseRaw;
        }

        public ClinkListCdrObResponseBodyDataCdrOb setObWaitDuration(Long obWaitDuration) {
            this.obWaitDuration = obWaitDuration;
            return this;
        }
        public Long getObWaitDuration() {
            return this.obWaitDuration;
        }

        public ClinkListCdrObResponseBodyDataCdrOb setOnHookSource(String onHookSource) {
            this.onHookSource = onHookSource;
            return this;
        }
        public String getOnHookSource() {
            return this.onHookSource;
        }

        public ClinkListCdrObResponseBodyDataCdrOb setPreRingWaitDuration(Long preRingWaitDuration) {
            this.preRingWaitDuration = preRingWaitDuration;
            return this;
        }
        public Long getPreRingWaitDuration() {
            return this.preRingWaitDuration;
        }

        public ClinkListCdrObResponseBodyDataCdrOb setRecordFile(String recordFile) {
            this.recordFile = recordFile;
            return this;
        }
        public String getRecordFile() {
            return this.recordFile;
        }

        public ClinkListCdrObResponseBodyDataCdrOb setRequestUniqueId(String requestUniqueId) {
            this.requestUniqueId = requestUniqueId;
            return this;
        }
        public String getRequestUniqueId() {
            return this.requestUniqueId;
        }

        public ClinkListCdrObResponseBodyDataCdrOb setRtcUid(String rtcUid) {
            this.rtcUid = rtcUid;
            return this;
        }
        public String getRtcUid() {
            return this.rtcUid;
        }

        public ClinkListCdrObResponseBodyDataCdrOb setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public ClinkListCdrObResponseBodyDataCdrOb setStatus(Long status) {
            this.status = status;
            return this;
        }
        public Long getStatus() {
            return this.status;
        }

        public ClinkListCdrObResponseBodyDataCdrOb setStatusDesc(String statusDesc) {
            this.statusDesc = statusDesc;
            return this;
        }
        public String getStatusDesc() {
            return this.statusDesc;
        }

        public ClinkListCdrObResponseBodyDataCdrOb setTagNames(java.util.List<String> tagNames) {
            this.tagNames = tagNames;
            return this;
        }
        public java.util.List<String> getTagNames() {
            return this.tagNames;
        }

        public ClinkListCdrObResponseBodyDataCdrOb setTaskId(Long taskId) {
            this.taskId = taskId;
            return this;
        }
        public Long getTaskId() {
            return this.taskId;
        }

        public ClinkListCdrObResponseBodyDataCdrOb setTaskInventoryId(Long taskInventoryId) {
            this.taskInventoryId = taskInventoryId;
            return this;
        }
        public Long getTaskInventoryId() {
            return this.taskInventoryId;
        }

        public ClinkListCdrObResponseBodyDataCdrOb setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

        public ClinkListCdrObResponseBodyDataCdrOb setTicketIds(java.util.List<Long> ticketIds) {
            this.ticketIds = ticketIds;
            return this;
        }
        public java.util.List<Long> getTicketIds() {
            return this.ticketIds;
        }

        public ClinkListCdrObResponseBodyDataCdrOb setTotalDuration(Long totalDuration) {
            this.totalDuration = totalDuration;
            return this;
        }
        public Long getTotalDuration() {
            return this.totalDuration;
        }

        public ClinkListCdrObResponseBodyDataCdrOb setTrunkGroupKey(String trunkGroupKey) {
            this.trunkGroupKey = trunkGroupKey;
            return this;
        }
        public String getTrunkGroupKey() {
            return this.trunkGroupKey;
        }

        public ClinkListCdrObResponseBodyDataCdrOb setUpTime(Long upTime) {
            this.upTime = upTime;
            return this;
        }
        public Long getUpTime() {
            return this.upTime;
        }

        public ClinkListCdrObResponseBodyDataCdrOb setWebrtcCallId(String webrtcCallId) {
            this.webrtcCallId = webrtcCallId;
            return this;
        }
        public String getWebrtcCallId() {
            return this.webrtcCallId;
        }

        public ClinkListCdrObResponseBodyDataCdrOb setXnumber(String xnumber) {
            this.xnumber = xnumber;
            return this;
        }
        public String getXnumber() {
            return this.xnumber;
        }

        public ClinkListCdrObResponseBodyDataCdrOb setXnumberArea(String xnumberArea) {
            this.xnumberArea = xnumberArea;
            return this;
        }
        public String getXnumberArea() {
            return this.xnumberArea;
        }

        public ClinkListCdrObResponseBodyDataCdrOb setXnumberCity(String xnumberCity) {
            this.xnumberCity = xnumberCity;
            return this;
        }
        public String getXnumberCity() {
            return this.xnumberCity;
        }

        public ClinkListCdrObResponseBodyDataCdrOb setXnumberProvince(String xnumberProvince) {
            this.xnumberProvince = xnumberProvince;
            return this;
        }
        public String getXnumberProvince() {
            return this.xnumberProvince;
        }

    }

    public static class ClinkListCdrObResponseBodyData extends TeaModel {
        /**
         * <p>[外呼记录列表] #外呼记录列表</p>
         */
        @NameInMap("CdrOb")
        public java.util.List<ClinkListCdrObResponseBodyDataCdrOb> cdrOb;

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
         * <p>100</p>
         */
        @NameInMap("PageSize")
        public Long pageSize;

        /**
         * <p>滚动查询ID</p>
         * 
         * <strong>example:</strong>
         * <p>ScrollId</p>
         */
        @NameInMap("ScrollId")
        public String scrollId;

        /**
         * <p>总条数</p>
         * 
         * <strong>example:</strong>
         * <p>31</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        public static ClinkListCdrObResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ClinkListCdrObResponseBodyData self = new ClinkListCdrObResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ClinkListCdrObResponseBodyData setCdrOb(java.util.List<ClinkListCdrObResponseBodyDataCdrOb> cdrOb) {
            this.cdrOb = cdrOb;
            return this;
        }
        public java.util.List<ClinkListCdrObResponseBodyDataCdrOb> getCdrOb() {
            return this.cdrOb;
        }

        public ClinkListCdrObResponseBodyData setClinkRequestId(String clinkRequestId) {
            this.clinkRequestId = clinkRequestId;
            return this;
        }
        public String getClinkRequestId() {
            return this.clinkRequestId;
        }

        public ClinkListCdrObResponseBodyData setPageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Long getPageNumber() {
            return this.pageNumber;
        }

        public ClinkListCdrObResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public ClinkListCdrObResponseBodyData setScrollId(String scrollId) {
            this.scrollId = scrollId;
            return this;
        }
        public String getScrollId() {
            return this.scrollId;
        }

        public ClinkListCdrObResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
