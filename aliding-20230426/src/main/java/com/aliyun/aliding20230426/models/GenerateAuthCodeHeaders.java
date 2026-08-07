// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GenerateAuthCodeHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public GenerateAuthCodeHeadersAccountContext accountContext;

    public static GenerateAuthCodeHeaders build(java.util.Map<String, ?> map) throws Exception {
        GenerateAuthCodeHeaders self = new GenerateAuthCodeHeaders();
        return TeaModel.build(map, self);
    }

    public GenerateAuthCodeHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public GenerateAuthCodeHeaders setAccountContext(GenerateAuthCodeHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public GenerateAuthCodeHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class GenerateAuthCodeHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static GenerateAuthCodeHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            GenerateAuthCodeHeadersAccountContext self = new GenerateAuthCodeHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public GenerateAuthCodeHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
