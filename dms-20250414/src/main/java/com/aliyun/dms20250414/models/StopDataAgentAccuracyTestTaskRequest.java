// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class StopDataAgentAccuracyTestTaskRequest extends TeaModel {
    /**
     * <p>The ID of the accuracy test task.</p>
     * 
     * <strong>example:</strong>
     * <p>692abb8f-xxxx-xxxx-xxxx-xxxxxxxxxxxx</p>
     */
    @NameInMap("AccuracyTestTaskId")
    public String accuracyTestTaskId;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the workspace.</p>
     * 
     * <strong>example:</strong>
     * <p>8wfig6l33n4f4xxxxxxxxxx</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static StopDataAgentAccuracyTestTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        StopDataAgentAccuracyTestTaskRequest self = new StopDataAgentAccuracyTestTaskRequest();
        return TeaModel.build(map, self);
    }

    public StopDataAgentAccuracyTestTaskRequest setAccuracyTestTaskId(String accuracyTestTaskId) {
        this.accuracyTestTaskId = accuracyTestTaskId;
        return this;
    }
    public String getAccuracyTestTaskId() {
        return this.accuracyTestTaskId;
    }

    public StopDataAgentAccuracyTestTaskRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public StopDataAgentAccuracyTestTaskRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
