// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class RunSynchronizationJobRequest extends TeaModel {
    /**
     * <p>IDaaS EIAM实例的ID。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>同步目标ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>idp_my664lwkhpicbyzirog3ngxxxxx</p>
     */
    @NameInMap("TargetId")
    public String targetId;

    /**
     * <p>同步目标类型</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>identity_provider</p>
     */
    @NameInMap("TargetType")
    public String targetType;

    public static RunSynchronizationJobRequest build(java.util.Map<String, ?> map) throws Exception {
        RunSynchronizationJobRequest self = new RunSynchronizationJobRequest();
        return TeaModel.build(map, self);
    }

    public RunSynchronizationJobRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public RunSynchronizationJobRequest setTargetId(String targetId) {
        this.targetId = targetId;
        return this;
    }
    public String getTargetId() {
        return this.targetId;
    }

    public RunSynchronizationJobRequest setTargetType(String targetType) {
        this.targetType = targetType;
        return this;
    }
    public String getTargetType() {
        return this.targetType;
    }

}
