// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.httpdns20160201.models;

import com.aliyun.tea.*;

public class GetAccountInfoResponseBody extends TeaModel {
    @NameInMap("AccountInfo")
    public GetAccountInfoResponseBodyAccountInfo accountInfo;

    /**
     * <strong>example:</strong>
     * <p>50F9C40E-188D-4208-BE2C-74271337****</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>1337****</p>
         */
        @NameInMap("AccountId")
        public String accountId;

        /**
         * <strong>example:</strong>
         * <p>1500000</p>
         */
        @NameInMap("MonthFreeCount")
        public Integer monthFreeCount;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("MonthHttpsResolveCount")
        public Integer monthHttpsResolveCount;

        /**
         * <strong>example:</strong>
         * <p>9927326</p>
         */
        @NameInMap("MonthResolveCount")
        public Integer monthResolveCount;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PackageCount")
        public Integer packageCount;

        /**
         * <strong>example:</strong>
         * <p>50F9C40E****</p>
         */
        @NameInMap("SignSecret")
        public String signSecret;

        /**
         * <strong>example:</strong>
         * <p>611523</p>
         */
        @NameInMap("SignedCount")
        public Long signedCount;

        /**
         * <strong>example:</strong>
         * <p>1523</p>
         */
        @NameInMap("UnsignedCount")
        public Long unsignedCount;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("UnsignedEnabled")
        public Boolean unsignedEnabled;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("UserStatus")
        public Integer userStatus;

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

        public GetAccountInfoResponseBodyAccountInfo setPackageCount(Integer packageCount) {
            this.packageCount = packageCount;
            return this;
        }
        public Integer getPackageCount() {
            return this.packageCount;
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

        public GetAccountInfoResponseBodyAccountInfo setUserStatus(Integer userStatus) {
            this.userStatus = userStatus;
            return this;
        }
        public Integer getUserStatus() {
            return this.userStatus;
        }

    }

}
