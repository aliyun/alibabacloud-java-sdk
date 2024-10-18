// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetGroupLiveListHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public GetGroupLiveListHeadersAccountContext accountContext;

    public static GetGroupLiveListHeaders build(java.util.Map<String, ?> map) throws Exception {
        GetGroupLiveListHeaders self = new GetGroupLiveListHeaders();
        return TeaModel.build(map, self);
    }

    public GetGroupLiveListHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public GetGroupLiveListHeaders setAccountContext(GetGroupLiveListHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public GetGroupLiveListHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class GetGroupLiveListHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static GetGroupLiveListHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            GetGroupLiveListHeadersAccountContext self = new GetGroupLiveListHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public GetGroupLiveListHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
