// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class DescribeProductRiskPieRequest extends TeaModel {
    @NameInMap("OperaUid")
    public String operaUid;

    public static DescribeProductRiskPieRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeProductRiskPieRequest self = new DescribeProductRiskPieRequest();
        return TeaModel.build(map, self);
    }

    public DescribeProductRiskPieRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

}
