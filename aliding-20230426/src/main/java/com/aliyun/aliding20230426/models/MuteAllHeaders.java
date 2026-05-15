// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class MuteAllHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public MuteAllHeadersAccountContext accountContext;

    public static MuteAllHeaders build(java.util.Map<String, ?> map) throws Exception {
        MuteAllHeaders self = new MuteAllHeaders();
        return TeaModel.build(map, self);
    }

    public MuteAllHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public MuteAllHeaders setAccountContext(MuteAllHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public MuteAllHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class MuteAllHeadersAccountContext extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("accountId")
        public String accountId;

        public static MuteAllHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            MuteAllHeadersAccountContext self = new MuteAllHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public MuteAllHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
