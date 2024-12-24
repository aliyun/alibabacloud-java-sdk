// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetOrgOrWebOpenDocContentTaskIdShrinkRequest extends TeaModel {
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
    public String tenantContextShrink;

    public static GetOrgOrWebOpenDocContentTaskIdShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetOrgOrWebOpenDocContentTaskIdShrinkRequest self = new GetOrgOrWebOpenDocContentTaskIdShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetOrgOrWebOpenDocContentTaskIdShrinkRequest setDentryUuid(String dentryUuid) {
        this.dentryUuid = dentryUuid;
        return this;
    }
    public String getDentryUuid() {
        return this.dentryUuid;
    }

    public GetOrgOrWebOpenDocContentTaskIdShrinkRequest setGenerateCp(Boolean generateCp) {
        this.generateCp = generateCp;
        return this;
    }
    public Boolean getGenerateCp() {
        return this.generateCp;
    }

    public GetOrgOrWebOpenDocContentTaskIdShrinkRequest setTargetFormat(String targetFormat) {
        this.targetFormat = targetFormat;
        return this;
    }
    public String getTargetFormat() {
        return this.targetFormat;
    }

    public GetOrgOrWebOpenDocContentTaskIdShrinkRequest setTenantContextShrink(String tenantContextShrink) {
        this.tenantContextShrink = tenantContextShrink;
        return this;
    }
    public String getTenantContextShrink() {
        return this.tenantContextShrink;
    }

}
