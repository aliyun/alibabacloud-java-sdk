// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateBusinessRequest extends TeaModel {
    /**
     * <p>Name of the Business Process.<br>
     * The name must be unique within the same project space.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>My business process</p>
     */
    @NameInMap("BusinessName")
    public String businessName;

    /**
     * <p>Description of the Business Process.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The Alibaba Cloud account ID of the owner responsible for the Business Process.<br>
     * You can log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>, move the mouse pointer over the profile picture in the upper-right corner of the menu bar, and view the Account ID. If this parameter is empty, the Alibaba Cloud account ID of the invoker is used by default.</p>
     * 
     * <strong>example:</strong>
     * <p>1000000000001</p>
     */
    @NameInMap("Owner")
    public String owner;

    /**
     * <p>The ID of the DataWorks workspace.<br>
     * You can log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>, go to the Workspace Management page, and view the ID.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The unique identifier of the DataWorks workspace, which is the English identifier displayed when you switch workspaces at the top of the Data Development page. You must specify either this parameter or the projectid parameter to identify the DataWorks project for this API call.</p>
     * 
     * <strong>example:</strong>
     * <p>dw_project</p>
     */
    @NameInMap("ProjectIdentifier")
    public String projectIdentifier;

    /**
     * <p>Function module to which the Business Process belongs. Valid values:</p>
     * <ul>
     * <li><p>NORMAL (Data Development)</p>
     * </li>
     * <li><p>MANUAL_BIZ (manually triggered workflow)</p>
     * </li>
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
