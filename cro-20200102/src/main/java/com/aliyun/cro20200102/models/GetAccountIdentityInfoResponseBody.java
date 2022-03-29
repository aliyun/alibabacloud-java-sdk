// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cro20200102.models;

import com.aliyun.tea.*;

public class GetAccountIdentityInfoResponseBody extends TeaModel {
    @NameInMap("AccountIdentityInfo")
    public GetAccountIdentityInfoResponseBodyAccountIdentityInfo accountIdentityInfo;

    @NameInMap("RequestId")
    public String requestId;

    public static GetAccountIdentityInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAccountIdentityInfoResponseBody self = new GetAccountIdentityInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAccountIdentityInfoResponseBody setAccountIdentityInfo(GetAccountIdentityInfoResponseBodyAccountIdentityInfo accountIdentityInfo) {
        this.accountIdentityInfo = accountIdentityInfo;
        return this;
    }
    public GetAccountIdentityInfoResponseBodyAccountIdentityInfo getAccountIdentityInfo() {
        return this.accountIdentityInfo;
    }

    public GetAccountIdentityInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetAccountIdentityInfoResponseBodyAccountIdentityInfo extends TeaModel {
        @NameInMap("CardNumber")
        public String cardNumber;

        @NameInMap("Name")
        public String name;

        public static GetAccountIdentityInfoResponseBodyAccountIdentityInfo build(java.util.Map<String, ?> map) throws Exception {
            GetAccountIdentityInfoResponseBodyAccountIdentityInfo self = new GetAccountIdentityInfoResponseBodyAccountIdentityInfo();
            return TeaModel.build(map, self);
        }

        public GetAccountIdentityInfoResponseBodyAccountIdentityInfo setCardNumber(String cardNumber) {
            this.cardNumber = cardNumber;
            return this;
        }
        public String getCardNumber() {
            return this.cardNumber;
        }

        public GetAccountIdentityInfoResponseBodyAccountIdentityInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
