// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class StartMinutesHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public StartMinutesHeadersAccountContext accountContext;

    public static StartMinutesHeaders build(java.util.Map<String, ?> map) throws Exception {
        StartMinutesHeaders self = new StartMinutesHeaders();
        return TeaModel.build(map, self);
    }

    public StartMinutesHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public StartMinutesHeaders setAccountContext(StartMinutesHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public StartMinutesHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class StartMinutesHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static StartMinutesHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            StartMinutesHeadersAccountContext self = new StartMinutesHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public StartMinutesHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
