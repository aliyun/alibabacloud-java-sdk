// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetFileDownloadInfoShrinkRequest extends TeaModel {
    @NameInMap("DentryId")
    public String dentryId;

    @NameInMap("Option")
    public String optionShrink;

    @NameInMap("SpaceId")
    public String spaceId;

    @NameInMap("TenantContext")
    public String tenantContextShrink;

    public static GetFileDownloadInfoShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetFileDownloadInfoShrinkRequest self = new GetFileDownloadInfoShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetFileDownloadInfoShrinkRequest setDentryId(String dentryId) {
        this.dentryId = dentryId;
        return this;
    }
    public String getDentryId() {
        return this.dentryId;
    }

    public GetFileDownloadInfoShrinkRequest setOptionShrink(String optionShrink) {
        this.optionShrink = optionShrink;
        return this;
    }
    public String getOptionShrink() {
        return this.optionShrink;
    }

    public GetFileDownloadInfoShrinkRequest setSpaceId(String spaceId) {
        this.spaceId = spaceId;
        return this;
    }
    public String getSpaceId() {
        return this.spaceId;
    }

    public GetFileDownloadInfoShrinkRequest setTenantContextShrink(String tenantContextShrink) {
        this.tenantContextShrink = tenantContextShrink;
        return this;
    }
    public String getTenantContextShrink() {
        return this.tenantContextShrink;
    }

}
