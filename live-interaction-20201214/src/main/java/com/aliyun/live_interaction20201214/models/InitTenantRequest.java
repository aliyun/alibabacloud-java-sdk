// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class InitTenantRequest extends TeaModel {
    @NameInMap("Request")
    public InitTenantRequestRequest request;

    public static InitTenantRequest build(java.util.Map<String, ?> map) throws Exception {
        InitTenantRequest self = new InitTenantRequest();
        return TeaModel.build(map, self);
    }

    public InitTenantRequest setRequest(InitTenantRequestRequest request) {
        this.request = request;
        return this;
    }
    public InitTenantRequestRequest getRequest() {
        return this.request;
    }

    public static class InitTenantRequestRequest extends TeaModel {
        @NameInMap("domain")
        public String domain;

        public static InitTenantRequestRequest build(java.util.Map<String, ?> map) throws Exception {
            InitTenantRequestRequest self = new InitTenantRequestRequest();
            return TeaModel.build(map, self);
        }

        public InitTenantRequestRequest setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

    }

}
