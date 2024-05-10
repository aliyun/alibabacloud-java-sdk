// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class ListEventsHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public ListEventsHeadersAccountContext accountContext;

    public static ListEventsHeaders build(java.util.Map<String, ?> map) throws Exception {
        ListEventsHeaders self = new ListEventsHeaders();
        return TeaModel.build(map, self);
    }

    public ListEventsHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public ListEventsHeaders setAccountContext(ListEventsHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public ListEventsHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class ListEventsHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static ListEventsHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            ListEventsHeadersAccountContext self = new ListEventsHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public ListEventsHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
