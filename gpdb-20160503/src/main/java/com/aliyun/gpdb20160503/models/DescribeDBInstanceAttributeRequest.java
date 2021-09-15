// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceAttributeRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    public static DescribeDBInstanceAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceAttributeRequest self = new DescribeDBInstanceAttributeRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstanceAttributeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeDBInstanceAttributeRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

}
