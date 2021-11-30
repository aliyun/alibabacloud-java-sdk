// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class ReleaseServiceRequest extends TeaModel {
    // 灰度权重，范围 [0, 100]
    @NameInMap("Weight")
    public Integer weight;

    public static ReleaseServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        ReleaseServiceRequest self = new ReleaseServiceRequest();
        return TeaModel.build(map, self);
    }

    public ReleaseServiceRequest setWeight(Integer weight) {
        this.weight = weight;
        return this;
    }
    public Integer getWeight() {
        return this.weight;
    }

}
