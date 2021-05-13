// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetQualityProjectDetailRequest extends TeaModel {
    // 租户实例ID
    @NameInMap("InstanceId")
    public String instanceId;

    // 质检任务ID
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
