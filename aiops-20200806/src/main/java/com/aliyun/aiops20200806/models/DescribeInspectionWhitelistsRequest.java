// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class DescribeInspectionWhitelistsRequest extends TeaModel {
    @NameInMap("OperaUid")
    public String operaUid;

    @NameInMap("ProductCode")
    public String productCode;

    public static DescribeInspectionWhitelistsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInspectionWhitelistsRequest self = new DescribeInspectionWhitelistsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInspectionWhitelistsRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

    public DescribeInspectionWhitelistsRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

}
