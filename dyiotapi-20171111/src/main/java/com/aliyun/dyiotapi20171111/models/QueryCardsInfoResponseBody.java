// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyiotapi20171111.models;

import com.aliyun.tea.*;

public class QueryCardsInfoResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("CardsInfo")
    public java.util.List<QueryCardsInfoResponseBodyCardsInfo> cardsInfo;

    @NameInMap("Code")
    public String code;

    public static QueryCardsInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryCardsInfoResponseBody self = new QueryCardsInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryCardsInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryCardsInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryCardsInfoResponseBody setCardsInfo(java.util.List<QueryCardsInfoResponseBodyCardsInfo> cardsInfo) {
        this.cardsInfo = cardsInfo;
        return this;
    }
    public java.util.List<QueryCardsInfoResponseBodyCardsInfo> getCardsInfo() {
        return this.cardsInfo;
    }

    public QueryCardsInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class QueryCardsInfoResponseBodyCardsInfo extends TeaModel {
        @NameInMap("Imsi")
        public String imsi;

        @NameInMap("Msisdn")
        public String msisdn;

        @NameInMap("GprsStatus")
        public String gprsStatus;

        @NameInMap("VoiceStatus")
        public String voiceStatus;

        @NameInMap("SmsStatus")
        public String smsStatus;

        @NameInMap("Iccid")
        public String iccid;

        @NameInMap("FirstActiveTime")
        public String firstActiveTime;

        @NameInMap("OpenTime")
        public String openTime;

        public static QueryCardsInfoResponseBodyCardsInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryCardsInfoResponseBodyCardsInfo self = new QueryCardsInfoResponseBodyCardsInfo();
            return TeaModel.build(map, self);
        }

        public QueryCardsInfoResponseBodyCardsInfo setImsi(String imsi) {
            this.imsi = imsi;
            return this;
        }
        public String getImsi() {
            return this.imsi;
        }

        public QueryCardsInfoResponseBodyCardsInfo setMsisdn(String msisdn) {
            this.msisdn = msisdn;
            return this;
        }
        public String getMsisdn() {
            return this.msisdn;
        }

        public QueryCardsInfoResponseBodyCardsInfo setGprsStatus(String gprsStatus) {
            this.gprsStatus = gprsStatus;
            return this;
        }
        public String getGprsStatus() {
            return this.gprsStatus;
        }

        public QueryCardsInfoResponseBodyCardsInfo setVoiceStatus(String voiceStatus) {
            this.voiceStatus = voiceStatus;
            return this;
        }
        public String getVoiceStatus() {
            return this.voiceStatus;
        }

        public QueryCardsInfoResponseBodyCardsInfo setSmsStatus(String smsStatus) {
            this.smsStatus = smsStatus;
            return this;
        }
        public String getSmsStatus() {
            return this.smsStatus;
        }

        public QueryCardsInfoResponseBodyCardsInfo setIccid(String iccid) {
            this.iccid = iccid;
            return this;
        }
        public String getIccid() {
            return this.iccid;
        }

        public QueryCardsInfoResponseBodyCardsInfo setFirstActiveTime(String firstActiveTime) {
            this.firstActiveTime = firstActiveTime;
            return this;
        }
        public String getFirstActiveTime() {
            return this.firstActiveTime;
        }

        public QueryCardsInfoResponseBodyCardsInfo setOpenTime(String openTime) {
            this.openTime = openTime;
            return this;
        }
        public String getOpenTime() {
            return this.openTime;
        }

    }

}
