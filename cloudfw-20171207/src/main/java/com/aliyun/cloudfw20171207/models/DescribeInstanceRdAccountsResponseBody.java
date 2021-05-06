// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeInstanceRdAccountsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Accounts")
    public java.util.List<DescribeInstanceRdAccountsResponseBodyAccounts> accounts;

    public static DescribeInstanceRdAccountsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceRdAccountsResponseBody self = new DescribeInstanceRdAccountsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceRdAccountsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInstanceRdAccountsResponseBody setAccounts(java.util.List<DescribeInstanceRdAccountsResponseBodyAccounts> accounts) {
        this.accounts = accounts;
        return this;
    }
    public java.util.List<DescribeInstanceRdAccountsResponseBodyAccounts> getAccounts() {
        return this.accounts;
    }

    public static class DescribeInstanceRdAccountsResponseBodyAccounts extends TeaModel {
        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("AccountId")
        public String accountId;

        public static DescribeInstanceRdAccountsResponseBodyAccounts build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceRdAccountsResponseBodyAccounts self = new DescribeInstanceRdAccountsResponseBodyAccounts();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceRdAccountsResponseBodyAccounts setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public DescribeInstanceRdAccountsResponseBodyAccounts setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
