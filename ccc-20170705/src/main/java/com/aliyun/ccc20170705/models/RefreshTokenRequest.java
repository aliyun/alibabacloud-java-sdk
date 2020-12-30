// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class RefreshTokenRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    public static RefreshTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        RefreshTokenRequest self = new RefreshTokenRequest();
        return TeaModel.build(map, self);
    }

    public RefreshTokenRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
