// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class GetRealtimeInstanceStatesRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    public static GetRealtimeInstanceStatesRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRealtimeInstanceStatesRequest self = new GetRealtimeInstanceStatesRequest();
        return TeaModel.build(map, self);
    }

    public GetRealtimeInstanceStatesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
