// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetBusinessRequest extends TeaModel {
    /**
     * <p>The ID of the business flow. You can call the <a href="https://help.aliyun.com/document_detail/173945.html">ListBusiness</a> operation to obtain the ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1000000111</p>
     */
    @NameInMap("BusinessId")
    public Long businessId;

    /**
     * <p>The ID of the DataWorks workspace. You can log on to the DataWorks console and go to the Workspace Configuration page to obtain the workspace ID. You must specify either this parameter or the ProjectIdentifier parameter to determine the DataWorks workspace for the API operation. You can also call the ListProjects operation to query the workspace ID under the current tenant.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The name of the DataWorks workspace. You can log on to the DataWorks console and go to the Workspace Configuration page to obtain the workspace name. You must specify either this parameter or the ProjectId parameter to determine the DataWorks workspace for the API operation.</p>
     * 
     * <strong>example:</strong>
     * <p>dw_project</p>
     */
    @NameInMap("ProjectIdentifier")
    public String projectIdentifier;

    public static GetBusinessRequest build(java.util.Map<String, ?> map) throws Exception {
        GetBusinessRequest self = new GetBusinessRequest();
        return TeaModel.build(map, self);
    }

    public GetBusinessRequest setBusinessId(Long businessId) {
        this.businessId = businessId;
        return this;
    }
    public Long getBusinessId() {
        return this.businessId;
    }

    public GetBusinessRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public GetBusinessRequest setProjectIdentifier(String projectIdentifier) {
        this.projectIdentifier = projectIdentifier;
        return this;
    }
    public String getProjectIdentifier() {
        return this.projectIdentifier;
    }

}
