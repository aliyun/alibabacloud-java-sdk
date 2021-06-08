// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeRoutineSpecRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    public static DescribeRoutineSpecRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRoutineSpecRequest self = new DescribeRoutineSpecRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRoutineSpecRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

}
