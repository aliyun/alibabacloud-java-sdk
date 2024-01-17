// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetCorpAccomplishmentTasksHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public GetCorpAccomplishmentTasksHeadersAccountContext accountContext;

    public static GetCorpAccomplishmentTasksHeaders build(java.util.Map<String, ?> map) throws Exception {
        GetCorpAccomplishmentTasksHeaders self = new GetCorpAccomplishmentTasksHeaders();
        return TeaModel.build(map, self);
    }

    public GetCorpAccomplishmentTasksHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public GetCorpAccomplishmentTasksHeaders setAccountContext(GetCorpAccomplishmentTasksHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public GetCorpAccomplishmentTasksHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class GetCorpAccomplishmentTasksHeadersAccountContext extends TeaModel {
        @NameInMap("accountId")
        public String accountId;

        public static GetCorpAccomplishmentTasksHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            GetCorpAccomplishmentTasksHeadersAccountContext self = new GetCorpAccomplishmentTasksHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public GetCorpAccomplishmentTasksHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
