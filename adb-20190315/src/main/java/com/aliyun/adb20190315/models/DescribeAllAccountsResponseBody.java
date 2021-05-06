// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeAllAccountsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("AccountList")
    public java.util.List<DescribeAllAccountsResponseBodyAccountList> accountList;

    public static DescribeAllAccountsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAllAccountsResponseBody self = new DescribeAllAccountsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAllAccountsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAllAccountsResponseBody setAccountList(java.util.List<DescribeAllAccountsResponseBodyAccountList> accountList) {
        this.accountList = accountList;
        return this;
    }
    public java.util.List<DescribeAllAccountsResponseBodyAccountList> getAccountList() {
        return this.accountList;
    }

    public static class DescribeAllAccountsResponseBodyAccountList extends TeaModel {
        @NameInMap("User")
        public String user;

        public static DescribeAllAccountsResponseBodyAccountList build(java.util.Map<String, ?> map) throws Exception {
            DescribeAllAccountsResponseBodyAccountList self = new DescribeAllAccountsResponseBodyAccountList();
            return TeaModel.build(map, self);
        }

        public DescribeAllAccountsResponseBodyAccountList setUser(String user) {
            this.user = user;
            return this;
        }
        public String getUser() {
            return this.user;
        }

    }

}
