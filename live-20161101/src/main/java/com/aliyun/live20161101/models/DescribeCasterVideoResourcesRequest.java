// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeCasterVideoResourcesRequest extends TeaModel {
    @NameInMap("CasterId")
    @Validation(required = true)
    public String casterId;

    public static DescribeCasterVideoResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCasterVideoResourcesRequest self = new DescribeCasterVideoResourcesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCasterVideoResourcesRequest setCasterId(String casterId) {
        this.casterId = casterId;
        return this;
    }
    public String getCasterId() {
        return this.casterId;
    }

}
