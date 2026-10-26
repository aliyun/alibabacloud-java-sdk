// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ManageAlertRulesRequest extends TeaModel {
    /**
     * <p>The aggregated request body for managing alert rules. This body is shared by the CREATE, UPDATE, PATCH, and BATCH_DELETE operations. Specify fields based on the action.</p>
     */
    @NameInMap("body")
    public ManageAlertRulesUnifiedActionInput body;

    /**
     * <p>The call source identifier that specifies the internal integration channel of the caller, such as bailian, integrationCenter, or managed_service_for_prometheus. This parameter is used to isolate traffic from different sources. You do not need to specify this parameter for standard OpenAPI calls.</p>
     * 
     * <strong>example:</strong>
     * <p>bailian</p>
     */
    @NameInMap("callSource")
    public String callSource;

    public static ManageAlertRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        ManageAlertRulesRequest self = new ManageAlertRulesRequest();
        return TeaModel.build(map, self);
    }

    public ManageAlertRulesRequest setBody(ManageAlertRulesUnifiedActionInput body) {
        this.body = body;
        return this;
    }
    public ManageAlertRulesUnifiedActionInput getBody() {
        return this.body;
    }

    public ManageAlertRulesRequest setCallSource(String callSource) {
        this.callSource = callSource;
        return this;
    }
    public String getCallSource() {
        return this.callSource;
    }

}
