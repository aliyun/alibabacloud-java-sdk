// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class CreateScenegroupHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public CreateScenegroupHeadersAccountContext accountContext;

    public static CreateScenegroupHeaders build(java.util.Map<String, ?> map) throws Exception {
        CreateScenegroupHeaders self = new CreateScenegroupHeaders();
        return TeaModel.build(map, self);
    }

    public CreateScenegroupHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public CreateScenegroupHeaders setAccountContext(CreateScenegroupHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public CreateScenegroupHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class CreateScenegroupHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static CreateScenegroupHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            CreateScenegroupHeadersAccountContext self = new CreateScenegroupHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public CreateScenegroupHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
