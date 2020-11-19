// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeUnCompatibilitySqlRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("TaskId")
    @Validation(required = true)
    public Long taskId;

    @NameInMap("DbName")
    @Validation(required = true)
    public Long dbName;

    public static DescribeUnCompatibilitySqlRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeUnCompatibilitySqlRequest self = new DescribeUnCompatibilitySqlRequest();
        return TeaModel.build(map, self);
    }

    public DescribeUnCompatibilitySqlRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeUnCompatibilitySqlRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

    public DescribeUnCompatibilitySqlRequest setDbName(Long dbName) {
        this.dbName = dbName;
        return this;
    }
    public Long getDbName() {
        return this.dbName;
    }

}
