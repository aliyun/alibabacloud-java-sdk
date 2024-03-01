// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetDocContentRequest extends TeaModel {
    @NameInMap("DentryUuid")
    public String dentryUuid;

    @NameInMap("TargetFormat")
    public String targetFormat;

    @NameInMap("TenantContext")
    public GetDocContentRequestTenantContext tenantContext;

    @NameInMap("userToken")
    public String userToken;

    public static GetDocContentRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDocContentRequest self = new GetDocContentRequest();
        return TeaModel.build(map, self);
    }

    public GetDocContentRequest setDentryUuid(String dentryUuid) {
        this.dentryUuid = dentryUuid;
        return this;
    }
    public String getDentryUuid() {
        return this.dentryUuid;
    }

    public GetDocContentRequest setTargetFormat(String targetFormat) {
        this.targetFormat = targetFormat;
        return this;
    }
    public String getTargetFormat() {
        return this.targetFormat;
    }

    public GetDocContentRequest setTenantContext(GetDocContentRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public GetDocContentRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public GetDocContentRequest setUserToken(String userToken) {
        this.userToken = userToken;
        return this;
    }
    public String getUserToken() {
        return this.userToken;
    }

    public static class GetDocContentRequestTenantContext extends TeaModel {
        @NameInMap("tenantId")
        public String tenantId;

        public static GetDocContentRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            GetDocContentRequestTenantContext self = new GetDocContentRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public GetDocContentRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
