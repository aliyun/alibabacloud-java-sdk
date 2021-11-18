// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class LaunchAppraiseRequest extends TeaModel {
    @NameInMap("Acid")
    public String acid;

    @NameInMap("InstanceId")
    public String instanceId;

    public static LaunchAppraiseRequest build(java.util.Map<String, ?> map) throws Exception {
        LaunchAppraiseRequest self = new LaunchAppraiseRequest();
        return TeaModel.build(map, self);
    }

    public LaunchAppraiseRequest setAcid(String acid) {
        this.acid = acid;
        return this;
    }
    public String getAcid() {
        return this.acid;
    }

    public LaunchAppraiseRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
