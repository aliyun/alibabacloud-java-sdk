// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetPatrolInspectionItemsListRequest extends TeaModel {
    @NameInMap("OperaUid")
    public String operaUid;

    public static GetPatrolInspectionItemsListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPatrolInspectionItemsListRequest self = new GetPatrolInspectionItemsListRequest();
        return TeaModel.build(map, self);
    }

    public GetPatrolInspectionItemsListRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

}
