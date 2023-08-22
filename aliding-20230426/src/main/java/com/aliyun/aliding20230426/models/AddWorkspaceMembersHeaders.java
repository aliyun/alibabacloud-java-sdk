// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class AddWorkspaceMembersHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public AddWorkspaceMembersHeadersAccountContext accountContext;

    public static AddWorkspaceMembersHeaders build(java.util.Map<String, ?> map) throws Exception {
        AddWorkspaceMembersHeaders self = new AddWorkspaceMembersHeaders();
        return TeaModel.build(map, self);
    }

    public AddWorkspaceMembersHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public AddWorkspaceMembersHeaders setAccountContext(AddWorkspaceMembersHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public AddWorkspaceMembersHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class AddWorkspaceMembersHeadersAccountContext extends TeaModel {
        @NameInMap("accountId")
        public String accountId;

        public static AddWorkspaceMembersHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            AddWorkspaceMembersHeadersAccountContext self = new AddWorkspaceMembersHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public AddWorkspaceMembersHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
