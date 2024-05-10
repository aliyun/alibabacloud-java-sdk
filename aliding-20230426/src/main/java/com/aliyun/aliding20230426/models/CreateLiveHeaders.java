// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class CreateLiveHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public CreateLiveHeadersAccountContext accountContext;

    public static CreateLiveHeaders build(java.util.Map<String, ?> map) throws Exception {
        CreateLiveHeaders self = new CreateLiveHeaders();
        return TeaModel.build(map, self);
    }

    public CreateLiveHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public CreateLiveHeaders setAccountContext(CreateLiveHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public CreateLiveHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class CreateLiveHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static CreateLiveHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            CreateLiveHeadersAccountContext self = new CreateLiveHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public CreateLiveHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
