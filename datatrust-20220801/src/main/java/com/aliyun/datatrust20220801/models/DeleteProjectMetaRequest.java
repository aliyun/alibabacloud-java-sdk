// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class DeleteProjectMetaRequest extends TeaModel {
    @NameInMap("ProjectId")
    public Long projectId;

    @NameInMap("TableId")
    public Long tableId;

    public static DeleteProjectMetaRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteProjectMetaRequest self = new DeleteProjectMetaRequest();
        return TeaModel.build(map, self);
    }

    public DeleteProjectMetaRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public DeleteProjectMetaRequest setTableId(Long tableId) {
        this.tableId = tableId;
        return this;
    }
    public Long getTableId() {
        return this.tableId;
    }

}
