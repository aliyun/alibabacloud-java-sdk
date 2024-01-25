// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetRiskPatrolStatisticsRequest extends TeaModel {
    @NameInMap("OperaUid")
    public String operaUid;

    public static GetRiskPatrolStatisticsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRiskPatrolStatisticsRequest self = new GetRiskPatrolStatisticsRequest();
        return TeaModel.build(map, self);
    }

    public GetRiskPatrolStatisticsRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

}
