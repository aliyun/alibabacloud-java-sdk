// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class CreateFlowShrinkRequest extends TeaModel {
    @NameInMap("Categories")
    public String categoriesShrink;

    @NameInMap("CustSpaceId")
    public String custSpaceId;

    @NameInMap("FlowName")
    public String flowName;

    public static CreateFlowShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateFlowShrinkRequest self = new CreateFlowShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateFlowShrinkRequest setCategoriesShrink(String categoriesShrink) {
        this.categoriesShrink = categoriesShrink;
        return this;
    }
    public String getCategoriesShrink() {
        return this.categoriesShrink;
    }

    public CreateFlowShrinkRequest setCustSpaceId(String custSpaceId) {
        this.custSpaceId = custSpaceId;
        return this;
    }
    public String getCustSpaceId() {
        return this.custSpaceId;
    }

    public CreateFlowShrinkRequest setFlowName(String flowName) {
        this.flowName = flowName;
        return this;
    }
    public String getFlowName() {
        return this.flowName;
    }

}
