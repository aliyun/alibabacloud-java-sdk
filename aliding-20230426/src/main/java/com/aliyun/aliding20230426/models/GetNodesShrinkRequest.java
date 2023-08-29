// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetNodesShrinkRequest extends TeaModel {
    @NameInMap("NodeIds")
    public String nodeIdsShrink;

    @NameInMap("Option")
    public String optionShrink;

    @NameInMap("TenantContext")
    public String tenantContextShrink;

    public static GetNodesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetNodesShrinkRequest self = new GetNodesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetNodesShrinkRequest setNodeIdsShrink(String nodeIdsShrink) {
        this.nodeIdsShrink = nodeIdsShrink;
        return this;
    }
    public String getNodeIdsShrink() {
        return this.nodeIdsShrink;
    }

    public GetNodesShrinkRequest setOptionShrink(String optionShrink) {
        this.optionShrink = optionShrink;
        return this;
    }
    public String getOptionShrink() {
        return this.optionShrink;
    }

    public GetNodesShrinkRequest setTenantContextShrink(String tenantContextShrink) {
        this.tenantContextShrink = tenantContextShrink;
        return this;
    }
    public String getTenantContextShrink() {
        return this.tenantContextShrink;
    }

}
