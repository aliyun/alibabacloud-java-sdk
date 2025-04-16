// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class DocUpdateContentHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public DocUpdateContentHeadersAccountContext accountContext;

    public static DocUpdateContentHeaders build(java.util.Map<String, ?> map) throws Exception {
        DocUpdateContentHeaders self = new DocUpdateContentHeaders();
        return TeaModel.build(map, self);
    }

    public DocUpdateContentHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public DocUpdateContentHeaders setAccountContext(DocUpdateContentHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public DocUpdateContentHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class DocUpdateContentHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static DocUpdateContentHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            DocUpdateContentHeadersAccountContext self = new DocUpdateContentHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public DocUpdateContentHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
