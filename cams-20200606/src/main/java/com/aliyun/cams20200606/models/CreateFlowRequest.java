// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class CreateFlowRequest extends TeaModel {
    @NameInMap("Categories")
    public java.util.List<String> categories;

    @NameInMap("CustSpaceId")
    public String custSpaceId;

    @NameInMap("FlowName")
    public String flowName;

    public static CreateFlowRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateFlowRequest self = new CreateFlowRequest();
        return TeaModel.build(map, self);
    }

    public CreateFlowRequest setCategories(java.util.List<String> categories) {
        this.categories = categories;
        return this;
    }
    public java.util.List<String> getCategories() {
        return this.categories;
    }

    public CreateFlowRequest setCustSpaceId(String custSpaceId) {
        this.custSpaceId = custSpaceId;
        return this;
    }
    public String getCustSpaceId() {
        return this.custSpaceId;
    }

    public CreateFlowRequest setFlowName(String flowName) {
        this.flowName = flowName;
        return this;
    }
    public String getFlowName() {
        return this.flowName;
    }

}
