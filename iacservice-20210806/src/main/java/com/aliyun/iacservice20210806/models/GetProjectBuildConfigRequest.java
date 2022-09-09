// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class GetProjectBuildConfigRequest extends TeaModel {
    @NameInMap("projectBuildId")
    public String projectBuildId;

    public static GetProjectBuildConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        GetProjectBuildConfigRequest self = new GetProjectBuildConfigRequest();
        return TeaModel.build(map, self);
    }

    public GetProjectBuildConfigRequest setProjectBuildId(String projectBuildId) {
        this.projectBuildId = projectBuildId;
        return this;
    }
    public String getProjectBuildId() {
        return this.projectBuildId;
    }

}
