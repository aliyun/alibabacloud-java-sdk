// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.httpdns20160201.models;

import com.aliyun.tea.*;

public class GetAccountInfoResponseBody extends TeaModel {
    @NameInMap("AccountInfo")
    public GetAccountInfoResponseBodyAccountInfo accountInfo;

    @NameInMap("RequestId")
    public String requestId;

    public static GetAccountInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAccountInfoResponseBody self = new GetAccountInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAccountInfoResponseBody setAccountInfo(GetAccountInfoResponseBodyAccountInfo accountInfo) {
        this.accountInfo = accountInfo;
        return this;
    }
    public GetAccountInfoResponseBodyAccountInfo getAccountInfo() {
        return this.accountInfo;
    }

    public GetAccountInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetAccountInfoResponseBodyAccountInfo extends TeaModel {
        @NameInMap("AccountId")
        public String accountId;

        @NameInMap("MonthFreeCount")
        public Integer monthFreeCount;

        @NameInMap("MonthHttpsResolveCount")
        public Integer monthHttpsResolveCount;

        @NameInMap("MonthResolveCount")
        public Integer monthResolveCount;

        @NameInMap("SignSecret")
        public String signSecret;

        @NameInMap("SignedCount")
        public Long signedCount;

        @NameInMap("UnsignedCount")
        public Long unsignedCount;

        @NameInMap("UnsignedEnabled")
        public Boolean unsignedEnabled;

        public static GetAccountInfoResponseBodyAccountInfo build(java.util.Map<String, ?> map) throws Exception {
            GetAccountInfoResponseBodyAccountInfo self = new GetAccountInfoResponseBodyAccountInfo();
            return TeaModel.build(map, self);
        }

        public GetAccountInfoResponseBodyAccountInfo setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public GetAccountInfoResponseBodyAccountInfo setMonthFreeCount(Integer monthFreeCount) {
            this.monthFreeCount = monthFreeCount;
            return this;
        }
        public Integer getMonthFreeCount() {
            return this.monthFreeCount;
        }

        public GetAccountInfoResponseBodyAccountInfo setMonthHttpsResolveCount(Integer monthHttpsResolveCount) {
            this.monthHttpsResolveCount = monthHttpsResolveCount;
            return this;
        }
        public Integer getMonthHttpsResolveCount() {
            return this.monthHttpsResolveCount;
        }

        public GetAccountInfoResponseBodyAccountInfo setMonthResolveCount(Integer monthResolveCount) {
            this.monthResolveCount = monthResolveCount;
            return this;
        }
        public Integer getMonthResolveCount() {
            return this.monthResolveCount;
        }

        public GetAccountInfoResponseBodyAccountInfo setSignSecret(String signSecret) {
            this.signSecret = signSecret;
            return this;
        }
        public String getSignSecret() {
            return this.signSecret;
        }

        public GetAccountInfoResponseBodyAccountInfo setSignedCount(Long signedCount) {
            this.signedCount = signedCount;
            return this;
        }
        public Long getSignedCount() {
            return this.signedCount;
        }

        public GetAccountInfoResponseBodyAccountInfo setUnsignedCount(Long unsignedCount) {
            this.unsignedCount = unsignedCount;
            return this;
        }
        public Long getUnsignedCount() {
            return this.unsignedCount;
        }

        public GetAccountInfoResponseBodyAccountInfo setUnsignedEnabled(Boolean unsignedEnabled) {
            this.unsignedEnabled = unsignedEnabled;
            return this;
        }
        public Boolean getUnsignedEnabled() {
            return this.unsignedEnabled;
        }

    }

}
