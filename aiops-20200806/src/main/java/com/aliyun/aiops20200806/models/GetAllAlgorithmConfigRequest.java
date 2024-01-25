// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetAllAlgorithmConfigRequest extends TeaModel {
    @NameInMap("OperaUid")
    public String operaUid;

    public static GetAllAlgorithmConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAllAlgorithmConfigRequest self = new GetAllAlgorithmConfigRequest();
        return TeaModel.build(map, self);
    }

    public GetAllAlgorithmConfigRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

}
