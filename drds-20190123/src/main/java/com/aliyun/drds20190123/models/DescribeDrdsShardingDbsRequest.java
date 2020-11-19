// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeDrdsShardingDbsRequest extends TeaModel {
    @NameInMap("DrdsInstanceId")
    @Validation(required = true)
    public String drdsInstanceId;

    @NameInMap("DbName")
    @Validation(required = true)
    public String dbName;

    @NameInMap("DbNamePattern")
    public String dbNamePattern;

    public static DescribeDrdsShardingDbsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDrdsShardingDbsRequest self = new DescribeDrdsShardingDbsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDrdsShardingDbsRequest setDrdsInstanceId(String drdsInstanceId) {
        this.drdsInstanceId = drdsInstanceId;
        return this;
    }
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    public DescribeDrdsShardingDbsRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public DescribeDrdsShardingDbsRequest setDbNamePattern(String dbNamePattern) {
        this.dbNamePattern = dbNamePattern;
        return this;
    }
    public String getDbNamePattern() {
        return this.dbNamePattern;
    }

}
