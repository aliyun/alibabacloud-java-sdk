// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetDocContentTakIdRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>qnYMoO1rWxrkmoj2I5L2PYkoJ47Z3je9</p>
     */
    @NameInMap("DentryUuid")
    public String dentryUuid;

    /**
     * <strong>example:</strong>
     * <p>markdown</p>
     */
    @NameInMap("TargetFormat")
    public String targetFormat;

    @NameInMap("TenantContext")
    public GetDocContentTakIdRequestTenantContext tenantContext;

    public static GetDocContentTakIdRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDocContentTakIdRequest self = new GetDocContentTakIdRequest();
        return TeaModel.build(map, self);
    }

    public GetDocContentTakIdRequest setDentryUuid(String dentryUuid) {
        this.dentryUuid = dentryUuid;
        return this;
    }
    public String getDentryUuid() {
        return this.dentryUuid;
    }

    public GetDocContentTakIdRequest setTargetFormat(String targetFormat) {
        this.targetFormat = targetFormat;
        return this;
    }
    public String getTargetFormat() {
        return this.targetFormat;
    }

    public GetDocContentTakIdRequest setTenantContext(GetDocContentTakIdRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public GetDocContentTakIdRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public static class GetDocContentTakIdRequestTenantContext extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxxxxx</p>
         */
        @NameInMap("tenantId")
        public String tenantId;

        public static GetDocContentTakIdRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            GetDocContentTakIdRequestTenantContext self = new GetDocContentTakIdRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public GetDocContentTakIdRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
