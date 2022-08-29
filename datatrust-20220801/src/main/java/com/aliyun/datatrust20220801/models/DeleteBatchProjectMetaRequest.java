// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class DeleteBatchProjectMetaRequest extends TeaModel {
    @NameInMap("ProjectId")
    public Long projectId;

    @NameInMap("TableIdList")
    public java.util.List<Long> tableIdList;

    public static DeleteBatchProjectMetaRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteBatchProjectMetaRequest self = new DeleteBatchProjectMetaRequest();
        return TeaModel.build(map, self);
    }

    public DeleteBatchProjectMetaRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public DeleteBatchProjectMetaRequest setTableIdList(java.util.List<Long> tableIdList) {
        this.tableIdList = tableIdList;
        return this;
    }
    public java.util.List<Long> getTableIdList() {
        return this.tableIdList;
    }

}
