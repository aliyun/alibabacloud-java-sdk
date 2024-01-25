// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class DescribeReportSubscriptionsRequest extends TeaModel {
    @NameInMap("OperaUid")
    public String operaUid;

    public static DescribeReportSubscriptionsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeReportSubscriptionsRequest self = new DescribeReportSubscriptionsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeReportSubscriptionsRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

}
