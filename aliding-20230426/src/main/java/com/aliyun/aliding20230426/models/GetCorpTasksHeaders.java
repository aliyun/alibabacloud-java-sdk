// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetCorpTasksHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public GetCorpTasksHeadersAccountContext accountContext;

    public static GetCorpTasksHeaders build(java.util.Map<String, ?> map) throws Exception {
        GetCorpTasksHeaders self = new GetCorpTasksHeaders();
        return TeaModel.build(map, self);
    }

    public GetCorpTasksHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public GetCorpTasksHeaders setAccountContext(GetCorpTasksHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public GetCorpTasksHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class GetCorpTasksHeadersAccountContext extends TeaModel {
        @NameInMap("accountId")
        public String accountId;

        public static GetCorpTasksHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            GetCorpTasksHeadersAccountContext self = new GetCorpTasksHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public GetCorpTasksHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
