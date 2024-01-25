// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class DescribeReportEmailConfigsRequest extends TeaModel {
    @NameInMap("OperaUid")
    public String operaUid;

    public static DescribeReportEmailConfigsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeReportEmailConfigsRequest self = new DescribeReportEmailConfigsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeReportEmailConfigsRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

}
