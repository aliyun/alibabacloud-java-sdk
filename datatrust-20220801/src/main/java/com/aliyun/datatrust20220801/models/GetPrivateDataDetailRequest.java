// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class GetPrivateDataDetailRequest extends TeaModel {
    @NameInMap("ProjectId")
    public Long projectId;

    @NameInMap("TableId")
    public Long tableId;

    public static GetPrivateDataDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPrivateDataDetailRequest self = new GetPrivateDataDetailRequest();
        return TeaModel.build(map, self);
    }

    public GetPrivateDataDetailRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public GetPrivateDataDetailRequest setTableId(Long tableId) {
        this.tableId = tableId;
        return this;
    }
    public Long getTableId() {
        return this.tableId;
    }

}
