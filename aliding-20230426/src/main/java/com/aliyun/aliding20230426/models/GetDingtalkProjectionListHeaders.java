// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetDingtalkProjectionListHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public GetDingtalkProjectionListHeadersAccountContext accountContext;

    public static GetDingtalkProjectionListHeaders build(java.util.Map<String, ?> map) throws Exception {
        GetDingtalkProjectionListHeaders self = new GetDingtalkProjectionListHeaders();
        return TeaModel.build(map, self);
    }

    public GetDingtalkProjectionListHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public GetDingtalkProjectionListHeaders setAccountContext(GetDingtalkProjectionListHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public GetDingtalkProjectionListHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class GetDingtalkProjectionListHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static GetDingtalkProjectionListHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            GetDingtalkProjectionListHeadersAccountContext self = new GetDingtalkProjectionListHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public GetDingtalkProjectionListHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
