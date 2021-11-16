// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetFileTypeStatisticRequest extends TeaModel {
    @NameInMap("ProjectEnv")
    public String projectEnv;

    @NameInMap("ProjectId")
    public Long projectId;

    public static GetFileTypeStatisticRequest build(java.util.Map<String, ?> map) throws Exception {
        GetFileTypeStatisticRequest self = new GetFileTypeStatisticRequest();
        return TeaModel.build(map, self);
    }

    public GetFileTypeStatisticRequest setProjectEnv(String projectEnv) {
        this.projectEnv = projectEnv;
        return this;
    }
    public String getProjectEnv() {
        return this.projectEnv;
    }

    public GetFileTypeStatisticRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

}
