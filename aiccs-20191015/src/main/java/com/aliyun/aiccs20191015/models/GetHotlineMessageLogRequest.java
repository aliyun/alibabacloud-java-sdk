// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetHotlineMessageLogRequest extends TeaModel {
    // 会话id
    @NameInMap("Acid")
    public String acid;

    // 实例id
    @NameInMap("InstanceId")
    public String instanceId;

    public static GetHotlineMessageLogRequest build(java.util.Map<String, ?> map) throws Exception {
        GetHotlineMessageLogRequest self = new GetHotlineMessageLogRequest();
        return TeaModel.build(map, self);
    }

    public GetHotlineMessageLogRequest setAcid(String acid) {
        this.acid = acid;
        return this;
    }
    public String getAcid() {
        return this.acid;
    }

    public GetHotlineMessageLogRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
