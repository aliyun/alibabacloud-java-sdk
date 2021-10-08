// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetConnectInstancesRequest extends TeaModel {
    @NameInMap("Uid")
    public Long uid;

    public static GetConnectInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        GetConnectInstancesRequest self = new GetConnectInstancesRequest();
        return TeaModel.build(map, self);
    }

    public GetConnectInstancesRequest setUid(Long uid) {
        this.uid = uid;
        return this;
    }
    public Long getUid() {
        return this.uid;
    }

}
