// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class DescribeAdvisorInspectionProductsRequest extends TeaModel {
    @NameInMap("OperaUid")
    public String operaUid;

    public static DescribeAdvisorInspectionProductsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAdvisorInspectionProductsRequest self = new DescribeAdvisorInspectionProductsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAdvisorInspectionProductsRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

}
