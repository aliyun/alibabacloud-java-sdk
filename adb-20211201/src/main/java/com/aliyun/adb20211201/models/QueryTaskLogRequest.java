// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class QueryTaskLogRequest extends TeaModel {
    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("Limit")
    public Integer limit;

    @NameInMap("ProjectCode")
    public Long projectCode;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SkipLineNum")
    public Integer skipLineNum;

    @NameInMap("TaskInstanceId")
    public Long taskInstanceId;

    public static QueryTaskLogRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTaskLogRequest self = new QueryTaskLogRequest();
        return TeaModel.build(map, self);
    }

    public QueryTaskLogRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public QueryTaskLogRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

    public QueryTaskLogRequest setProjectCode(Long projectCode) {
        this.projectCode = projectCode;
        return this;
    }
    public Long getProjectCode() {
        return this.projectCode;
    }

    public QueryTaskLogRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public QueryTaskLogRequest setSkipLineNum(Integer skipLineNum) {
        this.skipLineNum = skipLineNum;
        return this;
    }
    public Integer getSkipLineNum() {
        return this.skipLineNum;
    }

    public QueryTaskLogRequest setTaskInstanceId(Long taskInstanceId) {
        this.taskInstanceId = taskInstanceId;
        return this;
    }
    public Long getTaskInstanceId() {
        return this.taskInstanceId;
    }

}
