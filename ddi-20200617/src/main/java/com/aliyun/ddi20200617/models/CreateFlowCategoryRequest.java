// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class CreateFlowCategoryRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("Name")
    public String name;

    @NameInMap("Type")
    public String type;

    @NameInMap("ParentId")
    public String parentId;

    @NameInMap("ClientToken")
    public String clientToken;

    public static CreateFlowCategoryRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateFlowCategoryRequest self = new CreateFlowCategoryRequest();
        return TeaModel.build(map, self);
    }

    public CreateFlowCategoryRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateFlowCategoryRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public CreateFlowCategoryRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateFlowCategoryRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public CreateFlowCategoryRequest setParentId(String parentId) {
        this.parentId = parentId;
        return this;
    }
    public String getParentId() {
        return this.parentId;
    }

    public CreateFlowCategoryRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
