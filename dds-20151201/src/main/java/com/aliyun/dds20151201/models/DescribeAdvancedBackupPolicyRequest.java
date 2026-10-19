// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeAdvancedBackupPolicyRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dds-bp18b0934e70****</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    public static DescribeAdvancedBackupPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAdvancedBackupPolicyRequest self = new DescribeAdvancedBackupPolicyRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAdvancedBackupPolicyRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

}
