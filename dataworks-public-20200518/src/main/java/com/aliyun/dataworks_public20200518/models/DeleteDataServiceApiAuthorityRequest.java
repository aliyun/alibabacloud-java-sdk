// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DeleteDataServiceApiAuthorityRequest extends TeaModel {
    @NameInMap("ApiId")
    public Long apiId;

    @NameInMap("AuthorizedProjectId")
    public Long authorizedProjectId;

    @NameInMap("ProjectId")
    public Long projectId;

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
