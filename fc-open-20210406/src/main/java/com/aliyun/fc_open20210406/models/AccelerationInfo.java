// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class AccelerationInfo extends TeaModel {
    // 镜像加速状态，取值 Preparing 或 Ready
    @NameInMap("status")
    public String status;

    public static AccelerationInfo build(java.util.Map<String, ?> map) throws Exception {
        AccelerationInfo self = new AccelerationInfo();
        return TeaModel.build(map, self);
    }

    public AccelerationInfo setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
