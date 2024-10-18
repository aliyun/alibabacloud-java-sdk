// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class AddTicketMemoHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public AddTicketMemoHeadersAccountContext accountContext;

    public static AddTicketMemoHeaders build(java.util.Map<String, ?> map) throws Exception {
        AddTicketMemoHeaders self = new AddTicketMemoHeaders();
        return TeaModel.build(map, self);
    }

    public AddTicketMemoHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public AddTicketMemoHeaders setAccountContext(AddTicketMemoHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public AddTicketMemoHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class AddTicketMemoHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static AddTicketMemoHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            AddTicketMemoHeadersAccountContext self = new AddTicketMemoHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public AddTicketMemoHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
