// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class DisconnectAndroidInstanceRequest extends TeaModel {
    @NameInMap("EndUserId")
    public String endUserId;

    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    public static DisconnectAndroidInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DisconnectAndroidInstanceRequest self = new DisconnectAndroidInstanceRequest();
        return TeaModel.build(map, self);
    }

    public DisconnectAndroidInstanceRequest setEndUserId(String endUserId) {
        this.endUserId = endUserId;
        return this;
    }
    public String getEndUserId() {
        return this.endUserId;
    }

    public DisconnectAndroidInstanceRequest setInstanceIds(java.util.List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

}
