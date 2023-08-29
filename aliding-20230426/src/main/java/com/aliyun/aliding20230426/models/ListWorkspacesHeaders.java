// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class ListWorkspacesHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public ListWorkspacesHeadersAccountContext accountContext;

    public static ListWorkspacesHeaders build(java.util.Map<String, ?> map) throws Exception {
        ListWorkspacesHeaders self = new ListWorkspacesHeaders();
        return TeaModel.build(map, self);
    }

    public ListWorkspacesHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public ListWorkspacesHeaders setAccountContext(ListWorkspacesHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public ListWorkspacesHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class ListWorkspacesHeadersAccountContext extends TeaModel {
        @NameInMap("accountId")
        public String accountId;

        public static ListWorkspacesHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            ListWorkspacesHeadersAccountContext self = new ListWorkspacesHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public ListWorkspacesHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
