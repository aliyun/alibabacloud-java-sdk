// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeAdvancedBackupStatusRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dds-bp1hyjjqztj5****</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    public static DescribeAdvancedBackupStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAdvancedBackupStatusRequest self = new DescribeAdvancedBackupStatusRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAdvancedBackupStatusRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

}
