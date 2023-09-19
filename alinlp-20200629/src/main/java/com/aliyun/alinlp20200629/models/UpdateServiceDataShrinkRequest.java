// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alinlp20200629.models;

import com.aliyun.tea.*;

public class UpdateServiceDataShrinkRequest extends TeaModel {
    @NameInMap("Conditions")
    public String conditionsShrink;

    @NameInMap("ServiceId")
    public Long serviceId;

    public static UpdateServiceDataShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateServiceDataShrinkRequest self = new UpdateServiceDataShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateServiceDataShrinkRequest setConditionsShrink(String conditionsShrink) {
        this.conditionsShrink = conditionsShrink;
        return this;
    }
    public String getConditionsShrink() {
        return this.conditionsShrink;
    }

    public UpdateServiceDataShrinkRequest setServiceId(Long serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public Long getServiceId() {
        return this.serviceId;
    }

}
