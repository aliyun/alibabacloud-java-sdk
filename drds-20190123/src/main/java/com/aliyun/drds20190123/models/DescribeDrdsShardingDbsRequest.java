// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeDrdsShardingDbsRequest extends TeaModel {
    @NameInMap("DbName")
    public String dbName;

    @NameInMap("DbNamePattern")
    public String dbNamePattern;

    @NameInMap("DrdsInstanceId")
    public String drdsInstanceId;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    public static DescribeDrdsShardingDbsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDrdsShardingDbsRequest self = new DescribeDrdsShardingDbsRequest();
        return TeaModel.build(map, self);
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

    public DescribeDrdsShardingDbsRequest setDrdsInstanceId(String drdsInstanceId) {
        this.drdsInstanceId = drdsInstanceId;
        return this;
    }
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    public DescribeDrdsShardingDbsRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDrdsShardingDbsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
