// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class ListNodesHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public ListNodesHeadersAccountContext accountContext;

    public static ListNodesHeaders build(java.util.Map<String, ?> map) throws Exception {
        ListNodesHeaders self = new ListNodesHeaders();
        return TeaModel.build(map, self);
    }

    public ListNodesHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public ListNodesHeaders setAccountContext(ListNodesHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public ListNodesHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class ListNodesHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static ListNodesHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            ListNodesHeadersAccountContext self = new ListNodesHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public ListNodesHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
