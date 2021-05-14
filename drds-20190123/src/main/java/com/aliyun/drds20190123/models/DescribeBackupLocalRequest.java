// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeBackupLocalRequest extends TeaModel {
    @NameInMap("DrdsInstanceId")
    @Validation(required = true)
    public String drdsInstanceId;

    public static DescribeBackupLocalRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupLocalRequest self = new DescribeBackupLocalRequest();
        return TeaModel.build(map, self);
    }

    public DescribeBackupLocalRequest setDrdsInstanceId(String drdsInstanceId) {
        this.drdsInstanceId = drdsInstanceId;
        return this;
    }
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

}
