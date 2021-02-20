// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class EmptyAutoCcBlacklistRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("InstanceId")
    public String instanceId;

    public static EmptyAutoCcBlacklistRequest build(java.util.Map<String, ?> map) throws Exception {
        EmptyAutoCcBlacklistRequest self = new EmptyAutoCcBlacklistRequest();
        return TeaModel.build(map, self);
    }

    public EmptyAutoCcBlacklistRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public EmptyAutoCcBlacklistRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
