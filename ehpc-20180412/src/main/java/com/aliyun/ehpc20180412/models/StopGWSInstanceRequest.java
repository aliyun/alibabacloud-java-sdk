// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class StopGWSInstanceRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    public static StopGWSInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        StopGWSInstanceRequest self = new StopGWSInstanceRequest();
        return TeaModel.build(map, self);
    }

    public StopGWSInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
