// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class SetRowsVisibilityHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public SetRowsVisibilityHeadersAccountContext accountContext;

    public static SetRowsVisibilityHeaders build(java.util.Map<String, ?> map) throws Exception {
        SetRowsVisibilityHeaders self = new SetRowsVisibilityHeaders();
        return TeaModel.build(map, self);
    }

    public SetRowsVisibilityHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public SetRowsVisibilityHeaders setAccountContext(SetRowsVisibilityHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public SetRowsVisibilityHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class SetRowsVisibilityHeadersAccountContext extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static SetRowsVisibilityHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            SetRowsVisibilityHeadersAccountContext self = new SetRowsVisibilityHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public SetRowsVisibilityHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
