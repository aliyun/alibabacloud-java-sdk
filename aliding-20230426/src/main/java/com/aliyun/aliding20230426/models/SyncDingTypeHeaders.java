// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class SyncDingTypeHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public SyncDingTypeHeadersAccountContext accountContext;

    public static SyncDingTypeHeaders build(java.util.Map<String, ?> map) throws Exception {
        SyncDingTypeHeaders self = new SyncDingTypeHeaders();
        return TeaModel.build(map, self);
    }

    public SyncDingTypeHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public SyncDingTypeHeaders setAccountContext(SyncDingTypeHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public SyncDingTypeHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class SyncDingTypeHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static SyncDingTypeHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            SyncDingTypeHeadersAccountContext self = new SyncDingTypeHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public SyncDingTypeHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
