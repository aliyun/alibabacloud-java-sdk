// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class ListPermissionsShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>KGZLxjv9VGkoG9YwHE5wx7k2V6EDybno</p>
     */
    @NameInMap("DentryUuid")
    public String dentryUuid;

    @NameInMap("Option")
    public String optionShrink;

    @NameInMap("TenantContext")
    public String tenantContextShrink;

    public static ListPermissionsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPermissionsShrinkRequest self = new ListPermissionsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListPermissionsShrinkRequest setDentryUuid(String dentryUuid) {
        this.dentryUuid = dentryUuid;
        return this;
    }
    public String getDentryUuid() {
        return this.dentryUuid;
    }

    public ListPermissionsShrinkRequest setOptionShrink(String optionShrink) {
        this.optionShrink = optionShrink;
        return this;
    }
    public String getOptionShrink() {
        return this.optionShrink;
    }

    public ListPermissionsShrinkRequest setTenantContextShrink(String tenantContextShrink) {
        this.tenantContextShrink = tenantContextShrink;
        return this;
    }
    public String getTenantContextShrink() {
        return this.tenantContextShrink;
    }

}
