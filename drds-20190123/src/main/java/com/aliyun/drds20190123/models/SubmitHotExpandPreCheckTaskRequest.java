// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class SubmitHotExpandPreCheckTaskRequest extends TeaModel {
    @NameInMap("DbInstType")
    public String dbInstType;

    @NameInMap("DbName")
    public String dbName;

    @NameInMap("DrdsInstanceId")
    public String drdsInstanceId;

    @NameInMap("TableList")
    public java.util.List<String> tableList;

    public static SubmitHotExpandPreCheckTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitHotExpandPreCheckTaskRequest self = new SubmitHotExpandPreCheckTaskRequest();
        return TeaModel.build(map, self);
    }

    public SubmitHotExpandPreCheckTaskRequest setDbInstType(String dbInstType) {
        this.dbInstType = dbInstType;
        return this;
    }
    public String getDbInstType() {
        return this.dbInstType;
    }

    public SubmitHotExpandPreCheckTaskRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public SubmitHotExpandPreCheckTaskRequest setDrdsInstanceId(String drdsInstanceId) {
        this.drdsInstanceId = drdsInstanceId;
        return this;
    }
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    public SubmitHotExpandPreCheckTaskRequest setTableList(java.util.List<String> tableList) {
        this.tableList = tableList;
        return this;
    }
    public java.util.List<String> getTableList() {
        return this.tableList;
    }

}
