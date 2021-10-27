// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeRdsReadOnlyRequest extends TeaModel {
    @NameInMap("DbInstType")
    public String dbInstType;

    @NameInMap("DrdsInstanceId")
    public String drdsInstanceId;

    @NameInMap("RdsInstanceId")
    public String rdsInstanceId;

    public static DescribeRdsReadOnlyRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRdsReadOnlyRequest self = new DescribeRdsReadOnlyRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRdsReadOnlyRequest setDbInstType(String dbInstType) {
        this.dbInstType = dbInstType;
        return this;
    }
    public String getDbInstType() {
        return this.dbInstType;
    }

    public DescribeRdsReadOnlyRequest setDrdsInstanceId(String drdsInstanceId) {
        this.drdsInstanceId = drdsInstanceId;
        return this;
    }
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    public DescribeRdsReadOnlyRequest setRdsInstanceId(String rdsInstanceId) {
        this.rdsInstanceId = rdsInstanceId;
        return this;
    }
    public String getRdsInstanceId() {
        return this.rdsInstanceId;
    }

}
