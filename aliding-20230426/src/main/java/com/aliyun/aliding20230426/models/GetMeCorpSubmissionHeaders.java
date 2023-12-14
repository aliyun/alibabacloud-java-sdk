// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetMeCorpSubmissionHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public GetMeCorpSubmissionHeadersAccountContext accountContext;

    public static GetMeCorpSubmissionHeaders build(java.util.Map<String, ?> map) throws Exception {
        GetMeCorpSubmissionHeaders self = new GetMeCorpSubmissionHeaders();
        return TeaModel.build(map, self);
    }

    public GetMeCorpSubmissionHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public GetMeCorpSubmissionHeaders setAccountContext(GetMeCorpSubmissionHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public GetMeCorpSubmissionHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class GetMeCorpSubmissionHeadersAccountContext extends TeaModel {
        @NameInMap("accountId")
        public String accountId;

        public static GetMeCorpSubmissionHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            GetMeCorpSubmissionHeadersAccountContext self = new GetMeCorpSubmissionHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public GetMeCorpSubmissionHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
