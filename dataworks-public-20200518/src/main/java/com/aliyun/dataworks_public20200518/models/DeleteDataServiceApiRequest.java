// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DeleteDataServiceApiRequest extends TeaModel {
    /**
     * <p>The ID of the DataService API.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("ApiId")
    public Long apiId;

    /**
     * <p>The workspace ID.</p>
     * <p>You can obtain the workspace ID from PageResult.ProjectList[].ProjectId in the response of ListProjects.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10001</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The tenant ID. You can log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>, go to the DataStudio page, click the username in the upper-right corner, and choose Menu &gt; User Info to obtain the tenant ID.</p>
     * <p>You can also obtain the tenant ID from Data.Apis[].TenantId in the response of ListDataServiceApis.</p>
     * 
     * <strong>example:</strong>
     * <p>10002</p>
     */
    @NameInMap("TenantId")
    public Long tenantId;

    public static DeleteDataServiceApiRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDataServiceApiRequest self = new DeleteDataServiceApiRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDataServiceApiRequest setApiId(Long apiId) {
        this.apiId = apiId;
        return this;
    }
    public Long getApiId() {
        return this.apiId;
    }

    public DeleteDataServiceApiRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public DeleteDataServiceApiRequest setTenantId(Long tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public Long getTenantId() {
        return this.tenantId;
    }

}
