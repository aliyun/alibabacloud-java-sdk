// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnUserTagsRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    public static DescribeDcdnUserTagsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnUserTagsRequest self = new DescribeDcdnUserTagsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnUserTagsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

}
