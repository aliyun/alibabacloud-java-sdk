// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetCloudAllResourceListRequest extends TeaModel {
    @NameInMap("Uid")
    public String uid;

    @NameInMap("OperaUid")
    public String operaUid;

    public static GetCloudAllResourceListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCloudAllResourceListRequest self = new GetCloudAllResourceListRequest();
        return TeaModel.build(map, self);
    }

    public GetCloudAllResourceListRequest setUid(String uid) {
        this.uid = uid;
        return this;
    }
    public String getUid() {
        return this.uid;
    }

    public GetCloudAllResourceListRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

}
