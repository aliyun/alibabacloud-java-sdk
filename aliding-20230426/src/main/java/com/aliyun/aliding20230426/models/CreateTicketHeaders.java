// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class CreateTicketHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public CreateTicketHeadersAccountContext accountContext;

    public static CreateTicketHeaders build(java.util.Map<String, ?> map) throws Exception {
        CreateTicketHeaders self = new CreateTicketHeaders();
        return TeaModel.build(map, self);
    }

    public CreateTicketHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public CreateTicketHeaders setAccountContext(CreateTicketHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public CreateTicketHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class CreateTicketHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static CreateTicketHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            CreateTicketHeadersAccountContext self = new CreateTicketHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public CreateTicketHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
