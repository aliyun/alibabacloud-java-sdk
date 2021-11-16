// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetDataServicePublishedApiRequest extends TeaModel {
    @NameInMap("ApiId")
    public Long apiId;

    @NameInMap("ProjectId")
    public Long projectId;

    @NameInMap("TenantId")
    public Long tenantId;

    public static GetDataServicePublishedApiRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDataServicePublishedApiRequest self = new GetDataServicePublishedApiRequest();
        return TeaModel.build(map, self);
    }

    public GetDataServicePublishedApiRequest setApiId(Long apiId) {
        this.apiId = apiId;
        return this;
    }
    public Long getApiId() {
        return this.apiId;
    }

    public GetDataServicePublishedApiRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public GetDataServicePublishedApiRequest setTenantId(Long tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public Long getTenantId() {
        return this.tenantId;
    }

}
