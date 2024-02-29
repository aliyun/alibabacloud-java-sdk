// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetAlertMessageRequest extends TeaModel {
    @NameInMap("AlertId")
    public String alertId;

    public static GetAlertMessageRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAlertMessageRequest self = new GetAlertMessageRequest();
        return TeaModel.build(map, self);
    }

    public GetAlertMessageRequest setAlertId(String alertId) {
        this.alertId = alertId;
        return this;
    }
    public String getAlertId() {
        return this.alertId;
    }

}
