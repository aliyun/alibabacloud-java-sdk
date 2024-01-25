// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetInstancesNumRequest extends TeaModel {
    @NameInMap("OperaUid")
    public String operaUid;

    public static GetInstancesNumRequest build(java.util.Map<String, ?> map) throws Exception {
        GetInstancesNumRequest self = new GetInstancesNumRequest();
        return TeaModel.build(map, self);
    }

    public GetInstancesNumRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

}
