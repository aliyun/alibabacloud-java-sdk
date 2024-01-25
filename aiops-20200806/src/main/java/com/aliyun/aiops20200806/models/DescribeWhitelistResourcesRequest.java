// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class DescribeWhitelistResourcesRequest extends TeaModel {
    @NameInMap("Keyword")
    public String keyword;

    @NameInMap("OperaUid")
    public String operaUid;

    @NameInMap("ProductCode")
    public String productCode;

    public static DescribeWhitelistResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeWhitelistResourcesRequest self = new DescribeWhitelistResourcesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeWhitelistResourcesRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public DescribeWhitelistResourcesRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

    public DescribeWhitelistResourcesRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

}
