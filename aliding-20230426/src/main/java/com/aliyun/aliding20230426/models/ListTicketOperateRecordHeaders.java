// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class ListTicketOperateRecordHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public ListTicketOperateRecordHeadersAccountContext accountContext;

    public static ListTicketOperateRecordHeaders build(java.util.Map<String, ?> map) throws Exception {
        ListTicketOperateRecordHeaders self = new ListTicketOperateRecordHeaders();
        return TeaModel.build(map, self);
    }

    public ListTicketOperateRecordHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public ListTicketOperateRecordHeaders setAccountContext(ListTicketOperateRecordHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public ListTicketOperateRecordHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class ListTicketOperateRecordHeadersAccountContext extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static ListTicketOperateRecordHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            ListTicketOperateRecordHeadersAccountContext self = new ListTicketOperateRecordHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public ListTicketOperateRecordHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
