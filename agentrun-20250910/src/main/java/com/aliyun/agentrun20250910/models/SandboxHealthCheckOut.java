// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class SandboxHealthCheckOut extends TeaModel {
    /**
     * <p>健康状态，OK表示健康</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("status")
    public String status;

    public static SandboxHealthCheckOut build(java.util.Map<String, ?> map) throws Exception {
        SandboxHealthCheckOut self = new SandboxHealthCheckOut();
        return TeaModel.build(map, self);
    }

    public SandboxHealthCheckOut setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
