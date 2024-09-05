// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetSheetContentJobIdHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public GetSheetContentJobIdHeadersAccountContext accountContext;

    public static GetSheetContentJobIdHeaders build(java.util.Map<String, ?> map) throws Exception {
        GetSheetContentJobIdHeaders self = new GetSheetContentJobIdHeaders();
        return TeaModel.build(map, self);
    }

    public GetSheetContentJobIdHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public GetSheetContentJobIdHeaders setAccountContext(GetSheetContentJobIdHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public GetSheetContentJobIdHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class GetSheetContentJobIdHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static GetSheetContentJobIdHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            GetSheetContentJobIdHeadersAccountContext self = new GetSheetContentJobIdHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public GetSheetContentJobIdHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
