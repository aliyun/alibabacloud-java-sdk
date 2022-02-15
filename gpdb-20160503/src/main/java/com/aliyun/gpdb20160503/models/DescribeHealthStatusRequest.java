// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeHealthStatusRequest extends TeaModel {
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("Key")
    public String key;

    public static DescribeHealthStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeHealthStatusRequest self = new DescribeHealthStatusRequest();
        return TeaModel.build(map, self);
    }

    public DescribeHealthStatusRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DescribeHealthStatusRequest setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

}
