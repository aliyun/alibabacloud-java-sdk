// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class AssignTicketHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public AssignTicketHeadersAccountContext accountContext;

    public static AssignTicketHeaders build(java.util.Map<String, ?> map) throws Exception {
        AssignTicketHeaders self = new AssignTicketHeaders();
        return TeaModel.build(map, self);
    }

    public AssignTicketHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public AssignTicketHeaders setAccountContext(AssignTicketHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public AssignTicketHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class AssignTicketHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static AssignTicketHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            AssignTicketHeadersAccountContext self = new AssignTicketHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public AssignTicketHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
