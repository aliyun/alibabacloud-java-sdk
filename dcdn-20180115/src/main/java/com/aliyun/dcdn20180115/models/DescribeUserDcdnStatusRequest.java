// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeUserDcdnStatusRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    public static DescribeUserDcdnStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserDcdnStatusRequest self = new DescribeUserDcdnStatusRequest();
        return TeaModel.build(map, self);
    }

    public DescribeUserDcdnStatusRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

}
