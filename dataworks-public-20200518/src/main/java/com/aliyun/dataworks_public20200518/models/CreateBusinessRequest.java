// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CreateBusinessRequest extends TeaModel {
    /**
     * <p>The name of the business process. The name of the business process in the same project must be unique.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>My business process</p>
     */
    @NameInMap("BusinessName")
    public String businessName;

    /**
     * <p>The description of the business process.</p>
     * 
     * <strong>example:</strong>
     * <p>This is a business process created through an interface.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The Alibaba Cloud account ID of the owner of the business process. You can log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a> and hover over the user avatar on the right side of the top menu bar to view the account ID. If this parameter is empty, the caller\&quot;s Alibaba Cloud account ID is used by default.</p>
     * 
     * <strong>example:</strong>
     * <p>1000000000001</p>
     */
    @NameInMap("Owner")
    public String owner;

    /**
     * <p>The ID of the DataWorks workspace. You can log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a> and go to the Workspace page to obtain the workspace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The name of the DataWorks workspace. You can log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a> and go to the Workspace Management page to obtain the workspace name. You must configure either this parameter or ProjectId parameter to determine the DataWorks workspace to which the operation is applied.</p>
     * 
     * <strong>example:</strong>
     * <p>dw_project</p>
     */
    @NameInMap("ProjectIdentifier")
    public String projectIdentifier;

    /**
     * <p>The module to which the workflow belongs. Valid values:</p>
     * <ul>
     * <li>NORMAL: The workflow belongs to auto triggered workflows.</li>
     * <li>MANUAL_BIZ: The workflow belongs to manually triggered workflows.</li>
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
