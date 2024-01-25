// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetThresholdListRequest extends TeaModel {
    @NameInMap("OperaUid")
    public String operaUid;

    public static GetThresholdListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetThresholdListRequest self = new GetThresholdListRequest();
        return TeaModel.build(map, self);
    }

    public GetThresholdListRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

}
