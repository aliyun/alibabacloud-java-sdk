// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class DescribeStatisticalDataByProductRequest extends TeaModel {
    @NameInMap("OperaUid")
    public String operaUid;

    public static DescribeStatisticalDataByProductRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeStatisticalDataByProductRequest self = new DescribeStatisticalDataByProductRequest();
        return TeaModel.build(map, self);
    }

    public DescribeStatisticalDataByProductRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

}
