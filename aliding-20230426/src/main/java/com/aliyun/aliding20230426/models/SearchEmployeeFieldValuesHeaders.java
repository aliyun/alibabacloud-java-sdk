// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class SearchEmployeeFieldValuesHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public SearchEmployeeFieldValuesHeadersAccountContext accountContext;

    public static SearchEmployeeFieldValuesHeaders build(java.util.Map<String, ?> map) throws Exception {
        SearchEmployeeFieldValuesHeaders self = new SearchEmployeeFieldValuesHeaders();
        return TeaModel.build(map, self);
    }

    public SearchEmployeeFieldValuesHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public SearchEmployeeFieldValuesHeaders setAccountContext(SearchEmployeeFieldValuesHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public SearchEmployeeFieldValuesHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class SearchEmployeeFieldValuesHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static SearchEmployeeFieldValuesHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            SearchEmployeeFieldValuesHeadersAccountContext self = new SearchEmployeeFieldValuesHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public SearchEmployeeFieldValuesHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
