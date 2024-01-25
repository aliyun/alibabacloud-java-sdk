// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetRiskPatrolStatusRequest extends TeaModel {
    @NameInMap("OperaUid")
    public String operaUid;

    public static GetRiskPatrolStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRiskPatrolStatusRequest self = new GetRiskPatrolStatusRequest();
        return TeaModel.build(map, self);
    }

    public GetRiskPatrolStatusRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

}
