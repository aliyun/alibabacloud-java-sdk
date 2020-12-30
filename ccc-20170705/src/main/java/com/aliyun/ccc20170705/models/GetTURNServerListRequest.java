// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class GetTURNServerListRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    public static GetTURNServerListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTURNServerListRequest self = new GetTURNServerListRequest();
        return TeaModel.build(map, self);
    }

    public GetTURNServerListRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
