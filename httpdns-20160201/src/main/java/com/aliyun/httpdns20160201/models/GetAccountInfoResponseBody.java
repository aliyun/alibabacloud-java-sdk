// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.httpdns20160201.models;

import com.aliyun.tea.*;

public class GetAccountInfoResponseBody extends TeaModel {
    /**
     * <p>The current account information.</p>
     */
    @NameInMap("AccountInfo")
    public GetAccountInfoResponseBodyAccountInfo accountInfo;

    /**
     * <p>The request ID.</p>
     * 
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
         * <p>The account ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1337****</p>
         */
        @NameInMap("AccountId")
        public String accountId;

        /**
         * <p>Indicates whether the DNS over HTTPS (DoH) feature is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("DohEnabled")
        public Boolean dohEnabled;

        /**
         * <p>Indicates whether DoH is used to resolve all domain names.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("DohResolveAllEnabled")
        public Boolean dohResolveAllEnabled;

        /**
         * <p>The number of DoH resolutions for the current month.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("MonthDohResolveCount")
        public Long monthDohResolveCount;

        /**
         * <p>The monthly free resolution quota. This is the number of times you can call the HTTPDNS service for domain name resolution free of charge each calendar month.</p>
         * 
         * <strong>example:</strong>
         * <p>1500000</p>
         */
        @NameInMap("MonthFreeCount")
        public Integer monthFreeCount;

        /**
         * <p>The number of HTTP AES-encrypted resolutions for the current month.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("MonthHttpAesResolveCount")
        public Long monthHttpAesResolveCount;

        /**
         * <p>The number of HTTPS AES-encrypted resolutions for the current month.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("MonthHttpsAesResolveCount")
        public Long monthHttpsAesResolveCount;

        /**
         * <p>The total number of HTTPS resolutions for the current month.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("MonthHttpsResolveCount")
        public Integer monthHttpsResolveCount;

        /**
         * <p>The total number of HTTP resolutions for the current month.</p>
         * 
         * <strong>example:</strong>
         * <p>9927326</p>
         */
        @NameInMap("MonthResolveCount")
        public Integer monthResolveCount;

        /**
         * <p>The number of resource plans. This is a legacy field and is always set to 0.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PackageCount")
        public Integer packageCount;

        /**
         * <p>The signing secret.</p>
         * 
         * <strong>example:</strong>
         * <p>50F9C40E****</p>
         */
        @NameInMap("SignSecret")
        public String signSecret;

        /**
         * <p>The number of requests to authenticated API operations.</p>
         * 
         * <strong>example:</strong>
         * <p>611523</p>
         */
        @NameInMap("SignedCount")
        public Long signedCount;

        /**
         * <p>The number of requests to unauthenticated API operations.</p>
         * 
         * <strong>example:</strong>
         * <p>1523</p>
         */
        @NameInMap("UnsignedCount")
        public Long unsignedCount;

        /**
         * <p>Indicates whether unauthenticated API operations are enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("UnsignedEnabled")
        public Boolean unsignedEnabled;

        /**
         * <p>The HTTPDNS account status code. Valid values:</p>
         * <ul>
         * <li>1: The account is normal.</li>
         * <li>2: The account has an overdue payment.</li>
         * <li>3: The account is suspended.</li>
         * </ul>
         * 
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

        public GetAccountInfoResponseBodyAccountInfo setDohEnabled(Boolean dohEnabled) {
            this.dohEnabled = dohEnabled;
            return this;
        }
        public Boolean getDohEnabled() {
            return this.dohEnabled;
        }

        public GetAccountInfoResponseBodyAccountInfo setDohResolveAllEnabled(Boolean dohResolveAllEnabled) {
            this.dohResolveAllEnabled = dohResolveAllEnabled;
            return this;
        }
        public Boolean getDohResolveAllEnabled() {
            return this.dohResolveAllEnabled;
        }

        public GetAccountInfoResponseBodyAccountInfo setMonthDohResolveCount(Long monthDohResolveCount) {
            this.monthDohResolveCount = monthDohResolveCount;
            return this;
        }
        public Long getMonthDohResolveCount() {
            return this.monthDohResolveCount;
        }

        public GetAccountInfoResponseBodyAccountInfo setMonthFreeCount(Integer monthFreeCount) {
            this.monthFreeCount = monthFreeCount;
            return this;
        }
        public Integer getMonthFreeCount() {
            return this.monthFreeCount;
        }

        public GetAccountInfoResponseBodyAccountInfo setMonthHttpAesResolveCount(Long monthHttpAesResolveCount) {
            this.monthHttpAesResolveCount = monthHttpAesResolveCount;
            return this;
        }
        public Long getMonthHttpAesResolveCount() {
            return this.monthHttpAesResolveCount;
        }

        public GetAccountInfoResponseBodyAccountInfo setMonthHttpsAesResolveCount(Long monthHttpsAesResolveCount) {
            this.monthHttpsAesResolveCount = monthHttpsAesResolveCount;
            return this;
        }
        public Long getMonthHttpsAesResolveCount() {
            return this.monthHttpsAesResolveCount;
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
