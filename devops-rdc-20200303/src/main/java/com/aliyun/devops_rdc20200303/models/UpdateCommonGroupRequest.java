// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops_rdc20200303.models;

import com.aliyun.tea.*;

public class UpdateCommonGroupRequest extends TeaModel {
    @NameInMap("OrgId")
    public String orgId;

    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("Description")
    public String description;

    @NameInMap("SmartGroupId")
    public String smartGroupId;

    @NameInMap("CommonGroupId")
    public String commonGroupId;

    @NameInMap("Name")
    public String name;

    public static UpdateCommonGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCommonGroupRequest self = new UpdateCommonGroupRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCommonGroupRequest setOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    public String getOrgId() {
        return this.orgId;
    }

    public UpdateCommonGroupRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public UpdateCommonGroupRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateCommonGroupRequest setSmartGroupId(String smartGroupId) {
        this.smartGroupId = smartGroupId;
        return this;
    }
    public String getSmartGroupId() {
        return this.smartGroupId;
    }

    public UpdateCommonGroupRequest setCommonGroupId(String commonGroupId) {
        this.commonGroupId = commonGroupId;
        return this;
    }
    public String getCommonGroupId() {
        return this.commonGroupId;
    }

    public UpdateCommonGroupRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
