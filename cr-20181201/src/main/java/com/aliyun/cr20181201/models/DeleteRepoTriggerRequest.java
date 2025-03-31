// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class DeleteRepoTriggerRequest extends TeaModel {
    /**
     * <p>The ID of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cri-xkx6vujuhay0****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the image repository.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>crr-xwvi3osiy4ff****</p>
     */
    @NameInMap("RepoId")
    public String repoId;

    /**
     * <p>The ID of the trigger.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>crw-0z4pf81pgz35****</p>
     */
    @NameInMap("TriggerId")
    public String triggerId;

    public static DeleteRepoTriggerRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteRepoTriggerRequest self = new DeleteRepoTriggerRequest();
        return TeaModel.build(map, self);
    }

    public DeleteRepoTriggerRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteRepoTriggerRequest setRepoId(String repoId) {
        this.repoId = repoId;
        return this;
    }
    public String getRepoId() {
        return this.repoId;
    }

    public DeleteRepoTriggerRequest setTriggerId(String triggerId) {
        this.triggerId = triggerId;
        return this;
    }
    public String getTriggerId() {
        return this.triggerId;
    }

}
