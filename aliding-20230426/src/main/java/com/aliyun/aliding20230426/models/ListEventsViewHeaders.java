// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class ListEventsViewHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public ListEventsViewHeadersAccountContext accountContext;

    public static ListEventsViewHeaders build(java.util.Map<String, ?> map) throws Exception {
        ListEventsViewHeaders self = new ListEventsViewHeaders();
        return TeaModel.build(map, self);
    }

    public ListEventsViewHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public ListEventsViewHeaders setAccountContext(ListEventsViewHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public ListEventsViewHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class ListEventsViewHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static ListEventsViewHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            ListEventsViewHeadersAccountContext self = new ListEventsViewHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public ListEventsViewHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
