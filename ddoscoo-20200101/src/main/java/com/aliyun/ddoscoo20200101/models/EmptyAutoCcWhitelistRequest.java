// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class EmptyAutoCcWhitelistRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("InstanceId")
    public String instanceId;

    public static EmptyAutoCcWhitelistRequest build(java.util.Map<String, ?> map) throws Exception {
        EmptyAutoCcWhitelistRequest self = new EmptyAutoCcWhitelistRequest();
        return TeaModel.build(map, self);
    }

    public EmptyAutoCcWhitelistRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public EmptyAutoCcWhitelistRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
