// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class TransferTicketHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public TransferTicketHeadersAccountContext accountContext;

    public static TransferTicketHeaders build(java.util.Map<String, ?> map) throws Exception {
        TransferTicketHeaders self = new TransferTicketHeaders();
        return TeaModel.build(map, self);
    }

    public TransferTicketHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public TransferTicketHeaders setAccountContext(TransferTicketHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public TransferTicketHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class TransferTicketHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static TransferTicketHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            TransferTicketHeadersAccountContext self = new TransferTicketHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public TransferTicketHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
