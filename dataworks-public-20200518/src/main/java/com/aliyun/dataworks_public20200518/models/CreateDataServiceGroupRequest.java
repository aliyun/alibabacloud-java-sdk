// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CreateDataServiceGroupRequest extends TeaModel {
    @NameInMap("ApiGatewayGroupId")
    public String apiGatewayGroupId;

    @NameInMap("Description")
    public String description;

    @NameInMap("GroupName")
    public String groupName;

    @NameInMap("ProjectId")
    public Long projectId;

    @NameInMap("TenantId")
    public Long tenantId;

    public static CreateDataServiceGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDataServiceGroupRequest self = new CreateDataServiceGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateDataServiceGroupRequest setApiGatewayGroupId(String apiGatewayGroupId) {
        this.apiGatewayGroupId = apiGatewayGroupId;
        return this;
    }
    public String getApiGatewayGroupId() {
        return this.apiGatewayGroupId;
    }

    public CreateDataServiceGroupRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateDataServiceGroupRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public CreateDataServiceGroupRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public CreateDataServiceGroupRequest setTenantId(Long tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public Long getTenantId() {
        return this.tenantId;
    }

}
