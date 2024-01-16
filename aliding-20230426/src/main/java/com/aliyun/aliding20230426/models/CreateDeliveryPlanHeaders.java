// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class CreateDeliveryPlanHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("AccountContext")
    public CreateDeliveryPlanHeadersAccountContext accountContext;

    public static CreateDeliveryPlanHeaders build(java.util.Map<String, ?> map) throws Exception {
        CreateDeliveryPlanHeaders self = new CreateDeliveryPlanHeaders();
        return TeaModel.build(map, self);
    }

    public CreateDeliveryPlanHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public CreateDeliveryPlanHeaders setAccountContext(CreateDeliveryPlanHeadersAccountContext accountContext) {
        this.accountContext = accountContext;
        return this;
    }
    public CreateDeliveryPlanHeadersAccountContext getAccountContext() {
        return this.accountContext;
    }

    public static class CreateDeliveryPlanHeadersAccountContext extends TeaModel {
        @NameInMap("userToken")
        public String userToken;

        public static CreateDeliveryPlanHeadersAccountContext build(java.util.Map<String, ?> map) throws Exception {
            CreateDeliveryPlanHeadersAccountContext self = new CreateDeliveryPlanHeadersAccountContext();
            return TeaModel.build(map, self);
        }

        public CreateDeliveryPlanHeadersAccountContext setUserToken(String userToken) {
            this.userToken = userToken;
            return this;
        }
        public String getUserToken() {
            return this.userToken;
        }

    }

}
