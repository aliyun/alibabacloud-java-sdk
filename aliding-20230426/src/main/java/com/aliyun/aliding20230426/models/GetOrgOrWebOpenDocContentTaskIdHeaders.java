// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetOrgOrWebOpenDocContentTaskIdHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public GetOrgOrWebOpenDocContentTaskIdHeadersAccountContext accountContext;

    public static GetOrgOrWebOpenDocContentTaskIdHeaders build(java.util.Map<String, ?> map) throws Exception {
        GetOrgOrWebOpenDocContentTaskIdHeaders self = new GetOrgOrWebOpenDocContentTaskIdHeaders();
        return TeaModel.build(map, self);
    }

    public GetOrgOrWebOpenDocContentTaskIdHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public GetOrgOrWebOpenDocContentTaskIdHeaders setAccountContext(GetOrgOrWebOpenDocContentTaskIdHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public GetOrgOrWebOpenDocContentTaskIdHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class GetOrgOrWebOpenDocContentTaskIdHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static GetOrgOrWebOpenDocContentTaskIdHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            GetOrgOrWebOpenDocContentTaskIdHeadersAccountContext self = new GetOrgOrWebOpenDocContentTaskIdHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public GetOrgOrWebOpenDocContentTaskIdHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
