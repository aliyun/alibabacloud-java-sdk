// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetInstancesByIdListHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public GetInstancesByIdListHeadersAccountContext accountContext;

    public static GetInstancesByIdListHeaders build(java.util.Map<String, ?> map) throws Exception {
        GetInstancesByIdListHeaders self = new GetInstancesByIdListHeaders();
        return TeaModel.build(map, self);
    }

    public GetInstancesByIdListHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public GetInstancesByIdListHeaders setAccountContext(GetInstancesByIdListHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public GetInstancesByIdListHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class GetInstancesByIdListHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static GetInstancesByIdListHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            GetInstancesByIdListHeadersAccountContext self = new GetInstancesByIdListHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public GetInstancesByIdListHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
