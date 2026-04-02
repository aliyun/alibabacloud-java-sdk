// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ManageAlertRulesRequest extends TeaModel {
    @NameInMap("body")
    public ManageAlertRulesUnifiedActionInput body;

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

}
