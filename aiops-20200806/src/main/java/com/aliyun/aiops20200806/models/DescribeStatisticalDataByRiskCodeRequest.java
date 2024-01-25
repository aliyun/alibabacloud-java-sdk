// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class DescribeStatisticalDataByRiskCodeRequest extends TeaModel {
    @NameInMap("OperaUid")
    public String operaUid;

    public static DescribeStatisticalDataByRiskCodeRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeStatisticalDataByRiskCodeRequest self = new DescribeStatisticalDataByRiskCodeRequest();
        return TeaModel.build(map, self);
    }

    public DescribeStatisticalDataByRiskCodeRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

}
