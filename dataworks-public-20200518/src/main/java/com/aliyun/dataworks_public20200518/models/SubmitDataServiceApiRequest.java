// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class SubmitDataServiceApiRequest extends TeaModel {
    /**
     * <p>The API ID. You can call the <a href="~~ListDataServiceApis~~">ListDataServiceApis</a> operation to obtain the ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12345</p>
     */
    @NameInMap("ApiId")
    public Long apiId;

    /**
     * <p>The DataWorks workspace ID. You can log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a> and go to the Workspace page to obtain the workspace ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The tenant ID. To obtain the tenant ID, perform the following steps: Log on to the DataWorks console. Find your workspace and go to the <a href="https://ds-cn-shanghai.data.aliyun.com/">DataService Studio</a> page. On the DataService Studio page, click the logon username in the upper-right corner and click User Info in the Menu section.</p>
     * 
     * <strong>example:</strong>
     * <p>10001</p>
     */
    @NameInMap("TenantId")
    public Long tenantId;

    public static SubmitDataServiceApiRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitDataServiceApiRequest self = new SubmitDataServiceApiRequest();
        return TeaModel.build(map, self);
    }

    public SubmitDataServiceApiRequest setApiId(Long apiId) {
        this.apiId = apiId;
        return this;
    }
    public Long getApiId() {
        return this.apiId;
    }

    public SubmitDataServiceApiRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public SubmitDataServiceApiRequest setTenantId(Long tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public Long getTenantId() {
        return this.tenantId;
    }

}
