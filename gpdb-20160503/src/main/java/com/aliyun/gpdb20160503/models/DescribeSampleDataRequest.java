// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeSampleDataRequest extends TeaModel {
    /**
     * <p>The ID of the instance.</p>
     * <br>
     * <p>>  You can call the [DescribeDBInstances](~~86911~~) operation to query the IDs of all AnalyticDB for PostgreSQL instances in a specific region.</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("OwnerId")
    public Long ownerId;

    public static DescribeSampleDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSampleDataRequest self = new DescribeSampleDataRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSampleDataRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DescribeSampleDataRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

}
