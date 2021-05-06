// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeAccountsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("AccountList")
    public DescribeAccountsResponseBodyAccountList accountList;

    public static DescribeAccountsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAccountsResponseBody self = new DescribeAccountsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAccountsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAccountsResponseBody setAccountList(DescribeAccountsResponseBodyAccountList accountList) {
        this.accountList = accountList;
        return this;
    }
    public DescribeAccountsResponseBodyAccountList getAccountList() {
        return this.accountList;
    }

    public static class DescribeAccountsResponseBodyAccountListDBAccount extends TeaModel {
        @NameInMap("AccountStatus")
        public String accountStatus;

        @NameInMap("AccountDescription")
        public String accountDescription;

        @NameInMap("AccountType")
        public String accountType;

        @NameInMap("AccountName")
        public String accountName;

        public static DescribeAccountsResponseBodyAccountListDBAccount build(java.util.Map<String, ?> map) throws Exception {
            DescribeAccountsResponseBodyAccountListDBAccount self = new DescribeAccountsResponseBodyAccountListDBAccount();
            return TeaModel.build(map, self);
        }

        public DescribeAccountsResponseBodyAccountListDBAccount setAccountStatus(String accountStatus) {
            this.accountStatus = accountStatus;
            return this;
        }
        public String getAccountStatus() {
            return this.accountStatus;
        }

        public DescribeAccountsResponseBodyAccountListDBAccount setAccountDescription(String accountDescription) {
            this.accountDescription = accountDescription;
            return this;
        }
        public String getAccountDescription() {
            return this.accountDescription;
        }

        public DescribeAccountsResponseBodyAccountListDBAccount setAccountType(String accountType) {
            this.accountType = accountType;
            return this;
        }
        public String getAccountType() {
            return this.accountType;
        }

        public DescribeAccountsResponseBodyAccountListDBAccount setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

    }

    public static class DescribeAccountsResponseBodyAccountList extends TeaModel {
        @NameInMap("DBAccount")
        public java.util.List<DescribeAccountsResponseBodyAccountListDBAccount> DBAccount;

        public static DescribeAccountsResponseBodyAccountList build(java.util.Map<String, ?> map) throws Exception {
            DescribeAccountsResponseBodyAccountList self = new DescribeAccountsResponseBodyAccountList();
            return TeaModel.build(map, self);
        }

        public DescribeAccountsResponseBodyAccountList setDBAccount(java.util.List<DescribeAccountsResponseBodyAccountListDBAccount> DBAccount) {
            this.DBAccount = DBAccount;
            return this;
        }
        public java.util.List<DescribeAccountsResponseBodyAccountListDBAccount> getDBAccount() {
            return this.DBAccount;
        }

    }

}
