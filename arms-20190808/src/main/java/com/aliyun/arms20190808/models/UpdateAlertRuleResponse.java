// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class UpdateAlertRuleResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public String data;

    @NameInMap("AlertId")
    @Validation(required = true)
    public Long alertId;

    public static UpdateAlertRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAlertRuleResponse self = new UpdateAlertRuleResponse();
        return TeaModel.build(map, self);
    }

}
