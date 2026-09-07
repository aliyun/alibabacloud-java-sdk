// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeAccountsResponseBody extends TeaModel {
    @NameInMap("AccountList")
    public DescribeAccountsResponseBodyAccountList accountList;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9CCFAAB4-97B7-5800-B9F2-685EB596E3EF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeAccountsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAccountsResponseBody self = new DescribeAccountsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAccountsResponseBody setAccountList(DescribeAccountsResponseBodyAccountList accountList) {
        this.accountList = accountList;
        return this;
    }
    public DescribeAccountsResponseBodyAccountList getAccountList() {
        return this.accountList;
    }

    public DescribeAccountsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeAccountsResponseBodyAccountListDBAccountPromqlInsertPrivileges extends TeaModel {
        @NameInMap("PromqlInsertPrivileges")
        public java.util.List<String> promqlInsertPrivileges;

        public static DescribeAccountsResponseBodyAccountListDBAccountPromqlInsertPrivileges build(java.util.Map<String, ?> map) throws Exception {
            DescribeAccountsResponseBodyAccountListDBAccountPromqlInsertPrivileges self = new DescribeAccountsResponseBodyAccountListDBAccountPromqlInsertPrivileges();
            return TeaModel.build(map, self);
        }

        public DescribeAccountsResponseBodyAccountListDBAccountPromqlInsertPrivileges setPromqlInsertPrivileges(java.util.List<String> promqlInsertPrivileges) {
            this.promqlInsertPrivileges = promqlInsertPrivileges;
            return this;
        }
        public java.util.List<String> getPromqlInsertPrivileges() {
            return this.promqlInsertPrivileges;
        }

    }

    public static class DescribeAccountsResponseBodyAccountListDBAccountPromqlSelectNodes extends TeaModel {
        @NameInMap("PromqlSelectNodes")
        public java.util.List<String> promqlSelectNodes;

        public static DescribeAccountsResponseBodyAccountListDBAccountPromqlSelectNodes build(java.util.Map<String, ?> map) throws Exception {
            DescribeAccountsResponseBodyAccountListDBAccountPromqlSelectNodes self = new DescribeAccountsResponseBodyAccountListDBAccountPromqlSelectNodes();
            return TeaModel.build(map, self);
        }

        public DescribeAccountsResponseBodyAccountListDBAccountPromqlSelectNodes setPromqlSelectNodes(java.util.List<String> promqlSelectNodes) {
            this.promqlSelectNodes = promqlSelectNodes;
            return this;
        }
        public java.util.List<String> getPromqlSelectNodes() {
            return this.promqlSelectNodes;
        }

    }

    public static class DescribeAccountsResponseBodyAccountListDBAccountPromqlSelectPrivileges extends TeaModel {
        @NameInMap("PromqlSelectPrivileges")
        public java.util.List<String> promqlSelectPrivileges;

        public static DescribeAccountsResponseBodyAccountListDBAccountPromqlSelectPrivileges build(java.util.Map<String, ?> map) throws Exception {
            DescribeAccountsResponseBodyAccountListDBAccountPromqlSelectPrivileges self = new DescribeAccountsResponseBodyAccountListDBAccountPromqlSelectPrivileges();
            return TeaModel.build(map, self);
        }

        public DescribeAccountsResponseBodyAccountListDBAccountPromqlSelectPrivileges setPromqlSelectPrivileges(java.util.List<String> promqlSelectPrivileges) {
            this.promqlSelectPrivileges = promqlSelectPrivileges;
            return this;
        }
        public java.util.List<String> getPromqlSelectPrivileges() {
            return this.promqlSelectPrivileges;
        }

    }

    public static class DescribeAccountsResponseBodyAccountListDBAccountRamUserList extends TeaModel {
        @NameInMap("RamUserList")
        public java.util.List<String> ramUserList;

        public static DescribeAccountsResponseBodyAccountListDBAccountRamUserList build(java.util.Map<String, ?> map) throws Exception {
            DescribeAccountsResponseBodyAccountListDBAccountRamUserList self = new DescribeAccountsResponseBodyAccountListDBAccountRamUserList();
            return TeaModel.build(map, self);
        }

        public DescribeAccountsResponseBodyAccountListDBAccountRamUserList setRamUserList(java.util.List<String> ramUserList) {
            this.ramUserList = ramUserList;
            return this;
        }
        public java.util.List<String> getRamUserList() {
            return this.ramUserList;
        }

    }

    public static class DescribeAccountsResponseBodyAccountListDBAccount extends TeaModel {
        @NameInMap("AccountDescription")
        public String accountDescription;

        @NameInMap("AccountName")
        public String accountName;

        @NameInMap("AccountStatus")
        public String accountStatus;

        @NameInMap("AccountType")
        public String accountType;

        @NameInMap("Engine")
        public String engine;

        @NameInMap("PromqlInsertPrivileges")
        public DescribeAccountsResponseBodyAccountListDBAccountPromqlInsertPrivileges promqlInsertPrivileges;

        @NameInMap("PromqlSelectNodes")
        public DescribeAccountsResponseBodyAccountListDBAccountPromqlSelectNodes promqlSelectNodes;

        @NameInMap("PromqlSelectPrivileges")
        public DescribeAccountsResponseBodyAccountListDBAccountPromqlSelectPrivileges promqlSelectPrivileges;

        @NameInMap("RamUserList")
        public DescribeAccountsResponseBodyAccountListDBAccountRamUserList ramUserList;

        @NameInMap("RamUsers")
        public String ramUsers;

        @NameInMap("promqlSelectNodePercentage")
        public Double promqlSelectNodePercentage;

        public static DescribeAccountsResponseBodyAccountListDBAccount build(java.util.Map<String, ?> map) throws Exception {
            DescribeAccountsResponseBodyAccountListDBAccount self = new DescribeAccountsResponseBodyAccountListDBAccount();
            return TeaModel.build(map, self);
        }

        public DescribeAccountsResponseBodyAccountListDBAccount setAccountDescription(String accountDescription) {
            this.accountDescription = accountDescription;
            return this;
        }
        public String getAccountDescription() {
            return this.accountDescription;
        }

        public DescribeAccountsResponseBodyAccountListDBAccount setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

        public DescribeAccountsResponseBodyAccountListDBAccount setAccountStatus(String accountStatus) {
            this.accountStatus = accountStatus;
            return this;
        }
        public String getAccountStatus() {
            return this.accountStatus;
        }

        public DescribeAccountsResponseBodyAccountListDBAccount setAccountType(String accountType) {
            this.accountType = accountType;
            return this;
        }
        public String getAccountType() {
            return this.accountType;
        }

        public DescribeAccountsResponseBodyAccountListDBAccount setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public DescribeAccountsResponseBodyAccountListDBAccount setPromqlInsertPrivileges(DescribeAccountsResponseBodyAccountListDBAccountPromqlInsertPrivileges promqlInsertPrivileges) {
            this.promqlInsertPrivileges = promqlInsertPrivileges;
            return this;
        }
        public DescribeAccountsResponseBodyAccountListDBAccountPromqlInsertPrivileges getPromqlInsertPrivileges() {
            return this.promqlInsertPrivileges;
        }

        public DescribeAccountsResponseBodyAccountListDBAccount setPromqlSelectNodes(DescribeAccountsResponseBodyAccountListDBAccountPromqlSelectNodes promqlSelectNodes) {
            this.promqlSelectNodes = promqlSelectNodes;
            return this;
        }
        public DescribeAccountsResponseBodyAccountListDBAccountPromqlSelectNodes getPromqlSelectNodes() {
            return this.promqlSelectNodes;
        }

        public DescribeAccountsResponseBodyAccountListDBAccount setPromqlSelectPrivileges(DescribeAccountsResponseBodyAccountListDBAccountPromqlSelectPrivileges promqlSelectPrivileges) {
            this.promqlSelectPrivileges = promqlSelectPrivileges;
            return this;
        }
        public DescribeAccountsResponseBodyAccountListDBAccountPromqlSelectPrivileges getPromqlSelectPrivileges() {
            return this.promqlSelectPrivileges;
        }

        public DescribeAccountsResponseBodyAccountListDBAccount setRamUserList(DescribeAccountsResponseBodyAccountListDBAccountRamUserList ramUserList) {
            this.ramUserList = ramUserList;
            return this;
        }
        public DescribeAccountsResponseBodyAccountListDBAccountRamUserList getRamUserList() {
            return this.ramUserList;
        }

        public DescribeAccountsResponseBodyAccountListDBAccount setRamUsers(String ramUsers) {
            this.ramUsers = ramUsers;
            return this;
        }
        public String getRamUsers() {
            return this.ramUsers;
        }

        public DescribeAccountsResponseBodyAccountListDBAccount setPromqlSelectNodePercentage(Double promqlSelectNodePercentage) {
            this.promqlSelectNodePercentage = promqlSelectNodePercentage;
            return this;
        }
        public Double getPromqlSelectNodePercentage() {
            return this.promqlSelectNodePercentage;
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
