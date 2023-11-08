// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class SearchFormDataSecondGenerationHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public SearchFormDataSecondGenerationHeadersAccountContext accountContext;

    public static SearchFormDataSecondGenerationHeaders build(java.util.Map<String, ?> map) throws Exception {
        SearchFormDataSecondGenerationHeaders self = new SearchFormDataSecondGenerationHeaders();
        return TeaModel.build(map, self);
    }

    public SearchFormDataSecondGenerationHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public SearchFormDataSecondGenerationHeaders setAccountContext(SearchFormDataSecondGenerationHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public SearchFormDataSecondGenerationHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class SearchFormDataSecondGenerationHeadersAccountContext extends TeaModel {
        @NameInMap("accountId")
        public String accountId;

        public static SearchFormDataSecondGenerationHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            SearchFormDataSecondGenerationHeadersAccountContext self = new SearchFormDataSecondGenerationHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public SearchFormDataSecondGenerationHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
