// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GrantHonorHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public GrantHonorHeadersAccountContext accountContext;

    public static GrantHonorHeaders build(java.util.Map<String, ?> map) throws Exception {
        GrantHonorHeaders self = new GrantHonorHeaders();
        return TeaModel.build(map, self);
    }

    public GrantHonorHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public GrantHonorHeaders setAccountContext(GrantHonorHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public GrantHonorHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class GrantHonorHeadersAccountContext extends TeaModel {
        @NameInMap("accountId")
        public String accountId;

        public static GrantHonorHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            GrantHonorHeadersAccountContext self = new GrantHonorHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public GrantHonorHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
