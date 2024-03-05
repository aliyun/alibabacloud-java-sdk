// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.carbonfootprint20230711.models;

import com.aliyun.tea.*;

public class VerifyResponseBody extends TeaModel {
    @NameInMap("Data")
    public VerifyResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static VerifyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        VerifyResponseBody self = new VerifyResponseBody();
        return TeaModel.build(map, self);
    }

    public VerifyResponseBody setData(VerifyResponseBodyData data) {
        this.data = data;
        return this;
    }
    public VerifyResponseBodyData getData() {
        return this.data;
    }

    public VerifyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class VerifyResponseBodyDataAllMultiAccountUids extends TeaModel {
        @NameInMap("accountId")
        public String accountId;

        @NameInMap("displayName")
        public String displayName;

        public static VerifyResponseBodyDataAllMultiAccountUids build(java.util.Map<String, ?> map) throws Exception {
            VerifyResponseBodyDataAllMultiAccountUids self = new VerifyResponseBodyDataAllMultiAccountUids();
            return TeaModel.build(map, self);
        }

        public VerifyResponseBodyDataAllMultiAccountUids setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public VerifyResponseBodyDataAllMultiAccountUids setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

    }

    public static class VerifyResponseBodyData extends TeaModel {
        @NameInMap("AllowedUids")
        public java.util.List<String> allowedUids;

        @NameInMap("accountType")
        public Integer accountType;

        @NameInMap("allMultiAccountUids")
        public java.util.List<VerifyResponseBodyDataAllMultiAccountUids> allMultiAccountUids;

        @NameInMap("code")
        public String code;

        @NameInMap("message")
        public String message;

        @NameInMap("multiAccountsAllow")
        public Integer multiAccountsAllow;

        public static VerifyResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            VerifyResponseBodyData self = new VerifyResponseBodyData();
            return TeaModel.build(map, self);
        }

        public VerifyResponseBodyData setAllowedUids(java.util.List<String> allowedUids) {
            this.allowedUids = allowedUids;
            return this;
        }
        public java.util.List<String> getAllowedUids() {
            return this.allowedUids;
        }

        public VerifyResponseBodyData setAccountType(Integer accountType) {
            this.accountType = accountType;
            return this;
        }
        public Integer getAccountType() {
            return this.accountType;
        }

        public VerifyResponseBodyData setAllMultiAccountUids(java.util.List<VerifyResponseBodyDataAllMultiAccountUids> allMultiAccountUids) {
            this.allMultiAccountUids = allMultiAccountUids;
            return this;
        }
        public java.util.List<VerifyResponseBodyDataAllMultiAccountUids> getAllMultiAccountUids() {
            return this.allMultiAccountUids;
        }

        public VerifyResponseBodyData setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public VerifyResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public VerifyResponseBodyData setMultiAccountsAllow(Integer multiAccountsAllow) {
            this.multiAccountsAllow = multiAccountsAllow;
            return this;
        }
        public Integer getMultiAccountsAllow() {
            return this.multiAccountsAllow;
        }

    }

}
