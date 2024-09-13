// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetUserIdByOrgIdAndStaffIdHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public GetUserIdByOrgIdAndStaffIdHeadersAccountContext accountContext;

    public static GetUserIdByOrgIdAndStaffIdHeaders build(java.util.Map<String, ?> map) throws Exception {
        GetUserIdByOrgIdAndStaffIdHeaders self = new GetUserIdByOrgIdAndStaffIdHeaders();
        return TeaModel.build(map, self);
    }

    public GetUserIdByOrgIdAndStaffIdHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public GetUserIdByOrgIdAndStaffIdHeaders setAccountContext(GetUserIdByOrgIdAndStaffIdHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public GetUserIdByOrgIdAndStaffIdHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class GetUserIdByOrgIdAndStaffIdHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static GetUserIdByOrgIdAndStaffIdHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            GetUserIdByOrgIdAndStaffIdHeadersAccountContext self = new GetUserIdByOrgIdAndStaffIdHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public GetUserIdByOrgIdAndStaffIdHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
