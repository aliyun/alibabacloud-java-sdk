// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetInnerGroupMembersHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public GetInnerGroupMembersHeadersAccountContext accountContext;

    public static GetInnerGroupMembersHeaders build(java.util.Map<String, ?> map) throws Exception {
        GetInnerGroupMembersHeaders self = new GetInnerGroupMembersHeaders();
        return TeaModel.build(map, self);
    }

    public GetInnerGroupMembersHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public GetInnerGroupMembersHeaders setAccountContext(GetInnerGroupMembersHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public GetInnerGroupMembersHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class GetInnerGroupMembersHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static GetInnerGroupMembersHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            GetInnerGroupMembersHeadersAccountContext self = new GetInnerGroupMembersHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public GetInnerGroupMembersHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
