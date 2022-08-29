// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class ListProjectMetaColumnsRequest extends TeaModel {
    @NameInMap("ColumnName")
    public String columnName;

    @NameInMap("ProjectId")
    public Long projectId;

    @NameInMap("TableId")
    public Long tableId;

    public static ListProjectMetaColumnsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListProjectMetaColumnsRequest self = new ListProjectMetaColumnsRequest();
        return TeaModel.build(map, self);
    }

    public ListProjectMetaColumnsRequest setColumnName(String columnName) {
        this.columnName = columnName;
        return this;
    }
    public String getColumnName() {
        return this.columnName;
    }

    public ListProjectMetaColumnsRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public ListProjectMetaColumnsRequest setTableId(Long tableId) {
        this.tableId = tableId;
        return this;
    }
    public Long getTableId() {
        return this.tableId;
    }

}
