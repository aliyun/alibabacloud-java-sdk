// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeRoutineCanaryEnvsRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    public static DescribeRoutineCanaryEnvsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRoutineCanaryEnvsRequest self = new DescribeRoutineCanaryEnvsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRoutineCanaryEnvsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

}
