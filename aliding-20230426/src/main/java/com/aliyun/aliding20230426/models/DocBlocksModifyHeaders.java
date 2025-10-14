// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class DocBlocksModifyHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public DocBlocksModifyHeadersAccountContext accountContext;

    public static DocBlocksModifyHeaders build(java.util.Map<String, ?> map) throws Exception {
        DocBlocksModifyHeaders self = new DocBlocksModifyHeaders();
        return TeaModel.build(map, self);
    }

    public DocBlocksModifyHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public DocBlocksModifyHeaders setAccountContext(DocBlocksModifyHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public DocBlocksModifyHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class DocBlocksModifyHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static DocBlocksModifyHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            DocBlocksModifyHeadersAccountContext self = new DocBlocksModifyHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public DocBlocksModifyHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
