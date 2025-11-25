// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeInstanceRdAccountsResponseBody extends TeaModel {
    @NameInMap("Accounts")
    public java.util.List<DescribeInstanceRdAccountsResponseBodyAccounts> accounts;

    /**
     * <strong>example:</strong>
     * <p>06D1EC07-C9EB-58AC-A750-C87C9A0****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeInstanceRdAccountsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceRdAccountsResponseBody self = new DescribeInstanceRdAccountsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceRdAccountsResponseBody setAccounts(java.util.List<DescribeInstanceRdAccountsResponseBodyAccounts> accounts) {
        this.accounts = accounts;
        return this;
    }
    public java.util.List<DescribeInstanceRdAccountsResponseBodyAccounts> getAccounts() {
        return this.accounts;
    }

    public DescribeInstanceRdAccountsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeInstanceRdAccountsResponseBodyAccounts extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>171054237268****</p>
         */
        @NameInMap("AccountId")
        public String accountId;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        public static DescribeInstanceRdAccountsResponseBodyAccounts build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceRdAccountsResponseBodyAccounts self = new DescribeInstanceRdAccountsResponseBodyAccounts();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceRdAccountsResponseBodyAccounts setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public DescribeInstanceRdAccountsResponseBodyAccounts setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

    }

}
