// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class SendCardSmsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public SendCardSmsResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static SendCardSmsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SendCardSmsResponseBody self = new SendCardSmsResponseBody();
        return TeaModel.build(map, self);
    }

    public SendCardSmsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SendCardSmsResponseBody setData(SendCardSmsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SendCardSmsResponseBodyData getData() {
        return this.data;
    }

    public SendCardSmsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SendCardSmsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SendCardSmsResponseBodyData extends TeaModel {
        @NameInMap("BizCardId")
        public String bizCardId;

        @NameInMap("BizDigitalId")
        public String bizDigitalId;

        @NameInMap("BizSmsId")
        public String bizSmsId;

        @NameInMap("CardTmpState")
        public Integer cardTmpState;

        @NameInMap("MediaMobiles")
        public String mediaMobiles;

        @NameInMap("NotMediaMobiles")
        public String notMediaMobiles;

        public static SendCardSmsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SendCardSmsResponseBodyData self = new SendCardSmsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SendCardSmsResponseBodyData setBizCardId(String bizCardId) {
            this.bizCardId = bizCardId;
            return this;
        }
        public String getBizCardId() {
            return this.bizCardId;
        }

        public SendCardSmsResponseBodyData setBizDigitalId(String bizDigitalId) {
            this.bizDigitalId = bizDigitalId;
            return this;
        }
        public String getBizDigitalId() {
            return this.bizDigitalId;
        }

        public SendCardSmsResponseBodyData setBizSmsId(String bizSmsId) {
            this.bizSmsId = bizSmsId;
            return this;
        }
        public String getBizSmsId() {
            return this.bizSmsId;
        }

        public SendCardSmsResponseBodyData setCardTmpState(Integer cardTmpState) {
            this.cardTmpState = cardTmpState;
            return this;
        }
        public Integer getCardTmpState() {
            return this.cardTmpState;
        }

        public SendCardSmsResponseBodyData setMediaMobiles(String mediaMobiles) {
            this.mediaMobiles = mediaMobiles;
            return this;
        }
        public String getMediaMobiles() {
            return this.mediaMobiles;
        }

        public SendCardSmsResponseBodyData setNotMediaMobiles(String notMediaMobiles) {
            this.notMediaMobiles = notMediaMobiles;
            return this;
        }
        public String getNotMediaMobiles() {
            return this.notMediaMobiles;
        }

    }

}
