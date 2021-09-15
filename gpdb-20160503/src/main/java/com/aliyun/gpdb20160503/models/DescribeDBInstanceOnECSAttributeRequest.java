// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceOnECSAttributeRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    public static DescribeDBInstanceOnECSAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceOnECSAttributeRequest self = new DescribeDBInstanceOnECSAttributeRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstanceOnECSAttributeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeDBInstanceOnECSAttributeRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

}
