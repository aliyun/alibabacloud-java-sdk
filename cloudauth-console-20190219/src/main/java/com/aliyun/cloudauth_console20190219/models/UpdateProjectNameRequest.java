// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_console20190219.models;

import com.aliyun.tea.*;

public class UpdateProjectNameRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("ProjectName")
    public String projectName;

    public static UpdateProjectNameRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateProjectNameRequest self = new UpdateProjectNameRequest();
        return TeaModel.build(map, self);
    }

    public UpdateProjectNameRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public UpdateProjectNameRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public UpdateProjectNameRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

}
