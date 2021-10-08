// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class DescribeDiagnoseRequest extends TeaModel {
    @NameInMap("Product")
    public String product;

    public static DescribeDiagnoseRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDiagnoseRequest self = new DescribeDiagnoseRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDiagnoseRequest setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

}
