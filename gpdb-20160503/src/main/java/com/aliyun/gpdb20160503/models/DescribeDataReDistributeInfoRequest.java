// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeDataReDistributeInfoRequest extends TeaModel {
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("OwnerId")
    public Long ownerId;

    public static DescribeDataReDistributeInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataReDistributeInfoRequest self = new DescribeDataReDistributeInfoRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDataReDistributeInfoRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DescribeDataReDistributeInfoRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

}