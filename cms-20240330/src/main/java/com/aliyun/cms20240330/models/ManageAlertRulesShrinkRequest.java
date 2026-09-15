// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ManageAlertRulesShrinkRequest extends TeaModel {
    /**
     * <p>The request body for managing alert rules. This body is shared by the CREATE, UPDATE, PATCH, and BATCH_DELETE actions. Specify the fields based on the action.</p>
     */
    @NameInMap("body")
    public String bodyShrink;

    /**
     * <p>The identifier of the call source, which specifies the internal integration channel to which the caller belongs (such as bailian, integrationCenter, or managed_service_for_prometheus). This parameter is used to isolate traffic from different call sources. You do not need to specify this parameter for regular OpenAPI calls.</p>
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
