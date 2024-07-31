// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DeleteDataServiceApiAuthorityRequest extends TeaModel {
    /**
     * <p>The API ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10001</p>
     */
    @NameInMap("ApiId")
    public Long apiId;

    /**
     * <p>The ID of the workspace from which you want to revoke the access permissions on the API.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10002</p>
     */
    @NameInMap("AuthorizedProjectId")
    public Long authorizedProjectId;

    /**
     * <p>The workspace ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10003</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The tenant ID. This parameter is deprecated.</p>
     * 
     * <strong>example:</strong>
     * <p>10004</p>
     */
    @NameInMap("TenantId")
    public Long tenantId;

    public static DeleteDataServiceApiAuthorityRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDataServiceApiAuthorityRequest self = new DeleteDataServiceApiAuthorityRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDataServiceApiAuthorityRequest setApiId(Long apiId) {
        this.apiId = apiId;
        return this;
    }
    public Long getApiId() {
        return this.apiId;
    }

    public DeleteDataServiceApiAuthorityRequest setAuthorizedProjectId(Long authorizedProjectId) {
        this.authorizedProjectId = authorizedProjectId;
        return this;
    }
    public Long getAuthorizedProjectId() {
        return this.authorizedProjectId;
    }

    public DeleteDataServiceApiAuthorityRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public DeleteDataServiceApiAuthorityRequest setTenantId(Long tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public Long getTenantId() {
        return this.tenantId;
    }

}
