// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class StartInstanceHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public StartInstanceHeadersAccountContext accountContext;

    public static StartInstanceHeaders build(java.util.Map<String, ?> map) throws Exception {
        StartInstanceHeaders self = new StartInstanceHeaders();
        return TeaModel.build(map, self);
    }

    public StartInstanceHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public StartInstanceHeaders setAccountContext(StartInstanceHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public StartInstanceHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class StartInstanceHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static StartInstanceHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            StartInstanceHeadersAccountContext self = new StartInstanceHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public StartInstanceHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
