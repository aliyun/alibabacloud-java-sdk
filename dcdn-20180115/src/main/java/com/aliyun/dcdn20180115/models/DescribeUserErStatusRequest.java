// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeUserErStatusRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    public static DescribeUserErStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserErStatusRequest self = new DescribeUserErStatusRequest();
        return TeaModel.build(map, self);
    }

    public DescribeUserErStatusRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

}
