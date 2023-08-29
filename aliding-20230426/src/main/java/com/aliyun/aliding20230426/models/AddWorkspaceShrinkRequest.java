// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class AddWorkspaceShrinkRequest extends TeaModel {
    @NameInMap("Name")
    public String name;

    @NameInMap("Option")
    public String optionShrink;

    @NameInMap("TenantContext")
    public String tenantContextShrink;

    public static AddWorkspaceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        AddWorkspaceShrinkRequest self = new AddWorkspaceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public AddWorkspaceShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AddWorkspaceShrinkRequest setOptionShrink(String optionShrink) {
        this.optionShrink = optionShrink;
        return this;
    }
    public String getOptionShrink() {
        return this.optionShrink;
    }

    public AddWorkspaceShrinkRequest setTenantContextShrink(String tenantContextShrink) {
        this.tenantContextShrink = tenantContextShrink;
        return this;
    }
    public String getTenantContextShrink() {
        return this.tenantContextShrink;
    }

}
