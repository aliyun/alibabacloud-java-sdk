// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class ClinkCdrObDetailsResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ClinkCdrObDetailsResponseBodyData data;

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

    public static ClinkCdrObDetailsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ClinkCdrObDetailsResponseBody self = new ClinkCdrObDetailsResponseBody();
        return TeaModel.build(map, self);
    }

    public ClinkCdrObDetailsResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public ClinkCdrObDetailsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ClinkCdrObDetailsResponseBody setData(ClinkCdrObDetailsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ClinkCdrObDetailsResponseBodyData getData() {
        return this.data;
    }

    public ClinkCdrObDetailsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ClinkCdrObDetailsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ClinkCdrObDetailsResponseBodyDataCdrObDetails extends TeaModel {
        /**
         * <p>客户接听时间</p>
         * 
         * <strong>example:</strong>
         * <p>1717583928</p>
         */
        @NameInMap("AnswerTime")
        public Long answerTime;

        /**
         * <p>通话时长</p>
         * 
         * <strong>example:</strong>
         * <p>43</p>
         */
        @NameInMap("BridgeDuration")
        public Long bridgeDuration;

        /**
         * <p>CallID</p>
         * 
         * <strong>example:</strong>
         * <p>1d7acd5d-xxxx-xxxx-xxxx-0d3c08317140</p>
         */
        @NameInMap("CallId")
        public String callId;

        /**
         * <p>通话类型，说明参考 通用字段 #通用字段</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("CallType")
        public Long callType;

        /**
         * <p>通话类型描述</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值示例值</p>
         */
        @NameInMap("CallTypeDesc")
        public String callTypeDesc;

        /**
         * <p>客户响铃时间</p>
         * 
         * <strong>example:</strong>
         * <p>1717583922</p>
         */
        @NameInMap("CalleeRingingTime")
        public Long calleeRingingTime;

        /**
         * <p>座席名称</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
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
         * <p>呼叫类型，说明参考 通用字段 #通用字段</p>
         * 
         * <strong>example:</strong>
         * <p>208</p>
         */
        @NameInMap("DetailCallType")
        public Long detailCallType;

        /**
         * <p>呼叫类型描述</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("DetailCallTypeDesc")
        public String detailCallTypeDesc;

        /**
         * <p>结束时间</p>
         * 
         * <strong>example:</strong>
         * <p>1717583950</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>通话ID</p>
         * 
         * <strong>example:</strong>
         * <p>medias_1-162046xxxx.12</p>
         */
        @NameInMap("MainUniqueId")
        public String mainUniqueId;

        /**
         * <p>呼叫结果</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("ObSipCause")
        public String obSipCause;

        /**
         * <p>被叫状态</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("ObSipCauseRaw")
        public String obSipCauseRaw;

        /**
         * <p>录音</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("RecordFile")
        public String recordFile;

        /**
         * <p>呼叫情况</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("SipCause")
        public Long sipCause;

        /**
         * <p>呼叫情况描述</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("SipCauseDesc")
        public String sipCauseDesc;

        /**
         * <p>开始时间</p>
         * 
         * <strong>example:</strong>
         * <p>1717583916</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        /**
         * <p>客户彩铃录音</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("TsiFile")
        public String tsiFile;

        /**
         * <p>通话唯一ID</p>
         * 
         * <strong>example:</strong>
         * <p>uniq_1-162046xxxx.12</p>
         */
        @NameInMap("UniqueId")
        public String uniqueId;

        /**
         * <p>WebRTCCallID</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("WebrtcCallId")
        public String webrtcCallId;

        public static ClinkCdrObDetailsResponseBodyDataCdrObDetails build(java.util.Map<String, ?> map) throws Exception {
            ClinkCdrObDetailsResponseBodyDataCdrObDetails self = new ClinkCdrObDetailsResponseBodyDataCdrObDetails();
            return TeaModel.build(map, self);
        }

        public ClinkCdrObDetailsResponseBodyDataCdrObDetails setAnswerTime(Long answerTime) {
            this.answerTime = answerTime;
            return this;
        }
        public Long getAnswerTime() {
            return this.answerTime;
        }

        public ClinkCdrObDetailsResponseBodyDataCdrObDetails setBridgeDuration(Long bridgeDuration) {
            this.bridgeDuration = bridgeDuration;
            return this;
        }
        public Long getBridgeDuration() {
            return this.bridgeDuration;
        }

        public ClinkCdrObDetailsResponseBodyDataCdrObDetails setCallId(String callId) {
            this.callId = callId;
            return this;
        }
        public String getCallId() {
            return this.callId;
        }

        public ClinkCdrObDetailsResponseBodyDataCdrObDetails setCallType(Long callType) {
            this.callType = callType;
            return this;
        }
        public Long getCallType() {
            return this.callType;
        }

        public ClinkCdrObDetailsResponseBodyDataCdrObDetails setCallTypeDesc(String callTypeDesc) {
            this.callTypeDesc = callTypeDesc;
            return this;
        }
        public String getCallTypeDesc() {
            return this.callTypeDesc;
        }

        public ClinkCdrObDetailsResponseBodyDataCdrObDetails setCalleeRingingTime(Long calleeRingingTime) {
            this.calleeRingingTime = calleeRingingTime;
            return this;
        }
        public Long getCalleeRingingTime() {
            return this.calleeRingingTime;
        }

        public ClinkCdrObDetailsResponseBodyDataCdrObDetails setClientName(String clientName) {
            this.clientName = clientName;
            return this;
        }
        public String getClientName() {
            return this.clientName;
        }

        public ClinkCdrObDetailsResponseBodyDataCdrObDetails setClientNumber(String clientNumber) {
            this.clientNumber = clientNumber;
            return this;
        }
        public String getClientNumber() {
            return this.clientNumber;
        }

        public ClinkCdrObDetailsResponseBodyDataCdrObDetails setCno(String cno) {
            this.cno = cno;
            return this;
        }
        public String getCno() {
            return this.cno;
        }

        public ClinkCdrObDetailsResponseBodyDataCdrObDetails setDetailCallType(Long detailCallType) {
            this.detailCallType = detailCallType;
            return this;
        }
        public Long getDetailCallType() {
            return this.detailCallType;
        }

        public ClinkCdrObDetailsResponseBodyDataCdrObDetails setDetailCallTypeDesc(String detailCallTypeDesc) {
            this.detailCallTypeDesc = detailCallTypeDesc;
            return this;
        }
        public String getDetailCallTypeDesc() {
            return this.detailCallTypeDesc;
        }

        public ClinkCdrObDetailsResponseBodyDataCdrObDetails setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public ClinkCdrObDetailsResponseBodyDataCdrObDetails setMainUniqueId(String mainUniqueId) {
            this.mainUniqueId = mainUniqueId;
            return this;
        }
        public String getMainUniqueId() {
            return this.mainUniqueId;
        }

        public ClinkCdrObDetailsResponseBodyDataCdrObDetails setObSipCause(String obSipCause) {
            this.obSipCause = obSipCause;
            return this;
        }
        public String getObSipCause() {
            return this.obSipCause;
        }

        public ClinkCdrObDetailsResponseBodyDataCdrObDetails setObSipCauseRaw(String obSipCauseRaw) {
            this.obSipCauseRaw = obSipCauseRaw;
            return this;
        }
        public String getObSipCauseRaw() {
            return this.obSipCauseRaw;
        }

        public ClinkCdrObDetailsResponseBodyDataCdrObDetails setRecordFile(String recordFile) {
            this.recordFile = recordFile;
            return this;
        }
        public String getRecordFile() {
            return this.recordFile;
        }

        public ClinkCdrObDetailsResponseBodyDataCdrObDetails setSipCause(Long sipCause) {
            this.sipCause = sipCause;
            return this;
        }
        public Long getSipCause() {
            return this.sipCause;
        }

        public ClinkCdrObDetailsResponseBodyDataCdrObDetails setSipCauseDesc(String sipCauseDesc) {
            this.sipCauseDesc = sipCauseDesc;
            return this;
        }
        public String getSipCauseDesc() {
            return this.sipCauseDesc;
        }

        public ClinkCdrObDetailsResponseBodyDataCdrObDetails setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public ClinkCdrObDetailsResponseBodyDataCdrObDetails setTsiFile(String tsiFile) {
            this.tsiFile = tsiFile;
            return this;
        }
        public String getTsiFile() {
            return this.tsiFile;
        }

        public ClinkCdrObDetailsResponseBodyDataCdrObDetails setUniqueId(String uniqueId) {
            this.uniqueId = uniqueId;
            return this;
        }
        public String getUniqueId() {
            return this.uniqueId;
        }

        public ClinkCdrObDetailsResponseBodyDataCdrObDetails setWebrtcCallId(String webrtcCallId) {
            this.webrtcCallId = webrtcCallId;
            return this;
        }
        public String getWebrtcCallId() {
            return this.webrtcCallId;
        }

    }

    public static class ClinkCdrObDetailsResponseBodyData extends TeaModel {
        /**
         * <p>[外呼详情] #外呼详情</p>
         */
        @NameInMap("CdrObDetails")
        public java.util.List<ClinkCdrObDetailsResponseBodyDataCdrObDetails> cdrObDetails;

        /**
         * <p>请求 id</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("ClinkRequestId")
        public String clinkRequestId;

        public static ClinkCdrObDetailsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ClinkCdrObDetailsResponseBodyData self = new ClinkCdrObDetailsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ClinkCdrObDetailsResponseBodyData setCdrObDetails(java.util.List<ClinkCdrObDetailsResponseBodyDataCdrObDetails> cdrObDetails) {
            this.cdrObDetails = cdrObDetails;
            return this;
        }
        public java.util.List<ClinkCdrObDetailsResponseBodyDataCdrObDetails> getCdrObDetails() {
            return this.cdrObDetails;
        }

        public ClinkCdrObDetailsResponseBodyData setClinkRequestId(String clinkRequestId) {
            this.clinkRequestId = clinkRequestId;
            return this;
        }
        public String getClinkRequestId() {
            return this.clinkRequestId;
        }

    }

}
