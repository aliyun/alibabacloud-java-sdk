// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class ListProjectTablesRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ProjectId")
    public Long projectId;

    @NameInMap("TableName")
    public String tableName;

    public static ListProjectTablesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListProjectTablesRequest self = new ListProjectTablesRequest();
        return TeaModel.build(map, self);
    }

    public ListProjectTablesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ListProjectTablesRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public ListProjectTablesRequest setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

}
