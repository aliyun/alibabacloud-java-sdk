// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class InitMultipartFileUploadHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public InitMultipartFileUploadHeadersAccountContext accountContext;

    public static InitMultipartFileUploadHeaders build(java.util.Map<String, ?> map) throws Exception {
        InitMultipartFileUploadHeaders self = new InitMultipartFileUploadHeaders();
        return TeaModel.build(map, self);
    }

    public InitMultipartFileUploadHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public InitMultipartFileUploadHeaders setAccountContext(InitMultipartFileUploadHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public InitMultipartFileUploadHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class InitMultipartFileUploadHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static InitMultipartFileUploadHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            InitMultipartFileUploadHeadersAccountContext self = new InitMultipartFileUploadHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public InitMultipartFileUploadHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
