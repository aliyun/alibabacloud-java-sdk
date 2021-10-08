// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetAvgRepairTimeRequest extends TeaModel {
    @NameInMap("Uid")
    public Long uid;

    @NameInMap("OperaUid")
    public String operaUid;

    public static GetAvgRepairTimeRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAvgRepairTimeRequest self = new GetAvgRepairTimeRequest();
        return TeaModel.build(map, self);
    }

    public GetAvgRepairTimeRequest setUid(Long uid) {
        this.uid = uid;
        return this;
    }
    public Long getUid() {
        return this.uid;
    }

    public GetAvgRepairTimeRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

}
