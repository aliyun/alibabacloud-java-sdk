// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class ListNavigationByFormTypeHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public ListNavigationByFormTypeHeadersAccountContext accountContext;

    public static ListNavigationByFormTypeHeaders build(java.util.Map<String, ?> map) throws Exception {
        ListNavigationByFormTypeHeaders self = new ListNavigationByFormTypeHeaders();
        return TeaModel.build(map, self);
    }

    public ListNavigationByFormTypeHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public ListNavigationByFormTypeHeaders setAccountContext(ListNavigationByFormTypeHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public ListNavigationByFormTypeHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class ListNavigationByFormTypeHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static ListNavigationByFormTypeHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            ListNavigationByFormTypeHeadersAccountContext self = new ListNavigationByFormTypeHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public ListNavigationByFormTypeHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
