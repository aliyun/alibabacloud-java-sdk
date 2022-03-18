// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class QuerySqlAnalysisDataRequest extends TeaModel {
    @NameInMap("PageNo")
    public Integer pageNo;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("SqlIdList")
    public String sqlIdList;

    @NameInMap("SqlTextFeature")
    public String sqlTextFeature;

    @NameInMap("SqlType")
    public String sqlType;

    @NameInMap("TaskId")
    public String taskId;

    @NameInMap("Type")
    public String type;

    public static QuerySqlAnalysisDataRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySqlAnalysisDataRequest self = new QuerySqlAnalysisDataRequest();
        return TeaModel.build(map, self);
    }

    public QuerySqlAnalysisDataRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public QuerySqlAnalysisDataRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QuerySqlAnalysisDataRequest setSqlIdList(String sqlIdList) {
        this.sqlIdList = sqlIdList;
        return this;
    }
    public String getSqlIdList() {
        return this.sqlIdList;
    }

    public QuerySqlAnalysisDataRequest setSqlTextFeature(String sqlTextFeature) {
        this.sqlTextFeature = sqlTextFeature;
        return this;
    }
    public String getSqlTextFeature() {
        return this.sqlTextFeature;
    }

    public QuerySqlAnalysisDataRequest setSqlType(String sqlType) {
        this.sqlType = sqlType;
        return this;
    }
    public String getSqlType() {
        return this.sqlType;
    }

    public QuerySqlAnalysisDataRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public QuerySqlAnalysisDataRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
