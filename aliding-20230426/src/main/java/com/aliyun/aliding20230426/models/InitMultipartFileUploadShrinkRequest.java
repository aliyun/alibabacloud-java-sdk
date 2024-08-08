// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class InitMultipartFileUploadShrinkRequest extends TeaModel {
    @NameInMap("Option")
    public String optionShrink;

    /**
     * <strong>example:</strong>
     * <p>dentryUuid</p>
     */
    @NameInMap("ParentDentryUuid")
    public String parentDentryUuid;

    @NameInMap("TenantContext")
    public String tenantContextShrink;

    public static InitMultipartFileUploadShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        InitMultipartFileUploadShrinkRequest self = new InitMultipartFileUploadShrinkRequest();
        return TeaModel.build(map, self);
    }

    public InitMultipartFileUploadShrinkRequest setOptionShrink(String optionShrink) {
        this.optionShrink = optionShrink;
        return this;
    }
    public String getOptionShrink() {
        return this.optionShrink;
    }

    public InitMultipartFileUploadShrinkRequest setParentDentryUuid(String parentDentryUuid) {
        this.parentDentryUuid = parentDentryUuid;
        return this;
    }
    public String getParentDentryUuid() {
        return this.parentDentryUuid;
    }

    public InitMultipartFileUploadShrinkRequest setTenantContextShrink(String tenantContextShrink) {
        this.tenantContextShrink = tenantContextShrink;
        return this;
    }
    public String getTenantContextShrink() {
        return this.tenantContextShrink;
    }

}
