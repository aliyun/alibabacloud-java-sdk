// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class ExpandGroupCapacityHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public ExpandGroupCapacityHeadersAccountContext accountContext;

    public static ExpandGroupCapacityHeaders build(java.util.Map<String, ?> map) throws Exception {
        ExpandGroupCapacityHeaders self = new ExpandGroupCapacityHeaders();
        return TeaModel.build(map, self);
    }

    public ExpandGroupCapacityHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public ExpandGroupCapacityHeaders setAccountContext(ExpandGroupCapacityHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public ExpandGroupCapacityHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class ExpandGroupCapacityHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static ExpandGroupCapacityHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            ExpandGroupCapacityHeadersAccountContext self = new ExpandGroupCapacityHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public ExpandGroupCapacityHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
