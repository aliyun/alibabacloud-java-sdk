// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class DescribeInspectionResourcesRequest extends TeaModel {
    @NameInMap("Keyword")
    public String keyword;

    @NameInMap("OperaUid")
    public String operaUid;

    @NameInMap("ProductCode")
    public String productCode;

    public static DescribeInspectionResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInspectionResourcesRequest self = new DescribeInspectionResourcesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInspectionResourcesRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public DescribeInspectionResourcesRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

    public DescribeInspectionResourcesRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

}
