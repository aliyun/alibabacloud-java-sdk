// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class GetIpBlockRequest extends TeaModel {
    // 资源ID
    @NameInMap("IpBlockId")
    public String ipBlockId;

    // 实例ID
    @NameInMap("InstanceId")
    public String instanceId;

    public static GetIpBlockRequest build(java.util.Map<String, ?> map) throws Exception {
        GetIpBlockRequest self = new GetIpBlockRequest();
        return TeaModel.build(map, self);
    }

    public GetIpBlockRequest setIpBlockId(String ipBlockId) {
        this.ipBlockId = ipBlockId;
        return this;
    }
    public String getIpBlockId() {
        return this.ipBlockId;
    }

    public GetIpBlockRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
