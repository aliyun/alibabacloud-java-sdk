// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeCanExpandInstanceDetailListRequest extends TeaModel {
    @NameInMap("CurrentPlan")
    public String currentPlan;

    @NameInMap("DbName")
    public String dbName;

    @NameInMap("DrdsInstanceId")
    public String drdsInstanceId;

    public static DescribeCanExpandInstanceDetailListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCanExpandInstanceDetailListRequest self = new DescribeCanExpandInstanceDetailListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCanExpandInstanceDetailListRequest setCurrentPlan(String currentPlan) {
        this.currentPlan = currentPlan;
        return this;
    }
    public String getCurrentPlan() {
        return this.currentPlan;
    }

    public DescribeCanExpandInstanceDetailListRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public DescribeCanExpandInstanceDetailListRequest setDrdsInstanceId(String drdsInstanceId) {
        this.drdsInstanceId = drdsInstanceId;
        return this;
    }
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

}
