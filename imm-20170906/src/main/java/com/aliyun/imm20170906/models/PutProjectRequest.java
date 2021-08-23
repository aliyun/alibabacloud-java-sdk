// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class PutProjectRequest extends TeaModel {
    @NameInMap("Project")
    public String project;

    @NameInMap("ServiceRole")
    public String serviceRole;

    public static PutProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        PutProjectRequest self = new PutProjectRequest();
        return TeaModel.build(map, self);
    }

    public PutProjectRequest setProject(String project) {
        this.project = project;
        return this;
    }
    public String getProject() {
        return this.project;
    }

    public PutProjectRequest setServiceRole(String serviceRole) {
        this.serviceRole = serviceRole;
        return this;
    }
    public String getServiceRole() {
        return this.serviceRole;
    }

}
