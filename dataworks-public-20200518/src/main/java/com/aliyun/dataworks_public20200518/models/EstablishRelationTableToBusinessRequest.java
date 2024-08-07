// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class EstablishRelationTableToBusinessRequest extends TeaModel {
    /**
     * <p>The ID of the workflow. You can call the <a href="https://help.aliyun.com/document_detail/173945.html">ListBusiness</a> operation to query the ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1000001</p>
     */
    @NameInMap("BusinessId")
    public String businessId;

    /**
     * <p>The ID of the folder. You can call the <a href="https://help.aliyun.com/document_detail/173952.html">GetFolder</a> or <a href="https://help.aliyun.com/document_detail/173955.html">ListFolders</a> operation to query the ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2eb6f9****</p>
     */
    @NameInMap("FolderId")
    public String folderId;

    /**
     * <p>The ID of the DataWorks workspace. You can click the Workspace Manage icon in the upper-right corner of the DataStudio page to go to the Workspace Management page and view the workspace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The unique identifier of the DataWorks workspace. You can click the identifier in the upper-left corner of the DataStudio page to switch to another workspace.</p>
     * <p>You must specify either this parameter or ProjectId to determine the DataWorks workspace to which the operation is applied.</p>
     * 
     * <strong>example:</strong>
     * <p>dw</p>
     */
    @NameInMap("ProjectIdentifier")
    public String projectIdentifier;

    /**
     * <p>The universally unique identifier (UUID) of the table. You can call the <a href="https://help.aliyun.com/document_detail/173919.html">SearchMetaTables</a> operation to query the UUID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>odps.dw_project.tb1</p>
     */
    @NameInMap("TableGuid")
    public String tableGuid;

    public static EstablishRelationTableToBusinessRequest build(java.util.Map<String, ?> map) throws Exception {
        EstablishRelationTableToBusinessRequest self = new EstablishRelationTableToBusinessRequest();
        return TeaModel.build(map, self);
    }

    public EstablishRelationTableToBusinessRequest setBusinessId(String businessId) {
        this.businessId = businessId;
        return this;
    }
    public String getBusinessId() {
        return this.businessId;
    }

    public EstablishRelationTableToBusinessRequest setFolderId(String folderId) {
        this.folderId = folderId;
        return this;
    }
    public String getFolderId() {
        return this.folderId;
    }

    public EstablishRelationTableToBusinessRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public EstablishRelationTableToBusinessRequest setProjectIdentifier(String projectIdentifier) {
        this.projectIdentifier = projectIdentifier;
        return this;
    }
    public String getProjectIdentifier() {
        return this.projectIdentifier;
    }

    public EstablishRelationTableToBusinessRequest setTableGuid(String tableGuid) {
        this.tableGuid = tableGuid;
        return this;
    }
    public String getTableGuid() {
        return this.tableGuid;
    }

}
