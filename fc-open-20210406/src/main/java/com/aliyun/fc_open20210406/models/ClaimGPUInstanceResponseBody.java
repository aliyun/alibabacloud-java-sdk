// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class ClaimGPUInstanceResponseBody extends TeaModel {
    /**
     * <p>The time when the product instance is created.</p>
     */
    @NameInMap("createdTime")
    public String createdTime;

    /**
     * <p>The ID of the instance that you query.</p>
     */
    @NameInMap("instanceId")
    public String instanceId;

    /**
     * <p>The public IP address of the server.</p>
     */
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
