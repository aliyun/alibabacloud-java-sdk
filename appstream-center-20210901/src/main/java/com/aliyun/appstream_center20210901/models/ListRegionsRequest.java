// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ListRegionsRequest extends TeaModel {
    @NameInMap("BizSource")
    public String bizSource;

    @NameInMap("ProductType")
    public String productType;

    public static ListRegionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRegionsRequest self = new ListRegionsRequest();
        return TeaModel.build(map, self);
    }

    public ListRegionsRequest setBizSource(String bizSource) {
        this.bizSource = bizSource;
        return this;
    }
    public String getBizSource() {
        return this.bizSource;
    }

    public ListRegionsRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

}
