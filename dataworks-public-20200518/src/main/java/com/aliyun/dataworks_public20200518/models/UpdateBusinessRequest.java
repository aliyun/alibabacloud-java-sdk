// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class UpdateBusinessRequest extends TeaModel {
    @NameInMap("ProjectId")
    public Long projectId;

    @NameInMap("ProjectIdentifier")
    public String projectIdentifier;

    @NameInMap("BusinessName")
    public String businessName;

    @NameInMap("Description")
    public String description;

    @NameInMap("Owner")
    public String owner;

    @NameInMap("BusinessId")
    @Validation(required = true)
    public Long businessId;

    public static UpdateBusinessRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateBusinessRequest self = new UpdateBusinessRequest();
        return TeaModel.build(map, self);
    }

    public UpdateBusinessRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public UpdateBusinessRequest setProjectIdentifier(String projectIdentifier) {
        this.projectIdentifier = projectIdentifier;
        return this;
    }
    public String getProjectIdentifier() {
        return this.projectIdentifier;
    }

    public UpdateBusinessRequest setBusinessName(String businessName) {
        this.businessName = businessName;
        return this;
    }
    public String getBusinessName() {
        return this.businessName;
    }

    public UpdateBusinessRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateBusinessRequest setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public UpdateBusinessRequest setBusinessId(Long businessId) {
        this.businessId = businessId;
        return this;
    }
    public Long getBusinessId() {
        return this.businessId;
    }

}
