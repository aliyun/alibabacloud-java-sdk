// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetInstancesHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public GetInstancesHeadersAccountContext accountContext;

    public static GetInstancesHeaders build(java.util.Map<String, ?> map) throws Exception {
        GetInstancesHeaders self = new GetInstancesHeaders();
        return TeaModel.build(map, self);
    }

    public GetInstancesHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public GetInstancesHeaders setAccountContext(GetInstancesHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public GetInstancesHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class GetInstancesHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static GetInstancesHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            GetInstancesHeadersAccountContext self = new GetInstancesHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public GetInstancesHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
