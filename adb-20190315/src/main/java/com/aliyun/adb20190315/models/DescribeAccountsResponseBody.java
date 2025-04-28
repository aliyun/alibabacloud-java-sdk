// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeAccountsResponseBody extends TeaModel {
    /**
     * <p>The queried database accounts.</p>
     */
    @NameInMap("AccountList")
    public DescribeAccountsResponseBodyAccountList accountList;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>64E37E6F-C363-41F3-867A-70EF5DC60EA4</p>
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

    public static class DescribeAccountsResponseBodyAccountListDBAccountTagsTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static DescribeAccountsResponseBodyAccountListDBAccountTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeAccountsResponseBodyAccountListDBAccountTagsTag self = new DescribeAccountsResponseBodyAccountListDBAccountTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeAccountsResponseBodyAccountListDBAccountTagsTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeAccountsResponseBodyAccountListDBAccountTagsTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeAccountsResponseBodyAccountListDBAccountTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<DescribeAccountsResponseBodyAccountListDBAccountTagsTag> tag;

        public static DescribeAccountsResponseBodyAccountListDBAccountTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeAccountsResponseBodyAccountListDBAccountTags self = new DescribeAccountsResponseBodyAccountListDBAccountTags();
            return TeaModel.build(map, self);
        }

        public DescribeAccountsResponseBodyAccountListDBAccountTags setTag(java.util.List<DescribeAccountsResponseBodyAccountListDBAccountTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeAccountsResponseBodyAccountListDBAccountTagsTag> getTag() {
            return this.tag;
        }

    }

    public static class DescribeAccountsResponseBodyAccountListDBAccount extends TeaModel {
        /**
         * <p>The description of the database account.</p>
         * 
         * <strong>example:</strong>
         * <p>C@test</p>
         */
        @NameInMap("AccountDescription")
        public String accountDescription;

        /**
         * <p>The name of the database account.</p>
         * 
         * <strong>example:</strong>
         * <p>test1</p>
         */
        @NameInMap("AccountName")
        public String accountName;

        /**
         * <p>The state of the database account. Valid values:</p>
         * <ul>
         * <li><strong>Creating</strong></li>
         * <li><strong>Available</strong></li>
         * <li><strong>Deleting</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Available</p>
         */
        @NameInMap("AccountStatus")
        public String accountStatus;

        /**
         * <p>The type of the database account. Valid values:</p>
         * <ul>
         * <li><strong>Normal</strong>: standard account.</li>
         * <li><strong>Super</strong>: privileged account.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("AccountType")
        public String accountType;

        @NameInMap("Tags")
        public DescribeAccountsResponseBodyAccountListDBAccountTags tags;

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

        public DescribeAccountsResponseBodyAccountListDBAccount setTags(DescribeAccountsResponseBodyAccountListDBAccountTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribeAccountsResponseBodyAccountListDBAccountTags getTags() {
            return this.tags;
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
