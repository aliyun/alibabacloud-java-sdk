// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetNewestInnerGroupsHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public GetNewestInnerGroupsHeadersAccountContext accountContext;

    public static GetNewestInnerGroupsHeaders build(java.util.Map<String, ?> map) throws Exception {
        GetNewestInnerGroupsHeaders self = new GetNewestInnerGroupsHeaders();
        return TeaModel.build(map, self);
    }

    public GetNewestInnerGroupsHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public GetNewestInnerGroupsHeaders setAccountContext(GetNewestInnerGroupsHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public GetNewestInnerGroupsHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class GetNewestInnerGroupsHeadersAccountContext extends TeaModel {
        @NameInMap("accountId")
        public String accountId;

        public static GetNewestInnerGroupsHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            GetNewestInnerGroupsHeadersAccountContext self = new GetNewestInnerGroupsHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public GetNewestInnerGroupsHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
