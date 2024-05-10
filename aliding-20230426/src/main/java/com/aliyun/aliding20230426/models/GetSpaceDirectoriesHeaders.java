// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetSpaceDirectoriesHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public GetSpaceDirectoriesHeadersAccountContext accountContext;

    public static GetSpaceDirectoriesHeaders build(java.util.Map<String, ?> map) throws Exception {
        GetSpaceDirectoriesHeaders self = new GetSpaceDirectoriesHeaders();
        return TeaModel.build(map, self);
    }

    public GetSpaceDirectoriesHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public GetSpaceDirectoriesHeaders setAccountContext(GetSpaceDirectoriesHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public GetSpaceDirectoriesHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class GetSpaceDirectoriesHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static GetSpaceDirectoriesHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            GetSpaceDirectoriesHeadersAccountContext self = new GetSpaceDirectoriesHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public GetSpaceDirectoriesHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
