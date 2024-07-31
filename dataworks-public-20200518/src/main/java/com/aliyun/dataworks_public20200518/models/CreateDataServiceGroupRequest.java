// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CreateDataServiceGroupRequest extends TeaModel {
    /**
     * <p>The ID of the API group that is associated with the business process in the API Gateway console. You can log on to the API Gateway console and go to the Group Details page to view the ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1000abcd</p>
     */
    @NameInMap("ApiGatewayGroupId")
    public String apiGatewayGroupId;

    /**
     * <p>The description of the business process.</p>
     * 
     * <strong>example:</strong>
     * <p>Test business process</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The name of the business process.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Business process name</p>
     */
    @NameInMap("GroupName")
    public String groupName;

    /**
     * <p>The ID of the workspace.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10001</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The tenant ID. This parameter is deprecated.</p>
     * 
     * <strong>example:</strong>
     * <p>10002</p>
     */
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
