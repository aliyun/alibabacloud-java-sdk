// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class SendBannerHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public SendBannerHeadersAccountContext accountContext;

    public static SendBannerHeaders build(java.util.Map<String, ?> map) throws Exception {
        SendBannerHeaders self = new SendBannerHeaders();
        return TeaModel.build(map, self);
    }

    public SendBannerHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public SendBannerHeaders setAccountContext(SendBannerHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public SendBannerHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class SendBannerHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static SendBannerHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            SendBannerHeadersAccountContext self = new SendBannerHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public SendBannerHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
