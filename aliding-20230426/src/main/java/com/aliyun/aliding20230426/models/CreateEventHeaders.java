// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class CreateEventHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public CreateEventHeadersAccountContext accountContext;

    public static CreateEventHeaders build(java.util.Map<String, ?> map) throws Exception {
        CreateEventHeaders self = new CreateEventHeaders();
        return TeaModel.build(map, self);
    }

    public CreateEventHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public CreateEventHeaders setAccountContext(CreateEventHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public CreateEventHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class CreateEventHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static CreateEventHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            CreateEventHeadersAccountContext self = new CreateEventHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public CreateEventHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
