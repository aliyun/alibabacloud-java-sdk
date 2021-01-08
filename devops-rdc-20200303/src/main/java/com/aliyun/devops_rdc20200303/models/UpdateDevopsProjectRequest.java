// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops_rdc20200303.models;

import com.aliyun.tea.*;

public class UpdateDevopsProjectRequest extends TeaModel {
    @NameInMap("OrgId")
    public String orgId;

    @NameInMap("Name")
    public String name;

    @NameInMap("Description")
    public String description;

    @NameInMap("ProjectId")
    public String projectId;

    public static UpdateDevopsProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDevopsProjectRequest self = new UpdateDevopsProjectRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDevopsProjectRequest setOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    public String getOrgId() {
        return this.orgId;
    }

    public UpdateDevopsProjectRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateDevopsProjectRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateDevopsProjectRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

}
