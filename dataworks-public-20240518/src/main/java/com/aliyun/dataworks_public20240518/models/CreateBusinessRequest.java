// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateBusinessRequest extends TeaModel {
    /**
     * <p>The name of the workflow. Workflow names must be unique within the same workspace.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>My business process</p>
     */
    @NameInMap("BusinessName")
    public String businessName;

    /**
     * <p>The description of the workflow.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The Alibaba Cloud account ID of the person responsible for the workflow. You can view the account ID by hovering over the user avatar in the top-right corner of the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>. If this parameter is not specified, the account ID of the API caller is used by default.</p>
     * 
     * <strong>example:</strong>
     * <p>1000000000001</p>
     */
    @NameInMap("Owner")
    public String owner;

    /**
     * <p>The ID of the DataWorks workspace. You can view the workspace ID on the workspace management page in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The unique identifier of the DataWorks workspace, This is the identifier shown in the workspace switch at the top of the Data Studio page. Either this parameter or ProjectId must be specified to determine which DataWorks project this API call operates on.</p>
     * 
     * <strong>example:</strong>
     * <p>dw_project</p>
     */
    @NameInMap("ProjectIdentifier")
    public String projectIdentifier;

    /**
     * <p>The module to which the workflow belongs. Valid values:</p>
     * <ul>
     * <li>NORMAL: Data Studio</li>
     * <li>MANUAL_BIZ: Manually triggered workflow</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>NORMAL</p>
     */
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
