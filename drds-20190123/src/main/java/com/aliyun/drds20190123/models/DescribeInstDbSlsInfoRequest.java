// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeInstDbSlsInfoRequest extends TeaModel {
    @NameInMap("DrdsInstanceId")
    public String drdsInstanceId;

    @NameInMap("DbName")
    public String dbName;

    public static DescribeInstDbSlsInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstDbSlsInfoRequest self = new DescribeInstDbSlsInfoRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInstDbSlsInfoRequest setDrdsInstanceId(String drdsInstanceId) {
        this.drdsInstanceId = drdsInstanceId;
        return this;
    }
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    public DescribeInstDbSlsInfoRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

}
