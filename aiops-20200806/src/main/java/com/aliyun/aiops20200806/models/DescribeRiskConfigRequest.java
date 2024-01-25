// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class DescribeRiskConfigRequest extends TeaModel {
    @NameInMap("OperaUid")
    public String operaUid;

    public static DescribeRiskConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRiskConfigRequest self = new DescribeRiskConfigRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRiskConfigRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

}
