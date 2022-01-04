// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class GetStorageAnalysisRequest extends TeaModel {
    @NameInMap("analysisTypeList")
    public java.util.List<String> analysisTypeList;

    @NameInMap("date")
    public String date;

    @NameInMap("dbName")
    public String dbName;

    @NameInMap("tableName")
    public String tableName;

    public static GetStorageAnalysisRequest build(java.util.Map<String, ?> map) throws Exception {
        GetStorageAnalysisRequest self = new GetStorageAnalysisRequest();
        return TeaModel.build(map, self);
    }

    public GetStorageAnalysisRequest setAnalysisTypeList(java.util.List<String> analysisTypeList) {
        this.analysisTypeList = analysisTypeList;
        return this;
    }
    public java.util.List<String> getAnalysisTypeList() {
        return this.analysisTypeList;
    }

    public GetStorageAnalysisRequest setDate(String date) {
        this.date = date;
        return this;
    }
    public String getDate() {
        return this.date;
    }

    public GetStorageAnalysisRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public GetStorageAnalysisRequest setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

}
