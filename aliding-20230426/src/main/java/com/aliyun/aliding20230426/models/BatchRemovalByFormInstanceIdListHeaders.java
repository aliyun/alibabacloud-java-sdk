// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class BatchRemovalByFormInstanceIdListHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public BatchRemovalByFormInstanceIdListHeadersAccountContext accountContext;

    public static BatchRemovalByFormInstanceIdListHeaders build(java.util.Map<String, ?> map) throws Exception {
        BatchRemovalByFormInstanceIdListHeaders self = new BatchRemovalByFormInstanceIdListHeaders();
        return TeaModel.build(map, self);
    }

    public BatchRemovalByFormInstanceIdListHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public BatchRemovalByFormInstanceIdListHeaders setAccountContext(BatchRemovalByFormInstanceIdListHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public BatchRemovalByFormInstanceIdListHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class BatchRemovalByFormInstanceIdListHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static BatchRemovalByFormInstanceIdListHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            BatchRemovalByFormInstanceIdListHeadersAccountContext self = new BatchRemovalByFormInstanceIdListHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public BatchRemovalByFormInstanceIdListHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
