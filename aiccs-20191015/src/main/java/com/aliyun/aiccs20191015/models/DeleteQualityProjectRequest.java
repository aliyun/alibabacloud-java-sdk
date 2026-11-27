// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class DeleteQualityProjectRequest extends TeaModel {
    /**
     * <p>The AICCS instance ID. You can obtain the ID from the Artificial Intelligence Cloud Call Service console.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc_xp_pre***</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The quality inspection task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>15</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    public static DeleteQualityProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteQualityProjectRequest self = new DeleteQualityProjectRequest();
        return TeaModel.build(map, self);
    }

    public DeleteQualityProjectRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteQualityProjectRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

}
