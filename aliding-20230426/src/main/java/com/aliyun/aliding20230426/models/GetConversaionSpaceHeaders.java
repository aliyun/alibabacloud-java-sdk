// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetConversaionSpaceHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public GetConversaionSpaceHeadersAccountContext accountContext;

    public static GetConversaionSpaceHeaders build(java.util.Map<String, ?> map) throws Exception {
        GetConversaionSpaceHeaders self = new GetConversaionSpaceHeaders();
        return TeaModel.build(map, self);
    }

    public GetConversaionSpaceHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public GetConversaionSpaceHeaders setAccountContext(GetConversaionSpaceHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public GetConversaionSpaceHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class GetConversaionSpaceHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static GetConversaionSpaceHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            GetConversaionSpaceHeadersAccountContext self = new GetConversaionSpaceHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public GetConversaionSpaceHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
