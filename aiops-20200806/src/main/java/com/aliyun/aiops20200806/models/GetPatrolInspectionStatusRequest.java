// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetPatrolInspectionStatusRequest extends TeaModel {
    @NameInMap("OperaUid")
    public String operaUid;

    public static GetPatrolInspectionStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPatrolInspectionStatusRequest self = new GetPatrolInspectionStatusRequest();
        return TeaModel.build(map, self);
    }

    public GetPatrolInspectionStatusRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

}
