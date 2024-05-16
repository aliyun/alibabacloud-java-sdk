// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CreateDataServiceApiAuthorityRequest extends TeaModel {
    /**
     * <p>The ID of the API.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ApiId")
    public Long apiId;

    /**
     * <p>The ID of the workspace to which the access permissions on the API are granted.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AuthorizedProjectId")
    public Long authorizedProjectId;

    /**
     * <p>The end time of the validity period of the access permissions. The time must be a UNIX timestamp. Unit: seconds. Example: 1600531564, which indicates 2020-09-20 00:06:04 (UTC+8).</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The ID of the workspace.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The ID of the tenant.</p>
     */
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
