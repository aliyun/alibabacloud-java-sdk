// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class UpdateProjectRequest extends TeaModel {
    @NameInMap("Project")
    public String project;

    @NameInMap("NewCU")
    public Integer newCU;

    @NameInMap("NewServiceRole")
    public String newServiceRole;

    public static UpdateProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateProjectRequest self = new UpdateProjectRequest();
        return TeaModel.build(map, self);
    }

    public UpdateProjectRequest setProject(String project) {
        this.project = project;
        return this;
    }
    public String getProject() {
        return this.project;
    }

    public UpdateProjectRequest setNewCU(Integer newCU) {
        this.newCU = newCU;
        return this;
    }
    public Integer getNewCU() {
        return this.newCU;
    }

    public UpdateProjectRequest setNewServiceRole(String newServiceRole) {
        this.newServiceRole = newServiceRole;
        return this;
    }
    public String getNewServiceRole() {
        return this.newServiceRole;
    }

}
