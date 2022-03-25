// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class ProjectCreateOrUpdateExtInfoRequest extends TeaModel {
    @NameInMap("AliyunJwt")
    public String aliyunJwt;

    @NameInMap("ExtInfoStr")
    public String extInfoStr;

    @NameInMap("ProjectId")
    public String projectId;

    public static ProjectCreateOrUpdateExtInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        ProjectCreateOrUpdateExtInfoRequest self = new ProjectCreateOrUpdateExtInfoRequest();
        return TeaModel.build(map, self);
    }

    public ProjectCreateOrUpdateExtInfoRequest setAliyunJwt(String aliyunJwt) {
        this.aliyunJwt = aliyunJwt;
        return this;
    }
    public String getAliyunJwt() {
        return this.aliyunJwt;
    }

    public ProjectCreateOrUpdateExtInfoRequest setExtInfoStr(String extInfoStr) {
        this.extInfoStr = extInfoStr;
        return this;
    }
    public String getExtInfoStr() {
        return this.extInfoStr;
    }

    public ProjectCreateOrUpdateExtInfoRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

}
