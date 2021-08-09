// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.msha20200414.models;

import com.aliyun.tea.*;

public class UpdateSpringCloudFlowItemRuleShrinkRequest extends TeaModel {
    @NameInMap("requestData")
    public String requestDataShrink;

    public static UpdateSpringCloudFlowItemRuleShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSpringCloudFlowItemRuleShrinkRequest self = new UpdateSpringCloudFlowItemRuleShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSpringCloudFlowItemRuleShrinkRequest setRequestDataShrink(String requestDataShrink) {
        this.requestDataShrink = requestDataShrink;
        return this;
    }
    public String getRequestDataShrink() {
        return this.requestDataShrink;
    }

}
