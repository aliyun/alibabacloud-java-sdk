// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeCasterComponentsRequest extends TeaModel {
    @NameInMap("CasterId")
    @Validation(required = true)
    public String casterId;

    @NameInMap("ComponentId")
    public String componentId;

    public static DescribeCasterComponentsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCasterComponentsRequest self = new DescribeCasterComponentsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCasterComponentsRequest setCasterId(String casterId) {
        this.casterId = casterId;
        return this;
    }
    public String getCasterId() {
        return this.casterId;
    }

    public DescribeCasterComponentsRequest setComponentId(String componentId) {
        this.componentId = componentId;
        return this;
    }
    public String getComponentId() {
        return this.componentId;
    }

}
