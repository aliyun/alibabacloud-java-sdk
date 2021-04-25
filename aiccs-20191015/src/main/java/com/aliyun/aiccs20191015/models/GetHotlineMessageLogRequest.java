// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetHotlineMessageLogRequest extends TeaModel {
    // 实例id
    @NameInMap("InstanceId")
    public String instanceId;

    // 会话id
    @NameInMap("Acid")
    public String acid;

    public static GetHotlineMessageLogRequest build(java.util.Map<String, ?> map) throws Exception {
        GetHotlineMessageLogRequest self = new GetHotlineMessageLogRequest();
        return TeaModel.build(map, self);
    }

    public GetHotlineMessageLogRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetHotlineMessageLogRequest setAcid(String acid) {
        this.acid = acid;
        return this;
    }
    public String getAcid() {
        return this.acid;
    }

}
