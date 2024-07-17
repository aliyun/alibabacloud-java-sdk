// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class StopMigrationWorkflowRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>M-6DCF5D8EF92E2195</p>
     */
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
