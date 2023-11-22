// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class ModifyFlowShrinkRequest extends TeaModel {
    @NameInMap("Categories")
    public String categoriesShrink;

    @NameInMap("CustSpaceId")
    public String custSpaceId;

    @NameInMap("FlowId")
    public String flowId;

    @NameInMap("FlowName")
    public String flowName;

    public static ModifyFlowShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyFlowShrinkRequest self = new ModifyFlowShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ModifyFlowShrinkRequest setCategoriesShrink(String categoriesShrink) {
        this.categoriesShrink = categoriesShrink;
        return this;
    }
    public String getCategoriesShrink() {
        return this.categoriesShrink;
    }

    public ModifyFlowShrinkRequest setCustSpaceId(String custSpaceId) {
        this.custSpaceId = custSpaceId;
        return this;
    }
    public String getCustSpaceId() {
        return this.custSpaceId;
    }

    public ModifyFlowShrinkRequest setFlowId(String flowId) {
        this.flowId = flowId;
        return this;
    }
    public String getFlowId() {
        return this.flowId;
    }

    public ModifyFlowShrinkRequest setFlowName(String flowName) {
        this.flowName = flowName;
        return this;
    }
    public String getFlowName() {
        return this.flowName;
    }

}
