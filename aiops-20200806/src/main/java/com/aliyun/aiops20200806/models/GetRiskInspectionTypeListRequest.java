// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetRiskInspectionTypeListRequest extends TeaModel {
    @NameInMap("OperaUid")
    public String operaUid;

    public static GetRiskInspectionTypeListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRiskInspectionTypeListRequest self = new GetRiskInspectionTypeListRequest();
        return TeaModel.build(map, self);
    }

    public GetRiskInspectionTypeListRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

}
