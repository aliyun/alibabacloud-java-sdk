// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class CreateVideoConferenceHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public CreateVideoConferenceHeadersAccountContext accountContext;

    public static CreateVideoConferenceHeaders build(java.util.Map<String, ?> map) throws Exception {
        CreateVideoConferenceHeaders self = new CreateVideoConferenceHeaders();
        return TeaModel.build(map, self);
    }

    public CreateVideoConferenceHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public CreateVideoConferenceHeaders setAccountContext(CreateVideoConferenceHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public CreateVideoConferenceHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class CreateVideoConferenceHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static CreateVideoConferenceHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            CreateVideoConferenceHeadersAccountContext self = new CreateVideoConferenceHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public CreateVideoConferenceHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
