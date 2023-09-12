// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class SkuSaleInfoListResult extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("skuSaleInfos")
    public java.util.List<SkuSaleInfo> skuSaleInfos;

    public static SkuSaleInfoListResult build(java.util.Map<String, ?> map) throws Exception {
        SkuSaleInfoListResult self = new SkuSaleInfoListResult();
        return TeaModel.build(map, self);
    }

    public SkuSaleInfoListResult setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SkuSaleInfoListResult setSkuSaleInfos(java.util.List<SkuSaleInfo> skuSaleInfos) {
        this.skuSaleInfos = skuSaleInfos;
        return this;
    }
    public java.util.List<SkuSaleInfo> getSkuSaleInfos() {
        return this.skuSaleInfos;
    }

}
