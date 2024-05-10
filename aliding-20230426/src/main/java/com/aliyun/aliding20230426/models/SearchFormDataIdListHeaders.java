// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class SearchFormDataIdListHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public SearchFormDataIdListHeadersAccountContext accountContext;

    public static SearchFormDataIdListHeaders build(java.util.Map<String, ?> map) throws Exception {
        SearchFormDataIdListHeaders self = new SearchFormDataIdListHeaders();
        return TeaModel.build(map, self);
    }

    public SearchFormDataIdListHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public SearchFormDataIdListHeaders setAccountContext(SearchFormDataIdListHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public SearchFormDataIdListHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class SearchFormDataIdListHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static SearchFormDataIdListHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            SearchFormDataIdListHeadersAccountContext self = new SearchFormDataIdListHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public SearchFormDataIdListHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
