// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class ReleaseValueAddedRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("SourceIp")
    public String sourceIp;

    public static ReleaseValueAddedRequest build(java.util.Map<String, ?> map) throws Exception {
        ReleaseValueAddedRequest self = new ReleaseValueAddedRequest();
        return TeaModel.build(map, self);
    }

    public ReleaseValueAddedRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ReleaseValueAddedRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
