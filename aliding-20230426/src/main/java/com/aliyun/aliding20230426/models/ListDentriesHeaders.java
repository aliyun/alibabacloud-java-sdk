// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class ListDentriesHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public ListDentriesHeadersAccountContext accountContext;

    public static ListDentriesHeaders build(java.util.Map<String, ?> map) throws Exception {
        ListDentriesHeaders self = new ListDentriesHeaders();
        return TeaModel.build(map, self);
    }

    public ListDentriesHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public ListDentriesHeaders setAccountContext(ListDentriesHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public ListDentriesHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class ListDentriesHeadersAccountContext extends TeaModel {
        @NameInMap("accountId")
        public String accountId;

        public static ListDentriesHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            ListDentriesHeadersAccountContext self = new ListDentriesHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public ListDentriesHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
