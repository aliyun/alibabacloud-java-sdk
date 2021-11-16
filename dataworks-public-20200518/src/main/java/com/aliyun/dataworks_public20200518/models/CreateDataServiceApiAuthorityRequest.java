// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CreateDataServiceApiAuthorityRequest extends TeaModel {
    @NameInMap("ApiId")
    public Long apiId;

    @NameInMap("AuthorizedProjectId")
    public Long authorizedProjectId;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("ProjectId")
    public Long projectId;

    @NameInMap("TenantId")
    public Long tenantId;

    public static CreateDataServiceApiAuthorityRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDataServiceApiAuthorityRequest self = new CreateDataServiceApiAuthorityRequest();
        return TeaModel.build(map, self);
    }

    public CreateDataServiceApiAuthorityRequest setApiId(Long apiId) {
        this.apiId = apiId;
        return this;
    }
    public Long getApiId() {
        return this.apiId;
    }

    public CreateDataServiceApiAuthorityRequest setAuthorizedProjectId(Long authorizedProjectId) {
        this.authorizedProjectId = authorizedProjectId;
        return this;
    }
    public Long getAuthorizedProjectId() {
        return this.authorizedProjectId;
    }

    public CreateDataServiceApiAuthorityRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public CreateDataServiceApiAuthorityRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public CreateDataServiceApiAuthorityRequest setTenantId(Long tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public Long getTenantId() {
        return this.tenantId;
    }

}
