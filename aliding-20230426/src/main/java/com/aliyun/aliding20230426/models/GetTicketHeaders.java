// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetTicketHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public GetTicketHeadersAccountContext accountContext;

    public static GetTicketHeaders build(java.util.Map<String, ?> map) throws Exception {
        GetTicketHeaders self = new GetTicketHeaders();
        return TeaModel.build(map, self);
    }

    public GetTicketHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public GetTicketHeaders setAccountContext(GetTicketHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public GetTicketHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class GetTicketHeadersAccountContext extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static GetTicketHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            GetTicketHeadersAccountContext self = new GetTicketHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public GetTicketHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
