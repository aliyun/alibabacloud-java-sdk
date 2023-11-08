// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphone20201230.models;

import com.aliyun.tea.*;

public class ListImageSharePermissionResponseBody extends TeaModel {
    /**
     * <p>The list of Alibaba Cloud accounts.</p>
     */
    @NameInMap("Accounts")
    public ListImageSharePermissionResponseBodyAccounts accounts;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListImageSharePermissionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListImageSharePermissionResponseBody self = new ListImageSharePermissionResponseBody();
        return TeaModel.build(map, self);
    }

    public ListImageSharePermissionResponseBody setAccounts(ListImageSharePermissionResponseBodyAccounts accounts) {
        this.accounts = accounts;
        return this;
    }
    public ListImageSharePermissionResponseBodyAccounts getAccounts() {
        return this.accounts;
    }

    public ListImageSharePermissionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListImageSharePermissionResponseBodyAccountsAccount extends TeaModel {
        /**
         * <p>The ID of the Alibaba Cloud account.</p>
         */
        @NameInMap("AliyunId")
        public String aliyunId;

        public static ListImageSharePermissionResponseBodyAccountsAccount build(java.util.Map<String, ?> map) throws Exception {
            ListImageSharePermissionResponseBodyAccountsAccount self = new ListImageSharePermissionResponseBodyAccountsAccount();
            return TeaModel.build(map, self);
        }

        public ListImageSharePermissionResponseBodyAccountsAccount setAliyunId(String aliyunId) {
            this.aliyunId = aliyunId;
            return this;
        }
        public String getAliyunId() {
            return this.aliyunId;
        }

    }

    public static class ListImageSharePermissionResponseBodyAccounts extends TeaModel {
        @NameInMap("Account")
        public java.util.List<ListImageSharePermissionResponseBodyAccountsAccount> account;

        public static ListImageSharePermissionResponseBodyAccounts build(java.util.Map<String, ?> map) throws Exception {
            ListImageSharePermissionResponseBodyAccounts self = new ListImageSharePermissionResponseBodyAccounts();
            return TeaModel.build(map, self);
        }

        public ListImageSharePermissionResponseBodyAccounts setAccount(java.util.List<ListImageSharePermissionResponseBodyAccountsAccount> account) {
            this.account = account;
            return this;
        }
        public java.util.List<ListImageSharePermissionResponseBodyAccountsAccount> getAccount() {
            return this.account;
        }

    }

}
