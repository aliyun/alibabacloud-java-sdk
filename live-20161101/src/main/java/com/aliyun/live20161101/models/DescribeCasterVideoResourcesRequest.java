// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeCasterVideoResourcesRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("CasterId")
    public String casterId;

    public static DescribeCasterVideoResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCasterVideoResourcesRequest self = new DescribeCasterVideoResourcesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCasterVideoResourcesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeCasterVideoResourcesRequest setCasterId(String casterId) {
        this.casterId = casterId;
        return this;
    }
    public String getCasterId() {
        return this.casterId;
    }

}
