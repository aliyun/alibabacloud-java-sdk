// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CreateBusinessRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("BusinessName")
    public String businessName;

    @NameInMap("Description")
    public String description;

    @NameInMap("Owner")
    public String owner;

    @NameInMap("ProjectId")
    public Long projectId;

    @NameInMap("ProjectIdentifier")
    public String projectIdentifier;

    @NameInMap("UseType")
    public String useType;

    public static CreateBusinessRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateBusinessRequest self = new CreateBusinessRequest();
        return TeaModel.build(map, self);
    }

    public CreateBusinessRequest setBusinessName(String businessName) {
        this.businessName = businessName;
        return this;
    }
    public String getBusinessName() {
        return this.businessName;
    }

    public CreateBusinessRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateBusinessRequest setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public CreateBusinessRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public CreateBusinessRequest setProjectIdentifier(String projectIdentifier) {
        this.projectIdentifier = projectIdentifier;
        return this;
    }
    public String getProjectIdentifier() {
        return this.projectIdentifier;
    }

    public CreateBusinessRequest setUseType(String useType) {
        this.useType = useType;
        return this;
    }
    public String getUseType() {
        return this.useType;
    }

}
