// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetReleaseTimeRequest extends TeaModel {
    /**
     * <p>The ID of the security instance. This must be a DDoS security instance ID (in the format esa-ddos-), which you can obtain by calling the ListDDoSInstances operation. Site instance IDs (in the format esa-site-) are not supported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>esa-ddos-2sdj**3s</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static GetReleaseTimeRequest build(java.util.Map<String, ?> map) throws Exception {
        GetReleaseTimeRequest self = new GetReleaseTimeRequest();
        return TeaModel.build(map, self);
    }

    public GetReleaseTimeRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
