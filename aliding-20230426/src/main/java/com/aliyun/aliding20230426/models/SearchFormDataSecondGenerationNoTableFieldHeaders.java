// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class SearchFormDataSecondGenerationNoTableFieldHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public SearchFormDataSecondGenerationNoTableFieldHeadersAccountContext accountContext;

    public static SearchFormDataSecondGenerationNoTableFieldHeaders build(java.util.Map<String, ?> map) throws Exception {
        SearchFormDataSecondGenerationNoTableFieldHeaders self = new SearchFormDataSecondGenerationNoTableFieldHeaders();
        return TeaModel.build(map, self);
    }

    public SearchFormDataSecondGenerationNoTableFieldHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public SearchFormDataSecondGenerationNoTableFieldHeaders setAccountContext(SearchFormDataSecondGenerationNoTableFieldHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public SearchFormDataSecondGenerationNoTableFieldHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class SearchFormDataSecondGenerationNoTableFieldHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static SearchFormDataSecondGenerationNoTableFieldHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            SearchFormDataSecondGenerationNoTableFieldHeadersAccountContext self = new SearchFormDataSecondGenerationNoTableFieldHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public SearchFormDataSecondGenerationNoTableFieldHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
