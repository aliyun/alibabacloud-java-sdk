// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ExecuteInstanceFailoverRequest extends TeaModel {
    /**
     * <p>The failover status. Valid values:</p>
     * <ul>
     * <li>inactive: The primary instance is active.</li>
     * <li>active: The replica instance is active.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>active</p>
     */
    @NameInMap("InstanceFailoverStatus")
    public String instanceFailoverStatus;

    /**
     * <p>The replica instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>idaas_xxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static ExecuteInstanceFailoverRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecuteInstanceFailoverRequest self = new ExecuteInstanceFailoverRequest();
        return TeaModel.build(map, self);
    }

    public ExecuteInstanceFailoverRequest setInstanceFailoverStatus(String instanceFailoverStatus) {
        this.instanceFailoverStatus = instanceFailoverStatus;
        return this;
    }
    public String getInstanceFailoverStatus() {
        return this.instanceFailoverStatus;
    }

    public ExecuteInstanceFailoverRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
