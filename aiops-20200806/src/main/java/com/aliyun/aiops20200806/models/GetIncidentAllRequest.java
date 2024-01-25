// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetIncidentAllRequest extends TeaModel {
    @NameInMap("OperaUid")
    public String operaUid;

    public static GetIncidentAllRequest build(java.util.Map<String, ?> map) throws Exception {
        GetIncidentAllRequest self = new GetIncidentAllRequest();
        return TeaModel.build(map, self);
    }

    public GetIncidentAllRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

}
