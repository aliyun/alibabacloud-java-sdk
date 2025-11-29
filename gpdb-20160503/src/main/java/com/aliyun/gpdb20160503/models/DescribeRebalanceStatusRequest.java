// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeRebalanceStatusRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>gp-xxxxxxxxx</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    public static DescribeRebalanceStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRebalanceStatusRequest self = new DescribeRebalanceStatusRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRebalanceStatusRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

}
