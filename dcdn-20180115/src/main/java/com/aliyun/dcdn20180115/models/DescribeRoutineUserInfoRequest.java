// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeRoutineUserInfoRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    public static DescribeRoutineUserInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRoutineUserInfoRequest self = new DescribeRoutineUserInfoRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRoutineUserInfoRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

}
