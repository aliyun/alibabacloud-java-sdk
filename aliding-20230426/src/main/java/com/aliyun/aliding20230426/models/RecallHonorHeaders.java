// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class RecallHonorHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public RecallHonorHeadersAccountContext accountContext;

    public static RecallHonorHeaders build(java.util.Map<String, ?> map) throws Exception {
        RecallHonorHeaders self = new RecallHonorHeaders();
        return TeaModel.build(map, self);
    }

    public RecallHonorHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public RecallHonorHeaders setAccountContext(RecallHonorHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public RecallHonorHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class RecallHonorHeadersAccountContext extends TeaModel {
        @NameInMap("accountId")
        public String accountId;

        public static RecallHonorHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            RecallHonorHeadersAccountContext self = new RecallHonorHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public RecallHonorHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
