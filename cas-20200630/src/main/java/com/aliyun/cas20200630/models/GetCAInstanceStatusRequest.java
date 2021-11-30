// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200630.models;

import com.aliyun.tea.*;

public class GetCAInstanceStatusRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    public static GetCAInstanceStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCAInstanceStatusRequest self = new GetCAInstanceStatusRequest();
        return TeaModel.build(map, self);
    }

    public GetCAInstanceStatusRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
