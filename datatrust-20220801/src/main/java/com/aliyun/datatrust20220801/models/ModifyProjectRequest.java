// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class ModifyProjectRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("OwnerName")
    public String ownerName;

    @NameInMap("ProjectId")
    public Long projectId;

    @NameInMap("ProjectName")
    public String projectName;

    public static ModifyProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyProjectRequest self = new ModifyProjectRequest();
        return TeaModel.build(map, self);
    }

    public ModifyProjectRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyProjectRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyProjectRequest setOwnerName(String ownerName) {
        this.ownerName = ownerName;
        return this;
    }
    public String getOwnerName() {
        return this.ownerName;
    }

    public ModifyProjectRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public ModifyProjectRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

}
