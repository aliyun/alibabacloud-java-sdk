// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeBackupTimesRequest extends TeaModel {
    @NameInMap("DrdsInstanceId")
    public String drdsInstanceId;

    public static DescribeBackupTimesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupTimesRequest self = new DescribeBackupTimesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeBackupTimesRequest setDrdsInstanceId(String drdsInstanceId) {
        this.drdsInstanceId = drdsInstanceId;
        return this;
    }
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

}
