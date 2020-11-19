// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeRdsDrdsDBRequest extends TeaModel {
    @NameInMap("DrdsInstanceId")
    @Validation(required = true)
    public String drdsInstanceId;

    @NameInMap("RdsInstanceId")
    @Validation(required = true)
    public java.util.List<String> rdsInstanceId;

    public static DescribeRdsDrdsDBRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRdsDrdsDBRequest self = new DescribeRdsDrdsDBRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRdsDrdsDBRequest setDrdsInstanceId(String drdsInstanceId) {
        this.drdsInstanceId = drdsInstanceId;
        return this;
    }
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    public DescribeRdsDrdsDBRequest setRdsInstanceId(java.util.List<String> rdsInstanceId) {
        this.rdsInstanceId = rdsInstanceId;
        return this;
    }
    public java.util.List<String> getRdsInstanceId() {
        return this.rdsInstanceId;
    }

}
