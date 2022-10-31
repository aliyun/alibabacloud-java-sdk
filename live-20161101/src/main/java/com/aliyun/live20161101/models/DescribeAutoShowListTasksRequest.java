// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeAutoShowListTasksRequest extends TeaModel {
    @NameInMap("CasterId")
    public String casterId;

    @NameInMap("OwnerId")
    public Long ownerId;

    public static DescribeAutoShowListTasksRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAutoShowListTasksRequest self = new DescribeAutoShowListTasksRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAutoShowListTasksRequest setCasterId(String casterId) {
        this.casterId = casterId;
        return this;
    }
    public String getCasterId() {
        return this.casterId;
    }

    public DescribeAutoShowListTasksRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

}
