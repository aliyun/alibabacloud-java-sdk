// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class UpdateLiveHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public UpdateLiveHeadersAccountContext accountContext;

    public static UpdateLiveHeaders build(java.util.Map<String, ?> map) throws Exception {
        UpdateLiveHeaders self = new UpdateLiveHeaders();
        return TeaModel.build(map, self);
    }

    public UpdateLiveHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public UpdateLiveHeaders setAccountContext(UpdateLiveHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public UpdateLiveHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class UpdateLiveHeadersAccountContext extends TeaModel {
        @NameInMap("accountId")
        public String accountId;

        public static UpdateLiveHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            UpdateLiveHeadersAccountContext self = new UpdateLiveHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public UpdateLiveHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
