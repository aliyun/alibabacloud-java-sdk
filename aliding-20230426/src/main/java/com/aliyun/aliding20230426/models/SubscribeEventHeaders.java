// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class SubscribeEventHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public SubscribeEventHeadersAccountContext accountContext;

    public static SubscribeEventHeaders build(java.util.Map<String, ?> map) throws Exception {
        SubscribeEventHeaders self = new SubscribeEventHeaders();
        return TeaModel.build(map, self);
    }

    public SubscribeEventHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public SubscribeEventHeaders setAccountContext(SubscribeEventHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public SubscribeEventHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class SubscribeEventHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static SubscribeEventHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            SubscribeEventHeadersAccountContext self = new SubscribeEventHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public SubscribeEventHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
