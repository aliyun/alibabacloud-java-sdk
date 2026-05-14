// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class ClinkDescribeCdrIbDetailsResponseBody extends TeaModel {
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
    public ClinkDescribeCdrIbDetailsResponseBodyData data;

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

    public static ClinkDescribeCdrIbDetailsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ClinkDescribeCdrIbDetailsResponseBody self = new ClinkDescribeCdrIbDetailsResponseBody();
        return TeaModel.build(map, self);
    }

    public ClinkDescribeCdrIbDetailsResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public ClinkDescribeCdrIbDetailsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ClinkDescribeCdrIbDetailsResponseBody setData(ClinkDescribeCdrIbDetailsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ClinkDescribeCdrIbDetailsResponseBodyData getData() {
        return this.data;
    }

    public ClinkDescribeCdrIbDetailsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ClinkDescribeCdrIbDetailsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ClinkDescribeCdrIbDetailsResponseBodyDataCdrIbDetails extends TeaModel {
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
         * <p>示例值示例值</p>
         */
        @NameInMap("CallType")
        public String callType;

        /**
         * <p>座席名称</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值</p>
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
         * <p>1536115379</p>
         */
        @NameInMap("ClientRingingTime")
        public Long clientRingingTime;

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
         * <p>队列号</p>
         * 
         * <strong>example:</strong>
         * <p>2233</p>
         */
        @NameInMap("Qno")
        public String qno;

        /**
         * <p>录音文件</p>
         * 
         * <strong>example:</strong>
         * <p>8888888-20220406155839-15108207489-6666--record-medias_6-777788888.666</p>
         */
        @NameInMap("RecordFile")
        public String recordFile;

        /**
         * <p>是否开启主叫记忆</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值示例值</p>
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
         * <p>示例值示例值</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>通话时长</p>
         * 
         * <strong>example:</strong>
         * <p>47</p>
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

        public static ClinkDescribeCdrIbDetailsResponseBodyDataCdrIbDetails build(java.util.Map<String, ?> map) throws Exception {
            ClinkDescribeCdrIbDetailsResponseBodyDataCdrIbDetails self = new ClinkDescribeCdrIbDetailsResponseBodyDataCdrIbDetails();
            return TeaModel.build(map, self);
        }

        public ClinkDescribeCdrIbDetailsResponseBodyDataCdrIbDetails setAnswerTime(Long answerTime) {
            this.answerTime = answerTime;
            return this;
        }
        public Long getAnswerTime() {
            return this.answerTime;
        }

        public ClinkDescribeCdrIbDetailsResponseBodyDataCdrIbDetails setCallType(String callType) {
            this.callType = callType;
            return this;
        }
        public String getCallType() {
            return this.callType;
        }

        public ClinkDescribeCdrIbDetailsResponseBodyDataCdrIbDetails setClientName(String clientName) {
            this.clientName = clientName;
            return this;
        }
        public String getClientName() {
            return this.clientName;
        }

        public ClinkDescribeCdrIbDetailsResponseBodyDataCdrIbDetails setClientNumber(String clientNumber) {
            this.clientNumber = clientNumber;
            return this;
        }
        public String getClientNumber() {
            return this.clientNumber;
        }

        public ClinkDescribeCdrIbDetailsResponseBodyDataCdrIbDetails setClientRingingTime(Long clientRingingTime) {
            this.clientRingingTime = clientRingingTime;
            return this;
        }
        public Long getClientRingingTime() {
            return this.clientRingingTime;
        }

        public ClinkDescribeCdrIbDetailsResponseBodyDataCdrIbDetails setCno(String cno) {
            this.cno = cno;
            return this;
        }
        public String getCno() {
            return this.cno;
        }

        public ClinkDescribeCdrIbDetailsResponseBodyDataCdrIbDetails setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public ClinkDescribeCdrIbDetailsResponseBodyDataCdrIbDetails setMainUniqueId(String mainUniqueId) {
            this.mainUniqueId = mainUniqueId;
            return this;
        }
        public String getMainUniqueId() {
            return this.mainUniqueId;
        }

        public ClinkDescribeCdrIbDetailsResponseBodyDataCdrIbDetails setQno(String qno) {
            this.qno = qno;
            return this;
        }
        public String getQno() {
            return this.qno;
        }

        public ClinkDescribeCdrIbDetailsResponseBodyDataCdrIbDetails setRecordFile(String recordFile) {
            this.recordFile = recordFile;
            return this;
        }
        public String getRecordFile() {
            return this.recordFile;
        }

        public ClinkDescribeCdrIbDetailsResponseBodyDataCdrIbDetails setRemember(String remember) {
            this.remember = remember;
            return this;
        }
        public String getRemember() {
            return this.remember;
        }

        public ClinkDescribeCdrIbDetailsResponseBodyDataCdrIbDetails setSipCause(String sipCause) {
            this.sipCause = sipCause;
            return this;
        }
        public String getSipCause() {
            return this.sipCause;
        }

        public ClinkDescribeCdrIbDetailsResponseBodyDataCdrIbDetails setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public ClinkDescribeCdrIbDetailsResponseBodyDataCdrIbDetails setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ClinkDescribeCdrIbDetailsResponseBodyDataCdrIbDetails setTotalDuration(Long totalDuration) {
            this.totalDuration = totalDuration;
            return this;
        }
        public Long getTotalDuration() {
            return this.totalDuration;
        }

        public ClinkDescribeCdrIbDetailsResponseBodyDataCdrIbDetails setUniqueId(String uniqueId) {
            this.uniqueId = uniqueId;
            return this;
        }
        public String getUniqueId() {
            return this.uniqueId;
        }

    }

    public static class ClinkDescribeCdrIbDetailsResponseBodyData extends TeaModel {
        /**
         * <p>[呼入通话记录明细] #呼入通话记录明细</p>
         */
        @NameInMap("CdrIbDetails")
        public java.util.List<ClinkDescribeCdrIbDetailsResponseBodyDataCdrIbDetails> cdrIbDetails;

        /**
         * <p>请求 id</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("ClinkRequestId")
        public String clinkRequestId;

        public static ClinkDescribeCdrIbDetailsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ClinkDescribeCdrIbDetailsResponseBodyData self = new ClinkDescribeCdrIbDetailsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ClinkDescribeCdrIbDetailsResponseBodyData setCdrIbDetails(java.util.List<ClinkDescribeCdrIbDetailsResponseBodyDataCdrIbDetails> cdrIbDetails) {
            this.cdrIbDetails = cdrIbDetails;
            return this;
        }
        public java.util.List<ClinkDescribeCdrIbDetailsResponseBodyDataCdrIbDetails> getCdrIbDetails() {
            return this.cdrIbDetails;
        }

        public ClinkDescribeCdrIbDetailsResponseBodyData setClinkRequestId(String clinkRequestId) {
            this.clinkRequestId = clinkRequestId;
            return this;
        }
        public String getClinkRequestId() {
            return this.clinkRequestId;
        }

    }

}
