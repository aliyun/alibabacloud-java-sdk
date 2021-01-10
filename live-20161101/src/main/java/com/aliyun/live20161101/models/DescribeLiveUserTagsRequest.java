// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveUserTagsRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    public static DescribeLiveUserTagsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveUserTagsRequest self = new DescribeLiveUserTagsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeLiveUserTagsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

}
