// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DeleteRecognizeRuleRequest extends TeaModel {
    /**
     * <p>The ID of the sensitive field. You can call the <a href="https://help.aliyun.com/document_detail/2747189.html">QuerySensNodeInfo</a> operation to query the ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>27f5f5e2-ec60-4567-b1e4-779ac3681024</p>
     */
    @NameInMap("SensitiveId")
    public String sensitiveId;

    /**
     * <p>The tenant ID. To obtain the tenant ID, perform the following steps: Log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>. Find your workspace and go to the DataStudio page. On the DataStudio page, click the logon username in the upper-right corner and click User Info in the Menu section.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10241024</p>
     */
    @NameInMap("TenantId")
    public String tenantId;

    public static DeleteRecognizeRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteRecognizeRuleRequest self = new DeleteRecognizeRuleRequest();
        return TeaModel.build(map, self);
    }

    public DeleteRecognizeRuleRequest setSensitiveId(String sensitiveId) {
        this.sensitiveId = sensitiveId;
        return this;
    }
    public String getSensitiveId() {
        return this.sensitiveId;
    }

    public DeleteRecognizeRuleRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
