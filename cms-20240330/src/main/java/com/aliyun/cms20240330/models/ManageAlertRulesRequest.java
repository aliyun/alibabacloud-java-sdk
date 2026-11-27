// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ManageAlertRulesRequest extends TeaModel {
    /**
     * <p>Specifies whether to perform a dry run. If you set this parameter to true, the system only validates the request and returns the validation result in dryRunResult without writing data to the database or triggering side effects such as template synchronization. Default value: false.</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The request body for managing alert rules. This body is shared by the CREATE, UPDATE, PATCH, and BATCH_DELETE operations. Specify the fields based on the action.</p>
     */
    @NameInMap("body")
    public ManageAlertRulesUnifiedActionInput body;

    /**
     * <p>The call source identifier. It identifies the internal integration channel to which the caller belongs, such as bailian, integrationCenter, or managed_service_for_prometheus, and is used to isolate traffic from different sources. You do not need to specify this parameter for standard OpenAPI calls.</p>
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

    public ManageAlertRulesRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
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
