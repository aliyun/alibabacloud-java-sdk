// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class PublishDataServiceApiRequest extends TeaModel {
    @NameInMap("TenantId")
    public Long tenantId;

    @NameInMap("ProjectId")
    public Long projectId;

    @NameInMap("ApiId")
    public Long apiId;

    public static PublishDataServiceApiRequest build(java.util.Map<String, ?> map) throws Exception {
        PublishDataServiceApiRequest self = new PublishDataServiceApiRequest();
        return TeaModel.build(map, self);
    }

    public PublishDataServiceApiRequest setTenantId(Long tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public Long getTenantId() {
        return this.tenantId;
    }

    public PublishDataServiceApiRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public PublishDataServiceApiRequest setApiId(Long apiId) {
        this.apiId = apiId;
        return this;
    }
    public Long getApiId() {
        return this.apiId;
    }

}
