// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetBusinessGroupRequest extends TeaModel {
    @NameInMap("OperaUid")
    public String operaUid;

    public static GetBusinessGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        GetBusinessGroupRequest self = new GetBusinessGroupRequest();
        return TeaModel.build(map, self);
    }

    public GetBusinessGroupRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

}
