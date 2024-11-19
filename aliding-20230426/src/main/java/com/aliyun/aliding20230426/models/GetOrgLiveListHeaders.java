// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetOrgLiveListHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public GetOrgLiveListHeadersAccountContext accountContext;

    public static GetOrgLiveListHeaders build(java.util.Map<String, ?> map) throws Exception {
        GetOrgLiveListHeaders self = new GetOrgLiveListHeaders();
        return TeaModel.build(map, self);
    }

    public GetOrgLiveListHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public GetOrgLiveListHeaders setAccountContext(GetOrgLiveListHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public GetOrgLiveListHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class GetOrgLiveListHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static GetOrgLiveListHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            GetOrgLiveListHeadersAccountContext self = new GetOrgLiveListHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public GetOrgLiveListHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
