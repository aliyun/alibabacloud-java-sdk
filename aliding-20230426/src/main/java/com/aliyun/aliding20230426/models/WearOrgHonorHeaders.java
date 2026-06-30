// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class WearOrgHonorHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public WearOrgHonorHeadersAccountContext accountContext;

    public static WearOrgHonorHeaders build(java.util.Map<String, ?> map) throws Exception {
        WearOrgHonorHeaders self = new WearOrgHonorHeaders();
        return TeaModel.build(map, self);
    }

    public WearOrgHonorHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public WearOrgHonorHeaders setAccountContext(WearOrgHonorHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public WearOrgHonorHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class WearOrgHonorHeadersAccountContext extends TeaModel {
        @NameInMap("accountId")
        public String accountId;

        public static WearOrgHonorHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            WearOrgHonorHeadersAccountContext self = new WearOrgHonorHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public WearOrgHonorHeadersAccountContext setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
