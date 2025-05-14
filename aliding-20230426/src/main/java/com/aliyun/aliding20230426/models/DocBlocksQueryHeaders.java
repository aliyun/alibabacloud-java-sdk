// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class DocBlocksQueryHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public DocBlocksQueryHeadersAccountContext accountContext;

    public static DocBlocksQueryHeaders build(java.util.Map<String, ?> map) throws Exception {
        DocBlocksQueryHeaders self = new DocBlocksQueryHeaders();
        return TeaModel.build(map, self);
    }

    public DocBlocksQueryHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public DocBlocksQueryHeaders setAccountContext(DocBlocksQueryHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public DocBlocksQueryHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class DocBlocksQueryHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static DocBlocksQueryHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            DocBlocksQueryHeadersAccountContext self = new DocBlocksQueryHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public DocBlocksQueryHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
