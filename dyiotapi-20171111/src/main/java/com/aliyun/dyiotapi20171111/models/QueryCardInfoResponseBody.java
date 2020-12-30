// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyiotapi20171111.models;

import com.aliyun.tea.*;

public class QueryCardInfoResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("CardInfo")
    public QueryCardInfoResponseBodyCardInfo cardInfo;

    @NameInMap("Code")
    public String code;

    public static QueryCardInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryCardInfoResponseBody self = new QueryCardInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryCardInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryCardInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryCardInfoResponseBody setCardInfo(QueryCardInfoResponseBodyCardInfo cardInfo) {
        this.cardInfo = cardInfo;
        return this;
    }
    public QueryCardInfoResponseBodyCardInfo getCardInfo() {
        return this.cardInfo;
    }

    public QueryCardInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class QueryCardInfoResponseBodyCardInfo extends TeaModel {
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

        public static QueryCardInfoResponseBodyCardInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryCardInfoResponseBodyCardInfo self = new QueryCardInfoResponseBodyCardInfo();
            return TeaModel.build(map, self);
        }

        public QueryCardInfoResponseBodyCardInfo setImsi(String imsi) {
            this.imsi = imsi;
            return this;
        }
        public String getImsi() {
            return this.imsi;
        }

        public QueryCardInfoResponseBodyCardInfo setMsisdn(String msisdn) {
            this.msisdn = msisdn;
            return this;
        }
        public String getMsisdn() {
            return this.msisdn;
        }

        public QueryCardInfoResponseBodyCardInfo setGprsStatus(String gprsStatus) {
            this.gprsStatus = gprsStatus;
            return this;
        }
        public String getGprsStatus() {
            return this.gprsStatus;
        }

        public QueryCardInfoResponseBodyCardInfo setVoiceStatus(String voiceStatus) {
            this.voiceStatus = voiceStatus;
            return this;
        }
        public String getVoiceStatus() {
            return this.voiceStatus;
        }

        public QueryCardInfoResponseBodyCardInfo setSmsStatus(String smsStatus) {
            this.smsStatus = smsStatus;
            return this;
        }
        public String getSmsStatus() {
            return this.smsStatus;
        }

        public QueryCardInfoResponseBodyCardInfo setIccid(String iccid) {
            this.iccid = iccid;
            return this;
        }
        public String getIccid() {
            return this.iccid;
        }

        public QueryCardInfoResponseBodyCardInfo setFirstActiveTime(String firstActiveTime) {
            this.firstActiveTime = firstActiveTime;
            return this;
        }
        public String getFirstActiveTime() {
            return this.firstActiveTime;
        }

        public QueryCardInfoResponseBodyCardInfo setOpenTime(String openTime) {
            this.openTime = openTime;
            return this;
        }
        public String getOpenTime() {
            return this.openTime;
        }

    }

}
