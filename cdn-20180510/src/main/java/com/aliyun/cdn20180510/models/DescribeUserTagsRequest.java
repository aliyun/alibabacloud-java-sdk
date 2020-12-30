// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeUserTagsRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    public static DescribeUserTagsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserTagsRequest self = new DescribeUserTagsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeUserTagsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

}
