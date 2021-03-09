// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetQualityProjectLogRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("ProjectId")
    public Long projectId;

    public static GetQualityProjectLogRequest build(java.util.Map<String, ?> map) throws Exception {
        GetQualityProjectLogRequest self = new GetQualityProjectLogRequest();
        return TeaModel.build(map, self);
    }

    public GetQualityProjectLogRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetQualityProjectLogRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

}
