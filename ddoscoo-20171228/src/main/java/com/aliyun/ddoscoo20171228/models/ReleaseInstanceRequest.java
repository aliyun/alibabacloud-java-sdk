// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class ReleaseInstanceRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("SourceIp")
    public String sourceIp;

    public static ReleaseInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        ReleaseInstanceRequest self = new ReleaseInstanceRequest();
        return TeaModel.build(map, self);
    }

    public ReleaseInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ReleaseInstanceRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
