// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class SearchFormDatasHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public SearchFormDatasHeadersAccountContext accountContext;

    public static SearchFormDatasHeaders build(java.util.Map<String, ?> map) throws Exception {
        SearchFormDatasHeaders self = new SearchFormDatasHeaders();
        return TeaModel.build(map, self);
    }

    public SearchFormDatasHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public SearchFormDatasHeaders setAccountContext(SearchFormDatasHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public SearchFormDatasHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class SearchFormDatasHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static SearchFormDatasHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            SearchFormDatasHeadersAccountContext self = new SearchFormDatasHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public SearchFormDatasHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
