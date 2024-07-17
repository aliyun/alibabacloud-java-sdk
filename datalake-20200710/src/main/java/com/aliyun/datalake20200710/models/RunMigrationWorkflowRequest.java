// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class RunMigrationWorkflowRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>M-EDD8BF959BB97345</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static RunMigrationWorkflowRequest build(java.util.Map<String, ?> map) throws Exception {
        RunMigrationWorkflowRequest self = new RunMigrationWorkflowRequest();
        return TeaModel.build(map, self);
    }

    public RunMigrationWorkflowRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
