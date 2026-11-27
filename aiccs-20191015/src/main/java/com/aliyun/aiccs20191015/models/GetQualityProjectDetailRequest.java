// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetQualityProjectDetailRequest extends TeaModel {
    /**
     * <p>Instance ID of the AICCS instance. You can obtain instance ID from the Artificial Intelligence Cloud Call Service console.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc_xp_pre***</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the quality inspection task.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>15977801</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    public static GetQualityProjectDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetQualityProjectDetailRequest self = new GetQualityProjectDetailRequest();
        return TeaModel.build(map, self);
    }

    public GetQualityProjectDetailRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetQualityProjectDetailRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

}
