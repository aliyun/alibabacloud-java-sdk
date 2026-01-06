// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetDingtalkProjectionInfoHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public GetDingtalkProjectionInfoHeadersAccountContext accountContext;

    public static GetDingtalkProjectionInfoHeaders build(java.util.Map<String, ?> map) throws Exception {
        GetDingtalkProjectionInfoHeaders self = new GetDingtalkProjectionInfoHeaders();
        return TeaModel.build(map, self);
    }

    public GetDingtalkProjectionInfoHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public GetDingtalkProjectionInfoHeaders setAccountContext(GetDingtalkProjectionInfoHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public GetDingtalkProjectionInfoHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class GetDingtalkProjectionInfoHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static GetDingtalkProjectionInfoHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            GetDingtalkProjectionInfoHeadersAccountContext self = new GetDingtalkProjectionInfoHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public GetDingtalkProjectionInfoHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
