// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class DocBlocksDeleteHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public DocBlocksDeleteHeadersAccountContext accountContext;

    public static DocBlocksDeleteHeaders build(java.util.Map<String, ?> map) throws Exception {
        DocBlocksDeleteHeaders self = new DocBlocksDeleteHeaders();
        return TeaModel.build(map, self);
    }

    public DocBlocksDeleteHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public DocBlocksDeleteHeaders setAccountContext(DocBlocksDeleteHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public DocBlocksDeleteHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class DocBlocksDeleteHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static DocBlocksDeleteHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            DocBlocksDeleteHeadersAccountContext self = new DocBlocksDeleteHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public DocBlocksDeleteHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
