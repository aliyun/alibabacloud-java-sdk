// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeCloudauthstSceneListRequest extends TeaModel {
    /**
     * <p>Product Code</p>
     * 
     * <strong>example:</strong>
     * <p>SMART_CARD</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    public static DescribeCloudauthstSceneListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCloudauthstSceneListRequest self = new DescribeCloudauthstSceneListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCloudauthstSceneListRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

}
