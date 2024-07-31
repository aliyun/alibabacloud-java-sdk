// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class PublishDataServiceApiRequest extends TeaModel {
    /**
     * <p>The API ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("ApiId")
    public Long apiId;

    /**
     * <p>The workspace ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10001</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The tenant ID. To obtain the tenant ID, perform the following steps: Log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>. Find your workspace and go to the DataStudio page. On the DataStudio page, click the logon username in the upper-right corner and click User Info in the Menu section.</p>
     * 
     * <strong>example:</strong>
     * <p>10002</p>
     */
    @NameInMap("TenantId")
    public Long tenantId;

    public static PublishDataServiceApiRequest build(java.util.Map<String, ?> map) throws Exception {
        PublishDataServiceApiRequest self = new PublishDataServiceApiRequest();
        return TeaModel.build(map, self);
    }

    public PublishDataServiceApiRequest setApiId(Long apiId) {
        this.apiId = apiId;
        return this;
    }
    public Long getApiId() {
        return this.apiId;
    }

    public PublishDataServiceApiRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public PublishDataServiceApiRequest setTenantId(Long tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public Long getTenantId() {
        return this.tenantId;
    }

}
