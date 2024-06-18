// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class QueryOrgTodoTasksHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public QueryOrgTodoTasksHeadersAccountContext accountContext;

    public static QueryOrgTodoTasksHeaders build(java.util.Map<String, ?> map) throws Exception {
        QueryOrgTodoTasksHeaders self = new QueryOrgTodoTasksHeaders();
        return TeaModel.build(map, self);
    }

    public QueryOrgTodoTasksHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public QueryOrgTodoTasksHeaders setAccountContext(QueryOrgTodoTasksHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public QueryOrgTodoTasksHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class QueryOrgTodoTasksHeadersAccountContext extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static QueryOrgTodoTasksHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            QueryOrgTodoTasksHeadersAccountContext self = new QueryOrgTodoTasksHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public QueryOrgTodoTasksHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
