// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class BatchQueryGroupMemberHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public BatchQueryGroupMemberHeadersAccountContext accountContext;

    public static BatchQueryGroupMemberHeaders build(java.util.Map<String, ?> map) throws Exception {
        BatchQueryGroupMemberHeaders self = new BatchQueryGroupMemberHeaders();
        return TeaModel.build(map, self);
    }

    public BatchQueryGroupMemberHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public BatchQueryGroupMemberHeaders setAccountContext(BatchQueryGroupMemberHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public BatchQueryGroupMemberHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class BatchQueryGroupMemberHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static BatchQueryGroupMemberHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            BatchQueryGroupMemberHeadersAccountContext self = new BatchQueryGroupMemberHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public BatchQueryGroupMemberHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
