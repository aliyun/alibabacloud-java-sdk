// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class ClinkListCdrObsResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ClinkListCdrObsResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>4B52E871-0F7C-59FC-9C7E-94B550953BA9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ClinkListCdrObsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ClinkListCdrObsResponseBody self = new ClinkListCdrObsResponseBody();
        return TeaModel.build(map, self);
    }

    public ClinkListCdrObsResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public ClinkListCdrObsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ClinkListCdrObsResponseBody setData(ClinkListCdrObsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ClinkListCdrObsResponseBodyData getData() {
        return this.data;
    }

    public ClinkListCdrObsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ClinkListCdrObsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ClinkListCdrObsResponseBodyDataCdrObs extends TeaModel {
        /**
         * <p>接通时长</p>
         * 
         * <strong>example:</strong>
         * <p>87</p>
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
         * <p>CallId</p>
         */
        @NameInMap("CallId")
        public String callId;

        /**
         * <p>外呼类型，预览外呼、预测外呼、直接外呼</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值示例值</p>
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
         * <p>客户城市</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值</p>
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
         * <p>客户省份</p>
         * 
         * <strong>example:</strong>
         * <p>示例值</p>
         */
        @NameInMap("CustomerProvince")
        public String customerProvince;

        /**
         * <p>客户响铃时间</p>
         * 
         * <strong>example:</strong>
         * <p>1775024775</p>
         */
        @NameInMap("CustomerRingingTime")
        public Long customerRingingTime;

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
         * <p>是否邀评</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Evaluation")
        public Long evaluation;

        /**
         * <p>热线号码</p>
         * 
         * <strong>example:</strong>
         * <p>Hotline</p>
         */
        @NameInMap("Hotline")
        public String hotline;

        /**
         * <p>IVR名称</p>
         * 
         * <strong>example:</strong>
         * <p>IvrName</p>
         */
        @NameInMap("IvrName")
        public String ivrName;

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
         * <p>2222</p>
         */
        @NameInMap("Qname")
        public String qname;

        /**
         * <p>来电队列号</p>
         * 
         * <strong>example:</strong>
         * <p>1212</p>
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
         * <p>呼叫结果</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值示例值</p>
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
         * <p>示例值</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>接听状态映射</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值</p>
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
         * <p>81</p>
         */
        @NameInMap("TotalDuration")
        public Long totalDuration;

        /**
         * <p>通话记录唯一标识</p>
         * 
         * <strong>example:</strong>
         * <p>UniqueId</p>
         */
        @NameInMap("UniqueId")
        public String uniqueId;

        /**
         * <p>虚拟号码</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("Xnumber")
        public String xnumber;

        public static ClinkListCdrObsResponseBodyDataCdrObs build(java.util.Map<String, ?> map) throws Exception {
            ClinkListCdrObsResponseBodyDataCdrObs self = new ClinkListCdrObsResponseBodyDataCdrObs();
            return TeaModel.build(map, self);
        }

        public ClinkListCdrObsResponseBodyDataCdrObs setBridgeDuration(Long bridgeDuration) {
            this.bridgeDuration = bridgeDuration;
            return this;
        }
        public Long getBridgeDuration() {
            return this.bridgeDuration;
        }

        public ClinkListCdrObsResponseBodyDataCdrObs setBridgeTime(Long bridgeTime) {
            this.bridgeTime = bridgeTime;
            return this;
        }
        public Long getBridgeTime() {
            return this.bridgeTime;
        }

        public ClinkListCdrObsResponseBodyDataCdrObs setCallId(String callId) {
            this.callId = callId;
            return this;
        }
        public String getCallId() {
            return this.callId;
        }

        public ClinkListCdrObsResponseBodyDataCdrObs setCallType(String callType) {
            this.callType = callType;
            return this;
        }
        public String getCallType() {
            return this.callType;
        }

        public ClinkListCdrObsResponseBodyDataCdrObs setClientName(String clientName) {
            this.clientName = clientName;
            return this;
        }
        public String getClientName() {
            return this.clientName;
        }

        public ClinkListCdrObsResponseBodyDataCdrObs setClientNumber(String clientNumber) {
            this.clientNumber = clientNumber;
            return this;
        }
        public String getClientNumber() {
            return this.clientNumber;
        }

        public ClinkListCdrObsResponseBodyDataCdrObs setClientRingingTime(Long clientRingingTime) {
            this.clientRingingTime = clientRingingTime;
            return this;
        }
        public Long getClientRingingTime() {
            return this.clientRingingTime;
        }

        public ClinkListCdrObsResponseBodyDataCdrObs setCno(String cno) {
            this.cno = cno;
            return this;
        }
        public String getCno() {
            return this.cno;
        }

        public ClinkListCdrObsResponseBodyDataCdrObs setCustomerCity(String customerCity) {
            this.customerCity = customerCity;
            return this;
        }
        public String getCustomerCity() {
            return this.customerCity;
        }

        public ClinkListCdrObsResponseBodyDataCdrObs setCustomerNumber(String customerNumber) {
            this.customerNumber = customerNumber;
            return this;
        }
        public String getCustomerNumber() {
            return this.customerNumber;
        }

        public ClinkListCdrObsResponseBodyDataCdrObs setCustomerNumberEncrypt(String customerNumberEncrypt) {
            this.customerNumberEncrypt = customerNumberEncrypt;
            return this;
        }
        public String getCustomerNumberEncrypt() {
            return this.customerNumberEncrypt;
        }

        public ClinkListCdrObsResponseBodyDataCdrObs setCustomerProvince(String customerProvince) {
            this.customerProvince = customerProvince;
            return this;
        }
        public String getCustomerProvince() {
            return this.customerProvince;
        }

        public ClinkListCdrObsResponseBodyDataCdrObs setCustomerRingingTime(Long customerRingingTime) {
            this.customerRingingTime = customerRingingTime;
            return this;
        }
        public Long getCustomerRingingTime() {
            return this.customerRingingTime;
        }

        public ClinkListCdrObsResponseBodyDataCdrObs setEndReason(String endReason) {
            this.endReason = endReason;
            return this;
        }
        public String getEndReason() {
            return this.endReason;
        }

        public ClinkListCdrObsResponseBodyDataCdrObs setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public ClinkListCdrObsResponseBodyDataCdrObs setEvaluation(Long evaluation) {
            this.evaluation = evaluation;
            return this;
        }
        public Long getEvaluation() {
            return this.evaluation;
        }

        public ClinkListCdrObsResponseBodyDataCdrObs setHotline(String hotline) {
            this.hotline = hotline;
            return this;
        }
        public String getHotline() {
            return this.hotline;
        }

        public ClinkListCdrObsResponseBodyDataCdrObs setIvrName(String ivrName) {
            this.ivrName = ivrName;
            return this;
        }
        public String getIvrName() {
            return this.ivrName;
        }

        public ClinkListCdrObsResponseBodyDataCdrObs setMark(Long mark) {
            this.mark = mark;
            return this;
        }
        public Long getMark() {
            return this.mark;
        }

        public ClinkListCdrObsResponseBodyDataCdrObs setMarkData(String markData) {
            this.markData = markData;
            return this;
        }
        public String getMarkData() {
            return this.markData;
        }

        public ClinkListCdrObsResponseBodyDataCdrObs setQname(String qname) {
            this.qname = qname;
            return this;
        }
        public String getQname() {
            return this.qname;
        }

        public ClinkListCdrObsResponseBodyDataCdrObs setQno(String qno) {
            this.qno = qno;
            return this;
        }
        public String getQno() {
            return this.qno;
        }

        public ClinkListCdrObsResponseBodyDataCdrObs setQueueAnswerInTime(Long queueAnswerInTime) {
            this.queueAnswerInTime = queueAnswerInTime;
            return this;
        }
        public Long getQueueAnswerInTime() {
            return this.queueAnswerInTime;
        }

        public ClinkListCdrObsResponseBodyDataCdrObs setRecordFile(String recordFile) {
            this.recordFile = recordFile;
            return this;
        }
        public String getRecordFile() {
            return this.recordFile;
        }

        public ClinkListCdrObsResponseBodyDataCdrObs setSipCause(String sipCause) {
            this.sipCause = sipCause;
            return this;
        }
        public String getSipCause() {
            return this.sipCause;
        }

        public ClinkListCdrObsResponseBodyDataCdrObs setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public ClinkListCdrObsResponseBodyDataCdrObs setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ClinkListCdrObsResponseBodyDataCdrObs setStatusCode(String statusCode) {
            this.statusCode = statusCode;
            return this;
        }
        public String getStatusCode() {
            return this.statusCode;
        }

        public ClinkListCdrObsResponseBodyDataCdrObs setTagNames(java.util.List<String> tagNames) {
            this.tagNames = tagNames;
            return this;
        }
        public java.util.List<String> getTagNames() {
            return this.tagNames;
        }

        public ClinkListCdrObsResponseBodyDataCdrObs setTags(java.util.List<String> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<String> getTags() {
            return this.tags;
        }

        public ClinkListCdrObsResponseBodyDataCdrObs setTotalDuration(Long totalDuration) {
            this.totalDuration = totalDuration;
            return this;
        }
        public Long getTotalDuration() {
            return this.totalDuration;
        }

        public ClinkListCdrObsResponseBodyDataCdrObs setUniqueId(String uniqueId) {
            this.uniqueId = uniqueId;
            return this;
        }
        public String getUniqueId() {
            return this.uniqueId;
        }

        public ClinkListCdrObsResponseBodyDataCdrObs setXnumber(String xnumber) {
            this.xnumber = xnumber;
            return this;
        }
        public String getXnumber() {
            return this.xnumber;
        }

    }

    public static class ClinkListCdrObsResponseBodyData extends TeaModel {
        /**
         * <p>[外呼通话记录列表] #外呼通话记录列表</p>
         */
        @NameInMap("CdrObs")
        public java.util.List<ClinkListCdrObsResponseBodyDataCdrObs> cdrObs;

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
         * <p>49</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        public static ClinkListCdrObsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ClinkListCdrObsResponseBodyData self = new ClinkListCdrObsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ClinkListCdrObsResponseBodyData setCdrObs(java.util.List<ClinkListCdrObsResponseBodyDataCdrObs> cdrObs) {
            this.cdrObs = cdrObs;
            return this;
        }
        public java.util.List<ClinkListCdrObsResponseBodyDataCdrObs> getCdrObs() {
            return this.cdrObs;
        }

        public ClinkListCdrObsResponseBodyData setClinkRequestId(String clinkRequestId) {
            this.clinkRequestId = clinkRequestId;
            return this;
        }
        public String getClinkRequestId() {
            return this.clinkRequestId;
        }

        public ClinkListCdrObsResponseBodyData setPageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Long getPageNumber() {
            return this.pageNumber;
        }

        public ClinkListCdrObsResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public ClinkListCdrObsResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
