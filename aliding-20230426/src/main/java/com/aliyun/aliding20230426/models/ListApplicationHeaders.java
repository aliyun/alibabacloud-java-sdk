// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class ListApplicationHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public ListApplicationHeadersAccountContext accountContext;

    public static ListApplicationHeaders build(java.util.Map<String, ?> map) throws Exception {
        ListApplicationHeaders self = new ListApplicationHeaders();
        return TeaModel.build(map, self);
    }

    public ListApplicationHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public ListApplicationHeaders setAccountContext(ListApplicationHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public ListApplicationHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class ListApplicationHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static ListApplicationHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            ListApplicationHeadersAccountContext self = new ListApplicationHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public ListApplicationHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
