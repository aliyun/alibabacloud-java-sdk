// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class ClinkListCdrIbsResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ClinkListCdrIbsResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>A90E4451-FED7-49D2-87C8-00700A8C4D0D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ClinkListCdrIbsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ClinkListCdrIbsResponseBody self = new ClinkListCdrIbsResponseBody();
        return TeaModel.build(map, self);
    }

    public ClinkListCdrIbsResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public ClinkListCdrIbsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ClinkListCdrIbsResponseBody setData(ClinkListCdrIbsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ClinkListCdrIbsResponseBodyData getData() {
        return this.data;
    }

    public ClinkListCdrIbsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ClinkListCdrIbsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ClinkListCdrIbsResponseBodyDataCdrIbs extends TeaModel {
        /**
         * <p>接通时长</p>
         * 
         * <strong>example:</strong>
         * <p>19</p>
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
         * <p>通话记录 Id</p>
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
         * <p>示例值</p>
         */
        @NameInMap("CallType")
        public String callType;

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
         * <p>1537329247</p>
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
         * <p>xxx</p>
         */
        @NameInMap("CustomerNumber")
        public String customerNumber;

        /**
         * <p>客户来电号码加密串</p>
         * 
         * <strong>example:</strong>
         * <p>TNjljZjZlNjgxYmIwNjMxGEwMzA3MmQ0MDQzYWEyMjY</p>
         */
        @NameInMap("CustomerNumberEncrypt")
        public String customerNumberEncrypt;

        /**
         * <p>客户来电省份</p>
         * 
         * <strong>example:</strong>
         * <p>示例值</p>
         */
        @NameInMap("CustomerProvince")
        public String customerProvince;

        /**
         * <p>挂机方</p>
         * 
         * <strong>example:</strong>
         * <p>示例值</p>
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
         * <p>是否邀评</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Evaluation")
        public Long evaluation;

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
         * <p>xxx</p>
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
         * <p>座席振铃时长</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("IbRingingDuration")
        public Long ibRingingDuration;

        /**
         * <p>排队时长</p>
         * 
         * <strong>example:</strong>
         * <p>18</p>
         */
        @NameInMap("IbWaitDuration")
        public Long ibWaitDuration;

        /**
         * <p>IVR名称</p>
         * 
         * <strong>example:</strong>
         * <p>IvrName</p>
         */
        @NameInMap("IvrName")
        public String ivrName;

        /**
         * <p>加入队列时间</p>
         * 
         * <strong>example:</strong>
         * <p>1647255885</p>
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
         * <p>3</p>
         */
        @NameInMap("Mark")
        public Long mark;

        /**
         * <p>备注</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("MarkData")
        public String markData;

        /**
         * <p>来电队列名称</p>
         * 
         * <strong>example:</strong>
         * <p>Qname</p>
         */
        @NameInMap("Qname")
        public String qname;

        /**
         * <p>来电队列号</p>
         * 
         * <strong>example:</strong>
         * <p>2332</p>
         */
        @NameInMap("Qno")
        public String qno;

        /**
         * <p>队列及时应答</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
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
         * <p>30</p>
         */
        @NameInMap("SayVoiceDuration")
        public Long sayVoiceDuration;

        /**
         * <p>呼叫结果</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值</p>
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
         * <p>示例值示例值示例值</p>
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
         * <p>56</p>
         */
        @NameInMap("TotalDuration")
        public Long totalDuration;

        /**
         * <p>通话记录唯一标识</p>
         * 
         * <strong>example:</strong>
         * <p>AWS_DEV_MEDIA_SERVER_8-1537329247.6</p>
         */
        @NameInMap("UniqueId")
        public String uniqueId;

        public static ClinkListCdrIbsResponseBodyDataCdrIbs build(java.util.Map<String, ?> map) throws Exception {
            ClinkListCdrIbsResponseBodyDataCdrIbs self = new ClinkListCdrIbsResponseBodyDataCdrIbs();
            return TeaModel.build(map, self);
        }

        public ClinkListCdrIbsResponseBodyDataCdrIbs setBridgeDuration(Long bridgeDuration) {
            this.bridgeDuration = bridgeDuration;
            return this;
        }
        public Long getBridgeDuration() {
            return this.bridgeDuration;
        }

        public ClinkListCdrIbsResponseBodyDataCdrIbs setBridgeTime(Long bridgeTime) {
            this.bridgeTime = bridgeTime;
            return this;
        }
        public Long getBridgeTime() {
            return this.bridgeTime;
        }

        public ClinkListCdrIbsResponseBodyDataCdrIbs setCallId(String callId) {
            this.callId = callId;
            return this;
        }
        public String getCallId() {
            return this.callId;
        }

        public ClinkListCdrIbsResponseBodyDataCdrIbs setCallType(String callType) {
            this.callType = callType;
            return this;
        }
        public String getCallType() {
            return this.callType;
        }

        public ClinkListCdrIbsResponseBodyDataCdrIbs setClientName(String clientName) {
            this.clientName = clientName;
            return this;
        }
        public String getClientName() {
            return this.clientName;
        }

        public ClinkListCdrIbsResponseBodyDataCdrIbs setClientNumber(String clientNumber) {
            this.clientNumber = clientNumber;
            return this;
        }
        public String getClientNumber() {
            return this.clientNumber;
        }

        public ClinkListCdrIbsResponseBodyDataCdrIbs setClientOffhookTime(Long clientOffhookTime) {
            this.clientOffhookTime = clientOffhookTime;
            return this;
        }
        public Long getClientOffhookTime() {
            return this.clientOffhookTime;
        }

        public ClinkListCdrIbsResponseBodyDataCdrIbs setClientRingingTime(Long clientRingingTime) {
            this.clientRingingTime = clientRingingTime;
            return this;
        }
        public Long getClientRingingTime() {
            return this.clientRingingTime;
        }

        public ClinkListCdrIbsResponseBodyDataCdrIbs setCno(String cno) {
            this.cno = cno;
            return this;
        }
        public String getCno() {
            return this.cno;
        }

        public ClinkListCdrIbsResponseBodyDataCdrIbs setCustomerCity(String customerCity) {
            this.customerCity = customerCity;
            return this;
        }
        public String getCustomerCity() {
            return this.customerCity;
        }

        public ClinkListCdrIbsResponseBodyDataCdrIbs setCustomerNumber(String customerNumber) {
            this.customerNumber = customerNumber;
            return this;
        }
        public String getCustomerNumber() {
            return this.customerNumber;
        }

        public ClinkListCdrIbsResponseBodyDataCdrIbs setCustomerNumberEncrypt(String customerNumberEncrypt) {
            this.customerNumberEncrypt = customerNumberEncrypt;
            return this;
        }
        public String getCustomerNumberEncrypt() {
            return this.customerNumberEncrypt;
        }

        public ClinkListCdrIbsResponseBodyDataCdrIbs setCustomerProvince(String customerProvince) {
            this.customerProvince = customerProvince;
            return this;
        }
        public String getCustomerProvince() {
            return this.customerProvince;
        }

        public ClinkListCdrIbsResponseBodyDataCdrIbs setEndReason(String endReason) {
            this.endReason = endReason;
            return this;
        }
        public String getEndReason() {
            return this.endReason;
        }

        public ClinkListCdrIbsResponseBodyDataCdrIbs setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public ClinkListCdrIbsResponseBodyDataCdrIbs setEvaluation(Long evaluation) {
            this.evaluation = evaluation;
            return this;
        }
        public Long getEvaluation() {
            return this.evaluation;
        }

        public ClinkListCdrIbsResponseBodyDataCdrIbs setFirstJoinQueueTime(Long firstJoinQueueTime) {
            this.firstJoinQueueTime = firstJoinQueueTime;
            return this;
        }
        public Long getFirstJoinQueueTime() {
            return this.firstJoinQueueTime;
        }

        public ClinkListCdrIbsResponseBodyDataCdrIbs setHotline(String hotline) {
            this.hotline = hotline;
            return this;
        }
        public String getHotline() {
            return this.hotline;
        }

        public ClinkListCdrIbsResponseBodyDataCdrIbs setHotlineName(String hotlineName) {
            this.hotlineName = hotlineName;
            return this;
        }
        public String getHotlineName() {
            return this.hotlineName;
        }

        public ClinkListCdrIbsResponseBodyDataCdrIbs setIbRingingDuration(Long ibRingingDuration) {
            this.ibRingingDuration = ibRingingDuration;
            return this;
        }
        public Long getIbRingingDuration() {
            return this.ibRingingDuration;
        }

        public ClinkListCdrIbsResponseBodyDataCdrIbs setIbWaitDuration(Long ibWaitDuration) {
            this.ibWaitDuration = ibWaitDuration;
            return this;
        }
        public Long getIbWaitDuration() {
            return this.ibWaitDuration;
        }

        public ClinkListCdrIbsResponseBodyDataCdrIbs setIvrName(String ivrName) {
            this.ivrName = ivrName;
            return this;
        }
        public String getIvrName() {
            return this.ivrName;
        }

        public ClinkListCdrIbsResponseBodyDataCdrIbs setJoinQueueTime(Long joinQueueTime) {
            this.joinQueueTime = joinQueueTime;
            return this;
        }
        public Long getJoinQueueTime() {
            return this.joinQueueTime;
        }

        public ClinkListCdrIbsResponseBodyDataCdrIbs setLeaveQueueTime(Long leaveQueueTime) {
            this.leaveQueueTime = leaveQueueTime;
            return this;
        }
        public Long getLeaveQueueTime() {
            return this.leaveQueueTime;
        }

        public ClinkListCdrIbsResponseBodyDataCdrIbs setMark(Long mark) {
            this.mark = mark;
            return this;
        }
        public Long getMark() {
            return this.mark;
        }

        public ClinkListCdrIbsResponseBodyDataCdrIbs setMarkData(String markData) {
            this.markData = markData;
            return this;
        }
        public String getMarkData() {
            return this.markData;
        }

        public ClinkListCdrIbsResponseBodyDataCdrIbs setQname(String qname) {
            this.qname = qname;
            return this;
        }
        public String getQname() {
            return this.qname;
        }

        public ClinkListCdrIbsResponseBodyDataCdrIbs setQno(String qno) {
            this.qno = qno;
            return this;
        }
        public String getQno() {
            return this.qno;
        }

        public ClinkListCdrIbsResponseBodyDataCdrIbs setQueueAnswerInTime(Long queueAnswerInTime) {
            this.queueAnswerInTime = queueAnswerInTime;
            return this;
        }
        public Long getQueueAnswerInTime() {
            return this.queueAnswerInTime;
        }

        public ClinkListCdrIbsResponseBodyDataCdrIbs setRecordFile(String recordFile) {
            this.recordFile = recordFile;
            return this;
        }
        public String getRecordFile() {
            return this.recordFile;
        }

        public ClinkListCdrIbsResponseBodyDataCdrIbs setSayVoiceDuration(Long sayVoiceDuration) {
            this.sayVoiceDuration = sayVoiceDuration;
            return this;
        }
        public Long getSayVoiceDuration() {
            return this.sayVoiceDuration;
        }

        public ClinkListCdrIbsResponseBodyDataCdrIbs setSipCause(String sipCause) {
            this.sipCause = sipCause;
            return this;
        }
        public String getSipCause() {
            return this.sipCause;
        }

        public ClinkListCdrIbsResponseBodyDataCdrIbs setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public ClinkListCdrIbsResponseBodyDataCdrIbs setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ClinkListCdrIbsResponseBodyDataCdrIbs setStatusCode(String statusCode) {
            this.statusCode = statusCode;
            return this;
        }
        public String getStatusCode() {
            return this.statusCode;
        }

        public ClinkListCdrIbsResponseBodyDataCdrIbs setTagNames(java.util.List<String> tagNames) {
            this.tagNames = tagNames;
            return this;
        }
        public java.util.List<String> getTagNames() {
            return this.tagNames;
        }

        public ClinkListCdrIbsResponseBodyDataCdrIbs setTags(java.util.List<String> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<String> getTags() {
            return this.tags;
        }

        public ClinkListCdrIbsResponseBodyDataCdrIbs setTotalDuration(Long totalDuration) {
            this.totalDuration = totalDuration;
            return this;
        }
        public Long getTotalDuration() {
            return this.totalDuration;
        }

        public ClinkListCdrIbsResponseBodyDataCdrIbs setUniqueId(String uniqueId) {
            this.uniqueId = uniqueId;
            return this;
        }
        public String getUniqueId() {
            return this.uniqueId;
        }

    }

    public static class ClinkListCdrIbsResponseBodyData extends TeaModel {
        /**
         * <p>[呼入通话记录列表] #呼入通话记录列表</p>
         */
        @NameInMap("CdrIbs")
        public java.util.List<ClinkListCdrIbsResponseBodyDataCdrIbs> cdrIbs;

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
         * <p>总条数</p>
         * 
         * <strong>example:</strong>
         * <p>57</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        public static ClinkListCdrIbsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ClinkListCdrIbsResponseBodyData self = new ClinkListCdrIbsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ClinkListCdrIbsResponseBodyData setCdrIbs(java.util.List<ClinkListCdrIbsResponseBodyDataCdrIbs> cdrIbs) {
            this.cdrIbs = cdrIbs;
            return this;
        }
        public java.util.List<ClinkListCdrIbsResponseBodyDataCdrIbs> getCdrIbs() {
            return this.cdrIbs;
        }

        public ClinkListCdrIbsResponseBodyData setClinkRequestId(String clinkRequestId) {
            this.clinkRequestId = clinkRequestId;
            return this;
        }
        public String getClinkRequestId() {
            return this.clinkRequestId;
        }

        public ClinkListCdrIbsResponseBodyData setPageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Long getPageNumber() {
            return this.pageNumber;
        }

        public ClinkListCdrIbsResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public ClinkListCdrIbsResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
