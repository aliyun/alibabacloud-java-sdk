// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class SearchInnerGroupsHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public SearchInnerGroupsHeadersAccountContext accountContext;

    public static SearchInnerGroupsHeaders build(java.util.Map<String, ?> map) throws Exception {
        SearchInnerGroupsHeaders self = new SearchInnerGroupsHeaders();
        return TeaModel.build(map, self);
    }

    public SearchInnerGroupsHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public SearchInnerGroupsHeaders setAccountContext(SearchInnerGroupsHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public SearchInnerGroupsHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class SearchInnerGroupsHeadersAccountContext extends TeaModel {
        @NameInMap("accountId")
        public String accountId;

        public static SearchInnerGroupsHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            SearchInnerGroupsHeadersAccountContext self = new SearchInnerGroupsHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public SearchInnerGroupsHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
