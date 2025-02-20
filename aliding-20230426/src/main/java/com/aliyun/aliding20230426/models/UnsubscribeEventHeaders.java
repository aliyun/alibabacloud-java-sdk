// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class UnsubscribeEventHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public UnsubscribeEventHeadersAccountContext accountContext;

    public static UnsubscribeEventHeaders build(java.util.Map<String, ?> map) throws Exception {
        UnsubscribeEventHeaders self = new UnsubscribeEventHeaders();
        return TeaModel.build(map, self);
    }

    public UnsubscribeEventHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public UnsubscribeEventHeaders setAccountContext(UnsubscribeEventHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public UnsubscribeEventHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class UnsubscribeEventHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static UnsubscribeEventHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            UnsubscribeEventHeadersAccountContext self = new UnsubscribeEventHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public UnsubscribeEventHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
