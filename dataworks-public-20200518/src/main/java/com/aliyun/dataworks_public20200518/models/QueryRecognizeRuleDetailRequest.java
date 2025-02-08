// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class QueryRecognizeRuleDetailRequest extends TeaModel {
    /**
     * <p>The name of the sensitive field. To obtain the name of the sensitive field, call the <a href="https://help.aliyun.com/document_detail/2747189.html">QuerySensNodeInfo</a> operation or log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a> and go to the Data Category and Sensitivity Level page.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Name</p>
     */
    @NameInMap("SensitiveName")
    public String sensitiveName;

    /**
     * <p>The tenant ID. To obtain the tenant ID, perform the following steps: Log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>. Find your workspace and go to the DataStudio page. On the DataStudio page, click the logon username in the upper-right corner and click User Info in the Menu section.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10241024</p>
     */
    @NameInMap("TenantId")
    public String tenantId;

    public static QueryRecognizeRuleDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRecognizeRuleDetailRequest self = new QueryRecognizeRuleDetailRequest();
        return TeaModel.build(map, self);
    }

    public QueryRecognizeRuleDetailRequest setSensitiveName(String sensitiveName) {
        this.sensitiveName = sensitiveName;
        return this;
    }
    public String getSensitiveName() {
        return this.sensitiveName;
    }

    public QueryRecognizeRuleDetailRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
