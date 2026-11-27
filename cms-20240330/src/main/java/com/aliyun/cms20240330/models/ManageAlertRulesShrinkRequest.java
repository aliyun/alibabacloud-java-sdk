// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ManageAlertRulesShrinkRequest extends TeaModel {
    /**
     * <p>Specifies whether to perform a dry run. If you set this parameter to true, the system only validates the request and returns the validation result in dryRunResult without writing data to the database or triggering side effects such as template synchronization. Default value: false.</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The request body for managing alert rules. This body is shared by the CREATE, UPDATE, PATCH, and BATCH_DELETE operations. Specify the fields based on the action.</p>
     */
    @NameInMap("body")
    public String bodyShrink;

    /**
     * <p>The call source identifier. It identifies the internal integration channel to which the caller belongs, such as bailian, integrationCenter, or managed_service_for_prometheus, and is used to isolate traffic from different sources. You do not need to specify this parameter for standard OpenAPI calls.</p>
     * 
     * <strong>example:</strong>
     * <p>bailian</p>
     */
    @NameInMap("callSource")
    public String callSource;

    public static ManageAlertRulesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ManageAlertRulesShrinkRequest self = new ManageAlertRulesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ManageAlertRulesShrinkRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public ManageAlertRulesShrinkRequest setBodyShrink(String bodyShrink) {
        this.bodyShrink = bodyShrink;
        return this;
    }
    public String getBodyShrink() {
        return this.bodyShrink;
    }

    public ManageAlertRulesShrinkRequest setCallSource(String callSource) {
        this.callSource = callSource;
        return this;
    }
    public String getCallSource() {
        return this.callSource;
    }

}
