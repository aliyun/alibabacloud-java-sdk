// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class ClaimGPUInstanceResponseBody extends TeaModel {
    @NameInMap("createdTime")
    public String createdTime;

    @NameInMap("instanceId")
    public String instanceId;

    @NameInMap("publicIp")
    public String publicIp;

    public static ClaimGPUInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ClaimGPUInstanceResponseBody self = new ClaimGPUInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public ClaimGPUInstanceResponseBody setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public String getCreatedTime() {
        return this.createdTime;
    }

    public ClaimGPUInstanceResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ClaimGPUInstanceResponseBody setPublicIp(String publicIp) {
        this.publicIp = publicIp;
        return this;
    }
    public String getPublicIp() {
        return this.publicIp;
    }

}
