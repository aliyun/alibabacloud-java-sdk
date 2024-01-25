// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class PutAlertIgnoreRequest extends TeaModel {
    @NameInMap("AlertId")
    public Long alertId;

    @NameInMap("OperaUid")
    public String operaUid;

    public static PutAlertIgnoreRequest build(java.util.Map<String, ?> map) throws Exception {
        PutAlertIgnoreRequest self = new PutAlertIgnoreRequest();
        return TeaModel.build(map, self);
    }

    public PutAlertIgnoreRequest setAlertId(Long alertId) {
        this.alertId = alertId;
        return this;
    }
    public Long getAlertId() {
        return this.alertId;
    }

    public PutAlertIgnoreRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

}
