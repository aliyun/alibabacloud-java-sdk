// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class EstablishRelationTableToBusinessRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1000001</p>
     */
    @NameInMap("BusinessId")
    public String businessId;

    /**
     * <strong>example:</strong>
     * <p>2eb6f9****</p>
     */
    @NameInMap("FolderId")
    public String folderId;

    /**
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <strong>example:</strong>
     * <p>dw</p>
     */
    @NameInMap("ProjectIdentifier")
    public String projectIdentifier;

    /**
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
