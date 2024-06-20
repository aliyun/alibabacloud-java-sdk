// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class StopMinutesHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public StopMinutesHeadersAccountContext accountContext;

    public static StopMinutesHeaders build(java.util.Map<String, ?> map) throws Exception {
        StopMinutesHeaders self = new StopMinutesHeaders();
        return TeaModel.build(map, self);
    }

    public StopMinutesHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public StopMinutesHeaders setAccountContext(StopMinutesHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public StopMinutesHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class StopMinutesHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static StopMinutesHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            StopMinutesHeadersAccountContext self = new StopMinutesHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public StopMinutesHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
