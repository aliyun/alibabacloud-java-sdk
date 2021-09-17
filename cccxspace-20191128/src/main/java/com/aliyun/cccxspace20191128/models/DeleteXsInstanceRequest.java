// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspace20191128.models;

import com.aliyun.tea.*;

public class DeleteXsInstanceRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    public static DeleteXsInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteXsInstanceRequest self = new DeleteXsInstanceRequest();
        return TeaModel.build(map, self);
    }

    public DeleteXsInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
