// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCustomLogConfigRequest extends TeaModel {
    @NameInMap("ConfigId")
    public String configId;

    @NameInMap("OwnerId")
    public Long ownerId;

    public static DescribeCustomLogConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCustomLogConfigRequest self = new DescribeCustomLogConfigRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCustomLogConfigRequest setConfigId(String configId) {
        this.configId = configId;
        return this;
    }
    public String getConfigId() {
        return this.configId;
    }

    public DescribeCustomLogConfigRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

}
