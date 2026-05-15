// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class MuteMembersHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public MuteMembersHeadersAccountContext accountContext;

    public static MuteMembersHeaders build(java.util.Map<String, ?> map) throws Exception {
        MuteMembersHeaders self = new MuteMembersHeaders();
        return TeaModel.build(map, self);
    }

    public MuteMembersHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public MuteMembersHeaders setAccountContext(MuteMembersHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public MuteMembersHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class MuteMembersHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static MuteMembersHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            MuteMembersHeadersAccountContext self = new MuteMembersHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public MuteMembersHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
