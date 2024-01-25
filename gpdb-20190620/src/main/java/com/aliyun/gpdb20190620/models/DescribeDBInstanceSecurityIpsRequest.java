// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20190620.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceSecurityIpsRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("OwnerId")
    public Long ownerId;

    public static DescribeDBInstanceSecurityIpsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceSecurityIpsRequest self = new DescribeDBInstanceSecurityIpsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstanceSecurityIpsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeDBInstanceSecurityIpsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

}
