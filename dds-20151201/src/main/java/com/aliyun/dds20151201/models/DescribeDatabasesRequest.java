// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeDatabasesRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dds-bp14bf67a76d****</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    public static DescribeDatabasesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDatabasesRequest self = new DescribeDatabasesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDatabasesRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

}
