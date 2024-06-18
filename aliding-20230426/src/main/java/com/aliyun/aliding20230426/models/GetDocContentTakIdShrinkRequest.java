// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetDocContentTakIdShrinkRequest extends TeaModel {
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
    public String tenantContextShrink;

    public static GetDocContentTakIdShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDocContentTakIdShrinkRequest self = new GetDocContentTakIdShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetDocContentTakIdShrinkRequest setDentryUuid(String dentryUuid) {
        this.dentryUuid = dentryUuid;
        return this;
    }
    public String getDentryUuid() {
        return this.dentryUuid;
    }

    public GetDocContentTakIdShrinkRequest setTargetFormat(String targetFormat) {
        this.targetFormat = targetFormat;
        return this;
    }
    public String getTargetFormat() {
        return this.targetFormat;
    }

    public GetDocContentTakIdShrinkRequest setTenantContextShrink(String tenantContextShrink) {
        this.tenantContextShrink = tenantContextShrink;
        return this;
    }
    public String getTenantContextShrink() {
        return this.tenantContextShrink;
    }

}
