// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class SendSearchShadeHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public SendSearchShadeHeadersAccountContext accountContext;

    public static SendSearchShadeHeaders build(java.util.Map<String, ?> map) throws Exception {
        SendSearchShadeHeaders self = new SendSearchShadeHeaders();
        return TeaModel.build(map, self);
    }

    public SendSearchShadeHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public SendSearchShadeHeaders setAccountContext(SendSearchShadeHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public SendSearchShadeHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class SendSearchShadeHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static SendSearchShadeHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            SendSearchShadeHeadersAccountContext self = new SendSearchShadeHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public SendSearchShadeHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
