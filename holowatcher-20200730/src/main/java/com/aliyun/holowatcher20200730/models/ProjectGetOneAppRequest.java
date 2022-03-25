// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class ProjectGetOneAppRequest extends TeaModel {
    @NameInMap("AliyunJwt")
    public String aliyunJwt;

    @NameInMap("ProjectId")
    public Long projectId;

    public static ProjectGetOneAppRequest build(java.util.Map<String, ?> map) throws Exception {
        ProjectGetOneAppRequest self = new ProjectGetOneAppRequest();
        return TeaModel.build(map, self);
    }

    public ProjectGetOneAppRequest setAliyunJwt(String aliyunJwt) {
        this.aliyunJwt = aliyunJwt;
        return this;
    }
    public String getAliyunJwt() {
        return this.aliyunJwt;
    }

    public ProjectGetOneAppRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

}
