// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetNotifyMeHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public GetNotifyMeHeadersAccountContext accountContext;

    public static GetNotifyMeHeaders build(java.util.Map<String, ?> map) throws Exception {
        GetNotifyMeHeaders self = new GetNotifyMeHeaders();
        return TeaModel.build(map, self);
    }

    public GetNotifyMeHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public GetNotifyMeHeaders setAccountContext(GetNotifyMeHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public GetNotifyMeHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class GetNotifyMeHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static GetNotifyMeHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            GetNotifyMeHeadersAccountContext self = new GetNotifyMeHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public GetNotifyMeHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
