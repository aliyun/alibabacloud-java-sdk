// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class QueryPublicModelEngineRequest extends TeaModel {
    @NameInMap("Text")
    public String text;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("ProjectId")
    public String projectId;

    public static QueryPublicModelEngineRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryPublicModelEngineRequest self = new QueryPublicModelEngineRequest();
        return TeaModel.build(map, self);
    }

    public QueryPublicModelEngineRequest setText(String text) {
        this.text = text;
        return this;
    }
    public String getText() {
        return this.text;
    }

    public QueryPublicModelEngineRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public QueryPublicModelEngineRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

}
