// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeBackupPolicyRequest extends TeaModel {
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    public static DescribeBackupPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupPolicyRequest self = new DescribeBackupPolicyRequest();
        return TeaModel.build(map, self);
    }

    public DescribeBackupPolicyRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

}
