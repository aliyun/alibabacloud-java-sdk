// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class SetColumnsVisibilityHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public SetColumnsVisibilityHeadersAccountContext accountContext;

    public static SetColumnsVisibilityHeaders build(java.util.Map<String, ?> map) throws Exception {
        SetColumnsVisibilityHeaders self = new SetColumnsVisibilityHeaders();
        return TeaModel.build(map, self);
    }

    public SetColumnsVisibilityHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public SetColumnsVisibilityHeaders setAccountContext(SetColumnsVisibilityHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public SetColumnsVisibilityHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class SetColumnsVisibilityHeadersAccountContext extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static SetColumnsVisibilityHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            SetColumnsVisibilityHeadersAccountContext self = new SetColumnsVisibilityHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public SetColumnsVisibilityHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
