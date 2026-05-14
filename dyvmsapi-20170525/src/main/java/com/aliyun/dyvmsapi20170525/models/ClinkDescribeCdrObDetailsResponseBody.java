// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class ClinkDescribeCdrObDetailsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ClinkDescribeCdrObDetailsResponseBodyData data;

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

    public static ClinkDescribeCdrObDetailsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ClinkDescribeCdrObDetailsResponseBody self = new ClinkDescribeCdrObDetailsResponseBody();
        return TeaModel.build(map, self);
    }

    public ClinkDescribeCdrObDetailsResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public ClinkDescribeCdrObDetailsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ClinkDescribeCdrObDetailsResponseBody setData(ClinkDescribeCdrObDetailsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ClinkDescribeCdrObDetailsResponseBodyData getData() {
        return this.data;
    }

    public ClinkDescribeCdrObDetailsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ClinkDescribeCdrObDetailsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ClinkDescribeCdrObDetailsResponseBodyDataCdrObDetails extends TeaModel {
        /**
         * <p>接听时间</p>
         * 
         * <strong>example:</strong>
         * <p>1536115382</p>
         */
        @NameInMap("AnswerTime")
        public Long answerTime;

        /**
         * <p>呼叫类型</p>
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
         * <p>zhangsan</p>
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
         * <p>2005</p>
         */
        @NameInMap("Cno")
        public String cno;

        /**
         * <p>结束时间</p>
         * 
         * <strong>example:</strong>
         * <p>1536115391</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>通话记录主通道唯一标识</p>
         * 
         * <strong>example:</strong>
         * <p>AWS_DEV_MEDIA_SERVER_8-1536115322.0</p>
         */
        @NameInMap("MainUniqueId")
        public String mainUniqueId;

        /**
         * <p>录音文件名</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("RecordFile")
        public String recordFile;

        /**
         * <p>是否开启主叫记忆</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("Remember")
        public String remember;

        /**
         * <p>呼叫情况</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值示例值</p>
         */
        @NameInMap("SipCause")
        public String sipCause;

        /**
         * <p>接起时间</p>
         * 
         * <strong>example:</strong>
         * <p>1536115379</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        /**
         * <p>呼叫结果</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值示例值</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>通话时长</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("TotalDuration")
        public Long totalDuration;

        /**
         * <p>通话记录详情唯一标识</p>
         * 
         * <strong>example:</strong>
         * <p>AWS_DEV_MEDIA_SERVER_8-1536115379.4</p>
         */
        @NameInMap("UniqueId")
        public String uniqueId;

        public static ClinkDescribeCdrObDetailsResponseBodyDataCdrObDetails build(java.util.Map<String, ?> map) throws Exception {
            ClinkDescribeCdrObDetailsResponseBodyDataCdrObDetails self = new ClinkDescribeCdrObDetailsResponseBodyDataCdrObDetails();
            return TeaModel.build(map, self);
        }

        public ClinkDescribeCdrObDetailsResponseBodyDataCdrObDetails setAnswerTime(Long answerTime) {
            this.answerTime = answerTime;
            return this;
        }
        public Long getAnswerTime() {
            return this.answerTime;
        }

        public ClinkDescribeCdrObDetailsResponseBodyDataCdrObDetails setCallType(String callType) {
            this.callType = callType;
            return this;
        }
        public String getCallType() {
            return this.callType;
        }

        public ClinkDescribeCdrObDetailsResponseBodyDataCdrObDetails setClientName(String clientName) {
            this.clientName = clientName;
            return this;
        }
        public String getClientName() {
            return this.clientName;
        }

        public ClinkDescribeCdrObDetailsResponseBodyDataCdrObDetails setClientNumber(String clientNumber) {
            this.clientNumber = clientNumber;
            return this;
        }
        public String getClientNumber() {
            return this.clientNumber;
        }

        public ClinkDescribeCdrObDetailsResponseBodyDataCdrObDetails setCno(String cno) {
            this.cno = cno;
            return this;
        }
        public String getCno() {
            return this.cno;
        }

        public ClinkDescribeCdrObDetailsResponseBodyDataCdrObDetails setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public ClinkDescribeCdrObDetailsResponseBodyDataCdrObDetails setMainUniqueId(String mainUniqueId) {
            this.mainUniqueId = mainUniqueId;
            return this;
        }
        public String getMainUniqueId() {
            return this.mainUniqueId;
        }

        public ClinkDescribeCdrObDetailsResponseBodyDataCdrObDetails setRecordFile(String recordFile) {
            this.recordFile = recordFile;
            return this;
        }
        public String getRecordFile() {
            return this.recordFile;
        }

        public ClinkDescribeCdrObDetailsResponseBodyDataCdrObDetails setRemember(String remember) {
            this.remember = remember;
            return this;
        }
        public String getRemember() {
            return this.remember;
        }

        public ClinkDescribeCdrObDetailsResponseBodyDataCdrObDetails setSipCause(String sipCause) {
            this.sipCause = sipCause;
            return this;
        }
        public String getSipCause() {
            return this.sipCause;
        }

        public ClinkDescribeCdrObDetailsResponseBodyDataCdrObDetails setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public ClinkDescribeCdrObDetailsResponseBodyDataCdrObDetails setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ClinkDescribeCdrObDetailsResponseBodyDataCdrObDetails setTotalDuration(Long totalDuration) {
            this.totalDuration = totalDuration;
            return this;
        }
        public Long getTotalDuration() {
            return this.totalDuration;
        }

        public ClinkDescribeCdrObDetailsResponseBodyDataCdrObDetails setUniqueId(String uniqueId) {
            this.uniqueId = uniqueId;
            return this;
        }
        public String getUniqueId() {
            return this.uniqueId;
        }

    }

    public static class ClinkDescribeCdrObDetailsResponseBodyData extends TeaModel {
        /**
         * <p>[外呼通话记录明细] #外呼通话记录明细</p>
         */
        @NameInMap("CdrObDetails")
        public java.util.List<ClinkDescribeCdrObDetailsResponseBodyDataCdrObDetails> cdrObDetails;

        /**
         * <p>请求 id</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("ClinkRequestId")
        public String clinkRequestId;

        public static ClinkDescribeCdrObDetailsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ClinkDescribeCdrObDetailsResponseBodyData self = new ClinkDescribeCdrObDetailsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ClinkDescribeCdrObDetailsResponseBodyData setCdrObDetails(java.util.List<ClinkDescribeCdrObDetailsResponseBodyDataCdrObDetails> cdrObDetails) {
            this.cdrObDetails = cdrObDetails;
            return this;
        }
        public java.util.List<ClinkDescribeCdrObDetailsResponseBodyDataCdrObDetails> getCdrObDetails() {
            return this.cdrObDetails;
        }

        public ClinkDescribeCdrObDetailsResponseBodyData setClinkRequestId(String clinkRequestId) {
            this.clinkRequestId = clinkRequestId;
            return this;
        }
        public String getClinkRequestId() {
            return this.clinkRequestId;
        }

    }

}
