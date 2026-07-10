// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class AddProjectManagerShrinkRequest extends TeaModel {
    @NameInMap("org_entities")
    public String orgEntitiesShrink;

    @NameInMap("out_project_id")
    public String outProjectId;

    @NameInMap("project_id")
    public Long projectId;

    public static AddProjectManagerShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        AddProjectManagerShrinkRequest self = new AddProjectManagerShrinkRequest();
        return TeaModel.build(map, self);
    }

    public AddProjectManagerShrinkRequest setOrgEntitiesShrink(String orgEntitiesShrink) {
        this.orgEntitiesShrink = orgEntitiesShrink;
        return this;
    }
    public String getOrgEntitiesShrink() {
        return this.orgEntitiesShrink;
    }

    public AddProjectManagerShrinkRequest setOutProjectId(String outProjectId) {
        this.outProjectId = outProjectId;
        return this;
    }
    public String getOutProjectId() {
        return this.outProjectId;
    }

    public AddProjectManagerShrinkRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

}
