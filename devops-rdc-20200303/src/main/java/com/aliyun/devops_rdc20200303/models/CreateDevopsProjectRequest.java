// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops_rdc20200303.models;

import com.aliyun.tea.*;

public class CreateDevopsProjectRequest extends TeaModel {
    @NameInMap("OrgId")
    public String orgId;

    @NameInMap("Name")
    public String name;

    @NameInMap("Description")
    public String description;

    public static CreateDevopsProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDevopsProjectRequest self = new CreateDevopsProjectRequest();
        return TeaModel.build(map, self);
    }

    public CreateDevopsProjectRequest setOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    public String getOrgId() {
        return this.orgId;
    }

    public CreateDevopsProjectRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateDevopsProjectRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

}
