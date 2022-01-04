// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class StopMigrationWorkflowRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    public static StopMigrationWorkflowRequest build(java.util.Map<String, ?> map) throws Exception {
        StopMigrationWorkflowRequest self = new StopMigrationWorkflowRequest();
        return TeaModel.build(map, self);
    }

    public StopMigrationWorkflowRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
