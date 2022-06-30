// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class EmptyAutoCcWhitelistRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    public static EmptyAutoCcWhitelistRequest build(java.util.Map<String, ?> map) throws Exception {
        EmptyAutoCcWhitelistRequest self = new EmptyAutoCcWhitelistRequest();
        return TeaModel.build(map, self);
    }

    public EmptyAutoCcWhitelistRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
