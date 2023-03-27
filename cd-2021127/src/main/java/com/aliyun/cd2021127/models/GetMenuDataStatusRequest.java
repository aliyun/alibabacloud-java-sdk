// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cd2021127.models;

import com.aliyun.tea.*;

public class GetMenuDataStatusRequest extends TeaModel {
    @NameInMap("BatchId")
    public String batchId;

    @NameInMap("Country")
    public String country;

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

    public GetMenuDataStatusRequest setCountry(String country) {
        this.country = country;
        return this;
    }
    public String getCountry() {
        return this.country;
    }

    public GetMenuDataStatusRequest setProductContainerId(String productContainerId) {
        this.productContainerId = productContainerId;
        return this;
    }
    public String getProductContainerId() {
        return this.productContainerId;
    }

}
