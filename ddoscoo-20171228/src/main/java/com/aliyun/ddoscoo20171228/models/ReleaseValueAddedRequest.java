// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class ReleaseValueAddedRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("InstanceId")
    @Validation(required = true)
    public String instanceId;

    public static ReleaseValueAddedRequest build(java.util.Map<String, ?> map) throws Exception {
        ReleaseValueAddedRequest self = new ReleaseValueAddedRequest();
        return TeaModel.build(map, self);
    }

    public ReleaseValueAddedRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public ReleaseValueAddedRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
