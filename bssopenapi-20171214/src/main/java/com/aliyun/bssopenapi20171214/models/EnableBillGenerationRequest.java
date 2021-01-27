// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class EnableBillGenerationRequest extends TeaModel {
    @NameInMap("ProductCode")
    public String productCode;

    @NameInMap("OwnerId")
    public Long ownerId;

    public static EnableBillGenerationRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableBillGenerationRequest self = new EnableBillGenerationRequest();
        return TeaModel.build(map, self);
    }

    public EnableBillGenerationRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public EnableBillGenerationRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

}
