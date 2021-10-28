// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class ChangeQualityProjectStatusRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("ProjectId")
    public Long projectId;

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
