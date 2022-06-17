// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class GetCardSmsLinkResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetCardSmsLinkResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetCardSmsLinkResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCardSmsLinkResponseBody self = new GetCardSmsLinkResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCardSmsLinkResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetCardSmsLinkResponseBody setData(GetCardSmsLinkResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetCardSmsLinkResponseBodyData getData() {
        return this.data;
    }

    public GetCardSmsLinkResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCardSmsLinkResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetCardSmsLinkResponseBodyData extends TeaModel {
        @NameInMap("CardPhoneNumbers")
        public String cardPhoneNumbers;

        @NameInMap("CardSignNames")
        public String cardSignNames;

        @NameInMap("CardSmsLinks")
        public String cardSmsLinks;

        @NameInMap("CardTmpState")
        public Integer cardTmpState;

        @NameInMap("NotMediaMobiles")
        public String notMediaMobiles;

        public static GetCardSmsLinkResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetCardSmsLinkResponseBodyData self = new GetCardSmsLinkResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetCardSmsLinkResponseBodyData setCardPhoneNumbers(String cardPhoneNumbers) {
            this.cardPhoneNumbers = cardPhoneNumbers;
            return this;
        }
        public String getCardPhoneNumbers() {
            return this.cardPhoneNumbers;
        }

        public GetCardSmsLinkResponseBodyData setCardSignNames(String cardSignNames) {
            this.cardSignNames = cardSignNames;
            return this;
        }
        public String getCardSignNames() {
            return this.cardSignNames;
        }

        public GetCardSmsLinkResponseBodyData setCardSmsLinks(String cardSmsLinks) {
            this.cardSmsLinks = cardSmsLinks;
            return this;
        }
        public String getCardSmsLinks() {
            return this.cardSmsLinks;
        }

        public GetCardSmsLinkResponseBodyData setCardTmpState(Integer cardTmpState) {
            this.cardTmpState = cardTmpState;
            return this;
        }
        public Integer getCardTmpState() {
            return this.cardTmpState;
        }

        public GetCardSmsLinkResponseBodyData setNotMediaMobiles(String notMediaMobiles) {
            this.notMediaMobiles = notMediaMobiles;
            return this;
        }
        public String getNotMediaMobiles() {
            return this.notMediaMobiles;
        }

    }

}
