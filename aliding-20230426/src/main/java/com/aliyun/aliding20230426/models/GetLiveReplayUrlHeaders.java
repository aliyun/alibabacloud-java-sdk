// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetLiveReplayUrlHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public GetLiveReplayUrlHeadersAccountContext accountContext;

    public static GetLiveReplayUrlHeaders build(java.util.Map<String, ?> map) throws Exception {
        GetLiveReplayUrlHeaders self = new GetLiveReplayUrlHeaders();
        return TeaModel.build(map, self);
    }

    public GetLiveReplayUrlHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public GetLiveReplayUrlHeaders setAccountContext(GetLiveReplayUrlHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public GetLiveReplayUrlHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class GetLiveReplayUrlHeadersAccountContext extends TeaModel {
        @NameInMap("accountId")
        public String accountId;

        public static GetLiveReplayUrlHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            GetLiveReplayUrlHeadersAccountContext self = new GetLiveReplayUrlHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public GetLiveReplayUrlHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
