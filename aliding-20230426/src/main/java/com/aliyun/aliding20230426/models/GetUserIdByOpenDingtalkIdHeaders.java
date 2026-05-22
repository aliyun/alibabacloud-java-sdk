// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetUserIdByOpenDingtalkIdHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public GetUserIdByOpenDingtalkIdHeadersAccountContext accountContext;

    public static GetUserIdByOpenDingtalkIdHeaders build(java.util.Map<String, ?> map) throws Exception {
        GetUserIdByOpenDingtalkIdHeaders self = new GetUserIdByOpenDingtalkIdHeaders();
        return TeaModel.build(map, self);
    }

    public GetUserIdByOpenDingtalkIdHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public GetUserIdByOpenDingtalkIdHeaders setAccountContext(GetUserIdByOpenDingtalkIdHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public GetUserIdByOpenDingtalkIdHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class GetUserIdByOpenDingtalkIdHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static GetUserIdByOpenDingtalkIdHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            GetUserIdByOpenDingtalkIdHeadersAccountContext self = new GetUserIdByOpenDingtalkIdHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public GetUserIdByOpenDingtalkIdHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
