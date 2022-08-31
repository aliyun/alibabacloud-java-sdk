// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeRealtimeLogAuthorizedRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    public static DescribeRealtimeLogAuthorizedRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRealtimeLogAuthorizedRequest self = new DescribeRealtimeLogAuthorizedRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRealtimeLogAuthorizedRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

}
