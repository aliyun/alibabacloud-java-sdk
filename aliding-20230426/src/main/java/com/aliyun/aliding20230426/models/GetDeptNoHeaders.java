// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetDeptNoHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public GetDeptNoHeadersAccountContext accountContext;

    public static GetDeptNoHeaders build(java.util.Map<String, ?> map) throws Exception {
        GetDeptNoHeaders self = new GetDeptNoHeaders();
        return TeaModel.build(map, self);
    }

    public GetDeptNoHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public GetDeptNoHeaders setAccountContext(GetDeptNoHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public GetDeptNoHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class GetDeptNoHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static GetDeptNoHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            GetDeptNoHeadersAccountContext self = new GetDeptNoHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public GetDeptNoHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
