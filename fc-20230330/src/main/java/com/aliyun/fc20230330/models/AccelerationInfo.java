// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class AccelerationInfo extends TeaModel {
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
