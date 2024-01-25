// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class DescribeLastInspectionSummaryRequest extends TeaModel {
    @NameInMap("OperaUid")
    public String operaUid;

    public static DescribeLastInspectionSummaryRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeLastInspectionSummaryRequest self = new DescribeLastInspectionSummaryRequest();
        return TeaModel.build(map, self);
    }

    public DescribeLastInspectionSummaryRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

}
