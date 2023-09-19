// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alinlp20200629.models;

import com.aliyun.tea.*;

public class DeleteServiceDataByConditionsShrinkRequest extends TeaModel {
    @NameInMap("Conditions")
    public String conditionsShrink;

    @NameInMap("ServiceId")
    public Long serviceId;

    public static DeleteServiceDataByConditionsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteServiceDataByConditionsShrinkRequest self = new DeleteServiceDataByConditionsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DeleteServiceDataByConditionsShrinkRequest setConditionsShrink(String conditionsShrink) {
        this.conditionsShrink = conditionsShrink;
        return this;
    }
    public String getConditionsShrink() {
        return this.conditionsShrink;
    }

    public DeleteServiceDataByConditionsShrinkRequest setServiceId(Long serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public Long getServiceId() {
        return this.serviceId;
    }

}
