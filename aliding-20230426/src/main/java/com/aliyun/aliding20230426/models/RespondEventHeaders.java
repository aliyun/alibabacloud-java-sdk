// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class RespondEventHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public RespondEventHeadersAccountContext accountContext;

    public static RespondEventHeaders build(java.util.Map<String, ?> map) throws Exception {
        RespondEventHeaders self = new RespondEventHeaders();
        return TeaModel.build(map, self);
    }

    public RespondEventHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public RespondEventHeaders setAccountContext(RespondEventHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public RespondEventHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class RespondEventHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static RespondEventHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            RespondEventHeadersAccountContext self = new RespondEventHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public RespondEventHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
