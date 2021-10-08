// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class DescribeAlertDetailDataRequest extends TeaModel {
    @NameInMap("AlertId")
    public Long alertId;

    @NameInMap("OperaUid")
    public String operaUid;

    public static DescribeAlertDetailDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAlertDetailDataRequest self = new DescribeAlertDetailDataRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAlertDetailDataRequest setAlertId(Long alertId) {
        this.alertId = alertId;
        return this;
    }
    public Long getAlertId() {
        return this.alertId;
    }

    public DescribeAlertDetailDataRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

}
