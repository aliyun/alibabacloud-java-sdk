// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetInstanceStatusCountRequest extends TeaModel {
    @NameInMap("BizDate")
    public String bizDate;

    @NameInMap("ProjectEnv")
    public String projectEnv;

    @NameInMap("ProjectId")
    public Long projectId;

    public static GetInstanceStatusCountRequest build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceStatusCountRequest self = new GetInstanceStatusCountRequest();
        return TeaModel.build(map, self);
    }

    public GetInstanceStatusCountRequest setBizDate(String bizDate) {
        this.bizDate = bizDate;
        return this;
    }
    public String getBizDate() {
        return this.bizDate;
    }

    public GetInstanceStatusCountRequest setProjectEnv(String projectEnv) {
        this.projectEnv = projectEnv;
        return this;
    }
    public String getProjectEnv() {
        return this.projectEnv;
    }

    public GetInstanceStatusCountRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

}
