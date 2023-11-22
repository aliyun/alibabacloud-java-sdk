// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class ModifyFlowRequest extends TeaModel {
    @NameInMap("Categories")
    public java.util.List<String> categories;

    @NameInMap("CustSpaceId")
    public String custSpaceId;

    @NameInMap("FlowId")
    public String flowId;

    @NameInMap("FlowName")
    public String flowName;

    public static ModifyFlowRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyFlowRequest self = new ModifyFlowRequest();
        return TeaModel.build(map, self);
    }

    public ModifyFlowRequest setCategories(java.util.List<String> categories) {
        this.categories = categories;
        return this;
    }
    public java.util.List<String> getCategories() {
        return this.categories;
    }

    public ModifyFlowRequest setCustSpaceId(String custSpaceId) {
        this.custSpaceId = custSpaceId;
        return this;
    }
    public String getCustSpaceId() {
        return this.custSpaceId;
    }

    public ModifyFlowRequest setFlowId(String flowId) {
        this.flowId = flowId;
        return this;
    }
    public String getFlowId() {
        return this.flowId;
    }

    public ModifyFlowRequest setFlowName(String flowName) {
        this.flowName = flowName;
        return this;
    }
    public String getFlowName() {
        return this.flowName;
    }

}
