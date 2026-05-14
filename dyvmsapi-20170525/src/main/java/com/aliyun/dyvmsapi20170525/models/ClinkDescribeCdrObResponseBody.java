// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class ClinkDescribeCdrObResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ClinkDescribeCdrObResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>7BF47617-7851-48F7-A3A1-2021342A78E2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ClinkDescribeCdrObResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ClinkDescribeCdrObResponseBody self = new ClinkDescribeCdrObResponseBody();
        return TeaModel.build(map, self);
    }

    public ClinkDescribeCdrObResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public ClinkDescribeCdrObResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ClinkDescribeCdrObResponseBody setData(ClinkDescribeCdrObResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ClinkDescribeCdrObResponseBodyData getData() {
        return this.data;
    }

    public ClinkDescribeCdrObResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ClinkDescribeCdrObResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ClinkDescribeCdrObResponseBodyDataCdrOb extends TeaModel {
        /**
         * <p>接通时长</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("BridgeDuration")
        public Long bridgeDuration;

        /**
         * <p>接通时间</p>
         * 
         * <strong>example:</strong>
         * <p>82</p>
         */
        @NameInMap("BridgeTime")
        public Long bridgeTime;

        /**
         * <p>通话记录id</p>
         * 
         * <strong>example:</strong>
         * <p>ba078ace-717c-6666-af41-d4dd5035edd6</p>
         */
        @NameInMap("CallId")
        public String callId;

        /**
         * <p>呼叫类型</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值</p>
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
         * <p>座席号</p>
         * 
         * <strong>example:</strong>
         * <p>2555</p>
         */
        @NameInMap("Cno")
        public String cno;

        /**
         * <p>客户城市</p>
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
         * <p>客户省份</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("CustomerProvince")
        public String customerProvince;

        /**
         * <p>客户响铃时间</p>
         * 
         * <strong>example:</strong>
         * <p>66</p>
         */
        @NameInMap("CustomerRingingTime")
        public Long customerRingingTime;

        /**
         * <p>挂机方</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值示例值</p>
         */
        @NameInMap("EndReason")
        public String endReason;

        /**
         * <p>结束时间</p>
         * 
         * <strong>example:</strong>
         * <p>1536892706</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>是否邀评 0: 否 1: 是</p>
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
         * <p>xxx</p>
         */
        @NameInMap("Hotline")
        public String hotline;

        /**
         * <p>[满意度记录] #满意度记录</p>
         */
        @NameInMap("Investigation")
        public java.util.Map<String, ?> investigation;

        /**
         * <p>ivr名称</p>
         * 
         * <strong>example:</strong>
         * <p>name1</p>
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
         * <p>示例值示例值示例值</p>
         */
        @NameInMap("MarkData")
        public String markData;

        /**
         * <p>录音文件名</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("RecordFile")
        public String recordFile;

        /**
         * <p>呼叫结果</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("SipCause")
        public String sipCause;

        /**
         * <p>开始时间</p>
         * 
         * <strong>example:</strong>
         * <p>1536115324</p>
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
         * <p>64</p>
         */
        @NameInMap("TotalDuration")
        public Long totalDuration;

        /**
         * <p>通话记录唯一标识</p>
         * 
         * <strong>example:</strong>
         * <p>AWS_DEV_MEDIA_SERVER_8-1536892698.2</p>
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

        public static ClinkDescribeCdrObResponseBodyDataCdrOb build(java.util.Map<String, ?> map) throws Exception {
            ClinkDescribeCdrObResponseBodyDataCdrOb self = new ClinkDescribeCdrObResponseBodyDataCdrOb();
            return TeaModel.build(map, self);
        }

        public ClinkDescribeCdrObResponseBodyDataCdrOb setBridgeDuration(Long bridgeDuration) {
            this.bridgeDuration = bridgeDuration;
            return this;
        }
        public Long getBridgeDuration() {
            return this.bridgeDuration;
        }

        public ClinkDescribeCdrObResponseBodyDataCdrOb setBridgeTime(Long bridgeTime) {
            this.bridgeTime = bridgeTime;
            return this;
        }
        public Long getBridgeTime() {
            return this.bridgeTime;
        }

        public ClinkDescribeCdrObResponseBodyDataCdrOb setCallId(String callId) {
            this.callId = callId;
            return this;
        }
        public String getCallId() {
            return this.callId;
        }

        public ClinkDescribeCdrObResponseBodyDataCdrOb setCallType(String callType) {
            this.callType = callType;
            return this;
        }
        public String getCallType() {
            return this.callType;
        }

        public ClinkDescribeCdrObResponseBodyDataCdrOb setClientName(String clientName) {
            this.clientName = clientName;
            return this;
        }
        public String getClientName() {
            return this.clientName;
        }

        public ClinkDescribeCdrObResponseBodyDataCdrOb setClientNumber(String clientNumber) {
            this.clientNumber = clientNumber;
            return this;
        }
        public String getClientNumber() {
            return this.clientNumber;
        }

        public ClinkDescribeCdrObResponseBodyDataCdrOb setCno(String cno) {
            this.cno = cno;
            return this;
        }
        public String getCno() {
            return this.cno;
        }

        public ClinkDescribeCdrObResponseBodyDataCdrOb setCustomerCity(String customerCity) {
            this.customerCity = customerCity;
            return this;
        }
        public String getCustomerCity() {
            return this.customerCity;
        }

        public ClinkDescribeCdrObResponseBodyDataCdrOb setCustomerNumber(String customerNumber) {
            this.customerNumber = customerNumber;
            return this;
        }
        public String getCustomerNumber() {
            return this.customerNumber;
        }

        public ClinkDescribeCdrObResponseBodyDataCdrOb setCustomerNumberEncrypt(String customerNumberEncrypt) {
            this.customerNumberEncrypt = customerNumberEncrypt;
            return this;
        }
        public String getCustomerNumberEncrypt() {
            return this.customerNumberEncrypt;
        }

        public ClinkDescribeCdrObResponseBodyDataCdrOb setCustomerProvince(String customerProvince) {
            this.customerProvince = customerProvince;
            return this;
        }
        public String getCustomerProvince() {
            return this.customerProvince;
        }

        public ClinkDescribeCdrObResponseBodyDataCdrOb setCustomerRingingTime(Long customerRingingTime) {
            this.customerRingingTime = customerRingingTime;
            return this;
        }
        public Long getCustomerRingingTime() {
            return this.customerRingingTime;
        }

        public ClinkDescribeCdrObResponseBodyDataCdrOb setEndReason(String endReason) {
            this.endReason = endReason;
            return this;
        }
        public String getEndReason() {
            return this.endReason;
        }

        public ClinkDescribeCdrObResponseBodyDataCdrOb setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public ClinkDescribeCdrObResponseBodyDataCdrOb setEvaluation(Long evaluation) {
            this.evaluation = evaluation;
            return this;
        }
        public Long getEvaluation() {
            return this.evaluation;
        }

        public ClinkDescribeCdrObResponseBodyDataCdrOb setHotline(String hotline) {
            this.hotline = hotline;
            return this;
        }
        public String getHotline() {
            return this.hotline;
        }

        public ClinkDescribeCdrObResponseBodyDataCdrOb setInvestigation(java.util.Map<String, ?> investigation) {
            this.investigation = investigation;
            return this;
        }
        public java.util.Map<String, ?> getInvestigation() {
            return this.investigation;
        }

        public ClinkDescribeCdrObResponseBodyDataCdrOb setIvrName(String ivrName) {
            this.ivrName = ivrName;
            return this;
        }
        public String getIvrName() {
            return this.ivrName;
        }

        public ClinkDescribeCdrObResponseBodyDataCdrOb setMark(Long mark) {
            this.mark = mark;
            return this;
        }
        public Long getMark() {
            return this.mark;
        }

        public ClinkDescribeCdrObResponseBodyDataCdrOb setMarkData(String markData) {
            this.markData = markData;
            return this;
        }
        public String getMarkData() {
            return this.markData;
        }

        public ClinkDescribeCdrObResponseBodyDataCdrOb setRecordFile(String recordFile) {
            this.recordFile = recordFile;
            return this;
        }
        public String getRecordFile() {
            return this.recordFile;
        }

        public ClinkDescribeCdrObResponseBodyDataCdrOb setSipCause(String sipCause) {
            this.sipCause = sipCause;
            return this;
        }
        public String getSipCause() {
            return this.sipCause;
        }

        public ClinkDescribeCdrObResponseBodyDataCdrOb setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public ClinkDescribeCdrObResponseBodyDataCdrOb setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ClinkDescribeCdrObResponseBodyDataCdrOb setStatusCode(String statusCode) {
            this.statusCode = statusCode;
            return this;
        }
        public String getStatusCode() {
            return this.statusCode;
        }

        public ClinkDescribeCdrObResponseBodyDataCdrOb setTagNames(java.util.List<String> tagNames) {
            this.tagNames = tagNames;
            return this;
        }
        public java.util.List<String> getTagNames() {
            return this.tagNames;
        }

        public ClinkDescribeCdrObResponseBodyDataCdrOb setTags(java.util.List<String> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<String> getTags() {
            return this.tags;
        }

        public ClinkDescribeCdrObResponseBodyDataCdrOb setTotalDuration(Long totalDuration) {
            this.totalDuration = totalDuration;
            return this;
        }
        public Long getTotalDuration() {
            return this.totalDuration;
        }

        public ClinkDescribeCdrObResponseBodyDataCdrOb setUniqueId(String uniqueId) {
            this.uniqueId = uniqueId;
            return this;
        }
        public String getUniqueId() {
            return this.uniqueId;
        }

        public ClinkDescribeCdrObResponseBodyDataCdrOb setXnumber(String xnumber) {
            this.xnumber = xnumber;
            return this;
        }
        public String getXnumber() {
            return this.xnumber;
        }

    }

    public static class ClinkDescribeCdrObResponseBodyData extends TeaModel {
        /**
         * <p>[外呼通话记录] #外呼通话记录</p>
         */
        @NameInMap("CdrOb")
        public ClinkDescribeCdrObResponseBodyDataCdrOb cdrOb;

        /**
         * <p>请求 id</p>
         * 
         * <strong>example:</strong>
         * <p>示例值</p>
         */
        @NameInMap("ClinkRequestId")
        public String clinkRequestId;

        public static ClinkDescribeCdrObResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ClinkDescribeCdrObResponseBodyData self = new ClinkDescribeCdrObResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ClinkDescribeCdrObResponseBodyData setCdrOb(ClinkDescribeCdrObResponseBodyDataCdrOb cdrOb) {
            this.cdrOb = cdrOb;
            return this;
        }
        public ClinkDescribeCdrObResponseBodyDataCdrOb getCdrOb() {
            return this.cdrOb;
        }

        public ClinkDescribeCdrObResponseBodyData setClinkRequestId(String clinkRequestId) {
            this.clinkRequestId = clinkRequestId;
            return this;
        }
        public String getClinkRequestId() {
            return this.clinkRequestId;
        }

    }

}
