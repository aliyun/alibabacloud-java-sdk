// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetOrgOrWebOpenDocContentTaskIdRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20eMKjyp810mMdK4Hz4B5BA6JxAZB1Gv</p>
     */
    @NameInMap("DentryUuid")
    public String dentryUuid;

    @NameInMap("GenerateCp")
    public Boolean generateCp;

    /**
     * <strong>example:</strong>
     * <p>markdown</p>
     */
    @NameInMap("TargetFormat")
    public String targetFormat;

    @NameInMap("TenantContext")
    public GetOrgOrWebOpenDocContentTaskIdRequestTenantContext tenantContext;

    public static GetOrgOrWebOpenDocContentTaskIdRequest build(java.util.Map<String, ?> map) throws Exception {
        GetOrgOrWebOpenDocContentTaskIdRequest self = new GetOrgOrWebOpenDocContentTaskIdRequest();
        return TeaModel.build(map, self);
    }

    public GetOrgOrWebOpenDocContentTaskIdRequest setDentryUuid(String dentryUuid) {
        this.dentryUuid = dentryUuid;
        return this;
    }
    public String getDentryUuid() {
        return this.dentryUuid;
    }

    public GetOrgOrWebOpenDocContentTaskIdRequest setGenerateCp(Boolean generateCp) {
        this.generateCp = generateCp;
        return this;
    }
    public Boolean getGenerateCp() {
        return this.generateCp;
    }

    public GetOrgOrWebOpenDocContentTaskIdRequest setTargetFormat(String targetFormat) {
        this.targetFormat = targetFormat;
        return this;
    }
    public String getTargetFormat() {
        return this.targetFormat;
    }

    public GetOrgOrWebOpenDocContentTaskIdRequest setTenantContext(GetOrgOrWebOpenDocContentTaskIdRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public GetOrgOrWebOpenDocContentTaskIdRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public static class GetOrgOrWebOpenDocContentTaskIdRequestTenantContext extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxxxxx</p>
         */
        @NameInMap("tenantId")
        public String tenantId;

        public static GetOrgOrWebOpenDocContentTaskIdRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            GetOrgOrWebOpenDocContentTaskIdRequestTenantContext self = new GetOrgOrWebOpenDocContentTaskIdRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public GetOrgOrWebOpenDocContentTaskIdRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
