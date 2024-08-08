// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetFileUploadInfoShrinkRequest extends TeaModel {
    @NameInMap("Option")
    public String optionShrink;

    /**
     * <strong>example:</strong>
     * <p>dentryUuid</p>
     */
    @NameInMap("ParentDentryUuid")
    public String parentDentryUuid;

    /**
     * <strong>example:</strong>
     * <p>HEADER_SIGNATURE</p>
     */
    @NameInMap("Protocol")
    public String protocol;

    @NameInMap("TenantContext")
    public String tenantContextShrink;

    public static GetFileUploadInfoShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetFileUploadInfoShrinkRequest self = new GetFileUploadInfoShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetFileUploadInfoShrinkRequest setOptionShrink(String optionShrink) {
        this.optionShrink = optionShrink;
        return this;
    }
    public String getOptionShrink() {
        return this.optionShrink;
    }

    public GetFileUploadInfoShrinkRequest setParentDentryUuid(String parentDentryUuid) {
        this.parentDentryUuid = parentDentryUuid;
        return this;
    }
    public String getParentDentryUuid() {
        return this.parentDentryUuid;
    }

    public GetFileUploadInfoShrinkRequest setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

    public GetFileUploadInfoShrinkRequest setTenantContextShrink(String tenantContextShrink) {
        this.tenantContextShrink = tenantContextShrink;
        return this;
    }
    public String getTenantContextShrink() {
        return this.tenantContextShrink;
    }

}
