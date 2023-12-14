// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class SendPopupHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public SendPopupHeadersAccountContext accountContext;

    public static SendPopupHeaders build(java.util.Map<String, ?> map) throws Exception {
        SendPopupHeaders self = new SendPopupHeaders();
        return TeaModel.build(map, self);
    }

    public SendPopupHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public SendPopupHeaders setAccountContext(SendPopupHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public SendPopupHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class SendPopupHeadersAccountContext extends TeaModel {
        @NameInMap("accountId")
        public String accountId;

        public static SendPopupHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            SendPopupHeadersAccountContext self = new SendPopupHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public SendPopupHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
