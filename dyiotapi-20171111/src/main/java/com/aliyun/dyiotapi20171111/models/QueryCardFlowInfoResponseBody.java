// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyiotapi20171111.models;

import com.aliyun.tea.*;

public class QueryCardFlowInfoResponseBody extends TeaModel {
    @NameInMap("CardFlowInfos")
    public QueryCardFlowInfoResponseBodyCardFlowInfos cardFlowInfos;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public String code;

    public static QueryCardFlowInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryCardFlowInfoResponseBody self = new QueryCardFlowInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryCardFlowInfoResponseBody setCardFlowInfos(QueryCardFlowInfoResponseBodyCardFlowInfos cardFlowInfos) {
        this.cardFlowInfos = cardFlowInfos;
        return this;
    }
    public QueryCardFlowInfoResponseBodyCardFlowInfos getCardFlowInfos() {
        return this.cardFlowInfos;
    }

    public QueryCardFlowInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryCardFlowInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryCardFlowInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class QueryCardFlowInfoResponseBodyCardFlowInfosCardFlowInfo extends TeaModel {
        @NameInMap("ValidDate")
        public String validDate;

        @NameInMap("VoiceUsed")
        public Long voiceUsed;

        @NameInMap("ResourceType")
        public String resourceType;

        @NameInMap("FlowUsed")
        public Long flowUsed;

        @NameInMap("VoiceTotal")
        public Long voiceTotal;

        @NameInMap("ExpireDate")
        public String expireDate;

        @NameInMap("SmsUsed")
        public Long smsUsed;

        @NameInMap("RestOfFlow")
        public Long restOfFlow;

        @NameInMap("FlowResource")
        public Long flowResource;

        @NameInMap("ResName")
        public String resName;

        public static QueryCardFlowInfoResponseBodyCardFlowInfosCardFlowInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryCardFlowInfoResponseBodyCardFlowInfosCardFlowInfo self = new QueryCardFlowInfoResponseBodyCardFlowInfosCardFlowInfo();
            return TeaModel.build(map, self);
        }

        public QueryCardFlowInfoResponseBodyCardFlowInfosCardFlowInfo setValidDate(String validDate) {
            this.validDate = validDate;
            return this;
        }
        public String getValidDate() {
            return this.validDate;
        }

        public QueryCardFlowInfoResponseBodyCardFlowInfosCardFlowInfo setVoiceUsed(Long voiceUsed) {
            this.voiceUsed = voiceUsed;
            return this;
        }
        public Long getVoiceUsed() {
            return this.voiceUsed;
        }

        public QueryCardFlowInfoResponseBodyCardFlowInfosCardFlowInfo setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public QueryCardFlowInfoResponseBodyCardFlowInfosCardFlowInfo setFlowUsed(Long flowUsed) {
            this.flowUsed = flowUsed;
            return this;
        }
        public Long getFlowUsed() {
            return this.flowUsed;
        }

        public QueryCardFlowInfoResponseBodyCardFlowInfosCardFlowInfo setVoiceTotal(Long voiceTotal) {
            this.voiceTotal = voiceTotal;
            return this;
        }
        public Long getVoiceTotal() {
            return this.voiceTotal;
        }

        public QueryCardFlowInfoResponseBodyCardFlowInfosCardFlowInfo setExpireDate(String expireDate) {
            this.expireDate = expireDate;
            return this;
        }
        public String getExpireDate() {
            return this.expireDate;
        }

        public QueryCardFlowInfoResponseBodyCardFlowInfosCardFlowInfo setSmsUsed(Long smsUsed) {
            this.smsUsed = smsUsed;
            return this;
        }
        public Long getSmsUsed() {
            return this.smsUsed;
        }

        public QueryCardFlowInfoResponseBodyCardFlowInfosCardFlowInfo setRestOfFlow(Long restOfFlow) {
            this.restOfFlow = restOfFlow;
            return this;
        }
        public Long getRestOfFlow() {
            return this.restOfFlow;
        }

        public QueryCardFlowInfoResponseBodyCardFlowInfosCardFlowInfo setFlowResource(Long flowResource) {
            this.flowResource = flowResource;
            return this;
        }
        public Long getFlowResource() {
            return this.flowResource;
        }

        public QueryCardFlowInfoResponseBodyCardFlowInfosCardFlowInfo setResName(String resName) {
            this.resName = resName;
            return this;
        }
        public String getResName() {
            return this.resName;
        }

    }

    public static class QueryCardFlowInfoResponseBodyCardFlowInfos extends TeaModel {
        @NameInMap("CardFlowInfo")
        public java.util.List<QueryCardFlowInfoResponseBodyCardFlowInfosCardFlowInfo> cardFlowInfo;

        public static QueryCardFlowInfoResponseBodyCardFlowInfos build(java.util.Map<String, ?> map) throws Exception {
            QueryCardFlowInfoResponseBodyCardFlowInfos self = new QueryCardFlowInfoResponseBodyCardFlowInfos();
            return TeaModel.build(map, self);
        }

        public QueryCardFlowInfoResponseBodyCardFlowInfos setCardFlowInfo(java.util.List<QueryCardFlowInfoResponseBodyCardFlowInfosCardFlowInfo> cardFlowInfo) {
            this.cardFlowInfo = cardFlowInfo;
            return this;
        }
        public java.util.List<QueryCardFlowInfoResponseBodyCardFlowInfosCardFlowInfo> getCardFlowInfo() {
            return this.cardFlowInfo;
        }

    }

}
