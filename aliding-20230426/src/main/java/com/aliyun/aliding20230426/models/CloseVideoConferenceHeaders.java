// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class CloseVideoConferenceHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public CloseVideoConferenceHeadersAccountContext accountContext;

    public static CloseVideoConferenceHeaders build(java.util.Map<String, ?> map) throws Exception {
        CloseVideoConferenceHeaders self = new CloseVideoConferenceHeaders();
        return TeaModel.build(map, self);
    }

    public CloseVideoConferenceHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public CloseVideoConferenceHeaders setAccountContext(CloseVideoConferenceHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public CloseVideoConferenceHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class CloseVideoConferenceHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static CloseVideoConferenceHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            CloseVideoConferenceHeadersAccountContext self = new CloseVideoConferenceHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public CloseVideoConferenceHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
