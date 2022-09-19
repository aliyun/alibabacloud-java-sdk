// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class IsSupportPFSRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    public static IsSupportPFSRequest build(java.util.Map<String, ?> map) throws Exception {
        IsSupportPFSRequest self = new IsSupportPFSRequest();
        return TeaModel.build(map, self);
    }

    public IsSupportPFSRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
