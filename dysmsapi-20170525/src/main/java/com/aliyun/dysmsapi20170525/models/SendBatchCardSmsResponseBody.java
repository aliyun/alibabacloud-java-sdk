// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class SendBatchCardSmsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public SendBatchCardSmsResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static SendBatchCardSmsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SendBatchCardSmsResponseBody self = new SendBatchCardSmsResponseBody();
        return TeaModel.build(map, self);
    }

    public SendBatchCardSmsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SendBatchCardSmsResponseBody setData(SendBatchCardSmsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SendBatchCardSmsResponseBodyData getData() {
        return this.data;
    }

    public SendBatchCardSmsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SendBatchCardSmsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SendBatchCardSmsResponseBodyData extends TeaModel {
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

        public static SendBatchCardSmsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SendBatchCardSmsResponseBodyData self = new SendBatchCardSmsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SendBatchCardSmsResponseBodyData setBizCardId(String bizCardId) {
            this.bizCardId = bizCardId;
            return this;
        }
        public String getBizCardId() {
            return this.bizCardId;
        }

        public SendBatchCardSmsResponseBodyData setBizDigitalId(String bizDigitalId) {
            this.bizDigitalId = bizDigitalId;
            return this;
        }
        public String getBizDigitalId() {
            return this.bizDigitalId;
        }

        public SendBatchCardSmsResponseBodyData setBizSmsId(String bizSmsId) {
            this.bizSmsId = bizSmsId;
            return this;
        }
        public String getBizSmsId() {
            return this.bizSmsId;
        }

        public SendBatchCardSmsResponseBodyData setCardTmpState(Integer cardTmpState) {
            this.cardTmpState = cardTmpState;
            return this;
        }
        public Integer getCardTmpState() {
            return this.cardTmpState;
        }

        public SendBatchCardSmsResponseBodyData setMediaMobiles(String mediaMobiles) {
            this.mediaMobiles = mediaMobiles;
            return this;
        }
        public String getMediaMobiles() {
            return this.mediaMobiles;
        }

        public SendBatchCardSmsResponseBodyData setNotMediaMobiles(String notMediaMobiles) {
            this.notMediaMobiles = notMediaMobiles;
            return this;
        }
        public String getNotMediaMobiles() {
            return this.notMediaMobiles;
        }

    }

}
