// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cd2021127.models;

import com.aliyun.tea.*;

public class GetMenuDataStatusRequest extends TeaModel {
    // 批次ID
    @NameInMap("BatchId")
    public String batchId;

    // 商品容器ID
    @NameInMap("ProductContainerId")
    public String productContainerId;

    public static GetMenuDataStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMenuDataStatusRequest self = new GetMenuDataStatusRequest();
        return TeaModel.build(map, self);
    }

    public GetMenuDataStatusRequest setBatchId(String batchId) {
        this.batchId = batchId;
        return this;
    }
    public String getBatchId() {
        return this.batchId;
    }

    public GetMenuDataStatusRequest setProductContainerId(String productContainerId) {
        this.productContainerId = productContainerId;
        return this;
    }
    public String getProductContainerId() {
        return this.productContainerId;
    }

}
