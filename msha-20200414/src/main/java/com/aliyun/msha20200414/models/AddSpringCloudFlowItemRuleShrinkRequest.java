// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.msha20200414.models;

import com.aliyun.tea.*;

public class AddSpringCloudFlowItemRuleShrinkRequest extends TeaModel {
    @NameInMap("requestData")
    public String requestDataShrink;

    public static AddSpringCloudFlowItemRuleShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        AddSpringCloudFlowItemRuleShrinkRequest self = new AddSpringCloudFlowItemRuleShrinkRequest();
        return TeaModel.build(map, self);
    }

    public AddSpringCloudFlowItemRuleShrinkRequest setRequestDataShrink(String requestDataShrink) {
        this.requestDataShrink = requestDataShrink;
        return this;
    }
    public String getRequestDataShrink() {
        return this.requestDataShrink;
    }

}
