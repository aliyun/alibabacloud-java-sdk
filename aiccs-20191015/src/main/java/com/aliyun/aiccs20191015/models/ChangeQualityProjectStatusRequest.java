// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class ChangeQualityProjectStatusRequest extends TeaModel {
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
     * <p>15</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The status of the quality inspection task. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: Start.</li>
     * <li><strong>1</strong>: Stop.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Status")
    public Integer status;

    public static ChangeQualityProjectStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        ChangeQualityProjectStatusRequest self = new ChangeQualityProjectStatusRequest();
        return TeaModel.build(map, self);
    }

    public ChangeQualityProjectStatusRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ChangeQualityProjectStatusRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public ChangeQualityProjectStatusRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

}
