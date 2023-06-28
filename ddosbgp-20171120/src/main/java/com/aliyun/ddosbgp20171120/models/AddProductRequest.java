// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20171120.models;

import com.aliyun.tea.*;

public class AddProductRequest extends TeaModel {
    @NameInMap("PackId")
    public String packId;

    @NameInMap("Product")
    public String product;

    @NameInMap("SourceIp")
    public String sourceIp;

    public static AddProductRequest build(java.util.Map<String, ?> map) throws Exception {
        AddProductRequest self = new AddProductRequest();
        return TeaModel.build(map, self);
    }

    public AddProductRequest setPackId(String packId) {
        this.packId = packId;
        return this;
    }
    public String getPackId() {
        return this.packId;
    }

    public AddProductRequest setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

    public AddProductRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
