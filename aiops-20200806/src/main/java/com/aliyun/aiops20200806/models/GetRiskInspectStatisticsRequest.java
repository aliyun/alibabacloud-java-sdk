// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetRiskInspectStatisticsRequest extends TeaModel {
    @NameInMap("OperaUid")
    public String operaUid;

    public static GetRiskInspectStatisticsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRiskInspectStatisticsRequest self = new GetRiskInspectStatisticsRequest();
        return TeaModel.build(map, self);
    }

    public GetRiskInspectStatisticsRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

}
