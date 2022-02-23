// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aas20150701.models;

import com.aliyun.tea.*;

public class ListAliyunAccountResponseBody extends TeaModel {
    @NameInMap("Accounts")
    public ListAliyunAccountResponseBodyAccounts accounts;

    @NameInMap("HasNext")
    public Boolean hasNext;

    @NameInMap("IsTruncated")
    public Boolean isTruncated;

    @NameInMap("Marker")
    public String marker;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalAccount")
    public Integer totalAccount;

    public static ListAliyunAccountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAliyunAccountResponseBody self = new ListAliyunAccountResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAliyunAccountResponseBody setAccounts(ListAliyunAccountResponseBodyAccounts accounts) {
        this.accounts = accounts;
        return this;
    }
    public ListAliyunAccountResponseBodyAccounts getAccounts() {
        return this.accounts;
    }

    public ListAliyunAccountResponseBody setHasNext(Boolean hasNext) {
        this.hasNext = hasNext;
        return this;
    }
    public Boolean getHasNext() {
        return this.hasNext;
    }

    public ListAliyunAccountResponseBody setIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
        return this;
    }
    public Boolean getIsTruncated() {
        return this.isTruncated;
    }

    public ListAliyunAccountResponseBody setMarker(String marker) {
        this.marker = marker;
        return this;
    }
    public String getMarker() {
        return this.marker;
    }

    public ListAliyunAccountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAliyunAccountResponseBody setTotalAccount(Integer totalAccount) {
        this.totalAccount = totalAccount;
        return this;
    }
    public Integer getTotalAccount() {
        return this.totalAccount;
    }

    public static class ListAliyunAccountResponseBodyAccountsAccount extends TeaModel {
        @NameInMap("AccountStatus")
        public String accountStatus;

        @NameInMap("AliyunId")
        public String aliyunId;

        @NameInMap("LastLoginDate")
        public String lastLoginDate;

        @NameInMap("PK")
        public String PK;

        public static ListAliyunAccountResponseBodyAccountsAccount build(java.util.Map<String, ?> map) throws Exception {
            ListAliyunAccountResponseBodyAccountsAccount self = new ListAliyunAccountResponseBodyAccountsAccount();
            return TeaModel.build(map, self);
        }

        public ListAliyunAccountResponseBodyAccountsAccount setAccountStatus(String accountStatus) {
            this.accountStatus = accountStatus;
            return this;
        }
        public String getAccountStatus() {
            return this.accountStatus;
        }

        public ListAliyunAccountResponseBodyAccountsAccount setAliyunId(String aliyunId) {
            this.aliyunId = aliyunId;
            return this;
        }
        public String getAliyunId() {
            return this.aliyunId;
        }

        public ListAliyunAccountResponseBodyAccountsAccount setLastLoginDate(String lastLoginDate) {
            this.lastLoginDate = lastLoginDate;
            return this;
        }
        public String getLastLoginDate() {
            return this.lastLoginDate;
        }

        public ListAliyunAccountResponseBodyAccountsAccount setPK(String PK) {
            this.PK = PK;
            return this;
        }
        public String getPK() {
            return this.PK;
        }

    }

    public static class ListAliyunAccountResponseBodyAccounts extends TeaModel {
        @NameInMap("Account")
        public java.util.List<ListAliyunAccountResponseBodyAccountsAccount> account;

        public static ListAliyunAccountResponseBodyAccounts build(java.util.Map<String, ?> map) throws Exception {
            ListAliyunAccountResponseBodyAccounts self = new ListAliyunAccountResponseBodyAccounts();
            return TeaModel.build(map, self);
        }

        public ListAliyunAccountResponseBodyAccounts setAccount(java.util.List<ListAliyunAccountResponseBodyAccountsAccount> account) {
            this.account = account;
            return this;
        }
        public java.util.List<ListAliyunAccountResponseBodyAccountsAccount> getAccount() {
            return this.account;
        }

    }

}
