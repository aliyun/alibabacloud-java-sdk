// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class CommitFileHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public CommitFileHeadersAccountContext accountContext;

    public static CommitFileHeaders build(java.util.Map<String, ?> map) throws Exception {
        CommitFileHeaders self = new CommitFileHeaders();
        return TeaModel.build(map, self);
    }

    public CommitFileHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public CommitFileHeaders setAccountContext(CommitFileHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public CommitFileHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class CommitFileHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static CommitFileHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            CommitFileHeadersAccountContext self = new CommitFileHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public CommitFileHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
