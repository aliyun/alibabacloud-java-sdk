// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class GetProjectSettingRequest extends TeaModel {
    @NameInMap("ProjectId")
    public Long projectId;

    public static GetProjectSettingRequest build(java.util.Map<String, ?> map) throws Exception {
        GetProjectSettingRequest self = new GetProjectSettingRequest();
        return TeaModel.build(map, self);
    }

    public GetProjectSettingRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

}
