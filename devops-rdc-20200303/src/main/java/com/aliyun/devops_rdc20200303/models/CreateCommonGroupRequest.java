// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops_rdc20200303.models;

import com.aliyun.tea.*;

public class CreateCommonGroupRequest extends TeaModel {
    @NameInMap("OrgId")
    public String orgId;

    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("Description")
    public String description;

    @NameInMap("SmartGroupId")
    public String smartGroupId;

    @NameInMap("Name")
    public String name;

    public static CreateCommonGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCommonGroupRequest self = new CreateCommonGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateCommonGroupRequest setOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    public String getOrgId() {
        return this.orgId;
    }

    public CreateCommonGroupRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public CreateCommonGroupRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateCommonGroupRequest setSmartGroupId(String smartGroupId) {
        this.smartGroupId = smartGroupId;
        return this;
    }
    public String getSmartGroupId() {
        return this.smartGroupId;
    }

    public CreateCommonGroupRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
