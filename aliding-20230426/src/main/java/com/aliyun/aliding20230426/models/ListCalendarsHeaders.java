// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class ListCalendarsHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public ListCalendarsHeadersAccountContext accountContext;

    public static ListCalendarsHeaders build(java.util.Map<String, ?> map) throws Exception {
        ListCalendarsHeaders self = new ListCalendarsHeaders();
        return TeaModel.build(map, self);
    }

    public ListCalendarsHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public ListCalendarsHeaders setAccountContext(ListCalendarsHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public ListCalendarsHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class ListCalendarsHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static ListCalendarsHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            ListCalendarsHeadersAccountContext self = new ListCalendarsHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public ListCalendarsHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
