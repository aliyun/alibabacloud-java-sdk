// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetDocContentShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DentryUuid")
    public String dentryUuid;

    @NameInMap("TargetFormat")
    public String targetFormat;

    @NameInMap("TenantContext")
    public String tenantContextShrink;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("userToken")
    public String userToken;

    public static GetDocContentShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDocContentShrinkRequest self = new GetDocContentShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetDocContentShrinkRequest setDentryUuid(String dentryUuid) {
        this.dentryUuid = dentryUuid;
        return this;
    }
    public String getDentryUuid() {
        return this.dentryUuid;
    }

    public GetDocContentShrinkRequest setTargetFormat(String targetFormat) {
        this.targetFormat = targetFormat;
        return this;
    }
    public String getTargetFormat() {
        return this.targetFormat;
    }

    public GetDocContentShrinkRequest setTenantContextShrink(String tenantContextShrink) {
        this.tenantContextShrink = tenantContextShrink;
        return this;
    }
    public String getTenantContextShrink() {
        return this.tenantContextShrink;
    }

    public GetDocContentShrinkRequest setUserToken(String userToken) {
        this.userToken = userToken;
        return this;
    }
    public String getUserToken() {
        return this.userToken;
    }

}
