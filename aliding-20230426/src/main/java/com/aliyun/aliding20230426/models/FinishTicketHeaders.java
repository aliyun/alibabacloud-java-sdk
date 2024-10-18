// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class FinishTicketHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public FinishTicketHeadersAccountContext accountContext;

    public static FinishTicketHeaders build(java.util.Map<String, ?> map) throws Exception {
        FinishTicketHeaders self = new FinishTicketHeaders();
        return TeaModel.build(map, self);
    }

    public FinishTicketHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public FinishTicketHeaders setAccountContext(FinishTicketHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public FinishTicketHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class FinishTicketHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static FinishTicketHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            FinishTicketHeadersAccountContext self = new FinishTicketHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public FinishTicketHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
