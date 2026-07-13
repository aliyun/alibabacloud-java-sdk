// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class GetInstanceOssMountRamAuthorizeUrlRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>at-cn-plt4uk4bm15</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static GetInstanceOssMountRamAuthorizeUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceOssMountRamAuthorizeUrlRequest self = new GetInstanceOssMountRamAuthorizeUrlRequest();
        return TeaModel.build(map, self);
    }

    public GetInstanceOssMountRamAuthorizeUrlRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
